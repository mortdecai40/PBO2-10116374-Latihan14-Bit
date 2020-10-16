package pbo2.pkg10116374.latihan14.bit;

/** @author
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBO2
 * NIM                  : 10116374
 * Deskripsi Program    : Program untuk melakukan Proses Bilangan Bit
 *
 **/ 

public class PBO210116374Latihan14Bit {

     public static void main(String[] args) {
        int a = 60 ;
        int b = 13;
        int c = 0;
        
        c = a & b;
        /* 12 = 0000 1100*/
        System. out.println("a & b = " + c);
        c = a | b;
        /* 61 = 0011 1101*/
        System.out.println("a | b = " + c);
        c = a ^ b;
        /* 61 = 0011 0001*/
        System. out.println("a ^ b = " + c);
        c = ~a;
        /* 61 = 1100 1101*/
        System. out.println("~a = " + c);
        c = a << 2;
        /* 61 = 1111 0000*/
        System. out.println("a << 2 = " + c);
        c = a >> 2;
        /* 61 = 0000 1111*/
        System. out.println("a >> 2 = " + c);
         
     }
}
