
public class Day30 {

	public static void main(String[] args) {
        int number = 2111;
        if (number <= 0 || number > 3999) {
            System.out.println("Invalid input. The number must be between 1 and 3999.");
            return;
        }

        String[] romanThousands = {"", "M", "MM", "MMM"};
        String[] romanHundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] romanTens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] romanOnes = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        int thousands = number / 1000;
        int hundreds = (number % 1000) / 100;
        int tens = (number % 100) / 10;
        int ones = number % 10;

        String romanNumeral = romanThousands[thousands] + romanHundreds[hundreds] + romanTens[tens] + romanOnes[ones];
        System.out.println("Roman numeral for " + number + " is: " + romanNumeral);
    }
        

}
