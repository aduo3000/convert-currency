/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adam.convertcurrency;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Adam Bodie
 */
public class CNYinfo extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form CNYinfo
     */
    static String cny01fc = "CNY01fc";
    static String cny02fc = "CNY02fc";
    static String cny05fc = "CNY05fc";
    static String cny1fc = "CNY1fc";
    static String cny5fc = "CNY5fc";
    static String cny1c = "CNY1c";
    static String cny1f = "CNY1f";
    static String cny2f = "CNY2f";
    static String cny5f = "CNY5f";
    static String cny1 = "CNY1";
    static String cny2 = "CNY2";
    static String cny5 = "CNY5";
    static String cny10 = "CNY10";
    static String cny20 = "CNY20";
    static String cny50 = "CNY50";
    static String cny100 = "CNY100";
    private static Component JFrame;
    
    public CNYinfo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cnyButtonGroup = new javax.swing.ButtonGroup();
        cnyInfoTab = new javax.swing.JTabbedPane();
        infoTab = new javax.swing.JPanel();
        radioButton5fb = new javax.swing.JRadioButton(cny5f);
        radioButton1b = new javax.swing.JRadioButton(cny1);
        radioButton5b = new javax.swing.JRadioButton(cny5);
        radioButton10b = new javax.swing.JRadioButton(cny10);
        radioButton20b = new javax.swing.JRadioButton(cny20);
        banknotePicture = new javax.swing.JLabel(createImageIcon(""));
        jSeparator1 = new javax.swing.JSeparator();
        coin = new javax.swing.JLabel();
        radioButton05fc = new javax.swing.JRadioButton(cny05fc);
        radioButton1fc = new javax.swing.JRadioButton(cny1fc);
        radioButton5fc = new javax.swing.JRadioButton(cny5fc);
        radioButton1c = new javax.swing.JRadioButton(cny1c);
        radioButton1fb = new javax.swing.JRadioButton(cny1f);
        radioButton2fb = new javax.swing.JRadioButton(cny2f);
        coinPicture = new javax.swing.JLabel();
        banknote = new javax.swing.JLabel();
        radioButton50b = new javax.swing.JRadioButton(cny50);
        radioButton100b = new javax.swing.JRadioButton(cny100);
        radioButton02fc = new javax.swing.JRadioButton(cny02fc);
        radioButton2b = new javax.swing.JRadioButton(cny2);
        radioButton01fc = new javax.swing.JRadioButton(cny01fc);
        userTab = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        officialUserLabel = new javax.swing.JLabel();
        unofficialUserLabel = new javax.swing.JLabel();
        chLabel = new javax.swing.JLabel();
        burLabel = new javax.swing.JLabel();
        hkLabel = new javax.swing.JLabel();
        macLabel = new javax.swing.JLabel();
        nkLabel = new javax.swing.JLabel();
        zimLabel = new javax.swing.JLabel();
        otherTab = new javax.swing.JPanel();
        isoLabel2 = new javax.swing.JLabel();
        bankLabel2 = new javax.swing.JLabel();
        pegLabel2 = new javax.swing.JLabel();
        inflationLabel2 = new javax.swing.JLabel();
        subunitLabel2 = new javax.swing.JLabel();
        isoLabel = new javax.swing.JLabel();
        bankLabel = new javax.swing.JLabel();
        pegLabel = new javax.swing.JLabel();
        inflationLabel = new javax.swing.JLabel();
        printerLabel = new javax.swing.JLabel();
        subunitLabel = new javax.swing.JLabel();
        printerLabel2 = new javax.swing.JLabel();
        subunitLabel3 = new javax.swing.JLabel();
        subunitLabel4 = new javax.swing.JLabel();
        cnyInfoTitle = new javax.swing.JLabel();

        setTitle("Chinese Yuan");

        cnyButtonGroup.add(radioButton5fb);
        radioButton5fb.setText("¥0.5");
        radioButton5fb.setActionCommand(cny5f);
        radioButton5fb.addActionListener(this);

        cnyButtonGroup.add(radioButton1b);
        radioButton1b.setText("¥1");
        radioButton1b.setActionCommand(cny1);
        radioButton1b.addActionListener(this);

        cnyButtonGroup.add(radioButton5b);
        radioButton5b.setText("¥5");
        radioButton5b.setActionCommand(cny5);
        radioButton5b.addActionListener(this);

        cnyButtonGroup.add(radioButton10b);
        radioButton10b.setText("¥10");
        radioButton10b.setActionCommand(cny10);
        radioButton10b.addActionListener(this);

        cnyButtonGroup.add(radioButton20b);
        radioButton20b.setText("¥20");
        radioButton20b.setActionCommand(cny20);
        radioButton20b.addActionListener(this);

        banknotePicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        coin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        coin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coin.setText("Coin");

        cnyButtonGroup.add(radioButton05fc);
        radioButton05fc.setText("¥0.05");
        radioButton05fc.setActionCommand(cny05fc);
        radioButton05fc.addActionListener(this);

        cnyButtonGroup.add(radioButton1fc);
        radioButton1fc.setText("¥0.1");
        radioButton1fc.setActionCommand(cny1fc);
        radioButton1fc.addActionListener(this);

        cnyButtonGroup.add(radioButton5fc);
        radioButton5fc.setText("¥0.5");
        radioButton5fc.setActionCommand(cny5fc);
        radioButton5fc.addActionListener(this);

        cnyButtonGroup.add(radioButton1c);
        radioButton1c.setText("¥1");
        radioButton1c.setActionCommand(cny1c);
        radioButton1c.addActionListener(this);

        cnyButtonGroup.add(radioButton1fb);
        radioButton1fb.setText("¥0.1");
        radioButton1fb.setActionCommand(cny1f);
        radioButton1fb.addActionListener(this);

        cnyButtonGroup.add(radioButton2fb);
        radioButton2fb.setText("¥0.2");
        radioButton2fb.setActionCommand(cny2f);
        radioButton2fb.addActionListener(this);

        coinPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        banknote.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        banknote.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        banknote.setText("Banknote");

        cnyButtonGroup.add(radioButton50b);
        radioButton50b.setText("¥50");
        radioButton50b.setActionCommand(cny50);
        radioButton50b.addActionListener(this);

        cnyButtonGroup.add(radioButton100b);
        radioButton100b.setText("¥100");
        radioButton100b.setActionCommand(cny100);
        radioButton100b.addActionListener(this);

        cnyButtonGroup.add(radioButton02fc);
        radioButton02fc.setText("¥0.02");
        radioButton02fc.setActionCommand(cny02fc);
        radioButton02fc.addActionListener(this);

        cnyButtonGroup.add(radioButton2b);
        radioButton2b.setText("¥2");
        radioButton2b.setActionCommand(cny2);
        radioButton2b.addActionListener(this);

        cnyButtonGroup.add(radioButton01fc);
        radioButton01fc.setText("¥0.01");
        radioButton01fc.setActionCommand(cny01fc);
        radioButton01fc.addActionListener(this);

        javax.swing.GroupLayout infoTabLayout = new javax.swing.GroupLayout(infoTab);
        infoTab.setLayout(infoTabLayout);
        infoTabLayout.setHorizontalGroup(
            infoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(infoTabLayout.createSequentialGroup()
                .addGroup(infoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoTabLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(banknotePicture, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(infoTabLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(radioButton1fb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButton2fb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButton5fb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButton1b)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButton2b)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButton5b)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButton10b)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButton20b)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButton50b)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButton100b))
                    .addGroup(infoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(coin, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(infoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(infoTabLayout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(radioButton01fc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButton02fc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButton05fc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButton1fc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButton5fc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButton1c))
                            .addGroup(infoTabLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(coinPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(infoTabLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(banknote, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        infoTabLayout.setVerticalGroup(
            infoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(banknote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(infoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButton5fb)
                    .addComponent(radioButton1b)
                    .addComponent(radioButton5b)
                    .addComponent(radioButton10b)
                    .addComponent(radioButton20b)
                    .addComponent(radioButton50b)
                    .addComponent(radioButton100b)
                    .addComponent(radioButton2fb)
                    .addComponent(radioButton1fb)
                    .addComponent(radioButton2b))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(banknotePicture, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(coin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(infoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButton05fc)
                    .addComponent(radioButton1fc)
                    .addComponent(radioButton5fc)
                    .addComponent(radioButton1c)
                    .addComponent(radioButton02fc)
                    .addComponent(radioButton01fc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(coinPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        cnyInfoTab.addTab("Info", infoTab);

        officialUserLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        officialUserLabel.setText("Official Users");

        unofficialUserLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        unofficialUserLabel.setText("Unofficial Users");

        chLabel.setText("China");

        burLabel.setText("Burma");

        hkLabel.setText("Hong Kong");

        macLabel.setText("Macau");

        nkLabel.setText("North Korea");

        zimLabel.setText("Zimbabwe");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(macLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(nkLabel))
                    .addComponent(zimLabel)
                    .addComponent(officialUserLabel)
                    .addComponent(chLabel)
                    .addComponent(unofficialUserLabel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(hkLabel)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(burLabel))))
                .addGap(280, 280, 280))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(officialUserLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chLabel)
                .addGap(18, 18, 18)
                .addComponent(unofficialUserLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(burLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hkLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(macLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nkLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zimLabel)
                .addGap(245, 245, 245))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout userTabLayout = new javax.swing.GroupLayout(userTab);
        userTab.setLayout(userTabLayout);
        userTabLayout.setHorizontalGroup(
            userTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
        );
        userTabLayout.setVerticalGroup(
            userTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );

        cnyInfoTab.addTab("Users", userTab);

        isoLabel2.setText("CNY");

        bankLabel2.setText("People's Bank of China");

        pegLabel2.setText("Partially, to a basket of trade-weighted international currencies");

        inflationLabel2.setText("1.7%");

        subunitLabel2.setText("1 (yuán)");

        isoLabel.setText("ISO 4217 Code:");

        bankLabel.setText("Central Bank:");

        pegLabel.setText("Pegged by:");

        inflationLabel.setText("Inflation:");

        printerLabel.setText("Printer:");

        subunitLabel.setText("Subunit:");

        printerLabel2.setText("China Banknote Printing and Minting");

        subunitLabel3.setText("1/10 (jiǎo)");

        subunitLabel4.setText("1/100 (fēn)");

        javax.swing.GroupLayout otherTabLayout = new javax.swing.GroupLayout(otherTab);
        otherTab.setLayout(otherTabLayout);
        otherTabLayout.setHorizontalGroup(
            otherTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otherTabLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(otherTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(otherTabLayout.createSequentialGroup()
                        .addComponent(pegLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pegLabel2))
                    .addGroup(otherTabLayout.createSequentialGroup()
                        .addComponent(printerLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(printerLabel2))
                    .addGroup(otherTabLayout.createSequentialGroup()
                        .addComponent(inflationLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inflationLabel2))
                    .addGroup(otherTabLayout.createSequentialGroup()
                        .addComponent(isoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isoLabel2))
                    .addGroup(otherTabLayout.createSequentialGroup()
                        .addComponent(bankLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bankLabel2))
                    .addGroup(otherTabLayout.createSequentialGroup()
                        .addComponent(subunitLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(otherTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subunitLabel3)
                            .addComponent(subunitLabel2)
                            .addComponent(subunitLabel4))))
                .addGap(110, 110, 110))
        );
        otherTabLayout.setVerticalGroup(
            otherTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otherTabLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(otherTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isoLabel)
                    .addComponent(isoLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(otherTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bankLabel)
                    .addComponent(bankLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(otherTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pegLabel)
                    .addComponent(pegLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(otherTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subunitLabel)
                    .addComponent(subunitLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subunitLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subunitLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(otherTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inflationLabel)
                    .addComponent(inflationLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(otherTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printerLabel)
                    .addComponent(printerLabel2))
                .addGap(331, 331, 331))
        );

        cnyInfoTab.addTab("Other", otherTab);

        cnyInfoTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cnyInfoTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cnyInfoTitle.setText("Chinese Yuan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cnyInfoTab, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(cnyInfoTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cnyInfoTitle)
                .addGap(18, 18, 18)
                .addComponent(cnyInfoTab))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CNYinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CNYinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CNYinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CNYinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CNYinfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bankLabel;
    private javax.swing.JLabel bankLabel2;
    private javax.swing.JLabel banknote;
    private javax.swing.JLabel banknotePicture;
    private javax.swing.JLabel burLabel;
    private javax.swing.JLabel chLabel;
    private javax.swing.ButtonGroup cnyButtonGroup;
    private javax.swing.JTabbedPane cnyInfoTab;
    private javax.swing.JLabel cnyInfoTitle;
    private javax.swing.JLabel coin;
    private javax.swing.JLabel coinPicture;
    private javax.swing.JLabel hkLabel;
    private javax.swing.JLabel inflationLabel;
    private javax.swing.JLabel inflationLabel2;
    private javax.swing.JPanel infoTab;
    private javax.swing.JLabel isoLabel;
    private javax.swing.JLabel isoLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel macLabel;
    private javax.swing.JLabel nkLabel;
    private javax.swing.JLabel officialUserLabel;
    private javax.swing.JPanel otherTab;
    private javax.swing.JLabel pegLabel;
    private javax.swing.JLabel pegLabel2;
    private javax.swing.JLabel printerLabel;
    private javax.swing.JLabel printerLabel2;
    private javax.swing.JRadioButton radioButton01fc;
    private javax.swing.JRadioButton radioButton02fc;
    private javax.swing.JRadioButton radioButton05fc;
    private javax.swing.JRadioButton radioButton100b;
    private javax.swing.JRadioButton radioButton10b;
    private javax.swing.JRadioButton radioButton1b;
    private javax.swing.JRadioButton radioButton1c;
    private javax.swing.JRadioButton radioButton1fb;
    private javax.swing.JRadioButton radioButton1fc;
    private javax.swing.JRadioButton radioButton20b;
    private javax.swing.JRadioButton radioButton2b;
    private javax.swing.JRadioButton radioButton2fb;
    private javax.swing.JRadioButton radioButton50b;
    private javax.swing.JRadioButton radioButton5b;
    private javax.swing.JRadioButton radioButton5fb;
    private javax.swing.JRadioButton radioButton5fc;
    private javax.swing.JLabel subunitLabel;
    private javax.swing.JLabel subunitLabel2;
    private javax.swing.JLabel subunitLabel3;
    private javax.swing.JLabel subunitLabel4;
    private javax.swing.JLabel unofficialUserLabel;
    private javax.swing.JPanel userTab;
    private javax.swing.JLabel zimLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (radioButton1fb.isSelected() ||
                radioButton2fb.isSelected() ||
                radioButton5fb.isSelected() ||
                radioButton1b.isSelected() ||
                radioButton2b.isSelected() ||
                radioButton5b.isSelected() ||                
                radioButton10b.isSelected() ||
                radioButton20b.isSelected() ||
                radioButton50b.isSelected() ||
                radioButton100b.isSelected()) {
        banknotePicture.setIcon(createImageIcon("/"
                                        + e.getActionCommand()
                                        + ".gif"));
        } else {
            coinPicture.setIcon(createImageIcon("/"
                                        + e.getActionCommand()
                                        + ".gif"));
        }
    }
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = CNYinfo.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            JOptionPane.showMessageDialog(JFrame, "File Not Found", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
  
}
