package day9;

public class RemoveJunkOrSpecialCharacterFromString {

	public static void main(String[] args) {
		String s = "komal@#$%makk e";
		String s1 = s.replace("@", "");
		String s2 = s.replace("#", "");
		String s3 = s.replace("$", "");
		String s4 = s.replace("%", "");
		String s5 = s.replace(" ", "");
		System.out.println(s5);
	}

}
