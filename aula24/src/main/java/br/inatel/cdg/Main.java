package br.inatel.cdg;

import br.inatel.cdg.alvo.Bloco;
import br.inatel.cdg.nave.Jogador;

public class Main {
    public static void main( String[] args )
    {
        Bloco bloco1 = new Bloco();
        Bloco bloco2 = new Bloco();

        System.out.println("Blocos em jogo: " + Bloco.getNumBlocos());

        Jogador jogador = new Jogador();
        jogador.destruir();

        System.out.println("Blocos em jogo: " + Bloco.getNumBlocos());
        System.out.println("Pontos do jogador: " + jogador.getPonto());

        jogador.destruir();

        System.out.println("Blocos em jogo: " + Bloco.getNumBlocos());
        System.out.println("Pontos do jogador: " + jogador.getPonto());
    }
}
