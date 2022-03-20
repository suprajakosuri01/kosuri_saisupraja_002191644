package UI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import model.Community;
import model.House;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import model.City;
import model.Community;


public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    PatientDirectory patientDirectory;
    PersonDirectory personDirectory;
    
    String personcsvFilepath = "/Users/suprajakosuri/Desktop/kosuri_saisupraja_002191644/Assignment4_Vital_Signs/Person.csv";
    String csvPatientFilepath = "/Users/suprajakosuri/Desktop/kosuri_saisupraja_002191644/Assignment4_Vital_Signs/Patient.csv";

    
    public MainJFrame() {
        initComponents();
        
        this.patientDirectory = new PatientDirectory();
        this.personDirectory = new PersonDirectory();
        
        readPersonCSV();
        readPatientCSV();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));

        splitPane.setBackground(new java.awt.Color(0, 204, 204));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jButton1.setText("Patient");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Add Encounter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Person Directory");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("View Encounter");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jButton3)
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addGap(42, 42, 42)
                .addComponent(jButton2)
                .addGap(37, 37, 37)
                .addComponent(jButton4)
                .addContainerGap(541, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 686, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 798, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        EncounterJPanel encounterPanel = new EncounterJPanel(patientDirectory);
        splitPane.setRightComponent(encounterPanel);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                // TODO add your handling code here:
                
                PatientJPanel patientPanel = new PatientJPanel(patientDirectory);
                splitPane.setRightComponent(patientPanel);
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        SearchEncounter searchPanel = new SearchEncounter(patientDirectory);
        splitPane.setRightComponent(searchPanel);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        PersonJPanel personPanel = new PersonJPanel(personDirectory);
        splitPane.setRightComponent(personPanel);
        
    }//GEN-LAST:event_jButton3ActionPerformed
    
    public void readPersonCSV(){
        String line = "";
        String splitBy = ",";
        try {
            BufferedReader br = new BufferedReader(new FileReader(personcsvFilepath));  
        
            while ((line = br.readLine()) != null)    
            {  
                String[] personDetails = line.split(splitBy);
                
                String firstName = personDetails[0];
                String lastName = personDetails[1];
                String strAge = personDetails[3];
                int age = Integer.parseInt(strAge);
                String sex = personDetails[4].trim();
                String houseNumber = personDetails[5];
                String streetName = personDetails[6];
                String strCommunity = personDetails[7];
                String strCity = personDetails[8];
                String state = personDetails[9];
                String strZip = personDetails[10];
                int zip = Integer.parseInt(strZip); 
                String phoneNo = personDetails[2];
                
             
                City city = new City(strCity);
                Community community = new Community(strCommunity,city);
                House house = new House(houseNumber,streetName,community,state,zip);
                Person person = new Person(firstName, lastName, phoneNo, sex, age, house);
                
                personDirectory.addPerson(person);
            
             }  

            
        } catch (IOException e)   
            {  
            e.printStackTrace();  
            }  
}
    
    public void readPatientCSV()
    {
        String line = "";
        String splitBy = ",";
        try {
            BufferedReader br = new BufferedReader(new FileReader(csvPatientFilepath));  
        
            while ((line = br.readLine()) != null)    
            {  
                String[] patientDetails = line.split(splitBy);
            
                String patientId = patientDetails[0];
                String firstName = patientDetails[1];
                String lastName = patientDetails[2];
                String phoneNo = patientDetails[3];
                String strAge = patientDetails[4];
                int age = Integer.parseInt(strAge);
                String sex = patientDetails[5].trim();
                String houseNumber = patientDetails[6];
                String streetName = patientDetails[7];
                String strCommunity = patientDetails[8];
                String strCity = patientDetails[9];
                String state = patientDetails[10];
                String strZip = patientDetails[11];
                int zip = Integer.parseInt(strZip); 
                
             
                City city = new City(strCity);
                Community community = new Community(strCommunity,city);
                House house = new House(houseNumber,streetName,community,state,zip);
                Patient patient = new Patient(firstName, lastName, phoneNo, sex, age, house, patientId);
                
                patientDirectory.addPatient(patient);
            
             }  

            
        } catch (IOException e)   
            {  
            e.printStackTrace();  
            }
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
