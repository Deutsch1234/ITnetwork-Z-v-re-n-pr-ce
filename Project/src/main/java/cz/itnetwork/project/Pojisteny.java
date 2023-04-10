/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.project;

/**
 *
 * @author jakubnemec
 */
public class Pojisteny {
    private String jmeno;
    private String prijmeni;
    private String telefoniCislo;
    private int vek;
    
    /**
     * 
     * @param jmeno
     * @param prijmeni
     * @param telefoniCislo
     * @param vek 
     * 
     */
    public Pojisteny(String jmeno, String prijmeni, String telefoniCislo, int vek){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.telefoniCislo = telefoniCislo;
        this.vek = vek;
    }
    
    public String getJmeno() {
        return jmeno;
    }
    
    public void setJmeno(String jmeno) {
        this.jmeno=jmeno;
    }
    
    public String getPrijmeni() {
        return prijmeni;
    }
    
    public void setPrijmeni(String prijmeni) {
        this.prijmeni=prijmeni;
    }
    
    public String getTelefoniCislo() {
        return telefoniCislo;
    }
    
    public void setTelefoniCislo(String telefoniCislo){
        this.telefoniCislo=telefoniCislo;
    }
    
    public int getVek(){
        return vek;
    }
    
    public void setVek(int vek){
        this.vek=vek;
    }
    
    @Override
    public String toString() {
        return jmeno + "\t" + prijmeni + "\t" + telefoniCislo + "\t" + vek;
    }
    
}
