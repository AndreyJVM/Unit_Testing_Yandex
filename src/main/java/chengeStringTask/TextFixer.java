//Кто-то записал детское стихотворение по памяти и перепутал некоторые слова:
//"Мишка косолапый по полю идёт, шишки собирает, песенки поёт. Шишка отскочила прямо мишке в лоб.
// Мишка разозлился и ногою - хлоп!"
//Тебе нужно написать метод, который исправит ошибки. Пусть он называется fixText(String text).
//Метод:
//заменит "полю" на "лесу",
//заменит "разозлился" на "рассердился" ,
//заменит "хлоп" на "топ".
//Должно получиться так: "Мишка косолапый по лесу идёт, шишки собирает, песенки поёт.
// Шишка отскочила прямо мишке в лоб. Мишка рассердился и ногою - топ!".
package chengeStringTask;

public class TextFixer {
    public String fixText(String text){
        return text.replace("полю","лесу").
                replace("разозлился","рассердился").
                replace("хлоп","топ");
    }

    public static void main(String[] args) {

        String text = "Мишка косолапый по полю идёт, шишки собирает, песенки поёт. Шишка отскочила прямо мишке в лоб. Мишка разозлился и ногою - хлоп!";

        var textFixer = new TextFixer();
        var fixedText = textFixer.fixText(text);
        System.out.println(fixedText);
    }
}


//Пригодится цепочка методов: метод replace() возвращает тип String, поэтому после первого вызова можно сделать ещё один.
// Понадобится цепочка из трёх методов.
//Ты можешь сохранить промежуточный результат после вызова методов замены в переменную text.
