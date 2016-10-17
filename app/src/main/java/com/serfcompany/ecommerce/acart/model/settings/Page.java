
package com.serfcompany.ecommerce.acart.model.settings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Page {

    @SerializedName("thankyou")
    @Expose
    private String thankyou;
    @SerializedName("cart")
    @Expose
    private String cart;
    @SerializedName("lost_password")
    @Expose
    private String lostPassword;

    /**
     * 
     * @return
     *     The thankyou
     */
    public String getThankyou() {
        return thankyou;
    }

    /**
     * 
     * @param thankyou
     *     The thankyou
     */
    public void setThankyou(String thankyou) {
        this.thankyou = thankyou;
    }

    /**
     * 
     * @return
     *     The cart
     */
    public String getCart() {
        return cart;
    }

    /**
     * 
     * @param cart
     *     The cart
     */
    public void setCart(String cart) {
        this.cart = cart;
    }

    /**
     * 
     * @return
     *     The lostPassword
     */
    public String getLostPassword() {
        return lostPassword;
    }

    /**
     * 
     * @param lostPassword
     *     The lost_password
     */
    public void setLostPassword(String lostPassword) {
        this.lostPassword = lostPassword;
    }

}
