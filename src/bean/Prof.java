/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 *
 * @author Admin
 */
@Entity
public class Prof implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    
    private String id;
    private double salaire;
    private String grade;
    private double ancienneté;
    private int idBureau;
    private int etageBureau;
    private String departement;

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getAncienneté() {
        return ancienneté;
    }

    public void setAncienneté(double ancienneté) {
        this.ancienneté = ancienneté;
    }

    public int getIdBureau() {
        return idBureau;
    }

    public void setIdBureau(int idBureau) {
        this.idBureau = idBureau;
    }

    public int getEtageBureau() {
        return etageBureau;
    }

    public void setEtageBureau(int etageBureau) {
        this.etageBureau = etageBureau;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public Prof() {
    }

    public Prof(String id) {
        this.id = id;
    }

    public Prof(String id, double salaire, String grade, double ancienneté, int idBureau, int etageBureau, String departement) {
        this.id = id;
        this.salaire = salaire;
        this.grade = grade;
        this.ancienneté = ancienneté;
        this.idBureau = idBureau;
        this.etageBureau = etageBureau;
        this.departement = departement;
    }
 

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prof)) {
            return false;
        }
        Prof other = (Prof) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "prof{" + "id=" + id + ", salaire=" + salaire + ", grade=" + grade + ", anciennet\u00e9=" + ancienneté + ", idBureau=" + idBureau + ", etageBureau=" + etageBureau + ", departement=" + departement + '}';
    }

    
}
