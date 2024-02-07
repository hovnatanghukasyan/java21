public class Human3 {
    public void print1toN(int n) {
        for (int i = 1; i < n; i++) {
            System.out.print(i + " ");
        }
    }

    private int  mark;
    private String Nickname;

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String nickname) {
        Nickname = nickname;
    }
}
