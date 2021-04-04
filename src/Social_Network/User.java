package Social_Network;

public class User{
    protected String username;
    private String mail;
    private Boolean isPremium;
    private String gender = "invalid gender";
    private int age;
    private String education;
    private Boolean isRegistered;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Boolean getPremium() {
        return isPremium;
    }

    public void setPremium(Boolean premium) {
        isPremium = premium;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender == "male" || gender == "female")
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public Boolean getRegistered() {
        return isRegistered;
    }

    public void setRegistered(Boolean registered) {
        isRegistered = registered;
    }

    public void userInfo(){
        System.out.print(username + ", " );
    }
    public String getUserInfo() {
        String result = "";
        String returnableUName = mail.substring(3);
        result = result + " " + username + " ***" + returnableUName + " ";
        return result;
    }


}
