  public LinkedListNode kthToLastNode(int k, LinkedListNode head) {

    LinkedListNode leftNode  = head;
    LinkedListNode rightNode = head;

    // move rightNode to the kth node
    for (int x = 0; x < k - 1; x++) {
        rightNode = rightNode.next;
    }

    // starting with leftNode on the head,
    // move leftNode and rightNode down the list,
    // maintaining a distance of k between them,
    // until rightNode hits the end of the list
    while (rightNode.next != null) {
        leftNode  = leftNode.next;
        rightNode = rightNode.next;
    }

    // since leftNode is k nodes behind rightNode,
    // leftNode is now the kth to last node!
    return leftNode;
}