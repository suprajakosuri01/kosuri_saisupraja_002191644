package UI;

import Model.Car;
import Model.CardetailsHistory;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class DisplayJPanel extends javax.swing.JPanel {

    CardetailsHistory history;

    public DisplayJPanel(CardetailsHistory history) {
        initComponents();
        this.history = history;
        JTable jtable = jTabledisplay;
        loadCarDataIntoTable(jtable);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabledisplay = new javax.swing.JTable();
        LabelDisplayProfile = new javax.swing.JLabel();
        jLabelImage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 153));
        setPreferredSize(new java.awt.Dimension(700, 700));

        jTabledisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand", "Model", "Color", "Year", "EngineNo.", "SeatsNumber", "LicensePlates", "Owner Name", "Owner Telephone numbers", "OwnerEmailaddresses", "OwnerDriverLicense ", "Owner SocialSecuritynumber", "Owner address", "Service records", "Warrenty Year"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabledisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabledisplayMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabledisplay);
        if (jTabledisplay.getColumnModel().getColumnCount() > 0) {
            jTabledisplay.getColumnModel().getColumn(0).setResizable(false);
            jTabledisplay.getColumnModel().getColumn(1).setResizable(false);
            jTabledisplay.getColumnModel().getColumn(2).setResizable(false);
            jTabledisplay.getColumnModel().getColumn(3).setResizable(false);
            jTabledisplay.getColumnModel().getColumn(4).setResizable(false);
            jTabledisplay.getColumnModel().getColumn(5).setResizable(false);
            jTabledisplay.getColumnModel().getColumn(6).setResizable(false);
            jTabledisplay.getColumnModel().getColumn(7).setResizable(false);
            jTabledisplay.getColumnModel().getColumn(8).setResizable(false);
            jTabledisplay.getColumnModel().getColumn(9).setResizable(false);
            jTabledisplay.getColumnModel().getColumn(10).setResizable(false);
            jTabledisplay.getColumnModel().getColumn(11).setResizable(false);
            jTabledisplay.getColumnModel().getColumn(12).setResizable(false);
            jTabledisplay.getColumnModel().getColumn(13).setResizable(false);
        }

        LabelDisplayProfile.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        LabelDisplayProfile.setText("                                                          Display  Profile");
        LabelDisplayProfile.setToolTipText("");
        LabelDisplayProfile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LabelDisplayProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 1014, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(LabelDisplayProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTabledisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabledisplayMouseClicked
        int row = jTabledisplay.getSelectedRow();
        Car c = history.getHistory().get(row);
        renderCarImage(c.getPhoto());
    }//GEN-LAST:event_jTabledisplayMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelDisplayProfile;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabledisplay;
    // End of variables declaration//GEN-END:variables
private void loadCarDataIntoTable(JTable jtable) {
        DefaultTableModel model = (DefaultTableModel) jTabledisplay.getModel();
        model.setRowCount(0);
        for (Car C : history.getHistory()) {
            model.addRow(new Object[]{
                C.getBrand(),
                C.getModel(),
                C.getColor(),
                C.getYear(),
                C.getEngineNo(),
                C.getSeatsNumber(),
                C.getLicensePlates(),
                C.getOwnerName(),
                C.getOwnerTelephoneNumbers(),
                C.getOwnerEmailAddresses(),
                C.getOwnerDriverLicense(),
                C.getOwnerSocialSecurityNumber(),
                C.getOwnerAddress(),
                C.getServiceRecords(),
                C.getWarrantyYear(),});
        }
        jtable.setModel(model);
        jtable.getTableHeader().setReorderingAllowed(false);
        jtable.setRowHeight(40);

    }

    private void renderCarImage(String absPathOfPhoto) {
        ImageIcon imgIcon = new ImageIcon(absPathOfPhoto);
        Image image = imgIcon.getImage();
        Image fitImageToLabel = image.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        jLabelImage.setIcon(new ImageIcon(fitImageToLabel));
    }

}
