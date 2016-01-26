/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assignment2.gadd.dave;

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
        String expResult = "";
        assertEquals(expResult, instance);
    }
    @Test
    public void testStudentToString(){
        System.out.println("testStudentToString");
        String name = "James Dean";
        String number = "c0640891";
        String gender = "male";
        double grade = 80.00;
        Student instance = new Student(name,number,gender,grade);
        String result = instance.toString();
        String expResult = "{\"name\" : \"James Dean\", \"id\" : \"c0640891\", \"gender\" : \"male\", \"grade\" : 80.00}";
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
        String expResult = "c0640891";
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
        assertEquals(expResult,result);
    }
    
}
    

