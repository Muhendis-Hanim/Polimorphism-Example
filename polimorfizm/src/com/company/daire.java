package com.company;

public class daire extends GeometrikSekil{
    private double yaricap;
    public daire(){
        yaricap=0;
    }
    public daire(double yaricap){
    setYaricap(yaricap);
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        if(yaricap<0){
            this.yaricap=0;
        }else {
            this.yaricap = yaricap;
        }

    }

    @Override
    public double alanHesapla() {
        return Math.PI*yaricap*yaricap;
    }
}
