package br.inatel.cdg.membro;

public class Membro {
    
    private String nome;
    private String funcao;
    public Membro(String nome, String funcao){
        this.setNome(nome);
        this.setFuncao(funcao);
    }
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    


}
