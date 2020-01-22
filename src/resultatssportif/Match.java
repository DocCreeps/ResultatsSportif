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
    String vainqueur, score;
    int cartonA, cartonB, pointA, pointB;
    Equipes equipeA, equipeB;
    
    public Match() {
        super();
    }

    public Match(String vainqueur, String score, int cartonA, int cartonB, int pointA, int pointB, Equipes equipeA, Equipes equipeB) {
        this.vainqueur = vainqueur;
        this.score = score;
        this.cartonA = cartonA;
        this.cartonB = cartonB;
        this.pointA = pointA;
        this.pointB = pointB;
        this.equipeA = equipeA;
        this.equipeB = equipeB;
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

    public String getVainqueur() {
        return vainqueur;
    }

    public void setVainqueur(String vainqueur) {
        this.vainqueur = vainqueur;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public int getCartonA() {
        return cartonA;
    }

    public void setCartonA(int cartonA) {
        this.cartonA = cartonA;
    }

    public int getCartonB() {
        return cartonB;
    }

    public void setCartonB(int cartonB) {
        this.cartonB = cartonB;
    }

    public int getPointA() {
        return pointA;
    }

    public void setPointA(int pointA) {
        this.pointA = this.pointA + equipeA.getNbPoints() ; 
    }

    public int getPointB() {
        return pointB;
    }

    public void setPointB(int pointB) {
        this.pointB = this.pointB + equipeB.getNbPoints();
    }

    @Override
    public String toString() {
        return "Match{" + "vainqueur=" + vainqueur + ", score=" + score + ", cartonA=" + cartonA + ", cartonB=" + cartonB + ", pointA=" + pointA + ", pointB=" + pointB + ", equipeA=" + equipeA + ", equipeB=" + equipeB + '}';
    }


    
    
}
