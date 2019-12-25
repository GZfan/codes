import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Leetcode208
 * @Description
 * @Author GZfan
 * @Date 2019/12/25
 */
class Trie {

    private Node root;

    /**
     * Initialize your data structure here.
     */
    public Trie() {
        root = new Node();
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        char[] ch = word.toCharArray();
        Node node = root;
        for (char character : ch) {
            if (node.next.containsKey(character)) {
                node = node.next.get(character);
            } else {
                node.next.put(character, new Node());
                node = node.next.get(character);
            }
        }
        node.isEnd = true;
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        char[] ch = word.toCharArray();
        Node node = root;
        for (char character : ch) {
            if (node.next.containsKey(character)) {
                node = node.next.get(character);
            } else {
                return false;
            }
        }
        return node.isEnd;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        char[] ch = prefix.toCharArray();
        Node node = root;
        for (char character : ch) {
            if (node.next.containsKey(character)) {
                node = node.next.get(character);
            } else {
                return false;
            }
        }
        return true;
    }

    class Node {
        boolean isEnd;
        Map<Character, Node> next = new HashMap<>(26);
    }
}
