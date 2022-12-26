public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int examNote;
    int oralExamNote;
    double oralExamRatio;

    public Course(String name, String code, String prefix, double oralExamRatio) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.oralExamRatio = oralExamRatio;
        this.examNote = 0;
        this.oralExamNote = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public double getNote(){
        return ((1.0 - this.oralExamRatio) * this.examNote + this.oralExamRatio * this.oralExamNote);
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}


