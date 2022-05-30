package br.inatel.cdg.projetos;

public class Projeto {

    private String titulo;
    private double pontuacao;
    public Projeto(String titulo, double pontuacao) {
        this.titulo = titulo;
        this.pontuacao = pontuacao;
    }
    public double getPontuacao() {
        return pontuacao;
    }
    public String getTitulo() {
        return titulo;
    }

    

    
    
}
