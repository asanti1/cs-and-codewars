package NotVerySecure;

public class Kata {
    public static boolean alphanumeric(String s){
        return s.matches("([A-Za-z]|[0-9])+");
    }
}
