import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;

public class test {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        System.out.println("Is the list empty? " + list.isEmpty()); // Should be true
        System.out.println("Size of list: " + list.size()); // Should be 0

        // Test removing from an empty list
        System.out.println("Removed: " + list.removeFirst()); // Should be null

        // Add elements to the list
        for (int i = 0; i < 10; i++) {
            list.addFirst(i);
            System.out.println("Added " + i + " to the front of the list.");
        }

        System.out.println("Is the list empty? " + list.isEmpty()); // Should be false
        System.out.println("Size of list: " + list.size()); // Should be 10

        // Test retrieving first and last elements
        System.out.println("First element: " + list.first()); // Should be 9
        System.out.println("Last element: " + list.last()); // Should be 0

        // Test removing elements
        while (!list.isEmpty()) {
            System.out.println("Removed " + list.removeFirst() + " from the front of the list.");
        }

        System.out.println("Is the list empty? " + list.isEmpty()); // Should be true
        System.out.println("Size of list: " + list.size()); // Should be 0
    }
}

    

