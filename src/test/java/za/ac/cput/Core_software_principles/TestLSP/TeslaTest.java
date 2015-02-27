package za.ac.cput.Core_software_principles.TestLSP;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Core_software_principles.LSP.obeysLSP.Car;
import za.ac.cput.Core_software_principles.config.AppConfig;

/**
 * Created by student on 2015/02/27.
 */
public class TeslaTest {

    private Car tesla;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        tesla = (Car)ctx.getBean("tesla");
    }

    @Test
    @Ignore
    public void testTesla() throws Exception {
        Assert.assertNotEquals(1,tesla.gearUp());
    }
}

