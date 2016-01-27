/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assignment2.gadd.dave;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
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
}
    

