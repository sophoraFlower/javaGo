package code012.todo03.exception;

public class ImplIntfWithEx implements IntfWithEx {
    @Override
    public void danger() throws Exception {
        // 接口中声明了抛出异常，实现类中可以抛，也可以不抛。抛的话必须是接口声明的类或其子类
        throw new Exception("@@@@@");
    }

    @Override
    public void safe() {
        // 接口中没有声明抛出异常，实现类中可以抛RuntimeException，也可以不抛。
        // 如果抛 checked exception，就会出错
        // 可以选择catch住 checked exception，然后将它封在RuntimeException里
        // throw new Exception();
        throw new RuntimeException();
    }
}
