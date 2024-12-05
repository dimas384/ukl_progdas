package ukl;

import java.util.Scanner;

public class sedang2 {
        public static void main(String[] args) {
            System.out.println("-----Menghitung permukaan bola-----");
            Scanner s = new Scanner(System.in);//inputan yuser
            int jari=0;//buat wadah jari jari
            int tinggi=0; 
            System.out.println("Masukkan jari jari = ");
            jari = s.nextInt();
            System.out.println("Masukkan tinggi (tabung) ");
            tinggi = s.nextInt();
            System.out.println("4 * 3.14 " + "* " + jari*jari);
            System.out.println("2 * 3.14 * " + jari + " * " + jari + " + "  + tinggi);
            
            luas(jari);
            permukaantabung(jari, tinggi);
        }
        public static void luas(int jari){
            System.out.println("Luas permukaan bola adalah = " + (4*3.14*jari*jari));
      
        }
        public static void permukaantabung(int jari, int tinggi){
            System.out.println("permukaantabung = " +(2*3.14*jari*jari+tinggi));
        }
    }
    