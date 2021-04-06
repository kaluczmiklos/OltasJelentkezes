/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf.model;

import java.util.GregorianCalendar;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author admin
 */
@Entity
@Table(name="Szemelyek")
public class Szemely {
    @Id
    @GeneratedValue
    private int ID;
    private String nev;
    private int TAJ;
    private GregorianCalendar SzuletesiDatum;
    @Enumerated(EnumType.STRING)
    NemTipus nem;

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

    public int getTAJ() {
        return TAJ;
    }

    public void setTAJ(int TAJ) {
        this.TAJ = TAJ;
    }

    public GregorianCalendar getSzuletesiDatum() {
        return SzuletesiDatum;
    }

    public void setSzuletesiDatum(GregorianCalendar SzuletesiDatum) {
        this.SzuletesiDatum = SzuletesiDatum;
    }


    
    public NemTipus getNem() {
        return nem;
    }

    public void setNem(NemTipus nem) {
        this.nem = nem;
    }

    public enum NemTipus{
    FERFI,NO;
    }
}
