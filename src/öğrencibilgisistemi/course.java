package ��rencibilgisistemi;

public class course {
    teacher teacherName;
    String courseName;
    String code;
    String prefix;
    double note;
    double s�zl�not;

    course(String courseName, String code, String prefix, teacher teacherName) {
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
        System.out.println("teacher: " + this.teacherName);
        System.out.println("Notu: " + this.note);
        System.out.println("s�zl� notu : "+this.s�zl�not);
    }

    void printteacherinfo(){
        this.teacherName.print();
    }


    void addteacher(teacher teacherName) {
        if (teacherName.branch.equals(this.prefix)) {
            this.teacherName = teacherName;

        } else {
            System.out.println("��retmen ve ders b�l�mleri uyu�muyor");
        }

    }
}