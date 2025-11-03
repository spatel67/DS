import java.util.ArrayList;
public class DS4_LinkedList<E> implements DS4_LinkedList_Interface<E>
{
    ArrayList<E> link = new ArrayList<>();
    public DS4_LinkedList_Node<E> getFirstNode()
    {
        return (DS4_LinkedList_Node<E>) link.get(0);


    }

    public DS4_LinkedList_Node<E> getLastNode()
    {
        return (DS4_LinkedList_Node<E>) link.get(link.size()-1);

    }

    public E getFirst()
    {
        return link.get(0);

    }

    public E getLast()
    {
        return link.get(link.size()-1);

    }

    public E removeFirst()
    {

    }

    public E removeLast()
    {

    }

    public void addFirst(E data)
    {

    }

    public void addLast(E data)
    {

    }

    public void clear()
    {

    }

    public int size()
    {

    }

    public E get(int x)
    {

    }

    public void add(int x, E data)
    {

    }

    public E remove(int x)
    {

    }

    public E set(int x, E data)
    {

    }

    public boolean isEmpty()
    {

    }
}
