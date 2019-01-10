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
public class giadinh {
    private int maGD;
    private String loaiGD;

    public giadinh() {
    }    

    public giadinh(int maGD, String loaiGD) {
        this.maGD = maGD;
        this.loaiGD = loaiGD;
    }

    public int getMaGD() {
        return maGD;
    }

    public void setMaGD(int maGD) {
        this.maGD = maGD;
    }

    public String getLoaiGD() {
        return loaiGD;
    }

    public void setLoaiGD(String loaiGD) {
        this.loaiGD = loaiGD;
    }
    
}
