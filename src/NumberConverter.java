public class NumberConverter {
    int[] digits;
    int base;

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

    public int[] convertToDecimal() {
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

    public String convertToBinary() {
        String convertedBi = "";
        int temp = Integer.parseInt(displayOriginalNumber());
        int i = 0;
        int[] Bi = {0, 1};
        if(base == 10) {
        while(temp > 0){
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

    public String convertEverything() {
        char[] all = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '+', '/'};

    }
}

//char[] all = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '+', '/'};