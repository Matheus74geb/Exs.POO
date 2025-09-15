import pcmania.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 🔹 Defina sua matrícula aqui:
        int matricula = 1234; // <<< TROQUE PELA SUA

        // Promoção 1
        Computador promo1 = new Computador("Apple", matricula);
        promo1.addHardwareBasico(new HardwareBasico("Pentium Core i3", 2200), 0);
        promo1.addHardwareBasico(new HardwareBasico("Memória RAM", 8), 1);
        promo1.addHardwareBasico(new HardwareBasico("HD", 500), 2);
        promo1.setSistemaOperacional(new SistemaOperacional("macOS Sequoia", 64));
        promo1.addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));

        // Promoção 2
        Computador promo2 = new Computador("Samsung", matricula + 1234);
        promo2.addHardwareBasico(new HardwareBasico("Pentium Core i5", 3370), 0);
        promo2.addHardwareBasico(new HardwareBasico("Memória RAM", 16), 1);
        promo2.addHardwareBasico(new HardwareBasico("HD", 1000), 2);
        promo2.setSistemaOperacional(new SistemaOperacional("Windows 8", 64));
        promo2.addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));

        // Promoção 3
        Computador promo3 = new Computador("Dell", matricula + 5678);
        promo3.addHardwareBasico(new HardwareBasico("Pentium Core i7", 4500), 0);
        promo3.addHardwareBasico(new HardwareBasico("Memória RAM", 32), 1);
        promo3.addHardwareBasico(new HardwareBasico("HD", 2000), 2);
        promo3.setSistemaOperacional(new SistemaOperacional("Windows 10", 64));
        promo3.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));

        // Cliente
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite seu CPF: ");
        String cpf = sc.nextLine();
        Cliente cliente = new Cliente(nome, cpf);

        int opcao;
        do {
            System.out.println("\nEscolha uma promoção (1,2,3) ou 0 para sair:");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1 -> cliente.adicionarComputador(promo1);
                case 2 -> cliente.adicionarComputador(promo2);
                case 3 -> cliente.adicionarComputador(promo3);
                case 0 -> System.out.println("Finalizando compras...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        cliente.mostrarInfo();
        sc.close();
    }
}
