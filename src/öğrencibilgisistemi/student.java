package öðrencibilgisistemi;

public class student {
    course tarih;  //course sýnýfýndan  3 farklý ders için 3 nesne tanýmladýk.

    course biyoloji;

    course fizik;

    course iþteknik;

    course müzik;

    String namestudent;
    String StuNo;
    String Classes; //class javaya özgü olduðundan classes yazabiliriz.

    double average;
    boolean isPass;

    student(String namestudent, String stuNo, String classes, course tarih, course biyoloji, course fizik) {
        this.namestudent = namestudent;
        this.StuNo = stuNo;
        this.Classes = classes;
        this.tarih = tarih;
        this.biyoloji = biyoloji;
        this.fizik = fizik;
        oranortalama();
        this.isPass=false;
    }

    void addbulkexamnote(int tarih, int fizik, int biyoloji, int tarihsözlünot, int fiziksözlünot, int biyolojisözlünot) {
        if (tarih >= 0 && tarih <= 100) {
            this.tarih.note = tarih;       //c1.note ; c1 dersinin course sýnýfýndaki note'a atanmasýdýr.
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (biyoloji >= 0 && biyoloji <= 100) {
            this.biyoloji.note = biyoloji;
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
        System.out.println("Ortalama: "+this.average);
        if(this.isPass){
            System.out.println("sýnýfý geçti");
        } else {
            System.out.println("sýnýfta kaldý");
        }
    }
    boolean isKontrolPass(){
        oranortalama();
        return this.average>=55;
    }


    void printstudent() {
        System.out.println(namestudent);
        System.out.println(StuNo);
        System.out.println(Classes);
        System.out.println(tarih.courseName + " notu: " + tarih.note);
        System.out.println(fizik.courseName + " notu: " + fizik.note);
        System.out.println(biyoloji.courseName + " notu: " + biyoloji.note);
        System.out.println(tarih.courseName + " sözlü notu: " + tarih.sözlünot);
        System.out.println(fizik.courseName + " sözlü notu: " + fizik.sözlünot);
        System.out.println(biyoloji.courseName + " sözlü notu: " + biyoloji.sözlünot);

    }

}


