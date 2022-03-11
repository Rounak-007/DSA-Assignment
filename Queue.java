import java.util.*;
public class Queue
{
    Scanner sc=new Scanner(System.in);
    int queue[]=new int[5];
    int size,front,rear,x;
    /*public void Q(int n)
    {
        this.x=n;
    }*/
    
    public void enQueue(int data)
    {
        //int queue[]=new int[x];
        queue[rear]=data;
        rear=rear+1;
        size=size+1;
    }
    public int deQueue()
    {
        int data=queue[front];
        front=front+1;
        size=size-1;
        return data;
    }

    public void show()
    {
        System.out.println("Elements:");
        for(int i=0;i<size;i++)
        {
            System.out.println(queue[i]+" ");
        }
    }
}