import java.util.ArrayList;

public class MyQueue<E> implements QueueInterface<E>
{
    ArrayList<E> lala = new ArrayList<E>();

    public void offer(E o)
    {
        int size = lala.size();

        lala.add(size,o);



    }

    public E element()
    {


        if(lala.size()== 0)
        {
            return null;

        }

        else
        {
            int haha = 0;
            return this.lala.get(haha);
        }



    }

    public E poll()
    {

        if(lala.size()== 0)
        {
            return null;

        }

        else
        {
            E wow = lala.remove(0);
            return wow;
        }

    }

    public int size()
    {

        int size = lala.size();
        return size;

    }

    @Override
    public boolean isEmpty()
    {

        if(lala.size() == 0)
        {
            return true;
        }

        else
        {
            return false;
        }


    }

    @Override
    public void clear()
    {

        lala.clear();

    }

    public String toString()
    {
        return lala.toString();
    }


}

