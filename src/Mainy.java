public class Mainy {
    public static void main(String[] args) {
        System.out.println(Environment.AUTOMATION.getUrl());
        System.out.println(Environment.AUTOMATION.getVersion());
        System.out.println(Environment.valueOf("STAGE"));

    }
    public static String getURL(Environment environment){
        switch (environment){
            case PROD: return "prod URL";
            case PREPROD: return "preprod URL";
            case STAGE: return "stage URL";
            case AUTOMATION: return "Automation URL";
            default: return "incorrect";
        }
    }
}
