/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assignment2.gadd.dave;

/**
 *
 * @author c0641903
 */
public class Student {
    private String name;
    private String id;
    private String gender;
    private Double grade;
    
    public Student() {
        name = "";
        id = "";
        gender = "";
        grade = 0.00;
    }
    public Student(String name, String id, String gender, double grade) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public Double getGrade() {
        return grade;
    }
    public void setGrade(Double grade) {
        this.grade = grade;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            return (student.getName().equals(name) && student.getId().equals(id));
        } else {
            return false;
        }
    }
    @Override
    public String toString() {
        return "{ \"name\" : \"" + name + "\", \"id\" : \"" + id + "\", \"gender\" : \"" + gender + "\", \"grade\" : " + grade + " }";
    }
}