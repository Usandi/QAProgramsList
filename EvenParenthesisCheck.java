package Strings;

import java.util.Stack;

public class EvenParenthesisCheck {
    public static void main(String[] args) {
        String parathesis = "(((";
        Stack st = new Stack();
        for (int i=0; i<parathesis.length(); i++) {
            char a[] = parathesis.toCharArray();
            for (int j=0; j<a.length; j++) {
                if (a[j] == '(') {
                    st.push(a[j]);
                }
                else if (a[j] == ')') {
                    System.out.println("Not valid");
                    if (!st.isEmpty()) {
                        st.pop();
                    }
                }
            }
        }
    }
}
