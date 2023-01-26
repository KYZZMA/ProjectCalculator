public class RomanNumber {
    public static void main(String[] args) {
        String s = "MMMXLV";
        romanToInt(s);
    }

    public static int romanToInt(String s) {
        int result = 0;
        String aa = s;
        aa = aa.replace("CM", "J");
        String ab = aa.replace("IV", "O");

        String ac = ab.replace("IX", "U");

        String at = ac.replace("XL", "S");

        String av = at.replace("XC", "P");

        String ai = av.replace("CD", "E");
        System.out.println(ai);
        String[] vvod = ai.split("");
        for (int i = 0; i < vvod.length; i++) {
            switch (vvod[i]) {
                case "I":
                    result = result + 1;
                    break;
                case "V":
                    result = result + 5;
                    break;
                case "X":
                    result = result + 10;
                    break;
                case "L":
                    result = result + 50;
                    break;
                case "C":
                    result = result + 100;
                    break;
                case "D":
                    result = result + 500;
                    break;
                case "M":
                    result = result + 1000;
                    break;
                case "O":
                    result = result + 4;
                    break;
                case "U":
                    result = result + 9;
                    break;
                case "S":
                    result = result + 40;
                    break;
                case "P":
                    result = result + 90;
                    break;
                case "E":
                    result = result + 400;
                    break;
                case "J":
                    result = result + 900;
                    break;
            }


        }
        System.out.println(result);
        return result;
    }
}
