package com.linhphuong.androidbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.Map;

import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {
    int chan, le, du;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        inSoChan();
//        inSoLe();
//        inSoChiaBaDuMot();
//        inChinhPhuong();
//        inNguyenTo();
//      2/Lam tron len
//        float number1 = 2.1f;
//        number1 = (float) Math.ceil(number1);
//        Log.d("BBB",number1+"");
//       3/ Lam tron xuong
//        float number1 = 2.9f;
//        number1 = (float) Math.floor(number1);
//        Log.d("BBB",number1+"");

//       4/ Random:
//        double number1 =  Math.floor(Math.random()*5);
//        Log.d("BBB",number1+"");
//        5/Tim so max, min
//        Integer[] numbers = new Integer[]{1,10,2,5,20,18,19,21,6};
//
//        int i =0;
//        int max = 0;
//        int min = numbers[0];
//        cach 1
//        for (;i < numbers.length-1;i++){
//                max = Math.max(numbers[i],numbers[i+1]);
//        }
//        Log.d("BBB",max +"");

//        cach 2
//        for(int value : numbers){
//            max= Math.max(max,value);
//            min=Math.min(min,value);
//
//        }
//        Log.d("BBB",max +"");
//        Log.d("BBB",min +"");

//        7/Map
//              + Thay doi phan tu trong mang
//              + Tao ra 1 mang moi voi cac chuc nang duoc thay doi

//        int[] arrayNuber = {1,10,11,20,18,19,21,99};
//
//        int[] newArray = myMap(new Map() {
//            @Override
//            public int onChangeValue(int value) {
//                return (int) Math.sqrt(value);
//            }
//        }, arrayNuber);
//
//        for (int i = 0 ; i < newArray.length ; i++){
//            Log.d("BBB",newArray[i] + "");
//        }





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
