package com.serfcompany.ecommerce.acart.HTTPHolders;

import android.util.Log;

import com.serfcompany.ecommerce.acart.Constants;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by serfcompany on 30.03.16.
 */
public class PostCommentHTTP {
    String urlString = Constants.APP_URI+"?amazingcart=json-api&type=user-post-comment";

    public String postComment(String username, String password, String comment,
                              String commentParent, String postID, String starRating) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");

        String params = "&username="+username+
                "&password="+password+
                "&comment="+comment+
                "&comment_parent="+commentParent+
                "&postID="+postID+
                "&starRating="+starRating;

        Log.i("LOG", "POSTING COMMENT with rating "+starRating);

        connection.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
        wr.writeBytes(params);
        wr.flush();
        wr.close();

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        String line = "";
        StringBuilder result = new StringBuilder();
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        rd.close();
        Log.i("LOG", result.toString());

        return result.toString();
    }
}
