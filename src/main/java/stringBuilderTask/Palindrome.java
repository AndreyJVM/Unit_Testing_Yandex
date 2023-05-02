/*
Палиндром — это число или текст, который читается слева направо также, как справа налево. Пример: слово «комок» или фраза
«А роза упала на лапу Азора».
        Напиши метод isPalindromeText(String str). Он должен возвращать true, если аргумент — палиндром. Иначе — false.
        Строка-аргумент может содержать пробелы и буквы разного регистра. Например, "А роза упала на лапу Азора".
        Используй StringBuilder.*/


package stringBuilderTask;

public class Palindrome {
    public boolean isPalindromeText(String str){
        String preparedStr = str.toLowerCase().replace(" ", "");
        StringBuilder sb = new StringBuilder(preparedStr);

        if(sb.reverse().toString().equals(preparedStr)) {
            return true;
        }
        return false;
    }
}



/*
Сначала подготовь строку-аргумент: приведи её к нижнему или верхнему регистру и удали пробелы. Получится String preparedStr = str.toLowerCase().replace(" ", ""), если приводить строку к нижнему регистру, и String preparedStr = str.toUpperCase().replace(" ", ""), если к верхнему.
        Создай StringBuilder: StringBuilder sb = new StringBuilder(preparedStr).
        Переверни объект и сравни результат с изначальной строкой: return sb.reverse().toString().equals(preparedStr).*/
