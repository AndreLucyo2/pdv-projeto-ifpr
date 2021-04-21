/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdFake;

import java.util.ArrayList;
import modelo.Produto;

/**
 *
 * @author Andre
 */
public class TbProduto
{
    private ArrayList<Produto> listaProdutos = new ArrayList<>();    
    private static TbProduto instancia;
    
    //Singleton: contrutor privado
    private TbProduto()
    {
    }
    
    public static synchronized TbProduto getInstancia() 
    {
        if (instancia == null) 
	{
            instancia = new TbProduto();
        }        
        return instancia;
    }        
         
    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    } 
}
