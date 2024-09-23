/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Mushtaq Rahim
 */
public class splashclass {
 public static void main(String args[]){
 splash sp= new splash();
 sp.setVisible(true);
 Login lg= new Login();
     try {
         for (int i=0; i<=100; i++) {
          Thread.sleep(60);
          sp.jLabel1.setText(Integer.toString(i));
          sp.jProgressBar1.setValue(i);
             if (i==100) {
                 sp.setVisible(false);
                 lg.setVisible(true);
             }
         }
     } catch (Exception e) {
         System.out.println(e);
     }
 
 
 
 }

  
}
