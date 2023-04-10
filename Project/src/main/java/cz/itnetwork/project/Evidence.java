/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.project;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author jakubnemec
 */
public class Evidence {
    private Databaze databaze;
    Scanner sc = new Scanner(System.in, "UTF-8");


    public Evidence() {
        databaze = new Databaze();
    }

    public void vypisZaznamu() {
        databaze.vypisPojisteneOsoby();
    }

    public void vypisUvodu() {
        System.out.println("---------------------------");
        System.out.println("Evidence pojištěných");
        System.out.println("---------------------------");

    }

    public void pridatPojisteneho() {
        String jmeno = zadejJmeno();
        String prijmeni = zadejPrijmeni();
        System.out.println("Zadejte telefoní číslo: ");
        String telefoniCislo = sc.nextLine().trim();
        System.out.println("Zadejte věk:");
        int vek = sc.nextInt();


        databaze.pridatPojisteneho(jmeno, prijmeni, telefoniCislo, vek);
    }

    public void vyhledatPojisteneho() {
        String jmeno = zadejJmeno();
        String prijmeni = zadejPrijmeni();
        System.out.println();

        ArrayList<Pojisteny> pojisteneOsoby = databaze.najdiPojisteneho(jmeno, prijmeni);
        if (pojisteneOsoby.size() > 0) {
            for (Pojisteny o : pojisteneOsoby) {
                System.out.println(o);
            }

        } else {
            System.out.println("Záznam nenalezen.");
        }


    }

    private String zadejJmeno() {
        System.out.println("Zadej jméno pojištěného: ");
        String jmeno = sc.nextLine().trim();
        while (jmeno.length() > 15 || jmeno.length() < 2) {
            System.out.println("Jméno je příliž krátké nebo dlouhé. Vložte jej prosím znovu.");
            jmeno = sc.nextLine().trim();
        }

        return jmeno;
    }

    private String zadejPrijmeni() {
        System.out.println("Zadejte příjmení pojištěného: ");
        String prijmeni = sc.nextLine().trim();
        while (prijmeni.length() > 15 || prijmeni.length() < 2) {
            System.out.println("Příjmení je příliž krátké nebo dlouhé. Vložte jej prosím znovu.");
            prijmeni = sc.nextLine().trim();
        }
            return prijmeni;
        }
    }

