package impl;

import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParserValues {

    private static ParserValues INSTANCE;

    public static ParserValues getInstance() {
        if (INSTANCE == null)
            INSTANCE = new ParserValues();
        return INSTANCE;
    }

    public int parseString(String symbol) {
        Pattern pattern = Pattern.compile("[\\d]+");
        Matcher matcher = pattern.matcher(symbol);
        List<Integer> numbers = new ArrayList<>();
        while (matcher.find()) {
            numbers.add(Integer.parseInt(matcher.group()));
        }
        if (numbers.size() != 2 || numbers.get(1) != 0)
            throw new ParseCancellationException("Ошибка интерпретации: Неверный тип!");
        return numbers.get(0);
    }
}
