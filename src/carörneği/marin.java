package carörneði;

import carörneði.car;

public class marin {
    public static void main(String[] args) {

        car audi = new car();
        audi.model="Audi A3";
        audi.speed=10;
        audi.increaseSpeed(20);
        audi.decreaseSpeed(10);
        audi.printspeed();


        car bmw = new car();
        bmw.model= "BMW";
        bmw.speed=55;
        bmw.increaseSpeed(20);
        bmw.increaseSpeed(50);
        bmw.decreaseSpeed(15);
        bmw.color="Pink ";
        bmw.printspeed();


        car mercedes=new car();
        mercedes.model="Mercedes";
        mercedes.speed=100;
        mercedes.decreaseSpeed(40);
        mercedes.increaseSpeed(10);
        mercedes.increaseSpeed(115);
        mercedes.printspeed();


    }
}
