/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import bdFake.TbFornecedor;
import java.util.ArrayList;
import modelo.Fornecedor;

/**
 *
 * @author Andre
 */
public class FacadeFornecedor 
{
    private TbFornecedor listaFornecedores = TbFornecedor.getInstancia();
    
    public void inserirFornecedor(Fornecedor obj) 
    {
       listaFornecedores.getListaFornecedores().add(obj); 
    }
    
    public void removerFornecedor(int id) 
    {
        for (Fornecedor obj : listaFornecedores.getListaFornecedores()) 
	{
            if (obj.getId() == id) 
	    {
                listaFornecedores.getListaFornecedores().remove(obj); 
                return;
            } 
        }                
    }
    
    public ArrayList<Fornecedor> pesquisarFornecedorPorRazao(String txtPesquisa) 
    {
        ArrayList<Fornecedor> resultado = new ArrayList<>();
        
        for (Fornecedor obj : listaFornecedores.getListaFornecedores())   
	{
            if (obj.getRazao().contains(txtPesquisa) || obj.getFantasia().contains(txtPesquisa)) {
                resultado.add(obj);
            }
        }         
        return resultado; 
    }
    
    public void getFornecedor(int id) 
    {
        listaFornecedores.getListaFornecedores().get(id);
    }
    
    public ArrayList<Fornecedor> getTodosFornecedores() 
    {
        return listaFornecedores.getListaFornecedores();
    }
}
