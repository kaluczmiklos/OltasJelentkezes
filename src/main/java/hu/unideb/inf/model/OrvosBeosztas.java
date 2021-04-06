/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author admin
 */
@Entity
@Table(name="OrvosBeosztasok")
public class OrvosBeosztas {
    @Id
    @GeneratedValue
    private int ID;
    private int orvosID;
    private Date kezdesIdo;
    private Date vegzesIdo;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getOrvosID() {
        return orvosID;
    }

    public void setOrvosID(int orvosID) {
        this.orvosID = orvosID;
    }

    public Date getKezdesIdo() {
        return kezdesIdo;
    }

    public void setKezdesIdo(Date kezdesIdo) {
        this.kezdesIdo = kezdesIdo;
    }

    public Date getVegzesIdo() {
        return vegzesIdo;
    }

    public void setVegzesIdo(Date vegzesIdo) {
        this.vegzesIdo = vegzesIdo;
    }


}
