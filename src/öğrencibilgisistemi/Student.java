package öðrencibilgisistemi;

public class Student {
    Course tarih;  //Course sýnýfýndan  3 farklý ders için 3 nesne tanýmladýk.

    Course biyoloji;

    Course fizik;

    Course Rehberlik;

    Course müzik;

    String namestudent;
    String StuNo;
    String Classes; //class javaya özgü olduðundan classes yazabiliriz.

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

    void addbulkexamnote(int tarih, int fizik, int biyoloji,int Rehberlik,int tarihsözlünot, int fiziksözlünot, int biyolojisözlünot,int rehberliksözlünot) {
        if (tarih >= 0 && tarih <= 100) {
            this.tarih.note = tarih;       //c1.note ; c1 dersinin Course sýnýfýndaki note'a atanmasýdýr.
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
        if (tarihsözlünot >= 0 && tarihsözlünot <= 100) {
            this.tarih.sözlünot = tarihsözlünot;
        }
        if (fiziksözlünot >= 0 && fiziksözlünot <= 100) {
            this.fizik.sözlünot = fiziksözlünot;
        }
        if (biyolojisözlünot >= 0 && biyolojisözlünot <= 100) {
            this.biyoloji.sözlünot = biyolojisözlünot;
        }
        if (Rehberlik >= 0 && Rehberlik <= 100) {
            this.Rehberlik.sözlünot = rehberliksözlünot;
        }
    }
    void oranortalama() {
        double tarihaverage = (this.tarih.note * 0.8) + (this.tarih.sözlünot * 0.2);
        double fizikaverage = (this.fizik.note * 0.7) + (this.fizik.sözlünot * 0.3);
        double biyolojiaverage = (this.biyoloji.note * 0.6) + (this.biyoloji.sözlünot * 0.4);
        this.average = (tarihaverage + fizikaverage + biyolojiaverage) / 3.0;
    }

    void isPass() {
        this.isPass=isKontrolPass();

        printstudent();

        System.out.println("Ortalama: "+Math.ceil(this.average));

        if(this.isPass){
            System.out.println("Sýnýfý Geçti");
        } else {
            System.out.println("Sýnýfta Kaldý");
        }
    }
    boolean isKontrolPass(){
        oranortalama();
        return this.average>=55;
    }

    void printstudent() {
        System.out.println("Öðrenci Adý:" +this.namestudent);
        System.out.println("Öðrenci No :" +this.StuNo);
        System.out.println("Öðrenci Sýnýfý:" +this.Classes);
        System.out.println(this.tarih.courseName + " notu: " + this.tarih.note);
        System.out.println(this.fizik.courseName + " notu: " + this.fizik.note);
        System.out.println(biyoloji.courseName + " notu: " + biyoloji.note);
        System.out.println(Rehberlik.courseName + " notu: " + Rehberlik.note);
        System.out.println(tarih.courseName + " sözlü notu: " + tarih.sözlünot);
        System.out.println(fizik.courseName + " sözlü notu: " + fizik.sözlünot);
        System.out.println(biyoloji.courseName + " sözlü notu: " + biyoloji.sözlünot);
        System.out.println(Rehberlik.courseName + "sözlü notu: " + Rehberlik.sözlünot);

    }

}


