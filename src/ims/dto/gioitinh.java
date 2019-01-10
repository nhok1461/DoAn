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
public class gioitinh {
    private int maGT;
    private String loaiGT;

    public gioitinh() {
    }

    public gioitinh(int maGT, String loaiGT) {
        this.maGT = maGT;
        this.loaiGT = loaiGT;
    }

    public int getMaGT() {
        return maGT;
    }

    public void setMaGT(int maGT) {
        this.maGT = maGT;
    }

    public String getLoaiGT() {
        return loaiGT;
    }

    public void setLoaiGT(String loaiGT) {
        this.loaiGT = loaiGT;
    }
    
}
