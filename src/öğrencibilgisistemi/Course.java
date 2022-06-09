package öðrencibilgisistemi;

public class Course {
    Teacher teacherName; //SINIFIN NÝTELÝKLERÝ ÝÇERÝSÝNDE BAÞKA BÝR SINIFI ÇAÐIRIR ÝSEK JARGON OLARAK EN ÜSTTE YAZILIR.
    String courseName;
    String code;
    String prefix;
    double note;
    double sözlünot;

    Course(String courseName, String code, String prefix, Teacher teacherName) {
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
        System.out.println("Teacher: " + this.teacherName);
        System.out.println("Notu: " + this.note);
        System.out.println("sözlü notu : "+this.sözlünot);
    }

    void printteacherinfo(){
        this.teacherName.print();
    }


    void addteacher(Teacher teacherName) {
        if (teacherName.branch.equals(this.prefix)) {
            this.teacherName = teacherName;

        } else {
            System.out.println("Öðretmen ve ders bölümleri uyuþmuyor");
        }

    }
}