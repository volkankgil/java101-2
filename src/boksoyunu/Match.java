package boksoyunu;

import com.sun.source.tree.BreakTree;

public class Match {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){

    this.f1=f1;
    this.f2=f2;
    this.minWeight=minWeight;
    this.maxWeight=maxWeight;
    }

    public void run(){

        if(isCheck()){
            while(this.f1.health>0 && this.f2.health>0) {

                System.out.println("---Yeni Round---");
                if (start()) {
                    this.f2.health = this.f1.hit(f2);
                    if (iswin()) {
                        break;
                    }
                    System.out.println(this.f2.name + " Sa�l�k = " + this.f2.health);
                } else {
                    this.f1.health = this.f2.hit(f1);
                    if (iswin()) {
                        break;
                    }
                    System.out.println(this.f1.name + " Sa�l�k = " + this.f1.health);
                }
            }

        }else {
            System.out.println("Sporcular�n a��rl�klar� uygun de�il");
        }
}

    boolean isCheck(){
    return (this.f1.weight>=minWeight && this.f1.weight<=maxWeight) && (this.f2.weight>=minWeight&&this.f2.weight<=maxWeight);
    }

    boolean iswin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " Kazand�");
            return true;
        }

        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " Kazand�");
            return true;
        }return false;
    }

    boolean start(){
        double olas�l�k=Math.random()*100;
        if(olas�l�k>=50){
            return true;
        }
        return false;
    }
}
