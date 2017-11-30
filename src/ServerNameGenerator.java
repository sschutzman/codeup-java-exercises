import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {

//    Create two arrays whose elements are strings, one with at least 10 adjectives, another with at least 10 nouns
    String[] name = {"psychedelic", "royal", "clear", "merciful", "aromatic", "workable", "ceaseless", "wonderful", "alike", "bashful"};
    String[] name2 = {"face", "sponge", "nation", "loss", "road", "butter", "fuel", "start", "caption", "quill"};

    int rnd = new Random().nextInt(name.length);
    int ran = new Random().nextInt(name2.length);
    System.out.println("Your server name is: " + name[rnd] + " " + name2[ran]);


 }
}