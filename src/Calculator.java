import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        while (true) {
            System.out.println("введите выражение");
            Scanner name = new Scanner(System.in);
            String input = name.nextLine();
            if (input.equals("end"))
                break;
            input = input.replace(" ", "");

            System.out.println(calc(input));

        }

    }

    public static String calc(String name) {
        String[] one = new String[3];
        String result = null;
        String action = null;

        if (name.contains("+")) {
            one = name.split("\\+");
            action = "+";
        } else if (name.contains("-")) {
            one = name.split("-");
            action = "-";
        } else if (name.contains("/")) {
            one = name.split("/");
            action = "/";
        } else if (name.contains("*")) {
            one = name.split("\\*");
            action = "*";
        }


        int num1 = Integer.parseInt(one[0]);
        int num2 = Integer.parseInt(one[1]);


        switch (action) {
            case "+":
                result = (num1 + num2) + "";
                break;


            case "-":
                result = (num1 - num2) + "";
                break;


            case "/":
                result = (num1 / num2) + "";

                break;

            case "*":
                result = (num1 * num2) + "";
                break;

        }
        return result;

    }

}
