/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.junit5tesing;


import static org.junit.jupiter.api.Assertions.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author skunal
 */
public class arrayclassTest {
    
    public arrayclassTest() {
    }

  /*  @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    */
    
    /*
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

    @org.junit.Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("The test case is a prototype.");


    }
    */
    @Test  
    public void findMaxtest(){  
        arrayclass x=new arrayclass();
        assertEquals(4,x.findMax(new int[]{1,3,4,2}),"Might This One..");  
        assertEquals(-1,x.findMax(new int[]{-12,-1,-3,-4,-2}),"Check this ..");  
    }  

    /**
     * Test of findMax method, of class arrayclass.
     */
    @Test
    public void dividetest() {
        System.out.println("divide check");
       arrayclass x=new arrayclass();
       
        assertEquals(1, x.divide(1,0),"Here  is an exception state");
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
    
}
