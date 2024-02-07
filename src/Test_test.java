import java.io.File;

public class Test_test {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setAge(23);
        person1.setName("aaaa");
        person1.setLastname("bbb");
        Person.setNumber(55);

        Person person2 = new Person();
        person2.setAge(24);
        person2.setName("dddd");
        person2.setLastname("ccc");

        System.out.println(Person.getNumber());
        System.out.println();
        String a = "Tiko";
        String b = new String("Tik");
        System.out.println(a.equals(b));

        Cat kiti = new Cat();
        kiti.age = 1;
        Cat buti = kiti.getCat();
        System.out.println(kiti.equals(buti));

    }
}
