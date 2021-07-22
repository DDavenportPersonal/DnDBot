import java.util.Arrays;

public class Dice {
    private int numOfSides;

    public int getNumOfSides() {
        return this.numOfSides;
    }

    public void setNumOfSides(int numOfSides) {
        this.numOfSides = numOfSides;
    }

    public Dice(int numOfSides) {
        this.numOfSides = numOfSides;
    }

    public int roll() {
        int result = (int)((Math.random() * this.numOfSides) + 1);
        return result;
    }

    public int[] rollDisAdv() {
        int[] rolls = new int[2];
        for (int i = 0; i < 2; i++) {
            rolls[i] = this.roll();
        }
        Arrays.sort(rolls);
        return rolls;
    }

    public int[] rollAdv() {
        int[] rolls = new int[2];
        for (int i = 0; i < 2; i++) {
            rolls[i] = this.roll();
        }
        Arrays.sort(rolls);
        int low = rolls[0];
        int high = rolls[1];
        rolls[0] = high;
        rolls[1] = low;
        return rolls;
    }

    public int[] rollx(int numOfDice) {
        int[] results = new int[numOfDice];
        for (int i = 0; i < numOfDice; i++) {
            int result = (int)((Math.random() * this.numOfSides) + 1);
            results[i] = result;
        }
        return results;
    }

    public int[][] rollxDisAdv(int numOfDice) {
        int[][] results = new int[numOfDice][2];
        for (int j = 0; j < numOfDice; j++) {
            int[] rolls = new int[2];
            for (int i = 0; i < 2; i++) {
                rolls[i] = this.roll();
            }
            Arrays.sort(rolls);
            results[j] = rolls;
        }
        return results;
    }

    public int[][] rollxAdv(int numOfDice) {
        int[][] results = new int[numOfDice][2];
        for (int j = 0; j < numOfDice; j++) {
            int[] rolls = new int[2];
            for (int i = 0 ; i < 2; i++) {
                rolls[i] = this.roll();
            }
            Arrays.sort(rolls);
            int low = rolls[0];
            int high = rolls[1];
            rolls[0] = high;
            rolls[1] = low;
            results[j] = rolls;
        }
        return results;
        
    }

    static public int roll(int numOfSides) {
        int result = (int)((Math.random() * numOfSides) + 1);
        return result;
    }

    static public int[] rollDisAdv(int numOfSides) {
        int[] rolls = new int[2];
        Dice die = new Dice(numOfSides);
        for (int i = 0 ; i < 2; i++) {
            rolls[i] = die.roll();
        }
        Arrays.sort(rolls);
        return rolls;
    }

    static public int[] rollAdv(int numOfSides) {
        int[] rolls = new int[2];
        Dice die = new Dice(numOfSides);
        for (int i = 0 ; i < 2; i++) {
            rolls[i] = die.roll();
        }
        Arrays.sort(rolls);
        int low = rolls[0];
        int high = rolls[1];
        rolls[0] = high;
        rolls[1] = low;
        return rolls;
    }

    static public int[] roll(int numOfDice, int numOfSides) {
        int[] results = new int[numOfDice];
        for (int i = 0; i < numOfDice; i++) {
            int result = (int)((Math.random() * numOfSides) + 1);
            results[i] = result;
        }
        return results;
    }

    static public int[][] rollDisAdv(int numOfDice, int numOfSides) {
        int[][] results = new int[numOfDice][2];
        for (int j = 0; j < numOfDice; j++) {
            int[] rolls = new int[2];
            Dice die = new Dice(numOfSides);
            for (int i = 0; i < 2; i++) {
                rolls[i] = die.roll();
            }
            Arrays.sort(rolls);
            results[j] = rolls;
        }
        return results;
    }

    static public int[][] rollAdv(int numOfDice, int numOfSides) {
        int[][] results = new int[numOfDice][2];
        for (int j = 0; j < numOfDice; j++) {
            int[] rolls = new int[2];
            Dice die = new Dice(numOfSides);
            for (int i = 0 ; i < 2; i++) {
                rolls[i] = die.roll();
            }
            Arrays.sort(rolls);
            int low = rolls[0];
            int high = rolls[1];
            rolls[0] = high;
            rolls[1] = low;
            results[j] = rolls;
        }
        return results;
        
    }
}
