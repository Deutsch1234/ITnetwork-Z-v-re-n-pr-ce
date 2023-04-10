/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cz.itnetwork.project;


import java.util.Scanner;
/**
 *
 * @author jakubnemec
 */
public class Project {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        Evidence evidence = new Evidence();
        String vyber = "";

        while (!vyber.equals("4")){
            evidence.vypisUvodu();
            System.out.println();
            System.out.println("Vyberte si akci: \n1 - Přidat nového pojištěného\n2 - Vypsat všechny pojištěné\n3 - Vyhledat pojištěného\n4 - Konec\n");
            vyber = sc.nextLine().trim();
            System.out.println();
            switch (vyber) {
                case "1":
                    evidence.pridatPojisteneho();
                    System.out.println();
                    System.out.println("Data byla uložena.");
                    break;
                case "2":
                    evidence.vypisZaznamu();
                    System.out.println();
                    break;
                case "3":
                    evidence.vyhledatPojisteneho();
                    
                    break;
                case "4":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vyberte si akci od 1 - 4");
                    break;
            }
            System.out.println();
            System.out.println("Pokračujte stisknutím klávesy Enter...");
            sc.nextLine();
        }
    }
}
            
 