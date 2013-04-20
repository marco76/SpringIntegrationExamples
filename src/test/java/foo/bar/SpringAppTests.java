package foo.bar;

import ch.javaee.integration.example.helloWorld.HelloService;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class SpringAppTests {

    @Autowired
    private HelloService helloService;

    /**
     * We simply test that the helloService.sayHello method works correctly
     * We are not testing the channels
     */
    @Test
    public void testSayHello() {
        Assert.assertEquals("Hello test!", helloService.sayHello("test"));
    }
}
