

public class SinglyLinkedList<E> {
    public static class node<E>{
        private E element;
        private node<E> next;

        public node(E e,node<E> n){
            element=e;
            next =n;
        }

        public E getElement(){
            return element;
        } 

        public node<E> getNext(){
            return next;
        }

        public void setNext(node<E> n){
            next =n;
        }
    }

    private node<E> head=null;
    private node<E> tail=null;
    private int size=0;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if(size>0){
            return false;
        }
        else{
            return true;
        }
    }

    public E first(){
        return head.getElement();
    }

    public E last(){
        return tail.getElement();
    }

    public void addFirst(E e){
        head=new node<>(e,head);
        if (isEmpty()){
   
            tail=head;
        }
        size++;
    }

    public void addLast(E e){
        node<E> newest=new node<>(e,null);

        if (isEmpty()){
            head=newest;
            tail=head;
        }
        else{
            tail.setNext(newest);
            tail=newest;
        }
        size++;
    }

    public E removeFirst(){
        if(isEmpty()){     //先檢查是否為空的，再把head的值存進temp裡，
            return null;   //這樣就不會NullPointerException
        }
        E temp=head.getElement();
        if(size==1){
            head=null;
            tail=null;
        }
        else{
            head=head.getNext();
        }
        size--;
        return temp;
        
    }

    public boolean equals(Object o){
        if (o==null){
            return false;
        }

        if(getClass() != o.getClass()){
            return false;
        }

        SinglyLinkedList other = (SinglyLinkedList) o;

        if(size != other.size){
            return false;
        }
        node<E> walkA=head;
        node walkB=other.head;

        while(walkA != null){
            if(!walkA.getElement().equals(walkB.getElement())){
                return false;
            }
            walkA=walkA.getNext();
            walkB=walkB.getNext();
        }
        return true;
    }

}
