//A11.2019.12267
//Harun Aprizal Widyapradana
//A11.4424
//UTS PBO PRAKTEK
package uts;
import java.util.*;
import java.lang.*;

class Myexp extends Exception{

}
class Stack
{
    private char array[];
    private int top;
    private int kapasitas;

    // Pembuat untuk menginisialisasi tumpukan == Stack
    Stack(int ukuran)
    {
        array = new char[ukuran];
        kapasitas = ukuran;
        top = -1;
    }

    // Fungsi utilitas untuk menambahkan elemen x dalam tumpukan
    public void push(char H)
    {
        if (isFull())
        {
            System.out.println("OverFlow\nProgram Terminated\n");
            System.exit(1);
        }


        array[++top] = H;
    }

    //Fungsi utilitas untuk memunculkan elemen teratas dari tumpukan
    public int pop()
    {
        // kurangi ukuran tumpukan sebesar 1 dan (opsional) kembalikan elemen yang muncul
        return array[top--];
    }


    public Boolean isFull()
    {
        return top == kapasitas - 1;   //atau ukuran kembali () == kapasitas;
    }

    public static void main (String[] args)
    {
        Stack stack = new Stack(20);
        Scanner var=new Scanner(System.in);
        Myexp obj=new Myexp();
        System.out.println("Masukkan angka untuk menentukan apakah string" +
                " input adalah persamaan yang sah atau tidak dalam representasi" +
                "unary dengan penjumlahan:");
        String unry=var.nextLine();
        int i=0;
        int count=0;
        int flag=0;
        int j=0;

        try{
            while(unry.charAt(i)!= '=')
            {
                char ch=unry.charAt(i);
                if(ch=='-'||ch=='*'||ch=='/')throw obj;

                if(ch=='1')
                {
                    stack.push(ch);
                    count++;
                }


                i++;


                j=i;
            }



            for(i=j+1;i<unry.length();i++)
            {
                if(unry.charAt(j+1)=='1')
                {
                    flag++;
                }
                j++;
            }


            if(count==flag)
            {


                System.out.println("Ekspresi unary sah");
            }
            else
            {
                {


                    System.out.println("Ekspresi unary tidak sah");
                }

            }


        }
        catch(ArrayIndexOutOfBoundsException e)
        //jika ada indeks array dari kesalahan yang akan ditangani di sini
        {

        }


        catch(Myexp k)
        {
            System.out.println("Ekspresi unary tidak sah");
        }

    }
}