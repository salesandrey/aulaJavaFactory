package moedaapp;

public abstract class Moeda 
{
    public String character;
    public Double Value;
    
    public void mostrarMoeda()
    {
        System.out.print(character + " " + Value);
    }
    
}
