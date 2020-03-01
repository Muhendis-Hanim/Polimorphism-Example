package com.company;

public class Main3 {


    public static void main(String [] args){
        GeometrikSekil gs1 =new GeometrikSekil();
        kare k1=new kare(7);
        dikdortgen d1=new dikdortgen(8,14);


        GeometrikSekil gs2 =new GeometrikSekil();
        kare k2=new kare(9);
        dikdortgen d2=new dikdortgen(18,22);
        daire daire1=new daire(5);
        daire daire2=new daire(3);


        GeometrikSekil[] sekillerDizisi=new GeometrikSekil[8];
        sekillerDizisi[0]=gs1;
        sekillerDizisi[1]=k1;
        sekillerDizisi[2]=d1;
        sekillerDizisi[3]=gs2;
        sekillerDizisi[4]=k2;
        sekillerDizisi[5]=d2;
        sekillerDizisi[6]=daire1;
        sekillerDizisi[7]=daire2;

        sekilAlaniHesaplaMethodu(sekillerDizisi);
    }
    public static void sekilAlaniHesaplaMethodu(GeometrikSekil[] sekiller){
        for(GeometrikSekil geciciNesne:sekiller){
            System.out.println("şeklin alanı:"+geciciNesne.alanHesapla());
        }
    }
}
