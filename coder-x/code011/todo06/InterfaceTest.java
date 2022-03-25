package code011.todo06;

public class InterfaceTest {

    static class InterfaceImpl implements Inter {

        // 重写抽象方法
        @Override
        public void show() {
            System.out.println("类实现的接口定义方法");
        }

        // 可重写默认方法
        @Override
        public void defaultShow() {
            Inter.super.defaultShow();
        }
    }

    public static void main(String[] args) {
        InterfaceImpl interfaceImpl = new InterfaceImpl();
        interfaceImpl.show();
        interfaceImpl.defaultShow();
        Inter.staticShow();
    }

}
