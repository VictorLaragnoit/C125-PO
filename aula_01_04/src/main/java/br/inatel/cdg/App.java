package br.inatel.cdg;

import br.inatel.cdg.banda.Banda;
import br.inatel.cdg.empresario.Empresario;
import br.inatel.cdg.membro.Membro;
import br.inatel.cdg.musica.Musica;
public class App 
{
    public static void main( String[] args )
    {
        Membro membro1 = new Membro("Victor", "pianista");
        Membro membro2 = new Membro("Pedro", "baterista");
        Membro membro3 = new Membro("Ray", "guitarrista");
        Membro membro4 = new Membro("Jorge", "vocalista");
        Banda banda = new Banda("inatel", "rock");

        Musica musica1 = new Musica("eletroMags", 3.70);
        Musica musica2 = new Musica("JavaSongPlay", 2.50);

        Empresario empresario1 = new Empresario("Chris", 124432353);

        banda.setEmpresario(empresario1);
        //Adicionando Musicas
        banda.addMusicaNova(musica1);
        banda.addMusicaNova(musica2);
        //Adicionando Membros
        banda.addMembroNovo(membro1);
        banda.addMembroNovo(membro2);
        banda.addMembroNovo(membro3);
        banda.addMembroNovo(membro4);

        banda.mostraInfo();


    }
}
