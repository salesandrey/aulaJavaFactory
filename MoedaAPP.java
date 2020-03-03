
package moedaapp;
import java.util.Scanner;

/**
 *
 * @author andrey.sales
 */
public class MoedaAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String tipo = sc.nextLine();
        Scanner sc2 = new Scanner (System.in);
        Double value = sc2.nextDouble();
        
        System.out.print(value);
        Moeda moeda = new MoedaFactory().criarMoedas(tipo,value);
        
        moeda.mostrarMoeda();
    }
    
}
