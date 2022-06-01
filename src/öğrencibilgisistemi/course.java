package öðrencibilgisistemi;

public class course {
    teacher teacherName;
    String courseName;
    String code;
    String prefix;
    double note;
    double sözlünot;

    course(String courseName, String code, String prefix, teacher teacherName) {
        this.courseName = courseName;
        this.code = code;
        this.prefix = prefix;
        this.teacherName = teacherName;
        this.note=note ;
        this.sözlünot=sözlünot;
    }

    void print() {
        System.out.println("adý: " + this.courseName);
        System.out.println("Kod: " + this.code);
        System.out.println("Prefix: " + this.prefix);
        System.out.println("teacher: " + this.teacherName);
        System.out.println("Notu: " + this.note);
        System.out.println("sözlü notu : "+this.sözlünot);
    }

    void printteacherinfo(){
        this.teacherName.print();
    }


    void addteacher(teacher teacherName) {
        if (teacherName.branch.equals(this.prefix)) {
            this.teacherName = teacherName;

        } else {
            System.out.println("Öðretmen ve ders bölümleri uyuþmuyor");
        }

    }
}