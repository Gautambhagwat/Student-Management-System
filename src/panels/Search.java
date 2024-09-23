/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class Search extends javax.swing.JPanel {
Connection con;
    /**
     * Creates new form Search
     */
      
    public Search() {
        
        initComponents();
        DBconnection c= new DBconnection();
        con=c.getconnection();
       show_student();
       show_undergraduate();
       show_postergraduate();
       
        
    }
    public void show_postergraduate(){
    
    try {
            
            DefaultTableModel tb=(DefaultTableModel)jTable3.getModel();
             
          
            Statement st=con.createStatement();
            
             ResultSet r=st.executeQuery("SELECT * FROM courseposter");  
           
             
              while(r.next()){
                     
                     Vector vec=new Vector();
                     
                     String studentid =(r.getString("studentid"));
                     String nic=(r.getString("nic"));
                     String fullname=(r.getString("Fullname"));
                     String initial=(r.getString("initials"));
                     String course=(r.getString("course"));
                     String duration=(r.getString("duration"));
                     String batchno=(r.getString("batchno"));
                     String day=(r.getString("day"));
                     String coursefee=(r.getString("coursefee"));
                     
                     
                     vec.add(studentid);
                     vec.add(nic);
                     vec.add(fullname);
                     vec.add(initial);
                     vec.add(course);
                     vec.add(duration);
                     vec.add(batchno);
                     vec.add(day);
                     vec.add(coursefee);
                    
                  tb.addRow(vec);
              }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    
    
    
    
    }
    public void show_student()
    {
        try {
            
            DefaultTableModel tb=(DefaultTableModel)jTable5.getModel();
             
            
            Statement st=con.createStatement();
            
             ResultSet r=st.executeQuery("SELECT * FROM student ");  
            
             
              while(r.next()){
                     
                     Vector v=new Vector();
                     
                     String title =(r.getString("title"));
                     String fname=(r.getString("fname"));
                     String lname=(r.getString("lname"));
                     String fullname=(r.getString("fullname"));
                     String initial=(r.getString("initial"));
                     String dob=(r.getString("dob"));
                     String nic=(r.getString("nic"));
                     String gender=(r.getString("gender"));
                     String contact=(r.getString("contact"));
                     String email=(r.getString("email"));
                     
                     v.add(title);
                     v.add(fname);
                     v.add(lname);
                     v.add(fullname);
                     v.add(initial);
                     v.add(dob);
                     v.add(nic);
                     v.add(gender);
                     v.add(contact);
                     v.add(email);
                     //hari bn
                     
                     
                     tb.addRow(v);
              }
            
        } catch (Exception e) {
        }
    
    } 
    
    
public void show_undergraduate()
    {
        try {
            
            DefaultTableModel tb=(DefaultTableModel)jTable4.getModel();
             
          
            Statement st=con.createStatement();
            
             ResultSet r=st.executeQuery("SELECT * FROM courseunder ");  
            
             
              while(r.next()){
                     
                     Vector v=new Vector();
                     
                     String studentid =(r.getString("studentid"));
                     String nic=(r.getString("nic"));
                     String fullname=(r.getString("fullname"));
                     String initial=(r.getString("initials"));
                     String course=(r.getString("course"));
                     String duration=(r.getString("duration"));
                     String batchno=(r.getString("batchno"));
                     String day=(r.getString("day"));
                     String coursefee=(r.getString("coursefee"));
                     
                     
                     v.add(studentid);
                     v.add(nic);
                     v.add(fullname);
                     v.add(initial);
                     v.add(course);
                     v.add(duration);
                     v.add(batchno);
                     v.add(day);
                     v.add(coursefee);
                    
                  tb.addRow(v);
              }
            
        } catch (Exception e) {
        }
    
    } 

  /*  public ArrayList<Student> studentList() {
        ArrayList<Student> studentList = new ArrayList<>();
        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=abcuni;user=sa;password=sa123";
            Connection con = DriverManager.getConnection(url);
            String sql = "SELECT * FROM student";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            Student student;
            while (rs.next()) {
                student = new Student(rs.getString("title"), rs.getString("fname"), rs.getString("lname"), rs.getString("fullname"), rs.getString("initial"), rs.getString("dob"), rs.getString("nic"),rs.getString("gender"), rs.getString("contact"), rs.getString("email"));
                studentList.add(student);

            }

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
        }
        return studentList;
    }
    
    
    
    public void show_student(){
    
    ArrayList<Student> studentList= new ArrayList<>();
        DefaultTableModel dtm=  (DefaultTableModel) jTable5.setModel(dbutil);
        Object[] row= new Object[10];
        for (int i = 0; i < studentList.size(); i++) {
            row[0]=studentList.get(i).getTitle();
            row[1]=studentList.get(i).getFirstname();
            row[2]=studentList.get(i).getLastname();
            row[3]=studentList.get(i).getFullname();
            row[4]=studentList.get(i).getInitials();
            row[5]=studentList.get(i).getDateofBirth();
            row[6]=studentList.get(i).getNic();
            row[7]=studentList.get(i).getGender();
            row[8]=studentList.get(i).getContact();
            row[9]=studentList.get(i).getEmail();
            dtm.addRow(row);
        }
        
    
    
    
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Id", "Nic", "Fullname", "Initials", "Course Name", "Duration", "Batchno.", "Day and time", "coursefee"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
            jTable3.getColumnModel().getColumn(3).setResizable(false);
            jTable3.getColumnModel().getColumn(4).setResizable(false);
            jTable3.getColumnModel().getColumn(5).setResizable(false);
            jTable3.getColumnModel().getColumn(6).setResizable(false);
            jTable3.getColumnModel().getColumn(7).setResizable(false);
            jTable3.getColumnModel().getColumn(8).setResizable(false);
        }

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 1090, 100));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Id", "Nic", "Fullname", "Initials", "Course Name", "Duration", "Batchno", "Day and time", "coursefee"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setResizable(false);
            jTable4.getColumnModel().getColumn(1).setResizable(false);
            jTable4.getColumnModel().getColumn(2).setResizable(false);
            jTable4.getColumnModel().getColumn(3).setResizable(false);
            jTable4.getColumnModel().getColumn(4).setResizable(false);
            jTable4.getColumnModel().getColumn(5).setResizable(false);
            jTable4.getColumnModel().getColumn(6).setResizable(false);
            jTable4.getColumnModel().getColumn(7).setResizable(false);
            jTable4.getColumnModel().getColumn(8).setResizable(false);
        }

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 1090, 120));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Firstname", "Lastname", "Fullname", "Initials", "DateofBirth", "Nic", "Gender", "Contact", "Email"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1090, 120));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Student Information");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 280, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("Poster Graduate Enrollment");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 280, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("Under Graduate Enrollment");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 280, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1157, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    // End of variables declaration//GEN-END:variables
}
