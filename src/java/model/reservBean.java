/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author sandun
 */
public class reservBean {
    private String name,checkin,checkout;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getCheckin(){
        return checkin;
    }
    public void setCheckin(String checkin){
        this.checkin = checkin;
    }
    public String getCheckout(){
        return checkout;
    }
    public void setCheckout(String checkout){
        this.checkout = checkout;
    }
    
}
