package za.ac.cput.Core_software_principles.LSP.obeysLSP;

/**
 * Created by student on 2015/02/27.
 */
public class CarFordImpl implements Car {

    int gear=0;
    @Override
    public String carName() {
        return "Ford";
    }

    @Override
    public int gearUp() {
        return ++gear ;
    }
}
