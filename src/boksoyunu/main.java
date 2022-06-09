package boksoyunu;

public class main {
    public static void main(String[] args) {

        Fighter f1 =new Fighter("Volkan",10,120,95,75);
        Fighter f2 =new Fighter("Berkan",25,89,90,10);

        Match match=new Match(f1,f2 ,90,100);
        match.run();

    }
}
