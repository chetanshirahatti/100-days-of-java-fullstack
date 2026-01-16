
// Programs to count vowels in a string with using for loop

public class CountVowels {

    public static void main(String[] args) {

        String text = "Java Full Stack";
        int count = 0;

        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {

                count++;
            }
        }

        System.out.println("Vowel count: " + count);
    }
}
