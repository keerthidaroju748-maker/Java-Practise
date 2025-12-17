import java.util.ArrayList;

class StackCode {
    ArrayList<Integer> list = new ArrayList<>();

    // Peek operation
    public int peek() {
        return list.get(list.size() - 1);
    }

    // Push operation
    public void push(int newdata) {
        list.add(newdata);
    }

    // Pop operation
    public int pop() {
        int temp = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return temp;
    }
}

public class Stack {
    public static void main(String[] args) {
        StackCode stack = new StackCode();

        stack.push(10);
        stack.push(12);
        stack.push(15);
        stack.push(19);
        stack.push(17);

        System.out.println("Topmost element:");
        System.out.println(stack.peek());

        stack.pop();

        System.out.println("After pop, new top:");
        System.out.println(stack.peek());
    }
}
