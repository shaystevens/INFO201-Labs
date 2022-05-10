/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab08;

import java.util.Collection;

/**
 *
 * @author shaystevens
 */
public class ClassEnrolment {
    private int year;
    
    private Collection<ClassEnrolment> classes;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Collection<ClassEnrolment> getClasses() {
        return classes;
    }

    public void setClasses(Collection<ClassEnrolment> classes) {
        this.classes = classes;
    }
    
}
