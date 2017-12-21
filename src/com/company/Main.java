package com.company;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Let's play Tic Tac Toe");
        System.out.println("Pick coordinates for your moves (ex: 0 1 )");
        System.out.println("Pick a row");
        Scanner kb = new Scanner(System.in);
        int row1 = kb.nextInt();
        System.out.println("Pick a column");
        Scanner kb2 = new Scanner(System.in);
        int column1 = kb2.nextInt();
        String a [][] = new String [3][3];
        a[0][0] = String.valueOf('-');
        a[0][1] = String.valueOf('-');
        a[0][2] = String.valueOf('-');
        a[1][0] = String.valueOf('-');
        a[1][1] = String.valueOf('-');
        a[1][2] = String.valueOf('-');
        a[2][0] = String.valueOf('-');
        a[2][1] = String.valueOf('-');
        a[2][2] = String.valueOf('-');
        a [row1][column1] = String.valueOf('X');
        Random rand = new Random();
        Random rand2 = new Random();
        int randRow = rand.nextInt(3);
        int randCol = rand2.nextInt(3);
        /*if (a[randRow][randCol] == String.valueOf('-')){
            a[randRow][randCol] = String.valueOf('O');}*/

        a[randRow][randCol] = String.valueOf('O');


        //a [randRow][randCol] = String.valueOf('O');
        for (int i = 0; i <= 2; i++)
        {
            for (int j= 0; j<=2; j++)
            {
                System.out.print(a[i][j]+ "\t" + "|" + "\t");
            }
            System.out.println();
            System.out.println();
        }
        Scanner move2 = new Scanner(System.in);
        System.out.println("Enter your second move!");
        System.out.println("Enter row. Ex: 0, 1 or 2!");
        int Rmove2= move2.nextInt();
        Scanner move2a = new Scanner(System.in);
        System.out.println("Enter column. Ex: 0, 1 or 2!");
        int Rmove2a= move2.nextInt();
        a [Rmove2a][Rmove2] = String.valueOf('X');

        Random rand3 = new Random();
        Random rand4 = new Random();
        int randRow2 = rand3.nextInt(3);
        int randCol2 = rand4.nextInt(3);
        /*if (a[randRow][randCol] == String.valueOf('-')){
            a[randRow][randCol] = String.valueOf('O');}*/

        a[randRow2][randCol2] = String.valueOf('O');


        for (int i = 0; i <= 2; i++)
        {
            for (int j= 0; j<=2; j++)
            {
                System.out.print(a[i][j]+ "\t" + "|" + "\t");
            }
            System.out.println();
            System.out.println();
        }
        Scanner move3 = new Scanner(System.in);
        System.out.println("Enter your second move!");
        System.out.println("Enter row. Ex: 0, 1 or 2!");
        int Rmove3= move2.nextInt();
        Scanner move3a = new Scanner(System.in);
        System.out.println("Enter column. Ex: 0, 1 or 2!");
        int Rmove3a= move2.nextInt();
        a [Rmove3a][Rmove3] = String.valueOf('X');

        Random rand5 = new Random();
        Random rand6 = new Random();
        int randRow3 = rand3.nextInt(3);
        int randCol3 = rand4.nextInt(3);
        /*if (a[randRow][randCol] == String.valueOf('-')){
            a[randRow][randCol] = String.valueOf('O');}*/
        String siuia = "X";

        a[randRow3][randCol3] = String.valueOf('O');


        for (int i = 0; i <= 2; i++)
        {
            for (int j= 0; j<=2; j++)
            {
                System.out.print(a[i][j]+ "\t" + "|" + "\t");
            }
            System.out.println();
            System.out.println();
        }
        if(a[0][0].equals('X') && a[0][1].equals('X') && a[0][2].equals('X') ){
            System.out.println("WINNER!!!");
        }


    }

}