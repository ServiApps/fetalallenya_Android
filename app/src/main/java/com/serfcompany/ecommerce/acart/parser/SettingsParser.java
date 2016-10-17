package com.serfcompany.ecommerce.acart.parser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.serfcompany.ecommerce.acart.model.settings.Settings;

/**
 * Created by serfcompany on 01.04.16.
 */
public class SettingsParser {

    public Settings parse(String JSON){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setDateFormat("yyyy-dd-MM HH:mm:ss");
        Gson gson = gsonBuilder.create();
        return gson.fromJson(JSON, Settings.class);
    }
}
