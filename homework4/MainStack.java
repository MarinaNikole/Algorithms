package homework4;

import classwork29_08.Stack;

public class MainStack {
    public static void main(String[] args) {

        SpecialStack stack = new SpecialStack();
        stack.push(1);
        stack.push(5);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.getMax());
        System.out.println(stack.getMin());

        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());

        System.out.println(stack.items);
        System.out.println(stack.pop());
        stack.clear();
        System.out.println(stack.isEmpty());
    }
}

