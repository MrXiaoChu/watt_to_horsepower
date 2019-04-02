/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watt_to_horsepower;

import java.math.BigDecimal;

public class ConvertFormula {

    public ConvertFormula() {

    }

    public BigDecimal Metricwatt_to_horsepower(double watt) {
        BigDecimal solution = new BigDecimal(0.0);
        final double EACH_horsepower = 735.49875;
        solution = BigDecimal.valueOf(watt / EACH_horsepower);

        return solution;
    }
}
