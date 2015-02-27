package za.ac.cput.Core_software_principles.LSP.violetLSP;

import za.ac.cput.Core_software_principles.LSP.obeysLSP.Car;

/**
 * Created by student on 2015/02/27.
 */
public class CarTeslaImpl implements Car {

    int gear=0;
    @Override
    public String carName() {
        return "Tesla";
    }

    @Override
    public int gearUp() {
       throw new UnsupportedOperationException() ;
    }
}
