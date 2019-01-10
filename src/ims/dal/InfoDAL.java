/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dal;

import ims.dto.Infomation;
import ims.dto.dantoc;
import ims.dto.giadinh;
import ims.dto.gioitinh;
import ims.dto.honnhan;
import ims.dto.khoa;
import ims.dto.namtotnghiep;
import ims.dto.nganh;
import ims.dto.nghe;
import ims.dto.noidaotao;
import ims.dto.quoctich;
import ims.dto.thanhpho;
import ims.dto.tongiao;
import ims.dto.trinhdodaotao;
import ims.dto.xeploai;
import ims.gui.Employee;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nhok1
 */
public class InfoDAL extends Base{
    public static Connection conn = null;
    public static Statement stmt = null;
    public ArrayList<Infomation> readInfoDAL(){
        ArrayList<Infomation> emList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e){
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT maNV, hovaten, ngaysinh, noisinh FROM Thongtin";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()){
                Infomation em = new Infomation();
                em.setMaNV(rs.getInt("MaNV"));
                em.setHovaten(rs.getString("hovaten"));
                em.setNgaysinh(rs.getString("NgaySinh"));
                em.setNoisinh(rs.getString("NoiSinh"));
                emList.add(em);
            }
        } catch (SQLException e) {
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null,e);
        } finally {
            return emList;
        } 
    }
    
    public ArrayList<gioitinh> readGTDAL(){
        ArrayList<gioitinh> gtList = new ArrayList<>();
        conn = getConnection();
        try{
            stmt = conn.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
        String sql = "Select maGT, loaiGT From Gioitinh";
        ResultSet rs = null;
        try{
            rs = stmt.executeQuery(sql);
        }catch(SQLException e){
            e.printStackTrace();
        }
        try {
            while (rs.next()){
                gioitinh gT = new gioitinh();
                gT.setMaGT(rs.getInt("maGT"));
                gT.setLoaiGT(rs.getString("loaiGT"));
                gtList.add(gT);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            return gtList;
        }
    }
    
    public ArrayList<dantoc> readDTDAL(){
        ArrayList<dantoc> dtList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e){
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT maDT, tenDT FROM Dantoc";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()){
                dantoc dt = new dantoc();
                dt.setMaDT(rs.getInt("maDT"));
                dt.setTenDT(rs.getString("tenDT"));
                dtList.add(dt);
            }
        } catch (SQLException e) {
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null,e);
        } finally {
            return dtList;
        }  
    }
    
    public ArrayList<giadinh> readGDDAL(){
        ArrayList<giadinh> gdList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e){
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT maGD, loaiGD FROM Giadinh";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()){
                giadinh gd = new giadinh();
                gd.setMaGD(rs.getInt("maGD"));
                gd.setLoaiGD(rs.getString("loaiGD"));
                gdList.add(gd);
            }
        } catch (SQLException e) {
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null,e);
        } finally {
            return gdList;
        } 
        
    }
    
    public ArrayList<honnhan> readHNDAL(){
        ArrayList<honnhan> hnList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e){
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT maHN, loaiHN FROM Honnhan";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()){
                honnhan hn = new honnhan();
                hn.setMaHN(rs.getInt("maHN"));
                hn.setLoaiHN(rs.getString("loaiHN"));
                hnList.add(hn);
            }
        } catch (SQLException e) {
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null,e);
        } finally {
            return hnList;
        } 
    }
    
    public ArrayList<khoa> readKhoaDAL(){
        ArrayList<khoa> khoaList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e){
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT maKhoa, tenKhoa FROM Khoa";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()){
                khoa k = new khoa();
                k.setMaKhoa(rs.getInt("maKhoa"));
                k.setTenKhoa(rs.getString("tenKhoa"));
                khoaList.add(k);
            }
        } catch (SQLException e) {
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null,e);
        } finally {
            return khoaList;
        } 
    }
    
    public ArrayList<namtotnghiep> readNamDAL(){
        ArrayList<namtotnghiep> nList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e){
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT maNam, nam FROM Namtotnghiep";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()){
                namtotnghiep n = new namtotnghiep();
                n.setMaNam(rs.getInt("maNam"));
                n.setNam(rs.getString("nam"));
                nList.add(n);
            }
        } catch (SQLException e) {
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null,e);
        } finally {
            return nList;
        } 
    }
    
    public ArrayList<nganh> readNganhDAL(){
        ArrayList<nganh> nganhList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e){
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT maNganh, tenNganh FROM Nganh";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()){
                nganh ng = new nganh();
                ng.setMaNganh(rs.getInt("maNganh"));
                ng.setTenNganh(rs.getString("tenNganh"));
                nganhList.add(ng);
            }
        } catch (SQLException e) {
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null,e);
        } finally {
            return nganhList;
        } 
    }
    
    public ArrayList<nghe> readNgheDAL(){
        ArrayList<nghe> ngheList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e){
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT maNghe, tenNghe FROM Nghe";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()){
                nghe ngh = new nghe();
                ngh.setMaNghe(rs.getInt("maNghe"));
                ngh.setTenNghe(rs.getString("tenNghe"));
                ngheList.add(ngh);
            }
        } catch (SQLException e) {
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null,e);
        } finally {
            return ngheList;
        } 
    }
    
    public ArrayList<noidaotao> readNDTDAL(){
        ArrayList<noidaotao> ndtList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e){
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT maNoidaotao, tenNoidaotao FROM Noidaotao";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()){
                noidaotao ndt = new noidaotao();
                ndt.setMaNoidaotao(rs.getInt("maNoidaotao"));
                ndt.setTenNoidaotao(rs.getString("tenNoidaotao"));
                ndtList.add(ndt);
            }
        } catch (SQLException e) {
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null,e);
        } finally {
            return ndtList;
        } 
    }
    
    public ArrayList<quoctich> readQTDAL(){
        ArrayList<quoctich> qtList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e){
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT maQT, tenQT FROM Quoctich";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()){
                quoctich qt = new quoctich();
                qt.setMaQT(rs.getInt("maQT"));
                qt.setTenQT(rs.getString("tenQT"));
                qtList.add(qt);
            }
        } catch (SQLException e) {
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null,e);
        } finally {
            return qtList;
        } 
    }
    
    public ArrayList<thanhpho> readTPDAL(){
        ArrayList<thanhpho> tpList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e){
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT maTP, tenTP FROM Thanhpho";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()){
                thanhpho tp = new thanhpho();
                tp.setMaTP(rs.getInt("maTP"));
                tp.setTenTP(rs.getString("tenTP"));
                tpList.add(tp);
            }
        } catch (SQLException e) {
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null,e);
        } finally {
            return tpList;
        } 
    }
    
    public ArrayList<tongiao> readTGDAL(){
        ArrayList<tongiao> tgList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e){
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT maTG, tenTG FROM Tongiao";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()){
                tongiao tg = new tongiao();
                tg.setMaTG(rs.getInt("maTG"));
                tg.setTenTG(rs.getString("tenTG"));
                tgList.add(tg);
            }
        } catch (SQLException e) {
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null,e);
        } finally {
            return tgList;
        } 
    }
    
    public ArrayList<trinhdodaotao> readTDDAL(){
        ArrayList<trinhdodaotao> tdList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e){
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT maTrinhdo, ten FROM Trinhdodaotao";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()){
                trinhdodaotao td = new trinhdodaotao();
                td.setMaTrinhdo(rs.getInt("maTrinhdo"));
                td.setTen(rs.getString("ten"));
                tdList.add(td);
            }
        } catch (SQLException e) {
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null,e);
        } finally {
            return tdList;
        } 
    }
    
    public ArrayList<xeploai> readXLDAL(){
        ArrayList<xeploai> xlList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e){
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT maLoai, loai FROM xeploai";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()){
                xeploai xl = new xeploai();
                xl.setMaLoai(rs.getInt("maLoai"));
                xl.setLoai(rs.getString("loai"));
                xlList.add(xl);
            }
        } catch (SQLException e) {
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null,e);
        } finally {
            return xlList;
        }
    }
    
    public  void addNewDAL(Infomation inf){
        
        conn = null;
        Statement stmt = null;
        try{
            conn = getConnection();
            stmt = conn.createStatement();
            int MaNV = inf.getMaNV();
            int MaCC = inf.getMaCC();
            String Hovadem = inf.getHovadem();
            String Hovaten = inf.getHovaten();
            String Ten = inf.getTen();
            String Ngaysinh = inf.getNgaysinh();
            String Gioitinh = inf.getGioitinh();
            String Noisinh = inf.getNoisinh();
            String Nguyenquan = inf.getNguyenquan();
            String Thanhpho = inf.getThanhpho();
            String Cmnd = inf.getCmnd();
            String Ngaycap = inf.getNgaycap();
            String Noicap = inf.getNoicapcmnd();
            String Sohc = inf.getSohc();
            String Ngaycaphc = inf.getNgaycaphc();
            String Ngayhethan = inf.getNgayhethanhc();
            String Noicaphc = inf.getNoicaphc();
            String Honnhan = inf.getHonnhan();
            String Giadinh = inf.getGiadinh();
            String Dantoc = inf.getDantoc();
            String Tongiao = inf.getTongiao();
            String Quoctich = inf.getQuoctich();
            String Vanhoa = inf.getVanhoa();
            String Daotao = inf.getDaotao();
            String Noidaotao = inf.getNoidaotao();
            String Khoa = inf.getKhoa();
            String Nganh = inf.getNganh();
            String Nghe = inf.getNghe();
            int Namtotnghiep = inf.getNamtotnghiep();
            String Xeploai = inf.getXeploai();
            String sql = "INSERT INTO `thongtin`( `maNV`, `maCC`, `hovadem`, `hovaten`, `ten`, `ngaysinh`, `gioitinh`, `noisinh`, `nguyenquan`, `cmnd`, `ngaycap`, `noicapcmnd`, `sohc`, `ngaycaphc`, `ngayhethanhc`, `noicaphc`, `honnhan`, `giadinh`, `dantoc`, `tongiao`, `quoctich`, `vanhoa`, `daotao`, `noidaotao`, `khoa`, `nganh`, `namtotnghiep`, `xeploai`, `nghe`,`thanhpho`) VALUES ('"+MaNV+"','"+MaCC+"','"+Hovadem+"','"+Hovaten+"','"+Ten+"','"+Ngaysinh+"','"+Gioitinh+"','"+Noisinh+"','"+Nguyenquan+"','"+Cmnd+"','"+Ngaycap+"','"+Noicap+"','"+Sohc+"','"+Ngaycaphc+"','"+Ngayhethan+"','"+Noicaphc+"','"+Honnhan+"','"+Giadinh+"','"+Dantoc+"','"+Tongiao+"','"+Quoctich+"','"+Vanhoa+"','"+Daotao+"','"+Noidaotao+"','"+Khoa+"','"+Nganh+"','"+Namtotnghiep+"','"+Xeploai+"','"+Nghe+"','"+Thanhpho+"')";
            stmt.executeUpdate(sql);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void deleteDAL(String maNV){
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            String sql = "DELETE FROM thongtin WHERE maNV ="+maNV;
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateDAL(Infomation inf){
        conn = null;
        Statement stmt = null;
        try{
            conn = getConnection();
            stmt = conn.createStatement();
            int MaNV = inf.getMaNV();
//            int MaCC = inf.getMaCC();
            String Hovadem = inf.getHovadem();
            String Hovaten = inf.getHovaten();
            String Ten = inf.getTen();
            String Ngaysinh = inf.getNgaysinh();
//            String Gioitinh = inf.getGioitinh();
            String Noisinh = inf.getNoisinh();
//            String Nguyenquan = inf.getNguyenquan();
//            String Thanhpho = inf.getThanhpho();
            String Cmnd = inf.getCmnd();
            String Ngaycap = inf.getNgaycap();
            String Noicap = inf.getNoicapcmnd();
            String Sohc = inf.getSohc();
            String Ngaycaphc = inf.getNgaycaphc();
            String Ngayhethan = inf.getNgayhethanhc();
            String Noicaphc = inf.getNoicaphc();
            String Honnhan = inf.getHonnhan();
            String Giadinh = inf.getGiadinh();
            String Dantoc = inf.getDantoc();
            String Tongiao = inf.getTongiao();
            String Quoctich = inf.getQuoctich();
//            String Vanhoa = inf.getVanhoa();
            String Daotao = inf.getDaotao();
            String Noidaotao = inf.getNoidaotao();
            String Khoa = inf.getKhoa();
            String Nganh = inf.getNganh();
            String Nghe = inf.getNghe();
            int Namtotnghiep = inf.getNamtotnghiep();
            String Xeploai = inf.getXeploai();
            String sql = "UPDATE `thongtin` SET `hovadem`='"+Hovadem+"',`hovaten`='"+Hovaten+"',`ten`='"+Ten+"',`ngaysinh`='"+Ngaysinh+"',`noisinh`='"+Noisinh+"',`cmnd`='"+Cmnd+"',`ngaycap`='"+Ngaycap+"',`noicapcmnd`='"+Noicap+"',`sohc`='"+Sohc+"',`ngaycaphc`='"+Ngaycaphc+"',`ngayhethanhc`='"+Ngayhethan+"',`noicaphc`='"+Noicaphc+"',`honnhan`='"+Honnhan+"',`giadinh`='"+Giadinh+"',`tongiao`='"+Tongiao+"',`quoctich`='"+Quoctich+"',`daotao`='"+Daotao+"',`noidaotao`='"+Noidaotao+"',`khoa`='"+Khoa+"',`nganh`='"+Nganh+"',`namtotnghiep`='"+Namtotnghiep+"',`xeploai`='"+Xeploai+"',`nghe`='"+Nghe+"' WHERE maNV="+MaNV;
            stmt.executeUpdate(sql);
        }catch(Exception e){
            e.printStackTrace();
        }
    }    
    public ArrayList<Infomation> readInfo(String maNV){
        ArrayList<Infomation> emList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e){
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT * FROM Thongtin WHERE maNV = "+maNV;
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()){
                Infomation em = new Infomation();
                em.setMaNV(rs.getInt("maNV"));
                em.setHovadem(rs.getString("hovadem"));
                em.setHovaten(rs.getString("hovaten"));
                em.setTen(rs.getString("ten"));
                em.setNgaysinh(rs.getString("ngaysinh"));
                em.setNoisinh(rs.getString("noisinh"));
                em.setMaCC(rs.getInt("maCC"));
                em.setNguyenquan(rs.getString("nguyenquan"));
                em.setThanhpho(rs.getString("thanhpho"));
                em.setCmnd(rs.getString("cmnd"));
                em.setNoicapcmnd(rs.getString("noicapcmnd"));
                em.setSohc(rs.getString("sohc"));
                em.setNoicaphc(rs.getString("noicaphc"));
                em.setVanhoa(rs.getString("vanhoa"));
                emList.add(em);
            }
        } catch (SQLException e) {
            Logger.getLogger(InfoDAL.class.getName()).log(Level.SEVERE, null,e);
        } finally {
            return emList;
        }
    }
}
