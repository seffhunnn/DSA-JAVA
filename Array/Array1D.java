import java.util.*;
public class Array1D {
    public static void main(String[] args) {
//        int[] marks=new int[3]; //or int marks[]=new int[3];
//        marks[0]=97;
//        marks[1]=98;
//        marks[2]=95;

//        int[] marks={98,99,95}; // declaration + initialisation
//
//        System.out.println(marks[0]+" "+marks[1]);


        //Array user input
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of Array ");
        int size=sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter elements of Array");
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }


        for(int i=0;i<size;i++){
            System.out.print(numbers[i]+" ");
        }

    }
}
