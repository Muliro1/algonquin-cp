/*
* Student Name: Michael Muliro
* Lab Professor: Professor Name Here
* Due Date: Due Date Here
* Modified: When the file was created or last modified
* Description: A brief description of what the class does “this class outputs a
* greeting from within method main.
*/

public class Excerpt {
	
    public static void main(String[] args) {
        String excerpt = "Pirates are evil? The Marines are righteous. "
                + "These terms have always changed throughout the course of history. "
                + "Kids who have never seen peace and kids who have never seen war have different values."
                + " Those who stand at the top determine what's wrong and what's right. "
                + "This very place is neutral ground! Justice will prevail, you say. "
                + "But of course it will! Whoever wins this war becomes justice.";

        double vowelPercent = vowelPercentCount(excerpt);
        int lengthLongest = longestWordLength(excerpt);
        int chrCount = excerpt.replaceAll("\\s", "").length();

        
        int[] counts = sentenceCount(excerpt);  
        int totalSentences = counts[0];
        int totalWords = counts[1];

       
        double avgWords = totalSentences > 0 ? (double) totalWords / totalSentences : 0;
        String readingLevel = getReadingLevel(avgWords);

        System.out.println("Program by Michael Muliro\n" +
                "Total characters: " + chrCount + "\n" +
                "Vowel percentage: " + vowelPercent + "%\n" +
                "Longest word length: " + lengthLongest + "\n" +
                "Total sentences: " + totalSentences + "\n" +
                "Word count: " + totalWords + "\n" +
                "Average words per sentence: " + String.format("%.2f", avgWords) + "\n" +
                "Reading level: " + readingLevel);
    }

    public static double vowelPercentCount(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        int count = 0;
        String lowerStripped = sentence.toLowerCase().replaceAll("\\s+", "");
        for (int i = 0; i < lowerStripped.length(); i++) {
            char ch = lowerStripped.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
                count++;
            }
        }
        return ((double) count / lowerStripped.length()) * 100;
    }

    public static int conjunctionCount(String sentence) {
        return 0; // placeholder
    }

    public static int longestWordLength(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        String[] words = sentence.split("\\P{Alpha}+");
        int maxLength = 0;
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }
        return maxLength;
    }
    

    public static int[] sentenceCount(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return new int[]{0, 0};
        }

        // Count sentences: look for . ! ?
        int sentenceCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch == '.' || ch == '!' || ch == '?') {
                sentenceCount++;
            }
        }

        // Count words: split on whitespace
        String[] words = sentence.trim().split("\\s+");
        int wordCount = words.length;
        // If the string was empty after trimming, wordCount should be 0
        if (words.length == 1 && words[0].isEmpty()) {
            wordCount = 0;
        }

        return new int[]{sentenceCount, wordCount};
    }

    
    public static String getReadingLevel(double avgWords) {
        if (avgWords <= 13) {
            return "4th Grade";
        } else if (avgWords <= 16) {
            return "8th Grade";
        } else if (avgWords <= 24) {
            return "12th Grade";
        } else {
            return "Adult";
        }
    }
}