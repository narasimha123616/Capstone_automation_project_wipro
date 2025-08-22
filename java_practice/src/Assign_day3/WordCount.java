package Assign_day3;

public class WordCount {
	public static void main(String[] args) {
        String sentence = "Java is a powerful programming language";

        String[] words = sentence.trim().split("\\s+");

        int wordCount = words.length;

        System.out.println("Sentence: " + sentence);
        System.out.println("Word Count: " + wordCount);
    }
}
