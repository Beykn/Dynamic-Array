

public class DynamicArray {
    private int[] Array;
    private int size;

        public DynamicArray(int[] arr) {
            Array = arr;
            size = arr.length;
            arr = Array;
        }
        int Increase(int a, int b) {
            //a = cap
            // b =size
            if (a > b) {
                return a;
            } else if (a==0) {
                a=a+1;
            }
            return Increase(2 * a, b);
        }

        void  InsertFirst(int insertfirts){
            int cap = 0;
            cap = Increase(cap, size);

            int[] array = new int[cap];
            for (int i = 0; i < Array.length; i++) {
                array[i] = Array[i];
            }


            //INSERT FIRST
            /*if array capacity is bigger than the size of array we do not need to double the capacity .So just shift the values end insert the first one.
             * Otherwise , we need to capacity and we double it the arrays capacity. After that we shift the values.*/
            if(cap>size){
                for(int i = size;i>0;i-- ){
                    array[i]= array[i-1];
                }
                array[0]=insertfirts;
            }
            else{
                cap = 2 * cap;
                int[] tempArray = new int[cap];
                for (int i = 0; i < size ; i++) {
                    tempArray[i] = array[i];
                }
                array = tempArray;

                for(int i = size;i>0;i-- ){
                    array[i]= array[i-1];
                }
                array[0]=10;
            }

            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]+" ");
            }
            System.out.println();
            Array = array;

        }
       void InsertLast(int insertlast){
            int size = Array.length;
            int cap = 0;
            cap = Increase(cap, size);
            int[] array = new int[cap];

            for (int i = 0; i < size; i++) {
                array[i] = Array[i];
            }


            //insert last
            /*If array capacity is bigger than the size of array we do not need to double the size.Just we insert the last element and increase the size .
             * On the other hand, if capacity small or equal the size first we need to double the capacity,after increase the size and insert the last element in (size-1)*/
            if(cap>size){
                array[size]=insertlast;
            }
            else{
                cap = 2 * cap;
                int[] tempArray = new int[cap];
                for (int i = 0; i < size ; i++) {
                    tempArray[i] = array[i];
                }
                array = tempArray;

                size++;
                array[size-1]=insertlast;
            }

            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]+" ");
            }
            System.out.println();
            Array = array;

        }

        void readIndex(int a){

            System.out.println(this.Array[a]);
        }

}
