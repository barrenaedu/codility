package codility.lessons;

import java.util.ArrayDeque;
import java.util.Deque;

public class Brackets {

    private boolean isValidPair(char cOpen, char cCLose) {
        return (cOpen == '(' && cCLose == ')') ||
                (cOpen == '[' && cCLose == ']') ||
                (cOpen == '{' && cCLose == '}');
    }

    public int solutionStack(String str) {
        int sLen = str.length();
        boolean nested = (sLen % 2 == 0);
        int i = 0;
        char currentChar, previousChar;
        Deque<Character> stack = new ArrayDeque<Character>();
        while (nested && i < sLen) {
            currentChar = str.charAt(i);
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            } else {
                nested = stack.size() > 0 && isValidPair(stack.pop(), currentChar);
            }
            i++;
        }
        return nested && stack.size() == 0 ? 1 : 0;
    }

    public int solutionSwitch(String str) {
        int sLen = str.length();
        boolean nested = (sLen % 2 == 0);
        int i = 0;
        int cPar, cBra, cCBr;
        cPar = cBra = cCBr = 0;
        char nextChar;
        while (nested && i < sLen) {
            if (i < sLen - 1) {
                nextChar = str.charAt(i + 1);
            } else {
                nextChar = Character.MIN_VALUE;
            }
            switch (str.charAt(i)) {
                case '(':
                    cPar++;
                    if (nextChar != Character.MIN_VALUE) {
                        nested = nextChar != ']' && nextChar != '}';
                    }
                    break;
                case '[':
                    cBra++;
                    if (nextChar != Character.MIN_VALUE) {
                        nested = nextChar != ')' && nextChar != '}';
                    }
                    break;
                case '{':
                    cCBr++;
                    if (nextChar != Character.MIN_VALUE) {
                        nested = nextChar != ')' && nextChar != ']';
                    }
                    break;
                case ')':
                    cPar--;
                    nested = cPar >= 0;
                    break;
                case ']':
                    cBra--;
                    nested = cBra >= 0;
                    break;
                case '}':
                    cCBr--;
                    nested = cCBr >= 0;
                    break;
            }
            i++;
        }
        nested = nested && cPar == 0 && cBra == 0 && cCBr == 0;
        return nested ? 1 : 0;
    }

}
