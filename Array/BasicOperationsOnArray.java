class Array{
    int[] A;
    int size;
    int length;

     Array(int[] arr,int size,int length){
         this.size=size;
         this.length=length;
         A= new int[size];

         for(int i=0;i<length;i++){
             A[i]=arr[i];
         }
     }

     //To display Array
     public void display(){
         System.out.println("Elements of list are");
         for(int i=0;i<length;i++){
             System.out.print(A[i]+" ");
         }
     }
     //To append in Array
     public void append(int x){
         if(length<size){
             A[length]=x;
             length++;
         }
     }
    //To insert particular element at index
     public void insert(int index,int x){
         if(index>=0 && index<=length){
             for(int i=length;i>index;i--){
                 A[i]=A[i-1];
             }
             A[index]=x;
             length++;
         }
     }
     //To Delete from and Array
    public int delete(int index) {
        if (index >= 0 && index <= length) {
            int x = A[index];
             for(int i=index;i<length;i++){
                 A[i]=A[i+1];
             }
             length--;
             return x;
        }
        return -1;
    }
    //To find minimum in Array
    public int Min(){
         int x = A[0];
         for(int i=0;i<length;i++){
            if(A[i]<x){
                x=A[i];
            }
         }
         return x;
    }
    //To find maximum in Array
    public int Max(){
        int x = A[0];
        for(int i=0;i<length;i++){
            if(A[i]>x){
                x=A[i];
            }
        }
        return x;
    }
}

public class BasicOperationsOnArray {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};

        Array arr1=new Array(arr,10,5);
        //arr1.append(8);
        //arr1.insert(0,3);
        //System.out.println(arr1.delete(0));
        //System.out.println(arr1.Min());
        System.out.println(arr1.Max());
        arr1.display();
    }
}
