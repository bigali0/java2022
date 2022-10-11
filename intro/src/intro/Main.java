package intro;

public class Main {

	public static void main(String[] args) {
		
		//sys + Ctrl + space
		System.out.println("Hello world!");
		
		// degisken isimlendirmeleri java da camelCase yazilir
		String ortaMetin="ilginizi cekebilir";
		String altMetin="Vade suresi";
		
		System.out.println(ortaMetin);
		
		int vade =12;
		
		double dolarDun = 18.25;
		double dolarBugun = 18.30;
		
		boolean dolarDustuMu = false;
		
		String okYonu ="";
		
		if (dolarBugun<dolarDun) { //false
			okYonu ="down.svg";
			System.out.println(okYonu);
			
		}else if(dolarBugun>dolarDun) {
			okYonu ="up.svg";
			System.out.println(okYonu);
		} 
		else {
			okYonu ="equal.svg";
			System.out.println(okYonu);

		}
		
		//array
		
			String[]  krediler = {"Hizli Kredi","Maasini Halkbanktan","Mutlu Emekli"};
			
			System.out.println(krediler[0]);
			System.out.println(krediler[1]);
			System.out.println(krediler[2]);
			
			// yukaridakinin aynisi for loop ile
			for (int i = 0; i < krediler.length; i++) {
				System.out.println(krediler[i]);
				
			}
	}

}
