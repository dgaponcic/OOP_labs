package lab3;

import java.util.*;

class Text {
    private String text;

    Text(String text) {
        this.text = text;
    }

    int getNumberSentences() {
        return text.split("[!?.:]+").length;
    }

    int getNumberVowels() {
        String str = text.toLowerCase();
        int vowelsCount = 0;

        for (int i = 0; i < str.length(); i += 1) {
            if (isVowel(str.charAt(i))) {
                vowelsCount += 1;
            }
        }
        return vowelsCount;
    }

    private boolean isVowel(char element) {
        List<Character> vowelsList = Arrays.asList('a', 'e', 'i', 'o', 'u');
        return vowelsList.contains(element);
    }

    private boolean isLetter(char element) {
        return element >= 'a' && element <= 'z';
    }

    int getNumberConsonants() {
        String str = text.toLowerCase();
        int consonantsCount = 0;

        for (int i = 0; i < str.length(); i += 1) {
            if (!isVowel(str.charAt(i)) && isLetter((str.charAt(i)))) {
                consonantsCount += 1;
            }
        }
        return consonantsCount;
    }

    int getNumberLetters() {
        String str = text.toLowerCase();
        int lettersCount = 0;
        for (int i = 0; i < str.length(); i += 1) {
            if (isLetter(str.charAt(i))) {
                lettersCount += 1;
            }
        }
        return lettersCount;
    }

    private HashMap<String, Integer> getWordFrequency() {
        String[] words = text.toLowerCase().split("[ !?.:,]+");
        HashMap<String, Integer> wordCount = new HashMap<>();

        for(String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        return wordCount;
    }

    void printMostUsedWords(int number) {
        HashMap<String, Integer> wordCount = getWordFrequency();

        System.out.println("Most used words: ");
        wordCount.entrySet()
                .stream()
                .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
                .limit(number)
                .forEach(k -> System.out.println(k.getKey() + ": " + k.getValue()));
    }

    String getLongestWord() {
        String[] words = text.toLowerCase().split("[ !?.:,]+");
        String maxWord = words[0];
        int maxLen = maxWord.length();

        for(String word : words) {
            int currLength = word.length();

            if (currLength > maxLen) {
                maxLen = currLength;
                maxWord = word;
            }
        }
        return maxWord;
    }
}
