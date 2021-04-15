package praktik5;
import java.util.Scanner;

public class nilaiSiswa {

    public static void main(String[] args) {
        Siswa aksi = new Siswa();
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data : ");
        int jmlData = input.nextInt();

        for(int i = 0; i < jmlData; i++){
            System.out.print("Nim     : ");
            aksi.setNim(input.next());
            System.out.print("Nama    : ");
            aksi.setNama(input.next());
            System.out.print("Teori   : ");
            aksi.setTeori(input.nextInt());
            System.out.print("Praktek : ");
            aksi.setPraktek(input.nextInt());
        }

        System.out.println("\nDaftar nilai siswa");
        for(int j = 0; j < jmlData; j++){
            aksi.getNim(j);
            aksi.getNama(j);
            aksi.getTeori(j);
            aksi.getPraktek(j);
            aksi.getRata(j);
        }
    }
}