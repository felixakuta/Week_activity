public class Main {
    //Challenge:
    /**Write a method with the name printDayOfWeek that has one parameter of type int and name it day. Using
     switch statement print "Sunday", "Monday",... "Saturday" if the int parameter "day" is 0,1,2...6,
     otherwise print invalid day.
    **/
    public static void main(String[] args){
        System.out.println("Welcome to " + printDayOfTheWeek(2));
    }
    public static String printDayOfTheWeek(int day){
        String value = null;
        switch (day) {
            case 0:
                value = "Sunday";
                break;
            case 1:
                value = "Monday";
                break;
            case 2:
                value = "Tuesday";
                break;
            case 3:
                value = "Wednesday";
                break;
            case 4:
                value = "Thursday";
            case 5:
                value = "Friday";
                break;
            case 6:
                value = "Saturday";
                break;
            default:
                value = "Invalid day";
        }
        return value;
    }
}
