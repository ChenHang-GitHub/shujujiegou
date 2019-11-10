package JAVA300.onJava8.interfaceTest.enlargeInterfaceByExtends;

/**
 * @ClassName: HorrorShow
 * @author: csh
 * @date: 2019/11/1  17:18
 * @Description: 使用继承扩展接口  通过继承，可以很容易在接口中增加方法声明，还可以在新接口中结合多个接口。这两种情况都可以得到新接口，如下例所示：
 */

// interfaces/HorrorShow.java
// Extending an interface with inheritance
interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

class DragonZilla implements DangerousMonster {
    @Override
    public void menace() {}

    @Override
    public void destroy() {}
}

//接口可以继承多个接口
//Vampire 中使用的语法仅适用于接口继承。通常来说，extends 只能用于单一类，但是在构建接口时可以引用多个基类接口。注意到，接口名之间用逗号分隔
interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

class VeryBadVampire implements Vampire {
    @Override
    public void menace() {}

    @Override
    public void destroy() {}

    @Override
    public void kill() {}

    @Override
    public void drinkBlood() {}
}

public class HorrorShow {
    static void u(Monster b) {
        b.menace();
    }

    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }

    static void w(Lethal l) {
        l.kill();
    }

    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla();
        u(barney);
        v(barney);
        Vampire vlad = new VeryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }
}
