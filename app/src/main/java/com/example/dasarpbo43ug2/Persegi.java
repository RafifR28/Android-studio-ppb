package com.example.dasarpbo43ug2;

import android.util.Log;

import java.security.PrivateKey;

public class Persegi extends BidangDatar {
    int panjang, lebar;

    /*
     * Public: semua bisa mengakses
     * Default: semua dipackage yang sama bisa mengakses
     * Protected: hanya bisa diakses dalam class & subclass
     * Private: hanya bisa diakses dari dalam class itu sendiri
     * */

    public Persegi(int panjang, int lebar) {
        this.namaBidang = "Persegi";
        this.panjang = panjang;
        this.lebar = lebar;
    }

    //overloading: membuat fungsi yang sama dengan parameter yang berbeda
    public Persegi() {
        this.namaBidang = "Persegi";
        this.panjang = 2;
        this.lebar = 1;
    }

    public Persegi(String panjang, String lebar) {
        this.namaBidang = "Persegi";
        this.panjang = Integer.parseInt(panjang);
        this.lebar = Integer.parseInt(lebar);
    }

    public double getLuas() {
        luas = panjang * lebar;
        return luas;
    }

    public double getKeliling() {
        keliling = (2 * panjang) + (2 * lebar);
        return keliling;
    }

    public String getNamaBidang() {
        return this.namaBidang;
    }

    public void hitungBidang() {
        Log.d(Tag, "Nama Bidang: " + namaBidang);
        Log.d(Tag, "Luasnya: " + getLuas());
        Log.d(Tag, "Kelilingnya: " + getKeliling());
        Log.d(Tag, "==================================");
    }
}
