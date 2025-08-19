public class Main {
    public Main(){}

    public static void main(String[] arg){
        Kart kart = new Kart();
        Kart kart2 = new Kart();


        Piloto piloto = new Piloto();
        Piloto piloto2 = new Piloto();

        piloto.nome = "Mario";
        piloto2.nome = "Luid";

        kart.motor.cilindradas = "50";
        kart.motor.velocidadeMaxima = 100.0f;
        kart2.motor.cilindradas = "150";
        kart2.motor.velocidadeMaxima = 150.0f;

        kart.nome = "Kart Preto";
        kart.piloto = piloto;
        kart2.nome = "Karte Vermelho";
        kart2.piloto = piloto2;

        piloto.soltaSuperPoder();
        kart.soltarTurbo();
        kart2.fazerDrift();
        kart.motor.mostraInfo();
        kart2.motor.mostraInfo();





    }
}