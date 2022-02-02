package UI;

import Model.Car;
import Model.CardetailsHistory;
import java.awt.HeadlessException;
import java.awt.Image;
import static java.awt.Image.SCALE_SMOOTH;
import static java.awt.event.KeyEvent.VK_DELETE;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class CreateJPanel extends javax.swing.JPanel {

    CardetailsHistory history;
    int deleteKeyCode = 8;
    int shiftKeyCodeKeyCode = 16;
    int capsLockKeyCode = 20;
    int spaceBarKeyCode = 32;
    int hypehnKeyCode = 45;
    int leftArrayKeyCode = 37;
    int rightArrayKeyCode = 39;

    ArrayList allowListedKeyList = new ArrayList();

    public CreateJPanel(CardetailsHistory history) {
        initComponents();
        allowListedKeyList.add(deleteKeyCode);
        allowListedKeyList.add(shiftKeyCodeKeyCode);
        allowListedKeyList.add(capsLockKeyCode);
        allowListedKeyList.add(spaceBarKeyCode);
        allowListedKeyList.add(leftArrayKeyCode);
        allowListedKeyList.add(rightArrayKeyCode);

        this.history = history;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextFieldBrand = new javax.swing.JTextField();
        TextFieldModel = new javax.swing.JTextField();
        TextFieldColor = new javax.swing.JTextField();
        TextFieldYear = new javax.swing.JTextField();
        TextFieldEngineNo = new javax.swing.JTextField();
        TextFieldSeatNumber = new javax.swing.JTextField();
        TextFieldLicensePlates = new javax.swing.JTextField();
        TextFieldOwnerTelephoneNumbers = new javax.swing.JTextField();
        TextFieldOwnerName = new javax.swing.JTextField();
        TextFieldOwnerDriverlicense = new javax.swing.JTextField();
        TextFieldOwnerEmailaddresses = new javax.swing.JTextField();
        TextFieldWarrantyYear = new javax.swing.JTextField();
        TextFieldOwnerSocialSecuritynumber = new javax.swing.JTextField();
        TextFieldOwneraddress = new javax.swing.JTextField();
        BtnSave = new javax.swing.JButton();
        TextFieldServicerecords = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        LabelModel = new javax.swing.JLabel();
        LabelBrand1 = new javax.swing.JLabel();
        LabelYear = new javax.swing.JLabel();
        LabelColor1 = new javax.swing.JLabel();
        LabellicensePlates = new javax.swing.JLabel();
        LabelEngineNo1 = new javax.swing.JLabel();
        LabelSeatsNumber1 = new javax.swing.JLabel();
        LabelOwnerName = new javax.swing.JLabel();
        LabelownerTelephoneNumbers = new javax.swing.JLabel();
        LabelownerEmailAddresses = new javax.swing.JLabel();
        LabelownerDriverLicense = new javax.swing.JLabel();
        LabelownerAddress = new javax.swing.JLabel();
        LabelownerSocialSecurityNumber1 = new javax.swing.JLabel();
        LabelPhoto = new javax.swing.JLabel();
        LabelserviceRecords1 = new javax.swing.JLabel();
        LabelwarrantyYear1 = new javax.swing.JLabel();
        jButtonImageUpload = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 153));

        TextFieldBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldBrandActionPerformed(evt);
            }
        });
        TextFieldBrand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextFieldBrandKeyPressed(evt);
            }
        });

        TextFieldModel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextFieldModelKeyPressed(evt);
            }
        });

        TextFieldColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextFieldColorKeyPressed(evt);
            }
        });

        TextFieldYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextFieldYearKeyPressed(evt);
            }
        });

        TextFieldEngineNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextFieldEngineNoKeyPressed(evt);
            }
        });

        TextFieldSeatNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextFieldSeatNumberKeyPressed(evt);
            }
        });

        TextFieldLicensePlates.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextFieldLicensePlatesKeyPressed(evt);
            }
        });

        TextFieldOwnerTelephoneNumbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldOwnerTelephoneNumbersActionPerformed(evt);
            }
        });
        TextFieldOwnerTelephoneNumbers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextFieldOwnerTelephoneNumbersKeyPressed(evt);
            }
        });

        TextFieldOwnerName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextFieldOwnerNameKeyPressed(evt);
            }
        });

        TextFieldOwnerDriverlicense.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextFieldOwnerDriverlicenseKeyPressed(evt);
            }
        });

        TextFieldWarrantyYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextFieldWarrantyYearKeyPressed(evt);
            }
        });

        TextFieldOwnerSocialSecuritynumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextFieldOwnerSocialSecuritynumberKeyPressed(evt);
            }
        });

        TextFieldOwneraddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextFieldOwneraddressKeyPressed(evt);
            }
        });

        BtnSave.setText("Save");
        BtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveActionPerformed(evt);
            }
        });

        TextFieldServicerecords.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextFieldServicerecordsKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("                                                                       Create profile");

        LabelModel.setText("Model");

        LabelBrand1.setText("Brand");

        LabelYear.setText("Year");

        LabelColor1.setText("Color");

        LabellicensePlates.setText("license Plates");

        LabelEngineNo1.setText("Engine No");

        LabelSeatsNumber1.setText("Seats Number");

        LabelOwnerName.setText("Owner Name");

        LabelownerTelephoneNumbers.setText("Owner Telephone Numbers");

        LabelownerEmailAddresses.setText("Owner Email Addresses");

        LabelownerDriverLicense.setText("Owner Driver License");

        LabelownerAddress.setText("Owner Address");

        LabelownerSocialSecurityNumber1.setText("Owner SocialSecurity Number");

        LabelPhoto.setText("Photo");

        LabelserviceRecords1.setText("Service Records");

        LabelwarrantyYear1.setText("Warranty Year");

        jButtonImageUpload.setText("Upload image");
        jButtonImageUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImageUploadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelownerAddress)
                                    .addComponent(LabelPhoto)
                                    .addComponent(LabelserviceRecords1)
                                    .addComponent(LabelwarrantyYear1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextFieldServicerecords, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextFieldOwneraddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextFieldWarrantyYear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonImageUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(LabelownerSocialSecurityNumber1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(89, 89, 89)
                                .addComponent(TextFieldOwnerSocialSecuritynumber, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelownerDriverLicense, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(89, 89, 89)
                                .addComponent(TextFieldOwnerDriverlicense, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelownerEmailAddresses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(89, 89, 89)
                                .addComponent(TextFieldOwnerEmailaddresses, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LabelBrand1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelModel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelColor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabellicensePlates, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelEngineNo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelSeatsNumber1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelOwnerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelownerTelephoneNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextFieldOwnerTelephoneNumbers, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextFieldOwnerName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextFieldLicensePlates, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextFieldSeatNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextFieldEngineNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextFieldYear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextFieldColor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextFieldModel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextFieldBrand, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(BtnSave)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextFieldBrand)
                    .addComponent(LabelBrand1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldModel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelModel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(TextFieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(LabelColor1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelYear)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(TextFieldYear, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextFieldEngineNo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelEngineNo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextFieldSeatNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSeatsNumber1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldLicensePlates, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabellicensePlates, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelOwnerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldOwnerTelephoneNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelownerTelephoneNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldOwnerEmailaddresses, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelownerEmailAddresses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldOwnerDriverlicense, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelownerDriverLicense, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextFieldOwnerSocialSecuritynumber, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TextFieldOwneraddress, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelownerSocialSecurityNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LabelownerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelserviceRecords1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldServicerecords, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldWarrantyYear, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelwarrantyYear1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonImageUpload))
                .addGap(20, 20, 20)
                .addComponent(BtnSave)
                .addGap(57, 57, 57))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveActionPerformed
        //todo: Add more field for null validation
        if (TextFieldBrand.getText().equals("") || TextFieldModel.getText().equals("")
                || TextFieldColor.getText().equals("") || TextFieldYear.getText().equals("")
                || TextFieldSeatNumber.getText().equals("")
                || TextFieldLicensePlates.getText().equals("") || TextFieldOwnerName.getText().equals("")
                || TextFieldOwnerTelephoneNumbers.getText().equals("")
                || TextFieldOwnerEmailaddresses.getText().equals("")
                || TextFieldOwnerDriverlicense.getText().equals("")
                || TextFieldOwnerSocialSecuritynumber.getText().equals("")
                || TextFieldOwneraddress.getText().equals("")
                || TextFieldServicerecords.getText().equals("") || TextFieldWarrantyYear.getText().equals("")
                || jButtonImageUpload.getText().contains("Upload")) {
            JOptionPane.showMessageDialog(this, " One or more fields are empty, please check and retry");
            return;
        }
        //validation for Year
        if (TextFieldYear.getText().length() != 4) {
            JOptionPane.showMessageDialog(this, "Enter valid year, "
                    + "year should be of exact 4 digits");
            return;
        }
        //validation for seat Number
        if (TextFieldSeatNumber.getText().length() != 1) {
            JOptionPane.showMessageDialog(this, "Enter valid seatnumber, "
                    + "seatnumber should be in  single digits");
            return;
        }
        //validation for warrenty year
        if (TextFieldWarrantyYear.getText().length() != 4) {
            JOptionPane.showMessageDialog(this, "Enter valid warranty year, "
                    + "year should be of exact 4 digits");
            return;
        }

        //validation for phone number
        if (TextFieldOwnerTelephoneNumbers.getText().length() != 10) {
            JOptionPane.showMessageDialog(this, "Enter valid phone number, "
                    + "phone number should be of exact 10 digits");
            return;
        }

        // validation for SSN
        if (TextFieldOwnerSocialSecuritynumber.getText().length() != 9) {
            JOptionPane.showMessageDialog(this, "Enter valid SSN, "
                    + "SSN should be of exact 9 digits");
            return;
        }

        String brand = TextFieldBrand.getText();

        String model = TextFieldModel.getText();

        String color = TextFieldColor.getText();

        int year = Integer.parseInt(TextFieldYear.getText());

        int engineNo = Integer.parseInt(TextFieldEngineNo.getText());

        int seatsNumber = Integer.parseInt(TextFieldSeatNumber.getText());
        String licensePlates = TextFieldLicensePlates.getText();
        String ownerName = TextFieldOwnerName.getText();
        long ownerTelephoneNumbers = Long.parseLong(TextFieldOwnerTelephoneNumbers.getText());
        String ownerEmailAddresses = TextFieldOwnerEmailaddresses.getText();
        String ownerDriverLicense = TextFieldOwnerDriverlicense.getText();
        long ownerSocialSecurityNumber = Long.parseLong(TextFieldOwnerSocialSecuritynumber.getText());
        String ownerAddress = TextFieldOwneraddress.getText();
        String serviceRecords = TextFieldServicerecords.getText();
        int warrantyYear = Integer.parseInt(TextFieldWarrantyYear.getText());
        String photo = jButtonImageUpload.getText();

        checkEmailAddressAndSave(ownerEmailAddresses, brand, color, engineNo,
                licensePlates, model, ownerDriverLicense,
                ownerAddress, ownerName, ownerSocialSecurityNumber,
                ownerTelephoneNumbers, serviceRecords, seatsNumber,
                warrantyYear, year, photo);


    }//GEN-LAST:event_BtnSaveActionPerformed

    private void checkEmailAddressAndSave(String ownerEmailAddresses, String brand,
            String color, int engineNo, String licensePlates, String model,
            String ownerDriverLicense, String ownerAddress, String ownerName,
            long ownerSocialSecurityNumber, long ownerTelephoneNumbers,
            String serviceRecords, int seatsNumber, int warrantyYear, int year, String photo) {

        if (validateEmailAddress(ownerEmailAddresses)) {
            saveBtnCarDetailsSetter(brand, color, engineNo, licensePlates,
                    model, ownerDriverLicense, ownerAddress, ownerEmailAddresses,
                    ownerName, ownerSocialSecurityNumber, ownerTelephoneNumbers,
                    serviceRecords, seatsNumber, warrantyYear, year, photo);
            JOptionPane.showMessageDialog(this, "New Car details added.");
            resetTextFieldAfterSave();
        } else {
            JOptionPane.showMessageDialog(this, "Please use valid email, ex: jamesBond@gmail.com");
        }
    }

    private void saveBtnCarDetailsSetter(String brand, String color,
            int engineNo, String licensePlates, String model,
            String ownerDriverLicense, String ownerAddress,
            String ownerEmailAddresses, String ownerName,
            long ownerSocialSecurityNumber, long ownerTelephoneNumbers,
            String serviceRecords, int seatsNumber, int warrantyYear,
            int year, String photo) {

        Car C = history.addNewCarDetails();
        C.setBrand(brand);
        C.setColor(color);
        C.setEngineNo(engineNo);
        C.setLicensePlates(licensePlates);
        C.setModel(model);
        C.setOwnerDriverLicense(ownerDriverLicense);
        C.setOwnerAddress(ownerAddress);
        C.setOwnerEmailAddresses(ownerEmailAddresses);
        C.setOwnerName(ownerName);
        C.setOwnerSocialSecurityNumber(ownerSocialSecurityNumber);
        C.setOwnerTelephoneNumbers(ownerTelephoneNumbers);
        C.setServiceRecords(serviceRecords);
        C.setSeatsNumber(seatsNumber);
        C.setWarrantyYear(warrantyYear);
        C.setYear(year);
        C.setPhoto(photo.toString());

    }

    private void resetTextFieldAfterSave() {
        TextFieldBrand.setText("");
        TextFieldColor.setText("");
        TextFieldEngineNo.setText("");
        TextFieldLicensePlates.setText("");
        TextFieldModel.setText("");
        TextFieldOwnerDriverlicense.setText("");
        TextFieldOwnerEmailaddresses.setText("");
        TextFieldOwnerName.setText("");
        TextFieldOwnerSocialSecuritynumber.setText("");
        TextFieldOwnerTelephoneNumbers.setText("");
        TextFieldOwneraddress.setText("");
        TextFieldSeatNumber.setText("");
        TextFieldWarrantyYear.setText("");
        TextFieldServicerecords.setText("");
        TextFieldYear.setText("");
        jButtonImageUpload.setText("Upload");

    }

    private void TextFieldYearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldYearKeyPressed

        char c = evt.getKeyChar();

        if (Character.isDigit(c) || evt.getKeyCode() == deleteKeyCode) {
            TextFieldYear.setEditable(true);
        } else {
            TextFieldYear.setEditable(false);
            JOptionPane.showMessageDialog(this, "Please enter number(s) only, ex: 1995, 1998");
        }

    }//GEN-LAST:event_TextFieldYearKeyPressed

    private void TextFieldEngineNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldEngineNoKeyPressed

        char c = evt.getKeyChar();

        if (Character.isDigit(c) || evt.getKeyCode() == deleteKeyCode) {
            TextFieldEngineNo.setEditable(true);
        } else {
            TextFieldEngineNo.setEditable(false);
            JOptionPane.showMessageDialog(this, "Please enter number(s) only, ex: 245, 123");
        }

    }//GEN-LAST:event_TextFieldEngineNoKeyPressed

    private void TextFieldSeatNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldSeatNumberKeyPressed
        char c = evt.getKeyChar();

        if (Character.isDigit(c) || evt.getKeyCode() == deleteKeyCode) {
            TextFieldSeatNumber.setEditable(true);
        } else {
            TextFieldSeatNumber.setEditable(false);
            JOptionPane.showMessageDialog(this, "Please enter number(s) only, ex: 4, 5");
        }
    }//GEN-LAST:event_TextFieldSeatNumberKeyPressed

    private void TextFieldWarrantyYearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldWarrantyYearKeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c) || evt.getKeyCode() == deleteKeyCode) {
            TextFieldWarrantyYear.setEditable(true);
        } else {
            TextFieldWarrantyYear.setEditable(false);
            JOptionPane.showMessageDialog(this, "Please enter number(s) only, ex: 2026, 2029");
        }
    }//GEN-LAST:event_TextFieldWarrantyYearKeyPressed

    private void TextFieldOwnerTelephoneNumbersKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldOwnerTelephoneNumbersKeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c) || evt.getKeyCode() == deleteKeyCode) {
            TextFieldOwnerTelephoneNumbers.setEditable(true);
        } else {
            TextFieldOwnerTelephoneNumbers.setEditable(false);
            JOptionPane.showMessageDialog(this, "Please enter number only, ex: 6177770000");
        }
    }//GEN-LAST:event_TextFieldOwnerTelephoneNumbersKeyPressed

    private void TextFieldOwnerSocialSecuritynumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldOwnerSocialSecuritynumberKeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c)
                || evt.getKeyCode() == deleteKeyCode) {
            TextFieldOwnerSocialSecuritynumber.setEditable(true);
        } else {
            TextFieldOwnerSocialSecuritynumber.setEditable(false);
            JOptionPane.showMessageDialog(this, "Please enter number only, ex: 3600009088");
        }
    }//GEN-LAST:event_TextFieldOwnerSocialSecuritynumberKeyPressed

    private void TextFieldBrandKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldBrandKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)
                || allowListedKeyList.contains(evt.getKeyCode())) {
            TextFieldBrand.setEditable(true);

        } else {
            TextFieldBrand.setEditable(false);
            JOptionPane.showMessageDialog(this, "Please enter alphanumeric value only, ex: Mazda, Maruthi");

    }//GEN-LAST:event_TextFieldBrandKeyPressed
    }
    private void TextFieldModelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldModelKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetterOrDigit(c) || allowListedKeyList.contains(evt.getKeyCode()) || evt.getKeyCode() == hypehnKeyCode) {

            TextFieldModel.setEditable(true);

        } else {
            TextFieldModel.setEditable(false);
            JOptionPane.showMessageDialog(this, "Please enter alphanumeric value only, ex: Crv-5");

        }

    }//GEN-LAST:event_TextFieldModelKeyPressed

    private void TextFieldColorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldColorKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c) || allowListedKeyList.contains(evt.getKeyCode())) {
            TextFieldColor.setEditable(true);

        } else {
            TextFieldColor.setEditable(false);
            JOptionPane.showMessageDialog(this, "Please enter alphabets  only, ex: Red, Blue");
        }
    }//GEN-LAST:event_TextFieldColorKeyPressed

    private void TextFieldLicensePlatesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldLicensePlatesKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetterOrDigit(c) || allowListedKeyList.contains(evt.getKeyCode())) {
            TextFieldLicensePlates.setEditable(true);

        } else {
            TextFieldLicensePlates.setEditable(false);
            JOptionPane.showMessageDialog(this, "Please enter alphanumeric values only, ex: 3zh452");
        }
    }//GEN-LAST:event_TextFieldLicensePlatesKeyPressed

    private void TextFieldOwnerNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldOwnerNameKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c) || allowListedKeyList.contains(evt.getKeyCode())) {
            TextFieldOwnerName.setEditable(true);

        } else {
            TextFieldOwnerName.setEditable(false);
            JOptionPane.showMessageDialog(this, "Please enter alphabets  only, ex: Joe, Ram Prasad");
        }
    }//GEN-LAST:event_TextFieldOwnerNameKeyPressed

    private void TextFieldOwnerDriverlicenseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldOwnerDriverlicenseKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetterOrDigit(c) || allowListedKeyList.contains(evt.getKeyCode())) {
            TextFieldOwnerDriverlicense.setEditable(true);

        } else {
            TextFieldOwnerDriverlicense.setEditable(false);
            JOptionPane.showMessageDialog(this, "Please enter alphanumeric values only, ex: S12340");
        }
    }//GEN-LAST:event_TextFieldOwnerDriverlicenseKeyPressed

    private void TextFieldOwneraddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldOwneraddressKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetterOrDigit(c) || allowListedKeyList.contains(evt.getKeyCode())) {
            TextFieldOwneraddress.setEditable(true);

        } else {
            TextFieldOwneraddress.setEditable(false);
            JOptionPane.showMessageDialog(this, "Please enter alphanumeric values only");
        }
    }//GEN-LAST:event_TextFieldOwneraddressKeyPressed

    private void TextFieldServicerecordsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldServicerecordsKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetterOrDigit(c) || allowListedKeyList.contains(evt.getKeyCode())) {
            TextFieldServicerecords.setEditable(true);

        } else {
            TextFieldServicerecords.setEditable(false);
            JOptionPane.showMessageDialog(this, "Please enter alphanumeric values only, ex: Service done on 13-Feb");
        }
    }//GEN-LAST:event_TextFieldServicerecordsKeyPressed


    private void TextFieldBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldBrandActionPerformed
    }//GEN-LAST:event_TextFieldBrandActionPerformed

    private void TextFieldOwnerTelephoneNumbersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldOwnerTelephoneNumbersActionPerformed
    }//GEN-LAST:event_TextFieldOwnerTelephoneNumbersActionPerformed

    private void jButtonImageUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImageUploadActionPerformed
        JFileChooser imgSelector = new JFileChooser();

        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Only these extensions are supported",
                "jpg", "png", "jpeg", "gif");

        imgSelector.setFileFilter(extensionFilter);

        int selected = imgSelector.showOpenDialog(null);

        if (selected == JFileChooser.APPROVE_OPTION) {
            File file = imgSelector.getSelectedFile();
            String getselectedImage = file.getAbsolutePath();
            JOptionPane.showMessageDialog(null, "You have selected the following image" + getselectedImage);
            jButtonImageUpload.setText(getselectedImage);
        }
    }//GEN-LAST:event_jButtonImageUploadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSave;
    private javax.swing.JLabel LabelBrand1;
    private javax.swing.JLabel LabelColor1;
    private javax.swing.JLabel LabelEngineNo1;
    private javax.swing.JLabel LabelModel;
    private javax.swing.JLabel LabelOwnerName;
    private javax.swing.JLabel LabelPhoto;
    private javax.swing.JLabel LabelSeatsNumber1;
    private javax.swing.JLabel LabelYear;
    private javax.swing.JLabel LabellicensePlates;
    private javax.swing.JLabel LabelownerAddress;
    private javax.swing.JLabel LabelownerDriverLicense;
    private javax.swing.JLabel LabelownerEmailAddresses;
    private javax.swing.JLabel LabelownerSocialSecurityNumber1;
    private javax.swing.JLabel LabelownerTelephoneNumbers;
    private javax.swing.JLabel LabelserviceRecords1;
    private javax.swing.JLabel LabelwarrantyYear1;
    private javax.swing.JTextField TextFieldBrand;
    private javax.swing.JTextField TextFieldColor;
    private javax.swing.JTextField TextFieldEngineNo;
    private javax.swing.JTextField TextFieldLicensePlates;
    private javax.swing.JTextField TextFieldModel;
    private javax.swing.JTextField TextFieldOwnerDriverlicense;
    private javax.swing.JTextField TextFieldOwnerEmailaddresses;
    private javax.swing.JTextField TextFieldOwnerName;
    private javax.swing.JTextField TextFieldOwnerSocialSecuritynumber;
    private javax.swing.JTextField TextFieldOwnerTelephoneNumbers;
    private javax.swing.JTextField TextFieldOwneraddress;
    private javax.swing.JTextField TextFieldSeatNumber;
    private javax.swing.JTextField TextFieldServicerecords;
    private javax.swing.JTextField TextFieldWarrantyYear;
    private javax.swing.JTextField TextFieldYear;
    private javax.swing.JButton jButtonImageUpload;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    public boolean validateEmailAddress(String ownerEmailAddresses) {

        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(ownerEmailAddresses);

        return matcher.matches();

    }

}
