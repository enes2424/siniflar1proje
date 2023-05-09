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
    
    public void addBulkVivaNoteOfMat(int mat, int impactPercentageOfVivaNoteOfMat) {

        if (mat >= 0 && mat <= 100) {
            this.mat.vivaNote = mat;
        }

        if (impactPercentageOfVivaNoteOfMat >= 0 && impactPercentageOfVivaNoteOfMat <= 100) {
            this.mat.note = (impactPercentageOfVivaNoteOfMat * mat + (100 - impactPercentageOfVivaNoteOfMat) * this.mat.examNote) / 100.0;
        }

    }
    
    public void addBulkVivaNoteOfFizik(int fizik, int impactPercentageOfVivaNoteOfFizik) {

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.vivaNote = fizik;
        }

        if (impactPercentageOfVivaNoteOfFizik >= 0 && impactPercentageOfVivaNoteOfFizik <= 100) {
            this.fizik.note = (impactPercentageOfVivaNoteOfFizik * fizik + (100 - impactPercentageOfVivaNoteOfFizik) * this.fizik.examNote) / 100.0;
        }

    }
    
    public void addBulkVivaNoteOfKimya(int kimya, int impactPercentageOfVivaNoteOfKimya) {

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.vivaNote = kimya;
        }

        if (impactPercentageOfVivaNoteOfKimya >= 0 && impactPercentageOfVivaNoteOfKimya <= 100) {
            this.kimya.note = (impactPercentageOfVivaNoteOfKimya * kimya + (100 - impactPercentageOfVivaNoteOfKimya) * this.kimya.examNote) / 100.0;
        }

    }

    public void isPass() {
        if (this.mat.examNote == 0 || this.fizik.examNote == 0 || this.kimya.examNote == 0 || this.mat.vivaNote == 0 || this.fizik.vivaNote == 0 || this.kimya.vivaNote == 0) {
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
        this.avarage = (this.fizik.note + this.kimya.note + this.mat.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }
}
