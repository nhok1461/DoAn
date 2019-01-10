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
public class quoctich {
    private int maQT;
    private String tenQT;

    public quoctich() {
    }

    public quoctich(int maQT, String tenQT) {
        this.maQT = maQT;
        this.tenQT = tenQT;
    }

    public int getMaQT() {
        return maQT;
    }

    public void setMaQT(int maQT) {
        this.maQT = maQT;
    }

    public String getTenQT() {
        return tenQT;
    }

    public void setTenQT(String tenQT) {
        this.tenQT = tenQT;
    }
    
}
