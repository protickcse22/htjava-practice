class StackImp<T> {
    int top = -1;
    int size;
    T arr[];

    @SuppressWarnings("unchecked")
    public StackImp(int size) {
        this.size = size;
        arr = (T[]) new Object[size];
        ;
    }

    public void push(T obj) {
        if (isFull())
            System.out.println("Stack is overflow");
        else {
            top = top + 1;
            arr[top] = obj;

        }

    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is overflow");
            return null;

        }

        T item = arr[top--];
        return item;

    }

    public T peek() {
        return arr[top];

    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top + 1 == size;
    }
}

public class LinkedListPractice {

    public static void main(String[] args) {

        StackImp<Integer> s = new StackImp<Integer>(10);
        s.push(10);
        s.push(20);
        s.push(30);
        // System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());

    }

}
