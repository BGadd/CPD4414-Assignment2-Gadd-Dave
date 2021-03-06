/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assignment2.gadd.dave;
//import com.google.common.base.Splitter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0640891
 */
public class CPD4414Assignment2GaddDaveTest {
    
    public CPD4414Assignment2GaddDaveTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class CPD4414Assignment2GaddDave.
     */
    @Test
    public void testEmptyStudent(){
        System.out.println("testEmptyStudentConstructor");
        Student instance = new Student();
        String result = instance.toString();
        String expResult = "{ \"name\" : \"\", \"id\" : \"\", \"gender\" : \"\", \"grade\" : 0.0 }";
        assertEquals(expResult, result);
        //{ "name" : "", "id" : "", "gender" : "", "grade" : 0.0 }
        //{ "name" : "", "id" : "", "gender" : "", "grade" : 0.0 }
    }
    @Test
    public void testStudentToString(){
        System.out.println("testStudentToString");
        String name = "James Dean";
        String number = "c0640891";
        String gender = "male";
        double grade = 80.0;
        Student instance = new Student(name,number,gender,grade);
        String result = instance.toString();
        String expResult = "{ \"name\" : \"James Dean\", \"id\" : \"c0640891\", \"gender\" : \"male\", \"grade\" : 80.0 }";
        assertEquals(expResult,result);
    }
    @Test
    public void testStudentGetName(){
        System.out.println("testStudentGetName");
        String name = "James Dean";
        String number = "c0640891";
        String gender = "male";
        double grade = 80.00;
        Student instance = new Student(name,number,gender,grade);
        String expResult = "James Dean";
        String result = instance.getName();
        assertEquals(expResult,result);
    }
    @Test
    public void testStudentGetNumber(){
        System.out.println("testStudentGetID");
        String name = "James Dean";
        String number = "c0640891";
        String gender = "male";
        double grade = 80.00;
        Student instance = new Student(name,number,gender,grade);
        String expResult = "c0640891";
        String result = instance.getId();
        assertEquals(expResult,result);
    }
    @Test
    public void testStudentGetGender(){
        System.out.println("testStudentGetGender");
        String name = "James Dean";
        String number = "c0640891";
        String gender = "male";
        double grade = 80.00;
        Student instance = new Student(name,number,gender,grade);
        String expResult = "male";
        String result = instance.getGender();
        assertEquals(expResult,result);
    }
    @Test
    public void testStudentGetGrade(){
        System.out.println("testStudentGetGrade");
        String name = "James Dean";
        String number = "c0640891";
        String gender = "male";
        double grade = 80.00;
        Student instance = new Student(name,number,gender,grade);
        double expResult = 80.00;
        double result = instance.getGrade();
        assertEquals(expResult,result,0);
    }
    @Test
    public void testStudentEqualsFalse(){
        System.out.println("testStudentEqualsMethodFalse");
        String name = "James Dean";
        String number = "c0640891";
        String gender = "male";
        double grade = 80.00;
        Student instance = new Student(name, number, gender, grade);
        Course instance2 = new Course();
        boolean expResult = false;
        boolean result = instance.equals(instance2);
        assertEquals(expResult,result);
    }
    @Test
    public void testStudentEqualsTrue(){
        System.out.println("testStudentEqualsMethodTrue");
        String name = "James Dean";
        String number = "c0640891";
        String gender = "male";
        double grade = 80.00;
        Student instance = new Student(name, number, gender, grade);
        boolean expResult = true;
        boolean result = instance.equals(instance);
        assertEquals(expResult,result);
        
    
    }
    @Test
    public void testStudentEqualsMethodIDFalse(){
        System.out.println("testStudentEqualsMethodIDFalse");
        String name = "James Dean";
        String number = "c0640891";
        String gender = "male";
        double grade = 80.00;
        Student instance = new Student(name, number, gender, grade);
        String name2 = "James Dean";
        String number2 = "c0000000";
        String gender2 = "male";
        double grade2 = 80.00;
        Student instance2 = new Student(name2, number2, gender2, grade2);
        boolean expResult = false;
        boolean result = instance.equals(instance2);
        assertEquals(expResult,result);
    }
        @Test
    public void testStudentEqualsMethodNameFalse(){
        System.out.println("testStudentEqualsMethodNameFalse");
        String name = "James Dean";
        String number = "c0640891";
        String gender = "male";
        double grade = 80.00;
        Student instance = new Student(name, number, gender, grade);
        String name2 = "Cameron Clarke";
        String number2 = "c060891";
        String gender2 = "male";
        double grade2 = 80.00;
        Student instance2 = new Student(name2, number2, gender2, grade2);
        boolean expResult = false;
        boolean result = instance.equals(instance2);
        assertEquals(expResult,result);
    }
    @Test
    public void testStudentEqualsMethodBothFalse(){
        System.out.println("testStudentEqualsMethodBothFalse");
        String name = "James Dean";
        String number = "c0640891";
        String gender = "male";
        double grade = 80.00;
        Student instance = new Student(name, number, gender, grade);
        String name2 = "Cameron Clarke";
        String number2 = "c0000000";
        String gender2 = "male";
        double grade2 = 80.00;
        Student instance2 = new Student(name2, number2, gender2, grade2);
        boolean expResult = false;
        boolean result = instance.equals(instance2);
        assertEquals(expResult,result);
    }
    @Test
    public void testCourseListConstructor(){
        List<Student> expResult;
        expResult = new ArrayList<>();
        Course instance = new Course(expResult);
        List<Student> result = instance.getAll();
        assertEquals(expResult,result);
    }
    @Test
    public void testCourseAdd(){
        Course instance = new Course();
        String name = "James Dean";
        String number = "c0640891";
        String gender = "male";
        double grade = 80.0;
        Student instance2 = new Student(name,number,gender,grade);
        List<Student> expResult = new ArrayList<Student>();
        expResult.add(instance2);
        instance.add(instance2);
        List<Student> result = instance.getAll();
        assertEquals(expResult, result);
    }
    @Test
    public void testCourseRemoveStudent(){
        Student Student = new Student();
        List<Student> test = new ArrayList<Student>();
        List<Student> expResult = new ArrayList<Student>();
        test.add(Student);
        String name = "James Dean";
        String id = "c0640891";
        String gender = "male";
        double grade = 80.0;
        Student Student2 = new Student(name,id,gender,grade);
        test.add(Student2);
        expResult.add(Student2);
        Course instance = new Course(test);
        instance.remove(Student);
        List<Student> result = instance.getAll();
        assertEquals(expResult, result);
    
    }
     @Test
     public void testCourseRemoveString(){
        Student Student = new Student();
        List<Student> test = new ArrayList<Student>();
        List<Student> expResult = new ArrayList<Student>();
        test.add(Student);
        String name = "James Dean";
        String id = "c0640891";
        String gender = "male";
        double grade = 80.0;
        Student Student2 = new Student(name,id,gender,grade);
        test.add(Student2);
        expResult.add(Student2);
        Course instance = new Course(test);
        instance.remove("");
        List<Student> result = instance.getAll();
        assertEquals(expResult, result);
    
    }
      @Test
      public void testCourseRemovePosition(){
        Student Student = new Student();
        List<Student> test = new ArrayList<Student>();
        List<Student> expResult = new ArrayList<Student>();
        test.add(Student);
        String name = "James Dean";
        String id = "c0640891";
        String gender = "male";
        double grade = 80.0;
        Student Student2 = new Student(name,id,gender,grade);
        test.add(Student2);
        expResult.add(Student2);
        Course instance = new Course(test);
        instance.remove(0);
        List<Student> result = instance.getAll();
        assertEquals(expResult, result);
    
    }
      @Test
       public void testCourseInsertStudent(){
        Student Student = new Student();
        List<Student> test = new ArrayList<Student>();
        List<Student> expResult = new ArrayList<Student>();
        String name = "James Dean";
        String id = "c0640891";
        String gender = "male";
        double grade = 80.0;
        Student Student2 = new Student(name,id,gender,grade);
        test.add(Student2);  
        expResult.add(Student2);
        Course instance = new Course(test);
        instance.insert(Student, 1);
        expResult.add(Student);
        List<Student> result = instance.getAll();
        assertEquals(expResult, result);
    }
      @Test
    public void testCourseGetString(){
        String name = "James Dean";
        String number = "c0640891";
        String gender = "male";
        double grade = 80.0;
        Student instance2 = new Student(name,number,gender,grade);
        List<Student> expResult = new ArrayList<Student>();
        expResult.add(instance2);
        Course instance = new Course(expResult);
        Student result = instance.get(number);
        assertEquals(instance2, result);
    }
      @Test
    public void testCourseGetStringNull(){
        String name = "James Dean";
        String number = "c0640891";
        String gender = "male";
        double grade = 80.0;
        Student instance2 = new Student(name,number,gender,grade);
        List<Student> fill = new ArrayList<Student>();
        fill.add(instance2);
        Student expResult = null;
        Course instance = new Course(fill);
        Student result = instance.get("c000000");
        assertEquals(expResult, result);
    }
    @Test
    public void testCourseGetPosition(){
        String name = "James Dean";
        String number = "c0640891";
        String gender = "male";
        double grade = 80.0;
        Student instance2 = new Student(name,number,gender,grade);
        List<Student> expResult = new ArrayList<Student>();
        expResult.add(instance2);
        Course instance = new Course(expResult);
        Student result = instance.get(0);
        assertEquals(instance2, result);
    }
      @Test
    public void testCourseGetPositionNull(){
        String name = "James Dean";
        String number = "c0640891";
        String gender = "male";
        double grade = 80.0;
        Student instance2 = new Student(name,number,gender,grade);
        List<Student> fill = new ArrayList<Student>();
        fill.add(instance2);
        Student expResult = null;
        Course instance = new Course(fill);
        int pos = 1; 
        Student result = instance.get(pos);    
        assertEquals(expResult, result);
    }
      @Test
    public void testCourseGetPositionLessThanZeroNull(){
        String name = "James Dean";
        String number = "c0640891";
        String gender = "male";
        double grade = 80.0;
        Student instance2 = new Student(name,number,gender,grade);
        List<Student> fill = new ArrayList<Student>();
        fill.add(instance2);
        Student expResult = null;
        Course instance = new Course(fill);
        int pos = -1;
        Student result = instance.get(pos);
        assertEquals(expResult, result);
    }
      @Test
    public void testCourseEqualsFalse(){
        String name = "James Dean";
        String number = "c0640891";
        String gender = "male";
        double grade = 80.0;
        Student instance2 = new Student(name,number,gender,grade);
        List<Student> fill = new ArrayList<Student>();
        fill.add(instance2);
        Course instance = new Course(fill);
        boolean expResult = false;
        boolean result = instance.equals(instance2);
        assertEquals(expResult, result);
    }
       @Test
    public void testCourseEqualsTrue(){
        String name = "James Dean";
        String number = "c0640891";
        String gender = "male";
        double grade = 80.0;
        Student instance2 = new Student(name,number,gender,grade);
        List<Student> fill = new ArrayList<Student>();
        fill.add(instance2);
        Course instance = new Course(fill);
        Course course = new Course(fill);
        boolean expResult = true;
        boolean result = instance.equals(course);
        assertEquals(expResult, result);
    }
      @Test
    public void testCourseDifferentStudentsEqualsFalse(){
        String name = "James Dean";
        String number = "c0640891";
        String gender = "male";
        double grade = 80.0;
        String n = "Ned Stark";
        String id = "c0000001";
        String g = "male";
        double gr = 100.0;
        Student instance2 = new Student(name,number,gender,grade);
        Student stu = new Student(n,id,g,gr);
        List<Student> fill = new ArrayList<Student>();
        List<Student> fill2 = new ArrayList<Student>();
        fill2.add(stu);
        fill.add(instance2);
        Course instance = new Course(fill);
        Course course = new Course(fill2);
        boolean expResult = false;
        boolean result = instance.equals(course);
        assertEquals(expResult, result);
    }
    @Test public void testCourseJSON(){
        String name = "James Dean";
        String number = "c0640891";
        String gender = "male";
        double grade = 80.0;
        Student instance2 = new Student(name,number,gender,grade);
        List<Student> fill = new ArrayList<Student>();
        fill.add(instance2);
        Course instance = new Course(fill);
        String expResult = "[\n{ \"name\" : \"James Dean\", \"id\" : \"c0640891\", \"gender\" : \"male\", \"grade\" : 80.0 }\n]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    @Test public void testCourseGetAllByGender(){
        String name = "James Dean";
        String number = "c0640891";
        String gender = "male";
        double grade = 80.0;
        Student instance2 = new Student(name,number,gender,grade);
        List<Student> fill = new ArrayList<Student>();
        fill.add(instance2);
        Course instance = new Course(fill);
        Set<Student> expResult = new HashSet<>();
        expResult.add(instance2);
        Set<Student> result = instance.getAllByGender(gender);
        assertEquals(expResult, result);
    }
      @Test
    public void testCourseMap(){
        String name = "James Dean";
        String number = "c0640891";
        String gender = "male";
        double grade = 40.7;
        Student instance2 = new Student(name,number,gender,grade);
        List<Student> fill = new ArrayList<Student>();
        fill.add(instance2);
        Course instance = new Course(fill);
        Map<String, Set<Student>> result = instance.getGradeMap(); 
        Map<String, Set<Student>> expResult = new TreeMap<>();
        List<Student> students = new ArrayList<>();
        students.add(instance2);
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
        expResult.put("A+", aPlusSet);
        expResult.put("A", aSet);
        expResult.put("A-", aMinSet);
        expResult.put("B+", bPlusSet);
        expResult.put("B", bSet);
        expResult.put("B-", bMinSet);
        expResult.put("C+", cPlusSet);
        expResult.put("C", cSet);
        expResult.put("C-", cMinSet);
        expResult.put("D", dSet);
        expResult.put("F", fSet);
        assertEquals(expResult, result);
    }
}
    

