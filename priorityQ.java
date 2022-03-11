class PriorityQueue
{
    private int MAX;
    private int[] arr;
    private int nItems;

    public PriorityQueue()
    {
        MAX=10;
        arr=new int[MAX];
        nItems=0;
    }
    public void insert(int val)
    {
        int i;
        if(nItems==0)
        {
            arr[0]=val;
            nItems++;
            return;
        }
        for(i=nItems-1;i>=0;i--)
        {
            if(val>arr[i])
            {
                arr[i+1]=arr[i];
            }
            else
            {
                break;
            }
        }
        arr[i+1]=val;
        nItems++;
    }
    public void printPriorityQ()
    {
        for(int i=0;i<nItems;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public int remove()
    {
        return arr[--nItems];
    }
    public boolean isFull()
    {
        return nItems==MAX;
    }
    public boolean isEmpty()
    {
        return nItems==0;
    }
    public int getPeek()
    {
        return arr[nItems-1];
    }
}
public class priorityQ
{
    public static void main(String[] args)
    {
        PriorityQueue pq=new PriorityQueue();
        pq.insert(12);
        pq.insert(7);
        pq.insert(10);
        pq.insert(1);
        pq.insert(8);

        pq.printPriorityQ();

        System.out.println();
        System.out.println(pq.remove());
        pq.printPriorityQ();

        System.out.println();
        System.out.println(pq.remove());
        pq.printPriorityQ();
    }
}