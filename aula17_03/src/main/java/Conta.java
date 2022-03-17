public class Conta {
    
    private int saldo = 90;
    private int limite = 100;
    private String nome;


    

    public int getSaldo() {
        return saldo;
    }




    public int getLimite() {
        return limite;
    }


    public void setLimite(int limite) {
        this.limite = limite;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


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
