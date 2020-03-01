package com.company;

public class kare extends GeometrikSekil {
    private double kenar;

    public kare(){
        kenar=0;

    }
    public kare(double kenar){
        setKenar(kenar);
    }
    public double getKenar() {
        return kenar;
    }

    public void setKenar(double kenar) {
        if (kenar<0){
            this.kenar=0;
        }else {
            this.kenar = kenar;
        }

    }

    @Override
    public double alanHesapla() {
        return kenar*kenar;
    }
}
