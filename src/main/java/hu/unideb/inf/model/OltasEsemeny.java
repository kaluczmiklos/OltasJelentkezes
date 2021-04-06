/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf.model;

import java.util.GregorianCalendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author admin
 */
@Entity
@Table(name="OltasEsemenyek")
public class OltasEsemeny {
    @Id
    @GeneratedValue
    private int ID;
    private int szemelyID;
    private int vakcinaID;
    private int orvosID;
    private GregorianCalendar idopont;
    private boolean megkapta;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSzemelyID() {
        return szemelyID;
    }

    public void setSzemelyID(int szemelyID) {
        this.szemelyID = szemelyID;
    }

    public int getVakcinaID() {
        return vakcinaID;
    }

    public void setVakcinaID(int vakcinaID) {
        this.vakcinaID = vakcinaID;
    }

    public int getOrvosID() {
        return orvosID;
    }

    public void setOrvosID(int orvosID) {
        this.orvosID = orvosID;
    }

    public GregorianCalendar getIdopont() {
        return idopont;
    }

    public void setIdopont(GregorianCalendar idopont) {
        this.idopont = idopont;
    }



    public boolean isMegkapta() {
        return megkapta;
    }

    public void setMegkapta(boolean megkapta) {
        this.megkapta = megkapta;
    }

    
}
