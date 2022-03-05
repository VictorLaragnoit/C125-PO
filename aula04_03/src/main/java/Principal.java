public class Principal {
    public static void main(String[] args) {
        Conta c = new Conta();

        c.depositar(500);
        System.out.println(c.getSaldo());
    }
    
}
