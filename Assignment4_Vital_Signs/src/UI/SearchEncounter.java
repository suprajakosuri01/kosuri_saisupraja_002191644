package UI;

import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Encounter;
import model.EncounterHistory;
import model.PatientDirectory;
import model.Patient;
import model.House;
import model.VitalSign;

public class SearchEncounter extends javax.swing.JPanel {

    /**
     * Creates new form SearchEncounter
     */
    private PatientDirectory patientDirectory;
    DefaultTableModel dtm;
    public SearchEncounter(PatientDirectory patientDirectory) {
        initComponents();
        this.patientDirectory = patientDirectory;
        dtm = (DefaultTableModel)tableSearch.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVitalSearch = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        comboSystolicMin = new javax.swing.JComboBox<>();
        comboSystolicMax = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSearch = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        comboDiastolicMin = new javax.swing.JComboBox<>();
        comboDialstolicMax = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        boxCommunity = new javax.swing.JComboBox<>();
        btnViewAll = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));

        btnVitalSearch.setText("Search");
        btnVitalSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVitalSearchActionPerformed(evt);
            }
        });

        jLabel6.setText("Systolic Pressure");

        comboSystolicMin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MIN", "120", "110", "100", "90", "80", "70" }));

        comboSystolicMax.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MAX", "130", "140", "150", "160", "170", "180" }));

        tableSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Encounter Date", "Systolic Pressure", "Diastolic Pressure", "Pulse Rate", "Community"
            }
        ));
        jScrollPane1.setViewportView(tableSearch);

        jLabel1.setText("Diastolic Pressure");

        comboDiastolicMin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MIN", "40", "50", "60", "70" }));

        comboDialstolicMax.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MAX", "80", "90", "100" }));

        jLabel2.setText("Community");

        boxCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Null", "Somerville", "Malden", "Fenway" }));

        btnViewAll.setText("View All Encounters");
        btnViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(btnVitalSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(2, 2, 2))
                            .addComponent(jLabel1))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboSystolicMin, 0, 101, Short.MAX_VALUE)
                                    .addComponent(comboDiastolicMin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboSystolicMax, 0, 101, Short.MAX_VALUE)
                                    .addComponent(comboDialstolicMax, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(boxCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(190, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnViewAll)
                .addGap(235, 235, 235))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboSystolicMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSystolicMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboDiastolicMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboDialstolicMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(boxCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnVitalSearch)
                .addGap(28, 28, 28)
                .addComponent(btnViewAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVitalSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVitalSearchActionPerformed
        
        String systolicMin = comboSystolicMin.getSelectedItem().toString();
        String systolicMax = comboDialstolicMax.getSelectedItem().toString();
        String diastolicMin = comboDiastolicMin.getSelectedItem().toString();
        String diastolicMax = comboDialstolicMax.getSelectedItem().toString();
        String community = boxCommunity.getSelectedItem().toString();
        
        
        if( systolicMin.equalsIgnoreCase("Min") && systolicMax.equalsIgnoreCase("Max") && diastolicMin.equalsIgnoreCase("Min") && diastolicMax.equalsIgnoreCase("Max")){
            JOptionPane.showMessageDialog(this, "Please set a abnormality range to search!!", "Empty Fields", 2);
            return;
            
        }
        
        dtm.setRowCount(0);
        for(Patient patient : patientDirectory.getPatientDirectory())
        {
            
            House house = patient.getHouse();
            if(community.equals("None") || community.equals(house.getCommunity().getCommunityName())){
                
                EncounterHistory eh = patient.getEncounterHistory();
                for(Encounter encounter : eh.getEncounterDirectory())
                {
                    if(checkAbnormality(encounter, systolicMin, systolicMax, diastolicMin, diastolicMax))
                    {
                        displayEcounter(encounter, patient);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnVitalSearchActionPerformed

    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed
        dtm.setRowCount(0);

        for(Patient patient : patientDirectory.getPatientDirectory()){
            EncounterHistory eH =  patient.getEncounterHistory();
            displayEncounters(eH.getEncounterDirectory(), patient);
        }
    }//GEN-LAST:event_btnViewAllActionPerformed
     public void displayEcounter(Encounter encounter, Patient patient){
        
        House house = patient.getHouse();
        VitalSign vitalsign = encounter.getVitalSign();
        LocalDate localdate = encounter.getDate();
        String date = localdate.getMonth()+" "+localdate.getDayOfMonth()+", "+localdate.getYear();
        Object[] obj = {patient.getPatientId(), date, vitalsign.getBp_systolic(),vitalsign.getBp_diastolic(),vitalsign.getPulse(),house.getCommunity().getCommunityName()};
        dtm.addRow(obj);
        
    }
     
     public void displayEncounters(List<Encounter> encounterList, Patient patient){
        
        
        for (Encounter encounter : encounterList )
        {
            displayEcounter(encounter, patient);
        }
        
    }
     
      public boolean checkAbnormality(Encounter encounter, String systolicMin, String systolicMax, String diastolicMin, String diastolicMax)
    {
        VitalSign vitalsign = encounter.getVitalSign();
        
        if( !systolicMin.equalsIgnoreCase("Min") && vitalsign.getBp_systolic() < Integer.parseInt(systolicMin)) return true;
        if( !systolicMax.equalsIgnoreCase("Max") && vitalsign.getBp_systolic() > Integer.parseInt(systolicMax)) return true;
        if( !diastolicMin.equalsIgnoreCase("Min") && vitalsign.getBp_diastolic() < Integer.parseInt(diastolicMin)) return true;
        if( !diastolicMax.equalsIgnoreCase("Max") && vitalsign.getBp_diastolic() > Integer.parseInt(diastolicMax)) return true;
        
        return false;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCommunity;
    private javax.swing.JButton btnViewAll;
    private javax.swing.JButton btnVitalSearch;
    private javax.swing.JComboBox<String> comboDialstolicMax;
    private javax.swing.JComboBox<String> comboDiastolicMin;
    private javax.swing.JComboBox<String> comboSystolicMax;
    private javax.swing.JComboBox<String> comboSystolicMin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableSearch;
    // End of variables declaration//GEN-END:variables
}
