package impl;

import java.util.HashMap;

public class SymbolsTable {
    private HashMap<String, Double> symbols;

    protected SymbolsTable() {
        symbols = new HashMap<>();
    }

    private static SymbolsTable INSTANCE;

    public static SymbolsTable getInstance() {
        if (INSTANCE == null)
            INSTANCE = new SymbolsTable();
        return INSTANCE;
    }

    public void addSymbol(String symbol) {
        if (!symbols.containsKey(symbol)) {
            symbols.put(symbol, null);
        }
    }

    public Double getSymbol(String symbol) {
        if (symbols.containsKey(symbol)) {
            return symbols.get(symbol);
        } else
            throw new IllegalArgumentException("Переменная не объявлена");
    }

    public void update(String text, Double value) {
        if (symbols.containsKey(text)) {
            symbols.put(text, value);
        }
    }
}

