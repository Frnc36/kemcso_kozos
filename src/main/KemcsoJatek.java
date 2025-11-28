package main;

import java.util.Scanner;

public class KemcsoJatek {
    

    public static void main(String[] args) {
        int vege = 0;
       
        String[] kemcso1 = {"P","K","Z"," "};
        String[] kemcso2 = {"K","Z","P"," "};
        String[] kemcso3 = {"Z","P","K"," "};
        String[] kemcso4 = {" "," "," "," "};
        
        while (vege == 0){
            kiir(kemcso1,kemcso2,kemcso3,kemcso4);
            String aktiv = jatekosvalasztas1();
            String hova = jatekosvalasztas2();
            vege=1;    
        }
          
    }
    private static void kiir(String[] kemcso1,String[]  kemcso2,String[]  kemcso3,String[]  kemcso4){
            System.out.println("|"+kemcso1[3]+"|"+kemcso2[3]+"|"+kemcso3[3]+"|"+kemcso4[3]+"|"); 
            System.out.println("|"+kemcso1[2]+"|"+kemcso2[2]+"|"+kemcso3[2]+"|"+kemcso4[2]+"|"); 
            System.out.println("|"+kemcso1[1]+"|"+kemcso2[1]+"|"+kemcso3[1]+"|"+kemcso4[1]+"|"); 
            System.out.println("|"+kemcso1[0]+"|"+kemcso2[0]+"|"+kemcso3[0]+"|"+kemcso4[0]+"|"); 
    }
    
    private static String jatekosvalasztas1(){
        Scanner szam = new Scanner(System.in);
        String aktiv;
        
        System.out.println("Melyik oszlopból szeretnéd mozgatni(1-4)?"); 
        aktiv = szam.nextLine(); 
        
        return aktiv;
    }
    private static String jatekosvalasztas2(){
        Scanner szam = new Scanner(System.in);
        String hova;
        
        System.out.println("Melyik oszlopba szeretnéd mozgatni(1-4)?"); 
        hova = szam.nextLine(); 
        
        return hova;
    }
     
}
