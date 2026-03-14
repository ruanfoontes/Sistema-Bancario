public class Conta {

   private String titular;
   private double saldo;
   private int extrato;

     //Método Construtor
    public Conta(String titular) {
        this.titular = titular;
        this.saldo = 0;
        this.extrato = 0;
    }
          //Método de depósito
    public void depositar(double valor) {
        saldo += valor;
    }
    // Método saque
    public void sacar(double valor){
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }
    //método ver saldo
    public double getsaldo() {
        return saldo;
    }

}

