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
public class noidaotao {
    private int maNoidaotao;
    private String tenNoidaotao;

    public noidaotao() {
    }

    public noidaotao(int maNoidaotao, String tenNoidaotao) {
        this.maNoidaotao = maNoidaotao;
        this.tenNoidaotao = tenNoidaotao;
    }

    public int getMaNoidaotao() {
        return maNoidaotao;
    }

    public void setMaNoidaotao(int maNoidaotao) {
        this.maNoidaotao = maNoidaotao;
    }

    public String getTenNoidaotao() {
        return tenNoidaotao;
    }

    public void setTenNoidaotao(String tenNoidaotao) {
        this.tenNoidaotao = tenNoidaotao;
    }
    
}
