/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: OurStack.java
 * Author: Frank M. Carrano
 * Author: Timothy M. Henry
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

package assignment3partb;

public class OurStack<T> implements StackInterface<T> {

    private Node topNode;
    
    public OurStack() {
        topNode = null;
    }

    @Override
    public void push(T newEntry) {
        topNode = new Node(newEntry, topNode);
    }

    @Override
    public T peek() {
        return topNode.getData();
    }

    @Override
    public T pop() {
        T top = peek();
        assert (topNode != null);
        topNode = topNode.getNextNode();
        return top;
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public void clear() {
    }
    
    private class Node {
        private T data;
        private Node next;
        
        private Node(T dataPortion){
            this(dataPortion, null);
        }
        
        private Node(T dataPortion, Node linkPortion){
            data = dataPortion;
            next = linkPortion;
        }
        
        private T getData() {
            return data;
        }
        
        private void setData(T newData) {
            data = newData;
        }
        
        private Node getNextNode() {
            return next;
        }
        
        private void setNextNode(Node nextNode) {
            next = nextNode;
        }
    }
}