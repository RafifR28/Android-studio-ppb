package com.example.dasarpbo43ug2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<BidangDatar> listBidang = new ArrayList<>();
        listBidang.add(new Persegi(4, 8));
        listBidang.add(new Lingkaran(5));
        listBidang.add(new Persegi());
        listBidang.add(new Persegi(6, 3));
        listBidang.add(new Lingkaran(50));

        for (BidangDatar bidang: listBidang){
            bidang.hitungBidang();
        }



        /*Persegi psg = new Persegi(5,10);
        psg.hitungBidang();
        //Log.d(Persegi.Tag, "Luas persegi:"+ (psg.getLuas()*10));
        Persegi psg2 = new Persegi();
        Persegi psg3 = new Persegi("13", "12");
        psg2.hitungBidang();
        psg3.hitungBidang();

        Lingkaran ling = new Lingkaran(2);
        ling.hitungBidang();
    }*/
    }
}