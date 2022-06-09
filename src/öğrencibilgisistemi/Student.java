package ��rencibilgisistemi;

public class Student {
    Course tarih;  //Course s�n�f�ndan  3 farkl� ders i�in 3 nesne tan�mlad�k.

    Course biyoloji;

    Course fizik;

    Course Rehberlik;

    Course m�zik;

    String namestudent;
    String StuNo;
    String Classes; //class javaya �zg� oldu�undan classes yazabiliriz.

    double average;
    boolean isPass;

    Student(String namestudent, String stuNo, String classes, Course tarih, Course biyoloji, Course fizik,Course Rehberlik) {
        this.namestudent = namestudent;
        this.StuNo = stuNo;
        this.Classes = classes;
        this.tarih = tarih;
        this.biyoloji = biyoloji;
        this.fizik = fizik;
        this.Rehberlik=Rehberlik;
        this.isPass=false;
    }

    void addbulkexamnote(int tarih, int fizik, int biyoloji,int Rehberlik,int tarihs�zl�not, int fiziks�zl�not, int biyolojis�zl�not,int rehberliks�zl�not) {
        if (tarih >= 0 && tarih <= 100) {
            this.tarih.note = tarih;       //c1.note ; c1 dersinin Course s�n�f�ndaki note'a atanmas�d�r.
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (biyoloji >= 0 && biyoloji <= 100) {
            this.biyoloji.note = biyoloji;
        }
        if (Rehberlik >= 0 && Rehberlik <= 100) {
            this.Rehberlik.note = Rehberlik;
        }
        if (tarihs�zl�not >= 0 && tarihs�zl�not <= 100) {
            this.tarih.s�zl�not = tarihs�zl�not;
        }
        if (fiziks�zl�not >= 0 && fiziks�zl�not <= 100) {
            this.fizik.s�zl�not = fiziks�zl�not;
        }
        if (biyolojis�zl�not >= 0 && biyolojis�zl�not <= 100) {
            this.biyoloji.s�zl�not = biyolojis�zl�not;
        }
        if (Rehberlik >= 0 && Rehberlik <= 100) {
            this.Rehberlik.s�zl�not = rehberliks�zl�not;
        }
    }
    void oranortalama() {
        double tarihaverage = (this.tarih.note * 0.8) + (this.tarih.s�zl�not * 0.2);
        double fizikaverage = (this.fizik.note * 0.7) + (this.fizik.s�zl�not * 0.3);
        double biyolojiaverage = (this.biyoloji.note * 0.6) + (this.biyoloji.s�zl�not * 0.4);
        this.average = (tarihaverage + fizikaverage + biyolojiaverage) / 3.0;
    }

    void isPass() {
        this.isPass=isKontrolPass();

        printstudent();

        System.out.println("Ortalama: "+Math.ceil(this.average));

        if(this.isPass){
            System.out.println("S�n�f� Ge�ti");
        } else {
            System.out.println("S�n�fta Kald�");
        }
    }
    boolean isKontrolPass(){
        oranortalama();
        return this.average>=55;
    }

    void printstudent() {
        System.out.println("��renci Ad�:" +this.namestudent);
        System.out.println("��renci No :" +this.StuNo);
        System.out.println("��renci S�n�f�:" +this.Classes);
        System.out.println(this.tarih.courseName + " notu: " + this.tarih.note);
        System.out.println(this.fizik.courseName + " notu: " + this.fizik.note);
        System.out.println(biyoloji.courseName + " notu: " + biyoloji.note);
        System.out.println(Rehberlik.courseName + " notu: " + Rehberlik.note);
        System.out.println(tarih.courseName + " s�zl� notu: " + tarih.s�zl�not);
        System.out.println(fizik.courseName + " s�zl� notu: " + fizik.s�zl�not);
        System.out.println(biyoloji.courseName + " s�zl� notu: " + biyoloji.s�zl�not);
        System.out.println(Rehberlik.courseName + "s�zl� notu: " + Rehberlik.s�zl�not);

    }

}


