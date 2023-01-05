
import java.util.*;

 class node{
        int data;
        node left;
        node right;

        public node(int d){
            data = d;
            left = null;
            right = null;
        }
}



public  class binaryTree{
    node root = null;

    
    
    public  node buildTree(node root){
        System.out.println("Enter the data: ");
        int data;
        Scanner sc = new Scanner(System.in);
        data = sc.nextInt();
        root = new node(data);
        if(data == -1){
            return null;
        }
        System.out.println("Enter data for inserting in left of "+ data);
        root.left = buildTree(root.left);
        System.out.println("Enter data for inserting in right of  "+ data );
        root.right = buildTree(root.right);
        return root;
    }

    public  void levelOrderTraversal(node root){
        Queue<node>q = new LinkedList<>();
        q.add(root);
        q.add(null); //level 0

        while(!q.isEmpty()){
            node temp = q.peek();
           
            q.remove();

            //purana level complete/traverse ho chuka hai
            if(temp == null){
                System.out.println("\n");
                
                //queue still has some child nodes
                if(!q.isEmpty()){
                    q.add(null); 
                }
            }
            else{
                System.out.print(temp.data + " ");
                if(temp.left != null){
                    q.add(temp.left);
                }
    
                if(temp.right != null){
                    q.add(temp.right);
                }
            }
            
        }
    }

    void printInorder(node root){
        if(root == null){
            return;
        }

        printInorder(root.left);
        System.out.print(root.data+" ");
        printInorder(root.right);
    }

    void printPreorder(node root){
        if(root == null){
            return;
        }
        
        System.out.print(root.data + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    void printPostorder(node root){
        if(root == null){
            return;
        }

        printPostorder(root.left);
        printPostorder(root.right);
        System.out.print(root.data+" ");
    }

    
    public static void main(String [] args){
        binaryTree tree = new binaryTree();
        //creating a tree
        node root1 = null;
        root1 = tree.buildTree(tree.root);

        //level order
        System.out.println("LevelOrder Traversal : ");
        tree.levelOrderTraversal(root1);

        System.out.println("\n");

        System.out.println("Inorder Traversal : ");
        tree.printInorder(root1);
        
        System.out.println("\n");

        System.out.println("PreOrder Traversal : ");
        tree.printPreorder(root1);

        System.out.println("\n");

        System.out.println("Postorder Traversal : ");
        tree.printPostorder(root1);


    }
}
