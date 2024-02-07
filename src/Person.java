public class Person {
   private String name;
   private String lastname;
   private int age;
   private static int number;
   static {
       number = 565;
       System.out.println("static block");
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Person.number = number;
    }
    static class SubClass1{
       public static String name;
    }

    public static void main(String[] args) {
        Person.SubClass1 fff = new Person.SubClass1();
//        Person.SubClass1.name;
//        fff.name;
    }
}
