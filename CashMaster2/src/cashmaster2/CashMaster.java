/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cashmaster2;
import config.My_config;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author user
 */
public class CashMaster extends javax.swing.JFrame {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/db_elektronik";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";

    protected static Connection connection;
    protected static PreparedStatement preparedStatement;
    protected static ResultSet resultSet;
    protected static String query;
    /**
     * Creates new form CashMaster
     */
    public CashMaster() {
        try{
            initComponents();
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        } catch (Exception e){
            e.printStackTrace();
            System.out.print("Connection Gagal");
        }
    }

    public void clear(){
        tf_nama.setText("");
        tf_harga.setText("");
        tf_jumlah.setText("");
        tf_nama.requestFocus();
    }
    
    public void insertData(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int row = jTable1.getRowCount();
        model.addRow(new Object[]{
            row+=1,
            tf_nama.getText(),
            tf_harga.getText(),
            tf_jumlah.getText()
        });
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tf_nama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tf_jumlah = new javax.swing.JTextField();
        tf_harga = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        b_tambah = new javax.swing.JButton();
        b_delete = new javax.swing.JButton();
        b_clear = new javax.swing.JButton();
        b_edit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tf_total = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        b_hitung = new javax.swing.JButton();
        b_simpan = new javax.swing.JButton();
        tf_tunai = new javax.swing.JTextField();
        tf_kembali = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(96, 108, 93));

        jLabel2.setFont(new java.awt.Font("Inria Sans", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CASH-MASTER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tf_nama.setBackground(new java.awt.Color(96, 108, 93));
        tf_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_namaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel1.setText("NAMA");

        tf_jumlah.setBackground(new java.awt.Color(96, 108, 93));
        tf_jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_jumlahActionPerformed(evt);
            }
        });

        tf_harga.setBackground(new java.awt.Color(96, 108, 93));
        tf_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_hargaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel3.setText("HARGA");

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel4.setText("JUMLAH");

        b_tambah.setBackground(new java.awt.Color(60, 72, 107));
        b_tambah.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        b_tambah.setForeground(new java.awt.Color(255, 255, 255));
        b_tambah.setText("Tambah");
        b_tambah.setBorderPainted(false);
        b_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_tambahActionPerformed(evt);
            }
        });

        b_delete.setBackground(new java.awt.Color(249, 217, 73));
        b_delete.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        b_delete.setForeground(new java.awt.Color(51, 51, 51));
        b_delete.setText("Delete");
        b_delete.setBorderPainted(false);
        b_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_deleteActionPerformed(evt);
            }
        });

        b_clear.setBackground(new java.awt.Color(244, 80, 80));
        b_clear.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        b_clear.setForeground(new java.awt.Color(255, 255, 255));
        b_clear.setText("Clear");
        b_clear.setBorderPainted(false);
        b_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_clearActionPerformed(evt);
            }
        });

        b_edit.setBackground(new java.awt.Color(122, 168, 116));
        b_edit.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        b_edit.setForeground(new java.awt.Color(255, 255, 255));
        b_edit.setText("Edit");
        b_edit.setBorderPainted(false);
        b_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_editActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(96, 108, 93));

        tf_total.setBackground(new java.awt.Color(255, 244, 244));
        tf_total.setFont(new java.awt.Font("Poppins", 1, 11)); // NOI18N
        tf_total.setText("Rp.");
        tf_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_totalActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total");

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tunai");

        jLabel7.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Kembali");

        b_hitung.setBackground(new java.awt.Color(104, 185, 132));
        b_hitung.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        b_hitung.setForeground(new java.awt.Color(255, 255, 255));
        b_hitung.setText("Hitung");
        b_hitung.setBorderPainted(false);
        b_hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_hitungActionPerformed(evt);
            }
        });

        b_simpan.setBackground(new java.awt.Color(104, 185, 132));
        b_simpan.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        b_simpan.setForeground(new java.awt.Color(255, 255, 255));
        b_simpan.setText("Simpan");
        b_simpan.setBorderPainted(false);
        b_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_simpanActionPerformed(evt);
            }
        });

        tf_tunai.setBackground(new java.awt.Color(255, 244, 244));
        tf_tunai.setFont(new java.awt.Font("Poppins", 1, 11)); // NOI18N
        tf_tunai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_tunaiActionPerformed(evt);
            }
        });

        tf_kembali.setBackground(new java.awt.Color(255, 244, 244));
        tf_kembali.setFont(new java.awt.Font("Poppins", 1, 11)); // NOI18N
        tf_kembali.setText("Rp.");
        tf_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_kembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(b_hitung)
                        .addGap(18, 18, 18)
                        .addComponent(b_simpan))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_tunai, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_total, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_tunai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_hitung)
                    .addComponent(b_simpan))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(96, 108, 93));

        jTable1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO", "NAMA", "HARGA", "JUMLAH"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(12);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(12);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(36, 36, 36))
                            .addComponent(jLabel4))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_nama)
                            .addComponent(tf_harga)
                            .addComponent(tf_jumlah)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(b_tambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_clear)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_tambah)
                            .addComponent(b_edit)
                            .addComponent(b_delete)
                            .addComponent(b_clear))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_namaActionPerformed

    private void tf_jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_jumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_jumlahActionPerformed

    private void tf_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_hargaActionPerformed

    private void b_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_clearActionPerformed
        clear();
    }//GEN-LAST:event_b_clearActionPerformed

    private void b_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_deleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int indexDataSelect = jTable1.getRowCount();
        int rowSelect = jTable1.getSelectedRow();
        
        if(indexDataSelect == 0){
            JOptionPane.showMessageDialog(null, "Belum ada data");
        } else {
            if(rowSelect != 1){
                model.removeRow(rowSelect);
            } else {
                JOptionPane.showMessageDialog(null, "Silahkan pilih data yang ingin dihapus");
            }
        }
    }//GEN-LAST:event_b_deleteActionPerformed

    private void b_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_tambahActionPerformed
        if(tf_nama.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nama barang belum diinput");
        } else if(tf_harga.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Harga barang belum diinput");
        } else if(tf_jumlah.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Jumlah barang belum diinput");
        } else{
            insertData();
            clear();
        }
    }//GEN-LAST:event_b_tambahActionPerformed

    private void b_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_editActionPerformed
        int jumlahRowData = jTable1.getRowCount();
        int indexDataSelect = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        if (jumlahRowData == 0) {
            JOptionPane.showMessageDialog(null, "Belum ada data");
        } else {
            if (indexDataSelect != -1) {
                if (b_edit.getText() == "Edit"){
                b_tambah.setEnabled(false);
                b_delete.setEnabled(false);
                b_edit.setText("Update");

                tf_nama.setText(model.getValueAt(indexDataSelect, 1).toString());
                tf_harga.setText(model.getValueAt(indexDataSelect, 2).toString());
                tf_jumlah.setText(model.getValueAt(indexDataSelect, 3).toString());
            } else {
                b_tambah.setEnabled(true);
                b_delete.setEnabled(true);
                b_edit.setText("Edit");

                model.setValueAt(tf_nama.getText().toString(), indexDataSelect, 1);
                model.setValueAt(tf_harga.getText().toString(), indexDataSelect, 2);
                model.setValueAt(tf_jumlah.getText().toString(), indexDataSelect, 3);

                clear();           
                }
            } else {
                JOptionPane.showMessageDialog(null, "Silakan pilih data yang ingin di edit");
            }
        }
    }//GEN-LAST:event_b_editActionPerformed

    private void tf_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_totalActionPerformed

    private void b_hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_hitungActionPerformed
        int jumlahRowData = jTable1.getRowCount();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        int totalHarga = 0;
        int inputTunai = 0;

        for (int i = 0; i < jumlahRowData; i++) {
            int hargaBarang = Integer.parseInt(model.getValueAt(i, 2).toString());
            int jumlahBarang = Integer.parseInt(model.getValueAt(i, 3).toString());

            int subTotal = hargaBarang * jumlahBarang;
            totalHarga += subTotal;
        }
        
        String tunai = tf_tunai.getText();
        if (!tunai.isEmpty()) {
            try {
                inputTunai = Integer.parseInt(tunai);
            } catch (NumberFormatException e) {
                String total = String.valueOf(totalHarga);
                tf_total.setText(total);
                JOptionPane.showMessageDialog(null, "Input tunai tidak valid. Harap masukkan angka");
                return; // Menghentikan eksekusi lebih lanjut jika input tidak valid
            }
        } else {
            String total = String.valueOf(totalHarga);
            tf_total.setText(total);
            JOptionPane.showMessageDialog(null, "Input tunai kosong. Harap masukkan angka");
            return; // Menghentikan eksekusi lebih lanjut jika input kosong
        }

        String total = String.valueOf(totalHarga);
        tf_total.setText(total);

        if (inputTunai < totalHarga) {
            JOptionPane.showMessageDialog(null, "Tunai harus lebih besar atau sama dengan total harga");
            tf_kembali.setText("");
            return; // Menghentikan eksekusi lebih lanjut jika tunai kurang dari total harga
        } else {
            int kembalian = inputTunai - totalHarga;
            String kembali = String.valueOf(kembalian);
            tf_kembali.setText(kembali);
            JOptionPane.showMessageDialog(null, "Berhasil menghitung");
        }
    }//GEN-LAST:event_b_hitungActionPerformed

    private void b_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_simpanActionPerformed
        int jumlahRowData = jTable1.getRowCount();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        if (jumlahRowData == 0) {
            JOptionPane.showMessageDialog(null, "Belum ada data");
        } else {
            for (int i = 0; i < jumlahRowData; i++) {
                String namaBarang = model.getValueAt(i, 1).toString();
                int hargaBarang = Integer.parseInt(model.getValueAt(i, 2).toString());
                int jumlahBarang = Integer.parseInt(model.getValueAt(i, 3).toString());

                My_config.insertData(namaBarang, hargaBarang, jumlahBarang);
            }
            model.setRowCount(0);
            tf_total.setText("");
            tf_tunai.setText("");
            tf_kembali.setText("");
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan ke dalam database");
        }
    }//GEN-LAST:event_b_simpanActionPerformed

    private void tf_tunaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_tunaiActionPerformed
        String tunai = tf_tunai.getText();
        tf_tunai.setText(tunai);
    }//GEN-LAST:event_tf_tunaiActionPerformed

    private void tf_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_kembaliActionPerformed
        
    }//GEN-LAST:event_tf_kembaliActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
     for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
         if ("Nimbus".equals(info.getName())) {
             javax.swing.UIManager.setLookAndFeel(info.getClassName());
             break;
         }
     }
 } catch (ClassNotFoundException ex) {
     java.util.logging.Logger.getLogger(CashMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 } catch (InstantiationException ex) {
     java.util.logging.Logger.getLogger(CashMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 } catch (IllegalAccessException ex) {
     java.util.logging.Logger.getLogger(CashMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 } catch (javax.swing.UnsupportedLookAndFeelException ex) {
     java.util.logging.Logger.getLogger(CashMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashMaster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_clear;
    private javax.swing.JButton b_delete;
    private javax.swing.JButton b_edit;
    private javax.swing.JButton b_hitung;
    private javax.swing.JButton b_simpan;
    private javax.swing.JButton b_tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tf_harga;
    private javax.swing.JTextField tf_jumlah;
    private javax.swing.JTextField tf_kembali;
    private javax.swing.JTextField tf_nama;
    private javax.swing.JTextField tf_total;
    private javax.swing.JTextField tf_tunai;
    // End of variables declaration//GEN-END:variables
}
