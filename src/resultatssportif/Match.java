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
public class Match extends Equipes{
    String vainqueur;
    int nbCartonA, nbCartonB, nbPointA, nbPointB, nbButA,nbButB;
    Equipes equipeA, equipeB;
    
    public Match() {
        super();
    }

   public Match(String vainqueur, int nbCartonA, int nbCartonB, int nbPointA, int nbPointB, int nbButA, int nbButB, Equipes equipeA, Equipes equipeB) {
        this.vainqueur = vainqueur;
        this.nbCartonA = nbCartonA;
        this.nbCartonB = nbCartonB;
        this.nbPointA = nbPointA;
        this.nbPointB = nbPointB;
        this.nbButA = nbButA;
        this.nbButB = nbButB;
        this.equipeA = equipeA;
        this.equipeB = equipeB;
    }

   

    public String getVainqueur() {
        return vainqueur;
    }

    

    public int getNbCartonA() {
        return nbCartonA;
    }

    public void setNbCartonA(int nbCartonA) {
        this.nbCartonA = nbCartonA;
    }

    public int getNbCartonB() {
        return nbCartonB;
    }

    public void setNbCartonB(int nbCartonB) {
        this.nbCartonB = nbCartonB;
    }

    public int getNbPointA() {
        return nbPointA;
    }

    public void setNbPointA(int nbPointA) {
        this.nbPointA = this.nbPointA + equipeA.getNbPoints();
    }

    public int getNbPointB() {
        return nbPointB;
    }

    public void setNbPointB(int nbPointB) {
        this.nbPointB = this.nbPointB + equipeB.getNbPoints();
    }

    public int getNbButA() {
        return nbButA;
    }

    public void setNbButA(int nbButA) {
      if(this.nbButA>this.nbButB){
      this.vainqueur = equipeA.getNom();
     } 
      else if(this.nbButB>this.nbButA){
      this.vainqueur = equipeA.getNom();
     } 
      else{
      this.vainqueur = "Egalité";
     }
    }

    public int getNbButB() {
        return nbButB;
    }

    public void setNbButB(int nbButB) {
      if(this.nbButA>this.nbButB){
      this.vainqueur = equipeA.getNom();
     } 
      else if(this.nbButB>this.nbButA){
      this.vainqueur = equipeA.getNom();
     } 
      else{
      this.vainqueur = "Egalité";
     }
    }

    public Equipes getEquipeA() {
        return equipeA;
    }

    public void setEquipeA(Equipes equipeA) {
        this.equipeA = equipeA;
    }

    public Equipes getEquipeB() {
        return equipeB;
    }

    public void setEquipeB(Equipes equipeB) {
        this.equipeB = equipeB;
    }

    
  



    
    
}
