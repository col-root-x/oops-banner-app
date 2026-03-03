import java.util.ArrayList;
import java.util.List;

public class OOPSBannerApp {

    // Static Inner Class
    static class CharacterPattern {
        private char letter;
        private String[] pattern;

        public CharacterPattern(char letter, String[] pattern) {
            this.letter = letter;
            this.pattern = pattern;
        }

        public char getLetter() {
            return letter;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        List<CharacterPattern> patternList = new ArrayList<>();

        patternList.add(new CharacterPattern('O', getO()));
        patternList.add(new CharacterPattern('P', getP()));
        patternList.add(new CharacterPattern('S', getS()));

        printWord("OOPS", patternList);
    }

    public static void printWord(String word, List<CharacterPattern> list) 
{

        for (int i = 0; i < 7; i++) {

            for (char c : word.toCharArray()) {

                for (CharacterPattern cp : list) {

                    if (cp.getLetter() == c) {
                        System.out.print(cp.getPattern()[i] + "   ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static String[] getO() {
        return new String[]{
            "*****",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*****"
        };
    }

    public static String[] getP() {
        return new String[]{
            "*****",
            "*   *",
            "*   *",
            "*****",
            "*",
            "*",
            "*"
        };
    }

    public static String[] getS() {
        return new String[]{
            "*****",
            "*",
            "*",
            "*****",
            "    *",
            "    *",
            "*****"
        };
    }
}
