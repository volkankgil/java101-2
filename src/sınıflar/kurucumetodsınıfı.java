package s�n�flar;

class kurucumetods�n�f� {

// Nitelikler ; s�n�fa ait de�i�kenlerdir.
        String model="Test";
        String type;
        String colour;
        int speed;
        int speedlimit;

// Davran��lar : S�n�fa ait metodlard�r.
        kurucumetods�n�f�(String model, int speed, String colour){

           // System.out.println(this.model);   B�R DE���KEN�N BA�INA TH�S KOYAR �SEK SINIFA A�T DE���KEN� ALIR.
            this.model=model;
            this.speed=speed;
            this.colour=colour;
            this.type="sedan";
            this.speedlimit=180;
            System.out.println( "Model:" + model + "=" + speed + "=" + colour);

    }

            kurucumetods�n�f�(){

            }


            void increaseSpeed(int increase){

            if ((this.speed+increase)<speedlimit){
                this.speed+=increase;
        }
    }

            void decreaseSpeed(int decrease){
            if (this.speed>0){
                this.speed-=decrease;
            }
        }

            void printSpeed(){
            System.out.println(this.model + " H�z�n�z:" + this.speed);
        }

            void printinfo(){
            System.out.println("Model:\t"+this.model);
            System.out.println("H�z:\t"+this.speed);
            System.out.println("Renk:\t"+this.colour);
            System.out.println("Tip:\t"+this.type);
        }

}
