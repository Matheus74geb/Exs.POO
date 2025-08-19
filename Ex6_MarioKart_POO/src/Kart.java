public class Kart {
    String nome;
    Motor motor;
    Piloto piloto;

    public Kart() {
        motor = new Motor();
    }

    void pular(){
        System.out.println(nome + " Pulou!");
    }
    void soltarTurbo(){
        System.out.println("Turbo usado no kart " + nome);
    }

    void fazerDrift(){
        System.out.println("Drift realizado no kart " + nome);
    }
}
