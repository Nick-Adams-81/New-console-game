package LevelOne;

public class RandomInt {
    public static int randomInt(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }
}
