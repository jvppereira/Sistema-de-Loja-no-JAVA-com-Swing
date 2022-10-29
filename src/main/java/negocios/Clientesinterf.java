/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocios;
import java.util.ArrayList;
/**
 *
 * @author Joao
 */
public interface Clientesinterf {
    
    public String getLeitura();
      
    public void setLeitura();
    
    public ArrayList<String> getProds();
        
    public ArrayList<String> getProdsPrec();
         
    public String getValTotal();
       
    public String getnomepass();

    public String getSenha();
    
    public int getTotal(); 
         
    public String getNome(); 
    
    //sets
    public void setProds(); 
   
    public void setProdprec(); 
           
    public void setSenha(); 
        
    public void setnomepass(); 
       
    public void setValTotal();
        
    public void setNome();
        
     public void setTotal();     
    
    //salvar txt 
    public String salvar();
    
    //se refere a salvar no registro clientes
    public String salvar2();

    public String salvar3();
}
        
    

