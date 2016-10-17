
package com.serfcompany.ecommerce.acart.model.settings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StatusList {

    @SerializedName("status_slug")
    @Expose
    private String statusSlug;
    @SerializedName("status_label")
    @Expose
    private String statusLabel;

    /**
     * 
     * @return
     *     The statusSlug
     */
    public String getStatusSlug() {
        return statusSlug;
    }

    /**
     * 
     * @param statusSlug
     *     The status_slug
     */
    public void setStatusSlug(String statusSlug) {
        this.statusSlug = statusSlug;
    }

    /**
     * 
     * @return
     *     The statusLabel
     */
    public String getStatusLabel() {
        return statusLabel;
    }

    /**
     * 
     * @param statusLabel
     *     The status_label
     */
    public void setStatusLabel(String statusLabel) {
        this.statusLabel = statusLabel;
    }

}
