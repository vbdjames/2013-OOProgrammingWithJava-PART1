import java.util.Random;

public class PasswordRandomizer {
    private Random random = new Random();
    private int length;

    public PasswordRandomizer(int length) {
        this.length = length;
    }

    public String createPassword() {
        String characters="abcdefghijklmnopqrstuvwxyz";
        String pw = "";
        for (int i = length; i > 0; i--) {
            pw += characters.charAt(random.nextInt(characters.length()));
        }
        return pw;
    }
}
