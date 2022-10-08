public class HeapSort {
    static class Heap{
        
        public int arr[]=new int[100];
        public int size;
        Heap(){
            arr[0]=-1;
            size=0;
        }

        void heapSort(int arr[], int n){
            int size=n;
            while(size>1){
                //step 1
                int temp=arr[size];
                arr[size]=arr[1];
                arr[1]=temp;

                size--;
                //step 2
                heapify(arr, size, 1);
            }
        }

        static void heapify(int arr[], int n, int i){
            int largest=i;
            int left=2*i;
            int right=2*i+1;

            if(left<=n && arr[largest]<arr[left]){
                largest=left;
            } 
            if(right<=n && arr[largest]<arr[right]){
                largest=right;
            }

            if(largest!=i){
                int temp=arr[largest];
                arr[largest]=arr[i];
                arr[i]=temp;

                heapify(arr, n, largest);
            }
        }
        
    }
    

    public static void main(String[] args) {
        Heap h=new Heap();
        int arr[]={-1,54,53,55,52,50};
        int n=arr.length-1;
        for(int i=n/2;i>0;i--){
            h.heapify(arr, n, i);
        }
        System.out.println("Printing the array now:-");
        for(int i=1;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        h.heapSort(arr, n);
        System.out.println("Printing the sorted array :-");
        for(int i=1;i<=n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
