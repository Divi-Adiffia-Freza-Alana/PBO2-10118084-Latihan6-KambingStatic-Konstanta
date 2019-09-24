/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 * Nama  : Divi Adiffia Freza Alana
 * Kelas : PBO2
 * Nim   : 10118084
 * Deskripsi Program : Program ini berisi program untuk menampilkan Kambing static & konstanta

 */
class Mamalia{
public static int JumlahKambing;    
}
public class KambingStatic {

    /**
     */
    public static final String NAMA_KAMBING = "MIDUN";
    public static void main(String[] args){
        Mamalia.JumlahKambing = 485000;
        System.out.println(NAMA_KAMBING +" memiliki kambing sebanyak " + Mamalia.JumlahKambing);
    }
    
}
