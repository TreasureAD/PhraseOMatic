package phrase;

public class PhraseOMatic {

    public static void main(String[] args) {

        // Three sets of words and phrases to create random fortunes
        String[] wordListOne = {"You will soon", "Expect to", "Prepare yourself to", "Be ready to", "A surprise will", "In the near future, you will"};
        String[] wordListTwo = {"find", "discover", "encounter", "achieve", "uncover", "experience"};
        String[] wordListThree = {"great wealth.", "true happiness.", "a long-lost friend.", "a new opportunity.", "an unexpected adventure.", "personal growth."};

        // Find out how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // Generate three random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        // Building a fortune
        String fortune = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        // Printing the fortune
        System.out.println(fortune);
    }
    
}
