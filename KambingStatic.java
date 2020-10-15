/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi program untuk menampilkan jumlah kambingStatic
 */
package pboif2.pkg10119059.latihan6.kambingstatic;



class Mamalia {
    //variabel jumlahKmabing dideklarasikan sebagai statik
    public static int jumlahKambing;
}
public class KambingStatic {
    
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + Mamalia.jumlahKambing);
    }
    
}
