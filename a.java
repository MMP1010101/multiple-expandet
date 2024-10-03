import java.util.ArrayList;
import java.util.Scanner;

//start

//end
public class a {
    public static int numPrin(int num){
        return num;
    }

    public static ArrayList<Integer> size_max(int max){

        

        ArrayList<Integer> lista = new ArrayList<>();
        for(int i = 0; i < max; i++){
            lista.add(i);
        }
        return lista;
    }

    public static int max(int max){
        ArrayList<Integer> lsta = size_max(max);
        int e = 0;
        for(int i = 0; i < lsta.size(); i++){
            int j = 1;
            e = e + j;
        }
        return e;

    }
    public static ArrayList<Integer> par(int max, int num){
        ArrayList<Integer> lista = new ArrayList<>();
        if(numPrin(num) % 2 == 0){
            for(int i = 0; i < max(max); i++){
                if(i % 2 == 0){
                    lista.add(i);
                }
            }
        } else{
            System.out.println("no es par");
        } return lista;
    }

    public static void parString(int num){
        int n = max(num);
        if(n % 2 == 0){
            System.out.println("tu numero es par ==>"+" "+n);
        } else {
            System.out.println("no es par tu numero ==>"+" "+n);
        }
    }
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        Scanner n2 = new Scanner(System.in);

        System.out.println("ingrese el numero maximo (1: el numero que queres)");
        int max = n1.nextInt();
        System.out.println("ingrese el numero que veas si es impar");
        int number = n2.nextInt();
        
        parString(number);
       System.out.println(par(max, number));
        
    }
}