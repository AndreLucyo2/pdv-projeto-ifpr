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
public class Cliente
{
    private int id;
    private String nome;
    private String sobrenome;
    private Date dataNasc;
    private String CPF;
    private String RG;

    public Cliente()
    {
	
    }
    
    public Cliente(int id, String nome)
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

    public String getSobrenome()
    {
	return sobrenome;
    }

    public void setSobrenome(String sobrenome)
    {
	this.sobrenome = sobrenome;
    }

    public Date getDataNasc()
    {
	return dataNasc;
    }

    public void setDataNasc(Date dataNasc)
    {
	this.dataNasc = dataNasc;
    }

    public String getCPF()
    {
	return CPF;
    }

    public void setCPF(String CPF)
    {
	this.CPF = CPF;
    }

    public String getRG()
    {
	return RG;
    }

    public void setRG(String RG)
    {
	this.RG = RG;
    }

    @Override
    public String toString()
    {
	if (getId() == 0)
	{
	    return nome;
	}		
	return nome + " | CPF= " + CPF;
    }
       

}
