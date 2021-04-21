/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Andre
 */
public class Produto
{
    private int id;
    private String nome;
    private String descricao;
    private String marca;
    private Date dataValidade;

    public Produto()
    {
    }

    public Produto(int id, String nome)
    {
	this.id = id;
	this.nome = nome;
    }      

    public int getId()
    {
	return id;
    }

    public void setId(int id)
    {
	this.id = id;
    }

    public String getNome()
    {
	return nome;
    }

    public void setNome(String nome)
    {
	this.nome = nome;
    }
    
        public String getDescricao()
    {
	return descricao;
    }

    public void setDescricao(String descricao)
    {
	this.descricao = descricao;
    }

    public String getMarca()
    {
	return marca;
    }

    public void setMarca(String marca)
    {
	this.marca = marca;
    }

    public Date getDataValidade()
    {
	return dataValidade;
    }

    public void setDataValidade(Date dataValidade)
    {
	this.dataValidade = dataValidade;
    }

   
    @Override
    public String toString()
    {
	if (getId() == 0)
	{
	    return nome;
	}
	return nome + " | Marca= " + marca + " | DataValidade=" + dataValidade;
    }
    
    
    
}
