package Person;

public class Student extends Person {
    private int credits;
    Student(String pName, String pAddy) {
        super(pName, pAddy);
    }

    public void studyC(){
        this.credits++;
    }
    @Override
    public String toString() {
        return super.toString() + "\n Study Credits " + this.credits;
    }

}
