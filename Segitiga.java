package kuis;

import java.util.*;

public class Segitiga extends BangunDatar {
    int alas,tinggi,a,b,c;
    
    Scanner input = new Scanner (System.in);
    
    void display(){
        System.out.println("Menghitung Keliling dan Luas Segitiga");
        System.out.print("Alas segitiga         : ");
        alas=input.nextInt() ;
        System.out.print("Tinggi segitiga       : ");
        tinggi=input.nextInt() ; 
        System.out.print("Sisi Pertama          : ");
        a=input.nextInt() ;
        System.out.print("Sisi Kedua            : ");
        b=input.nextInt() ;
        System.out.print("Sisi Ketiga           : ");
        c=input.nextInt() ;
        luas=(alas*tinggi)/2;
        keliling= a+b+c;
    }
    void segitiga (){
        System.out.println("Hasil Keliiling dan Luas Segitiga");
        System.out.println("");
        System.out.println("luas segitiga       : "+this.luas);
        System.out.println("keliling segitiga   : "+this.keliling);
    }
}
