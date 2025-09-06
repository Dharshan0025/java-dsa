
package Practice;
import java.util.Scanner;
import java.util.Stack;


public class StackArray {

    int[] stack;
    int pt;

    public StackArray(int n,int p){
        this.stack=new int[n];
        this.pt=p;
    }

    public boolean isEmpty(){
  
        return pt==0? true:false;

    }
    public int size(){
        
        return pt;

    }

    public int top(){
        if(pt==0){
            return -1;
        }

        System.out.println("pt is"+pt);
        return stack[pt-1];

    }
    public String push(int num){
       
       if(pt<stack.length && pt>=0){
          System.out.println(pt);
          stack[pt++]=num;
          return num+" sucessfully pushed";
       }
       return "stack overflow";
    }
    public int pop(){
        int res=-1;
        if(pt>0){
          res=stack[pt-1];
          pt--;
        }
        return res;

    }
    public String swap(int idx1,int idx2){

        if (idx1 < 0 || idx1 >= pt || idx2 < 0 || idx2 >= pt) {
            return "Invalid indices for swap";
        }
        int temp=stack[idx1];
        stack[idx1]=stack[idx2];
        stack[idx2]=temp;
        return idx1+" swapped "+idx2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the stack");
        int n=sc.nextInt();
        StackArray sa=new StackArray(n,0);


        // size before push

        System.out.println("the size of the stack is "+sa.size());
        // push 

        System.out.println(sa.push(0));
        System.out.println(sa.push(1));
        System.out.println(sa.push(2));
        System.out.println(sa.push(3));
        System.out.println(sa.push(4));
        System.out.println(sa.push(5));

        // size after push

        System.out.println("the size of the stack is "+sa.size());


        // swap

        System.out.println(sa.swap(1,2));

        // isEmpty after push

        System.out.println("empty? "+ sa.isEmpty());

        // top after push

        System.out.println("the top is "+sa.top());
        
        // pop

        System.out.println("pop "+sa.pop());
        System.out.println("pop "+sa.pop());
        System.out.println("pop "+sa.pop());
        System.out.println("pop "+sa.pop());
        System.out.println("pop "+sa.pop());
        System.out.println("pop "+sa.pop());
        System.out.println("pop "+sa.pop());



        // isEmpty after pop

        System.out.println("empty? "+ sa.isEmpty());

        // top after pop

        System.out.println("the top is "+sa.top());

        
        // size after pop

        System.out.println("the size of the stack is "+sa.size());
        

       
    }
}
