/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import bdFake.TbCliente;
import java.util.ArrayList;
import modelo.Cliente;

/**
 *
 * @author Andre
 */
public class FacadeCliente 
{
    private TbCliente listaClientes = TbCliente.getInstancia();
    
    public void inserirCliente(Cliente obj) 
    {
       listaClientes.getListaClientes().add(obj); 
    }
    
    public void removerCliente(int id) 
    {
        for (Cliente obj : listaClientes.getListaClientes()) {
            if (obj.getId() == id) {
                listaClientes.getListaClientes().remove(obj); 
                return;
            }
        }                
    }
    
    public ArrayList<Cliente> pesquisarClientePorNome(String txtPesquisa)  
    {
        ArrayList<Cliente> resultado = new ArrayList<>();
        
        for (Cliente obj : listaClientes.getListaClientes()) {
            if (obj.getNome().contains(txtPesquisa) || obj.getSobrenome().contains(txtPesquisa)) {
                resultado.add(obj); 
            }
        }
        
        return resultado;
    }
    
    public void getCliente(int id) 
    {
        listaClientes.getListaClientes().get(id);
    }
    
    public ArrayList<Cliente> getTodosClientes() 
    {
        return listaClientes.getListaClientes();
    }
}
