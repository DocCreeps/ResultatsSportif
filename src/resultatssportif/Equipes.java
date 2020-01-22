/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resultatssportif;

import java.util.Date;

/**
 *
 * @author doria
 */
public class Equipes {
    String nom,president;
    int nbVictoire, nbButP,nbButE, nbChampionnats,nbCoupe,nbPoints;
    Date dateCreate;

    
    public Equipes() {
    }
    
    
    public Equipes(String nom, String president, int nbVictoire, int nbButP, int nbButE, int nbChampionnats, int nbCoupe, int nbPoints, Date dateCreate) {
        this.nom = nom;
        this.president = president;
        this.nbVictoire = nbVictoire;
        this.nbButP = nbButP;
        this.nbButE = nbButE;
        this.nbChampionnats = nbChampionnats;
        this.nbCoupe = nbCoupe;
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

    public int getNbVictoire() {
        return nbVictoire;
    }

    public void setNbVictoire(int nbVictoire) {
        this.nbVictoire = nbVictoire;
    }

    public int getNbButP() {
        return nbButP;
    }

    public void setNbButP(int nbButP) {
        this.nbButP = nbButP;
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

    public int getNbCoupe() {
        return nbCoupe;
    }

    public void setNbCoupe(int nbCoupe) {
        this.nbCoupe = nbCoupe;
    }

    public int getNbPoints() {
        return nbPoints;
    }

    public void setNbPoints(int nbPoints) {
        this.nbPoints = nbPoints;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    @Override
    public String toString() {
        return "Equipes{" + "nom=" + nom + ", president=" + president + ", nbVictoire=" + nbVictoire + ", nbButP=" + nbButP + ", nbButE=" + nbButE + ", nbChampionnats=" + nbChampionnats + ", nbCoupe=" + nbCoupe + ", nbPoints=" + nbPoints + ", dateCreate=" + dateCreate + '}';
    }
    
    
    
    
    
}
