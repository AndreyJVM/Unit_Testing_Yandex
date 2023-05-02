//Методу передают строку как параметр. Тебе нужно проверить, содержит ли строка символы:
//только верхнего регистра — верни «Строка в верхнем регистре»,
//только нижнего регистра — верни «Строка в нижнем регистре»,
//разные регистры — верни «Строка с разными регистрами».

import java.util.Locale;

public class RegisterChecker {

    public String checkRegister(String string){
        String stringUpperCase = string.toUpperCase();
        String stringLowerCase = string.toLowerCase();

        if (string.equals(stringUpperCase)){
            return "Строка в верхнем регистре";
        } else if (string.equals(stringLowerCase)) {
            return "Строка в нижнем регистре";
        }else {
            return "Строка с разными регистрами";
        }
    }
}
