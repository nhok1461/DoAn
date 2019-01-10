/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.bll;

import ims.dal.InfoDAL;
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
import java.util.ArrayList;

/**
 *
 * @author nhok1
 */
public class InfoBLL {
    InfoDAL dal = new InfoDAL();
    public ArrayList<Infomation> readInfoBLL() {
         ArrayList<Infomation> listNhanVien = new ArrayList<>();
         listNhanVien = dal.readInfoDAL();
         return listNhanVien;
    }
    
    public ArrayList<gioitinh> readGTBLL() {
         ArrayList<gioitinh> listGioiTinh = new ArrayList<>();
         listGioiTinh = dal.readGTDAL();
         return listGioiTinh;         
    }
    
    public ArrayList<dantoc> readDTBLL() {
         ArrayList<dantoc> listDantoc = new ArrayList<>();
         listDantoc = dal.readDTDAL();
         return listDantoc;         
    }
    
    public ArrayList<giadinh> readGDBLL() {
         ArrayList<giadinh> listGiadinh = new ArrayList<>();
         listGiadinh = dal.readGDDAL();
         return listGiadinh;         
    }
    
    public ArrayList<honnhan> readHNBLL() {
         ArrayList<honnhan> listHonnhan = new ArrayList<>();
         listHonnhan = dal.readHNDAL();
         return listHonnhan;         
    }
    
    public ArrayList<khoa> readKhoaBLL() {
         ArrayList<khoa> listKhoa = new ArrayList<>();
         listKhoa = dal.readKhoaDAL();
         return listKhoa;         
    }
    
    public ArrayList<namtotnghiep> readNamBLL() {
         ArrayList<namtotnghiep> listn = new ArrayList<>();
         listn = dal.readNamDAL();
         return listn;         
    }
    
    public ArrayList<nganh> readNganhBLL() {
         ArrayList<nganh> listng = new ArrayList<>();
         listng = dal.readNganhDAL();
         return listng;         
    }
    
    public ArrayList<nghe> readNgheBLL() {
         ArrayList<nghe> listngh = new ArrayList<>();
         listngh = dal.readNgheDAL();
         return listngh;         
    }
    
    public ArrayList<noidaotao> readNDTBLL() {
         ArrayList<noidaotao> listndt = new ArrayList<>();
         listndt = dal.readNDTDAL();
         return listndt;         
    }
    
    public ArrayList<quoctich> readQTBLL() {
         ArrayList<quoctich> listqt = new ArrayList<>();
         listqt = dal.readQTDAL();
         return listqt;         
    }
    
    public ArrayList<thanhpho> readTPBLL() {
         ArrayList<thanhpho> listtp = new ArrayList<>();
         listtp = dal.readTPDAL();
         return listtp;         
    }
    
    public ArrayList<tongiao> readTGBLL() {
         ArrayList<tongiao> listtg = new ArrayList<>();
         listtg = dal.readTGDAL();
         return listtg;         
    }
    
    public ArrayList<trinhdodaotao> readTDBLL() {
         ArrayList<trinhdodaotao> listtd = new ArrayList<>();
         listtd = dal.readTDDAL();
         return listtd;         
    }
    
    public ArrayList<xeploai> readXLBLL() {
         ArrayList<xeploai> listxl = new ArrayList<>();
         listxl = dal.readXLDAL();
         return listxl;         
    }
    
    public void addNewBLL(Infomation inf){
        dal.addNewDAL(inf);
    }
    
    public void deleteBLL(String maNV){
        dal.deleteDAL(maNV);
    }
    
    public void editBLL(Infomation inf){
        dal.updateDAL(inf);
    }
    
    public ArrayList<Infomation> readBLL(String maNV){
        return dal.readInfo(maNV);
    }
}
