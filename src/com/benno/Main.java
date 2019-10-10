package com.benno;
import java.util.Scanner;

    /*
        NAMA        : BENNO ALIF ANGGARA
        KELAS       : IF1
        NIM         : 10118024
        Deskripsi   : Mengganti kata
     */

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    String before, after, from, to;

        System.out.println("====Program Mengganti Kata====");
        System.out.println();

        System.out.print("Masukkan kalimat : ");
        before = scanner.nextLine();
        System.out.print("Ganti kata : ");
        from = scanner.nextLine();
        System.out.print("Menjadi kata : ");
        to = scanner.nextLine();

        after = before.replace(from, to);

        System.out.println();
        System.out.println("====Hasil Formatting====");
        System.out.println("Kalimat awal : " + before);
        System.out.println("Kalimat baru : " + after);
    }
}
