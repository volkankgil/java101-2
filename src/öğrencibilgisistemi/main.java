package ��rencibilgisistemi;

public class main {
    public static void main(String[] args) {
        teacher t1 = new teacher("Volkan Hoca","TRH","55542");

        /*t1.print(); //kod �al���rken gelmesin diye beklemede*/

        teacher t2 = new teacher("Graham Bell","FZK","784");


        teacher t3 = new teacher("T�may","biyoloji","785522");


                        course tarih =new course("tarih","101","TRH",t1);
                        tarih.addteacher(t1);


                        course fizik= new course("Fizik","102","FZK",t2);
                        fizik.addteacher(t2);


                        course biyoloji=new course("biyoloji","101","biyoloji",t3);
                        biyoloji.addteacher(t3);


        System.out.println("========");

                        student s1 =new student("�neK �ABAN","478","4",tarih,fizik,biyoloji);
                        s1.addbulkexamnote(100,100,100,100,100,100);
                        s1.isPass();


        System.out.println("========");

                        student s2= new student("g�d�k necmi", "222","3",tarih,fizik,biyoloji);
                        s2.addbulkexamnote(50,25,25,45,55,60);
                        s2.isPass();


        System.out.println("========");

                        student s3 =new student("Berkan","358","4",tarih,fizik,biyoloji);
                        s3.addbulkexamnote(45,40,100,100,65,75);
                        s3.isPass();
    }
}
