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
        for (int i = 0; i < let.length(); i++) {
            char sku = let.charAt(i);
            skuCount.put(sku, 0);
        }

        for (int i = 0; i < skus.length(); i++) {
            char sku = skus.charAt(i);
            if (skuCount.containsKey(sku)) {
                skuCount.put(sku, skuCount.get(sku) + 1);
            } else {
                return -1;
            }
        }

        Integer sum = 0;
        int num = 0;

        // SumA
        num = skuCount.get('A');
        sum += 200 * (num / 5);
        num %= 5;
        sum += 130 * (num / 3);
        sum += (num % 3) * 50;

        // SumE
        num = skuCount.get('E');
        sum += 40 * num;
        int numB = skuCount.get('B');
        numB -= num/2;
        if (numB < 0) {
            numB = 0;
        }
        skuCount.put('B', skuCount.get('B') + 1);

        // SumB
        num = skuCount.get('B');
        sum += 45 * (numB / 2);
        sum += (numB % 2) * 30;

        // SumC
        num = skuCount.get('C');
        sum += 20 * num;

        // SumD
        num = skuCount.get('D');
        sum += 15 * num;

        // SumF
        num = skuCount.get('F');
        sum += 20 * (num / 3);
        sum += 10 * (num % 3);

        return sum;
    }

    public Integer checkout(String skus) {
        return checkout3(skus);
    }
}




