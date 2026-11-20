class WordDictionary {

    private val trie = TrieNode()

    fun addWord(word: String) {
        var aux = trie

        for (letter in word) {
            if (aux.children.containsKey(letter).not()) {
                aux.children[letter] = TrieNode()
            }

            aux = aux.children[letter] ?: return
        }

        aux.isWord = true
    }

    fun search(word: String): Boolean {
        return dfs(0, trie, word)
    }

    private fun dfs(index: Int, trie: TrieNode, word: String): Boolean {
        var aux = trie

        for (i in index until word.length) {
            val letter = word[i]

            if (letter == '.') {
                for (currentTrie in aux.children.values) {
                    if (dfs(i + 1, currentTrie, word)) return true
                }
                return false
            } else {
                aux = aux.children[letter] ?: return false
            }
        }

        return aux.isWord
    }

    class TrieNode(
        val children: MutableMap<Char, TrieNode> = mutableMapOf(),
        var isWord: Boolean = false
    )
}
