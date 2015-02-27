package za.ac.cput.Core_software_principles.TestSRP;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Core_software_principles.config.AppConfig;
import za.ac.cput.Core_software_principles.SRP.obeysSRP.EmployeeSal;

/**
 * Created by student on 2015/02/27.
 */
public class EmployeeSalTest {

    private EmployeeSal empSal;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        empSal =(EmployeeSal)ctx.getBean("empSal");

    }

    @Test
    public void testEmplSal() throws Exception {

        Assert.assertEquals(19200.0,empSal.salary(),empSal.salary());

    }
}
