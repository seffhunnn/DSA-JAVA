import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the List ");
        int size = sc.nextInt();

        String[] Name = new String[size];

        System.out.println("Enter Names");
        for (int i = 0; i < size; i++) {
            Name[i] = sc.nextLine();
        }

        for(int i=0;i<size;i++){
            System.out.println(Name[i]+" ");
        }
    }
}
