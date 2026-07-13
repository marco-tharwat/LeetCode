public class MyHashSet {

    private List<int> list;
   public MyHashSet()
   {
       list = new();
   }

   public void Add(int key)
   {
       if (list.Contains(key))return;
       list.Add(key);
   }

   public void Remove(int key)
   {
       if (!list.Contains(key)) return;
       list.Remove(key);
   }

   public bool Contains(int key)
   {
       return list.Contains(key);
   }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.Add(key);
 * obj.Remove(key);
 * bool param_3 = obj.Contains(key);
 */