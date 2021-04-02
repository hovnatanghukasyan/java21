package Social_Network;


public class Moderator extends User{
    private String permissionType;
    private boolean isTemporary;

    public Moderator(String permissionType, boolean isTemporary, String username) {
        this.permissionType = permissionType;
        this.isTemporary = isTemporary;
        this.username = username;


    }

    public String getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
    }

    public boolean isTemporary() {
        return isTemporary;
    }

    public void setTemporary(boolean temporary) {
        isTemporary = temporary;
    }

    @Override
    public void userInfo() {
        System.out.println(username);
    }
}
