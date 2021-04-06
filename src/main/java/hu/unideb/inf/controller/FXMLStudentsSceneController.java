/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf.controller;

import hu.unideb.inf.model.Felhasznalo;
import hu.unideb.inf.model.Student;
import hu.unideb.inf.model.Szemely;
import java.net.URL;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * FXML Controller class
 *
 * @author kocsisg
 */
public class FXMLStudentsSceneController implements Initializable {

    @FXML
    void handleButtonPushed(ActionEvent event) {
        System.out.println("Hello world!!!");

        final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("br.com.fredericci.pu");
        final EntityManager entityManager = entityManagerFactory.createEntityManager();

        Student s = new Student();
        s.setName("SAM Smith");
        s.setCredits(36);
        
        entityManager.getTransaction().begin();
        entityManager.persist(s);
        entityManager.getTransaction().commit();
        
        Szemely bacsi=new Szemely();
        bacsi.setNev("Bacsika");
        bacsi.setNem(Szemely.NemTipus.FERFI);
        bacsi.setTAJ(772722010);
        bacsi.setSzuletesiDatum(new GregorianCalendar(1999,02,02));
        
        entityManager.getTransaction().begin();
        entityManager.persist(bacsi);
        entityManager.getTransaction().commit();
        
        Felhasznalo user=new Felhasznalo();
        user.setFelhasznalonev("bela");
        user.setJelszo("hilihalihaliho");
        
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
