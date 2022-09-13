
import com.mycompany.carrent.Cliente;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class TelaCliente extends javax.swing.JFrame {
    ArrayList<Cliente> ClienteList;
    String mode;
    
    public void LoadTableCliente(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nome","Sobrenome","RG","CPF","Endereco"},0);        
        for (int i=0;i<ClienteList.size();i++){
            Object linha[] = new Object[]{
                ClienteList.get(i).getNome(), 
                ClienteList.get(i).getSobrenome(), 
                ClienteList.get(i).getRG(),
                ClienteList.get(i).getCPF(),
                ClienteList.get(i).getEndereco(),
            }; 
            modelo.addRow(linha);
        }        
        tbl_clientes.setModel(modelo);        
    }
    
    private void setControlEnabled(){
        switch(mode){
            case "inicial" -> {                
                btn_cliente_novo.setEnabled(true);
                btn_cliente_editar.setEnabled(false);
                btn_cliente_excluir.setEnabled(false);
                
                btn_cliente_salvar.setEnabled(false);
                btn_cliente_cancelar.setEnabled(false);                
                c_cliente_nome.setEnabled(false);
                c_cliente_sobrenome.setEnabled(false);
                c_cliente_rg.setEnabled(false);
                c_cliente_cpf.setEnabled(false);
                c_cliente_endereco.setEnabled(false);
            }
                
            case "novo" -> {                
                btn_cliente_novo.setEnabled(true);
                btn_cliente_editar.setEnabled(false);
                btn_cliente_excluir.setEnabled(false);
                
                btn_cliente_salvar.setEnabled(true);
                btn_cliente_cancelar.setEnabled(true);
                c_cliente_nome.setEnabled(true);
                c_cliente_sobrenome.setEnabled(true);
                c_cliente_rg.setEnabled(true);
                c_cliente_cpf.setEnabled(true);
                c_cliente_endereco.setEnabled(true);
            }
                
            case "editar" -> {                
                btn_cliente_novo.setEnabled(true);
                btn_cliente_editar.setEnabled(true);
                btn_cliente_excluir.setEnabled(false);
                
                btn_cliente_salvar.setEnabled(true);
                btn_cliente_cancelar.setEnabled(true);
                c_cliente_nome.setEnabled(true);
                c_cliente_sobrenome.setEnabled(true);
                c_cliente_rg.setEnabled(true);
                c_cliente_cpf.setEnabled(true);
                c_cliente_endereco.setEnabled(true);
            }
                        
            case "seleção" -> {                
                btn_cliente_novo.setEnabled(true);
                btn_cliente_editar.setEnabled(true);
                btn_cliente_excluir.setEnabled(true);               
            }
            
            default -> System.out.println("Modo inválido!");
        }
    }
    
    public void limparCampos(){        
        c_cliente_nome.setText("");
        c_cliente_sobrenome.setText("");
        c_cliente_cpf.setText("");
        c_cliente_rg.setText("");
        c_cliente_endereco.setText("");
    }
    
    public TelaCliente() {
        initComponents();
        ClienteList = new ArrayList();
        mode = "inicial";
        setControlEnabled();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_clientes = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        c_cliente_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        c_cliente_sobrenome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        c_cliente_cpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        c_cliente_rg = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        c_cliente_endereco = new javax.swing.JTextField();
        btn_cliente_salvar = new javax.swing.JButton();
        btn_cliente_cancelar = new javax.swing.JButton();
        btn_cliente_novo = new javax.swing.JButton();
        btn_cliente_editar = new javax.swing.JButton();
        btn_cliente_excluir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_veiculo_teste = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Sobrenome", "RG", "CPF", "Endereco"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_clientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_clientes);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cliente"));

        jLabel1.setText("Nome:");

        c_cliente_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_cliente_nomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Sobrenome:");

        c_cliente_sobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_cliente_sobrenomeActionPerformed(evt);
            }
        });

        jLabel3.setText("CPF:");

        jLabel4.setText("RG:");

        jLabel5.setText("Endereco:");

        btn_cliente_salvar.setText("Salvar");
        btn_cliente_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cliente_salvarActionPerformed(evt);
            }
        });

        btn_cliente_cancelar.setText("Cancelar");
        btn_cliente_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cliente_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(c_cliente_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_cliente_rg))
                            .addComponent(c_cliente_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_cliente_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_cliente_endereco)
                            .addComponent(c_cliente_sobrenome)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_cliente_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(c_cliente_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(c_cliente_sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(c_cliente_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(c_cliente_rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_cliente_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cliente_salvar)
                    .addComponent(btn_cliente_cancelar))
                .addGap(16, 16, 16))
        );

        btn_cliente_novo.setText("Novo");
        btn_cliente_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cliente_novoActionPerformed(evt);
            }
        });

        btn_cliente_editar.setText("Editar");
        btn_cliente_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cliente_editarActionPerformed(evt);
            }
        });

        btn_cliente_excluir.setText("Excluir");
        btn_cliente_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cliente_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(btn_cliente_novo)
                .addGap(115, 115, 115)
                .addComponent(btn_cliente_editar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cliente_excluir)
                .addGap(97, 97, 97))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cliente_novo)
                    .addComponent(btn_cliente_editar)
                    .addComponent(btn_cliente_excluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cliente", jPanel1);

        btn_veiculo_teste.setText("Teste");
        btn_veiculo_teste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_veiculo_testeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(btn_veiculo_teste)
                .addContainerGap(349, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(btn_veiculo_teste)
                .addContainerGap(229, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Veiculo", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c_cliente_sobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_cliente_sobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_cliente_sobrenomeActionPerformed

    private void btn_cliente_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cliente_novoActionPerformed
       limparCampos();
       mode = "novo";
       setControlEnabled();
    }//GEN-LAST:event_btn_cliente_novoActionPerformed

    private void btn_cliente_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cliente_salvarActionPerformed
        if(mode.equals("novo")){  
            Cliente c = new Cliente(
                c_cliente_nome.getText(), c_cliente_sobrenome.getText(), 
                c_cliente_rg.getText(), c_cliente_cpf.getText(),
                c_cliente_endereco.getText()
            );
            ClienteList.add(c);          
        }else if(mode.equals("editar")){
            int index = tbl_clientes.getSelectedRow();          
            ClienteList.get(index).setNome(c_cliente_nome.getText());
            ClienteList.get(index).setSobrenome(c_cliente_sobrenome.getText());
            ClienteList.get(index).setRG(c_cliente_rg.getText());
            ClienteList.get(index).setCPF(c_cliente_cpf.getText());
            ClienteList.get(index).setEndereco(c_cliente_endereco.getText());
        }
                
        LoadTableCliente();  
        mode = "inicial";
        setControlEnabled();
        limparCampos();
    }//GEN-LAST:event_btn_cliente_salvarActionPerformed

    private void c_cliente_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_cliente_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_cliente_nomeActionPerformed

    private void btn_veiculo_testeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_veiculo_testeActionPerformed
        btn_veiculo_teste.setText("");
    }//GEN-LAST:event_btn_veiculo_testeActionPerformed

    private void btn_cliente_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cliente_editarActionPerformed
       mode = "editar";
       setControlEnabled();
    }//GEN-LAST:event_btn_cliente_editarActionPerformed

    private void btn_cliente_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cliente_excluirActionPerformed
        int index = tbl_clientes.getSelectedRow();
        if(index>=0 && index<ClienteList.size()){
            ClienteList.remove(index);
        }
                
        LoadTableCliente();  
        mode = "inicial";
        setControlEnabled();
    }//GEN-LAST:event_btn_cliente_excluirActionPerformed

    private void btn_cliente_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cliente_cancelarActionPerformed
        limparCampos();
        mode = "inicial";
        setControlEnabled();
    }//GEN-LAST:event_btn_cliente_cancelarActionPerformed

    private void tbl_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_clientesMouseClicked
        int index = tbl_clientes.getSelectedRow();
        if(index>=0 && index<ClienteList.size()){
            Cliente C = ClienteList.get(index);
            c_cliente_nome.setText(C.getNome());
            c_cliente_sobrenome.setText(C.getSobrenome());
            c_cliente_cpf.setText(C.getCPF());
            c_cliente_rg.setText(C.getRG());
            c_cliente_endereco.setText(C.getEndereco());
            mode = "seleção";
            setControlEnabled();
        }
    }//GEN-LAST:event_tbl_clientesMouseClicked

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cliente_cancelar;
    private javax.swing.JButton btn_cliente_editar;
    private javax.swing.JButton btn_cliente_excluir;
    private javax.swing.JButton btn_cliente_novo;
    private javax.swing.JButton btn_cliente_salvar;
    private javax.swing.JButton btn_veiculo_teste;
    private javax.swing.JTextField c_cliente_cpf;
    private javax.swing.JTextField c_cliente_endereco;
    private javax.swing.JTextField c_cliente_nome;
    private javax.swing.JTextField c_cliente_rg;
    private javax.swing.JTextField c_cliente_sobrenome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbl_clientes;
    // End of variables declaration//GEN-END:variables
}
