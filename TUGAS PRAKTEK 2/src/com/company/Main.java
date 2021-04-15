
package com.company;
import java.util.Scanner;

public class Main {
    static float sum = 0, ram1 = 1, ram2 = 2;

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        kalkulator alat = new kalkulator();
        while(ram2 != 0 & ram1 != 0)
        {
            sum=0;
            // Tampilkan pilihan menu
            alat.menu();

            // Inputkan pilihan
            int pilihan = input.nextInt();
            if(pilihan >=1 & pilihan <=5)
            {
                // Inputan nominal pertama
                System.out.print("Masukan Bilangan Ke-1 = ");
                ram1 = input.nextFloat();

                // Inputan nominal kedua
                System.out.print("Masukan Bilangan Ke-2 = ");
                ram2 = input.nextFloat();

                // Proses
                sum  =  alat.operasArithmetic(pilihan,ram1,ram2);

                // Output result
                System.out.println(sum);
            }else
            {
                System.out.println("Anda harus mengisi pilihan dengan benar");
            }
        }
    }
}