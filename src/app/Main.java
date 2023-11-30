/*
Лотерейний квиток має чотири рядки та
чотири стовпчики різних цілочисельних позитивних чисел.
Одне число - є вигришним.
Створіть двовимірний масив цих чисел.
Реалізуйте функціонал пошуку виграшного числа
шляхом введення через Scanner.
**/

package app;

import java.util.Scanner;

public class Main {

    static int[][] tickets;
    static int search;
    final static int numberWIN = 77;

    public static void main(String[] args) {

        tickets = new int[][]{{30, 12, 41, 50}, {37, 14, 18, 47}, {24, 11, 77, 15}, {17, 23, 34, 55}};

        System.out.println("Ticket numbers: ");

        for (int i = 0; i < tickets.length; i += 1) {
            for (int j = 0; j < tickets[i].length; j += 1) {
                System.out.print(tickets[i][j] + " ");
            }
            System.out.println();
        }
        Scanner ticketScanner = new Scanner(System.in);
        System.out.print("**************************");
        System.out.print("\nEnter searching number: ");
        search = ticketScanner.nextInt();

        int count = 0;
        for (int[] ticket : tickets) {
            for (int num : ticket) {
                if (search != numberWIN) {
                    count++;
                }
            }
        }
        if (count > 0) {
            System.out.println("TRY AGAIN :(");
        } else {
            System.out.println("THIS NUMBER IS WON!!!");
        }
    }
}