
package com.serfcompany.ecommerce.acart.model.settings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Settings {

    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("currency_symbol")
    @Expose
    private String currencySymbol;
    @SerializedName("appearance_option")
    @Expose
    private AppearanceOption appearanceOption;
    @SerializedName("page")
    @Expose
    private Page page;
    @SerializedName("status_list")
    @Expose
    private List<StatusList> statusList = new ArrayList<StatusList>();
    @SerializedName("instagram_api")
    @Expose
    private InstagramApi instagramApi;

    /**
     * 
     * @return
     *     The currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 
     * @param currency
     *     The currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * 
     * @return
     *     The currencySymbol
     */
    public String getCurrencySymbol() {
        return currencySymbol;
    }

    /**
     * 
     * @param currencySymbol
     *     The currency_symbol
     */
    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    /**
     * 
     * @return
     *     The appearanceOption
     */
    public AppearanceOption getAppearanceOption() {
        return appearanceOption;
    }

    /**
     * 
     * @param appearanceOption
     *     The appearance_option
     */
    public void setAppearanceOption(AppearanceOption appearanceOption) {
        this.appearanceOption = appearanceOption;
    }

    /**
     * 
     * @return
     *     The page
     */
    public Page getPage() {
        return page;
    }

    /**
     * 
     * @param page
     *     The page
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 
     * @return
     *     The statusList
     */
    public List<StatusList> getStatusList() {
        return statusList;
    }

    /**
     * 
     * @param statusList
     *     The status_list
     */
    public void setStatusList(List<StatusList> statusList) {
        this.statusList = statusList;
    }

    /**
     * 
     * @return
     *     The instagramApi
     */
    public InstagramApi getInstagramApi() {
        return instagramApi;
    }

    /**
     * 
     * @param instagramApi
     *     The instagram_api
     */
    public void setInstagramApi(InstagramApi instagramApi) {
        this.instagramApi = instagramApi;
    }

}
