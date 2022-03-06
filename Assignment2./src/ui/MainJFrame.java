
package ui;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Car;
import model.Fleet;


public class MainJFrame extends javax.swing.JFrame {
    private Fleet carFleet;
    String header[] = {"Manufacturer", "Model", "Year", "Seats", "Location","Seraial Number", "Availability", "Maintenance Certificate"};
    String header1[] ={"Manufacturer"};
    
    DefaultTableModel tableModel;
    
    DefaultTableModel manufacturerTable;
    int row,col;
    
    public MainJFrame() {
        initComponents();
        //carlist = new ArrayList<>();
        carFleet = new Fleet();
        tableModel = new DefaultTableModel(header,0);
        manufacturerTable = new DefaultTableModel(header1,0);
        tblCars.setModel(tableModel);
        jTable1.setModel(manufacturerTable);
        showTime();
    }
    
    void showTime()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        jTextField8.setText(dtf.format(now));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblManufacturer = new javax.swing.JLabel();
        lblModel = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        lblValidity = new javax.swing.JLabel();
        lblSeats = new javax.swing.JLabel();
        lblAvailability = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        lblSerialNumber = new javax.swing.JLabel();
        txtManufacturer = new javax.swing.JTextField();
        txtSerialNumber = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        txtYear = new javax.swing.JComboBox<>();
        txtSeats = new javax.swing.JComboBox<>();
        txtLocation = new javax.swing.JComboBox<>();
        radioAvailYes = new javax.swing.JRadioButton();
        radiovalid = new javax.swing.JRadioButton();
        radioAvailNo = new javax.swing.JRadioButton();
        radioExpired = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCars = new javax.swing.JTable();
        btnAddcar = new javax.swing.JButton();
        btnUpdateCar = new javax.swing.JButton();
        btnDeleteCar = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSearchManufacturer = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSearchModel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblSeats1 = new javax.swing.JLabel();
        txtSearchSno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboBoxMinSeats = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        comboBoxMaxSeats = new javax.swing.JComboBox<>();
        btnFirstAvailableCar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        comboBoxSearchYear = new javax.swing.JComboBox<>();
        comboBoxsearchCity = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnGetManufacturers = new javax.swing.JButton();
        btnAvailableCarsCount = new javax.swing.JButton();
        btnUnavailableCarCount = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        comboMaintenanceValid = new javax.swing.JRadioButton();
        comboMaintenaceExpired = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Fleet Management");

        lblManufacturer.setText("Manufacturer");

        lblModel.setText("Model");

        lblYear.setText("Year");

        lblValidity.setText("Maintenance Valididty");

        lblSeats.setText("Seats");

        lblAvailability.setText("Availability");

        lblLocation.setText("Location");

        lblSerialNumber.setText("Serial Number");

        txtYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Null", "2015", "2016", "2017", "2018", "2019", "2020", "2021" }));
        txtYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearActionPerformed(evt);
            }
        });

        txtSeats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Null", "1", "2", "3", "4", "5", "6", "7" }));
        txtSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeatsActionPerformed(evt);
            }
        });

        txtLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Null", "Boston", "Cambridge", "Malden", "Woburn", "Burlington" }));
        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });

        radioAvailYes.setText("YES");

        radiovalid.setText("Valid");

        radioAvailNo.setText("NO");

        radioExpired.setText("Expired");

        tblCars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Manufacturer", "Model", "Year", "Seats", "Location", "Serail Number", "Availability", "Maintenance Validity"
            }
        ));
        tblCars.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCarsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCars);

        btnAddcar.setText("ADD");
        btnAddcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddcarActionPerformed(evt);
            }
        });

        btnUpdateCar.setText("Update Car");
        btnUpdateCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCarActionPerformed(evt);
            }
        });

        btnDeleteCar.setText("Delete Car");
        btnDeleteCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCarActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnView.setText("View Cars");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        jLabel1.setText("Manufacturer");

        jLabel2.setText("Model");

        jLabel3.setText("Year");

        lblSeats1.setText("Serial Number");

        txtSearchSno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchSnoActionPerformed(evt);
            }
        });

        jLabel4.setText("City");

        jLabel5.setText("Min Seats");

        comboBoxMinSeats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Null", "1", "2", "3", "4", "5", "6", "7" }));

        jLabel6.setText("Max Seats");

        comboBoxMaxSeats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Null", "1", "2", "3", "4", "5", "6", "7" }));

        btnFirstAvailableCar.setText("First Available Car");
        btnFirstAvailableCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstAvailableCarActionPerformed(evt);
            }
        });

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel9.setText("Time Stamp");

        comboBoxSearchYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Null", "2015", "2016", "2017", "2018", "2019" }));

        comboBoxsearchCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Null", "Boston", "New York", "Dallas", "Seatle" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Manufacturer"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        btnGetManufacturers.setText("View");
        btnGetManufacturers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetManufacturersActionPerformed(evt);
            }
        });

        btnAvailableCarsCount.setText("Count of Available Cars");
        btnAvailableCarsCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailableCarsCountActionPerformed(evt);
            }
        });

        btnUnavailableCarCount.setText("Count of Unavailable Cars");
        btnUnavailableCarCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnavailableCarCountActionPerformed(evt);
            }
        });

        jLabel10.setText("Maintenance");

        comboMaintenanceValid.setText("Valid");

        comboMaintenaceExpired.setText("Expired");
        comboMaintenaceExpired.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMaintenaceExpiredActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblValidity)
                    .addComponent(lblAvailability)
                    .addComponent(lblSeats)
                    .addComponent(lblLocation)
                    .addComponent(lblSerialNumber)
                    .addComponent(lblYear)
                    .addComponent(lblModel)
                    .addComponent(lblManufacturer))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(radiovalid, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioExpired, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(radioAvailYes, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioAvailNo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSerialNumber)
                    .addComponent(txtModel)
                    .addComponent(txtManufacturer)
                    .addComponent(txtYear, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSeats, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLocation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(comboBoxSearchYear, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSeats1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtSearchManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSearchModel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearchSno, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnFirstAvailableCar)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(123, 123, 123)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboMaintenanceValid, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addComponent(jLabel9))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboMaintenaceExpired, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(comboBoxsearchCity, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboBoxMinSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(comboBoxMaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGetManufacturers, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnAddcar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateCar)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteCar)
                .addGap(18, 18, 18)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnView)
                .addGap(165, 165, 165)
                .addComponent(jLabel7)
                .addGap(74, 74, 74)
                .addComponent(btnAvailableCarsCount, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUnavailableCarCount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(70, 70, 70))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblManufacturer))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblModel)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblYear)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSeats)
                            .addComponent(txtSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLocation)
                            .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSerialNumber)
                            .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAvailability)
                            .addComponent(radioAvailYes)
                            .addComponent(radioAvailNo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValidity)
                            .addComponent(radioExpired)
                            .addComponent(radiovalid)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddcar)
                            .addComponent(btnUpdateCar)
                            .addComponent(btnDeleteCar)
                            .addComponent(btnClear)
                            .addComponent(btnView))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFirstAvailableCar)
                            .addComponent(jLabel9)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAvailableCarsCount)
                            .addComponent(btnUnavailableCarCount))))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGetManufacturers)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtSearchManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtSearchModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(comboBoxMinSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(comboBoxMaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(comboBoxSearchYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSeats1)
                            .addComponent(txtSearchSno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(comboBoxsearchCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(comboMaintenanceValid)
                            .addComponent(comboMaintenaceExpired))
                        .addGap(37, 37, 37)
                        .addComponent(btnSearch)
                        .addGap(23, 23, 23))))
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1204, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void btnAddcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddcarActionPerformed
        // TODO add your handling code here:
        String manufacturer = txtManufacturer.getText();
        String model = txtModel.getText();
        String serialNumber = txtSerialNumber.getText();
        String city = txtLocation.getSelectedItem().toString();
        String strYear = txtYear.getSelectedItem().toString();
        String strSeats = txtSeats.getSelectedItem().toString();
        String availability = avail();
        String maintenance = maintenance();
        
        
        if(manufacturer.equals("") || model.equals("") || serialNumber.equals("")|| availability.equals("") || maintenance.equals("") || city.equals("Null") || strYear.equals("Null") || strSeats.equals("Null")){
            JOptionPane.showConfirmDialog(this, "One or more fields are empty!! please check", "Data Error", 2,2);
            return;
        }
        
        if( ! carFleet.verifySerialNumber(serialNumber)){
            JOptionPane.showConfirmDialog(this, "A car with same serial number already exists.!! please check", "Serial Number Error", 2,2);
            return;
        }
        
        int year = Integer.parseInt(strYear);
        int seats = Integer.parseInt(strSeats);
        
        Car car = new Car(manufacturer,seats, model, serialNumber, year, city, availability, maintenance);
        carFleet.addCar(car);
        displayTable(carFleet.getCarList());
        JOptionPane.showConfirmDialog(this, "Car Data Added Successfully..!", "Successfully added Car", 2,1);
        showTime();
        clearAdd();
           
    }//GEN-LAST:event_btnAddcarActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
       
        
        displayTable(carFleet.getCarList());
 
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnAvailableCarsCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailableCarsCountActionPerformed
        
        List<Car> avaialbleCars = carFleet.getAvailableCars();
        displayTable(avaialbleCars);
        jTextField6.setText(String.valueOf(avaialbleCars.size()));
        
        
    }//GEN-LAST:event_btnAvailableCarsCountActionPerformed

    private void btnUnavailableCarCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnavailableCarCountActionPerformed
        
        List<Car> unAvaialbleCars = carFleet.getUnAvailableCars();
        displayTable(unAvaialbleCars);
        jTextField7.setText(String.valueOf(unAvaialbleCars.size()));
        
    }//GEN-LAST:event_btnUnavailableCarCountActionPerformed

    private void btnFirstAvailableCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstAvailableCarActionPerformed
        
        displayTable(carFleet.getFirstAvailableCar());
        
    }//GEN-LAST:event_btnFirstAvailableCarActionPerformed

    private void btnGetManufacturersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetManufacturersActionPerformed
       
        
        manufacturerTable.setRowCount(0);
        
        for(String manufacturer : carFleet.getManufactutrers()){
            
            Object[] manufacturerObject = {manufacturer};
            manufacturerTable.addRow(manufacturerObject);
        }
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<DefaultTableModel>(manufacturerTable);
        jTable1.setRowSorter(trs);
        
          
    }//GEN-LAST:event_btnGetManufacturersActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        
        String manufacturer = txtSearchManufacturer.getText();
        String model = txtSearchModel.getText();
        String year = comboBoxSearchYear.getSelectedItem().toString();
        String minSeats = comboBoxMinSeats.getSelectedItem().toString();
        String maxSeats = comboBoxMaxSeats.getSelectedItem().toString();
        String serialNumber = txtSearchSno.getText();
        String city = comboBoxsearchCity.getSelectedItem().toString();
        
        String maintenance = "";
        
        if (comboMaintenanceValid.isSelected()){
            
            maintenance = "VALID";
        }
        if (comboMaintenaceExpired.isSelected()){
            maintenance = "EXPIRED";
        }
       
        
        List<Car> searchedCars = new ArrayList<Car>();
       
        for(Car car: carFleet.getCarList()){
            
            
            if(!manufacturer.equals("") && !manufacturer.equals(car.getManufacturer()))
            {
                continue;
            }
            
            if(!model.equals("") && !model.equals(car.getModel()))
            {
                continue;
            }
          
            if(!year.equals("Null") && !year.equals(String.valueOf(car.getYear())))
            {
                continue;
            }
            if(!serialNumber.equals("") && !serialNumber.equals(car.getSerialNumber()))
            {
                continue;
            }
            if(!minSeats.equals("Null") && Integer.parseInt(minSeats) > car.getSeats())
            {
                continue;
            }
            
            if(!maxSeats.equals("Null") && Integer.parseInt(maxSeats) < car.getSeats())
            {
                continue;
            }
            if(!city.equals("Null") && !city.equals(car.getCity()))
            {
                continue;
            }
            if(!maintenance.equals("") && !maintenance.equals(car.getMaintenanceCertificate()))
            {
                continue;
            }
           
            searchedCars.add(car);
        }
        
        displayTable(searchedCars);
        
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCarActionPerformed
        // TODO add your handling code here:
        
        String updatemanufacturer = txtManufacturer.getText();
        String updatemodel = txtModel.getText();
        String updateserialNumber = txtSerialNumber.getText();
        String updatecity = txtLocation.getSelectedItem().toString();
        String strUpdateyear = txtYear.getSelectedItem().toString();
        String strUpdateseats = txtSeats.getSelectedItem().toString();
        String updateavailability = avail();
        String updatemaintenance = maintenance();
        
        
        if(updatemanufacturer.equals("") || updatemodel.equals("") || updateserialNumber.equals("")|| updateavailability.equals("") || updatemaintenance.equals("") || updatecity.equals("Null") || strUpdateyear.equals("Null") || strUpdateseats.equals("Null")){
            JOptionPane.showConfirmDialog(this, "One or more fields are empty!! please check", "Data Error", 2,2);
            return;
        }
        
        
        if( ! carFleet.verifySerialNumber(updateserialNumber)){
            JOptionPane.showConfirmDialog(this, "A car with same serial number already exists.!! please check", "Serial Number Error ", 2,2);
            return;
        }
        
        int updateyear = Integer.parseInt(strUpdateyear);
        int updateseats = Integer.parseInt(strUpdateseats);
        
        carFleet.getCarList().get(row).setManufacturer(updatemanufacturer);
        carFleet.getCarList().get(row).setSeats(updateseats);
        carFleet.getCarList().get(row).setModel(updatemodel);
        carFleet.getCarList().get(row).setCity(updatecity);
        carFleet.getCarList().get(row).setYear(updateyear);
        carFleet.getCarList().get(row).setSerialNumber(updateserialNumber);
        carFleet.getCarList().get(row).setAvail(updateavailability);
        carFleet.getCarList().get(row).setMaintenanceCertificate(updatemaintenance);
        
        
        displayTable(carFleet.getCarList());     
        JOptionPane.showConfirmDialog(this, "Car Data update Successfully..!", "Updated Car", 2, 1);
        
        showTime();
        
        
    }//GEN-LAST:event_btnUpdateCarActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        tableModel.setRowCount(0);
        
        
        jTextField6.setText("");
        jTextField7.setText("");    
        
        txtManufacturer.setText("");
        txtModel.setText("");
        txtSerialNumber.setText("");
        
        txtLocation.setSelectedIndex(0);
        
        txtYear.setSelectedIndex(0);
        
        txtSeats.setSelectedIndex(0);
        radiovalid.setSelected(false);
        radioExpired.setSelected(false);
        radioAvailYes.setSelected(false);
        radioAvailNo.setSelected(false);
        
        txtSearchManufacturer.setText("");
        txtSearchModel.setText("");
        txtSearchSno.setText("");
        comboBoxMinSeats.setSelectedIndex(0);
        comboBoxSearchYear.setSelectedIndex(0);
        comboBoxMaxSeats.setSelectedIndex(0);
        comboBoxsearchCity.setSelectedIndex(0);
        comboMaintenanceValid.setSelected(false);
        comboMaintenaceExpired.setSelected(false);
        
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void tblCarsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCarsMouseClicked
        
        clearAdd();
        
        row = tblCars.getSelectedRow();
        col = tblCars.getColumnCount();

        txtManufacturer.setText(tableModel.getValueAt(row,0).toString());
        txtModel.setText(tableModel.getValueAt(row,1).toString());
        txtYear.setSelectedItem(tableModel.getValueAt(row,2).toString());
        txtSeats.setSelectedItem(tableModel.getValueAt(row,3).toString());
        txtLocation.setSelectedItem(tableModel.getValueAt(row,4).toString());
        txtSerialNumber.setText(tableModel.getValueAt(row,5).toString());
        if (tableModel.getValueAt(row,6).toString().equals("YES"))
        {
            radioAvailYes.doClick();
        }
        if (tableModel.getValueAt(row,6).toString().equals("NO"))
        {
            radioAvailNo.doClick();
        }
        if (tableModel.getValueAt(row,7).toString().equals("EXPIRED"))
        {
            radioExpired.doClick();
        }
        if (tableModel.getValueAt(row,7).toString().equals("VALID"))
        {
            
            radiovalid.doClick();
        }
       
    }//GEN-LAST:event_tblCarsMouseClicked

    private void txtSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeatsActionPerformed

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed

    private void btnDeleteCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCarActionPerformed
        int dialog = JOptionPane.YES_NO_OPTION;
        int dialogRes = JOptionPane.showConfirmDialog(this, "Delete Car Data", "Delete", dialog);
        if (dialogRes == 0)
        {
            tableModel.removeRow(row);
            carFleet.getCarList().remove(row);
            tableModel.setRowCount(0);
            displayTable(carFleet.getCarList());
        }
        
        showTime();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteCarActionPerformed

    private void comboMaintenaceExpiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMaintenaceExpiredActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMaintenaceExpiredActionPerformed

    private void txtSearchSnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchSnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchSnoActionPerformed

    private void txtYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddcar;
    private javax.swing.JButton btnAvailableCarsCount;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDeleteCar;
    private javax.swing.JButton btnFirstAvailableCar;
    private javax.swing.JButton btnGetManufacturers;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUnavailableCarCount;
    private javax.swing.JButton btnUpdateCar;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> comboBoxMaxSeats;
    private javax.swing.JComboBox<String> comboBoxMinSeats;
    private javax.swing.JComboBox<String> comboBoxSearchYear;
    private javax.swing.JComboBox<String> comboBoxsearchCity;
    private javax.swing.JRadioButton comboMaintenaceExpired;
    private javax.swing.JRadioButton comboMaintenanceValid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lblAvailability;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblManufacturer;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblSeats;
    private javax.swing.JLabel lblSeats1;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblValidity;
    private javax.swing.JLabel lblYear;
    private javax.swing.JRadioButton radioAvailNo;
    private javax.swing.JRadioButton radioAvailYes;
    private javax.swing.JRadioButton radioExpired;
    private javax.swing.JRadioButton radiovalid;
    private javax.swing.JTable tblCars;
    private javax.swing.JComboBox<String> txtLocation;
    private javax.swing.JTextField txtManufacturer;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtSearchManufacturer;
    private javax.swing.JTextField txtSearchModel;
    private javax.swing.JTextField txtSearchSno;
    private javax.swing.JComboBox<String> txtSeats;
    private javax.swing.JTextField txtSerialNumber;
    private javax.swing.JComboBox<String> txtYear;
    // End of variables declaration//GEN-END:variables

    private String avail() {
         //To change body of generated methods, choose Tools | Templates.
         
         if(radioAvailYes.isSelected()) 
         {
             return "YES";
         }
        
         else if(radioAvailNo.isSelected()) 
         {
             return "NO";
         }
         else{
             return "";
         }
   
    }

    private String maintenance() {
        //To change body of generated methods, choose Tools | Templates.
        if(radiovalid.isSelected()){ 
            return "VALID";
        }
        else if(radioExpired.isSelected()) 
         {
             return "EXPIRED";
         }
         else{
             return "";
         }
   
    }
    
    public void displayTable(List<Car> cars){
        
        tableModel.setRowCount(0);
        
        for(Car car : cars){
            
            Object[] carObject = {car.getManufacturer(),car.getModel(),car.getYear(), car.getSeats(), car.getCity(), car.getSerialNumber(),car.getAvail(),car.getMaintenanceCertificate()};
            tableModel.addRow(carObject);
        }
        
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<DefaultTableModel>(tableModel);
        tblCars.setRowSorter(trs);
    }
    
     public void clearAdd(){
        txtManufacturer.setText("");
        txtModel.setText("");
        txtSerialNumber.setText("");
        
        txtLocation.setSelectedIndex(0);
        
        txtYear.setSelectedIndex(0);
        
        txtSeats.setSelectedIndex(0);
        radiovalid.setSelected(false);
        radioExpired.setSelected(false);
        radioAvailYes.setSelected(false);
        radioAvailNo.setSelected(false);
        

        
    }
        
}
