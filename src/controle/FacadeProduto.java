/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import bdFake.TbProduto;
import java.util.ArrayList;
import modelo.Produto;

/**
 *
 * @author Andre
 */
public class FacadeProduto 
{
    private TbProduto listaProdutos = TbProduto.getInstancia();
    
    public void inserirProduto(Produto obj) 
    {
       listaProdutos.getListaProdutos().add(obj);
    }
    
    public void removerProduto(int id) 
    {
        for (Produto prod : listaProdutos.getListaProdutos()) 
	{
            if (prod.getId() == id) 
	    {
                listaProdutos.getListaProdutos().remove(prod); 
                return;
            }
        }                
    }
    
    public ArrayList<Produto> pesquisarProdutoPorNome(String txtPesquisa) 
    {
        ArrayList<Produto> resultado = new ArrayList<>();
        
        for (Produto prod : listaProdutos.getListaProdutos())  
	{
	    //teste:
	    //JOptionPane.showMessageDialog(null,prod.getNome());
	    
            if (prod.getNome().contains(txtPesquisa) || prod.getMarca().contains(txtPesquisa)) {
                resultado.add(prod);
            }
        }         
        return resultado;
    }
    
    public void getProduto(int id) 
    {
        listaProdutos.getListaProdutos().get(id);
    }
    
    public ArrayList<Produto> getTodosProdutos() 
    {
        return listaProdutos.getListaProdutos();
    }
}
