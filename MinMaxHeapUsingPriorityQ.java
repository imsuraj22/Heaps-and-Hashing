import java.util.Comparator;
import java.util.PriorityQueue;

public class MinMaxHeapUsingPriorityQ {

    static void MinHeap(){
        PriorityQueue<Integer> q=new PriorityQueue<>();
        q.add(4);
        q.add(2);
        q.add(5);
        q.add(3);

        System.out.println("Top element : "+q.peek());
        q.poll();
        System.out.println("Top element : "+q.peek());
        System.out.println("Size of Queue : "+q.size());
        if(q.isEmpty()){
            System.out.println("Queue is Empty");
        }else{
            System.out.println("Queue is not Empty");
        }

    }

    static void MaxHeap(){
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(
                new Comparator<Integer>() {
                   
                    // Compare method for place element in
                    // reverse order
                    public int compare(Integer a, Integer b)
                    {
                        if (a < b)
                            return 1;
                        if (a > b)
                            return -1;
                        return 0;
                    }
                });
                q.add(10);
                q.add(15);
                q.add(20);
                q.add(5);

                System.out.println("Top element : "+q.peek());
            q.poll();
            System.out.println("Top element : "+q.peek());
            System.out.println("Size of Queue : "+q.size());
            if(q.isEmpty()){
                System.out.println("Queue is Empty");
            }else{
                System.out.println("Queue is not Empty");
            }
    }
    public static void main(String[] args) {
        MinHeap();
        System.out.println();
        MaxHeap();
    }
}
