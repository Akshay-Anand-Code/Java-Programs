package Java.src.LinkedList;

public class Linkedlist {

    Node head;

    public void insert(int data) 
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        /* Node has two data members 
         * data (int)
         * next (Node object)
         * 
         * Above we took given data and null passed them as arguments into "node" 's parameters.
         * The node equiped with parameterized data would be inserted at the end of the list
         */

        if (head == null) {
            head = node;
        } 
        else 
        {
           Node n = head;

           while(n.next != null)
           {
              n = n.next;

           }
           n.next = node;
        }
    }

    public void insertAtStart(int data) 
    {
       Node node = new Node();
       node.data = data;
       node.next = null;
       node.next = head;
       head = node;


    }

    public void insertAt(int index, int data) 
    {
      Node node = new Node();
      node.data = data;
      node.next = null;
       
      if (index == 0) {
        insertAtStart(data);
      }
      
      else 

      {
        Node n = head;
        //starting traversal from head or the first node
        
        for (int i = 0; i < index - 1; i++)
        {
           n = n.next;
  
           /* on the very first iteration, the n node
              would jump from 0 to index 1 and move forward until
              second-last node of the passed index node.
  
              but the loop will run only till the third last
              index since (n = n.next) would get executed and push 
              n to second last on that iteration itself so no need to 
              run loop anymore.
  
              at that time the n.next would be pointing to existing consecutive node
              so use the value to fill the node.next with that node as after being added it should point to
              the existing index node.
  
              and then change n.next to point to newly added node by n.next = node;
          */
        }
  
        node.next = n.next;
        n.next = node;
      }

     
      
    }

    public void delelteAt(int index)
    {
        if(index == 0)
        {
           head = head.next;
        } 
        else 
        {
            Node previous = head;
            /*the previous node will start from head and jump nodes till it reaches n-1 
             * meaning literally one node before to the node to be deleted.
            */
            int node_count = 1;
            
            /* to keep the count of nodes traversed, since previous is set equal to head,
            it has already standing at 1 */ 

            while(node_count < index -1)
            {
                previous = previous.next;
                
                node_count++;
            }
           
            System.out.println("nodes traversed: " + node_count);
            Node current  = previous.next;
            previous.next = current.next;

            /*In order to delete a node at positon n, we'd have to traverse till position n-1
             * to delete node 3, will have to traverse till node 2.
             */
        }

    }

    public void show() 
    {
        Node node = head;

        while(node.next != null) 
        {
          System.out.println(node.data);
          node = node.next;  
        }
        System.out.println(node.data);
        /*
        The while loop would break at the second-last element since
        the last element pointer would be null, so to print the last 
        node's value we'd add print statement outside the while loop
        */
    }
    
}
