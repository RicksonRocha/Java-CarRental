
import com.mycompany.carrent.Categoria;
import com.mycompany.carrent.Cliente;
import com.mycompany.carrent.Estado;
import com.mycompany.carrent.Marca;
import com.mycompany.carrent.ModeloAutomovel;
import com.mycompany.carrent.ModeloMotocicleta;
import com.mycompany.carrent.ModeloVan;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
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
        loadComboBox();
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
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cb_marca = new javax.swing.JComboBox<>();
        cb_estado = new javax.swing.JComboBox<>();
        cb_categoria = new javax.swing.JComboBox<>();
        cb_modelo = new javax.swing.JComboBox();
        txt_valor = new javax.swing.JTextField();
        txt_placa = new javax.swing.JTextField();
        btn_inserir_veiculo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cb_tipo = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();

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

        jLabel6.setText("Incluir Novo Veículo:");

        cb_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_marcaActionPerformed(evt);
            }
        });

        cb_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_estadoActionPerformed(evt);
            }
        });

        cb_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_categoriaActionPerformed(evt);
            }
        });

        cb_modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_modeloActionPerformed(evt);
            }
        });

        txt_valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_valorActionPerformed(evt);
            }
        });

        txt_placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_placaActionPerformed(evt);
            }
        });

        btn_inserir_veiculo.setText("Inserir");
        btn_inserir_veiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inserir_veiculoActionPerformed(evt);
            }
        });

        jLabel7.setText("Marca:");

        jLabel8.setText("Categoria:");

        jLabel9.setText("Estado:");

        jLabel10.setText("Modelo:");

        jLabel11.setText("Placa:");

        jLabel12.setText("Valor:");

        cb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Automoveis", "Motocicletas", "Vans" }));
        cb_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tipoActionPerformed(evt);
            }
        });

        jLabel13.setText("Tipo:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_inserir_veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(cb_categoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(cb_marca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10))
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_valor)
                                    .addComponent(cb_modelo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cb_estado, 0, 135, Short.MAX_VALUE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(cb_tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(cb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cb_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addComponent(btn_inserir_veiculo)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void txt_placaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_placaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_placaActionPerformed

    private void btn_inserir_veiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inserir_veiculoActionPerformed
    }//GEN-LAST:event_btn_inserir_veiculoActionPerformed

    private void cb_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_marcaActionPerformed
    }//GEN-LAST:event_cb_marcaActionPerformed

    private void cb_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_categoriaActionPerformed

    }//GEN-LAST:event_cb_categoriaActionPerformed

    private void cb_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_estadoActionPerformed

    private void cb_modeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_modeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_modeloActionPerformed

    private void txt_valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_valorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_valorActionPerformed

    private void cb_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_tipoActionPerformed
        if(cb_tipo.getSelectedItem().equals("Automoveis")){
            cb_modelo.setModel(new DefaultComboBoxModel<>(ModeloAutomovel.values()));
        }
        if(cb_tipo.getSelectedItem().equals("Motocicletas")){
            cb_modelo.setModel(new DefaultComboBoxModel<>(ModeloMotocicleta.values()));
        }
        if(cb_tipo.getSelectedItem().equals("Vans")){
            cb_modelo.setModel(new DefaultComboBoxModel<>(ModeloVan.values()));
        }
    }//GEN-LAST:event_cb_tipoActionPerformed

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
    private javax.swing.JButton btn_inserir_veiculo;
    private javax.swing.JTextField c_cliente_cpf;
    private javax.swing.JTextField c_cliente_endereco;
    private javax.swing.JTextField c_cliente_nome;
    private javax.swing.JTextField c_cliente_rg;
    private javax.swing.JTextField c_cliente_sobrenome;
    private javax.swing.JComboBox<Categoria> cb_categoria;
    private javax.swing.JComboBox<Estado> cb_estado;
    private javax.swing.JComboBox<Marca> cb_marca;
    private javax.swing.JComboBox cb_modelo;
    private javax.swing.JComboBox<String> cb_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbl_clientes;
    private javax.swing.JTextField txt_placa;
    private javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables

    private void loadComboBox() {
        cb_marca.setModel(new DefaultComboBoxModel<>(Marca.values()));
        cb_estado.setModel(new DefaultComboBoxModel<>(Estado.values()));
        cb_categoria.setModel(new DefaultComboBoxModel<>(Categoria.values()));
        cb_marca.setSelectedItem(null);
        cb_estado.setSelectedItem(null);
        cb_categoria.setSelectedItem(null);
        cb_modelo.setSelectedItem(null);
    }
}
