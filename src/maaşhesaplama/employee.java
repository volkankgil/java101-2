package maa�hesaplama;

public class employee {

    String name;
    int Salary;
    int workHours;
    int hireYears;

    employee(String name, int Salary, int workHours, int hireYears) {
        this.name = name;
        this.Salary = Salary;
        this.workHours = workHours;
        this.hireYears = hireYears;

    }

    double tax() {
        double vergi;
        if (this.Salary > 1000) {
            vergi = Salary * 0.03;
            return vergi;
        } else {
            return 0;
        }
    }

    double bonus() {
        double bonustutar;
        int result = 0;
        int counter = 0;
        for (int i = 1; i <= workHours; i++) {
            if (workHours > 40) {
                counter++;
            }else {
                return 0;
            }

        } result += counter;
          result-=40;
          bonustutar=result*30;
          return bonustutar;
    }

    /*void yearBonus(){
        int firstYear=2021;

        if(firstYear-hireYears<10){
            Salary*=1.05;
            System.out.println("Year increseament : "+ this.Salary);
        }
        if(firstYear-hireYears>9 && firstYear-hireYears<20){
            Salary*=1.10;
            System.out.println("Year increseament : "+this.Salary);
        }
        if(firstYear-hireYears>19){
            Salary*=1.15;
            System.out.println("Year increseament : "+this.Salary);
        }
    }*/
    double yearBonus() {
        int firstYear = 2021;
        double neww=Salary;

        if (firstYear - hireYears < 10) {
            neww *= 1.05;
        }
        if (firstYear - hireYears > 9 && firstYear - hireYears < 20) {
            neww *= 1.10;
        }
        if (firstYear - hireYears > 19) {
            neww *= 1.15;
        }
        return neww;
    }

    void print() {

        System.out.println("�al��an Ad� :" + this.name);
        System.out.println("�al��an Maa�� :" + this.Salary);
        System.out.println("Ayl�k �al��ma Saati :" + this.workHours);
        System.out.println("�al��ma Y�l�: " + this.hireYears);
        System.out.println("Vergi : " + this.tax());
        System.out.println("Bonus Tutar : " + this.bonus());
        System.out.println("Year �ncreasement " + this.yearBonus());  //yearBonus();// void metod oldu�u i�in sout'u metodun i�inde yazd�m.
        System.out.println(yearBonus()+bonus()-tax());
    }

    @Override
    public String toString() {
        return  "name=" + name + "\n"+
                "Salary=" + Salary + "\n"+
                "workHours=" + workHours + "\n"+
                "hireYears=" + hireYears + "\n"+
                "Vergi=" + tax() + "\n"+
                "Toplam=" +yearBonus()+bonus()+"\n"+// neden o kadar s�f�r geliyor bilmiyom.
                "";
    }
}


