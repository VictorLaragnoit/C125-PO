package br.inatel.cdg;

// import utils for java
import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import main.java.br.inatel.cdg.Cookie;

// main 
public class App {
    public static void main(String[] args) {
        
        // input from keyboard
        Scanner scan = new Scanner(System.in);
        
        // array para os nomes
        ArrayList<String> nomes = new ArrayList<>();
        String nome;

        // array para os cookies
        ArrayList<Cookie> lista = new ArrayList<>();

        for (int i=0; i<6; i++){
            System.out.println("Por favor insira o " + (i+1) + "° nome: ");
            nome = scan.nextLine();
            nomes.add(nome);
        }


        // add os nomes e os precos  dos cookies na lista
        Cookie cookieChoco1 = new CookieChoco();
        cookieChoco1.nome = nomes.get(0);
        cookieChoco1.preco = new Random().nextDouble()*100;
        lista.add(cookieChoco1);

        Cookie cookieChoco2 = new CookieChoco();
        cookieChoco2.nome = nomes.get(1);
        cookieChoco2.preco = new Random().nextDouble()*100;
        lista.add(cookieChoco2);

        Cookie cookieNutella1 = new CookieNutella();
        cookieNutella1.nome = nomes.get(2);
        cookieNutella1.preco = new Random().nextDouble()*100;
        lista.add(cookieNutella1);

        Cookie cookieNutella2 = new CookieNutella();
        cookieNutella1.nome = nomes.get(3);
        cookieNutella1.preco = new Random().nextDouble()*100;
        lista.add(cookieNutella2);

        Cookie cookieVanila1 = new CookieVanila();
        cookieVanila1.nome = nomes.get(4);
        cookieVanila1.preco = new Random().nextDouble()*100;
        lista.add(cookieVanila1);

        Cookie cookieVanila2 = new CookieVanila();
        cookieVanila1.nome = nomes.get(5);
        cookieVanila1.preco = new Random().nextDouble()*100;
        lista.add(cookieVanila2);

        // mosntrando a lista antes da ordenação
        System.out.println("Lista antes de ordernar");
        System.out.println(" ");
        for(Cookie value: lista){
            System.out.println("Nome: " + value.nome);
            System.out.println("Preco: " + value.preco);
        }

        // mostrando a lista depois de arrumada/ordenada

        Collections.sort(lista);

        System.out.println("Lista depois de ordernar");
        System.out.println(" ");
        for(Cookie cookie: lista){
            System.out.println("Nome: " + value.nome);
            System.out.println("Preco: " + value.preco);
        }

        scan.close();
    }
}
