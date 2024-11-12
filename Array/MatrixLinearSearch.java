import java.util.*;
public class MatrixLinearSearch  {
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
        System.out.println("Enter the elment to search for");
        int key=sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                if(numbers[i][j]==key)
                    System.out.println(+i+","+j);
            }
        }



    }
}
