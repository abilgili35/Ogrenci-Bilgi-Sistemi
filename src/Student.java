public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.examNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.examNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.examNote = kimya;
        }

    }

    public void addBulkOralExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.oralExamNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.oralExamNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.oralExamNote = kimya;
        }

    }

    public void isPass() {
        if (this.mat.getNote() == 0 || this.fizik.getNote() == 0 || this.kimya.getNote() == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.fizik.getNote() + this.kimya.getNote() + this.mat.getNote()) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.getNote());
        System.out.println("Fizik Notu : " + this.fizik.getNote());
        System.out.println("Kimya Notu : " + this.kimya.getNote());
    }

}