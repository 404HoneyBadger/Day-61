package Person;

public class Teacher extends Person{
    private int salary;
    Teacher(String pName, String pAddy, int salary) {
        super(pName, pAddy);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n salary  " + this.salary + " euro/month";
    }
}
