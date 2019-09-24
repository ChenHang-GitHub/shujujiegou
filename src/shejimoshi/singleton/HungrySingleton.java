package shejimoshi.singleton;
/**
 * 单例：饿汉式
 * @author csh
 */
public class HungrySingleton {
    //在类加载的时候立即初始化，创建单例对象
    //优点：没有加任何的锁，执行效率比较高
    //用户体验比懒汉式会好一点
    //缺点：类加载的时候就初始化，用或者不用都会在占空间
    //浪费内存
    //绝对线程安全，在县城出现之前就已经实例化了，不存在访问安全问题


   private HungrySingleton() {}
   private static  HungrySingleton  instance = new HungrySingleton();
   public  static  HungrySingleton getInstance()
   {
       return instance;
   }

}

//
class LazySingleton {
    //使用时候生成。
    private static LazySingleton instance = null;

    private LazySingleton() {
    }

    public static  synchronized LazySingleton  getLayS(){
//使用时生成实例，提高了效率！
        if(instance==null)
        {
            instance=new LazySingleton();
        }
        return instance;
    }



}