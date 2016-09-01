package work;

/**
 * A class to simulate rolling many dice and finding the ratio of snake eyes.
 * 
 * @author Lewis et al., CST200 team.
 */

public class Base_A03Q2 {

	// Note: you should not need to change the Die class.
	public static class Die {

		private final int MAX = 6;

		private int faceValue;

		public Die() {
			faceValue = 1;
		}

		public int roll() {
			faceValue = (int) (Math.random() * MAX) + 1;

			return faceValue;
		}

		public void setFaceValue(int value) {
			if (value > 0 && value <= MAX)
				faceValue = value;
		}

		public int getFaceValue() {
			return faceValue;
		}

		public String toString() {
			String result = Integer.toString(faceValue);

			return result;
		}
	}

	public static class PairOfDice {

		Die d1, d2;

		public PairOfDice(Die d1, Die d2) {
			this.d1 = d1;
			this.d2 = d2;
		}

		public void roll() {
			d1.roll();
			d2.roll();
		}

		public void setFaceValue(int value, Die d) {
			d.faceValue = value;
		}

		public int getFaceValue(Die d) {
			return d.faceValue;
		}

		public int sumDice() {
			return d1.faceValue + d2.faceValue;
		}

	}

	public static void main(String[] args) {
		final int ROLLS = 500;
		int count = 0;
		Die dice1 = new Die();
		Die dice2 = new Die();
		PairOfDice dice = new PairOfDice(dice1, dice2);

		for (int roll = 1; roll <= ROLLS; roll++) {
			dice.roll();
			if (dice.getFaceValue(dice1) == 1 && dice.getFaceValue(dice2) == 1) {
				count++;
			}
		}
		System.out.println("Number of rolls: " + ROLLS);
		System.out.println("Number of snake eyes: " + count);
		System.out.println("Ratio: " + (double) count / ROLLS);
	}

}
