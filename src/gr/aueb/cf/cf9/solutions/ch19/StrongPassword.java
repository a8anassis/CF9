package gr.aueb.cf.cf9.solutions.ch19;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StrongPassword {

    public static void main(String... args) {
        String s = "C0d1ngF@@ct0ry";

        Pattern pattern = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*])^.{12,}$");

        Matcher matcher = pattern.matcher(s);

        if (matcher.matches()) {
            System.out.println("Ισχυρό password");
        } else {
            System.out.println("Αδύναμο password");
        }
    }
}

