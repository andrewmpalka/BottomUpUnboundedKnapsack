  public LinkedListNode reverse(LinkedListNode headOfList) {
    LinkedListNode current = headOfList;
    LinkedListNode previous = null;
    LinkedListNode nextNode = null;

    // until we have 'fallen off' the end of the list
    while (current != null) {

        // copy a pointer to the next element
        // before we overwrite current.next
        nextNode = current.next;

        // reverse the 'next' pointer
        current.next = previous;

        // step forward in the list
        previous = current;
        current = nextNode;
    }

    return previous;