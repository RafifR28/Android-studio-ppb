package com.example.dasarpbo43ug2;

import android.util.Log;

public abstract class BidangDatar {
    public static final String Tag = "bidang";

    protected String namaBidang;
    protected double luas, keliling;

    abstract public double getLuas();

    abstract public double getKeliling();

    public void hitungBidang(){
        Log.d(Tag, "Nama Bidang: "+namaBidang);
        Log.d(Tag,"Luasnya: "+getLuas());
        Log.d(Tag,"Kelilingnya: "+getKeliling());
        Log.d(Tag,"==================================");
    }
}
