/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlistlive;

/**
 *
 * @author winma
 */
public class Student {
    
    private String name;
    private String studentID;
    

    public Student(String givenName, String givenstudentID) {
        name = givenName;
        studentID = givenstudentID;
    }
    
    public Student(String givenName) {
        name = givenName;
    }
    
    public Student() {
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}
