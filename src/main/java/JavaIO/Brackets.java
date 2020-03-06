package JavaIO;

import java.util.InputMismatchException;

public class Brackets {
    public int calc(String origin) {char[] chars = origin.toCharArray();
        int maxDepth = 0;
        int balance = 0;
        for (char c : chars) {
            boolean open = c == '(';
            if (!open) {
                if (balance > 0) {
                    balance--;
                } else {
                    throw new InputMismatchException("Wrong brackets order");
                }
            } else {
                balance++;
                if (balance > maxDepth) {
                    maxDepth = balance;
                }
            }

        }
        if(balance!=0) throw new InputMismatchException("Wrong brackets order");
        return maxDepth;
//    throw new RuntimeException("should be implemented");
    }

}


