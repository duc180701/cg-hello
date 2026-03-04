package MD2.Bai19.BaiTap.Bai1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassroomExample {
    private static final String CLASSROOM_REGEX = "^[CAP][\\d+]{4}[GHIKMN]$";

    public ClassroomExample() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASSROOM_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
