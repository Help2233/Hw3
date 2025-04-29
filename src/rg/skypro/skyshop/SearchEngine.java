package rg.skypro.skyshop;

import rg.skypro.skyshop.product.BestResultNotFound;

public class SearchEngine {

    private Searchable[] searchables;
    private int count = 0;

    public SearchEngine(int size) {
        searchables = new Searchable[size];
    }

    public void add(Searchable item) {
        if (count < searchables.length) {
            searchables[count++] = item;
        } else {
            System.out.println("Невозможно добавить " + item + ", т.к. массив заполнен!");
        }
    }

    public Searchable[] search(String query) {
        Searchable[] results = new Searchable[5];
        int foundCount = 0;
        for (Searchable item : searchables) {
            if (item != null && item.searchTerm().contains(query)) {
                results[foundCount++] = item;
                if (foundCount == 5) {
                    break;
                }
            }
        }
        return results;

    }

    public Searchable searchable(String search) throws BestResultNotFound {
        if (searchables == null || search == null || search.isEmpty()) {
            throw new BestResultNotFound("Поисковая строка пуста или список объектов пуст");
        }

        Searchable bestMatch = null;
        int maxNumber = 0;

        for (Searchable item : searchables) {
            if (item != null) {
                int number = countOccurrences(item.searchTerm(), search);
                if (number > maxNumber) {
                    maxNumber = number;
                    bestMatch = item;
                }
            }
        }
        if (bestMatch == null) {
            throw new BestResultNotFound("Не найдено совпадение для строки ' " + search + "'");
        }
        return bestMatch;
    }

    private int countOccurrences(String text, String search) {
        int index = 0;
        int count = 0;
        while ((index = text.indexOf(search, index)) != -1) {
            count++;
            index += search.length();
        }
        return count;
    }

}