//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Zumbi zumbi = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi.nome = "Cris";
        zumbi2.nome = "Christopher";

        zumbi.vida = 100;
        zumbi2.vida = 100;

        zumbi.transferirVida();
        zumbi2.transferirVida();

        System.out.println(zumbi.vida);
        System.out.println(zumbi2.vida);
    }
}
