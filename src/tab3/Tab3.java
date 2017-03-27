/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tab3;
import java.util.*;
/**
 *
 * @author bar
 */
public class Tab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //question 1
       int[][]ventes=new int[4][5];
       Scanner sc= new Scanner(System.in);
       System.out.println("bonjour");
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                //Terminal.ecrireString("entrez les ventes du modele numero");
                System.out.println("entrez les ventes du modele numero");
                System.out.println(i);
                //int n=sc.nextInt();
                //Terminal.ecrireInt(i);
                //Terminal.ecrireString("par le vendeur numero");
                System.out.println("par le vendeur numero");
                System.out.println(j);
                //terminal.ecrireInt(j);
                //Terminal.ecrireString(":");
                System.out.println(":");
                ventes[i][j]=sc.nextInt();
                //System.out.println("lire les ventes du modele numero");
            }
        }
            //question 2
            for(int i=0;i<4;i++){
                int total=0;
                        for(int j=0;j<5;j++){
                            total=total+ventes[i][j];
                        }
                        //Terminal.ecrireString("ventes du modele "+i+":");
                        System.out.println("ventes du modele "+i+":");
                        //Terminal.ecrireIntln(total);
            }
            // question3
            int[]prix={10000,20000,30000,40000};
            for(int ligne=0;ligne<5;ligne++){
                int total=0;
                for(int col=0;col<4;col++){
                    total=total+(ventes[col][ligne]*prix[col]);
                }
                //Terminal. ecrireString("ventes du vendeur "+ligne+": ");
                System.out.println("ventes du vendeur "+ligne+": ");
                //Terminal.ecrireString(total+" euro");
                System.out.println("total+ euros");
            }
    }
            

        
    
}
    

