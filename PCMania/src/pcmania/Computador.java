package pcmania;

public class Computador {
    private String marca;
    private float preco;
    private HardwareBasico[] hardwares;
    private SistemaOperacional sistema;
    private MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco) {
        this.marca = marca;
        this.preco = preco;
        this.hardwares = new HardwareBasico[3]; // processador, RAM, HD
    }

    public void addHardwareBasico(HardwareBasico hw, int index) {
        if (index >= 0 && index < hardwares.length) {
            hardwares[index] = hw;
        }
    }

    public void setSistemaOperacional(SistemaOperacional sistema) {
        this.sistema = sistema;
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }

    public float getPreco() {
        return preco;
    }

    public void mostraPCConfigs() {
        System.out.println("=== Configurações do PC ===");
        System.out.println("Marca: " + marca);
        for (HardwareBasico hw : hardwares) {
            if (hw != null) {
                System.out.println(hw.getNome() + " - " + hw.getCapacidade());
            }
        }
        if (sistema != null) {
            System.out.println("Sistema: " + sistema.getNome() + " (" + sistema.getTipo() + ")");
        }
        if (memoriaUSB != null) {
            System.out.println("USB extra: " + memoriaUSB.getNome() + " - " + memoriaUSB.getCapacidade() + "Gb");
        }
        System.out.println("Preço: R$ " + preco);
        System.out.println("===========================");
    }
}
