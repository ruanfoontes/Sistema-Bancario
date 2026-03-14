import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Conta conta = new Conta("Cliente");

        while (true) {
            System.out.println("\n=== SISTEMA BANCÁRIO ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Ver extrato");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Valor para Depositar: ");
                    double deposito = scanner.nextDouble();

                    conta.depositar(deposito);

                    break;

                case 2:
                    System.out.print("Valor para Sacar: ");
                    double saque = scanner.nextDouble();

                    conta.sacar(saque);
                    break;

                case 3:
                    System.out.println("Saldo: " + conta.getsaldo());
                    break;

                case 4:
                    conta.mostrarExtrato();
                    break;

                case 0:
                    System.out.println("Saindo do Sistema...");
                    return;
            }
        }
    }
}
