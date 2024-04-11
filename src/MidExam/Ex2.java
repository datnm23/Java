package MidExam;

public class Ex2 {
    String [] tellSomeThings;
    int numberOfWords;
    int numberOfCharacter;
    Character myChar;

    public void countOfWords() {
        for (String words : tellSomeThings) {
            for ( int i = 0; i < words.length(); i++ ) {
                if ( words.charAt(i) == ' ' || words.charAt(i) == '\n' || words.charAt(i) == '\t' && words.charAt(i-1) != ' '&& words.charAt(i-1) != '\n' && words.charAt(i-1) != '\t') {
                    numberOfWords=numberOfWords+1;
                }
            }
            numberOfWords=numberOfWords+1;
        }
        System.out.println("Number of words: "+numberOfWords);
    }

    public void countOfCharacter () {
        for (String words : tellSomeThings) {
            for ( int i = 0; i < words.length(); i++ ) {
                if ( words.charAt(i) == myChar) {
                    numberOfCharacter=numberOfCharacter+1;
                }
            }
        }
        System.out.println("Number of character: "+numberOfCharacter);
    }
}


class Ex2TestDrive {
    public static void main(String[] args) {
        Ex2 ex = new Ex2();
        ex.tellSomeThings = new String[] {"I am","Foo","in", "Java"};
        System.out.println("Ex 2.1");
        ex.countOfWords();
        System.out.println("Ex 2.2");
        ex.myChar = 'o';
        ex.countOfCharacter();
    }
}