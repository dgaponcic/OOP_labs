package lab3;

public class Main {
    public static void main (String[] args) {
        Text text1 = new Text("Math is nice? Is, is nice. Math math rom is is awesome! Also is not awesome because yes yes yes no.");
        System.out.println("Number of sentences: " + text1.getNumberSentences());

        System.out.println("Number of vowels: " + text1.getNumberVowels());
        System.out.println("Number of consonants: " + text1.getNumberConsonants());
        System.out.println("Number of letters: " + text1.getNumberLetters());

        System.out.println("Longest word: " + text1.getLongestWord());
        text1.printMostUsed(5);
    }
}
