import java.util.*;
public class Array2D {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Rows and Columns ");
    int rows=sc.nextInt();
    int column=sc.nextInt();

    int[][] numbers=new int[rows][column];

    System.out.println("Enter Elements");
    for(int i=0;i<rows;i++){
        for(int j=0;j<column;j++){
            numbers[i][j]=sc.nextInt();
        }
    }

        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

    }
}
