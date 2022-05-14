public abstract class Cookie implements Comparable <Cookie> {

    public String nome;
    public Double preco;
    // compare function 
    public int compareWith(Cookie cookie){
        return -1*Double.compare(this.preco, cookie.preco);
    }
    
}
