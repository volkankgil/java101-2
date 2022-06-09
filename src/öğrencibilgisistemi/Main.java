package öðrencibilgisistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Volkan Hoca","TRH","55542");

        /*t1.print(); //kod çalýþýrken gelmesin diye beklemede*/

        Teacher t2 = new Teacher("Graham Bell","FZK","784");

        Teacher t3 = new Teacher("Tümay","biyoloji","785522");

        Teacher t4 = new Teacher("Tümay","Rehberlik","12454");


                        Course tarih =new Course("tarih","101","TRH",t1);
                        tarih.addteacher(t1);


                        Course fizik= new Course("Fizik","102","FZK",t2);
                        fizik.addteacher(t2);


                        Course biyoloji=new Course("biyoloji","101","biyoloji",t3);
                        biyoloji.addteacher(t3);

                        Course Rehberlik = new Course("Rehberlik","104", "Rehberlik",t4);
                        Rehberlik.addteacher(t4);


        System.out.println("========");

                        Student s1 =new Student("Ýnek Þaban","478","4",tarih,fizik,biyoloji,Rehberlik);
                        s1.addbulkexamnote(100,100,100,100,100,100,71,95);
                        s1.isPass();


        System.out.println("========");

                        Student s2= new Student("Güdük Necmi", "222","3",tarih,fizik,biyoloji,Rehberlik);
                        s2.addbulkexamnote(50,25,25,45,55,60,23,42);
                        s2.isPass();


        System.out.println("========");

                        Student s3 =new Student("Berkan","358","4",tarih,fizik,biyoloji,Rehberlik);
                        s3.addbulkexamnote(45,40,100,100,65,75,50,47);
                        s3.isPass();


        System.out.println("========");

                        Student s4 = new Student("Volkan","2019","10",tarih,fizik,biyoloji,Rehberlik);
                        s4.addbulkexamnote(0,0,45,0,0,45,78,25);
                        s4.isPass();
    }
}
