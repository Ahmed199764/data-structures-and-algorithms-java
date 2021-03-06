package linkedListInsertion;

import java.util.ArrayList;
import java.util.List;

/**
 * The LinkedList class that holds its instance methods for append.
 */
public class LinkedList {

    public Node head;
//    public Node current;

    public LinkedList(){

    }


    /**
     * Adds a new node with the given value to the end of the list
     *
     * @param value the data
     */
    public void append(int value) throws AssertionError{

        if(head == null){
            Node current = new Node(value);
            head = current;
        }
        else{
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(value);
            current.next = newNode;
        }
    }

    /**
     *
     * Adds a new node with the given newValue immediately before the first value node
     *
     * @param value
     * @param newVal
     */
    public void insertBefore(int value, int newVal){

        if(head.data == value ){
            head = new Node(newVal);
        }
        else{
            Node current = head;

            while(current.next.data != value){
                current = current.next;

                if(current == null){
                    throw new NullPointerException("Value must contain in list");
                }
            }
            Node newNode = new Node(newVal);
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    /**
     * Adds a new node with the given newValue immediately after the first value node
     *
     * @param value
     * @param newValue
     */
    public void insertAfter(int value, int newValue){
        Node current = head;

        while(current.data != value){
            current = current.next;
            if(current == null){
                throw new IllegalStateException("Value must contain in list");
            }
        }

        Node newNode = new Node(newValue);
        newNode.next = current.next;
        current.next = newNode;

        if(current.next ==  null){
            current = new Node(newValue);
        }
    }


    /**
     * This method takes in no arguments and returns a collection all of the current Node values in the Linked List
     *
     * @return Node
     */
    public List<Node> print(){
        List<Node> newList = new ArrayList<>();

        Node current = head;

        while(current != null){
            newList.add(current);
            current = current.next;
        }
        return newList;
    }
}



