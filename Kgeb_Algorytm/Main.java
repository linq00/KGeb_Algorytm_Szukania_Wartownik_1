import java.util.Random;
import java.util.Scanner;


public class Main {


//    public static class Przeszukiwanie_wart{

        private  static final  int n =50;



        public static void main(String[] args) {


            int[] tablica =  new int[n+1];
            wypelnienie(tablica, n);

            Scanner sc  = new Scanner(System.in);
            System.out.printf("podaj wartosc");
            int wartownik = sc.nextInt();


            int wynik_i = szukaj_po_wartosci(tablica, n , wartownik);
            System.out.printf("tablica:  ");

            for (int i = 0; i <n; i++) {

                System.out.print(tablica[i]);
                if(i<n-1){
                    System.out.print(", ");
                }
            }
            System.out.println("\n");

            if(wynik_i ==n){
                System.out.println("niema");
            }else{
                System.out.println("tutaj na"+ wynik_i);
            }
            sc.close();
        }


        public  static  void wypelnienie(int[] tablica, int rozmiar){
            Random random = new Random();
            for (int i = 0; i< rozmiar; i++){
                random.nextInt(100);
                tablica[i] = random.nextInt(100)+1;
            }
        }


        public  static int szukaj_po_wartosci(int[] tablica, int rozmiar, int wartownik){
            tablica[rozmiar] =wartownik;
            int i =0;
            while (tablica[i] != wartownik){
                i++;
            }
            return  i;
        }

//    }




}