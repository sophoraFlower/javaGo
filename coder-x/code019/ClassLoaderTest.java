package code019;

import java.net.URL;

public class ClassLoaderTest {

    public static void main(String[] args) {
        // 正在使用的类加载器
        ClassLoader c = One.class.getClassLoader();
        // 平台类加载器：PlatformClassLoader
        ClassLoader c1 = c.getParent();
        // Bootstrap：C++实现，返回null
        ClassLoader c2 = c1.getParent();

        System.out.println(c);  // sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println(c1);  // sun.misc.Launcher$ExtClassLoader@29453f44
        System.out.println(c2);  // null

        /**
         * file:/Library/Java/JavaVirtualMachines/jdk1.8.0_281.jdk/Contents/Home/jre/lib/resources.jar
         * file:/Library/Java/JavaVirtualMachines/jdk1.8.0_281.jdk/Contents/Home/jre/lib/rt.jar
         * file:/Library/Java/JavaVirtualMachines/jdk1.8.0_281.jdk/Contents/Home/jre/lib/sunrsasign.jar
         * file:/Library/Java/JavaVirtualMachines/jdk1.8.0_281.jdk/Contents/Home/jre/lib/jsse.jar
         * file:/Library/Java/JavaVirtualMachines/jdk1.8.0_281.jdk/Contents/Home/jre/lib/jce.jar
         * file:/Library/Java/JavaVirtualMachines/jdk1.8.0_281.jdk/Contents/Home/jre/lib/charsets.jar
         * file:/Library/Java/JavaVirtualMachines/jdk1.8.0_281.jdk/Contents/Home/jre/lib/jfr.jar
         * file:/Library/Java/JavaVirtualMachines/jdk1.8.0_281.jdk/Contents/Home/jre/classes
         */
        // 查看Bootstrap所有已经加载的类库
        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for (java.net.URL url : urls) {
            System.out.println(url.toExternalForm());
        }
    }

}

