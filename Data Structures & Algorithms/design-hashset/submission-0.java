class MyHashSet {

    private int capacity = 1000;
    private ListNode[] buckets = new ListNode[1000];
    
    public MyHashSet() {
    }
    
    public void add(int key) {
        int bucketIdx = key % capacity;
        ListNode bucket = buckets[bucketIdx];
        if (bucket == null) {
            buckets[bucketIdx] = new ListNode(key);
            return;
        }
        ListNode cur = bucket;
        while (cur!= null) {
            if (cur.key == key) {
                return;
            }

            if (cur.next == null) {
                cur.next = new ListNode(key);
            }
            cur = cur.next;
        }
        
    }
    
    public void remove(int key) {
        int bucketIdx = key % capacity;
        ListNode bucket = buckets[bucketIdx];
        if (bucket == null) {
            return;
        }
        ListNode cur = bucket;
        ListNode prevCur = null;
        while (cur != null) {
            if (cur.key == key) {
                if (prevCur != null) {
                    prevCur.next = cur.next;
                } else {
                    buckets[bucketIdx] = cur.next;
                }
            }
            prevCur = cur;
            cur = cur.next;
        }
        
    }
    
    public boolean contains(int key) {
        int bucketIdx = key % capacity;
        ListNode bucket = buckets[bucketIdx];
        if (bucket == null) {
            return false;
        }
        ListNode cur = bucket;
        while (cur != null) {
            if (cur.key == key) {
                return true;
            }
            cur = cur.next;
        }

        return false;
    }
}

class ListNode {
    public int key;
    public ListNode next;

    public ListNode(int key) {
        this.key = key;
        this.next = null;
    }
}
