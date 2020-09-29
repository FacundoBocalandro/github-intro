public class LinkedList<T extends Comparable<T>> implements List<T>{
    private Node<T> head;

    public LinkedList() {
        head = null;
    }

    public T get(int position){
        Node<T> nodeInPosition = getNodeInPosition(position);

        return nodeInPosition.getValue();
    }

    public T remove(int position) {
        if (position == 0){
            T elem = head.getValue();
            head = head.getNext();
            return elem;
        }

        T elem = getNodeInPosition(position).getValue();
        Node<T> prev = getNodeInPosition(position-1);
        Node<T> next = getNodeInPosition(position+1);

        prev.setNext(next);
        return elem;
    }

    private Node<T> getNodeInPosition(int position){
        Node<T> current = head;
        for (int i = 0; i < position; i++) {
            current = current.getNext();
        }
        return current;
    }

    public void add(T elem){
        add(size(), elem);
    }

    public void add(int position, T elem){
        Node<T> newNode = new Node<>(elem);

        if (position == 0){
            newNode.setNext(head);
            head = newNode;
        }else {
            Node<T> prev = getNodeInPosition(position - 1);
            Node<T> next = getNodeInPosition(position);
            prev.setNext(newNode);
            newNode.setNext(next);
        }
    }

    public int size(){
        Node<T> current = head;
        int size = 0;
        while (current != null) {
            current = current.getNext();
            size++;
        }
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }
}
