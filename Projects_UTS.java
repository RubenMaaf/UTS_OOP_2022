package projects_uts;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Ruben, 20101249
 */
public class Projects_UTS {


    public static void main(String[] args) {
       
ArrayList<String> coba= new ArrayList<String>();
        Scanner input = new Scanner(System.in);
       int n = 0;
       
        do{
        System.out.println("\n\n==============Masukan Data Pengunjung==============");
        System.out.println("Tampilkan Data Pengunjung");
        System.out.println("Isi Data Pengunjung");
        System.out.println("Keluar");
        System.out.println("#####################################################");
        System.out.print("Pilih menu :");
        n = input.nextInt();
        
         
            if(n==1){
            System.out.println("Isi Data Pengunjung Kebun Binatang");
            System.out.print("\n\nMasukan Nama    :");
            String nama=input.next();
            coba.add(nama);
            }
            
            else if (n==2){
            System.out.println("Isi Data Pengunjung Kebun Binatang");
            System.out.print("\n\nMasukan Nama    :");
            String nama=input.next();
            coba.add(nama);
            }
            
            else if (n==3){
            System.out.println("----------------------");
            System.out.println(coba+"\n");
            System.out.println("Jumlah pengunjung adalah :"+coba.size());          
            System.out.println("Terima Kasih");
            }
            
            else if (n==4){
            System.out.println("\n\nOpsi Tidak Terdaftar silahkan pilih 1,2,3");
            }
        
        }while(n!=3);
        }
        }