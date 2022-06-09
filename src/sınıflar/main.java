package sýnýflar;

public class main {
    public static void main(String[] args) {


        kurucumetodsýnýfý audi = new kurucumetodsýnýfý("audi",50,"red");

        audi.printinfo();


        kurucumetodsýnýfý bmw = new kurucumetodsýnýfý();

        bmw.model="bmw";
        bmw.type="3.20";
        bmw.speed=25;
        bmw.increaseSpeed(45);
        bmw.increaseSpeed(55);

        System.out.println("---------");

        bmw.printinfo();


        kurucumetodsýnýfý mercedes=new kurucumetodsýnýfý("Mercedes",100,"red");
        mercedes.model="c180";
        mercedes.speed=100;
        mercedes.decreaseSpeed(34);
    }


    }

