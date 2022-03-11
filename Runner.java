import java.util.*;
public class Runner
{
    public static void main(String[] args)
    {
        /*Scanner sc=new Scanner(System.in);
        int size,front,rear;
        Queue q=new Queue();
        System.out.println("Enter length of list:");
        int n=sc.nextInt();
        q.Q(n);
        for(int x=0;x<n;x++)
        {
            System.out.println("Enter value:");
            int a=sc.nextInt();
            q.enQueue(a);
        }
        q.show();*/
        Queue q=new Queue();
        q.enQueue(5);
        q.enQueue(10);
        q.enQueue(6);
        q.enQueue(17);
        q.show();
        q.deQueue();
        q.show();
        q.deQueue();
        q.show();
    }
}