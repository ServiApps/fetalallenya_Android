
package com.serfcompany.ecommerce.acart.model.settings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AppearanceOption {

    @SerializedName("category_browse_option")
    @Expose
    private String categoryBrowseOption;
    @SerializedName("category_browse_show_thumb")
    @Expose
    private String categoryBrowseShowThumb;

    /**
     * 
     * @return
     *     The categoryBrowseOption
     */
    public String getCategoryBrowseOption() {
        return categoryBrowseOption;
    }

    /**
     * 
     * @param categoryBrowseOption
     *     The category_browse_option
     */
    public void setCategoryBrowseOption(String categoryBrowseOption) {
        this.categoryBrowseOption = categoryBrowseOption;
    }

    /**
     * 
     * @return
     *     The categoryBrowseShowThumb
     */
    public String getCategoryBrowseShowThumb() {
        return categoryBrowseShowThumb;
    }

    /**
     * 
     * @param categoryBrowseShowThumb
     *     The category_browse_show_thumb
     */
    public void setCategoryBrowseShowThumb(String categoryBrowseShowThumb) {
        this.categoryBrowseShowThumb = categoryBrowseShowThumb;
    }

}
