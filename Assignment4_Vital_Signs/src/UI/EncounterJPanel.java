package UI;

import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Encounter;
import model.EncounterHistory;
import model.House;
import model.Patient;
import model.PatientDirectory;
import model.PersonDirectory;
import model.VitalSign;
public class EncounterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EncounterJPanel
     */
    private PatientDirectory patientDirectory;
    DefaultTableModel dtm;
    int row,col;
    public EncounterJPanel(PatientDirectory patientDirectory) {
        initComponents();
        dtm = (DefaultTableModel)tableEncounter.getModel();
        this.patientDirectory = patientDirectory;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        btnAddVitals = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        txtPatientIDEncounter = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEncounter = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtPulseRate = new javax.swing.JTextField();
        btnUpdateVitals = new javax.swing.JButton();
        btnDeleteEncounter = new javax.swing.JButton();
        boxMonth = new javax.swing.JComboBox<>();
        boxDay = new javax.swing.JComboBox<>();
        boxYear = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtSystolic = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDiastolic = new javax.swing.JTextField();
        btnViewAll = new javax.swing.JButton();

        jLabel4.setText("Pulse Rate");

        btnAddVitals.setText("Add Vitals");
        btnAddVitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVitalsActionPerformed(evt);
            }
        });

        jLabel1.setText("Patient ID");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        tableEncounter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Encounter Date", "Systolic Pressure", "Diastolic Pressure", "Pulse Rate", "Community"
            }
        ));
        tableEncounter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEncounterMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableEncounter);

        jLabel5.setText("Encounter Date");

        btnUpdateVitals.setText("Update Vitals");
        btnUpdateVitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateVitalsActionPerformed(evt);
            }
        });

        btnDeleteEncounter.setText("Delete Encounter");
        btnDeleteEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEncounterActionPerformed(evt);
            }
        });

        boxMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MONTH", "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC" }));
        boxMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMonthActionPerformed(evt);
            }
        });

        boxDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        boxYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2015", "2016", "2017", "2018", "2019", "2020" }));

        jLabel2.setText("Pressure");

        jLabel6.setText("/");

        txtDiastolic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiastolicActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnViewAll)
                .addGap(312, 312, 312))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boxDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(txtSystolic, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtDiastolic, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtPatientIDEncounter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(txtPulseRate, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnAddVitals, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnUpdateVitals)
                        .addGap(46, 46, 46)
                        .addComponent(btnDeleteEncounter)
                        .addGap(34, 34, 34)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(325, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPatientIDEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(boxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSystolic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtDiastolic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPulseRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddVitals)
                    .addComponent(btnClear)
                    .addComponent(btnUpdateVitals)
                    .addComponent(btnDeleteEncounter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewAll)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddVitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVitalsActionPerformed
       
        String[] months = { "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
        String patientId = txtPatientIDEncounter.getText();
        String strSysPressure = txtSystolic.getText();
        String strDiaPressure  = txtDiastolic.getText();
        String strPulse  = txtPulseRate.getText();
        String strMonth = boxMonth.getSelectedItem().toString();
        String strDate = boxDay.getSelectedItem().toString();
        String strYear = boxYear.getSelectedItem().toString();
        
        System.out.println(patientId);
        System.out.println(patientDirectory.getPatientDirectory());
        
        if (patientId.isEmpty() || strSysPressure.isEmpty() || strDiaPressure.isEmpty() || strPulse.isEmpty()|| strMonth.equalsIgnoreCase("Month")
            || strDate.equalsIgnoreCase("Day") || strYear.equalsIgnoreCase("Year"))
        {
            JOptionPane.showMessageDialog(this, "One or More fields are empty..!", "Empty Fields",2);
        }
        
        
        if(patientDirectory.isValidPatientId(patientId)){
            JOptionPane.showMessageDialog(this, "Patient Id doesnot exist.!! Please check", "ID error",2);
            return;
        }
        
        int sysPressure = Integer.parseInt(strSysPressure);
        int diaPresure = Integer.parseInt(strDiaPressure);
        int pulse = Integer.parseInt(strPulse);
        int month = 0;
        for(int mon = 0; mon<months.length; mon++){
            if(months[mon].equals(strMonth)){
                month = mon+1;
                break;
            }
        }
        //int month = 0;
        int date = Integer.parseInt(strDate);
        int year = Integer.parseInt(strYear);
        VitalSign vitalSign = new VitalSign(sysPressure,diaPresure,pulse);
        
        LocalDate  localDate = LocalDate.of(year, month, date);
        
        Encounter encounter = new Encounter(localDate,vitalSign);
        
        Patient patient = patientDirectory.getPatient(patientId);
        System.out.println(patient);
        patient.addEncounter(encounter);
        
        JOptionPane.showMessageDialog(this, "Successfully added encounter", "Encounter",1);
    
        clearSaveFields(); 
        dtm.setRowCount(0);
        displayEncounters(patient.getEncounterHistory().getEncounterDirectory(),patient);
    
    }//GEN-LAST:event_btnAddVitalsActionPerformed

    private void btnUpdateVitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateVitalsActionPerformed
        
        String[] months = { "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
        String selectedPatientId = dtm.getValueAt(row, 0).toString();
        String patientId = txtPatientIDEncounter.getText();
        String strSysPressure = txtSystolic.getText();
        String strDiaPressure  = txtDiastolic.getText();
        String strPulse  = txtPulseRate.getText();
        String strMonth = boxMonth.getSelectedItem().toString();
        String strDate = boxDay.getSelectedItem().toString();
        String strYear = boxYear.getSelectedItem().toString();

        if (patientId.isEmpty() || strSysPressure.isEmpty() || strDiaPressure.isEmpty() || strPulse.isEmpty()|| strMonth.equalsIgnoreCase("Mon")
            || strDate.equalsIgnoreCase("Day") || strYear.equalsIgnoreCase("Year"))
        {
            JOptionPane.showMessageDialog(this, "One or More fields are empty..!", "Empty Fields",2);
           
        }

        else if (!selectedPatientId.equals(patientId))
        {
            JOptionPane.showMessageDialog(this, "Patient Id cannot be updated.!! Please check", "ID error",2);
        }
        
        else
        {
            int sysPressure = Integer.parseInt(strSysPressure);
            int diaPresure = Integer.parseInt(strDiaPressure);
            int pulse = Integer.parseInt(strPulse);
            int month = 0;
            for(int mon = 0; mon<months.length; mon++)
            {
                if(months[mon].equalsIgnoreCase(strMonth)){
                    month = mon+1;
                    break;
                }
            }
            int date = Integer.parseInt(strDate);
            int year = Integer.parseInt(strYear);
            VitalSign vitalSign = new VitalSign(sysPressure,diaPresure,pulse);
            LocalDate  localDate = LocalDate.of(year, month, date);
            Encounter encounter = new Encounter(localDate,vitalSign);

            Patient patient = patientDirectory.getPatient(patientId);
            EncounterHistory eh = patient.getEncounterHistory();
            List<Encounter> list = eh.getEncounterDirectory();
            list.set(row, encounter);
            dtm.setRowCount(0);
            displayEncounters(list, patient);

            JOptionPane.showMessageDialog(this, "Successfully Updated encounter", " Update Encounter",1);

            clearSaveFields();
            
        }
    }//GEN-LAST:event_btnUpdateVitalsActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        dtm.setRowCount(0);
        clearSaveFields();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEncounterActionPerformed
       String selectedPatientId = dtm.getValueAt(row, 0).toString();
        Patient patient = patientDirectory.getPatient(selectedPatientId);
        EncounterHistory eh = patient.getEncounterHistory();
        eh.removeEncounterAtIndex(row);
        dtm.setRowCount(0);
        displayEncounters(eh.getEncounterDirectory(), patient);
    }//GEN-LAST:event_btnDeleteEncounterActionPerformed

    private void tableEncounterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEncounterMouseClicked

        row = tableEncounter.getSelectedRow();   
      
        txtPatientIDEncounter.setText(dtm.getValueAt(row, 0).toString());
        txtDiastolic.setText(dtm.getValueAt(row, 3).toString());
        txtSystolic.setText(dtm.getValueAt(row, 2).toString());
        txtPulseRate.setText(dtm.getValueAt(row, 4).toString()); 
       
              
        
        String date = dtm.getValueAt(row, 1).toString();
        String dayAndMonth = date.split(",")[0].trim();
        String month = dayAndMonth.split(" ")[0].trim();
        String day = dayAndMonth.split(" ")[1].trim();
        String year = date.split(",")[1].trim();
        boxYear.setSelectedItem(year);
        boxDay.setSelectedItem(day);
        boxMonth.setSelectedItem(month.substring(0, 3));
       
        }//GEN-LAST:event_tableEncounterMouseClicked

    private void boxMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMonthActionPerformed
        String month = boxMonth.getSelectedItem().toString();
        if(month.equals("Mon")) return;
        boxDay.removeAllItems();
        int days = 31;
        
        //choose days according to the selected month.
        if (month.equals("Feb")) days = 28;
        else if (month.equals("Apr") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov")) days = 30;
        
        //Set days range to the day combo box
        for(int i =1; i<=days; i++) { boxDay.addItem(String.valueOf(i));}
    }//GEN-LAST:event_boxMonthActionPerformed

    private void txtDiastolicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiastolicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiastolicActionPerformed

    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed
        dtm.setRowCount(0);
        
        for(Patient patient : patientDirectory.getPatientDirectory()){
            EncounterHistory eH =  patient.getEncounterHistory();
             displayEncounters(eH.getEncounterDirectory(), patient);
        }
    }//GEN-LAST:event_btnViewAllActionPerformed
    
    public void clearSaveFields(){
        
        txtPatientIDEncounter.setText("");
        txtSystolic.setText("");
        txtDiastolic.setText("");
        txtPulseRate.setText("");
        boxMonth.setSelectedIndex(0);
        boxDay.setSelectedIndex(0);
        boxYear.setSelectedIndex(0);
              
    }
    
    public void displayEcounter(Encounter encounter, Patient patient){
        
        House house = patient.getHouse();
        VitalSign vitalsign = encounter.getVitalSign();
        LocalDate localdate = encounter.getDate();
        String date = localdate.getMonth()+" "+localdate.getDayOfMonth()+", "+localdate.getYear();
        Object[] obj = {patient.getPatientId(),date, vitalsign.getBp_systolic(),vitalsign.getBp_diastolic(),vitalsign.getPulse(),house.getCommunity().getCommunityName()};
        dtm.addRow(obj);
        
    }
    
    public void displayEncounters(List<Encounter> encounterList, Patient patient){
        
        
        for (Encounter encounter : encounterList )
        {
            displayEcounter(encounter, patient);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxDay;
    private javax.swing.JComboBox<String> boxMonth;
    private javax.swing.JComboBox<String> boxYear;
    private javax.swing.JButton btnAddVitals;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDeleteEncounter;
    private javax.swing.JButton btnUpdateVitals;
    private javax.swing.JButton btnViewAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableEncounter;
    private javax.swing.JTextField txtDiastolic;
    private javax.swing.JTextField txtPatientIDEncounter;
    private javax.swing.JTextField txtPulseRate;
    private javax.swing.JTextField txtSystolic;
    // End of variables declaration//GEN-END:variables
}
