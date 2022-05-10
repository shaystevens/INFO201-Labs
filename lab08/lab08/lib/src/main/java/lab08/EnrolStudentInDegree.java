/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab08;

/**
 *
 * @author shaystevens
 */
public class EnrolStudentInDegree {
    private TextField txtStudentID;
    
    private JComboBox cmbStatus;
    private JComboBox cmbDegreeName;
    
    private JButton btnSave;
    private JButton btnCancel;
    private JButton btnFindStudent;
    
    private ButtonGroup radGrpPaymentRecieved;
    
    private EnrolmentDataStore dataStore;
    private Student student;
    private DegreeEnrolment enrolment;
    
    public void displayForm(){
        Collection<String> degreeNames = getDegreeNames();
        populateDegreeNames(degreeNames);
        
        Collection<String> statuses = getDegreeEnrolmentStatuses();
        populateStatuses(statues);
        
    }
    
    private void btnFindStudentClicked(){
        String studentID = txtStudentID.getText();
        
        student = dataStore.findStudent(studentID);
    }
    
    private void btnSaveClicked(){
        enrolment = new DegreeEnrolment();
        
        String enrolmentName = enrolment.getSelectedItem();
        enrolment.setDegreeName(enrolmentName);
        
        dataStore.enrolStudentInDegree(student, enrolment);
        
        dataStore.saveEnrolment(enrolment);
    }
}
