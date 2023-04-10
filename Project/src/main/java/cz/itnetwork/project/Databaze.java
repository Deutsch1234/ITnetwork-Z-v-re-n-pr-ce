/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.project;

import java.util.ArrayList;

/**
 *
 * @author jakubnemec
 */
class Databaze {
    private ArrayList<Pojisteny> pojisteneOsoby;
    
    public Databaze() {
        pojisteneOsoby = new ArrayList<>();
    }
    
    public void pridatPojisteneho(String jmeno, String prijmeni, String telefoniCislo, int vek) {
        pojisteneOsoby.add(new Pojisteny(jmeno, prijmeni, telefoniCislo, vek));
    }
    
    public ArrayList<Pojisteny> najdiPojisteneho(String jmeno, String prijmeni) {
        ArrayList<Pojisteny> nasleOsoby = new ArrayList<>();
        for (Pojisteny o : pojisteneOsoby) {
            if((o.getJmeno().equals(jmeno))&&(o.getPrijmeni().equals(prijmeni))) {
                nasleOsoby.add(o);
            }
        }
        return nasleOsoby;
    }
   
    public void vypisPojisteneOsoby(){
        for(int i = 0; i < pojisteneOsoby.size(); i++){
            System.out.println(pojisteneOsoby.get(i));
        }
    }
}
