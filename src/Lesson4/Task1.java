package Lesson4;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(covertAgeToDays(15));
        System.out.println("Allowed to enter the club -" + allowedToEnter(15));
        System.out.println(daysOFWeek(-1));
        System.out.println(daysLeft(3));
        System.out.println(convertToUppercase("anna lilit"));
        System.out.println(dayOfMonth(2));

    }
    public static int covertAgeToDays(int age){
        int ageDays = 365*age;
        return ageDays;

    }
    public static boolean allowedToEnter (int age){
        boolean isAllowed = age > 18;
        return isAllowed;
    }
    public static String daysOFWeek (int day){
        String [] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        if (day >= 0 && day <= 6){
           return weekDays[day];
        }
        else {
            return "Not a valid day";
        }
    }
    public static String daysLeft (int day){
        String [] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        if (day >= 0 && day <= 6){
            String result = "";
            for (int i = day; i < weekDays.length; i++) {
            result += weekDays[i] + " ";
            }
            return result;
        }
        else {
            return "Not a valid day";
        }
    }
    public static String dayOfMonth (int day) {
        if (day > 31 || day < 1){
            return "Not Valid Day of Month";
        }
        else {
            switch (day%10){
                case 1: return day + "st";
                case 2: return day + "nd";
                case 3: return day + "rd";
                default: return day + "th";
            }
        }
    }
    public static String convertToUppercase (String input){
        String result = "";
        char[] array = input.toCharArray();
        for (int i = 0; i < array.length; i++) {
            char nameChar;
            if ((int) array[i] >= 97 && (int) array[i] <= 122){
                nameChar = (char) ((int) array[i] -32);}
            else{
                nameChar = array[i];
            }
            result+=nameChar;
        }
        return result;
    }
}
