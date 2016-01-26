/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assignment2.gadd.dave;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author c0641903
 */
public class Course {
    private List<Student> students;
    
    public Course() {
        students = new ArrayList<>();
    }
    public Course(List<Student> studentList) {
        students = studentList;
    }
    
    public void add(Student student) {
        students.add(student);
    }
    
    public void remove(Student student) {
        students.remove(student);
    }
    public void remove(String id) {
        for (int a = 0; a < students.size(); a++) {
            if (students.get(a).getId().equals(id)) {
                students.remove(a);
            }
        }
    }
    public void remove(int position) {
        students.remove(position);
    }
    
    public void insert(Student student, int position) {
        students.add(position, student);
    }
    
    public Student get(String id) {
        for (int a = 0; a < students.size(); a++) {
            if (students.get(a).getId().equals(id)) {
                return students.get(a);
            }
        }
        return null;
    }
    public Student get(int position) {
        return students.get(position);
    }
    public List<Student> getAll() {
        return students;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Course) {
            Course course = (Course) obj;
            return (course.getAll().equals(students));
        } else {
            return false;
        }
    }
    @Override
    public String toString() {
        String output = "[\n";
        for (int a = 0; a < students.size(); a++) {
            output += "{ \"name\" : \"" + students.get(a).getName() + "\", \"id\" : \"" + students.get(a).getId() + "\", \"gender\" : \"" + students.get(a).getGender() + "\", \"grade\" : " + students.get(a).getGrade() + " },\n";
        }
        output += "]";
        return output;
    }
    
    public Set<Student> getAllByGender(String gender) {
        Set<Student> studentSet = new HashSet<>();
        for (int a = 0; a < students.size(); a++) {
            if (students.get(a).getGender().equals(gender)) {
                studentSet.add(students.get(a));
            }
        }
        return studentSet;
    }
    public Map<String, Set<Student>> getGradeMap() {
        
    }
}
