/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4_kel38;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Modul4_Kel38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        int[] pecahan = {100,200,500,1000,2000,5000,10000,20000,50000};
        int user;
        
        System.out.println("Selamat datang di mesin pemecah uang\nSilahkan masukkan nominal yang anda ingin pecahkan");
        System.out.println("\"Pastikan hanya memasukan nominal dalam mata uang Rupiah dan hanya satu lembar uang kertas atau satu keping koin per transaksi\"");
        
        Scanner Modul5_Kel38 = new Scanner(System.in);
        int uang = Modul5_Kel38.nextInt();
        
        pilihpecahan(pecahan, uang);
        
        Scanner pilihan = new Scanner(System.in);
        int u = pilihan.nextInt();
        
        pilihbanyak(u, uang, pecahan);
        
        System.out.println("Konfirmasi?");
        System.out.println("1. Ya");
        System.out.println("2. Tidak");
        int x = 0;
        Scanner loop = new Scanner(System.in);
        int p = loop.nextInt();
        if (p==1){
            x=+0;
        System.out.println("Terima kasih telah menggunakan layanan kami :)");
        }else{
            x=+1;
        System.out.println("Silahkan ambil kembali uang anda");
        }
        
        
    }

        static void pilihpecahan(int[] pecahan, int uang) {
        System.out.println("pilih jumlah pecahan: ");
            for(int i = 0; i < 9; i++) {
		if(uang > pecahan[i]) {
		System.out.println(i+1 + ". " + "Rp" + pecahan[i] + ",00" );
            }
        }
        
    }
        
        static void pilihbanyak(int u, int uang, int[] pecahan){
            
            int d, f = 0;

            switch(u){
                case (1):
                    for(d = 0; f < uang; d++){
                        f = f+pecahan[0];
                    }
                    System.out.println("Anda akan menukarkan uang Rp" + uang + ",- untuk pecahan Rp100,- sebanyak " + d + " keping");
                    break;
                    
                case (2):
                    for(d = 0; f < uang; d++){
                        f = f+pecahan[1];
                    }
                    System.out.println("Anda akan menukarkan uang Rp" + uang + ",- untuk pecahan Rp200,- sebanyak " + d + " keping");
                    break;
                    
                case (3):
                    for(d = 0; f < uang; d++){
                        f = f+pecahan[2];
                    }
                    System.out.println("Anda akan menukarkan uang Rp" + uang + ",- untuk pecahan Rp500,- sebanyak " + d + " keping");
                    break;
                    
                case (4):
                    for(d = 0; f < uang; d++){
                        f = f+pecahan[3];
                    }
                    System.out.println("Anda akan menukarkan uang Rp" + uang + ",- untuk pecahan Rp1.000,- sebanyak " + d + " lembar");
                    break;
                    
                case (5):
                    for(d = 0; f < uang; d++){
                        f = f+pecahan[4];
                    }
                    System.out.println("Anda akan menukarkan uang Rp" + uang + ",- untuk pecahan Rp2.000,- sebanyak " + d + " lembar");
                    break;
                    
                case (6):
                    for(d = 0; f < uang; d++){
                        f = f+pecahan[5];
                    }
                    System.out.println("Anda akan menukarkan uang Rp" + uang + ",- untuk pecahan Rp5.000,- sebanyak " + d + " lembar");
                    break;
                    
                case (7):
                    for(d = 0; f < uang; d++){
                        f = f+pecahan[6];
                    }
                    System.out.println("Anda akan menukarkan uang Rp" + uang + ",- untuk pecahan Rp10.000,- sebanyak " + d + " lembar");
                    break;
                    
                case (8):
                    for(d = 0; f < uang; d++){
                        f = f+pecahan[7];
                    }
                    System.out.println("Anda akan menukarkan uang " + uang + " untuk pecahan Rp20.000,- sebanyak " + d + " lembar");
                    break;
                    
                case (9):
                    for(d = 0; f < uang; d++){
                        f = f+pecahan[8];
                    }
                    System.out.println("Anda akan menukarkan uang " + uang + " untuk pecahan Rp50.000,- sebanyak " + d + " lembar");
                    break;
                    
            }
        }
                
}