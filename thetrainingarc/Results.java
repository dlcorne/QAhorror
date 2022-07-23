package thetrainingarc;

public class Results {
	
	private static int physics = 90;
	private static int chemistry = 120;
	private static int biology = 89;
	private static int total;
	private static int phyPC, chemPC, bioPC;
	
	public static void main(String[] args) {
		total = physics + chemistry + biology;
		String phyPF, chemPF, bioPF;
		phyPC = (physics * 100) / 150;
		chemPC = (chemistry * 100) / 150;
		bioPC = (biology * 100) / 150;
		if (phyPC < 60) {
			phyPF = "Fail";
		} else {
			phyPF = "Pass";
		}
		if (chemPC < 60) {
			chemPF = "Fail";
		} else {
			chemPF = "Pass";
		}
		if (bioPC < 60) {
			bioPF = "Fail";
		} else {
			bioPF = "Pass";
		}
		System.out.println("Physics result: " + physics + " of 150. Percentage: " + phyPC + " of 100. Result: " + phyPF);
		System.out.println("Chemistry result: " + chemistry + " of 150. Percentage: " + chemPC + " of 100. Result: " + chemPF);
		System.out.println("Biology result: " + biology + " of 150. Percentage: " + bioPC + " of 100. Result: " + bioPF);
		System.out.println("Total result: " + total + " of 450.");
		findPercent();
	}
	
	public static void findPercent() {
		int resultPercent = (total * 100) / 450;
		System.out.println("Percentage: " + resultPercent);
		int fails;
		fails = 0;
		if (phyPC < 60) {
			fails++;
		}
		if (chemPC < 60) {
			fails++;
		}
		if (bioPC < 60) {
			fails++;
		}
		if (resultPercent < 60) {
			fails++;
		}
		if (fails == 4) {
			System.out.println("All of your percentages are below the required pass mark. A government-sponsored kill-squad has been informed of your location.");
		}
		if (fails == 3) {
			System.out.println("Three of your percentages are below the required pass mark. £900000 has been added to your student loan total.");
		}
		if (fails == 2) {
			System.out.println("Two of your percentages are below the required pass mark. You are sentenced to fifteen years of forced labor.");
		}
		if (fails == 1) {
			System.out.println("One of your percentages are below the required pass mark. This will be recorded on your criminal record.");
		}
		if (fails == 0) {
			System.out.println("Your percentages are above the required pass mark. You must now pass the 'become employed with an undergraduate degree' challenge.");
		}
	}
}