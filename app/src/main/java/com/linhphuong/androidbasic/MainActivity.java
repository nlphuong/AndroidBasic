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
//      // 1 : Lam tron : Math.round()
////        float number1 = 2.1f;
////        number1 = Math.round(number1);
////        Log.d("BBB",number1 + "");
//        // 2 : Lam tron len : 2.1 -> 3
////        double number2 = 2.1f;
////        number2 = Math.ceil(number2);
////        Log.d("BBB",number2 + "");
//        // 3 : Lam tron xuong : 2.9 -> 2
////        double number3 = 2.9f;
////        number3 = Math.floor(number3);
////        Log.d("BBB",number3 + "");
//        // 4 : Math random
////        for (int i = 0 ; i <= 100 ; i++){
////            double number4 = Math.floor(Math.random() * 6);
////            Log.d("BBB",number4 + "");
////        }
//        // 5 : tim ra so lon nhat , so nho nhat
//        int[] arrayNumber = {1,10,11,20,18,19,21,99};
////        int sonhonhat = arrayNumber[0];
////        int solonnhat = 0;
////        for (int value : arrayNumber){
////            solonnhat = Math.max(solonnhat,value);
////            sonhonhat = Math.min(sonhonhat,value);
////        }
////        Log.d("BBB",solonnhat + "");
////        Log.d("BBB",sonhonhat + "");
//        int temp = 0;
//        for (int i = 0 ; i < arrayNumber.length ; i++){
//            if (i < arrayNumber.length - 1){
//                if (arrayNumber[i] > arrayNumber[i + 1]){
//                    temp = arrayNumber[i];
//                    arrayNumber[i] = arrayNumber[i + 1];
//                    arrayNumber[i+1] = temp;
//                }
//            }
//            Log.d("BBB", arrayNumber[i] + "");

//      5/Tim so max, min
////        Integer[] numbers = new Integer[]{1,10,2,5,20,18,19,21,6};
////
////        int i =0;
////        int max = 0;
////        int min = numbers[0];
////        cach 1
////        for (;i < numbers.length-1;i++){
////                max = Math.max(numbers[i],numbers[i+1]);
////        }
////        Log.d("BBB",max +"");

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
//  BT1:  tinh tong cac gia trong mang
//        int[] number = {1,21,8,5,4,92,9,15,20,99};
//        int sum = 0;
//        for(int value : number){
//            sum += value;
//        }
//        Log.d("BBB",sum+"");
//        BT2 : tim kiem gia tri trong mang
//                +Neu co tra ve vi tri
//                +Neu khong co tra ve -1
        //BT3 : tim kiem gia tri o vi tri dau tien
//            {1,10,11,20,18,1,21,99};
//            + Neu co in ra vi tri dau tien
//            + Neu khong co in ra gia tri -1

//        int[] number = {1,21,4,8,5,4,92,9,15,20,99};
//        int k = 4;
//        int i =0;
//        while ((i< number.length) && (number[i]!=k)){
//            i++;
//        }
//        if(i> number.length-1)Log.d("BBB","-1");
//        else Log.d("BBB",i+"");

// BT4 : Xoa cac phan tu bi trung trong mang
//            [1,2,3,3,3,4,5] => [1,2,3,4,5]
        int[] number = {1,2,3,3,3,4,5};
        int i;
        int n = number.length;
        for( i=0;i <n-1;i++) {
            for (int j = i + 1; j < n; j++) {
                if (number[j] == number[i]) {
                    for (int vitrixoa = j; vitrixoa < n; vitrixoa++)
                        number[vitrixoa - 1] = number[vitrixoa];
                    n--;
                    j--;
                }
            }
        }
            for (i = 0; i< n; i++){
                Log.d("BBB", number[i]+"");
            }
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
