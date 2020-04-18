package keith;

public class DCatTest {

	public static void main(String[] args) {
		DCat c1 = new DCat("Telly", 3, "happy", "Tabby");
		DCat c2 = new DCat("Mikey", 1, "sleepy", "Cool");
		DCat c3 = new DCat("Batman", 2, "hungry", "Brown");
		DCat c4 = new DCat("Flash", 6, "crazy", "Black");
		DCat c5 = new DCat("Bond", 5, "happy", "Green");
		DCat[] CatArray = new DCat[5];
		CatArray[0] = c1;
		CatArray[1] = c2;
		CatArray[2] = c3;
		CatArray[3] = c4;
		CatArray[4] = c5;
		for (int i = 0; i < CatArray.length; i++) {
			CatArray[i].setMood("sleepy");
		}
		for (int i = 0; i < CatArray.length; i++) {
			System.out.println("name= "+CatArray[i].getName()+" "+"mood= "+CatArray[i].getMood());
		}
			}

}
