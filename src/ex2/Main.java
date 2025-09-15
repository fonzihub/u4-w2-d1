package ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("km percorsi?");
        int km = scan.nextInt();
        System.out.println("litri consumati?");
        int litri = scan.nextInt();


        try{
            int risultato = km / litri;
            System.out.println("km per litro: " + risultato);
        }catch(ArithmeticException ex){
            System.out.println("errore non puoi dividere per 0!");
        }

        Scanner s = new Scanner(System.in);
        System.out.println("km percorsi?");
        double km2 = s.nextDouble();
        System.out.println("litri consumati?");
        double litri2 = s.nextDouble();

        double r = km2 / litri2;
        System.out.println("risultato: " + r);

        if(Double.isInfinite(r) || Double.isNaN(r)){
            System.out.println("errore dividere per 0");
        }else{
            System.out.println("km per litro:" + r);
        }





    }
}
