public class Main {
    public Main(){}

    public static void main(String[] arg){
        Kart kart = new Kart();
        Kart kart2 = new Kart();

        Motor motor = new Motor();
        Motor motor2 = new Motor();

        Piloto piloto = new Piloto();
        Piloto piloto2 = new Piloto();

        piloto.nome = "Mario";
        piloto2.nome = "Luid";

        motor.cilindradas = "50";
        motor.velocidadeMaxima = 100.0f;
        motor2.cilindradas = "150";
        motor2.velocidadeMaxima = 150.0f;

        kart.nome = "Kart Preto";
        kart.piloto = piloto;
        kart.motor = motor;
        kart2.nome = "Karte Vermelho";
        kart2.piloto = piloto2;
        kart2.motor = motor2;

        piloto.soltaSuperPoder();
        kart.soltarTurbo();
        kart2.fazerDrift();
        motor.mostraInfo();
        motor2.mostraInfo();





    }
}