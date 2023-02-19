public class MyHashMap <K,V> {
    private int size;
    private Node<K, V> firstNode;
    private Node<K, V> lastNode;
    private static class Node<K, V> {
        final int hashItem;
        private K key;
        private V value;
        private Node<K, V> nextNode;

        Node(int hash, K key, V value) {
            this.hashItem = hash;
            this.key = key;
            this.value = value;
            this.nextNode = null;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Node<K, V> getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node<K, V> nextNode) {
            this.nextNode = nextNode;
        }

        @Override
        public String toString() {
            return "[key-" + key + ", value-" + value + "]";
        }


    }

}
