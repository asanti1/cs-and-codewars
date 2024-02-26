package MostFrequentlyUsedWordsInAText.src;

public class Main {

    public static void main(String[] args) {
        /*TopWords.top3("""
                             In a village of La Mancha, the name of which I have no desire to call to
                             mind, there lived not long since one of those gentlemen that keep a lance
                             in the lance-rack, an old buckler, a lean hack, and a greyhound for
                             coursing. An olla of rather more beef than mutton, a salad on most
                             nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra
                             on Sundays, made away with three-quarters of his income.""");*/
        TopWords.top3("a a a  b  c c  d d d d  e e e e e");
        System.out.println();
        TopWords.top3("'a 'A 'a' a'A' a'a'!");
        System.out.println();

        TopWords.top3("won''''t  //wont won't won't ");
    }
}
