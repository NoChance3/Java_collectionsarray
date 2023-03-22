package practice.twoDimensionalArray;

public class TwoDimensionalArray {


    public static final char SYMBOL = 'X';

    public static char[][] getTwoDimensionalArray(int size) {
        char [][] xxx = new char[size][size];
        for(int i = 0; i < xxx.length; i++){
            for (int j = 0; j < xxx[i].length; j++) {
                xxx[i][j] = (j == i || j == xxx.length - 1 - i) ? 'X' : ' ';
                System.out.print(xxx[i][j]);
            }
            System.out.println();
        }
        return xxx;
    }

}
