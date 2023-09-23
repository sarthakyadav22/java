import java.util.Stack;

class stackex {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("empty stack:" + stack);
        System.out.println("empty stack:" + stack.isEmpty());
        stack.push(22);
        stack.push(22);
        stack.push(0001);
        stack.push(0001);
        // stack.push() papa ka birth year
        System.out.println("non empty stack:" + stack);
        System.out.println("non empty stack :" + stack.isEmpty());// this function has to be written again after the
                                                                  // value has been feeded into the stack to get false
                                                                  // value once the stack has some value in it .

    }
}
