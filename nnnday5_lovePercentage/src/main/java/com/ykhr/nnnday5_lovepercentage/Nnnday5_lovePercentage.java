package com.ykhr.nnnday5_lovepercentage;

import java.util.Scanner;
import java.util.Random;

public class Nnnday5_lovePercentage {

    public static void main(String[] args) {
              
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukkan Nama Anda : ");
        String nama1 = scan.nextLine();
        
        System.out.println("Masukkan Nama Crush Anda : ");
        String nama2 = scan.nextLine();
        
        Random rand = new Random();
        int percentage = rand.nextInt(100);
        
        System.out.print("Tingkat Kecocokkan " + nama1 + " dan " + nama2 + " adalah " + percentage + " %");
        
        
        if (percentage <= 50) {
            System.out.println(nama1 + " dan " + nama2 + " Kalian Tidak cocok, Sayang Sekali...");
        } else if (percentage > 50 && percentage <= 80) {
            System.out.println(nama1 + " dan " + nama2 + " Kurang Cocock, Tapi Masih bisa lah...");
        } else if (percentage > 80 && percentage <= 90) {
            System.out.println(nama1 + " dan " + nama2 + " Sangat Cocok, Gas Confess gasih...");
        } else if (percentage > 90 && percentage <= 99) {
            System.out.println(nama1 + " dan " + nama2 + " Sangat Teramat Cocok Sekali, Gas Confess dan ajak Nikah Gasih...");
        } else {
            System.out.println(nama1 + " dan " + nama2 + " Gausah Confess, langsung ajak nikah, semoga langeng yah...");
        }
    }
}
