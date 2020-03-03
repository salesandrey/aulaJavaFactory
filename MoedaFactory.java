
package moedaapp;
public class MoedaFactory 
{
    public Moeda criarMoedas(String tipo,Double valor)
    {
        Moeda moeda = null;
        
        switch(tipo)
        {
            case "real":
                moeda = new Real(valor);
                break;
                
            case "dollar":
                moeda = new Dollar(valor);
                break;
                
             case "euro":
                moeda = new Euro(valor);
                break;
                
            case "yen":
                moeda = new Yen(valor);
                break;
        }
        
        return moeda;
    }
}
