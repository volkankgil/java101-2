package boksoyunu;

public class Fighter {

    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name, int damage, int health, int weight,int dodge) {

        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge <= 100 && dodge >= 0) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }
    }

    int hit(Fighter foe){
        System.out.println(this.name+"=>" +foe.name+ " " + this.damage + " Hasar vurdu");
        if(foe.isdodge()){
            System.out.println(foe.name + " Gelen Hasarý Blokladý");
            return foe.health;
        }
        if(foe.health - this.damage<0){
            return 0;
        }
        return foe.health-this.damage;
    }

    boolean isdodge(){
        double randomnumber=Math.random()*100;
        return randomnumber<=this.dodge;
    }

    void print (){
        System.out.println(this.name);
        System.out.println(this.damage);
        System.out.println(this.health);
        System.out.println(this.weight);
    }
}
