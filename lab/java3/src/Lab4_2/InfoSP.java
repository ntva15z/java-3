/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4_2;

/**
 *
 * @author ntva1
 */
public class InfoSP {
    public String Masp,Tensp,Nhacungcap,Donvitinh;
    public double Dongia;

    public InfoSP() {
    }

    public InfoSP(String Masp, String Tensp, String Donvitinh , double Dongia,String Nhacungcap) {
        this.Masp = Masp;
        this.Tensp = Tensp;
        this.Nhacungcap = Nhacungcap;
        this.Donvitinh = Donvitinh;
        this.Dongia = Dongia;
    }

    public String getMasp() {
        return Masp;
    }

    public void setMasp(String Masp) {
        this.Masp = Masp;
    }

    public String getTensp() {
        return Tensp;
    }

    public void setTensp(String Tensp) {
        this.Tensp = Tensp;
    }

    public String getNhacungcap() {
        return Nhacungcap;
    }

    public void setNhacungcap(String Nhacungcap) {
        this.Nhacungcap = Nhacungcap;
    }

    public String getDonvitinh() {
        return Donvitinh;
    }

    public void setDonvitinh(String Donvitinh) {
        this.Donvitinh = Donvitinh;
    }

    public double getDongia() {
        return Dongia;
    }

    public void setDongia(double Dongia) {
        this.Dongia = Dongia;
    }
    
    
}
