package com.Pertemuan1;
import java.util.Scanner;

public class Tugas1 {
    //fungsi
    public static int tambah(int a,int b){
        return(a+b);
    }

    public static int kali(int a,int b){
        return(a*b);
    }

    public static int kurang(int a,int b) {
        return(a-b);
    }

    public static double bagi(double a,double b) {
        return(a/b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Bilangan 1: ");
        int a =input.nextInt();
        System.out.print("Masukkan Bilangan 2: ");
        int b =input.nextInt();
        System.out.println();
        System.out.println("Hasil Penjumlahan : " +tambah(a, b));
        System.out.println("Hasil Perkalian   : " +kali(a, b));
        System.out.println("Hasil Pengurangan : " +kurang(a, b));
        System.out.println("Hasil Pembagian   : " +bagi(a, b));
    }
}
/*

cara lain

import java.util.Scanner;

public class tugas3 {

    public static void main(String [] args) {

        System.out.println("Masukkan bilangan pertama");
        Scanner input = new Scanner(System.in);
        Integer bil1 = input.nextInt();
        System.out.println("Masukkan bilangan kedua");
        Integer bil2 = input.nextInt();

        tugas3 obj = new tugas3();
        System.out.println("Maka hasil Jumlah :" +
                obj.penjumlahan(bil1, bil2));
    }

    public Integer penjumlahan(Integer bil1, Integer bil2){

        return bil1 + bil2;
    }
}
 */
