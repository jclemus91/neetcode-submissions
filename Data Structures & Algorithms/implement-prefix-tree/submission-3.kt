class PrefixTree {

    private val trie = TrieNode()

    fun insert(word: String) {
        var pointer = trie

        for (letter in word) {
            if (!pointer.children.containsKey(letter)) {
                pointer.children[letter] = TrieNode()
            }
            pointer = pointer.children[letter]!!
        }

        pointer.isEnd = true
    }

    fun search(word: String): Boolean {
        var pointer = trie

        for (letter in word) {            
            pointer = pointer.children[letter] ?: return false
        }

        return pointer.isEnd
    }

    fun startsWith(prefix: String): Boolean {
        var pointer = trie

        for (letter in prefix) {
            pointer = pointer.children[letter] ?: return false
        }

        return true
    }

    class TrieNode(
        val children: MutableMap<Char, TrieNode> = mutableMapOf(),
        var isEnd: Boolean = false
    )
}
