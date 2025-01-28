package Lab1;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] cars; // to define array, declare variable with sqaure bracket
        // to insert value
        String[] carbrands = {"volvo","BMW","Tesla","BYD"};
        System.out.println("Car brands: "+ Arrays.toString(carbrands));
        // To access element
        System.out.println("Access car brands: "+ carbrands[0]);
        // to change array element
        carbrands[0]="Mercedes";
        System.out.println("Access car brands: "+carbrands[0]); 
        // loop through an array
        // using for loop
        for(int i=0;i<carbrands.length;i++){
            System.out.println(carbrands[i]);
        }
        // suing for-each
        System.err.println("Using for each: ");
        for(String brand: carbrands){
        System.out.println(brand);
        }

        //Example
        int[] ages = {20,18,22,34,36,38,24};
        float avg, sum = 0;
        //Get length of an array
        int length = ages.length;
        //Loop through element of an array
        for(int age: ages){
            sum+=age;
        }
        avg=sum/length;
        System.out.println("Print average age: "+avg);
    }
}
