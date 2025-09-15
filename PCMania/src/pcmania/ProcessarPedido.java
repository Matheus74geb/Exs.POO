package pcmania;

public class ProcessarPedido {
    public static void enviarPedido(Computador[] pcs, int qtd) {
        System.out.println("\nPedido enviado...");
        for (int i = 0; i < qtd; i++) {
            pcs[i].mostraPCConfigs();
        }
    }
}
