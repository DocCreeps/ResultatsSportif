/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resultatssportif;
/*
import java.time.LocalDate;
*/
/**
 *
 * @author doria
 */
public class ResultatsSportif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    
        Equipes OL = new Equipes("Olympique Lyonnais", "J.M. Aulas", "OL", 10, 13,5,9,12,30,1950); 
        Equipes OM = new Equipes("Olympique de Marseille", "J.H. Eyrault", "OM", 5, 5,9,5,18,21,1899);
        Equipes ASSE =new Equipes("Association Sportive de Saint Etienne", "B. Caiazzo", "ASSE", 7, 11,7,10,25,25,1933);
        Equipes PSG  = new Equipes("Paris Saint Germain", "N.EL. Khalaifi", "PSG", 9, 19,5,15,35,28,1970);
        Equipes TFC = new Equipes("Toulouse Football Club", "O. Sadran", "TFC", 0, 3,17,2,1,1,1970);
        Equipes LOSC = new Equipes("Lille Olympique Sporting Club", "G. Lopez", "LOSC", 7, 10,10,10,5,21,1944);
        Equipes SRFC = new Equipes("Stade Rennais Football Club", "O. Letang", "SRFC", 3, 5,15,0,3,10,1901);
        Equipes ASM = new Equipes("Association Sportive de Monaco", "D. Rybolovelev", "ASM", 8, 11,15,5,10,26,1924);
        Equipes FCN = new Equipes("Football Club de Nante", "W. Kita", "FCN", 5, 8,13,8,4,17,1943);
        Equipes MHSC = new Equipes("Montpellier Herault Sport Club", "L. Nicolin", "MHSC", 4, 6,14,1,2,15,1919);
       
        
        
        Match match1 = new Match("OL",5,5,3,0,2,1,OL,ASSE);
        Match match2 = new Match("OL",3,4,3,0,1,0,OL,PSG);
        
        Match match3 = new Match("PSG",3,5,3,0,3,0,PSG,OM);
        Match match4 = new Match("EGALITE",2,2,1,1,2,2,OM,ASSE);
        
        Match match5 = new Match("LOSC",2,3,0,3,0,2,TFC,LOSC);
        Match match6 = new Match("LOSC",1,2,3,0,3,2,LOSC,SRFC);
        
        Match match7 = new Match("ASM",1,3,3,0,2,0,ASM,TFC);
        Match match8 = new Match("SRFC",3,3,3,0,2,0,SRFC,FCN);
        
        Match match9 = new Match("EGALITE",2,3,1,1,3,3,FCN,ASM);
        Match match10 = new Match("MHSC",2,3,3,0,1,0,MHSC,OM);
       
        
        
        
   /*   LocalDate ld = LocalDate.of(2015,1,1);
      int annee = ld.getYear();
        System.out.println(annee);*/
    }
    
}
