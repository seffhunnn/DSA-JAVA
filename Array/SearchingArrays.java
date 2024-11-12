class Array1{
    int[] A;
    int length;
    int size;

        Array1(int[] arr,int size,int length){
            this.size=size;
            this.length=length;
            A=new int[size];

            for(int i=0;i<length;i++){
                A[i]=arr[i];
            }
        }

        //LinearSearch
        public int LinearSearch(int key){
            for(int i=0;i<length;i++){
                if(A[i]==key){
                    return i;
                }
            }
            return -1;
        }

        //Binary Search
        public int BinSearch(int l,int h,int key) {
            while (l <= h) {
                int mid = (l + h) / 2;

                if (key == A[mid]) {
                    return mid;
                } else if (key < A[mid]) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            return -1;
        }
}

public class SearchingArrays {
    public static void main(String[] args) {
        int[] arr={23,35,66,71,99};
        Array1 arr1= new Array1(arr,10,5);

        System.out.println(arr1.BinSearch(0,4,71));
    }
}
