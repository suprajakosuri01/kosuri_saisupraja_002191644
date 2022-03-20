package UI;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import model.PatientDirectory;
import model.House;
import model.Patient;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.City;
import model.Community;


public class PatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientJPanel
     */
    DefaultTableModel model;
    int row,col;  
    private PatientDirectory patientDirectory;
    public PatientJPanel(PatientDirectory patientDirectory) {
        initComponents();
        this.patientDirectory = patientDirectory;
        model = (DefaultTableModel) patientTable.getModel();
        btnGroupSex.add(radioMale);
        btnGroupSex.add(radioFemale);      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupSex = new javax.swing.ButtonGroup();
        txtCity = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtZip = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        btnAddPatient = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnViewAll = new javax.swing.JButton();
        txtLastName = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnRemovePatient = new javax.swing.JButton();
        txtMobile = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txtHouseNumber = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtStreetName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        comboCommunity = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));

        jLabel11.setText("State");

        jLabel1.setText("Patient ID");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel12.setText("Zip Code");

        jLabel2.setText("First Name");

        btnAddPatient.setText("Add New Patient");
        btnAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientActionPerformed(evt);
            }
        });

        jLabel3.setText("Last Name");

        btnViewAll.setText("View All Patients");
        btnViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel4.setText("Mobile Number");

        btnRemovePatient.setText("Remove Patient");
        btnRemovePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovePatientActionPerformed(evt);
            }
        });

        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "First Name", "Last Name", "Mobile ", "Age", "Sex", "H.No", "Street Name", "Community", "City", "State", "Zip Code"
            }
        ));
        patientTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(patientTable);

        jLabel5.setText("Age");

        jLabel6.setText("Sex");

        radioMale.setText("Male");

        radioFemale.setText("Female");

        jLabel7.setText("House Number");

        jLabel8.setText("Street Name");

        jLabel9.setText("Community");

        comboCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Null", "Malden", "Somerville", "Fenway" }));

        jLabel10.setText("city");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btnAddPatient)
                        .addGap(29, 29, 29)
                        .addComponent(btnViewAll, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(202, 202, 202))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnRemovePatient)
                                .addGap(46, 46, 46)))
                        .addComponent(btnClear))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel12))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtId)
                                        .addComponent(txtFirstName)
                                        .addComponent(txtLastName)
                                        .addComponent(txtMobile)
                                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radioMale, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(radioFemale))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtZip, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtState, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCity, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtStreetName, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtHouseNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboCommunity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(228, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioMale)
                    .addComponent(radioFemale)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStreetName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnRemovePatient)
                    .addComponent(btnUpdate)
                    .addComponent(btnViewAll)
                    .addComponent(btnAddPatient))
                .addContainerGap(377, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientActionPerformed
       
        String patientId = txtId.getText();
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String phoneNo = txtMobile.getText();
        String strAge = txtAge.getText();
        String sex = getSex();
        String houseNumber = txtHouseNumber.getText();
        String streetName = txtStreetName.getText();
        String strCommunity = comboCommunity.getSelectedItem().toString();
        String strCity = txtCity.getText();
        String state = txtState.getText();
        String strZipCode = txtZip.getText();
        
        
        if (patientId.isEmpty()||firstName.isEmpty()||lastName.isEmpty()||strAge.isEmpty()|| houseNumber.isEmpty()
                || streetName.isEmpty() || strCommunity.isEmpty() || strCity.isEmpty()
                || state.isEmpty() || strZipCode.isEmpty() || phoneNo.isEmpty() || sex.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "One or More fields are empty..!", "Empty Fields", 2);
        }
        
        else if (! patientDirectory.isValidPatientId(patientId))
        {
            JOptionPane.showMessageDialog(this, "Patient with same ID already exists.!! please check", "ID error",2);
            
        }
        
        else{
            int age = Integer.parseInt(strAge);
            int zipcode = Integer.parseInt(strZipCode);
            City city = new City(strCity);
            Community community = new Community(strCommunity,city);
        
            House house = new House(houseNumber,streetName,community,state,zipcode);
            Patient patient = new Patient(firstName, lastName, phoneNo, sex, age, house,patientId);
            patientDirectory.addPatient(patient);
            displayPatients(patientDirectory.getPatientDirectory());
            
            JOptionPane.showMessageDialog(this, "Patient information added successfully.!!", "Added patient",1);
            clearField();
        }      
        
    }//GEN-LAST:event_btnAddPatientActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        model.setRowCount(0);
        clearField();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRemovePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovePatientActionPerformed
        // TODO add your handling code here:
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Delete this data", "Delete", dialogButton);
        if (dialogResult == 0)
        {
            row = patientTable.getSelectedRow();
            model.removeRow(row);
            String patinetId = model.getValueAt(row, 0).toString();
            patientDirectory.removePatient(patinetId);
            displayPatients(patientDirectory.getPatientDirectory()); 
            clearField();
        }    
    }//GEN-LAST:event_btnRemovePatientActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        String selectedPatientId = model.getValueAt(row, 0).toString(); 
        String updatepatientId = txtId.getText();
        String updatefirstName = txtFirstName.getText();
        String updatelastName = txtLastName.getText();
        String updatestrAge = txtAge.getText();
        String updatesex = getSex();
        String updateHno = txtHouseNumber.getText();
        String updatestreetName = txtStreetName.getText();
        String updatecommunity = comboCommunity.getSelectedItem().toString();
        String updatecity = txtCity.getText();
        String updatestate = txtState.getText();
        String updatestrzipCode = txtZip.getText();
        String updatephoneNo = txtMobile.getText();

        
        int updateage = Integer.parseInt(updatestrAge);
        int updatezip = Integer.parseInt(updatestrzipCode);
        
        if (txtId.getText().isEmpty()||txtFirstName.getText().isEmpty()||txtLastName.getText().isEmpty()||txtAge.getText().isEmpty()|| txtHouseNumber.getText().isEmpty()
                || txtStreetName.getText().isEmpty() || comboCommunity.getSelectedItem().toString().isEmpty() || txtCity.getText().isEmpty()
                || txtState.getText().isEmpty() || txtZip.getText().isEmpty() || txtMobile.getText().isEmpty() || updatesex.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "One or More fields are empty..!", "Empty Fields",2);
        }
        
        else if (!selectedPatientId.equals(updatepatientId))
        {
            JOptionPane.showMessageDialog(this, "Patient Id cannot be updated.!! Please check", "ID error",2);
        }
        
        else
        {
        
            City city = new City(updatecity);
            Community community = new Community(updatecommunity,city);
            House house = new House(updateHno,updatestreetName,community,updatestate,updatezip);

            patientDirectory.getPatientDirectory().get(row).setFirstName(updatefirstName);
            patientDirectory.getPatientDirectory().get(row).setLastName(updatelastName);
            patientDirectory.getPatientDirectory().get(row).setAge(updateage);
            patientDirectory.getPatientDirectory().get(row).setSex(updatesex);
            patientDirectory.getPatientDirectory().get(row).setHouse(house);
            patientDirectory.getPatientDirectory().get(row).setPhoneNumber(updatephoneNo);


            displayPatients(patientDirectory.getPatientDirectory());

            JOptionPane.showMessageDialog(this, "Patient information updated successfully.!!", "Updated patient",1);
            clearField();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed
        // TODO add your handling code here:
        
       displayPatients(patientDirectory.getPatientDirectory());
       
      
    }//GEN-LAST:event_btnViewAllActionPerformed

    private void patientTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientTableMouseClicked
        // TODO add your handling code here:
        row = patientTable.getSelectedRow();
        col = patientTable.getColumnCount();
        
        txtId.setText(model.getValueAt(row, 0).toString());
        txtFirstName.setText(model.getValueAt(row, 1).toString());
        txtLastName.setText(model.getValueAt(row, 2).toString());
        txtAge.setText(model.getValueAt(row, 4).toString());
        txtHouseNumber.setText(model.getValueAt(row, 6).toString());
        txtStreetName.setText(model.getValueAt(row, 7).toString());
        comboCommunity.setSelectedItem(model.getValueAt(row, 8).toString());
        txtCity.setText(model.getValueAt(row, 9).toString());
        txtState.setText(model.getValueAt(row, 10).toString());
        txtZip.setText(model.getValueAt(row, 11).toString());
        txtMobile.setText(model.getValueAt(row, 3).toString());
        if (model.getValueAt(row, 5).toString().equals("Male"))
        {
            radioMale.doClick();
        }
        if (model.getValueAt(row, 5).toString().equals("Female"))
        {
            radioFemale.doClick();
        }
    }//GEN-LAST:event_patientTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPatient;
    private javax.swing.JButton btnClear;
    private javax.swing.ButtonGroup btnGroupSex;
    private javax.swing.JButton btnRemovePatient;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnViewAll;
    private javax.swing.JComboBox<String> comboCommunity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patientTable;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHouseNumber;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStreetName;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables

    private String getSex() {
        
        if(radioMale.isSelected()) return "Male";
        else if(radioFemale.isSelected()) return "Female";
        return "";
    }
    
     public  void displayPatients(List<Patient> patients){
        
        
        model.setRowCount(0);
        for(Patient patient : patients){
            
            House house = patient.getHouse();
            Object[] objs = {patient.getPatientId(),  patient.getFirstName(), patient.getLastName(), patient.getPhoneNumber(),patient.getAge(), patient.getSex(), house.getHno(),house.getStreet(),house.getCommunity().getCommunityName(),house.getCommunity().getCity().getCityName(),house.getState(),house.getZipcode()};
            model.addRow(objs);
        }
        
    }
     
       public void clearField(){
        
        txtId.setText("");
        txtFirstName.setText("");
        txtLastName.setText("");
        txtAge.setText("");
        btnGroupSex.clearSelection();
        txtHouseNumber.setText("");
        txtStreetName.setText("");
        comboCommunity.setSelectedIndex(0);
        txtCity.setText("");
        txtState.setText("");
        txtZip.setText("");
        txtMobile.setText("");
       }
       
       
     
}
       
   
