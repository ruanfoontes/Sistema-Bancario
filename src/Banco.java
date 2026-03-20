import java.util.ArrayList;

public class Banco {
    private ArrayList<Conta> contas;  //Lista de Objetos do tipo conta

    public Banco () {
        contas = new ArrayList<>();
    }
    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }
    public String getTitular() {
        return titular;
    }
    public Conta buscarConta(String nome) {
        for (Conta conta : contas) {
            if (conta.getTitular().equals(nome)) {
                return conta;
            }
        }
        return null;
    }
}
