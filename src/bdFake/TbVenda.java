/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdFake;

import java.util.ArrayList;
import modelo.Venda;

/**
 *
 * @author Andre
 */
public class TbVenda
{
    private ArrayList<Venda> listaVenda = new ArrayList<>();    
    private static TbVenda instancia;
    
    //Singleton: contrutor privado
    private TbVenda()
    {
    }
    
    public static synchronized TbVenda getInstancia() 
    {
        if (instancia == null) 
	{
            instancia = new TbVenda();
        }        
        return instancia;
    }        
         
    public ArrayList<Venda> getListaVendas() 
    {
        return listaVenda;
    } 
}
