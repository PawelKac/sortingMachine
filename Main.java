

import java.util.Scanner;

//Mój pierwszy samodzielny program/projekt

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int[5]; //nasza 5-elementowa tablica do sortowania

        System.out.println("Podaj pierwszą liczbę: ");
        numbers[0] = scanner.nextInt();

        System.out.println("Podaj drugą liczbę: ");
        numbers[1] = scanner.nextInt();

        System.out.println("Podaj trzecią liczbę: ");
        numbers[2] = scanner.nextInt();

        System.out.println("Podaj czwartą liczbę: ");
        numbers[3] = scanner.nextInt();

        System.out.println("Podaj piątą liczbę: ");
        numbers[4] = scanner.nextInt();

        System.out.println("Twoje liczby: " + numbers[0] + " " + numbers[1] + " " + numbers[2] + " " + numbers[3] + " "+ numbers[4]);

        sort(numbers); //funkcja do sortowania
        System.out.println("Posortowana tablica: ");
        for (int element : numbers){
            System.out.println(" " + element);
        }
    }

    static void sort(int[] numbers){ //algorytm sortowania bąbelkowego/BubbleSort
        int size = numbers.length;
        int temp = 0;
        for (int i = 0; i < size; i++){
            for (int j = 1; j < (size - i); j++ ){
                if (numbers[j - 1] > numbers[j]){
                    temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
}
