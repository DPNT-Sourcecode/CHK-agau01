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
        {
            int numB = skuCount.get('B');
            numB -= num / 2;
            if (numB < 0) {
                numB = 0;
            }
            skuCount.put('B', numB);
        }

        // SumB
        num = skuCount.get('B');
        sum += 45 * (num / 2);
        sum += (num % 2) * 30;

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

        // SumG
        num = skuCount.get('G');
        sum += 20 * num;

        // SumH
        num = skuCount.get('H');
        sum += 80 * (num / 10);
        num %= 10;
        sum += 45 * (num / 5);
        sum += (num % 5) * 10;

        // SumI
        num = skuCount.get('I');
        sum += 35 * num;

        // SumI
        num = skuCount.get('J');
        sum += 60 * num;

        // SumK
        num = skuCount.get('K');
        sum += 150 * (num / 2);
        sum += (num % 2) * 80;

        // SumL
        num = skuCount.get('L');
        sum += 90 * num;

        // SumN
        num = skuCount.get('N');
        sum += num * 40;
        {
            int numM = skuCount.get('M');
            numM -= num / 3;
            if (numM < 0) {
                numM = 0;
            }

            skuCount.put('M', numM);
        }

        // SumM
        num = skuCount.get('M');
        sum += 15 * num;


        // SumO
        num = skuCount.get('O');
        sum += 10 * num;

        // SumP
        num = skuCount.get('P');
        sum += 200 * (num / 5);
        sum += 50 * (num % 5);

        // SumR
        num = skuCount.get('R');
        sum += num * 50;
        {
            int numQ = skuCount.get('Q');
            numQ -= num / 3;
            if (numQ < 0) {
                numQ = 0;
            }

            skuCount.put('Q', numQ);
        }

        // SumQ
        num = skuCount.get('Q');
        sum += 80 * (num / 3);
        sum += 30 * (num % 3);

        // SumS
        num = skuCount.get('S');
        sum += 30 * num;

        // SumT
        num = skuCount.get('T');
        sum += 20 * num;

        // SumU
        num = skuCount.get('U');
        sum += 120 * (num / 4);
        sum += 40 * (num % 4);

        // SumV
        num = skuCount.get('V');
        sum += 130 * (num / 3);
        num %= 3;
        sum += 90 * (num / 2);
        sum += (num % 2) * 50;

        // SumW
        num = skuCount.get('W');
        sum += num * 20;

        // SumX
        num = skuCount.get('X');
        sum += num * 90;

        // SumY
        num = skuCount.get('Y');
        sum += num * 10;

        // SumZ
        num = skuCount.get('Z');
        sum += num * 50;

        return sum;
    }

    public Integer checkout4(String skus) {
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
        {
            int numB = skuCount.get('B');
            numB -= num / 2;
            if (numB < 0) {
                numB = 0;
            }
            skuCount.put('B', numB);
        }

        // SumB
        num = skuCount.get('B');
        sum += 45 * (num / 2);
        sum += (num % 2) * 30;

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

        // SumG
        num = skuCount.get('G');
        sum += 20 * num;

        // SumH
        num = skuCount.get('H');
        sum += 80 * (num / 10);
        num %= 10;
        sum += 45 * (num / 5);
        sum += (num % 5) * 10;

        // SumI
        num = skuCount.get('I');
        sum += 35 * num;

        // SumI
        num = skuCount.get('J');
        sum += 60 * num;

        // SumK
        num = skuCount.get('K');
        sum += 120 * (num / 2);
        sum += (num % 2) * 70;

        // SumL
        num = skuCount.get('L');
        sum += 90 * num;

        // SumN
        num = skuCount.get('N');
        sum += num * 40;
        {
            int numM = skuCount.get('M');
            numM -= num / 3;
            if (numM < 0) {
                numM = 0;
            }

            skuCount.put('M', numM);
        }

        // SumM
        num = skuCount.get('M');
        sum += 15 * num;


        // SumO
        num = skuCount.get('O');
        sum += 10 * num;

        // SumP
        num = skuCount.get('P');
        sum += 200 * (num / 5);
        sum += 50 * (num % 5);

        // SumR
        num = skuCount.get('R');
        sum += num * 50;
        {
            int numQ = skuCount.get('Q');
            numQ -= num / 3;
            if (numQ < 0) {
                numQ = 0;
            }

            skuCount.put('Q', numQ);
        }

        // SumQ
        num = skuCount.get('Q');
        sum += 80 * (num / 3);
        sum += 30 * (num % 3);

        // SumU
        num = skuCount.get('U');
        sum += 120 * (num / 4);
        sum += 40 * (num % 4);

        // SumV
        num = skuCount.get('V');
        sum += 130 * (num / 3);
        num %= 3;
        sum += 90 * (num / 2);
        sum += (num % 2) * 50;

        // SumW
        num = skuCount.get('W');
        sum += num * 20;

        Integer numAll = 0;
        // SumS
        num = skuCount.get('S');
        numAll += num;

        // SumT
        num = skuCount.get('T');
        numAll += num;

        // SumX
        num = skuCount.get('X');
        numAll += num;

        // SumY
        num = skuCount.get('Y');
        numAll += num;

        // SumZ
        num = skuCount.get('Z');
        numAll += num;

        sum += 45 * (numAll / 3);

        numAll %= 3;

        String restLen = "XSTZY";
        int[] costs = {17, 20, 20, 20, 21};

        for (int i = 0; i < restLen.length(); i++) {
            sum += restSum(skuCount, restLen.charAt(i), numAll, costs[i]);
            if (numAll == 0) {
                return sum;
            }
        }

        return sum;
    }

    private Integer restSum (Map<Character, Integer> skuCount, Character c, Integer num, int cost) {
        if (skuCount.get(c) >= num) {
            return num * cost;
        } else {
            num -= skuCount.get(c);
            return num * skuCount.get(c);
        }
    }

    public Integer checkout(String skus) {
        return checkout4(skus);
    }
}
