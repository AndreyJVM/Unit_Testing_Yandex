//Тебе нужно проверить, содержит ли переданная в параметр метода строка пробелы в начале или в конце. Для этого:
// - создай строку без пробелов в начале и в конце: нужно удалить пробелы в начале и конце у исходной строки,
// - сравни две строки.
public class BlanksChecker {
    public boolean checkBlanks(String string){
        String stringWithoutBlanks = string.trim();
        return string.equals(stringWithoutBlanks);
    }
}
