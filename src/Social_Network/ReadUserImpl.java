package Social_Network;


import java.io.IOException;
import java.util.ArrayList;


public class ReadUserImpl {
    public static void main(String[] args) {
       User bobo = new User();
       bobo.setUsername("dambul");
       bobo.setAge(2);

       User dodo = new User();
       dodo.setUsername("chir");
       dodo.setAge(23);

       ArrayList<User> users = new ArrayList<>();
       users.add(bobo);
       users.add(dodo);
       users.add(new User("Tigran", 27));
       WriteReadService rw = new WriteReadService();
        try {
            rw.write(users);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            rw.read("Tigran");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
