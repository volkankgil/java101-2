package carörneði;

class car {
    //nitelikler;

    String type;
    String model;
    String color;

    int speed;
    int speedlimit = 180;

    void increaseSpeed(int increment) {
        if ((speed + increment) < speedlimit) {
            speed+= increment;
        }
    }

    void decreaseSpeed(int decrease) {
        if (speed > 0) {
            speed -= decrease;

        }
    }

    void printspeed() {
        System.out.println(color + model + " Hýzýnýz:" + speed);
    }

}


