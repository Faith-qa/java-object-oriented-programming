public class edges {
    public static void main(String[] args) {
        String word = "Holberton";
        
        // Extracting the first 3 letters
       // String wordFirst3 = word.substring(0, 3);
        String word_first_3 = word.substring(0,3);
        System.out.println("First 3 letters: " + word_first_3);
        
        // Extracting the last 2 letters
       // String wordLast2 = word.substring(word.length() - 2);
        String word_last_3 = word.substring(word.length()-2);

        System.out.println("Last 2 letters: " + word_last_3);
        
        // Extracting the middle word
        int middleIndex = word.length() / 2;
        String middleWord = word.substring(middleIndex - 3, middleIndex + 4);
        System.out.println("Middle word: " + middleWord);
    }

    
}
