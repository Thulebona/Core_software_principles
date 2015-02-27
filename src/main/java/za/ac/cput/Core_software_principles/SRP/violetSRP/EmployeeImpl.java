package za.ac.cput.Core_software_principles.SRP.violetSRP;

/**
 * Created by student on 2015/02/27.
 */
public class EmployeeImpl implements Employee {
    @Override
    public int hoursWorked() {
        return 160;
    }

    @Override
    public double salary() {
        return hoursWorked()*120;
    }

    @Override
    public String empDescription() {
        return "Name: Thulebona \nSurname: Hadebe \nPosition: CEO";
    }
}
