package supportdev.random;

public class RandomNumbers{



    public int[] massiveOfRandom(int length) {
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = (int)(Math.random()*length);
        }
        return numbers;
    }

    Integer[] massiveBorderOfRandom(int max, int min, int length) {
        Integer[] numbers = new Integer[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = (int)((Math.random()*(max - min)) + min);
        }
        return numbers;
    }

}
