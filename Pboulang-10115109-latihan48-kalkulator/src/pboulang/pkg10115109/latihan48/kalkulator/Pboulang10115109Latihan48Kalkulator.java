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
 *          tugas pbo pert 4 kalkulator
 */
public class Pboulang10115109Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Value value = new Value ();
        value.setValueA(7);
        value.setValueB(5);
        
        double valA = value.getValueA();
        double valB = value.getValueB();
        
        System.out.println("VALUE A : "+value.getValueA());
        System.out.println("VALUE B :"+value.getValueB());
        value.setNameproject();
        value.setNoteproject();
        System.out.println("result add is = "+value.add(valA,valB));
        System.out.println("result minus is = "+value.minus(valA,valB));
        System.out.println("result multiple is = "+value.multiplication(valA,valB));
        System.out.println("result division is = "+value.division(valA,valB));
        
        
        
    }
    
}
