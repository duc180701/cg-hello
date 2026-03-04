package MD2.Bai19.BaiTap.Bai2;

import MD2.Bai19.ThucHanh.Bai2.AccountExample;

public class PhoneNumberExampleTest {
    public static final String[] validPhoneNumber = new String[] {"(84)-(0978489648)", "(12)-(0111111111)"};
    public static final String[] invalidPhoneNumber = new String[] {"(84)-(1978489648)", "(84)-(097848964)", "84-0978489648"};

    public static void main(String[] args) {
        PhoneNumberExample phoneNumberExample = new PhoneNumberExample();
        for (String phoneNumber : validPhoneNumber) {
            System.out.println("PhoneNumber is " + phoneNumber +" is valid: "+ phoneNumberExample.validate(phoneNumber));
        }
        for (String phoneNumber : invalidPhoneNumber) {
            System.out.println("PhoneNumber is " + phoneNumber +" is valid: "+ phoneNumberExample.validate(phoneNumber));
        }
    }
}
