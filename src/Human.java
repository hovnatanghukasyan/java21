public class Human {
    private String firstName;
    private String lastName;
    private String phone;
    private int year;
    private char gender;

    public Human(String firstName) {
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    public void printInfo(){
        System.out.println("Full name " + firstName + " " + lastName);
        System.out.println("Year: " + year);
        System.out.println("Gender: "+ (gender == 'm'?"Male":"Female"));
    }
}
