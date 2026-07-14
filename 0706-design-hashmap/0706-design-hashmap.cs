public class MyHashMap {
        private int[] values;

    public MyHashMap()
    {
        values = new int [1000001];
        for (int i = 0; i < values.Length; i++)
        {
            values[i] = -1;
        }
    }

    public void Put(int key, int value)
    {
        values[key] = value;
    }

    public int Get(int key)
    {
        return values[key];
    }

    public void Remove(int key)
    {
        values[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.Put(key,value);
 * int param_2 = obj.Get(key);
 * obj.Remove(key);
 */