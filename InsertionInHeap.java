public class InsertionInHeap {
    static class Heap{
        
        public int arr[]=new int[100];
        public int size;
        Heap(){
            arr[0]=-1;
            size=0;
        }
        void insert(int val){
            size=size+1;
            int index=size;
            arr[index]=val;

            while(index>1){
                int parent =index/2;
                if(arr[parent]<arr[index]){
                    int temp=arr[parent];
                    arr[parent]=arr[index];
                    arr[index]=temp;
                }else{
                    return;
                }
            }
        }
        void print(){
            for(int i=1;i<=size;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
    

    public static void main(String[] args) {
        Heap h=new Heap();
        h.insert(50);
        h.insert(55);
        h.insert(53);
        h.insert(52);
        h.insert(54);
        h.print();

    }
}
