package ppj20;

public class Word {

    private char[] chars;
    private int charCount;

    public Word() {
        this.chars = new char[100];
        this.charCount = 0;
    }

    public int length() {
        return this.charCount;
    }

    public void addChar (char s) {
        this.chars[charCount] = s;
        this.charCount++;
    }

    public void show() {
        for (int i = 0; i < charCount; i++)
            System.out.print("[Char " + (i + 1) + ": " + this.chars[i] + " ] " + "\n");
    }

}
