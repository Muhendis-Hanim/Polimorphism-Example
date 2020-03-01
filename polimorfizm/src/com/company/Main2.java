package com.company;

import static com.company.Main.sekilalani;

public class Main2 {
    public static void main(String[] args) {

        GeometrikSekil gs1 =new GeometrikSekil();
        kare k1=new kare(7);
        dikdortgen d1=new dikdortgen(8,14);

        sekilalaniHesapla(gs1);
        sekilalaniHesapla(k1);
        sekilalaniHesapla(d1);


    }

    private static void sekilalaniHesapla(Object gelenSekilNesnesi){
        if (gelenSekilNesnesi instanceof GeometrikSekil){
            GeometrikSekil g1= (GeometrikSekil) gelenSekilNesnesi;
            System.out.println("sekil alanı:"+g1.alanHesapla());
        }else if (gelenSekilNesnesi instanceof kare){
            kare k= (kare) gelenSekilNesnesi;
            System.out.println("kare alanı:"+k.alanHesapla());
        }else if (gelenSekilNesnesi instanceof dikdortgen){
            dikdortgen d= (dikdortgen) gelenSekilNesnesi;
            System.out.println("dikdortgen alanı:"+d.alanHesapla());
        }

    }

}
