public class Main {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();


        heap.insert(44);
        heap.insert(33);
        heap.insert(77);
        heap.insert(11);
        heap.insert(55);
        heap.insert(88);
        heap.insert(66);


        System.out.println(heap.peek());
        System.out.println(heap.heapSort());

    }
}
