import com.sun.source.tree.BreakTree;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    String ret=String_rev("car");
    System.out.println(ret);
    Main obj1=new Main();
    obj1.num_rev(123);
    System.out.println(swap(1,2));
        System.out.println(factorial(4));
    }
    public static String String_rev(String S)
    {/* pradeep*/
        String rc="";
        for(int i=0;i<S.length();i++)
        {
            rc=S.charAt(i)+rc;

        }
        return rc;

    }
    public void num_rev(int num)
    {
       int rem;
       int rev=0;
       while(num!=0)
       {
           rem=num%10;
           num=num/10;
           rev=(rev*10)+rem;
       }
        System.out.println(rev);;
    }
//    Swapping a number
    public static int swap(int a,int b)
    {
        Scanner sc=new Scanner(System.in);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a is "+a);
        System.out.println("b is "+b);
        return 0;
    }
    public static int factorial(int num)
    {
        int fac=0;
        for(int i=1;i<num;i++)
        {
            fac=fac+num*i;
        }
        return fac;
    }
}

