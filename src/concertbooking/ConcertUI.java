/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concertbooking;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JButton;


/**
 *
 * @author b00687749
 */
public class ConcertUI extends javax.swing.JFrame {

    /**
     * Creates new form ConcertUI
     */

    private Scan _s;
   
    
    
    
    
    
    public ConcertUI(Scan s) {
        initComponents();
        _s = s;
        initSeats();
        setLabels();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        newConcertButton = new javax.swing.JButton();
        checkIfBookedButton = new javax.swing.JButton();
        bookingsByCustomerButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        ConcertLabels = new javax.swing.JPanel();
        cName = new javax.swing.JLabel();
        cDate = new javax.swing.JLabel();
        cGold = new javax.swing.JLabel();
        cSilver = new javax.swing.JLabel();
        cBronze = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        buttonGrid = new javax.swing.JPanel();
        e03 = new javax.swing.JButton();
        c10 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        b02 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        e08 = new javax.swing.JButton();
        h04 = new javax.swing.JButton();
        b06 = new javax.swing.JButton();
        c01 = new javax.swing.JButton();
        g05 = new javax.swing.JButton();
        h02 = new javax.swing.JButton();
        h05 = new javax.swing.JButton();
        c09 = new javax.swing.JButton();
        d10 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        f04 = new javax.swing.JButton();
        i01 = new javax.swing.JButton();
        g10 = new javax.swing.JButton();
        h03 = new javax.swing.JButton();
        f08 = new javax.swing.JButton();
        a03 = new javax.swing.JButton();
        f01 = new javax.swing.JButton();
        a04 = new javax.swing.JButton();
        c05 = new javax.swing.JButton();
        a01 = new javax.swing.JButton();
        h01 = new javax.swing.JButton();
        e01 = new javax.swing.JButton();
        c03 = new javax.swing.JButton();
        a06 = new javax.swing.JButton();
        h07 = new javax.swing.JButton();
        d01 = new javax.swing.JButton();
        a10 = new javax.swing.JButton();
        c02 = new javax.swing.JButton();
        d08 = new javax.swing.JButton();
        b05 = new javax.swing.JButton();
        e10 = new javax.swing.JButton();
        c08 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        i03 = new javax.swing.JButton();
        a05 = new javax.swing.JButton();
        c06 = new javax.swing.JButton();
        d02 = new javax.swing.JButton();
        b08 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        b01 = new javax.swing.JButton();
        d06 = new javax.swing.JButton();
        i05 = new javax.swing.JButton();
        b07 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        c04 = new javax.swing.JButton();
        d09 = new javax.swing.JButton();
        d07 = new javax.swing.JButton();
        b09 = new javax.swing.JButton();
        i07 = new javax.swing.JButton();
        f03 = new javax.swing.JButton();
        d03 = new javax.swing.JButton();
        e05 = new javax.swing.JButton();
        e06 = new javax.swing.JButton();
        f10 = new javax.swing.JButton();
        f09 = new javax.swing.JButton();
        a09 = new javax.swing.JButton();
        g04 = new javax.swing.JButton();
        e07 = new javax.swing.JButton();
        f07 = new javax.swing.JButton();
        h08 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        i08 = new javax.swing.JButton();
        h10 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        g09 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        g08 = new javax.swing.JButton();
        g02 = new javax.swing.JButton();
        f05 = new javax.swing.JButton();
        e04 = new javax.swing.JButton();
        i04 = new javax.swing.JButton();
        i09 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        i06 = new javax.swing.JButton();
        i02 = new javax.swing.JButton();
        g01 = new javax.swing.JButton();
        g06 = new javax.swing.JButton();
        g03 = new javax.swing.JButton();
        h06 = new javax.swing.JButton();
        b03 = new javax.swing.JButton();
        g07 = new javax.swing.JButton();
        d04 = new javax.swing.JButton();
        f06 = new javax.swing.JButton();
        a08 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        c07 = new javax.swing.JButton();
        i10 = new javax.swing.JButton();
        a07 = new javax.swing.JButton();
        e09 = new javax.swing.JButton();
        b04 = new javax.swing.JButton();
        f02 = new javax.swing.JButton();
        d05 = new javax.swing.JButton();
        e02 = new javax.swing.JButton();
        a02 = new javax.swing.JButton();
        h09 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        jLabel5.setText("   1        2       3        4        5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        newConcertButton.setText("New Concert");
        newConcertButton.setToolTipText("");
        newConcertButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newConcertButtonMouseClicked(evt);
            }
        });
        newConcertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newConcertButtonActionPerformed(evt);
            }
        });

        checkIfBookedButton.setText("Check if Booked");
        checkIfBookedButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkIfBookedButtonMouseClicked(evt);
            }
        });

        bookingsByCustomerButton.setText("Bookings By Customer");
        bookingsByCustomerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookingsByCustomer(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        cName.setText("jLabel16");

        cDate.setText("jLabel16");

        cGold.setText("jLabel16");

        cSilver.setText("jLabel16");

        cBronze.setText("jLabel16");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel21.setText("Name");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel22.setText("Date");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel23.setText("Gold Price");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel24.setText("Silver Price");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel25.setText("Bronze Price");

        javax.swing.GroupLayout ConcertLabelsLayout = new javax.swing.GroupLayout(ConcertLabels);
        ConcertLabels.setLayout(ConcertLabelsLayout);
        ConcertLabelsLayout.setHorizontalGroup(
            ConcertLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConcertLabelsLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(ConcertLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cName)
                    .addComponent(jLabel21))
                .addGap(90, 90, 90)
                .addGroup(ConcertLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cDate)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConcertLabelsLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(13, 13, 13)))
                .addGroup(ConcertLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConcertLabelsLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(cGold)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConcertLabelsLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(12, 12, 12)))
                .addGroup(ConcertLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConcertLabelsLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(cSilver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConcertLabelsLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(43, 43, 43)))
                .addGroup(ConcertLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConcertLabelsLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(cBronze)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConcertLabelsLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(29, 29, 29))))
        );
        ConcertLabelsLayout.setVerticalGroup(
            ConcertLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConcertLabelsLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(ConcertLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ConcertLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cName)
                    .addComponent(cDate)
                    .addComponent(cGold)
                    .addComponent(cSilver)
                    .addComponent(cBronze))
                .addGap(25, 25, 25))
        );

        jPanel2.setBackground(new java.awt.Color(0, 255, 51));

        jLabel3.setText("Fire Exit");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setText("Stage");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(112, 112, 112))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 255, 51));

        jLabel2.setText("Fire Exit");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        e03.setBackground(new java.awt.Color(204, 204, 204));
        e03.setForeground(new java.awt.Color(204, 204, 204));
        e03.setText("e03");
        e03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSilverSeat(evt);
            }
        });

        c10.setBackground(new java.awt.Color(255, 204, 0));
        c10.setForeground(new java.awt.Color(255, 204, 0));
        c10.setText("c10");
        c10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookGoldSeat(evt);
            }
        });

        jLabel7.setText("A");

        b02.setBackground(new java.awt.Color(255, 204, 0));
        b02.setForeground(new java.awt.Color(255, 204, 0));
        b02.setText("b02");
        b02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookGoldSeat(evt);
            }
        });

        jLabel9.setText("C");

        e08.setBackground(new java.awt.Color(204, 204, 204));
        e08.setForeground(new java.awt.Color(204, 204, 204));
        e08.setText("e08");
        e08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSilverSeat(evt);
            }
        });

        h04.setBackground(new java.awt.Color(102, 51, 0));
        h04.setForeground(new java.awt.Color(102, 51, 0));
        h04.setText("h04");
        h04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBronzeSeat(evt);
            }
        });

        b06.setBackground(new java.awt.Color(255, 204, 0));
        b06.setForeground(new java.awt.Color(255, 204, 0));
        b06.setText("b06");
        b06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookGoldSeat(evt);
            }
        });

        c01.setBackground(new java.awt.Color(255, 204, 0));
        c01.setForeground(new java.awt.Color(255, 204, 0));
        c01.setText("c01");
        c01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookGoldSeat(evt);
            }
        });

        g05.setBackground(new java.awt.Color(102, 51, 0));
        g05.setForeground(new java.awt.Color(102, 51, 0));
        g05.setText("g05");
        g05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBronzeSeat(evt);
            }
        });

        h02.setBackground(new java.awt.Color(102, 51, 0));
        h02.setForeground(new java.awt.Color(102, 51, 0));
        h02.setText("h02");
        h02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBronzeSeat(evt);
            }
        });

        h05.setBackground(new java.awt.Color(102, 51, 0));
        h05.setForeground(new java.awt.Color(102, 51, 0));
        h05.setText("h05");
        h05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBronzeSeat(evt);
            }
        });

        c09.setBackground(new java.awt.Color(255, 204, 0));
        c09.setForeground(new java.awt.Color(255, 204, 0));
        c09.setText("c09");
        c09.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookGoldSeat(evt);
            }
        });

        d10.setBackground(new java.awt.Color(204, 204, 204));
        d10.setForeground(new java.awt.Color(204, 204, 204));
        d10.setText("d10");
        d10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSilverSeat(evt);
            }
        });

        jLabel14.setText("H");

        f04.setBackground(new java.awt.Color(204, 204, 204));
        f04.setForeground(new java.awt.Color(204, 204, 204));
        f04.setText("f04");
        f04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSilverSeat(evt);
            }
        });

        i01.setBackground(new java.awt.Color(102, 51, 0));
        i01.setForeground(new java.awt.Color(102, 51, 0));
        i01.setText("i01");
        i01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBronzeSeat(evt);
            }
        });

        g10.setBackground(new java.awt.Color(102, 51, 0));
        g10.setForeground(new java.awt.Color(102, 51, 0));
        g10.setText("g10");
        g10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBronzeSeat(evt);
            }
        });

        h03.setBackground(new java.awt.Color(102, 51, 0));
        h03.setForeground(new java.awt.Color(102, 51, 0));
        h03.setText("h03");
        h03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBronzeSeat(evt);
            }
        });

        f08.setBackground(new java.awt.Color(204, 204, 204));
        f08.setForeground(new java.awt.Color(204, 204, 204));
        f08.setText("f08");
        f08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSilverSeat(evt);
            }
        });

        a03.setBackground(new java.awt.Color(255, 204, 0));
        a03.setForeground(new java.awt.Color(255, 204, 0));
        a03.setText("a03");
        a03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookGoldSeat(evt);
            }
        });

        f01.setBackground(new java.awt.Color(204, 204, 204));
        f01.setForeground(new java.awt.Color(204, 204, 204));
        f01.setText("f01");
        f01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSilverSeat(evt);
            }
        });

        a04.setBackground(new java.awt.Color(255, 204, 0));
        a04.setForeground(new java.awt.Color(255, 204, 0));
        a04.setText("a04");
        a04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookGoldSeat(evt);
            }
        });

        c05.setBackground(new java.awt.Color(255, 204, 0));
        c05.setForeground(new java.awt.Color(255, 204, 0));
        c05.setText("c05");
        c05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookGoldSeat(evt);
            }
        });

        a01.setBackground(new java.awt.Color(255, 204, 0));
        a01.setForeground(new java.awt.Color(255, 204, 0));
        a01.setText("a01");
        a01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookGoldSeat(evt);
            }
        });
        a01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a01ActionPerformed(evt);
            }
        });

        h01.setBackground(new java.awt.Color(102, 51, 0));
        h01.setForeground(new java.awt.Color(102, 51, 0));
        h01.setText("h01");
        h01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBronzeSeat(evt);
            }
        });

        e01.setBackground(new java.awt.Color(204, 204, 204));
        e01.setForeground(new java.awt.Color(204, 204, 204));
        e01.setText("e01");
        e01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSilverSeat(evt);
            }
        });

        c03.setBackground(new java.awt.Color(255, 204, 0));
        c03.setForeground(new java.awt.Color(255, 204, 0));
        c03.setText("c03");
        c03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookGoldSeat(evt);
            }
        });

        a06.setBackground(new java.awt.Color(255, 204, 0));
        a06.setForeground(new java.awt.Color(255, 204, 0));
        a06.setText("a06");
        a06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookGoldSeat(evt);
            }
        });

        h07.setBackground(new java.awt.Color(102, 51, 0));
        h07.setForeground(new java.awt.Color(102, 51, 0));
        h07.setText("h07");
        h07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBronzeSeat(evt);
            }
        });

        d01.setBackground(new java.awt.Color(204, 204, 204));
        d01.setForeground(new java.awt.Color(204, 204, 204));
        d01.setText("d01");
        d01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSilverSeat(evt);
            }
        });

        a10.setBackground(new java.awt.Color(255, 204, 0));
        a10.setForeground(new java.awt.Color(255, 204, 0));
        a10.setText("a10");
        a10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookGoldSeat(evt);
            }
        });

        c02.setBackground(new java.awt.Color(255, 204, 0));
        c02.setForeground(new java.awt.Color(255, 204, 0));
        c02.setText("c02");
        c02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookGoldSeat(evt);
            }
        });

        d08.setBackground(new java.awt.Color(204, 204, 204));
        d08.setForeground(new java.awt.Color(204, 204, 204));
        d08.setText("d08");
        d08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSilverSeat(evt);
            }
        });

        b05.setBackground(new java.awt.Color(255, 204, 0));
        b05.setForeground(new java.awt.Color(255, 204, 0));
        b05.setText("b05");
        b05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookGoldSeat(evt);
            }
        });

        e10.setBackground(new java.awt.Color(204, 204, 204));
        e10.setForeground(new java.awt.Color(204, 204, 204));
        e10.setText("e10");
        e10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSilverSeat(evt);
            }
        });

        c08.setBackground(new java.awt.Color(255, 204, 0));
        c08.setForeground(new java.awt.Color(255, 204, 0));
        c08.setText("c08");
        c08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookGoldSeat(evt);
            }
        });

        jLabel13.setText("G");

        i03.setBackground(new java.awt.Color(102, 51, 0));
        i03.setForeground(new java.awt.Color(102, 51, 0));
        i03.setText("i03");
        i03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBronzeSeat(evt);
            }
        });

        a05.setBackground(new java.awt.Color(255, 204, 0));
        a05.setForeground(new java.awt.Color(255, 204, 0));
        a05.setText("a05");
        a05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookGoldSeat(evt);
            }
        });

        c06.setBackground(new java.awt.Color(255, 204, 0));
        c06.setForeground(new java.awt.Color(255, 204, 0));
        c06.setText("c06");
        c06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookGoldSeat(evt);
            }
        });

        d02.setBackground(new java.awt.Color(204, 204, 204));
        d02.setForeground(new java.awt.Color(204, 204, 204));
        d02.setText("d02");
        d02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSilverSeat(evt);
            }
        });

        b08.setBackground(new java.awt.Color(255, 204, 0));
        b08.setForeground(new java.awt.Color(255, 204, 0));
        b08.setText("b08");
        b08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookGoldSeat(evt);
            }
        });

        jLabel8.setText("B");

        b01.setBackground(new java.awt.Color(255, 204, 0));
        b01.setForeground(new java.awt.Color(255, 204, 0));
        b01.setText("b01");
        b01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookGoldSeat(evt);
            }
        });

        d06.setBackground(new java.awt.Color(204, 204, 204));
        d06.setForeground(new java.awt.Color(204, 204, 204));
        d06.setText("d06");
        d06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSilverSeat(evt);
            }
        });

        i05.setBackground(new java.awt.Color(102, 51, 0));
        i05.setForeground(new java.awt.Color(102, 51, 0));
        i05.setText("i05");
        i05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBronzeSeat(evt);
            }
        });

        b07.setBackground(new java.awt.Color(255, 204, 0));
        b07.setForeground(new java.awt.Color(255, 204, 0));
        b07.setText("b07");
        b07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookGoldSeat(evt);
            }
        });

        jLabel10.setText("D");

        c04.setBackground(new java.awt.Color(255, 204, 0));
        c04.setForeground(new java.awt.Color(255, 204, 0));
        c04.setText("c04");
        c04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookGoldSeat(evt);
            }
        });

        d09.setBackground(new java.awt.Color(204, 204, 204));
        d09.setForeground(new java.awt.Color(204, 204, 204));
        d09.setText("d09");
        d09.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSilverSeat(evt);
            }
        });

        d07.setBackground(new java.awt.Color(204, 204, 204));
        d07.setForeground(new java.awt.Color(204, 204, 204));
        d07.setText("d07");
        d07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSilverSeat(evt);
            }
        });

        b09.setBackground(new java.awt.Color(255, 204, 0));
        b09.setForeground(new java.awt.Color(255, 204, 0));
        b09.setText("b09");
        b09.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookGoldSeat(evt);
            }
        });

        i07.setBackground(new java.awt.Color(102, 51, 0));
        i07.setForeground(new java.awt.Color(102, 51, 0));
        i07.setText("i07");
        i07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBronzeSeat(evt);
            }
        });

        f03.setBackground(new java.awt.Color(204, 204, 204));
        f03.setForeground(new java.awt.Color(204, 204, 204));
        f03.setText("f03");
        f03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSilverSeat(evt);
            }
        });

        d03.setBackground(new java.awt.Color(204, 204, 204));
        d03.setForeground(new java.awt.Color(204, 204, 204));
        d03.setText("d03");
        d03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSilverSeat(evt);
            }
        });

        e05.setBackground(new java.awt.Color(204, 204, 204));
        e05.setForeground(new java.awt.Color(204, 204, 204));
        e05.setText("e05");
        e05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSilverSeat(evt);
            }
        });

        e06.setBackground(new java.awt.Color(204, 204, 204));
        e06.setForeground(new java.awt.Color(204, 204, 204));
        e06.setText("e06");
        e06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSilverSeat(evt);
            }
        });

        f10.setBackground(new java.awt.Color(204, 204, 204));
        f10.setForeground(new java.awt.Color(204, 204, 204));
        f10.setText("f10");
        f10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSilverSeat(evt);
            }
        });

        f09.setBackground(new java.awt.Color(204, 204, 204));
        f09.setForeground(new java.awt.Color(204, 204, 204));
        f09.setText("f09");
        f09.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSilverSeat(evt);
            }
        });

        a09.setBackground(new java.awt.Color(255, 204, 0));
        a09.setForeground(new java.awt.Color(255, 204, 0));
        a09.setText("a09");
        a09.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookGoldSeat(evt);
            }
        });

        g04.setBackground(new java.awt.Color(102, 51, 0));
        g04.setForeground(new java.awt.Color(102, 51, 0));
        g04.setText("g04");
        g04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBronzeSeat(evt);
            }
        });

        e07.setBackground(new java.awt.Color(204, 204, 204));
        e07.setForeground(new java.awt.Color(204, 204, 204));
        e07.setText("e07");
        e07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSilverSeat(evt);
            }
        });

        f07.setBackground(new java.awt.Color(204, 204, 204));
        f07.setForeground(new java.awt.Color(204, 204, 204));
        f07.setText("f07");
        f07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSilverSeat(evt);
            }
        });

        h08.setBackground(new java.awt.Color(102, 51, 0));
        h08.setForeground(new java.awt.Color(102, 51, 0));
        h08.setText("h08");
        h08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBronzeSeat(evt);
            }
        });

        jLabel6.setText("   6        7       8        9       10");

        i08.setBackground(new java.awt.Color(102, 51, 0));
        i08.setForeground(new java.awt.Color(102, 51, 0));
        i08.setText("i08");
        i08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBronzeSeat(evt);
            }
        });

        h10.setBackground(new java.awt.Color(102, 51, 0));
        h10.setForeground(new java.awt.Color(102, 51, 0));
        h10.setText("h10");
        h10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBronzeSeat(evt);
            }
        });

        jLabel4.setText("   1        2       3        4        5");

        g09.setBackground(new java.awt.Color(102, 51, 0));
        g09.setForeground(new java.awt.Color(102, 51, 0));
        g09.setText("g09");
        g09.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBronzeSeat(evt);
            }
        });

        jLabel11.setText("E");

        g08.setBackground(new java.awt.Color(102, 51, 0));
        g08.setForeground(new java.awt.Color(102, 51, 0));
        g08.setText("g08");
        g08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBronzeSeat(evt);
            }
        });

        g02.setBackground(new java.awt.Color(102, 51, 0));
        g02.setForeground(new java.awt.Color(102, 51, 0));
        g02.setText("g02");
        g02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBronzeSeat(evt);
            }
        });

        f05.setBackground(new java.awt.Color(204, 204, 204));
        f05.setForeground(new java.awt.Color(204, 204, 204));
        f05.setText("f05");
        f05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSilverSeat(evt);
            }
        });

        e04.setBackground(new java.awt.Color(204, 204, 204));
        e04.setForeground(new java.awt.Color(204, 204, 204));
        e04.setText("e04");
        e04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSilverSeat(evt);
            }
        });

        i04.setBackground(new java.awt.Color(102, 51, 0));
        i04.setForeground(new java.awt.Color(102, 51, 0));
        i04.setText("i04");
        i04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBronzeSeat(evt);
            }
        });

        i09.setBackground(new java.awt.Color(102, 51, 0));
        i09.setForeground(new java.awt.Color(102, 51, 0));
        i09.setText("i09");
        i09.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBronzeSeat(evt);
            }
        });
        i09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i09ActionPerformed(evt);
            }
        });

        jLabel15.setText("I");

        i06.setBackground(new java.awt.Color(102, 51, 0));
        i06.setForeground(new java.awt.Color(102, 51, 0));
        i06.setText("i06");
        i06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBronzeSeat(evt);
            }
        });

        i02.setBackground(new java.awt.Color(102, 51, 0));
        i02.setForeground(new java.awt.Color(102, 51, 0));
        i02.setText("i02");
        i02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBronzeSeat(evt);
            }
        });

        g01.setBackground(new java.awt.Color(102, 51, 0));
        g01.setForeground(new java.awt.Color(102, 51, 0));
        g01.setText("g01");
        g01.setToolTipText("");
        g01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBronzeSeat(evt);
            }
        });

        g06.setBackground(new java.awt.Color(102, 51, 0));
        g06.setForeground(new java.awt.Color(102, 51, 0));
        g06.setText("g06");
        g06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBronzeSeat(evt);
            }
        });

        g03.setBackground(new java.awt.Color(102, 51, 0));
        g03.setForeground(new java.awt.Color(102, 51, 0));
        g03.setText("g03");
        g03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBronzeSeat(evt);
            }
        });

        h06.setBackground(new java.awt.Color(102, 51, 0));
        h06.setForeground(new java.awt.Color(102, 51, 0));
        h06.setText("h06");
        h06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBronzeSeat(evt);
            }
        });

        b03.setBackground(new java.awt.Color(255, 204, 0));
        b03.setForeground(new java.awt.Color(255, 204, 0));
        b03.setText("b03");

        g07.setBackground(new java.awt.Color(102, 51, 0));
        g07.setForeground(new java.awt.Color(102, 51, 0));
        g07.setText("g07");
        g07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBronzeSeat(evt);
            }
        });

        d04.setBackground(new java.awt.Color(204, 204, 204));
        d04.setForeground(new java.awt.Color(204, 204, 204));
        d04.setText("d04");
        d04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSilverSeat(evt);
            }
        });

        f06.setBackground(new java.awt.Color(204, 204, 204));
        f06.setForeground(new java.awt.Color(204, 204, 204));
        f06.setText("f06");
        f06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSilverSeat(evt);
            }
        });

        a08.setBackground(new java.awt.Color(255, 204, 0));
        a08.setForeground(new java.awt.Color(255, 204, 0));
        a08.setText("a08");
        a08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookGoldSeat(evt);
            }
        });

        b10.setBackground(new java.awt.Color(255, 204, 0));
        b10.setForeground(new java.awt.Color(255, 204, 0));
        b10.setText("b10");
        b10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookGoldSeat(evt);
            }
        });

        c07.setBackground(new java.awt.Color(255, 204, 0));
        c07.setForeground(new java.awt.Color(255, 204, 0));
        c07.setText("c07");
        c07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookGoldSeat(evt);
            }
        });

        i10.setBackground(new java.awt.Color(102, 51, 0));
        i10.setForeground(new java.awt.Color(102, 51, 0));
        i10.setText("i10");
        i10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBronzeSeat(evt);
            }
        });

        a07.setBackground(new java.awt.Color(255, 204, 0));
        a07.setForeground(new java.awt.Color(255, 204, 0));
        a07.setText("a07");
        a07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookGoldSeat(evt);
            }
        });

        e09.setBackground(new java.awt.Color(204, 204, 204));
        e09.setForeground(new java.awt.Color(204, 204, 204));
        e09.setText("e09");
        e09.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSilverSeat(evt);
            }
        });

        b04.setBackground(new java.awt.Color(255, 204, 0));
        b04.setForeground(new java.awt.Color(255, 204, 0));
        b04.setText("b04");
        b04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookGoldSeat(evt);
            }
        });

        f02.setBackground(new java.awt.Color(204, 204, 204));
        f02.setForeground(new java.awt.Color(204, 204, 204));
        f02.setText("f02");
        f02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSilverSeat(evt);
            }
        });

        d05.setBackground(new java.awt.Color(204, 204, 204));
        d05.setForeground(new java.awt.Color(204, 204, 204));
        d05.setText("d05");
        d05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSilverSeat(evt);
            }
        });

        e02.setBackground(new java.awt.Color(204, 204, 204));
        e02.setForeground(new java.awt.Color(204, 204, 204));
        e02.setText("e02");
        e02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSilverSeat(evt);
            }
        });

        a02.setBackground(new java.awt.Color(255, 204, 0));
        a02.setForeground(new java.awt.Color(255, 204, 0));
        a02.setText("a02");
        a02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookGoldSeat(evt);
            }
        });

        h09.setBackground(new java.awt.Color(102, 51, 0));
        h09.setForeground(new java.awt.Color(102, 51, 0));
        h09.setText("h09");
        h09.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBronzeSeat(evt);
            }
        });

        jLabel12.setText("F");

        javax.swing.GroupLayout buttonGridLayout = new javax.swing.GroupLayout(buttonGrid);
        buttonGrid.setLayout(buttonGridLayout);
        buttonGridLayout.setHorizontalGroup(
            buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
            .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(buttonGridLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(buttonGridLayout.createSequentialGroup()
                            .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(i01, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(h01, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(g01, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(buttonGridLayout.createSequentialGroup()
                                    .addComponent(g02, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(g03, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(g04, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(g05, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(buttonGridLayout.createSequentialGroup()
                                    .addComponent(h02, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(h03, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(h04, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(h05, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(buttonGridLayout.createSequentialGroup()
                                    .addComponent(i02, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(i03, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(i04, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(i05, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(buttonGridLayout.createSequentialGroup()
                            .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(f01, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(e01, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(d01, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(buttonGridLayout.createSequentialGroup()
                                    .addComponent(d02, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(d03, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(d04, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(d05, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(buttonGridLayout.createSequentialGroup()
                                    .addComponent(e02, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(e03, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(e04, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(e05, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(buttonGridLayout.createSequentialGroup()
                                    .addComponent(f02, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(f03, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(f04, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(f05, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(buttonGridLayout.createSequentialGroup()
                            .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(c01, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(b01, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a01, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(buttonGridLayout.createSequentialGroup()
                                    .addComponent(a02, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(a03, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(a04, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(a05, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(buttonGridLayout.createSequentialGroup()
                                    .addComponent(b02, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(b03, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(b04, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(b05, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(buttonGridLayout.createSequentialGroup()
                                    .addComponent(c02, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c03, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c04, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c05, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGap(181, 181, 181)
                    .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(buttonGridLayout.createSequentialGroup()
                            .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(f06, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(e06, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(d06, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(buttonGridLayout.createSequentialGroup()
                                    .addComponent(d07, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(d08, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(d09, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(d10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(buttonGridLayout.createSequentialGroup()
                                    .addComponent(e07, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(e08, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(e09, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(e10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(buttonGridLayout.createSequentialGroup()
                                    .addComponent(f07, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(f08, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(f09, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(f10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(buttonGridLayout.createSequentialGroup()
                            .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(c06, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(b06, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a06, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(buttonGridLayout.createSequentialGroup()
                                    .addComponent(a07, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(a08, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(a09, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(a10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(buttonGridLayout.createSequentialGroup()
                                    .addComponent(b07, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(b08, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(b09, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(buttonGridLayout.createSequentialGroup()
                                    .addComponent(c07, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c08, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c09, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(buttonGridLayout.createSequentialGroup()
                            .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(i06, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(h06, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(g06, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(buttonGridLayout.createSequentialGroup()
                                    .addComponent(g07, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(g08, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(g09, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(g10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(buttonGridLayout.createSequentialGroup()
                                    .addComponent(h07, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(h08, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(h09, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(h10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(buttonGridLayout.createSequentialGroup()
                                    .addComponent(i07, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(i08, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(i09, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(i10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        buttonGridLayout.setVerticalGroup(
            buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
            .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(buttonGridLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonGridLayout.createSequentialGroup()
                            .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(a01, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a02, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a03, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a04, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a05, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(b01, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(b02, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(b03, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(b04, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(b05, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(c01, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c02, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c03, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c04, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c05, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(35, 35, 35)
                            .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(buttonGridLayout.createSequentialGroup()
                                    .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(d06, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(d07, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(d08, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(d09, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(d10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(e06, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(e07, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(e08, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(e09, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(e10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(f06, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(f07, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(f08, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(f09, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(f10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(buttonGridLayout.createSequentialGroup()
                                    .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10)
                                        .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(d01, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(d02, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(d03, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(d04, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(d05, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(e01, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(e02, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(e03, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(e04, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(e05, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel11))
                                    .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(buttonGridLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(f01, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(f02, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(f03, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(f04, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(f05, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(buttonGridLayout.createSequentialGroup()
                                            .addGap(11, 11, 11)
                                            .addComponent(jLabel12)))))
                            .addGap(36, 36, 36)
                            .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(buttonGridLayout.createSequentialGroup()
                                    .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(g06, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(g07, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(g08, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(g09, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(g10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(h06, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(h07, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(h08, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(h09, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(h10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(i06, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(i07, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(i08, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(i09, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(i10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(buttonGridLayout.createSequentialGroup()
                                    .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel13)
                                        .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(g01, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(g02, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(g03, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(g04, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(g05, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(buttonGridLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(h01, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(h02, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(h03, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(h04, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(h05, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(i01, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(i02, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(i03, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(i04, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(i05, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonGridLayout.createSequentialGroup()
                                            .addGap(11, 11, 11)
                                            .addComponent(jLabel14)
                                            .addGap(11, 11, 11)
                                            .addComponent(jLabel15))))))
                        .addGroup(buttonGridLayout.createSequentialGroup()
                            .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(a06, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a07, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a08, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a09, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(b06, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(b07, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(b08, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(b09, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(buttonGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(c06, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c07, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c08, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c09, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(buttonGrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ConcertLabels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newConcertButton)
                        .addGap(344, 344, 344)
                        .addComponent(checkIfBookedButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bookingsByCustomerButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newConcertButton)
                    .addComponent(checkIfBookedButton)
                    .addComponent(bookingsByCustomerButton)
                    .addComponent(exitButton))
                .addGap(33, 33, 33)
                .addComponent(ConcertLabels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(buttonGrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newConcertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newConcertButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newConcertButtonActionPerformed

    private void i09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i09ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_i09ActionPerformed

    private void a01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a01ActionPerformed

    private void initSeats(){
        int count1 = 0;
        
        JButton[] a = new JButton[90];
        //ArrayList b = new ArrayList();
        //Component[] b = new Component[101];
        JButton[] c = new JButton[buttonGrid.getComponentCount()];
        
        for(int i = 0; i < buttonGrid.getComponentCount(); i++){
            try{
            c[i] = (JButton) buttonGrid.getComponent(i);
            }
            catch (Exception e) {}
        }
        
        for(int i = 0; i < c.length; i++){
            for (int j = 0; j < 90; j++){
                if(c[i] != null){
                    if(c[i].getText().equals( _s.seatArray[j].getSeatNumber())) {
                        a[count1] = c[i];
                        count1++;
                    }
                }
            }
            
        }
        for (int i = 0; i < 90; i++){
            for (int j = 0; j < 90; j++){
                if (_s.seatArray[i].getSeatNumber().equals(a[j].getText()) && !_s.seatArray[i].getCustomerName().equals("")){
                    if(_s.seatArray[i].getSeatTier().equals("bronze")){
                        a[j].setBackground(Color.red);
                        a[j].enable(false);
                    }
                    if(_s.seatArray[i].getSeatTier().equals("silver")){
                        a[j].setBackground(Color.red);
                    }
                    if(_s.seatArray[i].getSeatTier().equals("gold")){
                        a[j].setBackground(Color.red);
                    }
                
                }
            }
        }
    }
    
    private void checkIfBookedButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkIfBookedButtonMouseClicked
        String checkSeat = JOptionPane.showInputDialog(null, "Enter the seat you would like to check:");
        if (checkSeat.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter a valid seat.");

        } else {
            for (int i = 0; i <= 90; i++) {
                if (i == 90) {
                    JOptionPane.showMessageDialog(null, "404: Seat not found.");
                } 
                else{
                    if (_s.seatArray[i].getSeatNumber().equals(checkSeat)) {
                        if (_s.seatArray[i].getCustomerName().equals("")) {
                            JOptionPane.showMessageDialog(null, "This seat has not been booked.");
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "This Seat is Booked By " + _s.seatArray[i].getCustomerName());
                            break;
                        }
                   }
                }
            }
        }
    }//GEN-LAST:event_checkIfBookedButtonMouseClicked

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        _s.onClose();
        System.exit(0); // TODO add your handling code here:
    }//GEN-LAST:event_exitButtonActionPerformed

    private void bookGoldSeat(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookGoldSeat
        JButton b = (JButton)evt.getComponent();
        for (int i = 0; i < 90; i++){
            if (_s.seatArray[i].getSeatNumber().equals(b.getText())){
                _s.seatArray[i].book(b);
            }
        }
    }//GEN-LAST:event_bookGoldSeat

    private void bookingsByCustomer(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingsByCustomer
        // TODO add your handling code here:
        String searchedName =JOptionPane.showInputDialog("Please enter customer name you are searching for:");
        for(int i=0;i<=90;i++)
        {
            if(i==90)
            {
                JOptionPane.showMessageDialog(null,"The selected customer has not booked any seats.");
            }
            else
            {
                int numberOfSeats = 0;
            if(_s.seatArray[i].getCustomerName().equals(searchedName))
            {
                numberOfSeats =+1;
                
                JOptionPane.showMessageDialog(null,"The selected customer has booked the following seat : "+ _s.seatArray[i].getSeatNumber());
                JOptionPane.showMessageDialog(null,"The selected customer has booked "+ Integer.toString(numberOfSeats) + " seats");
                break;
            }
            }
        }
        
        
    }//GEN-LAST:event_bookingsByCustomer

    private void bookSilverSeat(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookSilverSeat
        JButton b = (JButton)evt.getComponent();
        for (int i = 0; i < 90; i++){
            if (_s.seatArray[i].getSeatNumber().equals(b.getText())){
                _s.seatArray[i].book(b);
            }
        }
    }//GEN-LAST:event_bookSilverSeat

    private void bookBronzeSeat(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookBronzeSeat
        JButton b = (JButton)evt.getComponent();
        for (int i = 0; i < 90; i++){
            if (_s.seatArray[i].getSeatNumber().equals(b.getText())){
                _s.seatArray[i].book(b);
            }
        }
    }//GEN-LAST:event_bookBronzeSeat

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        _s.onClose();
    }//GEN-LAST:event_formWindowClosing

    private void newConcertButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newConcertButtonMouseClicked
        BufferedWriter writer = null;
        try {
            // TODO add your handling code here:
            writer = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "/src/concertbooking/ConcertDetails.txt", true));
            String newConcertName = JOptionPane.showInputDialog("Please enter a name for the new concert:");
            writer.write(newConcertName+",");
            String newConcertDate = JOptionPane.showInputDialog("Please enter a date for the new concert:");
            writer.write(newConcertDate+",");
            String newBronzePrice = JOptionPane.showInputDialog("Enter an initial bronze seat price for the new concert:");
            writer.write(newBronzePrice+",");
            String newSilverPrice = JOptionPane.showInputDialog("Enter an initial siver seat price for the new concert:");
            writer.write(newSilverPrice+",");
            String newGoldPrice = JOptionPane.showInputDialog("Enter an initial gold seat price for the new concert:");
            writer.write(newGoldPrice+",\n");
            this.setVisible(false);
            for(int i =0;i<90;i++)
             {
                _s.seatArray[i].setCustomerName("");
                _s.seatArray[i].setExtra("0");
            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(ConcertUI.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
                ConcertUI newUI = new ConcertUI(_s);     
                newUI.setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(ConcertUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_newConcertButtonMouseClicked

    private void setLabels(){
        String[] cDetails = _s.readConcert();
        cName.setText(cDetails[0]);
        cDate.setText(cDetails[1]);
        cBronze.setText(cDetails[2]);
        cSilver.setText(cDetails[3]);
        cGold.setText(cDetails[4]);
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
            java.util.logging.Logger.getLogger(ConcertUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConcertUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConcertUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConcertUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ConcertUI().setVisible(true);
            }
        });
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ConcertLabels;
    private javax.swing.JPanel Header;
    private javax.swing.JButton a01;
    private javax.swing.JButton a02;
    private javax.swing.JButton a03;
    private javax.swing.JButton a04;
    private javax.swing.JButton a05;
    private javax.swing.JButton a06;
    private javax.swing.JButton a07;
    private javax.swing.JButton a08;
    private javax.swing.JButton a09;
    private javax.swing.JButton a10;
    private javax.swing.JButton b01;
    private javax.swing.JButton b02;
    private javax.swing.JButton b03;
    private javax.swing.JButton b04;
    private javax.swing.JButton b05;
    private javax.swing.JButton b06;
    private javax.swing.JButton b07;
    private javax.swing.JButton b08;
    private javax.swing.JButton b09;
    private javax.swing.JButton b10;
    private javax.swing.JButton bookingsByCustomerButton;
    private javax.swing.JPanel buttonGrid;
    private javax.swing.JButton c01;
    private javax.swing.JButton c02;
    private javax.swing.JButton c03;
    private javax.swing.JButton c04;
    private javax.swing.JButton c05;
    private javax.swing.JButton c06;
    private javax.swing.JButton c07;
    private javax.swing.JButton c08;
    private javax.swing.JButton c09;
    private javax.swing.JButton c10;
    private javax.swing.JLabel cBronze;
    private javax.swing.JLabel cDate;
    private javax.swing.JLabel cGold;
    private javax.swing.JLabel cName;
    private javax.swing.JLabel cSilver;
    private javax.swing.JButton checkIfBookedButton;
    private javax.swing.JButton d01;
    private javax.swing.JButton d02;
    private javax.swing.JButton d03;
    private javax.swing.JButton d04;
    private javax.swing.JButton d05;
    private javax.swing.JButton d06;
    private javax.swing.JButton d07;
    private javax.swing.JButton d08;
    private javax.swing.JButton d09;
    private javax.swing.JButton d10;
    private javax.swing.JButton e01;
    private javax.swing.JButton e02;
    private javax.swing.JButton e03;
    private javax.swing.JButton e04;
    private javax.swing.JButton e05;
    private javax.swing.JButton e06;
    private javax.swing.JButton e07;
    private javax.swing.JButton e08;
    private javax.swing.JButton e09;
    private javax.swing.JButton e10;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton f01;
    private javax.swing.JButton f02;
    private javax.swing.JButton f03;
    private javax.swing.JButton f04;
    private javax.swing.JButton f05;
    private javax.swing.JButton f06;
    private javax.swing.JButton f07;
    private javax.swing.JButton f08;
    private javax.swing.JButton f09;
    private javax.swing.JButton f10;
    private javax.swing.JButton g01;
    private javax.swing.JButton g02;
    private javax.swing.JButton g03;
    private javax.swing.JButton g04;
    private javax.swing.JButton g05;
    private javax.swing.JButton g06;
    private javax.swing.JButton g07;
    private javax.swing.JButton g08;
    private javax.swing.JButton g09;
    private javax.swing.JButton g10;
    private javax.swing.JButton h01;
    private javax.swing.JButton h02;
    private javax.swing.JButton h03;
    private javax.swing.JButton h04;
    private javax.swing.JButton h05;
    private javax.swing.JButton h06;
    private javax.swing.JButton h07;
    private javax.swing.JButton h08;
    private javax.swing.JButton h09;
    private javax.swing.JButton h10;
    private javax.swing.JButton i01;
    private javax.swing.JButton i02;
    private javax.swing.JButton i03;
    private javax.swing.JButton i04;
    private javax.swing.JButton i05;
    private javax.swing.JButton i06;
    private javax.swing.JButton i07;
    private javax.swing.JButton i08;
    private javax.swing.JButton i09;
    private javax.swing.JButton i10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton newConcertButton;
    // End of variables declaration//GEN-END:variables
}
