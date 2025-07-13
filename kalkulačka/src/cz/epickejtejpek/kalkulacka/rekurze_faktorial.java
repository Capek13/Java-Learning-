package cz.epickejtejpek.kalkulacka;

public class rekurze_faktorial {

	public static void main(String[] args) {
		System.out.println(faktorialSmycka(5));
		System.out.println(faktorialRekurze(5));
	}

	public static int faktorialSmycka(int cislo) {
		for (int a = cislo - 1; a > 0; a--) {
			cislo *= a;
		}
		return cislo;
	}
	public static int faktorialRekurze(int cislo) {
		if (cislo == 1)
			return 1;
		
		return cislo * faktorialRekurze(cislo - 1);
	}
}
