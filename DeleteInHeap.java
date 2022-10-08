public class DeleteInHeap {
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
            System.out.println();
        }

        void delete(){
            if(size==0){
                System.out.println("Nothing to delete");
                return;
            }
            // step 1:- put last element to 1st position
            arr[1]=arr[size];
            // step 2:- remove last element
            size--;

            //step 3:- to take root node to its correct position 
            int i=1;
            while(i<size){
                int leftIndex=2*i;
                int rightIndex=2*i+1;

                if(leftIndex<size && arr[i]<arr[leftIndex]){
                    int temp=arr[leftIndex];
                    arr[leftIndex]=arr[i];
                    arr[i]=temp;

                    i=leftIndex;
                }else if(rightIndex<size && arr[i]<arr[rightIndex]){
                    int temp=arr[rightIndex];
                    arr[rightIndex]=arr[i];
                    arr[i]=temp;

                    i=rightIndex;
                }else{
                    return;
                }
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
        h.delete();
        h.print();

    }
}
