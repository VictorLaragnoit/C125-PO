package br.inatel.cdg.empresario;

public class Empresario {
    private String nome;
    private long cnpj;

    public Empresario(String nome, long cnpj){
        this.setNome(nome);
        this.setCnpj(cnpj);
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    
    
}
