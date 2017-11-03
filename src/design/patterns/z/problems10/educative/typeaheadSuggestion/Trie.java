package design.patterns.z.problems10.educative.typeaheadSuggestion;

//refer TypeAheadSuggestion For theory too


import java.util.HashMap;
import java.util.Map;

/*

 Insert/delete/search into trie data structure
 */
public class Trie {

    private class TrieNode {
        Map<Character, TrieNode> children;
        boolean endOfWord;

        public TrieNode() {
            children = new HashMap<>();
            endOfWord = false;
        }
    }

    private final TrieNode root;

    public Trie() {
        root = new TrieNode();
    }


    public void insert(String word) {

        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                node = new TrieNode();
                current.children.put(ch, node);
            }
            current = node;

        }
        //mark the current nodes endOfWord as true
        current.endOfWord = true;
    }

    /**
     * Iterative implementation of search into trie.
     */
    public boolean search(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                return false;
            }
            current = node;
        }
        //return true of current's endOfWord is true else return false.
        return current.endOfWord;
    }


    public boolean delete(String word) {
        return delete(root, word, 0);

    }

    private boolean delete(TrieNode current, String word, int index) {

        if (index == word.length()) {
            //when end of word is reached ,delete only ,if current.endOfWord is true

            if (!current.endOfWord) {
                return false;
            }
            current.endOfWord = false;
            //if current has no other mapping then return true
            return current.children.size() == 0;
        }

        char ch = word.charAt(index);
        TrieNode node = current.children.get(ch);
        if (node == null) {
            return false;
        }

        boolean shouldDeleteCurrentNode = delete(node, word, index + 1);

        //if true is returned then delete the mapping of character and
        // trie node reference from map.

        if (shouldDeleteCurrentNode) {

            current.children.remove(ch);
            //return true if no mappings are left in the map.
            return current.children.size() == 0;
        }

        return false;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("abc");
        trie.insert("abgl");
        trie.insert("cdf");
        trie.insert("abcd");
        trie.insert("lmn");

        System.out.println(trie.search("abc"));
        System.out.println(trie.search("abgl"));
        System.out.println(trie.search("abcl"));
        System.out.println(trie.search("lmn"));
        System.out.println("------------deleting------lmn-----");
        System.out.println("Search lmn :" + trie.search("lmn"));
        trie.delete("lmn");
        System.out.println("Search lmn after deleting :" + trie.search("lmn"));

        System.out.println("------------deleting------abc-----");
        System.out.println("Search abc :" + trie.search("abc"));
        trie.delete("abc");
        System.out.println("Search abc after deleting :" + trie.search("abc"));

    }
}


