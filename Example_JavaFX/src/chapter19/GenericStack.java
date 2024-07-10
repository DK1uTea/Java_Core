package chapter19;

import java.util.ArrayList;

public class GenericStack<E> {
    private ArrayList<E> list = new ArrayList<>();

    public int getSize() {
        return list.size();
    }

    public E peek() {
        return list.get(getSize() - 1);
    }

    public void push(E item) {
        list.add(item);
    }

    public E pop() {
        E item = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return item;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }

    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>();

        System.out.println("Is the stack empty? " + stack.isEmpty());

        System.out.println("Pushing elements onto the stack:");
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
            System.out.println("Pushed: " + i);
        }

        System.out.println("Is the stack empty? " + stack.isEmpty());

        System.out.println("Top element on the stack: " + stack.peek());

        System.out.println("Popping elements from the stack:");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        System.out.println("Is the stack empty? " + stack.isEmpty());
    }
}

