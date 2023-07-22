public class LinkedListStack<E> implements Stack<E> {
        public LinkedListStack(){}
        SinglyLinkedList<E> data = new SinglyLinkedList<>();

        public boolean isEmpty(){return data.isEmpty();}

        @Override
        public void push(E e) {data.addFirst(e);}

        @Override
        public E pop() {return data.removeFirst();}

        public int size(){return data.size();}

        public E top(){
        //    if(isEmpty()){return null;}
        //    else{
                return data.first();
        //    }
        }

        public static void main(String[] args) {
            ArrayStack d = new ArrayStack<>();
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
