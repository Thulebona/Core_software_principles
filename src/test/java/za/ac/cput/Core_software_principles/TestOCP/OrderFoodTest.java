package za.ac.cput.Core_software_principles.TestOCP;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Core_software_principles.OCP.obeysOCP.OrderFood;
import za.ac.cput.Core_software_principles.OCP.obeysOCP.OrderFoodImpl2;
import za.ac.cput.Core_software_principles.config.AppConfig;

/**
 * Created by student on 2015/02/27.
 */
public class OrderFoodTest {

    private OrderFood of;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        of = (OrderFood)ctx.getBean("order");
    }

    @Test
    public void testOrder() throws Exception {
        Assert.assertEquals("Card",((OrderFoodImpl2) of).payCard());

    }
}
