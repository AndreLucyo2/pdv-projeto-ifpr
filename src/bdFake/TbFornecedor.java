/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdFake;

import java.util.ArrayList;
import modelo.Fornecedor;

/**
 *
 * @author Andre
 */
public class TbFornecedor
{
    private ArrayList<Fornecedor> listaFornecedor = new ArrayList<>();    
    private static TbFornecedor instancia;
    
    //Singleton: contrutor privado
    private TbFornecedor()
    {
    }
    
    public static synchronized TbFornecedor getInstancia() 
    {
        if (instancia == null) 
	{
            instancia = new TbFornecedor();
        }        
        return instancia;
    }        
         
    public ArrayList<Fornecedor> getListaFornecedores() 
    {
        return listaFornecedor;
    }  
}
