//Tiffany Behr
//CS-1180L-06
//Erik Buck
//11-05-21

import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(new File("src/test.txt")); //reads in file

        int rows = in.nextInt(); //reads in rows from file
        int columns = in.nextInt(); //reads in column from file
        char[][] board = new char[rows][columns]; //makes the 2d array :)

        for (int i = 0; i < rows; i++) {  //puts the + & - in the array
            for (int j = 0; j < columns; j++) {
                String temp = in.next();
                char c = temp.charAt(0);
                board[i][j] = c;
            }
        }
        System.out.println("Here's the array :)"); //prints out array for easier grading ;)
        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
        int positive = 0; //counts the + in each row
        int maxPositive = 0; // used to compare each row
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j] ==  '+') {
                    positive++;
                }
            }
            if (positive > maxPositive) { //comparison!!
                maxPositive = positive;  
            }
            positive = 0; //resets it to be used for each row
        }

        for (int i = 0; i < rows; i++) {  //this loop is used for the columns. its the same loop but i and j are switched
            for (int j = 0; j < columns; j++) {
                if (board[j][i] ==  '+') {
                    positive++;
                    
                }
                
            }
            if (positive > maxPositive) {
                maxPositive = positive;
            }
            positive = 0;
        }
        System.out.println("\n" + maxPositive); // the maximum :)
    }
}

