public class Main {
    public Main(){}

    public static void main(String[] arg){
    Personagem personagem1 =new Personagem();
    Arma arma1 = new Arma();

    arma1.nome = "Panela";
    personagem1.nome = "Luis";

    personagem1.tomarDano();
    personagem1.usarArma(arma1.resistencia,arma1.nome);







    }


}