package ��rencibilgisistemi;

public class Teacher {
    String teacherName;
    String mpno;
    String branch;

    Teacher(String teacherName, String branch, String mpno){
        this.teacherName=teacherName;
        this.mpno=mpno;
        this.branch=branch;
    }

    void print(){
        System.out.println("ad�: " +this.teacherName);
        System.out.println("mobil tel: " +this.mpno);
        System.out.println("b�l�m�: " +this.branch);
    }
}
