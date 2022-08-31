package white.problems.utils;

public class Heap {
    public int[] generateRandomArray(int maxSize, int maxNum) {
        int[] arr = new int[(int) ((maxSize+1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*(maxNum+1)) - (int)(Math.random()*maxNum);
        }
        return arr;
    }
    public int parent(int i ){
        return i/2;
    }
    public int left(int i ){
        return 2*i+1;
    }
    public int right(int i ){
        return 2*i+2;
    }
    public void maxHeapify(int[] a ,int i,int length){
        int largest = i;
        int l = left(i);
        int r = right(i);
        if ((l<length)&&(a[l]>a[i])){
            largest=l;
        }
        if ((r< length)&&a[r]>a[largest]){
            largest=r;
        }
        if (largest!=i){
            int temp ;
            temp = a[i];
            a[i] = a [largest];
            a[largest] = temp;
            maxHeapify(a,largest,length);
        }
    }

    public int[] buildMaxHeap(int[] a){
        for (int i = (a.length/2)-1; i >=0 ; i--) {
            maxHeapify(a,i,a.length);
        }
        return  a;
    }

    public int[] heapSort(int[] a){
        int length = a.length;
        buildMaxHeap(a);
        for (int i = a.length-1; i >0 ; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] =temp;
            length--;
            maxHeapify(a,0,length);
        }
        return a;
    }


}
