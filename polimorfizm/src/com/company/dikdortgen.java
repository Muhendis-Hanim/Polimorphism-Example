package com.company;

public class dikdortgen extends GeometrikSekil {
    private double en;
    private double boy;

    public dikdortgen(){
        en=0;
        boy=0;
    }

    public dikdortgen(double en,double boy){
        /* this.en=en;
        this.boy=boy; */   //yapılabılır ancak - li bı deger gırseler aynen basar
       // kontrolu yapılmaz
        setEn(en);
        setBoy(boy);
    }
    public double getEn() {
        return en;
    }

    public void setEn(double en) {
        if (en<0){
            this.en=0;
        }else {
            this.en = en;
        }

    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        if (boy<0){
            this.boy=0;
        }else {
            this.boy = boy;
        }

    }

    @Override
    public double alanHesapla() {
        return en*boy;
    }
}
