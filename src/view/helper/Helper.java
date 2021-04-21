/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.helper;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import modelo.Cliente;
import modelo.Fornecedor;
import modelo.Produto;
import view.HomeView;

/**
 *
 * @author Andre
 */
public class Helper
{
    private final HomeView view;
    public Helper(HomeView view)
    {
	this.view = view; 
    }
            
    public void setLayout(int opcao)
    {
	switch (opcao)
	{
	    case 1:
		view.lblTituloTela.setText("Cadastro de Clientes"); 
		view.jPanelCliente.setVisible(true);	
		view.jPanelProduto.setVisible(false);	
		view.jPanelFornecedor.setVisible(false);
		view.jPanelVenda.setVisible(false);		
		break;
		
	    case 2:
		view.lblTituloTela.setText("Cadastro de Produtos"); 
		view.jPanelCliente.setVisible(false);	
		view.jPanelProduto.setVisible(true);	
		view.jPanelFornecedor.setVisible(false);
		view.jPanelVenda.setVisible(false);
		break;
		
	    case 3:
		view.lblTituloTela.setText("Cadastro de Fornecedores"); 
		view.jPanelCliente.setVisible(false);	
		view.jPanelProduto.setVisible(false);	
		view.jPanelFornecedor.setVisible(true);
		view.jPanelVenda.setVisible(false);	
		break;
		
	    case 4:
		view.lblTituloTela.setText("Cadastro de Vendas");
		view.jPanelCliente.setVisible(false);	
		view.jPanelProduto.setVisible(false);	
		view.jPanelFornecedor.setVisible(false);
		view.jPanelVenda.setVisible(true);	 
		break;
		
	    default:
		view.lblTituloTela.setText("Cadastro de Clientes"); 
		view.jPanelCliente.setVisible(true);	
		view.jPanelProduto.setVisible(false);	
		view.jPanelFornecedor.setVisible(false);
		view.jPanelVenda.setVisible(false);
	}
    }
   
    public Cliente loadCliente()                                               
    {                                                   
	Cliente obj = new Cliente();
        obj.setNome(view.jtfNome.getText());
        obj.setSobrenome(view.jtfSobrenome.getText());
        obj.setRG(view.jftfRG.getText());
        obj.setCPF(view.jftfCPF.getText());
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        try 
	{
            obj.setDataNasc(sdf.parse(view.jftfDataNasc.getText()));
	    
        } catch (Exception e) 
	{
        }
	return obj;
	
    }
    
    public Produto loadProduto()                                               
    {                                                   
	Produto obj = new Produto();        
        obj.setNome(view.jtfNomeProd.getText());
        obj.setDescricao(view.jtfDescricao.getText());		
        obj.setMarca(view.jftfMarca.getText());
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");        
        try 
	{
            obj.setDataValidade(sdf.parse(view.jftfDataValidade.getText()));
	    
        } catch (Exception e) 
	{
        }
	
	return obj;
	
    }
    
    public Fornecedor loadFornecedor()                                               
    {                                                   
	Fornecedor obj = new Fornecedor();        
        obj.setRazao(view.jtfRazao.getText());
        obj.setFantasia(view.jtfFantasia.getText());
	obj.setCnpj(view.jftfCNPJ.getText());
               	
	return obj;
	
    }
    
    
    public void loadComboClientes(ArrayList<Cliente> clientes)
    {	
	DefaultComboBoxModel comboModel = (DefaultComboBoxModel) view.jComboCliente.getModel();        
        comboModel.removeAllElements();
	
	Cliente selecione = new Cliente(0, "Selecione...");
	comboModel.addElement(selecione);
	
	for (Cliente obj : clientes)
	{
	    comboModel.addElement(obj);
	}		
    } 
    
    public void loadComboProdutos(ArrayList<Produto> produtos) 
    {	
	DefaultComboBoxModel comboModel = (DefaultComboBoxModel) view.jComboProduto.getModel();        
        comboModel.removeAllElements();
	
	Produto selecione = new Produto(0, "Selecione...");
	comboModel.addElement(selecione);
	
	for (Produto obj : produtos)
	{
	    comboModel.addElement(obj);
	}		
    }
    
    
}
