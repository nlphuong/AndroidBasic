package com.linhphuong.androidbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import static java.lang.Math.sqrt;

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
        inNguyenTo();
    }

    private void inNguyenTo() {
            for(int i =2; i<= 100;i++){
                int count = 0;
                for(int j =2; j <=sqrt(i);j++){
                    if(i%j == 0){
                      count ++;
                    }
                }
                if(count == 0){
                    Log.d("FFF",i+" la so nguyen to");
                }
            }
    }

    private void inChinhPhuong() {
        for(int i = 0; i<=100; i++){
           int a = (int) sqrt(i);
           if(a*a == i){
               Log.d("DDD",i+" la so chinh phuong");
           }

        }
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
