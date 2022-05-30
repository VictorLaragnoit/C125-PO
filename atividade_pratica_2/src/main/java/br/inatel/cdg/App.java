package br.inatel.cdg;

import br.inatel.cdg.gerencia.GerenciaFETIN;
import br.inatel.cdg.projetos.Projeto;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Projeto projeto1 = new Projeto("Projeto 1", 76.00);
        Projeto projeto2 = new Projeto("Projeto 2", 30.00);
        Projeto projeto3 = new Projeto("Projeto 3", 88.50);
        Projeto projeto4 = new Projeto("Projeto 4", 99.00);
        GerenciaFETIN gerenciador = new GerenciaFETIN();

        projeto3 = null;

        gerenciador.addProjeto(projeto1);
        gerenciador.addProjeto(projeto2);
        gerenciador.addProjeto(projeto3);
        gerenciador.addProjeto(projeto4);

        gerenciador.listaProjetos();
        System.out.println("Fim da execução");
    }
}
