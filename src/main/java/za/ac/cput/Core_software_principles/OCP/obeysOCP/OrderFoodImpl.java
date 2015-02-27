package za.ac.cput.Core_software_principles.OCP.obeysOCP;

/**
 * Created by student on 2015/02/27.
 */
public class OrderFoodImpl implements OrderFood {
    @Override
    public String getOrder() {
        return "Fish and chips";
    }

    @Override
    public String pay() {
        return "Cash";
    }
}
