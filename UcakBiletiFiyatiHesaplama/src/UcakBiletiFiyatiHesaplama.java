import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {

	public static void main(String[] args) {

		int mesafe, yas, yolculukTipi, normalTutar;
		double toplamTutar, yasIndirimi, indirimliTutar, gidisDonusIndirimi, toplam;
		boolean isError = false;

		Scanner inp = new Scanner(System.in);

		System.out.print("Mesafeyi Kilometre Cinsinden Giriniz :");
		mesafe = inp.nextInt();

		System.out.print("Yaşınızı Giriniz :");
		yas = inp.nextInt();

		System.out.print("Yolculuk Tipini Giriniz (1 => Tek Yön, 2 => Gidiş-Dönüş) :");
		yolculukTipi = inp.nextInt();

		// Mesafe başına ücret 0.10TL/km

		if ((mesafe > 0) && (yas > 0)) {

			switch (yolculukTipi) {
			case 1:

				if (yas < 12) {
					toplamTutar = mesafe * 0.10;
					yasIndirimi = toplamTutar * 0.5;
					indirimliTutar = toplamTutar - yasIndirimi;
					System.out.println("Toplam Tutar = : " + indirimliTutar + " TL");

				} else if (yas >= 12 && yas <= 24) {
					toplamTutar = mesafe * 0.10;
					yasIndirimi = toplamTutar * 0.1;
					indirimliTutar = toplamTutar - yasIndirimi;
					System.out.println("Toplam Tutar = " + indirimliTutar + " TL");

				} else if (yas >= 65) {
					toplamTutar = mesafe * 0.10;
					System.out.println("Toplam Tutar = " + toplamTutar + " TL");
					
				} else {
					toplamTutar = mesafe * 0.10;
					yasIndirimi = toplamTutar * 0.30;
					indirimliTutar = toplamTutar - yasIndirimi;
					System.out.println("Toplam Tutar =" + indirimliTutar + "TL");
				}
				break;

			case 2:

				if (yas < 12) {
					toplamTutar = mesafe * 0.10;
					yasIndirimi = toplamTutar * 0.5;
					indirimliTutar = toplamTutar - yasIndirimi;
					gidisDonusIndirimi = indirimliTutar * 0.20;
					toplam = (indirimliTutar - gidisDonusIndirimi) * 2;
					System.out.println("Toplam Tutar = : " + toplam + " TL");

				} else if (yas >= 12 && yas <= 24) {
					toplamTutar = mesafe * 0.10;
					yasIndirimi = toplamTutar * 0.1;
					indirimliTutar = toplamTutar - yasIndirimi;
					gidisDonusIndirimi = indirimliTutar * 0.20;
					toplam = (indirimliTutar - gidisDonusIndirimi) * 2;
					System.out.println("Toplam Tutar = " + toplam + " TL");

				} else if (yas >= 65) {
					toplamTutar = mesafe * 0.10;
					System.out.println("Toplam Tutar = " + toplamTutar + " TL");

				} else {
					toplamTutar = mesafe * 0.10;
					yasIndirimi = toplamTutar * 0.3;
					indirimliTutar = toplamTutar - yasIndirimi;
					gidisDonusIndirimi = indirimliTutar * 0.20;
					toplam = (indirimliTutar - gidisDonusIndirimi) * 2;
					System.out.println("Toplam Tutar = " + toplam + " TL ");

				}
				break;

			}
		} else {
			isError = true;
		}

		if (isError) {
			System.out.println("Hatalı Giriş Yaptınız!");
		}
	}
}
