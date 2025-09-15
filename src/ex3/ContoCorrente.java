package ex3;


    public class ContoCorrente {
        private String titolare;
        private int nMovimenti;
        private final int maxMovimenti = 50;
        private double saldo;

        public ContoCorrente(String titolare, double saldo) {
            this.titolare = titolare;
            this.saldo = saldo;
            this.nMovimenti = 0;
        }

        public void preleva(double x) throws BancaException{
           double nuovoSaldo;
            if (nMovimenti < maxMovimenti) nuovoSaldo = saldo - x;
            else nuovoSaldo = saldo - x - 0.50;
            nMovimenti++;
            if(nuovoSaldo >= 0){
                this.saldo = nuovoSaldo;
            }else throw  new BancaException("non hai abbastanza soldi");
        }

        public double restituisciSaldo() {
            return saldo;
        }
    }


