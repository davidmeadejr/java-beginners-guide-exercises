class YourWeightOnMoon {
	public static int earthWeight = 74;
	public static double moonsGravity = 0.17;

	public static void main(String args[]) {
		moonWeight(earthWeight, moonsGravity);
	}

	public static int moonWeight(int  earthWeight, double moonsGravity) {
		int myMoonWeight = (int) (earthWeight * moonsGravity);
		System.out.println("Your moon weight is " + myMoonWeight + "kg.");
		return myMoonWeight;
	}

}
