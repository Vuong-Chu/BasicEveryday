class BST{
    Node root;
    
    private class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data = data;
        }
    }
    
    Node add(Node root, int value) {
        if(root==null) {
            root = new Node(value);
        }else {
            if(value<root.data) {
                root.left = add(root.left, value);
            }else {
                root.right = add(root.right, value);
            }   
        }
        this.root = root;
        return this.root;
    }
    
    boolean search(Node root, int value) {
        if(root==null) {
            return false;
        }else {
            if(root.data==value) {
                return true;
            }else if(value<root.data) {
                return search(root.left, value);
            }else {
                return search(root.right, value);
            }
        }
    }
    
    void printInOrder(Node root) {
        if(root!=null) {
            
            printInOrder(root.left);
            System.out.print(root.data+" ");
            printInOrder(root.right);
        }
    }
    void printPostOrder(Node root) {
        if(root!=null) {
            printPostOrder(root.left);
            printPostOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
    void printPreOrder(Node root) {
        if(root!=null) {
            System.out.print(root.data+" ");
            printPreOrder(root.left);
            printPreOrder(root.right);
        }
    }
    
    void remove(Node root, int value) {
        if(root!=null) {
            
        }
    }
    
    Node findParent(Node root, int value) {
        if(root.data == value) {
            return null;
        }else if(value < root.data){
            if(root.left.data==value) {
                return root;
            }else {
                return findParent(root.left, value);
            }
        }else {
            if(root.right.data==value) {
                return root;
            }else {
                return findParent(root.right, value);
            }
        }
    }
    
    Node findNode(Node root, int value) {
        if(root!=null) {
            if(root.data==value) {
                return root;
            }else if(value < root.data) {
                return findNode(root.left, value);
            }else {
                return findNode(root.right, value);
            }
        }else {
            return null;
        }
    }
    
    void min(Node root) {
        if(root == null) {
            return;
        }
        else {
            if(root.left==null) {
                System.out.println(root.data);
            }
            else{
                min(root.left);
            }
        }
    }
    void max(Node root) {
        if(root == null) {
            return;
        }
        else {
            if(root.right==null) {
                System.out.println(root.data);
            }
            else{
                max(root.right);
            }
        }
    }
    int maxDepth(Node root) {
        if(root==null) {
            return 0;
        }else {
            int ldepth = maxDepth(root.left);
            int rdepth = maxDepth(root.right);
            if(ldepth>rdepth) {
                return ldepth+1;
            }else {
                return rdepth+1;
            }
        }
    }
    boolean isBalanced(Node root) {
        if(root!=null){
            int lh = maxDepth(root.left);
            int rh = maxDepth(root.right);
            if(Math.abs(lh-rh)>1){
                return false;
            }else{
                if(!isBalanced(root.left)){
                    return false;
                }
                if(!isBalanced(root.right)){
                    return false;
                }
            }
        }
        return true;
    }
}