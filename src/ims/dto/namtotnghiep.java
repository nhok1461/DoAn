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
public class namtotnghiep {
    private int maNam;
    private String nam;

    public namtotnghiep() {
    }

    public namtotnghiep(int maNam, String nam) {
        this.maNam = maNam;
        this.nam = nam;
    }

    public int getMaNam() {
        return maNam;
    }

    public void setMaNam(int maNam) {
        this.maNam = maNam;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }
    
    
    
}
