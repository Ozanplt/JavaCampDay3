package day3Practice1.inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		  
        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new TarimKrediManager());
        krediUI.KrediHesapla(new OgretmenKrediManager());

	}

}
