package com.example.dasarpbo43ug2;

public class Lingkaran extends BidangDatar {
    int jari;

    public Lingkaran(int jari){
        this.namaBidang = "Lingkaran";
        this.jari = jari;
    }

    @Override
    public double getLuas(){
        luas = Math.PI * Math.pow(jari, 2);
        return luas;
    }

    @Override
    public double getKeliling(){
        keliling = 2 * Math.PI * jari;
        return keliling;
    }
}
