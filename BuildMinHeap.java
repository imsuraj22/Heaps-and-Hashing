public class BuildMinHeap {
    static class Heap{
        
        public int arr[]=new int[100];
        public int size;
        Heap(){
            arr[0]=-1;
            size=0;
        }

        static void heapify(int arr[], int n, int i){
            int left=2*i;
            int right=2*i+1;
            int smallest=i;

            if(left<n && arr[smallest]>arr[left]){
                smallest=left;
            }
            if(right<n && arr[smallest]>arr[right]){
                smallest=right;
            }
            if(smallest!=i){
                int temp=arr[smallest];
                arr[smallest]=arr[i];
                arr[i]=temp;

                heapify(arr, n, smallest);
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
        System.out.println("Printing the array now:- \n");
        for(int i=1;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}
