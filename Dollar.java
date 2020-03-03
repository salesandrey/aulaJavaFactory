package moedaapp;
public class Dollar extends Moeda 
{ 
    public Dollar(Double valor)
    {
       this.character = "$";
       this.Value = 4.00 * valor;
    }
}
