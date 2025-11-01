package MD2.Bai1;

import java.util.Scanner;

public class BaiTap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------Bai 1--------");
        String name =  sc.nextLine();
        System.out.println("Hello " + name + "!");

        System.out.println("--------Bai 2--------");
        int rate = 23000;
        System.out.println("Enter the amount want to exchange (USD): ");
        double usd = sc.nextDouble();
        double vnd = usd * (float) rate;
        System.out.println("Amount after exchange (VND): " + Math.round(vnd));

        System.out.println("--------Bai 3-------");
        String result = "";
        String tmpRes = "";
        System.out.println("Enter your number: ");
        int number = sc.nextInt();
        if (number < 0) System.out.println("Out of ability!");

        int sizeInput = String.valueOf(number).length();
        if (sizeInput == 0) {
            result = "Out of ability!";
        } else {
            if (sizeInput > 0) {
                int hangDonVi = number % 10;
                switch (hangDonVi) {
                    case 1:
                        result += "one";
                        break;
                    case 2:
                        result += "two";
                        break;
                    case 3:
                        result += "three";
                        break;
                    case 4:
                        result += "four";
                        break;
                    case 5:
                        result += "five";
                        break;
                    case 6:
                        result += "six";
                        break;
                    case 7:
                        result += "seven";
                        break;
                    case 8:
                        result += "eight";
                        break;
                    case 9:
                        result += "nine";
                        break;
                    default:
                        result = "Out of ability!";
                        break;
                }

                if (sizeInput > 1) {
                    int hangChuc = (number % 100) / 10;
                    int haiSoCuoi = number % 100;
                    if (10 <= haiSoCuoi && haiSoCuoi < 20) {
                        switch (haiSoCuoi) {
                            case 10:
                                result = "ten";
                                break;
                            case 11:
                                result = "eleven";
                                break;
                            case 12:
                                result = "twelve";
                                break;
                            case 13:
                                result = "thirteen";
                                break;
                            case 14:
                                result = "fourteen";
                                break;
                            case 15:
                                result = "fifteen";
                                break;
                            case 16:
                                result = "sixteen";
                                break;
                            case 17:
                                result = "seventeen";
                                break;
                            case 18:
                                result = "eighteen";
                                break;
                            case 19:
                                result = "nineteen";
                                break;
                            default:
                                result = "Out of ability!";
                                break;
                        }
                    } else {
                        switch (hangChuc) {
                            case 2:
                                result = "twenty " + result;
                                break;
                            case 3:
                                result = "thirty " + result;
                                break;
                            case 4:
                                result = "forty " + result;
                                break;
                            case 5:
                                result = "fifty " + result;
                                break;
                            case 6:
                                result = "sixty " + result;
                                break;
                            case 7:
                                result = "seventy " + result;
                                break;
                            case 8:
                                result = "eighty " + result;
                                break;
                            case 9:
                                result = "ninety " + result;
                                break;
                            default:
                                result = "Out of ability!";
                                break;
                        }
                    }

                    if (sizeInput > 2) {
                        int hangTram = number / 100;
                        switch (hangTram) {
                            case 1:
                                tmpRes = "one hundred";
                                break;
                            case 2:
                                tmpRes = "two hundred";
                                break;
                            case 3:
                                tmpRes = "three hundred";
                                break;
                            case 4:
                                tmpRes = "four hundred";
                                break;
                            case 5:
                                tmpRes = "five hundred";
                                break;
                            case 6:
                                tmpRes = "six hundred";
                                break;
                            case 7:
                                tmpRes = "seven hundred";
                                break;
                            case 8:
                                tmpRes = "eight hundred";
                                break;
                            case 9:
                                tmpRes = "nine hundred";
                                break;
                            default:
                                result = "Out of ability!";
                                break;
                        }
                    }
                }
            }

            if ("Out of ability!".equals(result) && !"".equals(tmpRes)) {
                result = tmpRes;
            } else if (!"".equals(tmpRes)) {
                result = tmpRes + " and " + result;
            }
        }

        System.out.println("Read Number: " + result);
    }
}
