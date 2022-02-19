package Chapter6.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethodsDemo {

    @Test
    public void test01(){
        Assert.assertEquals(1, 2);
    }

    @Test
    public void test02(){
        Assert.assertEquals(1, 1);
    }

    @Test
    public void test03(){
        Assert.assertEquals(1, 0);
    }

    public void logDemo(){
        Reporter.log("这是手动写的日志");
        throw new RuntimeException("这是主动抛出的异常");
    }

}
