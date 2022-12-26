public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String branch, String mpno){
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;
    }

    void print(){
        System.out.println("Adi \t:\t" + this.name);
        System.out.println("Telefonu \t:\t" + this.mpno);
        System.out.println("Bolumu \t:\t" + this.branch);
    }
    
}
