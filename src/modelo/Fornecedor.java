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
public class Fornecedor
{
    private int id;
    private String razao;
    private String fantasia;
    private String cnpj; 

    public int getId()
    {
	return id;
    }

    public void setId(int id)
    {
	this.id = id;
    }

    public String getRazao()
    {
	return razao;
    }

    public void setRazao(String razao)
    {
	this.razao = razao;
    }

    public String getFantasia()
    {
	return fantasia;
    }

    public void setFantasia(String fantasia)
    {
	this.fantasia = fantasia;
    }

    public String getCnpj()
    {
	return cnpj;
    }

    public void setCnpj(String cnpj)
    {
	this.cnpj = cnpj;
    }

    @Override
    public String toString()
    {
	return id + " | Razao=" + razao + " | Cnpj=" + cnpj ;
    }
    
    
}
