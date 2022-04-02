package br.inatel.cdg.banda;
import br.inatel.cdg.empresario.Empresario;
import br.inatel.cdg.musica.Musica;
import br.inatel.cdg.membro.Membro;

public class Banda {

    private String nome;
    private String genero;
    private Empresario empresario;
    private Musica[] musicas;
    private Membro[] membros;

    public Banda(String nome, String genero){
        this.nome = nome;
        this.genero = genero;
    	musicas = new Musica[5]; //Definindo o tamanho dentro do construtor
        membros = new Membro[5];
    }
    public void setEmpresario(Empresario empresario) {
        this.empresario = empresario;
    }
    public void addMusicaNova(Musica novaMusica){
        for(int i = 0; i < musicas.length; i++){//Varrendo o vetor de musicas
            if(musicas[i] == null){//Verifica se não existe musica
                musicas[i] = novaMusica;
                break; //Adiciona e sai do metodo
            }
        }
    }
    public void addMembroNovo(Membro novoMembro){
        for(int i = 0; i < membros.length; i++){
            if(membros[i] == null){
                membros[i] = novoMembro;
                break;
            }
        }

    }
    
    public void mostraInfo(){
        System.out.println("A Banda: " + this.nome + " possui os seguintes membros:");
        for (Membro membro : membros) {
            if(membro != null)//Verifica se existe membro antes de imprimir
                System.out.println(membro.getNome());
        }
    }
}
