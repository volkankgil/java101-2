package maaþhesaplama;

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


        print();
    }

    void print() {
        System.out.println("Çalýþan Adý :" + this.name);
        System.out.println("Çalýþan Maaþý :" + this.Salary);
        System.out.println("Aylýk Çalýþma Saati :" + this.workHours);
        System.out.println("Çalýþma Yýlý: " + this.hireYears);
    }

}

