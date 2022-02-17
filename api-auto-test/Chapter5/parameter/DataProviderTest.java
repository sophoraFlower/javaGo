package Chapter5.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age){
        System.out.println("name = " + name + " age = " + age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsan", 10},
                {"lisi", 20},
                {"wangwu", 30},
                {"zhaoliu", 40}
        };
        return o;
    }

    @Test(dataProvider = "methodData")
    public void test01(String name, int age){
        System.out.println("test01方法 name = " + name + "; age = " + age);
    }

    @Test(dataProvider = "methodData")
    public void test02(String name, int age){
        System.out.println("test02方法 name = " + name + "; age = " + age);
    }

    @Test(dataProvider = "methodData")
    public void test03(String name, int age){
        System.out.println("test03方法 name = " + name + "; age = " + age);
    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result = null;
        if(method.getName().equals("test01")){
            result = new Object[][]{
                    {"zhangsan", 18},
                    {"lisi", 20},
            };
        }else if(method.getName().equals("test02")){
            result = new Object[][]{
                    {"wangwu", 30},
                    {"zhaoliu", 32}
            };
        }else if(method.getName().equals("test03")){
            result = new Object[][]{
                    {"maqi", 66},
                    {"yangba", 88}
            };
        }
        return result;
    }

}
