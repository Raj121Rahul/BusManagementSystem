package busreservationsystem;

import javax.swing.JPanel;
public class Info extends JPanel{
    
    Info() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        info1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(25, 204, 204));

        setBackground(new java.awt.Color(255, 204, 204));

        jPanel4.setBackground(new java.awt.Color(25, 204, 204));

        info1.setBackground(new java.awt.Color(25, 204, 204));
        info1.add(jLabel3);

        jPanel4.add(info1);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel4.setText("THIS PROJECT IS MADE BY \n");
        jPanel4.add(jLabel4);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel2.setText("Rahul Raj : 201910101110008\n");
        jLabel2.setLocation(40,40);
        jPanel4.add(jLabel2);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel7.setText("Prakhar Mishra : 201910101110009\n");
        jPanel4.add(jLabel7);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel9.setText("Vishal Sharma : 201910101110011");
        jPanel4.add(jLabel9);

        this.add(jPanel4);

    }
    
    private javax.swing.JPanel info1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    
}
