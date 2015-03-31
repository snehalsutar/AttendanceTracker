 /******************************************************************************
 * Developed By: Snehal V Sutar. 
 * Net ID: svs130130
 * Class Name: MainScreen
 * Function: The main screen of the application.
 ******************************************************************************/
package attendancetracker;

import attendancetracker.recordattendance.RecordAttGUI;
import attendancetracker.courseregistration.CourseRegGUI;
import attendancetracker.course.CourseGUI;
import attendancetracker.student.StudentGUI;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

/**
 *
 * @author SnehalSutar
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
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

        jPanel1 = new javax.swing.JPanel();
        recordAttendance = new javax.swing.JButton();
        maintainStudent = new javax.swing.JButton();
        maintainCourses = new javax.swing.JButton();
        courseRegButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        recordAttendance.setBackground(new java.awt.Color(255, 255, 153));
        recordAttendance.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        recordAttendance.setText("Record Attendance");
        recordAttendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recordAttendanceMouseClicked(evt);
            }
        });
        recordAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordAttendanceActionPerformed(evt);
            }
        });

        maintainStudent.setBackground(new java.awt.Color(255, 255, 153));
        maintainStudent.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        maintainStudent.setText("Student");
        maintainStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maintainStudentMouseClicked(evt);
            }
        });
        maintainStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maintainStudentActionPerformed(evt);
            }
        });

        maintainCourses.setBackground(new java.awt.Color(255, 255, 153));
        maintainCourses.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        maintainCourses.setText("Courses");
        maintainCourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maintainCoursesMouseClicked(evt);
            }
        });
        maintainCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maintainCoursesActionPerformed(evt);
            }
        });

        courseRegButton.setBackground(new java.awt.Color(255, 255, 153));
        courseRegButton.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        courseRegButton.setText("Course Registration");
        courseRegButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseRegButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(recordAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(maintainCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseRegButton, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maintainStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(recordAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(maintainStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(courseRegButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(maintainCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void close()
    {
    WindowEvent winclosingevent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winclosingevent);
    }
    private void recordAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordAttendanceActionPerformed
        //close();
        this.setVisible(false);
        dispose();
        
        RecordAttGUI recAtt = new RecordAttGUI();
        recAtt.setVisible(true);
        
    }//GEN-LAST:event_recordAttendanceActionPerformed

    private void recordAttendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recordAttendanceMouseClicked
            this.setVisible(false);
            dispose();
            RecordAttGUI recAtt = new RecordAttGUI();
            recAtt.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_recordAttendanceMouseClicked

    private void maintainCoursesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maintainCoursesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_maintainCoursesMouseClicked

    private void maintainStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maintainStudentMouseClicked
        
    }//GEN-LAST:event_maintainStudentMouseClicked

    private void maintainStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maintainStudentActionPerformed
       this.setVisible(false);
       dispose();
       StudentGUI stud = new StudentGUI();
       Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
       stud.setLocation(dim.width/2-stud.getSize().width/2, dim.height/2-stud.getSize().height/2);
       stud.setVisible(true);
       
       
    }//GEN-LAST:event_maintainStudentActionPerformed

    private void maintainCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maintainCoursesActionPerformed
       this.setVisible(false);
       dispose();
        CourseGUI course = new CourseGUI();
       course.setVisible(true);
       
       
    }//GEN-LAST:event_maintainCoursesActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
       this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }//GEN-LAST:event_formWindowActivated

    private void courseRegButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseRegButtonActionPerformed
        this.setVisible(false);
        dispose();
        CourseRegGUI courseReg = new CourseRegGUI();
        courseReg.setVisible(true);
    }//GEN-LAST:event_courseRegButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton courseRegButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton maintainCourses;
    private javax.swing.JButton maintainStudent;
    private javax.swing.JButton recordAttendance;
    // End of variables declaration//GEN-END:variables
}
