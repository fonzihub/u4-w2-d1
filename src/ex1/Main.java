package ex1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] array = {3, 5, 7, 9, 1};
        System.out.println(Arrays.toString(array));

        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci un numero");
        int input = scan.nextInt();
        System.out.println("inserisci la posizione");
        int position = scan.nextInt();

        while (input != 0) {
            if (position < 0 || position >= array.length) {
                System.out.println("posizione non valida");
            } else {
                array[position] = input;
                System.out.println("array aggiornato: " + Arrays.toString(array));
            }

            System.out.println("inserisci un numero, 0 per uscire");
            input = scan.nextInt();

            if (input != 0) {
                System.out.println("inserisci la posizione");
                position = scan.nextInt();
            }
        }

        System.out.println("Programma terminato.");
        scan.close();


    }


}
