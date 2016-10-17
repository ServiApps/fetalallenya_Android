
package com.serfcompany.ecommerce.acart.model.settings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InstagramApi {

    @SerializedName("client_id")
    @Expose
    private Boolean clientId;

    /**
     * 
     * @return
     *     The clientId
     */
    public Boolean getClientId() {
        return clientId;
    }

    /**
     * 
     * @param clientId
     *     The client_id
     */
    public void setClientId(Boolean clientId) {
        this.clientId = clientId;
    }

}
