/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import bdFake.TbVenda;
import java.util.ArrayList;
import modelo.Venda;

/**
 *
 * @author Andre
 */
public class FacadeVenda 
{
    private TbVenda listaVendas = TbVenda.getInstancia();
    
    public void inserirVenda(Venda obj) 
    {
       listaVendas.getListaVendas().add(obj);
    }
    
    public void removerVenda(int id) 
    {
        for (Venda obj : listaVendas.getListaVendas()) 
	{
            if (obj.getId() == id) 
	    {
                listaVendas.getListaVendas().remove(obj); 
                return;
            }
        }                
    }
    
    public ArrayList<Venda> pesquisarVenda(String txtPesquisa) 
    {
        ArrayList<Venda> resultado = new ArrayList<>();
        
        for (Venda obj : listaVendas.getListaVendas())  
	{
            if (obj.getCliente().getNome().contains(txtPesquisa) || 
		    obj.getCliente().getSobrenome().contains(txtPesquisa) ||
		    obj.getProduto().getNome().contains(txtPesquisa)) 
	    {
                resultado.add(obj);
            }
        }         
        return resultado;
    }
    
    public void getVenda(int id) 
    {
        listaVendas.getListaVendas().get(id);
    }
    
    public ArrayList<Venda> getTodasVendas() 
    {
        return listaVendas.getListaVendas();
    }
}
