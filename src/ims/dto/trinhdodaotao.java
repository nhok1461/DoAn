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
public class trinhdodaotao {
    private int maTrinhdo;
    private String ten;

    public trinhdodaotao() {
    }

    public trinhdodaotao(int maTrinhdo, String ten) {
        this.maTrinhdo = maTrinhdo;
        this.ten = ten;
    }

    public int getMaTrinhdo() {
        return maTrinhdo;
    }

    public void setMaTrinhdo(int maTrinhdo) {
        this.maTrinhdo = maTrinhdo;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    
}
