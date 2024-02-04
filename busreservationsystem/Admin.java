/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busreservationsystem;

import javax.swing.JFrame;

public class Admin extends javax.swing.JFrame {

    
    public Admin() {
        initComponents();
    }
    
    private void initComponents() {

        
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        Tickets = new javax.swing.JButton();
        vStations = new javax.swing.JButton();
        priceDetails = new javax.swing.JButton();
        vUsers = new javax.swing.JButton();
        vAdmins = new javax.swing.JButton();
        addAdmin = new javax.swing.JButton();
        addStations = new javax.swing.JButton();
        addUsers = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        logOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 550));

        jPanel1.setBackground(new java.awt.Color(175, 220, 236));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setForeground(new java.awt.Color(175, 220, 236));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 204));
        jLabel1.setText("Bus Reservation System");
        

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 150)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jToolBar1.setBackground(new java.awt.Color(51, 102, 255));
        jToolBar1.setForeground(new java.awt.Color(255, 255, 255));
        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);

        Tickets.setBackground(new java.awt.Color(51, 102, 255));
        Tickets.setForeground(new java.awt.Color(255, 255, 255));
        Tickets.setText("View Tickets");
        Tickets.setInheritsPopupMenu(true);
        
        jToolBar1.add(Tickets);

        vStations.setBackground(new java.awt.Color(51, 102, 255));
        vStations.setForeground(new java.awt.Color(255, 255, 255));
        vStations.setText("View Stations");
        vStations.setFocusable(false);
        vStations.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        vStations.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(vStations);

        priceDetails.setBackground(new java.awt.Color(51, 102, 255));
        priceDetails.setForeground(new java.awt.Color(255, 255, 255));
        priceDetails.setText("Price Details");
        priceDetails.setFocusable(false);
        priceDetails.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        priceDetails.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        
        jToolBar1.add(priceDetails);

        vUsers.setBackground(new java.awt.Color(51, 102, 255));
        vUsers.setForeground(new java.awt.Color(255, 255, 255));
        vUsers.setText("View Users");
        vUsers.setFocusable(false);
        vUsers.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        vUsers.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(vUsers);

        vAdmins.setBackground(new java.awt.Color(51, 102, 255));
        vAdmins.setForeground(new java.awt.Color(255, 255, 255));
        vAdmins.setText("View Admin");
        vAdmins.setFocusable(false);
        vAdmins.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        vAdmins.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(vAdmins);

        addAdmin.setBackground(new java.awt.Color(51, 102, 255));
        addAdmin.setForeground(new java.awt.Color(255, 255, 255));
        addAdmin.setText("Add Admin");
        addAdmin.setFocusable(false);
        addAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addAdmin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        
        jToolBar1.add(addAdmin);

        addStations.setBackground(new java.awt.Color(51, 102, 255));
        addStations.setForeground(new java.awt.Color(255, 255, 255));
        addStations.setText("Add Stations");
        addStations.setFocusable(false);
        addStations.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addStations.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        
        jToolBar1.add(addStations);

        addUsers.setBackground(new java.awt.Color(51, 102, 255));
        addUsers.setForeground(new java.awt.Color(255, 255, 255));
        addUsers.setText("Add Users");
        addUsers.setFocusable(false);
        addUsers.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addUsers.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(addUsers);
        
        logOut.setBackground(new java.awt.Color(51, 102, 255));
        logOut.setForeground(new java.awt.Color(255, 255, 255));
        logOut.setText("Log Out");
        logOut.setFocusable(false);
        logOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logOut.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(logOut);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
                    
        oldPanel = new javax.swing.JPanel();
        jPanel2.add(oldPanel);
        
        Tickets.addActionListener(e -> {
            //ViewTickets
            jPanel2.remove(oldPanel);
            jPanel2.setBackground(new java.awt.Color(255, 204, 204));
            System.out.println("clicked AS");
            ViewTickets as=new ViewTickets();
            oldPanel=as;
            
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(as, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(as, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)               
                .addGap(0, 0, Short.MAX_VALUE)
            );
        
        });               
    
        vStations.addActionListener(e -> {
            //ViewStations
            jPanel2.remove(oldPanel);
            jPanel2.setBackground(new java.awt.Color(255, 204, 204));
            System.out.println("clicked AS");
            ViewStations as=new ViewStations();
            oldPanel=as;
            
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(as, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(as, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)               
                .addGap(0, 0, Short.MAX_VALUE)
            );
        
        });
        
        priceDetails.addActionListener(e -> {
            //PriceDetail
            jPanel2.remove(oldPanel);
            jPanel2.setBackground(new java.awt.Color(255, 204, 204));
            System.out.println("clicked AS");
            PriceDetail as=new PriceDetail();
            oldPanel=as;
            
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(as, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(as, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)               
                .addGap(0, 0, Short.MAX_VALUE)
            );
        });
        
        vUsers.addActionListener(e -> {
            //ViewUsers
            jPanel2.remove(oldPanel);
            jPanel2.setBackground(new java.awt.Color(255, 204, 204));
            System.out.println("clicked AS");
            ViewUsers as=new ViewUsers();
            oldPanel=as;
            
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(as, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(as, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)               
                .addGap(0, 0, Short.MAX_VALUE)
            );
        });
        
        vAdmins.addActionListener(e -> {
            //ViewAdmins
            jPanel2.remove(oldPanel);
            jPanel2.setBackground(new java.awt.Color(255, 204, 204));
            System.out.println("clicked AS");
            ViewAdmins as=new ViewAdmins();
            oldPanel=as;
            
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(as, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(as, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)               
                .addGap(0, 0, Short.MAX_VALUE)
            );
        });
        
        logOut.addActionListener(e -> {
            
            
            LogIn ob=new LogIn();
            ob.setSize(700,500);
            ob.setBounds(0,0,500,500);
            ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ob.setLocation(0, 0);
            ob.setVisible(true);
            ob.pack();
            this.dispose();
            
        
        });  
        
        addAdmin.addActionListener(e -> {
            
            jPanel2.remove(oldPanel);
            jPanel2.setBackground(new java.awt.Color(255, 204, 204));
            System.out.println("clicked AS");
            AddAdmin as=new AddAdmin();
            oldPanel=as;
            
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(as, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(as, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)               
                .addGap(0, 0, Short.MAX_VALUE)
            );
            
        });
        
        addStations.addActionListener(e -> {
            
            jPanel2.remove(oldPanel);
            jPanel2.setBackground(new java.awt.Color(255, 204, 204));
            System.out.println("clicked AS");
            AddStations as=new AddStations();
            oldPanel=as;
            //as.setSize(400,400);
            //jPanel2.add(as);
            
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(as, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(as, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)               
                .addGap(0, 0, Short.MAX_VALUE)
            );
            
            
        });
        
        addUsers.addActionListener(e -> {
            
            jPanel2.remove(oldPanel);
            jPanel2.setBackground(new java.awt.Color(255, 204, 204));
            System.out.println("clicked AS");
            AddUser as=new AddUser();
            oldPanel=as;
            
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(as, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(as, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)               
                .addGap(0, 0, Short.MAX_VALUE)
            );
            
        });
    }                 
    
    
    
    private javax.swing.JButton Tickets;
    private javax.swing.JButton addAdmin;
    private javax.swing.JButton addStations;
    private javax.swing.JButton addUsers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel oldPanel;
    private javax.swing.JButton priceDetails;
    private javax.swing.JButton vAdmins;
    private javax.swing.JButton vStations;
    private javax.swing.JButton vUsers;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton logOut;
    
    
}

