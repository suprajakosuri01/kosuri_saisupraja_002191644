package UI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.Community;
import model.House;
import model.Patient;
import model.Person;
import model.PersonDirectory;

public class PersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PersonJPanel
     */
    DefaultTableModel model1;
    int row,col;  
    private PersonDirectory personDirectory;
    

    public PersonJPanel(PersonDirectory personDirectory) {
        initComponents();
        this.personDirectory = personDirectory;
        model1 = (DefaultTableModel) personTable.getModel();
        btnGroupSex.add(radioMale);
        btnGroupSex.add(radioFemale);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupSex = new javax.swing.ButtonGroup();
        txtStreetName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtZip = new javax.swing.JTextField();
        comboCommunity = new javax.swing.JComboBox<>();
        txtFirstName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnViewAll = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtLastName = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        personTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        radioMale = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        radioFemale = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        txtHouseNumber = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAddPatient = new javax.swing.JButton();
        btnRemovePerson = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));

        jLabel9.setText("Community");

        comboCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Null", "Somerville", "Malden", "Fenway" }));

        jLabel10.setText("city");

        jLabel3.setText("Last Name");

        btnViewAll.setText("View All Persons");
        btnViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel4.setText("Mobile Number");

        personTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Mobile ", "Age", "Sex", "H.No", "Street.No", "Community", "City", "State", "Zip Code"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        personTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(personTable);

        jLabel5.setText("Age");

        jLabel6.setText("Sex");

        radioMale.setText("Male");

        jLabel11.setText("State");

        radioFemale.setText("Female");

        jLabel7.setText("House Number");

        jLabel8.setText("Street Name");

        jLabel12.setText("Zip Code");

        jLabel2.setText("First Name");

        btnAddPatient.setText("Add New Person");
        btnAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientActionPerformed(evt);
            }
        });

        btnRemovePerson.setText("Remove Person");
        btnRemovePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovePersonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddPatient)
                                .addGap(30, 30, 30)
                                .addComponent(btnViewAll, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btnRemovePerson)
                                .addGap(46, 46, 46)
                                .addComponent(btnClear))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(172, 172, 172)
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
                                    .addComponent(jLabel12))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radioMale, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(radioFemale))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtFirstName)
                                        .addComponent(txtLastName)
                                        .addComponent(txtMobile)
                                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtZip, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtState, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCity, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtStreetName, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtHouseNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboCommunity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(radioMale)
                    .addComponent(radioFemale))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtStreetName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(comboCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddPatient)
                    .addComponent(btnViewAll)
                    .addComponent(btnUpdate)
                    .addComponent(btnClear)
                    .addComponent(btnRemovePerson))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(262, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        model1.setRowCount(0);
        clearField();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientActionPerformed
        // TODO add your handling code here:
        
        
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String strAge = txtAge.getText();
        String sex = getSex();
        String houseNumber = txtHouseNumber.getText();
        String streetName = txtStreetName.getText();
        String strCommunity = comboCommunity.getSelectedItem().toString();
        String strCity = txtCity.getText();
        String state = txtState.getText();
        String strZipCode = txtZip.getText();
        String phoneNo = txtMobile.getText();
        
        if (firstName.isEmpty()||lastName.isEmpty()||strAge.isEmpty()|| houseNumber.isEmpty()
                || streetName.isEmpty() || strCommunity.isEmpty() || strCity.isEmpty()
                || state.isEmpty() || strZipCode.isEmpty() || phoneNo.isEmpty() || sex.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "One or More fields are empty..!", "Empty Fields", 2);
        }
        
       
        
        else{
            int age = Integer.parseInt(strAge);
            int zipcode = Integer.parseInt(strZipCode);
            City city = new City(strCity);
            Community community = new Community(strCommunity,city);
            House house = new House(houseNumber,streetName,community,state,zipcode);
            Person person = new Person(firstName, lastName, phoneNo, sex, age, house);
            personDirectory.addPerson(person);
            displayPersons(personDirectory.getPersonDirectory());
            
            JOptionPane.showMessageDialog(this, "Person information added successfully.!!", "Added person",1);
            clearField();
        }  
    }//GEN-LAST:event_btnAddPatientActionPerformed

    private void personTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personTableMouseClicked
        // TODO add your handling code here:
        
         row = personTable.getSelectedRow();
        col = personTable.getColumnCount();
        
       
        txtFirstName.setText(model1.getValueAt(row, 0).toString());
        txtLastName.setText(model1.getValueAt(row, 1).toString());
        txtAge.setText(model1.getValueAt(row, 3).toString());
        txtHouseNumber.setText(model1.getValueAt(row, 5).toString());
        txtStreetName.setText(model1.getValueAt(row, 6).toString());
        comboCommunity.setSelectedItem(model1.getValueAt(row, 7).toString());
        txtCity.setText(model1.getValueAt(row, 8).toString());
        txtState.setText(model1.getValueAt(row, 9).toString());
        txtZip.setText(model1.getValueAt(row, 10).toString());
        txtMobile.setText(model1.getValueAt(row, 2).toString());
        if (model1.getValueAt(row, 4).toString().equals("Male"))
        {
            radioMale.doClick();
        }
        if (model1.getValueAt(row, 4).toString().equals("Female"))
        {
            radioFemale.doClick();
        }
    }//GEN-LAST:event_personTableMouseClicked

    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed
        // TODO add your handling code here:
        displayPersons(personDirectory.getPersonDirectory());
    }//GEN-LAST:event_btnViewAllActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
 
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
        
        if (txtFirstName.getText().isEmpty()||txtLastName.getText().isEmpty()||txtAge.getText().isEmpty()|| txtHouseNumber.getText().isEmpty()
                || txtStreetName.getText().isEmpty() || comboCommunity.getSelectedItem().toString().isEmpty() || txtCity.getText().isEmpty()
                || txtState.getText().isEmpty() || txtZip.getText().isEmpty() || txtMobile.getText().isEmpty() || updatesex.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "One or More fields are empty..!", "Empty Fields",2);
        }
      
        else
        {
        
            City city = new City(updatecity);
            Community community = new Community(updatecommunity,city);
            House house = new House(updateHno,updatestreetName,community,updatestate,updatezip);
            //Patient patient = new Patient(updatefirstName, updatelastName, updatephoneNo, updatesex, updateage, house, updateMaritalStatus,selectedPatientId);

            personDirectory.getPersonDirectory().get(row).setFirstName(updatefirstName);
            personDirectory.getPersonDirectory().get(row).setLastName(updatelastName);
            personDirectory.getPersonDirectory().get(row).setAge(updateage);
            personDirectory.getPersonDirectory().get(row).setSex(updatesex);
            personDirectory.getPersonDirectory().get(row).setHouse(house);
            personDirectory.getPersonDirectory().get(row).setPhoneNumber(updatephoneNo);


            displayPersons(personDirectory.getPersonDirectory());

            JOptionPane.showMessageDialog(this, "Person information updated successfully.!!", "Updated patient",1);
            clearField();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnRemovePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovePersonActionPerformed
        // TODO add your handling code here:
         int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Delete this data", "Delete", dialogButton);
        if (dialogResult == 0)
        {
            row = personTable.getSelectedRow();
            model1.removeRow(row);
            String firstName = model1.getValueAt(row, 0).toString();
            personDirectory.getPersonDirectory().remove(row);
            displayPersons(personDirectory.getPersonDirectory()); 
            clearField();
        }    
    }//GEN-LAST:event_btnRemovePersonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPatient;
    private javax.swing.JButton btnClear;
    private javax.swing.ButtonGroup btnGroupSex;
    private javax.swing.JButton btnRemovePerson;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnViewAll;
    private javax.swing.JComboBox<String> comboCommunity;
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
    private javax.swing.JTable personTable;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHouseNumber;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStreetName;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables

    private void clearField() {
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
     private String getSex() {
        
        if(radioMale.isSelected()) return "Male";
        else if(radioFemale.isSelected()) return "Female";
        return "";
    }

    private void displayPersons(List<Person> personDirectory) {
        model1.setRowCount(0);
        for(Person person : personDirectory){
            
            House house = person.getHouse();
            Object[] objs = {person.getFirstName(), person.getLastName(),person.getPhoneNumber(), person.getAge(), person.getSex(), house.getHno(),house.getStreet(),house.getCommunity().getCommunityName(),house.getCommunity().getCity().getCityName(),house.getState(),house.getZipcode()};
            model1.addRow(objs);
        }
    }
    
    
    
}
        
