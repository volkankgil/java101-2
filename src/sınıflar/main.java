package s�n�flar;

public class main {
    public static void main(String[] args) {


        kurucumetods�n�f� audi = new kurucumetods�n�f�("audi",50,"red");

        audi.printinfo();


        kurucumetods�n�f� bmw = new kurucumetods�n�f�();

        bmw.model="bmw";
        bmw.type="3.20";
        bmw.speed=25;
        bmw.increaseSpeed(45);
        bmw.increaseSpeed(55);

        System.out.println("---------");

        bmw.printinfo();


        kurucumetods�n�f� mercedes=new kurucumetods�n�f�("Mercedes",100,"red");
        mercedes.model="c180";
        mercedes.speed=100;
        mercedes.decreaseSpeed(34);
    }


    }

