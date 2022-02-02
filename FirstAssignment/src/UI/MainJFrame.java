package UI;

import Model.CardetailsHistory;

/**
 *
 * @author suprajakosuri
 */
public class MainJFrame extends javax.swing.JFrame {

    CardetailsHistory history;

    public MainJFrame() {
        initComponents();
        history = new CardetailsHistory();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPane = new javax.swing.JSplitPane();
        Pnlcontrol = new javax.swing.JPanel();
        BtnCreate = new javax.swing.JButton();
        BtnDisplay = new javax.swing.JButton();
        PnlWork = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));
        setForeground(new java.awt.Color(255, 153, 153));

        SplitPane.setBackground(new java.awt.Color(255, 153, 153));

        Pnlcontrol.setBackground(new java.awt.Color(255, 153, 153));

        BtnCreate.setText("Create");
        BtnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreateActionPerformed(evt);
            }
        });

        BtnDisplay.setText("Display");
        BtnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDisplayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlcontrolLayout = new javax.swing.GroupLayout(Pnlcontrol);
        Pnlcontrol.setLayout(PnlcontrolLayout);
        PnlcontrolLayout.setHorizontalGroup(
            PnlcontrolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlcontrolLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PnlcontrolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnCreate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnDisplay, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        PnlcontrolLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BtnCreate, BtnDisplay});

        PnlcontrolLayout.setVerticalGroup(
            PnlcontrolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlcontrolLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(BtnCreate)
                .addGap(83, 83, 83)
                .addComponent(BtnDisplay)
                .addContainerGap(323, Short.MAX_VALUE))
        );

        PnlcontrolLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BtnCreate, BtnDisplay});

        SplitPane.setLeftComponent(Pnlcontrol);

        PnlWork.setBackground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout PnlWorkLayout = new javax.swing.GroupLayout(PnlWork);
        PnlWork.setLayout(PnlWorkLayout);
        PnlWorkLayout.setHorizontalGroup(
            PnlWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
        );
        PnlWorkLayout.setVerticalGroup(
            PnlWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );

        SplitPane.setRightComponent(PnlWork);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SplitPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateActionPerformed
        // TODO add your handling code here:
        CreateJPanel createpanel = new CreateJPanel(history);
        SplitPane.setRightComponent(createpanel);
    }//GEN-LAST:event_BtnCreateActionPerformed

    private void BtnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDisplayActionPerformed
        // TODO add your handling code here:
        DisplayJPanel displaypanel = new DisplayJPanel(history);
        SplitPane.setRightComponent(displaypanel);
    }//GEN-LAST:event_BtnDisplayActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCreate;
    private javax.swing.JButton BtnDisplay;
    private javax.swing.JPanel PnlWork;
    private javax.swing.JPanel Pnlcontrol;
    private javax.swing.JSplitPane SplitPane;
    // End of variables declaration//GEN-END:variables
}
