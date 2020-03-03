/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moedaapp;

/**
 *
 * @author andrey.sales
 */
public class Euro extends Moeda 
{
    public Euro(Double valor)
    {
        this.character = "€"; 
        this.Value = 4.98 * valor;
    }
}
