package za.ac.cput.Core_software_principles.SRP.obeysSRP;

/**
 * Created by student on 2015/02/27.
 */
public class EmployeeSalImpl implements EmployeeSal {

    @Override
    public int hoursWorked() {
        return 160;
    }

    @Override
    public double salary() {
        return hoursWorked()*120;
    }
}
