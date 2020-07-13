package collections.my_lists.linkedlist;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Node<T> {
    private Node<T> previous;
    private T element;
    private Node<T> next;
}
