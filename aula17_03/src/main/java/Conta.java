public class Conta {
    
    private int saldo = 20000;
    private int limite = 50000;
    private String nome;


    private boolean verificaSerasa(int quantidade){
        if(limite > quantidade){
            return true;
        }
        else{
            return false;
        }
    }


    void saca (int quantidade){
       if(verificaSerasa(quantidade)){
        if(saldo >= quantidade){
            saldo -= quantidade;
            System.out.println("Saque realizado com sucesso");
        }
        else{
            System.out.println("Saque não realizado");
        }
       }
       else{
           System.out.println("Cliente tem nome sujo!!!");
       }
    }
}
