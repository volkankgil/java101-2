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


        print();
    }

    void print() {
        System.out.println("�al��an Ad� :" + this.name);
        System.out.println("�al��an Maa�� :" + this.Salary);
        System.out.println("Ayl�k �al��ma Saati :" + this.workHours);
        System.out.println("�al��ma Y�l�: " + this.hireYears);
    }

}

