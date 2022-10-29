/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package apresentacao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.stream.Stream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocios.Cliente;
import percistencia.ControlaClientes;

/**
 *
 * @author Joao
 */
public class DlgMostraClientes extends javax.swing.JDialog {
    
    
    
    
    ControlaClientes cc;  
    private int total;
    private int contador = 0;
    private String valTotal;
    private String nomepass;
    
    
    private int tots;
    private String qua;
     
    public DlgMostraClientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public DlgMostraClientes(java.awt.Frame parent, boolean modal, ControlaClientes cc) {
        super(parent, modal);
        this.cc = cc;
        initComponents();
        exibeinf();
        
    }
    
    private void exibeinf(){
        Cliente cliente = new Cliente();
        
        
         ArrayList<Cliente> clientes = cc.retornarTodos();
         ArrayList<Cliente> arraypass = cc.retornarTodosPass();
         
         for (int i = 0; i <arraypass.size(); i++){ 
             nomepass = arraypass.get(i).getnomepass();
             nomeuser.setText(arraypass.get(i).getnomepass());
             
         }
         
         
         
         

        //para ter o valor que o cliente gastou quando entrar novamente
        
        
        
        
        for (int o = 0; o <clientes.size(); o++){

            String d = clientes.get(o).getNome();

            if (nomeuser.getText().equals(d)){
                
                txtpreco1.setText(clientes.get(o).getValTotal());
                
                for(int f = 0; f < clientes.get(o).getProds().size() ;f++){
                       
                        
                        DefaultTableModel dtmProdutos = (DefaultTableModel) TblClientes.getModel();
                        Object[] dados = {clientes.get(o).getProds().get(f),clientes.get(o).getProdsPrec().get(f)};
                        dtmProdutos.addRow(dados);
                }
            }
        }
        //usando stream
        Stream<Cliente> stream = clientes.stream().filter(c -> c.getNome() == nomeuser.getText());
        System.out.println(stream);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        qtdtexto = new javax.swing.JTextField();
        txtprod = new javax.swing.JTextField();
        txtpreco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Comprar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabelaProd = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblclientes = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        TblClientes = new javax.swing.JTable();
        txtpreco1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        relat = new javax.swing.JButton();
        btnsair4 = new javax.swing.JButton();
        btnsair3 = new javax.swing.JButton();
        btnsair2 = new javax.swing.JButton();
        nomeuser = new javax.swing.JTextField();
        finalizar1 = new javax.swing.JButton();
        buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        qtdtexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtdtextoActionPerformed(evt);
            }
        });

        txtprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprodActionPerformed(evt);
            }
        });

        txtpreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecoActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Quantidade:");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Produto:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Preço:");

        Comprar.setBackground(new java.awt.Color(204, 90, 68));
        Comprar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Comprar.setText("Adicionar ao carrinho");
        Comprar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Comprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarActionPerformed(evt);
            }
        });

        TabelaProd.setBackground(new java.awt.Color(204, 218, 234));
        TabelaProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TabelaProd.setForeground(new java.awt.Color(0, 0, 0));
        TabelaProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Pão", "5", "20"},
                {"Batata", "12", "20"},
                {"Ovo", "10", "20"},
                {"Feijão", "10", "20"},
                {"Arroz", "14", "20"},
                {"Tomate", "4", "30"},
                {"Cebola", "2", "30"},
                {"Alface", "6", "20"},
                {"Cenoura", "7", "20"},
                {"Beterraba", "8", "40"},
                {"Maça", "8", "20"},
                {"Suco", "1", "10"},
                {"Coca", "5", "10"},
                {"Nescau", "15", "10"},
                {"Picanha", "60", "4"},
                {"Frango", "30", "30"},
                {"Bacon", "30", "20"},
                {"Chocolate", "2", "20"},
                {"Balas", "14", null}
            },
            new String [] {
                "Produto", "Preco (R$)", "Quantidade"
            }
        ));
        TabelaProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaProdMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TabelaProd);

        tblclientes.setAutoCreateRowSorter(true);
        tblclientes.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tblclientes.setForeground(new java.awt.Color(0, 0, 0));
        tblclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Cliente", "CustoTotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblclientes.setEnabled(false);
        tblclientes.setRowSelectionAllowed(false);
        tblclientes.setShowGrid(true);
        jScrollPane1.setViewportView(tblclientes);
        tblclientes.getAccessibleContext().setAccessibleName("");

        TblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produtos", "Quantidade"
            }
        ));
        jScrollPane4.setViewportView(TblClientes);

        txtpreco1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpreco1ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Preço:");

        jLabel1.setBackground(new java.awt.Color(102, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Carrinho:");

        relat.setBackground(new java.awt.Color(204, 90, 68));
        relat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        relat.setText("Relatorio Clientes");
        relat.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        relat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        relat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                relatMouseClicked(evt);
            }
        });
        relat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatActionPerformed(evt);
            }
        });

        btnsair4.setBackground(new java.awt.Color(194, 139, 97));
        btnsair4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsair4.setText("Trocar usuário");
        btnsair4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsair4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsair4ActionPerformed(evt);
            }
        });

        btnsair3.setBackground(new java.awt.Color(194, 139, 97));
        btnsair3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsair3.setText("Sobre");
        btnsair3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsair3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsair3MouseClicked(evt);
            }
        });
        btnsair3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsair3ActionPerformed(evt);
            }
        });

        btnsair2.setBackground(new java.awt.Color(194, 139, 97));
        btnsair2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsair2.setText("Sair");
        btnsair2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsair2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsair2ActionPerformed(evt);
            }
        });

        nomeuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeuserActionPerformed(evt);
            }
        });

        finalizar1.setBackground(new java.awt.Color(204, 90, 68));
        finalizar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        finalizar1.setText("Finalizar compra");
        finalizar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        finalizar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        finalizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finalizar1MouseClicked(evt);
            }
        });
        finalizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizar1ActionPerformed(evt);
            }
        });

        buscar.setBackground(new java.awt.Color(204, 90, 68));
        buscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buscar.setText("Buscar Produto");
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
        });
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(qtdtexto, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtprod, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(relat, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(finalizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtpreco1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeuser, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(btnsair2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnsair3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnsair4, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(nomeuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtpreco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(qtdtexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(finalizar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(relat)
                        .addGap(29, 29, 29)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsair3)
                    .addComponent(btnsair4)
                    .addComponent(btnsair2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked

        String NomeProd = JOptionPane.showInputDialog("Digite o nome do produto: ");

        //percorre tabela
        if(NomeProd.length() > 0){
            for(int i =0; i < TabelaProd.getRowCount();i++){

                if (NomeProd.equals(TabelaProd.getValueAt(i, 0))){
                    System.out.println("deu");
                    txtprod.setText( TabelaProd.getValueAt(i,0).toString());
                    txtpreco.setText( TabelaProd.getValueAt(i,1).toString()); 

                }
            }
        }
    }//GEN-LAST:event_buscarMouseClicked

    private void finalizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finalizar1ActionPerformed

    private void finalizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalizar1MouseClicked
        // TODO add your handling code here:
        
        //para setar o valor total gasto pelo cliente
        Cliente cliente = new Cliente();

        ArrayList<Cliente> clientes = cc.retornarTodos();
        ArrayList<Cliente> valtotais = cc.retornarTodos2();

        valTotal =  txtpreco1.getText();

       
       //aqui comeca o array para salvar a lista
       for (int i = 0; i <clientes.size(); i++){ 
            
            String d = clientes.get(i).getNome();
            
            //adicionar uma collections contendo todas as rows de  prods e  prodsprec no cliente
            
            
             if (nomeuser.getText().equals(d)){
                 
                clientes.get(i).setValTotal(txtpreco1.getText());
                 
                ArrayList<String> prods = new  ArrayList();
                ArrayList<String> prodsprec = new  ArrayList();
              
                
                for(int j =0; j < TblClientes.getRowCount();j++){
                    
                System.out.println("deu");

                    prods.add( TblClientes.getValueAt(j,0).toString());
                    prodsprec.add(TblClientes.getValueAt(j,1).toString());
                    
                }

                
                clientes.get(i).setProds(prods);
                clientes.get(i).setProdprec(prodsprec);
                
                for(int f =0; f < clientes.get(i).getProds().size();f++){
                    //System.out.println(clientes.get(i).getProds().get(f));
                }
                

                
            } 
       }

        
        
        
        String nome3 = nomeuser.getText();
        tblclientes.setValueAt(nome3, 0, 0);

        tblclientes.setValueAt(valTotal, 0, 1);
        cliente.salvar2();
        //clientes.get(0).getNome()
    }//GEN-LAST:event_finalizar1MouseClicked

    private void nomeuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeuserActionPerformed

    private void btnsair2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsair2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnsair2ActionPerformed

    private void btnsair3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsair3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsair3ActionPerformed

    private void btnsair3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsair3MouseClicked
        JOptionPane.showMessageDialog(null,"Sobre: versão 1.0 // criador: João Vitor Pereia");
    }//GEN-LAST:event_btnsair3MouseClicked

    private void btnsair4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsair4ActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnsair4ActionPerformed

    private void relatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatActionPerformed

    }//GEN-LAST:event_relatActionPerformed

    private void relatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relatMouseClicked

        Relato rlt = new Relato(null, true, cc);
        rlt.setVisible(true);
    }//GEN-LAST:event_relatMouseClicked

    private void txtpreco1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpreco1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpreco1ActionPerformed

    private void TabelaProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaProdMouseClicked
        txtprod.setText( TabelaProd.getValueAt(TabelaProd.getSelectedRow(),0).toString());
        txtpreco.setText( TabelaProd.getValueAt(TabelaProd.getSelectedRow(),1).toString());
    }//GEN-LAST:event_TabelaProdMouseClicked

    private void ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarActionPerformed
        
        Cliente cliente = new Cliente();
        
     
        
      

        
        //tratamento de erros
        try{
               
                if (qtdtexto.getText().equals("ABCDEFGHIJKLMNOPKRSTUVWXYZabcdefghijklmnopqrstuvwxyz")){
                    throw new RuntimeException("For input String: '' ");
                }
               
            int qtdprod = Integer.parseInt(TabelaProd.getValueAt(TabelaProd.getSelectedRow(),2).toString());
            int totalpreco = Integer.parseInt(txtpreco.getText());
            int totalqtd = Integer.parseInt(qtdtexto.getText());
        
                 if (totalqtd >= qtdprod){
                    throw new RuntimeException("Erro, adicione um valor de quantidade menor ou igual ao estoque");
                }
                
                
                
            int novaqtd = qtdprod - totalqtd;
            int i = TabelaProd.getSelectedRow();
            TabelaProd.setValueAt(novaqtd, i, 2);

            int total1 = totalpreco * totalqtd;
     
            
                    
            // soma o valor dos produtos, quando o cliente retorna a compra o valor antigo tem que somar com os novos produtos
            ArrayList<Cliente> clientes = cc.retornarTodos();
     
                
                for (int o = 0; o <clientes.size(); o++){

                String d = clientes.get(o).getNome();

                if (nomeuser.getText().equals(d)){
                    
                      tots = clientes.get(o).getTotal();
                      
                      
                      tots = tots + total1;
                      //cliente.setTotal(tots);
                      
                      clientes.get(o).setTotal(tots);
                      
                      String total2 = "" + tots;
                      txtpreco1.setText(total2 + "R$");
             
                      System.out.println("cliente com compras");
                      
                    
                         }
                    }
            
                
                
         
            //colocando os produtos na lista front;
            
            DefaultTableModel dtmProdutos = (DefaultTableModel) TblClientes.getModel();
            Object[] dados = {txtprod.getText(),qtdtexto.getText()};
            dtmProdutos.addRow(dados);
            
            
            
            qtdtexto.setText("");
            qtdtexto.setText("");
            qtdtexto.requestFocus();
            txtprod.setText("");
            txtprod.setText("");
            txtprod.requestFocus();
            txtpreco.setText("");
            txtpreco.setText("");
            txtpreco.requestFocus();}
        
        catch (RuntimeException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        finally{
            //JOptionPane.showMessageDialog(null, "");
        }
        
    }//GEN-LAST:event_ComprarActionPerformed

    private void txtprecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecoActionPerformed

    private void txtprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprodActionPerformed
        // pegando variavel que o cliente clicar
    }//GEN-LAST:event_txtprodActionPerformed

    private void qtdtextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtdtextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtdtextoActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DlgMostraClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgMostraClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgMostraClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgMostraClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgMostraClientes dialog = new DlgMostraClientes(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Comprar;
    private javax.swing.JTable TabelaProd;
    private javax.swing.JTable TblClientes;
    private javax.swing.JButton btnsair2;
    private javax.swing.JButton btnsair3;
    private javax.swing.JButton btnsair4;
    private javax.swing.JButton buscar;
    private javax.swing.JButton finalizar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField nomeuser;
    private javax.swing.JTextField qtdtexto;
    private javax.swing.JButton relat;
    private javax.swing.JTable tblclientes;
    private javax.swing.JTextField txtpreco;
    private javax.swing.JTextField txtpreco1;
    private javax.swing.JTextField txtprod;
    // End of variables declaration//GEN-END:variables
}
