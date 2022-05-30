package br.inatel.cdg.gerencia;

import java.util.HashMap;

import br.inatel.cdg.exeptions.NotaInsuficienteException;
import br.inatel.cdg.projetos.Projeto;

public class GerenciaFETIN {

    //crie um Map(HashMap)
    HashMap<String, Double> projetos = new HashMap<String, Double>();

    public void addProjeto(Projeto projetoFetin){
        try{
            projetos.put(projetoFetin.getTitulo(), projetoFetin.getPontuacao());
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
    //para guardar informações referentes a projetos da FETIN e suas respec-tivas notas.
    public void listaProjetos() {
        projetos.forEach((titulo, pontuacao) -> {
            try{
                if(pontuacao >= 60.00){
                    System.out.println("Título: " + titulo + " - pontuação: " + pontuacao);
                } else{
                    throw new NotaInsuficienteException("A nota do seu projeto não é suficiente");
                }
            } catch (NotaInsuficienteException e){
                System.out.println(e.getMessage());
            }
        });
    }
    
}
