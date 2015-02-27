package za.ac.cput.Core_software_principles.OCP.violetOCP;

/**
 * Created by student on 2015/02/27.
 */
public class OrderFoodImpl_v implements OrderFood_v {
    @Override
    public String getOrder() {
        return "Fish and chips";
    }

    @Override
    public String payOption(int opt) {
        String msg="";
        if(opt==1)
            msg = "Cash";
           else
             msg ="Card";
        return msg;
    }


}
