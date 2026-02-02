package stack_implementations;

public class stack {
    public static void main(String[] args) {
        Array_Based st = new Array_Based(3);
        System.out.println("Empty: "+st.isEmpty());
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println("Full: "+st.isFull());
        System.out.println(st.pop());

        List_Based st2 = new List_Based();
        st2.push(1);
        st2.push(3);
        st2.push(2);
        System.out.println(st2.peek());
    }
}