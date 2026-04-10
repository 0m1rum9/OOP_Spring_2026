import java.util.*;

public class Example4 {
    public static void main(String[] args) {
        double leftOperand, result, rightOperand;
        String leftString, operator, rightString;
        StringTokenizer tokenizer;
        Scanner in = new Scanner(System.in);

        tokenizer = new StringTokenizer(in.nextLine(), "+-/*", true);

        try {
            leftString = tokenizer.nextToken();
            operator = tokenizer.nextToken();
            rightString = tokenizer.nextToken();
            try {
                leftOperand = Double.parseDouble(leftString);
            } catch (NumberFormatException nfe) {
                throw new NumberFormatException("Left operand is not a number");
            }
            try {
                rightOperand = Double.parseDouble(rightString);
            } catch (NumberFormatException nfe) {
                throw new NumberFormatException("Right operand is not a number");
            }
            if (operator.equals("+"))
                result = leftOperand + rightOperand;
            else if (operator.equals("-"))
                result = leftOperand - rightOperand;
            else if (operator.equals("*"))
                result = leftOperand * rightOperand;
            else if (operator.equals("/"))
                result = leftOperand / rightOperand;
            else
                result = 0;

            System.out.println("Result: " + result);
        } catch (NoSuchElementException nsee) {
            System.out.println("Invalid syntax");
        } catch (NumberFormatException nfe) {
            System.out.println(nfe.getMessage());
        } catch (ArithmeticException ae) {
            System.out.println("Can't divide by 0");
        }

    }
}

/*
 * StringTokenizer class is used for breaking string into tokens
 * for example -> "Hello World!" -> after tokenization process we get ["Hello",
 * "World!"]
 *
 * First parameter is a string itself, second is a delimeter and third is used
 * whether
 * to return also delimters with the strings that are tokenized by that
 * delimeter.
 * 
 * Result: 14.5
 * 
 * 
 * Invalid syntax
 * NoSuchElementException nsee
 * 
 * 
 * One or more operands is not a number
 * NumberFormatException
 */
