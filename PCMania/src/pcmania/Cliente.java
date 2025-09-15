package pcmania;

public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] computadores;
    private int qtdComputadores;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[10]; // cliente pode comprar até 10 PCs
        this.qtdComputadores = 0;
    }

    public void adicionarComputador(Computador pc) {
        if (qtdComputadores < computadores.length) {
            computadores[qtdComputadores] = pc;
            qtdComputadores++;
        } else {
            System.out.println("Limite de computadores atingido!");
        }
    }

    public float calculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < qtdComputadores; i++) {
            total += computadores[i].getPreco();
        }
        return total;
    }

    public void mostrarInfo() {
        System.out.println("Cliente: " + nome + " | CPF: " + cpf);
        System.out.println("Computadores adquiridos:");
        for (int i = 0; i < qtdComputadores; i++) {
            computadores[i].mostraPCConfigs();
        }
        System.out.println("Valor total da compra: R$ " + calculaTotalCompra());
    }
}
