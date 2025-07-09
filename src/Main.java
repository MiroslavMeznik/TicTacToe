//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("3x3 Tic Tac Toe");

//        //vytvorit pole pomocne vypocty a testy
//        String[][] twoDStringArray = new String[3][3];
//        for(String[] rowOfStrings : twoDStringArray) {
//            for(String s : rowOfStrings) {
//                System.out.println(s);
//            }
//        }

// Vytvorenie a inicializácia 2D poľa
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        // Alternatívny spôsob vytvorenia
//        int[][] emptyMatrix = new int[3][3];
//        emptyMatrix[0][0] = 1;
//        emptyMatrix[1][1] = 5;
//        emptyMatrix[2][2] = 9;
//
//        System.out.println("Základná matica 3x3:");
//        print2DArray(emptyMatrix);

        int row = 3;
        int colums = 3;

        String[][] Array = new String[row][colums];
        Array[0][0] = "00";
        Array[0][1] = "01";
        Array[0][2] = "02";
        Array[1][0] = "10";
        Array[1][1] = "11";
        Array[1][2] = "12";
        Array[2][0] = "20";
        Array[2][1] = "21";
        Array[2][2] = "22";

        for (int j = 0; j < colums; j++) {
            System.out.println("  1  2  3");
            for (int i = 0; i < row; i++) {
                System.out.printf(" " + Array[i][j]);
            }
            System.out.println();
        }


        //print2D(Array);

//        for (int i = 0; i < colums; i++) {
//            for (int j = 0; j < row; j++) {
//                System.out.println(emptyArray[i][j]);
//            }
//        }


    }

    public static void print2D(String[][] Array){
//        for (int j = 0; j < row; j++) {
//
//            for (int i = 0; i < colums; i++) {
//                System.out.printf(" " + Array[i][j]);
//            }
//            System.out.println();
//        }

    }

    public static void print2DSArray(String[][] Array) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%4d", Array[i][j]);
            }
            System.out.println();
        }
    }



}

