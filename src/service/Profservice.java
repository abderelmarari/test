/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Prof;
import bean.Prof;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Admin
 */
public class Profservice extends AbstractFacade<Prof> {
//    private static List<Prof> profs = new ArrayList<>();
    public void initdb() {
        
                    creerprof("e1", 2444, "g1", 4, 3, 2, "info1");
       
          creerprof("e2", 244, "g1", 16, 3, 1, "math");
         creerprof("e3", 3000, "g2", 3, 4, 2, "chimie");
       creerprof("e4", 344, "g3", 2, 2, 1, "info");
         creerprof("e5", 49595, "g1", 6, 1, 2, "bio");
      
    }
    

    public Profservice() {
        super(Prof.class);
    }
   
    
    
    public int creerprof(String id, double saliare,String grade,double ancienneté,int idBureau,int etageBureau,String departement) {
       
            Prof prof = new Prof();
            prof.setId(id);
            prof.setSalaire(saliare);
            prof.setGrade(grade);
            prof.setAncienneté(ancienneté);
            prof.setIdBureau(idBureau);
            prof.setEtageBureau(etageBureau);
            prof.setDepartement(departement);
            create(prof);
            
        return 1;
    } 
    public int findByIndex(String id, List<Prof> profs) {
        for (int i = 0; i < profs.size(); i++) {
            Prof prof = profs.get(i);
            if (prof.getId().equals(id)) {
                return i;
            }

        }
        return -1;
    }

    public Prof findProfesseur(String id, List<Prof> profs) {
        int index = findByIndex(id, profs);
        if (index == -1) {
            return null;
        } else {
            return profs.get(index);
        }
    }

    public Prof findAncienProf(List<Prof> profs) {
        Prof ancien = profs.get(0);
        if (profs.isEmpty()) {
            return null;
        } else if (profs.size() == 1) {
            return profs.get(0);
        } else {
            for (int i = 0; i < profs.size(); i++) {
                Prof prof = profs.get(i);
                if (prof.getAncienneté() > ancien.getAncienneté()) {
                    ancien = prof;
                }

            }
            return ancien;
        }

    }

    public List<Prof> findProfByGrade(List<Prof> profs, String grade) {
        List<Prof> listgrad = new ArrayList<>();
        for (Prof prof : profs) {
            if (prof.getGrade().equals(grade)) {
                listgrad.add(prof);
            }

        }
        return listgrad;
    }

    public List<Prof> findProfByDepartement(String departement, List<Prof> profs) {
        List<Prof> listdepartement = new ArrayList<>();
        for (Prof prof : profs) {
            if (prof.getDepartement().equals(departement)) {
                listdepartement.add(prof);
            }

        }
        return listdepartement;
    }

    public int isCollocataire(String idProf1, String idProf2, List<Prof> profs) {
        Prof prof1 = findProfesseur(idProf1, profs);
        Prof prof2 = findProfesseur(idProf2, profs);
        if (prof1 == null || prof2 == null) {
            return -1;
        } else if (prof1.getIdBureau() != prof2.getIdBureau()) {
            return -2;
        } else {
            return 1;
        }

    }

    public int countDesk(int etage, List<Prof> profs) {
        int cmp = 0;
        if (profs.isEmpty() || profs == null) {
            return 0;
        } else {
            for (Prof prof : profs) {
                if (prof.getEtageBureau() == etage) {
                    cmp++;
                }

            }
            return cmp;
        }
    }

    public boolean swich(String idProf1, String idProf2, List<Prof> profs) {
        Prof prof1 = findProfesseur(idProf1, profs);
        Prof prof2 = findProfesseur(idProf2, profs);
        int Idaid1 = 0;
        int Idaid2 = 0;
        int Idaid;
        if (prof1 == null || prof2 == null) {
            return false;
        } else {
            Idaid1 = prof1.getIdBureau();
            Idaid2 = prof2.getIdBureau();
            Idaid = Idaid1;
            Idaid1 = Idaid2;
            Idaid2 = Idaid;
        }
        return false;

    }
}
