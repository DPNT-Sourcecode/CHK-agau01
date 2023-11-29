package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

import java.util.HashMap;
import java.util.Map;

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

    public Integer checkout2(String skus) {
        int numA = 0;
        int numB = 0;
        int numC = 0;
        int numD = 0;
        int numE = 0;

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
            } else if (sku == 'E') {
                numE++;
            } else {
                return -1;
            }
        }

        Integer sum = 0;

        // SumA
        sum += 200 * (numA/5);
        numA %= 5;
        sum += 130 * (numA/3);
        sum += (numA % 3) * 50;

        // SumE
        sum += 40 * numE;
        numB -= numE/2;
        if (numB < 0) {
            numB = 0;
        }

        // SumB
        sum += 45 * (numB/2);
        sum += (numB % 2) * 30;

        // SumC
        sum += 20 * numC;

        // SumD
        sum += 15 * numD;

        return sum;
    }

    public Integer checkout3(String skus) {
        String let = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Map<Character, Integer> skuCount = new HashMap<>();
        for (Character)

        for (int i = 0; i < skus.length(); i++) {
            char sku = skus.charAt(i);

        }

        Integer sum = 0;

        // SumA
        sum += 200 * (numA / 5);
        numA %= 5;
        sum += 130 * (numA / 3);
        sum += (numA % 3) * 50;

        // SumE
        sum += 40 * numE;
        numB -= numE / 2;
        if (numB < 0) {
            numB = 0;
        }

        // SumB
        sum += 45 * (numB / 2);
        sum += (numB % 2) * 30;

        // SumC
        sum += 20 * numC;

        // SumD
        sum += 15 * numD;

        // SumF
        sum += 20 * (numF / 3);
        sum += 10 * (numF % 3);

        return sum;
    }

    public Integer checkout(String skus) {
        return checkout3(skus);
    }
}



