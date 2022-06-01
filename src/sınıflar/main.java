package sýnýflar;

public class main {
    public static void main(String[] args) {


        kurucumetod audi = new kurucumetod("audi",50,"red");

        audi.printinfo();


        kurucumetod bmw = new kurucumetod();
        bmw.model="bmw";
        bmw.type="3.20";
        bmw.speed=25;
        bmw.increaseSpeed(45);
        bmw.increaseSpeed(55);

        System.out.println("---------");
        bmw.printinfo();


        kurucumetod mercedes=new kurucumetod("Mercedes",100,"red");
        mercedes.model="c180";
        mercedes.speed=100;
        mercedes.decreaseSpeed(34);
    }


    }

