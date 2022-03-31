package br.inatel.cdg.nave;

import br.inatel.cdg.alvo.Bloco;

public class Jogador {
    
    private int ponto;


    public int getPonto() {
        return ponto;
    }

    public void destruir(){
        int nBlocos = Bloco.getNumBlocos();
        Bloco.setNumBlocos(--nBlocos);
        ponto++;
    }


}
