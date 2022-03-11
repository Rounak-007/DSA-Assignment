import java.util.*;
public class Runner
{
    public static void main(String[] args)
    {
        Stack nums=new Stack();
            nums.push(15);
            nums.push(8);
            System.out.println(nums.peek());
            nums.push(10);

            nums.show();
           

            System.out.println();
            System.out.println(nums.pop()); 
            nums.show();
            System.out.println();
            System.out.println(nums.pop()); 
            nums.show();
            System.out.println();
            System.out.println(nums.pop());
            nums.show();


            
           // System.out.println(nums.pop());
    }
}