//package shejimoshi.proxy.CGLibProxy;
//
//import net.sf.cglib.proxy.Enhancer;
//import net.sf.cglib.proxy.MethodInterceptor;
//import net.sf.cglib.proxy.MethodProxy;
//
//import java.lang.reflect.Method;
//
//public class1 CglibProxy implements MethodInterceptor {
//    private Object target;
//    public Object getInstance(final Object target) {
//        this.target = target;
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(this.target.getClass());
//        enhancer.setCallback(this);
//        return enhancer.create();
//    }
//
//    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
//        System.out.println("买房前准备");
//        Object result = methodProxy.invoke(object, args);
//        System.out.println("买房后装修");
//        return result;
//    }
//}