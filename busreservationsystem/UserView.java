package busreservationsystem;

import javax.swing.JFrame;

public class UserView extends javax.swing.JFrame {

    
    public UserView(String fn,String ln, String no, String mail) {
        
        String id,fname,lname,fullDate="",name,vartype,txtclas;
        
        fname=fn;
        lname = ln;
        id=no;
        
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        bookTickets = new javax.swing.JButton();
        cancelTickets = new javax.swing.JButton();
        editDetails = new javax.swing.JButton();
        logOut = new javax.swing.JButton();
        info = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

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

        bookTickets.setBackground(new java.awt.Color(51, 102, 255));
        bookTickets.setForeground(new java.awt.Color(255, 255, 255));
        bookTickets.setText("Book Tickets");
        bookTickets.setInheritsPopupMenu(true);
        
        jToolBar1.add(bookTickets);
        
        cancelTickets.setBackground(new java.awt.Color(51, 102, 255));
        cancelTickets.setForeground(new java.awt.Color(255, 255, 255));
        cancelTickets.setText("Cancel Tickets");
        cancelTickets.setInheritsPopupMenu(true);
        
        jToolBar1.add(cancelTickets);
        
        editDetails.setBackground(new java.awt.Color(51, 102, 255));
        editDetails.setForeground(new java.awt.Color(255, 255, 255));
        editDetails.setText("Edit Details");
        editDetails.setInheritsPopupMenu(true);
        
        jToolBar1.add(editDetails);
        
        info.setBackground(new java.awt.Color(51, 102, 255));
        info.setForeground(new java.awt.Color(255, 255, 255));
        info.setText("Info");
        info.setInheritsPopupMenu(true);
        
        jToolBar1.add(info);
        
        logOut.setBackground(new java.awt.Color(51, 102, 255));
        logOut.setForeground(new java.awt.Color(255, 255, 255));
        logOut.setText("LogOut");
        logOut.setInheritsPopupMenu(true);
        
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
        
        bookTickets.addActionListener(e -> {
            
            
            user ob=new user(fn,ln,no,mail);
            ob.setSize(700,500);
            ob.setBounds(0,0,500,500);
            //ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ob.setLocation(0, 0);
            ob.setVisible(true);
            ob.pack();
            //this.dispose();
        
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
        
        cancelTickets.addActionListener(e -> {
            
            CancelTickets ob=new CancelTickets(no,mail);
            ob.setSize(700,500);
            ob.setBounds(0,0,500,500);
            //ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ob.setLocation(0, 0);
            ob.setVisible(true);
            ob.pack();
            //this.dispose();
        
        });
        
        editDetails.addActionListener(e -> {
            EditDetails ob=new EditDetails(no);
            ob.setSize(700,500);
            ob.setBounds(0,0,500,500);
            //ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ob.setLocation(0, 0);
            ob.setVisible(true);
            ob.pack();
        });
        
        info.addActionListener(e -> {
            
            jPanel2.remove(oldPanel);
            jPanel2.setBackground(new java.awt.Color(255, 204, 204));
            System.out.println("clicked AS");
            Info as=new Info();
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
    
    
    
    private javax.swing.JButton bookTickets;
    private javax.swing.JButton cancelTickets;
    private javax.swing.JButton editDetails;
    private javax.swing.JButton logOut;
    private javax.swing.JButton info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel oldPanel;
    private javax.swing.JPanel jPanel2;

    
}

