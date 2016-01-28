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
import java.util.TreeMap;

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
        if (position < 0 || position >= students.size()) {
            return null;
        }
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
        for (int a = 0; a < students.size()-1; a++) {
            output += "{ \"name\" : \"" + students.get(a).getName() + "\", \"id\" : \"" + students.get(a).getId() + "\", \"gender\" : \"" + students.get(a).getGender() + "\", \"grade\" : " + students.get(a).getGrade() + " },\n";
        }
        output += "{ \"name\" : \"" + students.get(students.size()-1).getName() + "\", \"id\" : \"" + students.get(students.size()-1).getId() + "\", \"gender\" : \"" + students.get(students.size()-1).getGender() + "\", \"grade\" : " + students.get(students.size()-1).getGrade() + " }\n";
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
        Map<String, Set<Student>> gradeMap = new TreeMap<>();
        Set<Student> aPlusSet = new HashSet<>();
        Set<Student> aSet = new HashSet<>();
        Set<Student> aMinSet = new HashSet<>();
        Set<Student> bPlusSet = new HashSet<>();
        Set<Student> bSet = new HashSet<>();
        Set<Student> bMinSet = new HashSet<>();
        Set<Student> cPlusSet = new HashSet<>();
        Set<Student> cSet = new HashSet<>();
        Set<Student> cMinSet = new HashSet<>();
        Set<Student> dSet = new HashSet<>();
        Set<Student> fSet = new HashSet<>();
        for (int a = 0; a < students.size(); a++) {
            if (students.get(a).getGrade() < 101 && students.get(a).getGrade() >= 94) {
                aPlusSet.add(students.get(a));
            } else if (students.get(a).getGrade() < 94.0 && students.get(a).getGrade() >= 87) {
                aSet.add(students.get(a));
            } else if (students.get(a).getGrade() < 87.0 && students.get(a).getGrade() >= 80) {
                aMinSet.add(students.get(a));
            } else if (students.get(a).getGrade() < 80.0 && students.get(a).getGrade() >= 77) {
                bPlusSet.add(students.get(a));
            } else if (students.get(a).getGrade() < 77.0 && students.get(a).getGrade() >= 73) {
                bSet.add(students.get(a));
            } else if (students.get(a).getGrade() < 73.0 && students.get(a).getGrade() >= 70) {
                bMinSet.add(students.get(a));
            } else if (students.get(a).getGrade() < 70.0 && students.get(a).getGrade() >= 67) {
                cPlusSet.add(students.get(a));
            } else if (students.get(a).getGrade() < 67.0 && students.get(a).getGrade() >= 63) {
                cSet.add(students.get(a));
            } else if (students.get(a).getGrade() < 63.0 && students.get(a).getGrade() >= 60) {
                cMinSet.add(students.get(a));
            } else if (students.get(a).getGrade() < 60.0 && students.get(a).getGrade() >= 50) {
                dSet.add(students.get(a));
            } else if (students.get(a).getGrade() < 50.0 && students.get(a).getGrade() >= 0) {
                fSet.add(students.get(a));
            } 
        }
        gradeMap.put("A+", aPlusSet);
        gradeMap.put("A", aSet);
        gradeMap.put("A-", aMinSet);
        gradeMap.put("B+", bPlusSet);
        gradeMap.put("B", bSet);
        gradeMap.put("B-", bMinSet);
        gradeMap.put("C+", cPlusSet);
        gradeMap.put("C", cSet);
        gradeMap.put("C-", cMinSet);
        gradeMap.put("D", dSet);
        gradeMap.put("F", fSet);
        return gradeMap;
    }
}
