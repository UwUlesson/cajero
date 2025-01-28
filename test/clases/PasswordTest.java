/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package clases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author uwuless
 */
public class PasswordTest {
    
    public PasswordTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getPass method, of class Password.
     */
    @Test
    public void testGetPass() {
        System.out.println("getPass");
        String expResult = "";
        String result = Password.getPass();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPass method, of class Password.
     */
    @Test
    public void testSetPass() {
        System.out.println("setPass");
        String NewPass = "";
        Password.setPass(NewPass);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifIni method, of class Password.
     */
    @Test
    public void testVerifIni() {
        System.out.println("verifIni");
        Password instance = new Password();
        instance.verifIni();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Password.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Password.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
