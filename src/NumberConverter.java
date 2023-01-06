public class NumberConverter {
    int[] digits;
    int base;

    public NumberConverter(int number, int base) {
        String numberAsString = Integer.toString(number);
        digits = new int[numberAsString.length()];
        for (int i = 0; i < numberAsString.length(); i++) {
            String single = numberAsString.substring(i,i+1);
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
        int convertedDeci;
        if(base == 8){
            for(int i = 0; i < digits.length; i++ ){

            }
        }
        if(base == 2) {
            return null;
        }
    }

    public int[] convertToBinary() {
        int convertedBi;
        int[] Bi = {0, 1};

        if(base == 2) {
            return null;
        }
    }

    public int[] convertToOctal() {
        int convertedOct;
        int[] oct = {0, 1, 2, 3, 4, 5, 6, 7};


        if(base == 8) {
            return null;
        }
    }

    public int[] convertToHexadecimal(){
        int convertedHexDeci;
        char[] hexadecimal = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 'A', 'B', 'C', 'D', 'E', 'F'};

    }
}
