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
public class honnhan {
    private int maHN;
    private String loaiHN;

    public honnhan() {
    }

    public honnhan(int maHN, String loaiHN) {
        this.maHN = maHN;
        this.loaiHN = loaiHN;
    }

    public int getMaHN() {
        return maHN;
    }

    public void setMaHN(int maHN) {
        this.maHN = maHN;
    }

    public String getLoaiHN() {
        return loaiHN;
    }

    public void setLoaiHN(String loaiHN) {
        this.loaiHN = loaiHN;
    }
    
}
