public class Test {
    public static void main(String[] args) {
        int [] newArray = {1,2,3,4,5,6,1,9,10};
        boolean krknutyun = false;
        for (int i = 0; i < newArray.length-1; i++) {
            for (int j = i+1;j<newArray.length;j++){
                if(newArray[i]==newArray[j]){
                    krknutyun = true;
                    System.out.println(newArray[i]);
                }
            }
        }
        System.out.println(krknutyun);
    }
}
