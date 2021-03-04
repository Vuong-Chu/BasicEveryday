class LinkedList<T extends Comparable<T>>{
    Node head;
    Node tail;
    
    private class Node{
        T value;
        Node next;
        
        Node(T a){
            this.value = a;
        }
    }
    
    void addLast(T value) {
        Node n = new Node(value);
        if(head==null) {
            head = n;
            tail = n;
        }else {
            tail.next = n;
            tail = n;
        }
    }
        
     void addFirst(T value) {
            Node n = new Node(value);
            if(head==null) {
                head = n;
                tail = n;
            }else {
                n.next = head;
                head = n;  
            }
     }
     
     void print() {
         while(head != null) {
             System.out.print(head.value + " ");
             head = head.next;
         }
     }
     
     void remove(Node head, T value) {
         if(head == null) {
             return;
         }
             Node n = head;
             if(n.value == value) {
                 if(head == tail) {
                     head = null;
                     tail = null;
                 }else {
                     head = head.next;
                 }
             }

         while(n.next!=null && n.next.value != value) {
             n = n.next;
         }
         if(n.next != null) {
             if(n.next == tail) {
                 tail = n;
             }else {
                 n.next = n.next.next;
             }
         }
     }
     
     boolean contains(Node head, T value) {
         while(head != null) {
             if(head.value == value) {
                 return true;
             }
             head = head.next;
         }
         return false;
     }
     
     void reverse(Node head) {
         Node prev = null;
         Node cur = head;
         Node next = null;
         while(cur != null){
             next = cur.next;
             cur.next = prev;
             prev = cur;
             cur = next;
         }
         this.head = prev;
     }
     
     void reversePrint(Node head, Node tail) {
         if(head != null) {
             Node cur = tail;
             while(cur != head) {
                 Node prev = head;
                 while(prev.next != cur) {
                     prev = prev.next;
                 }
                 System.out.print(cur.value + " ");
                 cur = prev;
             }
             System.out.print(cur.value + " ");
         }
     }
     
     void insert(T data, int position) {
         Node newNode = new Node(data);
         Node cur = head;
         int count = 0;
         if(position == 0) {
             addFirst(data);
         }else {
             while(count < position-1) {
                 cur = cur.next;
                 count++;
             }
             newNode.next = cur.next;
             cur.next = newNode;
         }
     }
     
     Node merge(Node head1, Node head2) {
         if(head1 == null) {
             return head2;
         }
         if(head2 == null) {
             return head1;
         }
         
         if(head1.value.compareTo(head2.value)<0) {
             head1.next = merge(head1.next,head2);
             return head1;
         }else {
             head2.next = merge(head2.next,head1);
             return head2;
         }
     }
}