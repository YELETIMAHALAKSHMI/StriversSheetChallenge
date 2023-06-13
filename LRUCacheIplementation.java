import java.util.*;
public class LRUCache{
    Node head = new Node(0,0),tail = new Node(0,0);
    Map<Integer ,Node> map = new HashMap<>();
    int capacity;
    LRUCache(int capacity){
        // Write your code here
        this.capacity = capacity;
        head.next = tail;
        tail.prev= head;
    }

   public int get(int key){
        // Write your code here
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        else{
            return -1;
        }
    }

    public void put(int key, int value){
        // Write your code here
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size()==capacity){
            remove(tail.prev);
        }
        // Node nod = new Node(key,val);
        // insert(nod);
        insert(new Node(key,value));
        }
    public void remove(Node node){
        map.remove(node.key);
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }
    public void insert(Node node){
        map.put(node.key , node);
        node.next = head.next;
        node.prev = head;
        node.next.prev = node;
        head.next = node;
    }      
}
class Node{
    Node next , prev;   
    int key , val;
    Node(int _key , int _val){
        this.key= _key; 
        this.val =_val;
    }
 }  
