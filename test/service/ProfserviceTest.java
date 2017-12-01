/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Prof;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;



/**
 *
 * @author Admin
 */
public class ProfserviceTest {
    
    
    public ProfserviceTest() {
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
     * Test of initdb method, of class Profservice.
     */
    @Test
    public void testInitdb() {
        System.out.println("initdb");
        Profservice instance = new Profservice();
        instance.initdb();
        // TODO review the generated test code and remove the default call to fail.
        
    }

   
//
    /**
     * Test of creerprof method, of class Profservice.
     */
    @Test
    public void testCreerprof() {
        System.out.println("creerprof");
        String id = "e1";
        double saliare = 1000;
        String grade = "g1";
        double ancienneté = 10;
        int idBureau = 6;
        int etageBureau = 2;
        String departement = "info1";
        Profservice instance = new Profservice();
        instance.creerprof(id, saliare, grade, ancienneté, idBureau, etageBureau, departement);
        // TODO review the generated test code and remove the default call to fail.
       
    }

//    /**
//     * Test of findByIndex method, of class Profservice.
//     */
//    @Test
//    public void testFindByIndex() {
//        System.out.println("findByIndex");
//        String id = "";
//        List<Prof> profs = null;
//        Profservice instance = new Profservice();
//        int expResult = 0;
//        int result = instance.findByIndex(id, profs);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//     
//    }
//
//    /**
//     * Test of findProfesseur method, of class Profservice.
//     */
//    @Test
//    public void testFindProfesseur() {
//        System.out.println("findProfesseur");
//        String id = "";
//        List<Prof> profs = null;
//        Profservice instance = new Profservice();
//        Prof expResult = null;
//        Prof result = instance.findProfesseur(id, profs);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//     
//    }
//
//    /**
//     * Test of findAncienProf method, of class Profservice.
//     */
//    @Test
//    public void testFindAncienProf() {
//        System.out.println("findAncienProf");
//        List<Prof> profs = null;
//        Profservice instance = new Profservice();
//        Prof expResult = null;
//        Prof result = instance.findAncienProf(profs);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        
//    }
//
//    /**
//     * Test of findProfByGrade method, of class Profservice.
//     */
//    @Test
//    public void testFindProfByGrade() {
//        System.out.println("findProfByGrade");
//        List<Prof> profs = null;
//        String grade = "";
//        Profservice instance = new Profservice();
//        List<Prof> expResult = null;
//        List<Prof> result = instance.findProfByGrade(profs, grade);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        
//    }
//
//    /**
//     * Test of findProfByDepartement method, of class Profservice.
//     */
//    @Test
//    public void testFindProfByDepartement() {
//        System.out.println("findProfByDepartement");
//        String departement = "";
//        List<Prof> profs = null;
//        Profservice instance = new Profservice();
//        List<Prof> expResult = null;
//        List<Prof> result = instance.findProfByDepartement(departement, profs);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        
//    }
//
//    /**
//     * Test of isCollocataire method, of class Profservice.
//     */
//    @Test
//    public void testIsCollocataire() {
//        System.out.println("isCollocataire");
//        String idProf1 = "";
//        String idProf2 = "";
//        List<Prof> profs = null;
//        Profservice instance = new Profservice();
//        int expResult = 0;
//        int result = instance.isCollocataire(idProf1, idProf2, profs);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//      
//    }
//
//    /**
//     * Test of countDesk method, of class Profservice.
//     */
//    @Test
//    public void testCountDesk() {
//        System.out.println("countDesk");
//        int etage = 0;
//        List<Prof> profs = null;
//        Profservice instance = new Profservice();
//        int expResult = 0;
//        int result = instance.countDesk(etage, profs);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//     
//    }
//
//    /**
//     * Test of swich method, of class Profservice.
//     */
//    @Test
//    public void testSwich() {
//        System.out.println("swich");
//        String idProf1 = "";
//        String idProf2 = "";
//        List<Prof> profs = null;
//        Profservice instance = new Profservice();
//        boolean expResult = false;
//        boolean result = instance.swich(idProf1, idProf2, profs);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//      
//    }

}
