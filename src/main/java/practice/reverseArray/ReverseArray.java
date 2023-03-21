package practice.reverseArray;

public class ReverseArray {


    public static String[] reverse(String[] strings) {
        String[] done = new String[strings.length];
        for(int i = strings.length - 1; i>= 0; i--){
            done[strings.length - i-1] = strings[i];}
        for(int i = strings.length - 1; i>= 0; i--){
            strings[i] = done[i];
        }
        return strings;
    }

}