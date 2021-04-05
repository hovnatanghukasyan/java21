package Social_Network;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class WriteReadService {
    public void write(ArrayList<User> userList) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("test2.txt", false);
        Gson gson = new Gson();
        String userJson = gson.toJson(userList);
        byte[] strToBytes = userJson.getBytes();
        fileOutputStream.write(strToBytes);
        fileOutputStream.close();
    }

    public void read(String name) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("test2.txt");
        String userListJson = new String(fileInputStream.readAllBytes());
        Gson gson = new Gson();
        Type typeToken = new TypeToken<List<User>>() {
        }.getType();
        ArrayList<User> list = gson.fromJson(userListJson, typeToken);
        for (User user : list) {
            if (user.username.equals(name)) {
                System.out.println(user);
                return;
            }
        }
        System.out.println("there is no user with the name " + name);

    }

}

