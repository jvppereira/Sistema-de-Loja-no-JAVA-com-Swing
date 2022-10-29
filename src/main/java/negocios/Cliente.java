/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocios;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
/**
 *av
 * @author Joao
 */
public class Cliente implements Clientesinterf {
    
    //crindo a brincadeira, get e sets
    private String nome;
    private String senha;
    private String leitura;
    private int total;
    private String valTotal;
    private String nomepass;
    
    
    
    
    ArrayList<String> prodsprec = new ArrayList<String>();
    private ArrayList<String> prods = new ArrayList<String>();
    
    public Cliente(String nome, String senha, String leitura, int total, String valTotal, String nomepass, ArrayList<String> prods,  ArrayList<String> prodsprec) {
        this.nome = nome;
        this.senha = senha;
        this.leitura = leitura;
        this.total = total;
        this.valTotal = valTotal;
        this.nomepass = nomepass;
        this.prods = prods;
        this.prodsprec = prodsprec;
    }
    public Cliente() {
        
    }
        
    public String getLeitura() {
        return leitura;
    }
      
    public void setLeitura(String leitura) {
        this.leitura = leitura;
    }  
    
    public ArrayList<String> getProds() {
        return prods;
    }
    public ArrayList<String> getProdsPrec() {
        return prodsprec;
    }
    
    @Override
    public String getValTotal() {
        return valTotal;
    }
    public String getnomepass() {
        return nomepass;
    }
    
    public String getSenha() {
        return senha;
    }
    public int getTotal() {
        return total;
    }
    
    public String getNome() {
        return nome;
    }
    
        
    
    //setsss
    public void setProds(ArrayList<String> prods) {
        this.prods = prods;
    }   
    public void setProdprec(ArrayList<String> prodsprec) {
        this.prodsprec = prodsprec;
    }   
    public void setSenha(String senha) {
        this.senha = senha;
    }    
    public void setnomepass(String nomepass) {
        this.nomepass = nomepass;
    }
    
    public void setValTotal(String valTotal){
        
        this.valTotal = valTotal;
    }
    

    public void setNome(String nome) {
        this.nome = nome;
    }
        public void setTotal(int total) {
        this.total = total;
    }
       
    

   
        
        
    //salvar txt 
    public String salvar(){
    
        try {
            FileWriter fw = new FileWriter("cliente.txt",true); //criando e referenciando
            PrintWriter pw = new PrintWriter(fw); //escrevendo no doc
            pw.println("Nome: " + this.nome);
            pw.println("Senha: " + this.senha);
            pw.flush(); //para mandar direto pro doc
            pw.close(); 
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "cadastrado com sucesso";
        
    }
    
    //se refere a salvar no registro clientes
        public String salvar2(){
    
        try {
            FileWriter fz = new FileWriter("RelatorioClientes.txt",true); //criando e referenciando
            PrintWriter pw = new PrintWriter(fz); //escrevendo no doc
            
            pw.println("Custo Total: " + this.valTotal);
            pw.flush(); //para mandar direto pro doc
            pw.close(); 
            fz.close();
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "cadastrado com sucesso";
        
    }
        public String salvar3(){
    
        try {
            FileWriter fz = new FileWriter("RelatorioClientes.txt",true); //criando e referenciando
            PrintWriter pw = new PrintWriter(fz); //escrevendo no doc
            
            pw.println("Nome: " + this.nome);
            pw.flush(); //para mandar direto pro doc
            pw.close(); 
            fz.close();
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "cadastrado com sucesso";
        
    }

    @Override
    public void setLeitura() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setProds() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setProdprec() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setSenha() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setnomepass() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setValTotal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setNome() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setTotal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    } 

}
