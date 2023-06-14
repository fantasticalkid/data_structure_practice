
public class CircularlyLinkedList<E> {
    public static class node<E>{
        private E element;
        private node<E> next;
        
        public node(E e, node<E> n){
            element = e;
            next = n; 
        }
        
        public E getElement(){
            return element;
        }

        public node<E> getNext(){
            return next;
        }

        public void setNext(node<E> n){
            next = n;
        }
    }

    private int size=0;
    private node<E> tail = null;

    public boolean isEmpty(){
        return size==0;
    }

    public int size(){
        return size;
    }

    public void rotate(){
        if (!isEmpty()){
            tail=tail.getNext();
        }
    }

    public void addFirst(E e){
        if (isEmpty()){
            tail = new node<>(e,null);
            tail.setNext(tail);
        }
        else {
            node<E> newest = new node<>(e,tail.getNext());
            tail.setNext(newest);
        }    
        size++;
    }

    public void addLast(E e){
        addFirst(e);
        rotate();
    }

    public E first(){
        if(isEmpty()){
            return null;
        }
        return tail.getNext().getElement();
    }

    public E Last(){
        if(isEmpty()){
            return null;
        }
        return tail.getElement();
    }

  

}




