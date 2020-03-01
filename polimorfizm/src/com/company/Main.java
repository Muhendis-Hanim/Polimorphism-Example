package com.company;

public class Main {

    public static void main(String[] args) {


        GeometrikSekil gs1=new GeometrikSekil();
        kare k1=new kare(9);
        dikdortgen d1=new dikdortgen(6,11);
        sekilalani(gs1);
        sekilalani(k1);
        sekilalani(d1);

    }
    public static void sekilalani(GeometrikSekil sekil){
        System.out.println("alan bilgisi:"+sekil.alanHesapla());
    }
}
