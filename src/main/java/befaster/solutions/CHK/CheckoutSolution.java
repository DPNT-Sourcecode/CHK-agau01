package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout1(String skus) {
        int numA = 0;
        int numB = 0;
        int numC = 0;
        int numD = 0;

        for (int i = 0; i < skus.length(); i++) {
            char sku = skus.charAt(i);
            if (sku == 'A') {
                numA++;
            }

            if (sku == 'B') {
                numB++;
            }

            if (sku == 'C') {
                numC++;
            }

            if (sku == 'D') {
                numD++;
            }
        }
    }
    public Integer checkout(String skus) {
        throw new SolutionNotImplementedException();
    }
}

