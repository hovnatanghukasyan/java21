public class Teacher extends Human {
    private int salary;
    private byte experience;

    public Teacher (String firstName) {
        super(firstName);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public byte getExperience() {
        return experience;
    }

    public void setExperience(byte experience) {
        this.experience = experience;
    }
}
