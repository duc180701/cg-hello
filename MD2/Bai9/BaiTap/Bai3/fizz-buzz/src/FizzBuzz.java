public class FizzBuzz {
    public static String translate(int number) {
        if (number <= 0 || number >= 100) {
            return "Input not valid!";
        } else if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (String.valueOf(number).contains("3")) {
            return "Fizz";
        } else if (String.valueOf(number).contains("5")) {
            return "Buzz";
        } else {
            if (number < 10) {
                return readOneNumber(number);
            } else if (number < 20) {
                return "Mười " + readOneNumber(number);
            } else {
                int hangChuc = number / 10;
                int hangDonVi = number % 10;
                return readOneNumber(hangChuc) + " " + readOneNumber(hangDonVi);
            }
        }
    }

    public static String readOneNumber(int number) {
        switch (number) {
            case 1:
                return "Một";
            case 2:
                return "Hai";
            case 3:
                return "Ba";
            case 4:
                return "Bốn";
            case 5:
                return "Năm";
            case 6:
                return "Sáu";
            case 7:
                return "Bảy";
            case 8:
                return "Tám";
            case 9:
                return "Chín";
            default:
                return "Out of ability!";
        }
    }
}
