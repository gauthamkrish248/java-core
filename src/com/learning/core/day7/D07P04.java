package com.learning.core.day07;

import java.util.Scanner;
import java.util.Stack;

public class D07P04 {
    public static int evaluateExpression(String expression) {
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isDigit(c)) {
                int num = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    num = num * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                i--;
                operands.push(num);
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!operators.isEmpty() && precedence(c) <= precedence(operators.peek())) {
                    int operand2 = operands.pop();
                    int operand1 = operands.pop();
                    char operator = operators.pop();
                    operands.push(applyOperation(operand1, operand2, operator));
                }
                operators.push(c);
            }
        }

        while (!operators.isEmpty()) {
            int operand2 = operands.pop();
            int operand1 = operands.pop();
            char operator = operators.pop();
            operands.push(applyOperation(operand1, operand2, operator));
        }

        return operands.pop();
    }

    public static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }

    public static int applyOperation(int operand1, int operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero!");
                }
                return operand1 / operand2;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an expression to evaluate: ");
        String expression = scanner.nextLine();

        expression = expression.replaceAll("(?<=[\\+\\-\\*\\/])|(?=[\\+\\-\\*\\/])", " ");

        int result = evaluateExpression(expression);
        System.out.println("Output: " + result);

        scanner.close();
    }
}
