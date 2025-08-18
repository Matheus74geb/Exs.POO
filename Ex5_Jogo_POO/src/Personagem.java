public class Personagem {
    int pontos = 100;
    String nome;

void tomarDano(){
    pontos-=5;
    System.out.println(nome +" perdeu -5 de vida \n"+ "HP: "+pontos);
}
    void usarArma(int resistencia,String nomeDaArma){
        resistencia-=2;
        System.out.println("Resistencia da arma "+nomeDaArma+" -2");
    }
}
