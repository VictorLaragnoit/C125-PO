package br.inatel.cdg.jogador;

import br.inatel.cdg.inimigo.Asteroide;

public class Nave {

    private String nome;
    private double vida;
    private String tipoTiro;

    private void setNome(String nome){
        this.nome = nome;
    }
    public Nave(String nome, double vida, String tipoTiro) {
        setNome(nome);
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public void atirar(Asteroide ast){
        if(ast.getTipoAsteroide() == "Explosivo"){ //// ou if(tipoAsteroide.equals("Explosivo")) {}
            ast.destruir();

        }else {
            if(ast.getTipoAsteroide().equals("Grande")){

                System.out.println("Nave do tiro normal nao destroi asteroide grande");


        }else {
            ast.destruir();

        }
    }


    }

    
    
}
