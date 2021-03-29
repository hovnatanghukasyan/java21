package Social_Network;

public class Admin extends User{
    private boolean isAbleToDelete;
    private boolean isCreatedGroup;
    private int experience;

    public boolean isAbleToDelete() {
        return isAbleToDelete;
    }

    public void setAbleToDelete(boolean ableToDelete) {
        isAbleToDelete = ableToDelete;
    }

    public boolean isCreatedGroup() {
        return isCreatedGroup;
    }

    public void setCreatedGroup(boolean createdGroup) {
        isCreatedGroup = createdGroup;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
