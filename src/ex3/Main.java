package ex3;

public class Main {
    public static void main(String[] args) {
        try{
        ContoOnline conto = new ContoOnline("Lidia", 100, 20);
        conto.preleva(10);
        conto.stampaSaldo();
        conto.preleva(25);
        conto.stampaSaldo();
    }catch(Exception err){
            System.out.println(err.getMessage());
        }
}
