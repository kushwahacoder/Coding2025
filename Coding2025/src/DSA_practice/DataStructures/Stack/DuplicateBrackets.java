package DSA_practice.DataStructures.Stack;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args){
        System.out.println("duplicate brackets ((x))");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character> st=new Stack<>();
        int count=0;
        for (int i=0;i<s.length();i++)
        {
            count=0;
            if(s.charAt(i)==')')
            {
                while (st.peek()!='(')
                {
                    st.pop();
                    count++;
                }
                st.pop();
                if(count==0){
                    System.out.println("true");
                    return;
                }
            }
            else {
                st.push(s.charAt(i));
            }
        }
        System.out.println(false);
    }
}
