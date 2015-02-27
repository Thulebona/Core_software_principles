package za.ac.cput.Core_software_principles.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.Core_software_principles.LSP.obeysLSP.Car;
import za.ac.cput.Core_software_principles.LSP.obeysLSP.CarFordImpl;
import za.ac.cput.Core_software_principles.LSP.violetLSP.CarTeslaImpl;
import za.ac.cput.Core_software_principles.OCP.obeysOCP.OrderFood;
import za.ac.cput.Core_software_principles.OCP.obeysOCP.OrderFoodImpl2;
import za.ac.cput.Core_software_principles.OCP.violetOCP.OrderFoodImpl_v;
import za.ac.cput.Core_software_principles.OCP.violetOCP.OrderFood_v;
import za.ac.cput.Core_software_principles.SRP.obeysSRP.EmployeeDesc;
import za.ac.cput.Core_software_principles.SRP.obeysSRP.EmployeeDescImpl;
import za.ac.cput.Core_software_principles.SRP.obeysSRP.EmployeeSal;
import za.ac.cput.Core_software_principles.SRP.obeysSRP.EmployeeSalImpl;
import za.ac.cput.Core_software_principles.SRP.violetSRP.Employee;
import za.ac.cput.Core_software_principles.SRP.violetSRP.EmployeeImpl;

/**
 * Created by student on 2015/02/26.
 */
@Configuration
public class AppConfig {
/*********************************************
                    SRP
 *********************************************/

    @Bean(name ="emp")
    public Employee getEmp(){ return new EmployeeImpl();}

    @Bean(name ="empSal")
    public EmployeeSal getEmpSal(){ return new EmployeeSalImpl();}

    @Bean(name ="empDesc")
    public EmployeeDesc getEmpDesc(){ return new EmployeeDescImpl();}
 /*********************************************
                    OCP
 *********************************************/

    @Bean(name ="order_v")
    public OrderFood_v getV_Order(){ return new OrderFoodImpl_v();}
    @Bean(name ="order")
    public OrderFood getOrder(){ return new OrderFoodImpl2(); }
 /*********************************************
                    LSP
 *********************************************/
    @Bean(name="ford")
    public Car getFord(){ return new CarFordImpl();}
    @Bean(name="tesla")
    public Car getTesla(){ return new CarTeslaImpl();}

}
