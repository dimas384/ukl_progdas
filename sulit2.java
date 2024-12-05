package ukl;
import java.util.Scanner;
public class sulit2 {
    public static void main(String[] args) {
        System.out.println("Program validasi angka negatif dalamm array");
        Scanner input = new Scanner(System.in);//int panjang = input.nextInt();

        int [] angka = new int[12];

        for (int i = 1; i < 11; i++){
            System.out.println("Masukkan angka ke-"+(i)+": ");
            angka[i] = input.nextInt();
        }

        System.out.println("mengandung nilai negatif:");
        for(int k = 1; k < angka.length; k++){
            for(int j = 1; j < angka.length; j++){
                if (angka[j] == -k){ {
                    System.out.print(-k+",");
                    break;
                }
                    
                }
            }
        }

    }

}
