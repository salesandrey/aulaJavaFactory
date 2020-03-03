package moedaapp;
public class Real extends Moeda
{
    public Real(Double valor)
    {
        this.character = "R$";
        this.Value = 1.00 * valor;
    }
}
