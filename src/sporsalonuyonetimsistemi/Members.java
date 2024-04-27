/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sporsalonuyonetimsistemi;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author apple
 */
public class Members extends javax.swing.JFrame {

    /**
     * Creates new form Members
     */
    public Members() {
        initComponents();
        DisplayMembers();
        GetCoach();
    }

     java.sql.Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null, rs1 = null;
    Statement st = null, st1 = null;
    
    private void DisplayMembers(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SporSalonuDB", "root", "");
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM MemberTable");
            MembersTable.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e) {
            
        }
    }
    
    private void GetCoach()
    {
        try{
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SporSalonuDB", "root", "");
             st = con.createStatement();
             String Query = "Select * from CoachTable";
             rs = st.executeQuery(Query);
             while(rs.next()){
                 String CoachName = rs.getString("CName");
                 CoachCb.addItem(CoachName);
             }
            
        }catch(Exception e){
            
        }
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        MNameTb = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        AgeTb = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        PhoneTb = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        GenCb = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CoachCb = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        TimingCb = new javax.swing.JComboBox<>();
        DeleteBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MembersTable = new javax.swing.JTable();
        ServiceCb = new javax.swing.JComboBox<>();
        ClearBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Eğitmenler");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Çıkış Yap");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ödemeler");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Admin Paneli");
        jLabel14.setToolTipText("");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(14, 14, 14))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(37, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(28, 28, 28)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(36, 36, 36))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addComponent(jLabel5)
                    .addContainerGap(470, Short.MAX_VALUE)))
        );

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setText("Üye Yönetimi");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        jLabel4.setText("Üye Listesi");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel6.setText("Adı Soyadı:");

        MNameTb.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel7.setText("Yaşı:");

        AgeTb.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        AgeTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeTbActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel8.setText("Telefon Numarası:");

        PhoneTb.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel9.setText("Cinsiyeti:");

        GenCb.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        GenCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel10.setText("Paket:");

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel11.setText("Eğitmen:");

        CoachCb.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel12.setText("Antrenman Aralığı:");

        TimingCb.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        TimingCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00 - 8:00", "8:00 - 10:00", "16:00 - 18:00", "18:00 - 20:00", "20:00 - 22:00" }));

        DeleteBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        DeleteBtn.setText("SİL");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        AddBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        AddBtn.setText("EKLE");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        EditBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        EditBtn.setText("DÜZENLE");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        jLabel13.setText("Üyenin:");

        MembersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        MembersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MembersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MembersTable);

        ServiceCb.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        ServiceCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Ay - 600 TL", "3 Ay - 1500 TL", "6 Ay - 3000 TL", "12 Ay - 6500 TL" }));

        ClearBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        ClearBtn.setText("TEMİZLE");
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBtnMouseClicked(evt);
            }
        });
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(MNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addGap(60, 60, 60)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel7))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(AgeTb)
                                                        .addComponent(GenCb, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel8)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(PhoneTb, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(44, 44, 44)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(TimingCb, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel10))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(ServiceCb, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(CoachCb, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(jLabel13)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(127, 127, 127)
                                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(EditBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 24, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(MNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(ServiceCb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(GenCb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(CoachCb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(AgeTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(PhoneTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimingCb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgeTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeTbActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditBtnActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new Coachs().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new Payments().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    int MNum = 0;
    private void CountMembers(){
        try{
            st1 = con.createStatement();
            rs1 = st1.executeQuery("SELECT MAX(MId) FROM MemberTable");
            rs1.next();
            MNum = rs1.getInt(1)+1;
        }catch(Exception e) {
            
        }
    }
    
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if(MNameTb.getText().isEmpty() || PhoneTb.getText().isEmpty() || 
                AgeTb.getText().isEmpty() || ServiceCb.getSelectedIndex() == -1 || GenCb.getSelectedIndex() == -1||CoachCb.getSelectedIndex()==-1||TimingCb.getSelectedIndex()==-1)
        {
            JOptionPane.showMessageDialog(this, "Bilgileri eksik girdiniz.");
        } else {
            try{
                CountMembers();
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SporSalonuDB", "root", "");
                PreparedStatement Add = con.prepareStatement("INSERT INTO MemberTable VALUES(?,?,?,?,?,?,?,?,?)");
                Add.setInt(1, MNum);
                Add.setString(2, MNameTb.getText());
                Add.setString(3, PhoneTb.getText());
                Add.setInt(4, Integer.valueOf(AgeTb.getText()));
                Add.setString(5, ServiceCb.getSelectedItem().toString());
                Add.setBoolean(6, false);
                Add.setString(7, TimingCb.getSelectedItem().toString());
                Add.setString(8, CoachCb.getSelectedItem().toString());
                Add.setString(9, GenCb.getSelectedItem().toString());
                
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Yeni üye kaydedildi.");
                con.close();
                DisplayMembers();
            } catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
        ClearTextBoxs();
    }//GEN-LAST:event_AddBtnMouseClicked
        int Key = 0;
    private void MembersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MembersTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)MembersTable.getModel();
        int MyIndex = MembersTable.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        MNameTb.setText(model.getValueAt(MyIndex, 1).toString());
        PhoneTb.setText(model.getValueAt(MyIndex, 2).toString());
        AgeTb.setText(model.getValueAt(MyIndex, 3).toString());
        ServiceCb.setSelectedItem(model.getValueAt(MyIndex, 4).toString());
        TimingCb.setSelectedItem(model.getValueAt(MyIndex, 6).toString());
        CoachCb.setSelectedItem(model.getValueAt(MyIndex, 7).toString());
        GenCb.setSelectedItem(model.getValueAt(MyIndex, 8).toString());
    }//GEN-LAST:event_MembersTableMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
         if(Key == 0)
        {
            JOptionPane.showMessageDialog(this, "Hangi Üyenin Silineceğini Seçin ");
        }else{
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SporSalonuDB", "root", "");
                String Query ="Delete from MemberTable where MId="+Key;
                Statement Del = con.createStatement();
                Del.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Üye Silindi");
                DisplayMembers();
            }catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
                   
            }   
        }
        ClearTextBoxs();
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
         if(Key==0){
             JOptionPane.showMessageDialog(this, "Üye Seçiniz.");
        }else{
            try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SporSalonuDB", "root", "");
                String Query ="Update MemberTable set MName=?,MPhone=?,MAge=?,MPackage=?,MPay=?,MTiming=?,MCoach=?,MGender=? where MId=?";
                PreparedStatement Add= con.prepareStatement(Query);
                Add.setInt(8, Key);
                Add.setString(1,MNameTb.getText());
                Add.setString(2,PhoneTb.getText());
                Add.setInt(3, Integer.valueOf(AgeTb.getText()));
                Add.setString(4, ServiceCb.getSelectedItem().toString());
                Add.setString(6, TimingCb.getSelectedItem().toString());
                Add.setString(7, CoachCb.getSelectedItem().toString());
                Add.setString(8, GenCb.getSelectedItem().toString());
                
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Üye Düzenlendi.");
               
                con.close();
                DisplayMembers();
                
            }catch(Exception e){
                
            }
        }
        ClearTextBoxs();
    }//GEN-LAST:event_EditBtnMouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        new AdminPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
        ClearTextBoxs();
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void ClearTextBoxs(){
        MNameTb.setText("");
        AgeTb.setText("");
        PhoneTb.setText("");
    }
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
            java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Members().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField AgeTb;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JComboBox<String> CoachCb;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JComboBox<String> GenCb;
    private javax.swing.JTextField MNameTb;
    private javax.swing.JTable MembersTable;
    private javax.swing.JTextField PhoneTb;
    private javax.swing.JComboBox<String> ServiceCb;
    private javax.swing.JComboBox<String> TimingCb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
