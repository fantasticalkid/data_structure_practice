public interface Stack<E> {
    
    public E top();
    
    public void push(E e);

    public E pop();

    public int size();

    public boolean isEmpty();
}
