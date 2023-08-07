import java.util.Scanner;
import java.io.*;

class Sorted{
    public static int[] getsorted (int[] arr){

    return arr;
    }


}


public class Merge_sort {

    public static void printArray(int[] result){
        System.out.println("The elements of the array are: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
} 
     public static void main (String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the size of the array: ");
        int arr_size=0;
            if(sc.hasNextInt()){
                arr_size=sc.nextInt();
                }

int [] input= new int [arr_size];
System.out.println("Enter the array elements: ");
for (int i=0; i<arr_size;i++){
    if(sc.hasNextInt()){
        input[i]=sc.nextInt();
    }
}

    int [] result=Sorted.getsorted(input);       
    printArray(result);
    sc.close();

}
}
