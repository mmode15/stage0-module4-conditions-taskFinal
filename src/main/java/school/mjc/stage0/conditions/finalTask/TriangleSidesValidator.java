package school.mjc.stage0.conditions.finalTask;

import javax.swing.*;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        String result = firstSide + secondSide > thirdSide && firstSide + thirdSide > secondSide
                && secondSide + thirdSide > thirdSide ? "this is a valid triangle" : "it's not a triangle";
        System.out.println(result);
    }
}
