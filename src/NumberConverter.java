public class NumberConverter {
    int[] digits;
    int base;
    char[] numsAndLettersForConv = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '+', '/'};;

    public NumberConverter(int number, int base) {
        String numberAsString = Integer.toString(number);
        digits = new int[numberAsString.length()];
        for (int i = 0; i < numberAsString.length(); i++) {
            String single = numberAsString.substring(i, i + 1);
            int d = Integer.parseInt(single);
            digits[i] = d;
        }
        this.base = base;
    }

    public String displayOriginalNumber() {
        String o = "";
        for (int i = 0; i < digits.length; i++) {
            o = o + digits[i];
        }
        o = o + "\n";
        return o;
    }

    public int[] getDigits() {
        return digits;
    }

    public

    public int[] convertToDecimal(int convertBase) {
        int position;
        String convertedOct = "";
        int temp = Integer.parseInt(displayOriginalNumber());
        int[] deci = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        if (base != 10) {
            if (base == 8) {
                for (int i = 0; i < digits.length; i++) {

                }
            }
        } else {
            return null;
        }
    }

    /**
    public String convertToBinary() {
        String convertedBi = "";
        int temp = Integer.parseInt(displayOriginalNumber());
        int i = 0;
        int[] Bi = {0, 1};
        if (base == 10) {
            while (temp > 0) {
                convertedBi = Bi[temp % 2 + 1] + convertedBi;
                temp = temp / 2;
            }
            return convertedBi;
        }
        if (base == 2) {
            return null;
        }
    }

    public int[] convertToOctal() {
        int position;
        String convertedOct = "";
        int temp = Integer.parseInt(displayOriginalNumber());
        int[] oct = {0, 1, 2, 3, 4, 5, 6, 7};
        if (base != 8) {
            while (temp > 0) {
                position = temp % 8;
                convertedOct = oct[position] + convertedOct;
            }

        } else {
            return null;
        }
    }

    public String[] convertToHexadecimal() {
        int convertedHexDeci;
        char[] hexadecimal = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 'A', 'B', 'C', 'D', 'E', 'F'};

    }
**/
    public String convertEverything(int convertBase) {
        int original = Integer.parseInt(displayOriginalNumber());
        int toThePowerOf = 0;
        if(base != 10){
            original = convertToDecimal(base);
        }
    }
}

// make sure if the base is less than 9, while converting, some numbers cannot be converted. like base 8 the number 68 is not gonna convert.
//if the value in the ones place is bigger than the base, then the conversion does not exist. assuming that it is converting from decimal
// use Math.pow to see how many times the number has to be multiplied, suggest to remove the number in the ones place, then reverse the num, then just * by the conversion base again
// ex: base 16   BB3 = 11 * 16 * 16 + 11*16 + 3
//char[] all = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '+', '/'};