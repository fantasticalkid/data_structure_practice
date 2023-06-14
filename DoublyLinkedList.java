public class DoublyLinkedList<E> {
    public static class node<E>{
        private E element;
        private node<E> next;
        private node<E> prev;

        public node(E e, node<E> p,node<E> n){
            element = e;
            next = n;
            prev = p;
        }

        public node<E> getNext(){
            return next;
        }

        public node<E> getPrev(){
            return prev;
        }

        public void setNext(node<E> n){
            next = n;
        }

        public void setPrev(node<E> p){
            prev = p;
        }

        public E getElement(){
            return element;
        }

    }
    private node<E> header;
    private node<E> tailer;
    private int size=0;

    public DoublyLinkedList(){
        header=new node<>(null,null,null);
        tailer=new node<>(null,header,null);
        header.setNext(tailer);  //tailer還沒創建前，不能直接參考
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int size(){
        return size;
    }    

    public void between(E e,node<E> p, node<E> n){
        node<E> newest = new node<>(e,p,n);
        p.setNext(newest);
        n.setPrev(newest);
        size++;
    }

    public E remove(node<E> e){
        E element = e.getElement();
        e.getPrev().setNext(e.getNext());
        e.getNext().setPrev(e.getPrev());
        size--;
        return element;
    }

    public void addFirst(E e){
        between(e, header, header.getNext());
    }

        public void addLast(E e){
        between(e, tailer.getPrev(),tailer);
    }

    public E removeFirst(){
        return remove(header.getNext());
    }

        public E removeLast(){
        return remove(tailer.getPrev());
    }

    public E first(){
        return header.getNext().getElement();
    }

    public E Last(){
        return tailer.getPrev().getElement();
    }

    
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        
        System.out.println("Add elements to the list.");
        list.addFirst(1);
        list.addLast(2);
        System.out.println("First element: " + list.first());
        System.out.println("Last element: " + list.Last());

        System.out.println("\nRemove elements from the list.");
        System.out.println("Removed first element: " + list.removeFirst());
        System.out.println("Removed last element: " + list.removeLast());

        System.out.println("\nAfter all operations, is list empty? " + list.isEmpty());
    }
}


