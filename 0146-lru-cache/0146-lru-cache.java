class LRUCache {

    class Node {
        int key;
        int value;

        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    HashMap<Integer, Node> map;

    Node head;
    Node tail;

    int capacity;
    int size;

    public LRUCache(int capacity) {
        this.capacity = capacity;

        map = new HashMap<>();

        head = new Node(0, 0);
        tail = new Node(0, 0);

        head.next = tail;
        tail.prev = head;
    }

    public void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
node.prev = null;
node.next = null;
       
    }

    public void insert(Node node) {
        if (node == null)
            return;

        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev = head;

    }

    public int get(int key) {

        if (!map.containsKey(key)) {
            return -1;
        }

       Node temp = map.get(key);

remove(temp);

insert(temp);

return temp.value;

    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
           
            Node node = map.get(key);

            remove(node);

            node.value = value;

            insert(node);
       
        }else if (map.size() == capacity) {
                Node lru = tail.prev;
                remove(lru);
                map.remove(lru.key);
                Node node = new Node(key, value);
                insert(node);
                map.put(key,node);
  
            }else{
                Node node = new Node(key, value);
                insert(node);
                map.put(key,node);
            }
        } 
    }


/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */