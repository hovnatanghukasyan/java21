package Social_Network;

public class Feed implements Content {

    private int postID;
    private String name;

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void mediaContent(String URL, String contentType, String username) {

    }

    @Override
    public void picture(String description, String location, String username) {

    }
}
