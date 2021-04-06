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
@Table(name="Orvosok")
public class Orvos {
    @Id
    @GeneratedValue
    private int ID;
    private String nev;
    private float ertekeles;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public float getErtekeles() {
        return ertekeles;
    }

    public void setErtekeles(float ertekeles) {
        this.ertekeles = ertekeles;
    }

}
