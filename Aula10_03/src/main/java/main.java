public class Main {

    public static void main(String[] args){

        Kart  kart1 = new Kart();
        Kart  kart2 = new Kart();

        kart1.nome = "kart1";
        kart2.nome = "kart2";

        kart1.motor.velocidadeMaxima = 120;
        kart1.motor.cilindradas = "1200";

        kart2.motor.velocidadeMaxima = 90;
        kart2.motor.cilindradas = "900";


        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();

        piloto1.nome = "piloto 1";
        piloto2.nome = "piloto 2";

        

        piloto1.soltaSuperPoder();
        piloto2.soltaSuperPoder();

        kart1.fazerDrift();
        kart2.fazerDrift();
        

        kart1.motor.mostraInfo();


        
    }
    


}
