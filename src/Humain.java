public class Humain implements Cloneable{

    private  int age;
    private  boolean gender;
    private  String name;
    private  Clone head;

//    public int getAge() {
//        return (int) Humain
//    }

    public boolean isGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public Clone getHead() {
        return head;
    }

    @Override
    public String toString() {
        return "Humain{" +
                "age=" + age +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", head=" + head +
                '}';
    }

    public Humain(int age, boolean gender, String name, Clone head) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.head = head;

    }
}
