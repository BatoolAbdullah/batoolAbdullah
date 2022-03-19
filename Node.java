/**
 * Created by lenovo on 11/03/2022.
 */
public class Node {
    int data;
    Node next;
    Node(int d)
    {
        this.data=d ;
        this.next=null;
    }

    static class LinkedList
    {
        Node start;
        LinkedList()
        {
            start=null;
        }
        public void push(int data)
        {
            if (this.start==null)
            {
                Node temp = new Node(data);
                this.start=temp;
            }
            else
            {
                Node temp =new Node(data);
                temp.next=this.start;
                this.start=temp;
            }
        }
        public int findSecandLaestNode(Node ptr)
        {
            Node temp = ptr;
            if (temp == null||temp.next == null)
                return -1;
            while (temp.next.next !=null)
            {
                temp=temp.next;
            }
            return temp.data;
        }

        public static void main(String[] args) {
            LinkedList b = new LinkedList();
            b.push(12);
            b.push(29);
            b.push(11);
            b.push(23);
            b.push(8);
            System.out.println(b.findSecandLaestNode(b.start));


        }
    }
}


