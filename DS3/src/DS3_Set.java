import java.util.ArrayList;
import java.util.Iterator;

public class DS3_Set<E> implements SetInterface<E>
{
    ArrayList<E> setList = new ArrayList<E>();
    Iterator<E> iterator= setList.iterator();


    public boolean add(E o)
    {
        return setList.add(o);

    }

    public void clear()
    {
        setList.clear();
    }

    public boolean contains(E o)
    {
        return setList.contains(o);
    }

    public boolean isEmpty()
    {
        return setList.isEmpty();
    }

    public Iterator<E> iterator()
    {
        return setList.iterator();

    }

    public boolean remove(E o)
    {
        return setList.remove(o);
    }

    public int size()
    {
        return setList.size();
    }

}
