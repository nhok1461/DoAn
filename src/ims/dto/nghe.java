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
public class nghe {
    private int maNghe;
    private String tenNghe;

    public nghe() {
    }

    public nghe(int maNghe, String tenNghe) {
        this.maNghe = maNghe;
        this.tenNghe = tenNghe;
    }

    public int getMaNghe() {
        return maNghe;
    }

    public void setMaNghe(int maNghe) {
        this.maNghe = maNghe;
    }

    public String getTenNghe() {
        return tenNghe;
    }

    public void setTenNghe(String tenNghe) {
        this.tenNghe = tenNghe;
    }
    
}
