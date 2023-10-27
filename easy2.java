
import java.sql.SQLOutput;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
  //zad1

    static void add() {

        int sum=0;
        int[] arr1={1,2,3,4,5};
        for (int num:arr1){
            sum+=num;
        }
        System.out.println("The sum is:"+sum);
    }
    static void even(){
        int[] arr1={1,2,3,4,5};
        int sum=0;
        for(int num:arr1){
            if (num%2==0){
                sum+=num;
            }
        }
        System.out.println("Even:"+sum);
    }
    static void odd(){

            int[] arr1={1,2,3,4,5};
            int sum=0;
            for(int num:arr1){
                if (num%2!=0){
                    sum+=num;
                }
            }
            System.out.println("Odd: "+sum);

    }



    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr1));
        add();
        even();
        odd();

      //zad2
      


