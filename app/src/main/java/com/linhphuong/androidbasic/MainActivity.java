package com.linhphuong.androidbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    int chan, le, du;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inSoChan();
        inSoLe();
        inSoChiaBaDuMot();
        inChinhPhuong();
//        inNguyenTo();
    }

    private void inChinhPhuong() {

    }

    private void inSoChan(){
       for(int i =0;i<=100;i+=2)Log.d("CCC",i+"");
    }
    private void inSoLe(){
        for(int i =1;i<=100;i+=2)Log.d("CCC",i+"");
    }
    private void inSoChiaBaDuMot(){
        for(int i =1;i<=100;i+=3)Log.d("CCC",i+"");
    }

}
