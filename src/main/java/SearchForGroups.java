import sun.invoke.empty.Empty;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Урок по использованию регулярныъ выражений в JAva
 *http://proglang.su/java/regular-expressions#metody-klassa-matcher
 *
 * Группы сбора представляют способ обращения с несколькими символами как с одной единицей. Они создаются путем размещения символов, которые предстоит сгруппировать, в серии круглых скобок. К примеру, регулярное выражение (dog) составляет отдельную группу, содержащую буквы "d", "o", и "g".
 * Группы сбора нумеруются посредством определения числа открывающих круглых скобок слева направо. Так, в выражении ((A)(B(C))) присутствуют четыре подобные группы:
 *  ((A)(B(C)))
 *  (A)
 *  (B(C))
 *  (C)
 *  Для определения числа групп, представленных в выражении, вызвать метод groupCount на объекте класса matcher в Java. Метод groupCount извлекает число типа int, отображающее количество групп сбора, представленных в сопоставляемом шаблоне.
 *  Также имеется специальная группа, группа 0, которая во всех случаях представляет выражение в полном виде. Данная группа не включается в сумму, представленную методом groupCount.
 */

 public class SearchForGroups {
    private String sourceText;
    private String searhText;

    public SearchForGroups(String sourceText, String searhText) {
        this.sourceText = sourceText;
        this.searhText = searhText;

        Pattern r = Pattern.compile(searhText);

        // Создание matcher объекта
        Matcher m = r.matcher(sourceText);
        if (m.find( )) {
            System.out.println("Найдено значение: " + m.group(0));
            System.out.println("Найдено значение: " + m.group(1));
            System.out.println("Найдено значение: " + m.group(2));
            System.out.println("Найдено значение: " + m.group(3));
            System.out.println("Найдено значение: " + m.group(4));
        }else {
            System.out.println("НЕ СОВПАДАЕТ");
        }

    }

    public String getSourceText() {
        return sourceText;

    }

    public void setSourceText(String sourceText) {
        this.sourceText = sourceText;
    }

    public String getSearhText() {
        return searhText;
    }

    public void setSearhText(String searhText) {
        this.searhText = searhText;
    }

    public SearchForGroups() {
        if((this.sourceText.length() == 0) || (this.sourceText == null) || (this.searhText.length() == 0 )|| (this.searhText == null) ) {
            this.sourceText = "Крещение Руси произошло в 988 году! Не так ли?";
            this.searhText= "(.*)(\\d+)(.*)"; //Parrent
        }
        Pattern r = Pattern.compile(searhText);

        // Создание matcher объекта
        Matcher m = r.matcher(sourceText);
        if (m.find( )) {
            System.out.println("Найдено значение: " + m.group(0));
            System.out.println("Найдено значение: " + m.group(1));
            System.out.println("Найдено значение: " + m.group(2));
            System.out.println("Найдено значение: " + m.group(3));
        }else {
            System.out.println("НЕ СОВПАДАЕТ");
        }

    }
}
