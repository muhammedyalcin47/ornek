package com.bilgeadam.ornek;

public class VeriTipleri {

    public static void main(String[] args) {

        int yas = 60;


        char cinsiyet ='E';

        String sehir = "Ankara";


        if (yas<35){

            System.out.println("Genç");
        }
        else
        {
            System.out.println("yaşlı");
        }
        // i++ ==> i = i+1
        for (int i=1; i<=10; i++)
        {
            System.out.println(i+"Merhaba");
        }

        System.out.println("şehir index:" + sehir.indexOf("A"));

        if(sehir.indexOf("A") >= 0)
        {

            System.out.println("içinde A harfi var!");
        }

        String deneme = "Bora Yüret";

        System.out.println(deneme.substring(5));



    }



}
