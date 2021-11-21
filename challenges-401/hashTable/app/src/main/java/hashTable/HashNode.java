package hashTable;

public class HashNode {

    String value;
    String key;
    HashNode next;

    public HashNode(String key, String value) {
        this.value = value;
        this.key = key;
    }

    public HashNode() {
    }
}
