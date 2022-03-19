/**
 * Created by lenovo on 06/02/2022.
 */
public class singleLinkedList<E> {
    Node<E>head=null;
    Node<E>tail=null;
    int size=0;
//كونستركتر فااضي عادي لو مافعلتها
    public singleLinkedList() {
    }

    public boolean isEmpty() {
        return size==0;
    }
    public int size(){
        return size;
    }
public E first(){
    if (isEmpty())return null;
    return head.getElemant();
}
public E last()
{
    if (isEmpty())return null;
    return tail.getElemant();
}
public void addFirst(E elemant)
{
    head=new Node<E>(elemant,head);
    if (size==0)
        tail=head;
    size++;
}
public void addlaest(E element)
{
    Node<E>x=new Node<E>(element,null);
    //في حالت Node فااضي
    if (size==0)
    head=x;

    else
        tail.setNext(x);
    tail=x;
    size++;

}
public E removeFrist()
{
    if (isEmpty())return null;
    E del=head.getElemant();
    head=head.getNext();
    size--;
    if (size==0);
    tail=null;
    return del;
}


    private static class Node<E>
    {
        E elemant;
        Node<E> next;
        public Node(E elemant,Node<E>next)
        {
            this.elemant=elemant;
            this.next=next;
        }
        public E getElemant() {
            return elemant;
        }
        public Node<E> getNext(){
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

}
