import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pessoa {
    
    private double peso;


    public double getPeso(){
        return peso;
    }


}
