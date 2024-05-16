package com.example.myapplication.model;

public class Item {
    int idsp;
    String tensanpham;
    int soluong;
    String hinhanhsanpham;

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getHinhanh() {
        return hinhanhsanpham;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanhsanpham = hinhanh;
    }

    public int getIdsp() {
        return idsp;
    }

    public void setIdsp(int idsp) {
        this.idsp = idsp;
    }

    public String getTensp() {
        return tensanpham;
    }

    public void setTensp(String tensp) {
        this.tensanpham = tensp;
    }
}
