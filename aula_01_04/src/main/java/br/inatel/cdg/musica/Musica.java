package br.inatel.cdg.musica;

public class Musica {
    private String nome;
    private double duracao;

    public Musica(String nome, double duracao){
        this.setNome(nome);
        this.setDuracao(duracao);
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    
}
