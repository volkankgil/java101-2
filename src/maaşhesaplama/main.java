package maaþhesaplama;

public class main {
    public static void main(String[] args) {

        employee employee1=new employee("Volkan",5000,40,2015);
        System.out.println(employee1);

        System.out.println("--------");

        employee employee2=new employee("Tümay",10000,35,1995);
        employee2.print();

        System.out.println("--------");

        employee employee3=new employee("Berkan",500,50,2010);
        employee3.print();
    }
}
