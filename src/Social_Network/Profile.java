package Social_Network;

public class Profile {

    static int maxContacts = 10;
    static int containsContactsCount = 0;
    User[] friendList = new User[maxContacts];

    public void createContact(String name, int age, String email, boolean isPremium,String gender,boolean isRegistered, String education) {
        if (containsContactsCount < maxContacts) {
            containsContactsCount++;
            User user = new User();
            user.setUsername(name);
            user.setAge(age);
            user.setMail(email);
            user.setPremium(isPremium);
            user.setGender(gender);
            user.setRegistered(isRegistered);
            user.setEducation(education);
            friendList[containsContactsCount - 1] = user;
        }else {
            System.out.println("contacts list is full");
        }

    }
    public void createContact(User user){
        if (containsContactsCount < maxContacts) {
            containsContactsCount++;
            friendList[containsContactsCount - 1] = user;
        }
    }
}
