package me.barsopia.ami.algo;

import me.barsopia.ami.dataStructure.implementations.StackImpl;

public class StackAlgo2 extends StackImpl<Character> {
    public boolean isBalanced(String input) {
        boolean b = true;
        char[] inputChar = input.toCharArray();
        for (char c : inputChar) {
            switch (c) {
                case '(':
                case '[':
                case '{':
                    super.push(c);
                    break;
                case ')':
                    b = popAndCompare('(');
                    break;
                case '}':
                    b = popAndCompare('{');
                    break;
                case ']':
                    b = popAndCompare('[');
                    break;
            }
            if (!b) {
                return false;
            }
        }
        return super.getSizeOfStack() == 0;
    }

    private boolean popAndCompare(char comparing) {
        return super.pop() == comparing;
    }
}
