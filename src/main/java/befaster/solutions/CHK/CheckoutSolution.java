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
            } else if (sku == 'B') {
                numB++;
            } else if (sku == 'C') {
                numC++;
            } else if (sku == 'D') {
                numD++;
            } else {
                return -1;
            }
        }

        Integer sum = 0;
        sum += 130 * (numA/3);
        sum += (numA % 3) * 50;

        sum += 45 * (numB/2);
        sum += (numB % 2) * 30;

        sum += 20 * numC;
        sum += 15 * numD;

        return sum;
    }
    public Integer checkout(String skus) {
        return checkout1(skus);
    }
}




