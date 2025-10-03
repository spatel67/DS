import java.util.ArrayList;

public class DS3_Map<K,V> implements MapInterface<K,V>
{


    ArrayList<MapEnt<K,V>> mapL = new ArrayList<>();
    public void clear()
    {
        mapL.clear();
    }

    public boolean containsKey(K key)
    {
        return mapL.contains();
    }

    public boolean containsValue(V value)
    {

    }

    public DS3_Set<MapEnt<K,V>> entrySet()
    {
        mapL.get()
    }

    public V get(K o){}

    public boolean isEmpty(){}

    public V put(K key, V value){}

    public int size(){}

    public DS3_Set<K> keySet{}

    public ArrayList<V> values(){}

    public V remove(K key){}


}
