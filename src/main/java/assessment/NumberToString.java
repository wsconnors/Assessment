package assessment;

public class NumberToString {
    public String convertNumber(int number){
        if (number < 20){
            return getDigit(number);
        }
        return overTwenty(number);
    }

    public String overTwenty(int number){
        int logPower = (int)Math.log10(number);
        if(logPower<3){
            return underThousand(number,logPower);
        }
        return splitNumbers(number,logPower-(logPower%3));
    }

    public String splitNumbers(int number,int cutLog){
        int firstDigitSet = (int)(number/Math.pow(10,cutLog));
        int secondDigitSet = (int)(number - (firstDigitSet*Math.pow(10,cutLog)));
        return convertNumber(firstDigitSet)+getPlaceHolder(cutLog/3)+convertNumber(secondDigitSet);
    }

    public String underThousand(int number,int logPower){
        int firstDigit = (int)(number/(Math.pow(10,logPower)));
        int digitSet = (int)(number - firstDigit*Math.pow(10,logPower));
        if(logPower == 2) {
            return getDigit(firstDigit)+ "Hundred" + convertNumber(digitSet);
        }
        return getTens(firstDigit) + getDigit(digitSet);
    }

    public String getPlaceHolder(int logPower){
        String[] options = {"Thousand","Million","Billion","Trillion"};
        return options[logPower-1];
    }

    public String getTens(int digit){
        String[] options = {"Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        return options[digit-2];
    }

    public String getDigit(int digit){
        String[] options = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        return options[digit];
    }
}

