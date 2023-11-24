package stackClass;

public class Main {
    public static void main(String[] args) {
        StackRealization<Integer> stack = new StackRealization<>(10);

        StackNode <Integer> node1 = new StackNode<>(1, null);
        StackNode <Integer> node2 = new StackNode<>(2, null);
        StackNode <Integer> node3 = new StackNode<>(3, null);

        System.out.println();
        System.out.println(stack);
        System.out.println();
        System.out.println("Is stack empty -> " + stack.isEmpty());
        System.out.println();
        System.out.println("Add elements: ");
        System.out.println(stack.push(node1));
        System.out.println(stack.push(node2));
        System.out.println(stack.push(node3));
        System.out.println();
        System.out.println("Is stack empty -> " + stack.isEmpty());
        System.out.println();
        System.out.println(stack);
        System.out.println();
        System.out.println("pop() ---> " + stack.pop());
        System.out.println(stack);
        System.out.println("peek() ---> " + stack.peek());
        stack.push(new StackNode<Integer>(101010, null));


        System.out.println("Stack visualization");
        stack.visualizeStack();
    }
}
