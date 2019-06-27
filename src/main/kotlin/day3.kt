import java.util.*

/*
This problem was asked by Google.

Given the root to a binary tree, implement serialize(root), which serializes the tree into a string, and deserialize(s), which deserializes the string back into the tree.

For example, given the following Node class

class Node:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

The following test should pass:

node = Node('root', Node('left', Node('left.left')), Node('right'))
assert deserialize(serialize(node)).left.left.val == 'left.left'

 */

val DELIMITER = "|"

data class Node(val value: String, val left: Node? = null, val right: Node? = null)

fun serialize(node: Node?): String =
    if (node != null )
        "${node.value}$DELIMITER${serialize(node.left)}$DELIMITER${serialize(node.right)}$DELIMITER"
    else "null"

fun deserialize(s: String): Node? {
    val queue = ArrayDeque(s.split(DELIMITER))
    queue.removeIf { it.isEmpty() }

    return deserialize(queue)
}

fun deserialize(queue: ArrayDeque<String>): Node? {
    val pop = queue.pop()
    if (pop != "null") {
        return Node(pop, deserialize(queue), deserialize(queue))
    }
    return null
}
