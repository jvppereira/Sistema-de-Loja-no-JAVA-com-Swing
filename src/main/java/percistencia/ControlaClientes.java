/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percistencia;

import java.util.ArrayList;
import negocios.Cliente;

/**
 *
 * @author Joao
 */
public class ControlaClientes {
    
    private ArrayList<Cliente> clientes = new ArrayList<>(); 
   
    public boolean salvar1 (Cliente v){
        if (v != null){
          clientes.add(v);
          
          return true;
            } else {
               return false;
        }
    }
    
    private ArrayList<Cliente> valtotais = new ArrayList<>(); 
    
        public boolean save (Cliente x){
        if (x != null){
          valtotais.add(x);
          
          return true;
            } else {
               return false;
        }
    }
    private ArrayList<Cliente> arraypass = new ArrayList<>(); 
        public boolean savepass (Cliente j){
        if (j != null){
          arraypass.add(j);
          
          return true;
            } else {
               return false;
        }
    }
    
    
    public ArrayList<Cliente> retornarTodos (){
        return clientes;
    }
    public ArrayList<Cliente> retornarTodosPass (){
        return arraypass;
    }
    
    
    public ArrayList<Cliente> retornarTodos2 (){
        return valtotais;
    }
}
