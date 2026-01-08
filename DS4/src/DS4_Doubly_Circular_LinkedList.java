import java.util.ArrayList;

public class DS4_Doubly_Circular_LinkedList<E> extends DS4_Doubly_Circular_LinkedList_Interface<E>
{
    ArrayList<E> circ = new ArrayList<E>();
    public DS4_Doubly_Circular_LinkedList_Node<E> getFirstNode()
    {


    }

    public DS4_Doubly_Circular_LinkedList_Node<E> getLastNode()
    {


    }

    public E getFirst()
    {
        return circ.get(0);

    }

    public E getLast()
    {
        return circ.get(circ.size()-1);

    }

    public E removeLast()
    {
        E lala = circ.get(circ.size()-1);
        circ.remove(circ.get(circ.size()-1));
        return lala;

    }

    public void addFirst(E data)
    {
        circ.add(0, data);

    }

    public void addLast(E data)
    {
        circ.add(circ.size()-1, data);

    }

    public void clear()
    {
        circ.clear();

    }

    public int size()
    {
        return circ.size();

    }

    public E get(int x)
    {
        return circ.get(x);

    }

    public void add(int x, E data)
    {
        circ.add(x, data);

    }

    public E remove(int x)
    {
        return circ.remove(x);

    }

    public E set(int x, E data)
    {
        return circ.set(x, data);

    }

    public boolean isEmpty()
    {
        return circ.isEmpty();

    }

    public String backwardsToString()
    {

    }

}
