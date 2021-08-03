import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadeClient {
    private static int choice;
    public static void main(String[] args) throws NumberFormatException, IOException {
        do{
            System.out.print("========= Menu ============ \n");
            System.out.print("            1. Soto + Nasi.              \n");
            System.out.print("            2. Nasi Goreng.              \n");
            System.out.print("            3. Es Jeruk.            \n");
            System.out.print("            4. Teh Botol.            \n");
            System.out.print("            5. Air Mineral.            \n");
            System.out.print("            6. Exit.                     \n");
            System.out.print("Enter your choice: ");

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            choice=Integer.parseInt(br.readLine());
            Pelayan py = new Pelayan();

            switch (choice) {
                case 1:
                {
                    py.sotoHarga();
                }
                break;
                case 2:
                {
                    py.nasiHarga();
                }
                break;
                case 3:
                {
                    py.jerukHarga();
                }
                break;
                case 4:
                {
                    py.tehHarga();
                }
                break;
                case 5:
                {
                    py.airHarga();
                }
                default:
                {
                    System.out.println("Tidak Ada Menu Dipilih");
                }
                return;
            }

        }while(choice!=6);
    }
}




