package JVM;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @ClassName: HeapOOM
 * @author: csh
 * @date: 2019/12/13  15:32
 * @Description:
 */
public class HeapOOM {

    static  class  OOMObject{

    }


    /**
     * Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
     * 	at java.util.Arrays.copyOf(Arrays.java:3210)
     * 	at java.util.Arrays.copyOf(Arrays.java:3181)
     * 	at java.util.ArrayList.grow(ArrayList.java:261)
     * 	at java.util.ArrayList.ensureExplicitCapacity(ArrayList.java:235)
     * 	at java.util.ArrayList.ensureCapacityInternal(ArrayList.java:227)
     * 	at java.util.ArrayList.add(ArrayList.java:458)
     * 	at JVM.HeapOOM.main(HeapOOM.java:22)
     *
     */
    public static void main(String[] args) {
        ArrayList<OOMObject> oomObjects = new ArrayList<>();
        while (true)
        {
            oomObjects.add(new OOMObject());
        }


            }
}
