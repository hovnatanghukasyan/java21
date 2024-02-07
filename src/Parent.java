public class Parent {
    public static void main(String[] args) {
        Student student1 = new Student("HOVO");
        student1.setYear(5);
        student1.setFirstName("Adam");
        student1.setLastName("Murray");
        student1.setFaculty("Philosophy");
        student1.setGender('m');

        Teacher teacher = new Teacher("Tanash");
        teacher.setFirstName("Eva");
        teacher.setLastName("Brown");
        teacher.setSalary(1000);
        teacher.setExperience((byte)10);
        teacher.setGender('f');
        teacher.setPhone("444444");

        student1.printInfo();
    }
}
