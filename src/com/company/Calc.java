package com.company;


public class Calc {

    public String calc(String rawValue1, String rawValue2, char operation) {
        String result = "";
        Input input = new Input();
        Convert value = new Convert();
        switch (operation) {
            case '+':
                int intResult = value.convert(rawValue1) + value.convert(rawValue2);
                //System.out.println("int result: "+intResult);

                result = value.reverseConvert(intResult, value.getType(rawValue1));

                result = result + "(" + value.getType(rawValue1) + ")";
                System.out.println(rawValue1 + "+" + rawValue2 + "=" + result);

                break;
            case '-':
                int intResult1 = value.convert(rawValue1) - value.convert(rawValue2);
                //System.out.println("int result: "+intResult1);

                result = value.reverseConvert(intResult1, value.getType(rawValue1));

                result = result + "(" + value.getType(rawValue1) + ")";
                System.out.println(rawValue1 + "-" + rawValue2 + "=" + result);

                break;
            case '*':
                int intResult2 = value.convert(rawValue1) * value.convert(rawValue2);
                //System.out.println("int result: "+intResult2);

                result = value.reverseConvert(intResult2, value.getType(rawValue1));

                result = result + "(" + value.getType(rawValue1) + ")";
                System.out.println(rawValue1 + "*" + rawValue2 + "=" + result);

                break;
            case '/':
                double intResult3 = (double) value.convert(rawValue1) / (double) value.convert(rawValue2);
                System.out.println("Division result for type numbers double: " + intResult3);

                result = value.reverseConvert((int) intResult3, value.getType(rawValue1));

                result = result + "(" + value.getType(rawValue1) + ")";
                System.out.println(rawValue1 + "/" + rawValue2 + "=" + result);


                break;
            default:
                System.out.println("The operation is not recognized. Repeat entry.");
                result = calc(rawValue1, rawValue2, input.getOperation());
        }
        return result;
    }


}





