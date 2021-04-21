/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdFake;

import java.util.ArrayList;
import modelo.Cliente;

/**
 *
 * @author Andre
 */
public class TbCliente
{
    private ArrayList<Cliente> listaClientes = new ArrayList<>();    
    private static TbCliente instancia;
    
    //Singleton: contrutor privado
    private TbCliente()
    {
    }
    
    public static synchronized TbCliente getInstancia() 
    {
        if (instancia == null) 
	{
            instancia = new TbCliente();
        }        
        return instancia;
    }        
         
    public ArrayList<Cliente> getListaClientes() 
    {
        return listaClientes;
    }    
}
