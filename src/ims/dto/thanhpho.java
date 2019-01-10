/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dto;

/**
 *
 * @author nhok1
 */
public class thanhpho {
    private int maTP;
    private String tenTP;

    public thanhpho() {
    }

    public thanhpho(int maTP, String tenTP) {
        this.maTP = maTP;
        this.tenTP = tenTP;
    }

    public int getMaTP() {
        return maTP;
    }

    public void setMaTP(int maTP) {
        this.maTP = maTP;
    }

    public String getTenTP() {
        return tenTP;
    }

    public void setTenTP(String tenTP) {
        this.tenTP = tenTP;
    }
    
}
