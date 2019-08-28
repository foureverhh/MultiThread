/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yuanheng.java19.multithreadpractice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author foureverhh
 */
public class RabbitTest {
    int counter;
    public RabbitTest() {
        System.out.println("Constructor");
        counter = 1;
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("befor class");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("after class");
    }
    
    @Before
    public void setUp() {
        System.out.println("before");
        counter++;
        System.out.println("Counter: "+counter);
    }
    
    @After
    public void tearDown() {
        System.out.println("after");
        counter++;
        System.out.println("Counter: "+counter);
    }

    
    @Test
    public void testSomeMethod1() {
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("method1");
        counter++;
        System.out.println("Counter: "+counter);
    }
    
       @Test
    public void testSomeMethod2() {
        // TODO review the generated test code and remove the default call to fail.
           System.out.println("method2");
        counter++;
        System.out.println("Counter: "+counter);
    }
    
}
