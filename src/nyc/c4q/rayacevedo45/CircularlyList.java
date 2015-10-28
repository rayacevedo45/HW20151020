package nyc.c4q.rayacevedo45;
/**
 * Access Code 2.1
 * Ray Acevedo
 * CircularlyList.java
 */
public class CircularlyList
{
    Node head;


    public void addToHead(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void addToTail(String data) {
        Node newNode = new Node(data);
        Node current = head;
        while(current.next != head){
            current = current.next;
        }
        current.next = newNode;
        newNode.next = head;
    }
    public void delete (String data) {
        Node current = head;
        if (head == null) {
            return;
        }
        if (head.data.equals(data) ){
            head = head.next;
        }
        while(current.next.data.equals(data) && current.next != head){
            current = current.next;
        }
        current.next = current.next.next;
    }
    public void insertAfter(String prevData, String newData){
        Node newNode = new Node(newData);
        Node spot = findSpot(prevData);

        if (spot==null){
            return;
        }else
        {
            newNode.next = spot.next;
            spot.next = newNode;
        }

    }
    public Node findSpot(String data) {
        Node current = head;
        while(!current.data.equals(data) && current.next != head){
            current = current.next;
        }
        if (!current.data.equals(data)){
            return null;
        }
        else {
            return current;
        }
    }

    public static void main(String[] args)
    {

    }
}
