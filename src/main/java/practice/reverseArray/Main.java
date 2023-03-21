package practice.reverseArray;

public class Main {


    public static void main(String[] args) {

        String line = "Каждый охотник желает знать, где сидит фазан";
        String[] line1 = line.split("\s");
        line1 = ReverseArray.reverse(line1);
    }
}
