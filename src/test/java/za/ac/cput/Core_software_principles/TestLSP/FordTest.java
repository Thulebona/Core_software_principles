package za.ac.cput.Core_software_principles.TestLSP;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Core_software_principles.LSP.obeysLSP.Car;
import za.ac.cput.Core_software_principles.config.AppConfig;

/**
 * Created by student on 2015/02/27.
 */
public class FordTest {

    private Car ford;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ford =(Car)ctx.getBean("ford");

    }

    @Test
    public void testFord() throws Exception {

        Assert.assertEquals(1,ford.gearUp());
    }
}
