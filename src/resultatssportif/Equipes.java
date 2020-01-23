/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resultatssportif;



/**
 *
 * @author doria
 */
public class Equipes {
    String nom,president, abrevation;
    int nbVictoire, nbButM,nbButE, nbChampionnats,nbCoupes,nbPoints, dateCreate;

    
    public Equipes() {
    }

    public Equipes(String nom, String president, String abrevation, int nbVictoire, int nbButM, int nbButE, int nbChampionnats, int nbCoupes, int nbPoints, int dateCreate) {
        this.nom = nom;
        this.president = president;
        this.abrevation = abrevation;
        this.nbVictoire = nbVictoire;
        this.nbButM = nbButM;
        this.nbButE = nbButE;
        this.nbChampionnats = nbChampionnats;
        this.nbCoupes = nbCoupes;
        this.nbPoints = nbPoints;
        this.dateCreate = dateCreate;
    }

    
    
    
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public String getAbrevation() {
        return abrevation;
    }

    public void setAbrevation(String abrevation) {
        this.abrevation = abrevation;
    }
    

    public int getNbVictoire() {
        return nbVictoire;
    }

    public void setNbVictoire(int nbVictoire) {
        this.nbVictoire = nbVictoire;
    }

    public int getNbButM() {
        return nbButM;
    }

    public void setNbButM(int nbButM) {
        this.nbButM = nbButM;
    }

    public int getNbButE() {
        return nbButE;
    }

    public void setNbButE(int nbButE) {
        this.nbButE = nbButE;
    }

    public int getNbChampionnats() {
        return nbChampionnats;
    }

    public void setNbChampionnats(int nbChampionnats) {
        this.nbChampionnats = nbChampionnats;
    }

    public int getNbCoupes() {
        return nbCoupes;
    }

    public void setNbCoupes(int nbCoupes) {
        this.nbCoupes = nbCoupes;
    }

    public int getNbPoints() {
        return nbPoints;
    }

    public void setNbPoints(int nbPoints) {
        this.nbPoints = nbPoints;
    }

    public int getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(int dateCreate) {
        this.dateCreate = dateCreate;
    }

    @Override
    public String toString() {
        return  abrevation+ ": " +  nom ;
    }

  

    
 
    
}
