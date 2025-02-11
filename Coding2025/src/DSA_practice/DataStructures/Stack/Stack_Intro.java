package DSA_practice.DataStructures.Stack;

import java.util.Stack;

public class Stack_Intro {

    public static void main(String[] args){
        System.out.println("This is Stack");
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(10);
        st.push(20);
        System.out.println(st);
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();

        System.out.println(st);
    }
}
