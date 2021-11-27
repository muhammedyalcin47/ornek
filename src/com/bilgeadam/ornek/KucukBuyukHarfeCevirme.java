package com.bilgeadam.ornek;

public class KucukBuyukHarfeCevirme {
    public static void main(String[] args) {

        String isim1 = "Mustafa";

        // Büyük harfe çevir.
        System.out.println(isim1.toUpperCase());

        String isim2 = "BORA";

        System.out.println(isim2.toLowerCase());

        String isim3 = "izmirli İĞDELER";

        System.out.println(isim3.toUpperCase());

        System.out.println(isim3.replace('i', 'İ').toUpperCase());


        String isim4 = "IĞDIRLI ıspanaklar";

        System.out.println(isim4.toLowerCase());

        System.out.println(isim4.replace('I', 'ı').toLowerCase());


        Locale localeTR = new Locale("tr", "TR");

        String kelime = "izinli İSTANBUL";

        System.out.println(kelime.toUpperCase(localeTR));

        System.out.println(Ortak.buyukHarfeCevir("iğneli ŞEMSİYE"));
    }
}
