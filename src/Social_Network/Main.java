package Social_Network;

public class Main {
    public static void main(String[] args) {
        Profile myProfile = new Profile();
        myProfile.createContact("tom", 30, "hhhh@gmail.com", true, "male", true, "education");

        for (User user : myProfile.friendList) {
            if (user!=null) {
                user.userInfo();
            }
        }

        System.out.println(myProfile.friendList[0].getUserInfo());
    }
}
