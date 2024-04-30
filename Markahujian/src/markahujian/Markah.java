
package markahujian;

import java.util.Scanner;
public class Markah {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
             
        System.out.print("Peperiksaan / ujian kali ke (1/2/3):");
        int kali = input.nextInt();
       
        double markah [] = new double[5];
            markah[0] = input.nextDouble();
            markah[1] = input.nextDouble();
            markah[2] = input.nextDouble();
            markah[3] = input.nextDouble();
            markah[4] = input.nextDouble();
 
            
        System.out.println("Markah yang diperolehi ialah:");
        int x;
        for (x=0;x<5;x++){
            System.out.println(markah[x]);
        }
        
        double tambah,purata;
        
        tambah = markah[0] + markah[1] + markah[2] + markah[3] + markah[4];
        System.out.println("Hasil tambah 5 markah ialah "+tambah);
        
        purata = tambah/5;
        System.out.println("Purata markah ialah "+purata);
        
        int jumlah =0;
        for (x = 0;x<5;x++){
            if(markah[x]>purata){
                jumlah++;
            }
        }
        System.out.println("Bilangan markah melebihi purata ialah "+jumlah);
                   
    }
}
