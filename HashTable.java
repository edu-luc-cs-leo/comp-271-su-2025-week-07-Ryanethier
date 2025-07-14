/**
 * A simple hasht table is an array of linked lists. In its simplest form, a
 * linked list is represented by its first node. Typically we label this node as
 * "head". Here, however, we'll know it's the first node of the list because it
 * will be placed in an array element. For example, if we have 4 linked lists,
 * we know that the "head" of the third one can be found in position [2] of the
 * underlying array.
 */
public class HashTable<E extends Comparable<E>> {

    /**
     * Underlying array of nodes. Each non empty element of this array is the first
     * node of a linked list.
     */
    private Node[] underlying;

    /**
     * Default size for the underlying array. Users may specify any size, but the
     * default constructor will use this size.
     */
    private static final int DEFAULT_SIZE = 4;

    /** Basic constructor with user-specified size */
    public HashTable(int size) {
        this.underlying = new Node[size];
    }

    /** Default constructor, passes defauilt size to basic constructor */
    public HashTable() {
        this(DEFAULT_SIZE);
    }


    /**
     * Adds a new element to the hash table.
     * Computes the hash index from the element's hashCode,
     * then inserts the element at the "head" of the linked list at that index.
     * Duplicate elements ( by .equals()) are ignored.
     * 
     * @param content E The content of a new node, to be placed in the array.
     */


    public void add(E content) {

        // Calculate hash index (using .abs to make sure non-negative)
        int index = Math.abs(content.hashCode() % this.underlying.length); 

        // Start at the head of linked list at given index

        Node<E> currentNode = underlying[index];

        // Check if element already exists in the list (not allowing for duplicates)

        while (currentNode != null) {
            if (currentNode.getContent().equals(content)) {
                return; // Element already exists, do not insert again
            }

            currentNode = currentNode.getNext();
            
        }

        // Create a new node and insert at the head of the list

        Node<E> newNode = new Node<E>(content);
        newNode.setNext(this.underlying[index]);
        underlying[index] = newNode;
        
        
      } // method add

      /**
       *  Method to print the contents of the HashMap
       *  If the currentNode is not null, the method iterates through the array
       *  and prints the index followed by its contents (linked-list)
       *  Else, the method prints null to indicate no contents at specified index.
       * 
       * EXAMPLE: Index 0 -> apple -> banana -> null
       * 
       */

      public void printTable() {
        for (int i = 0; i < this.underlying.length; i++) {
            System.out.println("Index " + i + " -> ");
            Node<E> currentNode = underlying[i];
            while (currentNode != null) {

                System.out.print(currentNode + " -> ");
                currentNode = currentNode.getNext();
                
            }

            System.out.println("null");
        }
      }

} // class HashTable
