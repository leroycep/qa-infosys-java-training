package dev.leroycepearson.strings;

class Strings {

    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    public static void exercise1() {
        String yesterday = "yesterday it was raining";
        String today = "today it is sunny";

        String result = (yesterday + ", " + today).toUpperCase();

        System.out.println(result.substring(yesterday.length() + 2));
    }

    public static void exercise2() {
        String string1 = "yesterday it was raining";

        int num_words = wordCount(string1);

        System.out.println("There are " + num_words + " words in the following string: " + string1);

        verticalWords(string1);
        reverseVerticalWords(string1);


        String[] strings = {"This string contains the needle!", "This one does not"};
        for (String s: strings) {
            if (stringContains(s, "needle")) {
                System.out.println("contains needle: " + s);
            } else {
                System.out.println("does not contain needle: " + s);
            }
        }
    }

    public static int wordCount(String sentence) {
        boolean in_word = false;
        int num_words = 0;

        for (int i = 0; i < sentence.length(); i += 1) {
            String c = sentence.substring(i, i+1);
            if (in_word && c.equals(" ")) {
                num_words += 1;
                in_word = false;
            } else if (!in_word && !c.equals(" ")) {
                in_word = true;
            }
        }

        // If we are still in a word at the end, count that as a word
        if (in_word) {
            num_words += 1;
        }

        return num_words;
    }

    public static void verticalWords(String sentence) {
        boolean in_word = false;
        int start_of_word = 0;

        for (int i = 0; i < sentence.length(); i += 1) {
            String c = sentence.substring(i, i+1);
            if (in_word && c.equals(" ")) {
                System.out.println(sentence.substring(start_of_word, i));
                in_word = false;
            } else if (!in_word && !c.equals(" ")) {
                in_word = true;
                start_of_word = i;
            }
        }

        // If we are still in a word at the end, count that as a word
        if (in_word) {
            System.out.println(sentence.substring(start_of_word));
        }
    }

    public static void reverseVerticalWords(String sentence) {
        boolean in_word = false;
        int end_of_word = 0;

        for (int i = sentence.length(); i > 0; i -= 1) {
            String c = sentence.substring(i-1, i);
            if (in_word && c.equals(" ")) {
                System.out.println(sentence.substring(i, end_of_word));
                in_word = false;
            } else if (!in_word && !c.equals(" ")) {
                in_word = true;
                end_of_word = i;
            }
        }

        // If we are still in a word at the end, count that as a word
        if (in_word) {
            System.out.println(sentence.substring(0, end_of_word));
        }
    }

    public static boolean stringContains(String haystack, String needle) {
        for (int i = 0; i < haystack.length() - needle.length(); i += 1) {
            String substr = haystack.substring(i, i+needle.length());
            if (substr.equals(needle)) {
                return true;
            }
        }

        return false;
    }

}
