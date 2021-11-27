package com.bilgeadam.ornek;

public class RelationalOrnek {
    public static void main(String[] args) {

        // == != > >= < <=

        int sayi1 = 9;
        int sayi2 = 9;

        String isim1 = "Mustafa";
        String isim2 = "Mustafa";

        String isim3 = new String("Bora");
        String isim4 = new String("Bora");

        if(sayi1 == sayi2)
            System.out.println("Eşittir");
        else
            System.out.println("Eşit değildir.");

        if(isim1 == isim2)
            System.out.println("İsimler eşit");
        else
            System.out.println("İsimler eşit değil");

        System.out.println("İsim3:" + isim3);

        if(isim3 == isim4)
            System.out.println("Obje İsimler eşit");
        else
            System.out.println("Obje İsimler eşit değil");


        // String'de == değerine bakmaz, memory'deki adresine bakar.

        // ÖNEMLİ! --> String ifadeler == ile değil, equals metodu ile kontrol edilir.

        // String'de equals, oluşturulma biçiminden bağımsız olarak hep doğru çalışır.

        if(isim3.equals(isim4))
            System.out.println("equals İsimler eşit");
        else
            System.out.println("equals İsimler eşit değil");

    }
}
