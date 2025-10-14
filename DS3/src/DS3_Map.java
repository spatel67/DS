import java.util.ArrayList;
import java.util.Iterator;

public class DS3_Map<K, V> implements MapInterface<K, V>
{
    private ArrayList<MapEnt<K, V>> data = new ArrayList<MapEnt<K, V>>();


    public void clear()
    {
        data.clear();
    }


    public boolean containsKey(K key)
    {
        for (MapEnt<K, V> entry : data)
        {
            if (entry.getKey().equals(key))
                return true;
        }
        return false;
    }


    public boolean containsValue(V value)
    {
        for (MapEnt<K, V> entry : data)
        {
            if (entry.getValue().equals(value))
                return true;
        }
        return false;
    }


    public DS3_Set<MapEnt<K, V>> entrySet()
    {
        DS3_Set<MapEnt<K, V>> entries = new DS3_Set<MapEnt<K, V>>();
        for (MapEnt<K, V> entry : data)
        {
            entries.add(entry);
        }
        return entries;
    }


    public V get(K key)
    {
        for (MapEnt<K, V> entry : data)
        {
            if (entry.getKey().equals(key))
                return entry.getValue();
        }
        return null;
    }


    public boolean isEmpty()
    {
        return data.isEmpty();
    }


    public V put(K key, V value)
    {
        for (MapEnt<K, V> entry : data)
        {
            if (entry.getKey().equals(key))
            {
                V lalaValue = entry.getValue();
                entry.setValue(value);
                return lalaValue;
            }
        }
        data.add(new MapEnt<K, V>(key, value));
        return null;
    }


    public int size()
    {
        return data.size();
    }


    public DS3_Set<K> keySet()
    {
        DS3_Set<K> keys = new DS3_Set<K>();
        for (MapEnt<K, V> entry : data)
        {
            keys.add(entry.getKey());
        }
        return keys;
    }


    public ArrayList<V> values()
    {
        ArrayList<V> valhehe = new ArrayList<V>();
        for (MapEnt<K, V> entry : data)
        {
            valhehe.add(entry.getValue());
        }
        return valhehe;
    }


    public V remove(K key)
    {
        Iterator<MapEnt<K, V>> iter = data.iterator();
        while (iter.hasNext())
        {
            MapEnt<K, V> entry = iter.next();
            if (entry.getKey().equals(key))
            {
                V val = entry.getValue();
                iter.remove();
                return val;
            }
        }
        return null;
    }
}