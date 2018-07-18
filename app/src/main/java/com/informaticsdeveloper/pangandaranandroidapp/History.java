package com.informaticsdeveloper.pangandaranandroidapp;

public class History {

    public History(String lokasi, String waktu,String tanggal) {
        Lokasi = lokasi;
        Waktu = waktu;
        Tanggal = tanggal;
    }

    private String Lokasi;
    private String Tanggal;

    public String getTanggal() {
        return Tanggal;
    }

    public void setTanggal(String tanggal) {
        Tanggal = tanggal;
    }

    public String getLokasi() {
        return Lokasi;
    }

    public void setLokasi(String lokasi) {
        Lokasi = lokasi;
    }

    public String getWaktu() {
        return Waktu;
    }

    public void setWaktu(String waktu) {
        Waktu = waktu;
    }

    private String Waktu;
}
