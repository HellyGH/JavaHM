import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        zad 1
        int[] arr1 = {1,4,5};
        //loop for each element
        for(int i=0; i< arr1.length; i++){
            System.out.println(arr1[i]);}
        //не принтира по условието
        System.out.println(Arrays.toString(arr1));
         int sum=0;
        for(int num: arr1) {//using for each loop
            sum+=num;


        }
        System.out.println(sum);

        //zad2
        int[] arr1 = new int[]{1,2,3};
        System.out.println(Arrays.toString(arr1));
        int sum=0;
        for (int num:arr1) {
            if (num%2==0){
                sum+=num;
            }


        }
        System.out.println(sum);

        zad3
        int[] arr1 = new int[]{1,2,3};
        System.out.println(Arrays.toString(arr1));
        int sum=0;
        for (int num:arr1) {
            if (num%2!=0){
                sum+=num;
            }


        }
        System.out.println(sum);
        //zad4
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < arr1.length / 2; i++) { //Разменя първото с последното и второто с предпоследното
            int temp = arr1[i];
            arr1[i] = arr1[arr1.length - 1 - i];
            arr1[arr1.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(arr1));*/

        //zad5
        int[] arr1= new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(arr1));
        int max = arr1[0];
        for (int i=1;i<arr1.length;i++){
            if (arr1[i]>max){
                max=arr1[i];
            }

        }
        System.out.println(max);



        //zad 6


        int[][] arr1= new int[][]{{1,2},{3,4}};
        System.out.println(Arrays.deepToString(arr1));//!!!
        int sum1= 0;//сумата за главния диагонал
        int sum2 = 0; //сумата за втория диагонал
        for (int i=0;i<arr1.length;i++){
            sum1+=arr1[i][i];
        }
        for (int i=0;i<arr1.length;i++){
            sum2+=arr1[i][arr1.length-1-i];
        }
        int sum= sum1; /*+sum2; //сумата и на двата

        System.out.println(sum)

        //зад 7


        int[][] arr1= new int[][]{{1,2},{3,4}};
        System.out.println(Arrays.deepToString(arr1));
        int sum = 0;
        for (int i=0;i<arr1[0].length;i++){
            sum+=arr1[0][i];
        }
        System.out.println(sum);
        //zad 8
        int[][] arr1= new int[][]{{1,2},{3,4}};
        System.out.println(Arrays.deepToString(arr1));
        int sum = 0;
        for (int i=0;i<arr1[0].length;i++){
            sum+=arr1[1][i];
        }
        System.out.println(sum);
//zad 9
        Scanner myscan = new Scanner(System.in);
        int num = Integer.parseInt(myscan.nextLine());
        if(num%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("odd");
        }

  //zad10
        Scanner myscan = new Scanner(System.in);
        int num = Integer.parseInt(myscan.nextLine());
        if(num>=0){
            System.out.println("positive");
        } else if(num<0) {
            System.out.println("Negative");

        }
        

//zad11
        Scanner myscan = new Scanner(System.in);
        int num = Integer.parseInt(myscan.nextLine());
        if(num>10){
            System.out.println("The number is bigger than 10");
        }
        else {
            System.out.println("The number is smaller than 10");
        }



//zad12


        Scanner myscan = new Scanner(System.in);
        int num1 = Integer.parseInt(myscan.nextLine());
        int num2 = Integer.parseInt(myscan.nextLine());
        if (num1==num2){
            System.out.println("Equals");

        }
        else {
            System.out.println("Not equals");
        }




        //zad13
        Scanner myscan= new Scanner(System.in);
        int num = Integer.parseInt(myscan.nextLine());
        if (num<20){
            System.out.println("yes");
        }
        else {
            System.out.println("Error");
        }

        


       




    }
}
