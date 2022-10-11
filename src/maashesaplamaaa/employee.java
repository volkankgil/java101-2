package maashesaplamaaa;

import java.time.LocalDate;

public class employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    double taxrate=0.03;
    int resulttax;

    int extraworkfeeperhour=30;
    int resultbonus;

    int increaseyear;
    public int tax(){
        if(salary<1000){
        }else {
            setResulttax((int)(salary*taxrate));
        }
        return getResulttax();
    }

    public int bonus(){
        if(workHours>40){
            setResultbonus((workHours-40)*extraworkfeeperhour);
        }
        return getResultbonus();
    }

    public int raise(){
        LocalDate DATE=LocalDate.now();
        if((DATE.getYear()-hireYear)<10){
            setIncreaseyear((int)(salary*0.05));
        }else if(20>(DATE.getYear()-hireYear)&&(DATE.getYear()-hireYear)>9){
            setIncreaseyear((int)(salary*0.10));
        }else {
            setIncreaseyear((int)(salary*0.15));
        }
        return getIncreaseyear();
    }

    public String toString() {
        return  "Name :\n " + name + "\n"+
                "Salary :\n " + salary + "\n"+
                "WorkHours :\n " + workHours + "\n"+
                "HireYears :\n " + hireYear + "\n"+
                "Tax Amount :\n " + tax() + "\n"+
                "Bonus Amount :\n " + bonus() + "\n"+
                "Year Increasement :\n " + raise() + "\n"+
                "Total Fee :\n " +raiseSalary()+"\n"+
                "";
    }

    public double raiseSalary(){
        setSalary(getSalary()-tax()+bonus()+raise());
        return getSalary();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getResulttax() {
        return resulttax;
    }

    public void setResulttax(int resulttax) {
        this.resulttax = resulttax;
    }

    public int getResultbonus() {
        return resultbonus;
    }

    public void setResultbonus(int resultbonus) {
        this.resultbonus = resultbonus;
    }

    public int getIncreaseyear() {
        return increaseyear;
    }

    public void setIncreaseyear(int increaseyear) {
        this.increaseyear = increaseyear;
    }
}
