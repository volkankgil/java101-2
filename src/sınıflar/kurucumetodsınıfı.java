package sýnýflar;

class kurucumetodsýnýfý {

// Nitelikler ; sýnýfa ait deðiþkenlerdir.
        String model="Test";
        String type;
        String colour;
        int speed;
        int speedlimit;

// Davranýþlar : Sýnýfa ait metodlardýr.
        kurucumetodsýnýfý(String model, int speed, String colour){

           // System.out.println(this.model);   BÝR DEÐÝÞKENÝN BAÞINA THÝS KOYAR ÝSEK SINIFA AÝT DEÐÝÞKENÝ ALIR.
            this.model=model;
            this.speed=speed;
            this.colour=colour;
            this.type="sedan";
            this.speedlimit=180;
            System.out.println( "Model:" + model + "=" + speed + "=" + colour);

    }

            kurucumetodsýnýfý(){

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
            System.out.println(this.model + " Hýzýnýz:" + this.speed);
        }

            void printinfo(){
            System.out.println("Model:\t"+this.model);
            System.out.println("Hýz:\t"+this.speed);
            System.out.println("Renk:\t"+this.colour);
            System.out.println("Tip:\t"+this.type);
        }

}
