public class ArrayStack<E> implements Stack<E> {
    public static final int current = 1000;
    public int t = -1; 
    private E[] data ;

    public ArrayStack(){
        this(current);
    }

    public ArrayStack(int c){
        data= (E[]) new Object[c]; 
    }

    @Override
    public void push(E e) {
        if (t==current-1){
            System.out.println("the Stack is full.");
        }
        else{
            t++;
            data[t] = e;
        }
    }
    
    public boolean isEmpty(){
        return t==-1;
    }

    @Override
    public E pop() {
        if(isEmpty()){
            return null;
        }
        else{
            E r = data[t];
            data[t]=null;
            t--;
            return r;
        }
    }

    public int size(){
        return t+1;
    }

    public E top(){
        if(isEmpty()){
            return null;
        }
        else{
            return data[t]; 
        }
    }

    public static void main(String[] args) {
        Stack d = new LinkedListStack();
        System.out.println(d.pop());
        System.out.println(d.size());
        System.out.println(d.top());
        d.push(1);
        System.out.println(d.size());
        System.out.println(d.top());
        d.push('a');
        System.out.println(d.size());
        System.out.println(d.top());
        d.push(1);
        System.out.println(d.size());
        System.out.println(d.top());
        System.out.println(d.pop());
        System.out.println(d.pop());
        System.out.println(d.pop());
    }
}
