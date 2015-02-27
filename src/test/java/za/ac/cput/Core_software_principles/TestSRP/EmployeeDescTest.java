package za.ac.cput.Core_software_principles.TestSRP;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Core_software_principles.config.AppConfig;
import za.ac.cput.Core_software_principles.SRP.obeysSRP.EmployeeDesc;

/**
 * Created by student on 2015/02/27.
 */
public class EmployeeDescTest {

    private EmployeeDesc empDsc;
    private ApplicationContext ctx;
    private String desc = "Name: Thulebona \nSurname: Hadebe \nPosition: CEO";


    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        empDsc =(EmployeeDesc)ctx.getBean("empDesc");

    }

    @Test
    public void testEmpDesc() throws Exception {
        Assert.assertSame(desc,empDsc.empDescription());

    }
}
