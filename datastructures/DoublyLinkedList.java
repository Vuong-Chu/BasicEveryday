class DoublyLinkedList<T extends Comparable<T>>{
    Node head;
    Node tail;
    
    class Node{
        Node prev;
        Node next;
        T value;
        Node(T data){
            this.value = data;
        }
    }
    
    void addFirst(T data) {
        Node newNode = new Node(data);
        if(head==null) {
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    
    void addLast(T data) {
        Node newNode = new Node(data);
        if(tail==null) {
            tail = newNode;
            head = newNode;
        }else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    
    void insert(T data, int position) {
        Node newNode = new Node(data);
        Node cur = head;
        int count = 0;
        if(position == 0) {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
        }else {
            while(count<position-1) {
                cur = cur.next;
                count++;
            }
            newNode.next = cur.next;
            cur.next.prev = newNode;
            newNode.prev = cur;
            cur.next = newNode;
            cur = newNode;
        }
    }
    boolean contains(T data) {
        Node cur = head;
        while(cur!=null) {
            if(cur.value == data) {
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
    void delete(T data) {
        Node cur = head;
        if(cur == null) {
            return;
        }else {
            if(cur.value==data) {
                if(cur==tail) {
                    cur = null;
                    tail = null;
                }else {
                    head = cur.next;
                    head.prev = null;
                }
            }
            
         while(cur.next!=null && cur.next.value != data) {
                cur = cur.next;
         }
         
         if(cur.next!=null) {
             if(cur.next==tail) {
                 tail = cur;
                 tail.next = null;
             }else {
                 cur.next = cur.next.next;
                 cur.next.prev=cur;
             }
         }
            
        }
    }
    
    void print() {
        Node cur = head;
        while(cur!=null) {
            System.out.print(cur.value + " ");
            cur = cur.next;
        }
    }
    void reversePrint() {
        Node cur = tail;
        while(cur != null) {
            System.out.print(cur.value + " ");
            cur = cur.prev;
        }
    }
}