package ��rencibilgisistemi;

public class Course {
    Teacher teacherName; //SINIFIN N�TEL�KLER� ��ER�S�NDE BA�KA B�R SINIFI �A�IRIR �SEK JARGON OLARAK EN �STTE YAZILIR.
    String courseName;
    String code;
    String prefix;
    double note;
    double s�zl�not;

    Course(String courseName, String code, String prefix, Teacher teacherName) {
        this.courseName = courseName;
        this.code = code;
        this.prefix = prefix;
        this.teacherName = teacherName;
        this.note=note ;
        this.s�zl�not=s�zl�not;
    }

    void print() {
        System.out.println("ad�: " + this.courseName);
        System.out.println("Kod: " + this.code);
        System.out.println("Prefix: " + this.prefix);
        System.out.println("Teacher: " + this.teacherName);
        System.out.println("Notu: " + this.note);
        System.out.println("s�zl� notu : "+this.s�zl�not);
    }

    void printteacherinfo(){
        this.teacherName.print();
    }


    void addteacher(Teacher teacherName) {
        if (teacherName.branch.equals(this.prefix)) {
            this.teacherName = teacherName;

        } else {
            System.out.println("��retmen ve ders b�l�mleri uyu�muyor");
        }

    }
}