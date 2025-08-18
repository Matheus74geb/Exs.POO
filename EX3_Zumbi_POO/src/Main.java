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
        zumbi2.vida = 200;

        zumbi=zumbi2;
        zumbi2.vida = 320;

        zumbi2.seAlimentar();
        zumbi2.seAlimentar();

        System.out.print(zumbi.vida);
    }
}
