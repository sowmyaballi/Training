import java.util.*;

public class HangmanGame {
    static class WordEntry {
        private String word;
        private String clue;

        public WordEntry(String word, String clue) {
            this.word = word.toLowerCase();
            this.clue = clue;
        }

        public String getWord() {
            return word;
        }

        public String getClue() {
            return clue;
        }
    }

    static class WordBank {
        private static final List<WordEntry> words = new ArrayList<>();

        static {
            words.add(new WordEntry("apple", "A fruit with 5 letters and it is red in color."));
            words.add(new WordEntry("banana", "A long yellow fruit loved by monkeys."));
            words.add(new WordEntry("mango", "It is the king of fruits and very juicy."));
            words.add(new WordEntry("lemon", "Yellow in color, 5-letter fruit name."));
            words.add(new WordEntry("grape", "Small, round, and purple or green fruit."));
            words.add(new WordEntry("peach", "A soft fruit, pinkish outside and sweet inside."));
            words.add(new WordEntry("zebra", "A black and white striped animal."));
            words.add(new WordEntry("camel", "A desert animal with a hump."));
            words.add(new WordEntry("tiger", "A big cat with orange and black stripes."));
            words.add(new WordEntry("panda", "A cute black and white bear that eats bamboo."));
            words.add(new WordEntry("cloud", "White and fluffy thing in the sky or online."));
            words.add(new WordEntry("robot", "A machine that can walk and talk like humans."));
            words.add(new WordEntry("ghost", "A spooky thing you canâ€™t see but fear."));
            words.add(new WordEntry("witch", "She flies on a broom and casts spells."));
            words.add(new WordEntry("piano", "A musical instrument with black and white keys."));
            words.add(new WordEntry("guitar", "A stringed instrument you strum or pick."));
            words.add(new WordEntry("drums", "You hit these in a band to make a beat."));
            words.add(new WordEntry("chef", "A profession: someone who cooks delicious food."));
            words.add(new WordEntry("nurse", "A hospital helper who takes care of patients."));
            words.add(new WordEntry("pilot", "A person who flies airplanes."));
            words.add(new WordEntry("teacher", "A profession that starts with T and teaches."));
            words.add(new WordEntry("doctor", "They help sick people feel better."));
            words.add(new WordEntry("farmer", "Grows food and works in the fields."));
            words.add(new WordEntry("artist", "A person who paints or draws."));
            words.add(new WordEntry("actor", "Someone who performs in movies or plays."));
            words.add(new WordEntry("baker", "Makes bread, cakes, and cookies."));
            words.add(new WordEntry("joker", "A funny guy in cards or a villain in Batman."));
            words.add(new WordEntry("candy", "A sweet treat kids love to eat."));
            words.add(new WordEntry("jelly", "A sweet wobbly dessert that jiggles."));
            words.add(new WordEntry("ice", "It's cold, made from frozen water."));
        }

        public static WordEntry getRandomWord() {
            Random rand = new Random();
            return words.get(rand.nextInt(words.size()));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuePlaying = true;
        final int maxAttempts = 6;

        System.out.println(" Welcome to the Word Guessing Game!\n");

        while (continuePlaying) {
            WordEntry entry = WordBank.getRandomWord();
            String word = entry.getWord();
            String clue = entry.getClue();
            char[] currentGuess = new char[word.length()];
            boolean[] guessedPositions = new boolean[word.length()];
            int attemptsLeft = maxAttempts;

            Arrays.fill(currentGuess, '_');

            System.out.println(" Clue: " + clue);
            printProgress(currentGuess);

            while (attemptsLeft > 0) {
                System.out.print(" Enter a letter: ");
                String input = sc.nextLine().toLowerCase();

                if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                    System.out.println(" Please enter only a single letter.\n");
                    continue;
                }

                char guess = input.charAt(0);
                boolean matchFound = false;

                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess && !guessedPositions[i]) {
                        currentGuess[i] = guess;
                        guessedPositions[i] = true;
                        matchFound = true;
                    }
                }

                if (matchFound) {
                    System.out.println(" Good guess!");
                } else {
                    attemptsLeft--;
                    System.out.println(" No match. Attempts left: " + attemptsLeft);
                }

                printProgress(currentGuess);

                if (isWordGuessed(guessedPositions)) {
                    System.out.println(" Congratulations! You guessed the word: " + word);
                    break;
                }

                if (attemptsLeft == 0) {
                    System.out.println(" Out of attempts! The correct word was: " + word);
                }
            }

            System.out.print("\n Do you want to play again? (yes/no): ");
            String response = sc.nextLine().toLowerCase();
            if (!response.equals("yes")) {
                continuePlaying = false;
                System.out.println("\n Thanks for playing! Goodbye!");
            }
        }
    }

    private static void printProgress(char[] currentGuess) {
        System.out.print(" Word: ");
        for (char c : currentGuess) {
            System.out.print(c + " ");
        }
        System.out.println("\n");
    }

    private static boolean isWordGuessed(boolean[] guessedPositions) {
        for (boolean guessed : guessedPositions) {
            if (!guessed) return false;
        }
        return true;
    }
}