/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author admin
 */
@Entity
@Table(name="VakcinaErtekelesek")
public class VakcinaErtekeles {
    @Id
    @GeneratedValue
    private int ID;
    private int vakcinaID;
    private int szemelyID;
    private String ertekeles;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getVakcinaID() {
        return vakcinaID;
    }

    public void setVakcinaID(int vakcinaID) {
        this.vakcinaID = vakcinaID;
    }

    public int getSzemelyID() {
        return szemelyID;
    }

    public void setSzemelyID(int szemelyID) {
        this.szemelyID = szemelyID;
    }

    public String getErtekeles() {
        return ertekeles;
    }

    public void setErtekeles(String ertekeles) {
        this.ertekeles = ertekeles;
    }
    
}
