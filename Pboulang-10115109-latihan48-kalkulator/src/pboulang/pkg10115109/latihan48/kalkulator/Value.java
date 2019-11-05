/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.latihan48.kalkulator;

/**
 *
 * @author nama : indri yuliyanti
 *          nim ; 10115109
 *          kelas : pbo ulng
 *          tugas pbo pert 4 kalkulatorr
 */
public class Value {
    private double valueA;
    private double valueB;
    
    public Value(){
    }

    public double getValueA() {
        return valueA;
    }

    public void setValueA(double valueA) {
        this.valueA = valueA;
    }

    public double getValueB() {
        return valueB;
    }

    public void setValueB(double valueB) {
        this.valueB = valueB;
    }
    public void setNameproject(){
        System.out.println("project kalkulator");
        
        
    }
    public void setNoteproject(){
        System.out.println("project kalkulator");
    }  
    
    public double add(double valA, double valB){
        double result;
        result = valA +valB;
        return result;
        
    }
    public double minus(double valA, double valB){
        double result;
        result = valA-valB;
        return result;
    }
    public double multiplication(double valA, double valB){
        double result;
        result = valA*valB;
        return result;
    }
    public double division(double valA, double valB){
        double result;
        result = valA/valB;
        return result; 
    
    
        
        
        
    }
}
