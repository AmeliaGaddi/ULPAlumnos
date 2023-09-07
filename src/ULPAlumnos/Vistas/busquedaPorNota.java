package ULPAlumnos.Vistas;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import ULPAlumnos.Modelos.LogicaDB;

public class busquedaPorNota extends javax.swing.JFrame {
    Connection c;
    private DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable(int filas, int columnas){
            return false;
        }
    };
    public busquedaPorNota() {
        this.c=c;
        initComponents();
        cargarColumnas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFNota = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFNotaBaja = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlumnos = new javax.swing.JTable();
        jLError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTFNota.setText("10");
        jTFNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNotaActionPerformed(evt);
            }
        });
        jTFNota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFNotaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFNotaKeyReleased(evt);
            }
        });

        jLabel1.setText("Entre");

        jLabel2.setText("Buscar por nota");

        jTFNotaBaja.setText("0");
        jTFNotaBaja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFNotaBajaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFNotaBajaKeyReleased(evt);
            }
        });

        jLabel3.setText("y");

        jTableAlumnos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableAlumnos.setShowGrid(false);
        jTableAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAlumnos);

        jLError.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLError.setForeground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(297, 297, 297)
                                .addComponent(jLError, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel1)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTFNotaBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFNota, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFNotaBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFNotaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNotaKeyReleased
        //#VALIDAMOS las teclas que puede ingresar el usuario limitandolas solo a los numeros //en mi caso los codigos del teclado para los numneros van del 48 a 57
        int key = evt.getKeyCode(); //System.out.println("Cod.: ["+ key +"]");
        if(key <48 || key>57)jTFNota.setText(""); 
        
        
        String notaAlta = jTFNota.getText();
        String notaBaja = jTFNotaBaja.getText();
        if(!notaAlta.isEmpty() && !notaBaja.isEmpty()){
            if(Integer.parseInt(notaAlta)!=1&&Integer.parseInt(notaAlta)<Integer.parseInt(notaBaja))jTFNota.setText(notaBaja);
            if(Integer.parseInt(notaAlta)>10)jTFNota.setText("10");
            
            ejecutarConsulta(notaBaja,notaAlta);    
        }
    }//GEN-LAST:event_jTFNotaKeyReleased

    private void jTFNotaBajaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNotaBajaKeyReleased
        int key = evt.getKeyCode();
        if(key <48 || key>57)jTFNotaBaja.setText("");
        
        String notaAlta = jTFNota.getText();
        String notaBaja = jTFNotaBaja.getText();
        if(!notaBaja.isEmpty() && !notaAlta.isEmpty()){
            if(Integer.parseInt(notaBaja)<0)jTFNotaBaja.setText("");
            if(Integer.parseInt(notaBaja)>Integer.parseInt(notaAlta))jTFNotaBaja.setText(notaAlta);
            
            ejecutarConsulta(notaBaja,notaAlta);
        }
    }//GEN-LAST:event_jTFNotaBajaKeyReleased

    private void jTFNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNotaActionPerformed
        
    }//GEN-LAST:event_jTFNotaActionPerformed

    private void jTFNotaBajaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNotaBajaKeyPressed
        
    }//GEN-LAST:event_jTFNotaBajaKeyPressed

    private void jTFNotaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNotaKeyPressed
       
    }//GEN-LAST:event_jTFNotaKeyPressed

    private void jTableAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlumnosMouseClicked
//        int filaElegida = jTableAlumnos.getSelectedRow();
//        System.out.println("Clicked on: "+filaElegida);
    }//GEN-LAST:event_jTableAlumnosMouseClicked

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
            java.util.logging.Logger.getLogger(busquedaPorNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(busquedaPorNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(busquedaPorNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(busquedaPorNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new busquedaPorNota().setVisible(true);
            }
        });
    }
    
    private void cargarColumnas(){
        modelo.addColumn("DNI");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Materia");
        modelo.addColumn("Nota");
        jTableAlumnos.setModel(modelo);
    }
    
    private void ejecutarConsulta(String notaBaja, String notaAlta){
       String query;
       query = "select * from alumno join inscripcion on alumno.idAlumno=inscripcion.idAlumno join materia on inscripcion.idMateria = materia.idMateria where inscripcion.nota BETWEEN "+notaBaja+" AND "+notaAlta;
       ResultSet resultado=LogicaDB.ejecutarConsulta(query);
       try{
           borrarFilas();
           while(resultado.next())
               modelo.addRow(new Object[]{
                   resultado.getInt("dni"),
                   resultado.getString("apellido"),
                   resultado.getString("nombre"),
                   resultado.getString("materia.nombre"),
                   resultado.getInt("nota")
               });
       }catch(Exception e){
           System.out.println("Error: "+e.getMessage());
       }
    }
    
    private void borrarFilas(){
        int f=jTableAlumnos.getRowCount()-1;
        System.out.println("Tabla RowCount = "+f);
        for(;f>=0;f--){ //maior o igual
            modelo.removeRow(f);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLError;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFNota;
    private javax.swing.JTextField jTFNotaBaja;
    private javax.swing.JTable jTableAlumnos;
    // End of variables declaration//GEN-END:variables
}
