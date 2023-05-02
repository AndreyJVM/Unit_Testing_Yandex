//В соцсетях запрещено показывать номер телефона без согласия пользователя. Поэтому строку 8(123)4567890 заменяют на строку 8******7890.
//Напиши метод maskPhoneNumber(). Он принимает строку с номером мобильного телефона. Номер может начинаться с +7 или с 8.
//Метод оставляет в строке:
//два первых символа, если номер начинается с +7;
//один символ, если с 8;
//последние 4 символа для всех номеров.
//Остальные символы метод заменяет на *.
//Для строк +7(123)4567890 и 8(123)4567890 метод должен вернуть +7******7890 или 8******7890.

public class PhoneNumberMasker {

    public String maskPhoneNumber(String phoneNumber){
        if(phoneNumber.startsWith("+")){
            return phoneNumber.substring(0, 2)+"******"+phoneNumber.substring(phoneNumber.length() - 4);
        }else{
            return phoneNumber.substring(0, 1)+"******"+phoneNumber.substring(phoneNumber.length() - 4);
        }
    }

    public static void main(String[] args) {
        PhoneNumberMasker masker = new PhoneNumberMasker();
        System.out.println(masker.maskPhoneNumber("8(123)4567890"));
        System.out.println(masker.maskPhoneNumber("+7(123)4567890"));
    }
}


//Чтобы определить, с какого символа начинается номер, пригодится метод startsWith. Условие будет выглядеть так:
// if (phoneNumber.startsWith("+")).

//Если условие выполняется, возьми первые два символа с помощью substring(). Получится return phoneNumber.substring(0, 2).
//Число звёздочек всегда должно быть равным 6 (******) — его можно задать вручную.

//Последние четыре цифры номера можно выделить через substring(). Получится phoneNumber.substring(phoneNumber.length() - 4).

//Используй знак +, чтобы объединить выражение.
// Нужно вернуть phoneNumber.substring(0, 2), "******" и phoneNumber.substring(phoneNumber.length() - 4);.