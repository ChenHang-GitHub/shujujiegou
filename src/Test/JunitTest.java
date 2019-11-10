package Test;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class JunitTest {

    @Test
    public void  test(){
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("FuntionalInterface",1);
        objectObjectHashMap.put("FuntionalInterface",2);
        objectObjectHashMap.put(null,3);      //只能一个null   第二个覆盖
        objectObjectHashMap.put(null,4);
        Assert.assertEquals(objectObjectHashMap.get(null),4);

    }
}
