import java.util.Scanner;
import java.io.*;

class Sorted{
    public static int[] getsorted (int[] arr){
    int temp=0;
    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
            temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
        }
        
    }
    return arr;

    }

}

class Bubble_Sort{
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

        System.out.println("The elements of the array are: ");
        for (int i = 0; i < result.length; i++) {
            // prints the elements of an array
            System.out.print(result[i] + " ");
        }
        sc.close();

}
}