class Array2{
    int[] A;
    int size;
    int length;

     Array2(int[] arr,int size,int length){
         this.size=size;
         this.length=length;
         A=new int[size];

         for(int i=0;i<length;i++){
             A[i]=arr[i];
         }
    }

    public void Display(){
        System.out.println("Elements of Array are: ");
        for(int i=0;i<length;i++){
            System.out.print(A[i]+" ");
        }
    }

    //BubbleSort
    public void BubbleSort() {
        int flag;
        for (int i = 0; i < length-1; i++) {
            flag = 0;
            for (int j = 0; j < length - 1 - i; j++) {
                if (A[j] > A[j + 1]) {
                    int temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                    flag = 1;
                }
            }
            if (flag == 0)
                break;
        }
    }

    //Insertion Sort
    public void insertionSort(){
         for(int i=0;i<length;i++){
             int current =A[i];
             int j=i-1;

             while(j>=0 && current<A[j]){
                 A[j+1]=A[j];
                 j--;
             }
             A[j+1]=current;
         }
    }

    //Selection Sort
    public void SelectionSort(){
         for(int i=0;i<length-1;i++){
             for(int j=i+1;j<length;j++){
                 if(A[j]<A[i]){
                    int temp=A[j];
                    A[j]=A[i];
                    A[i]=temp;
                 }
             }
         }
    }

    //Partitioning for QuickSort
    public int partition(int low,int high){
         int pivot=A[high];
         int i= low-1;

         for(int j=low;j<high;j++){
             if(A[j]< pivot){
                 i++;
                 int temp =A[i];
                 A[i]=A[j];
                 A[j]=temp;
             }
         }
         i++;
         int temp = A[i];
         A[i]= pivot;
         A[high]=temp;
         return i;

    }
    //Quick Sort
    public void QuickSort(int low,int high) {
    if(low<high){
        int pidx = partition(low,high);

        QuickSort(low,pidx-1);
        QuickSort(pidx+1,high);
    }
    }
}

public class SortingInArrays {
    public static void main(String[] args) {

      int[] arr={6,3,9,5,2,8};
   //int[] arr={23,45,15,51,61,24,45,51};
   // int[] arr={2,3,4,5,6,7,8,9};

    Array2 arr1= new Array2(arr,10,6);

        arr1.QuickSort(0,arr1.length-1);
        arr1.Display();

}
}
