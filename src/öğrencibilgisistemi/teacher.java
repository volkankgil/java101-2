package öðrencibilgisistemi;

public class teacher {
    String teacherName;
    String mpno;
    String branch;

    teacher(String teacherName,String branch,String mpno){
        this.teacherName=teacherName;
        this.mpno=mpno;
        this.branch=branch;
    }

    void print(){
        System.out.println("adý: " +this.teacherName);
        System.out.println("mobil tel: " +this.mpno);
        System.out.println("bölümü: " +this.branch);
    }
}
