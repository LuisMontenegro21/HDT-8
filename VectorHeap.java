/**
 * 
 */
public class VectorHeap<E extends Comparable<E>> implements PriorityQueue<E> {

    protected VectorHeap<E> data;

    public VectorHeap(){
        data  = new VectorHeap<E>();
    }

    public VectorHeap(VectorHeap<E> vector){
        data = new VectorHeap<E>(vector.size());
        for(int i = 0; i < vector.size(); i++){
            add(vector.get(i));
        }
    }


    public E getFirst(){
        return null;
    }

    public E remove(){
        return null;
    }

    public void add(){

    }

    public boolean isEmpty(){
        return false;
    }

    public int size(){
        return 0;
    }

    public void clear(){

    }
}
