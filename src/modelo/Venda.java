/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Andre
 */
public class Venda
{
    private int id;
    private Cliente cliente;
    private Produto produto;

    public int getId()
    {
	return id;
    }

    public void setId(int id)
    {
	this.id = id;
    }

    public Cliente getCliente()
    {
	return cliente;
    }

    public void setCliente(Cliente cliente)
    {
	this.cliente = cliente;
    }

    public Produto getProduto()
    {
	return produto;
    }

    public void setProduto(Produto produto)
    {
	this.produto = produto;
    }


    @Override
    public String toString()
    {
	return id + "cliente = " + cliente.getNome() + " | produto = " + produto.getNome();
    }
    
    
}
