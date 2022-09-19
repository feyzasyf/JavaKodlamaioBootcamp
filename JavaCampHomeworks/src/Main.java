
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5- Hello World!
				System.out.println("Hello world!");

				
				//6- variables 
				     
				int ogrenciSayisi = 24;
				String mesaj = "Öğrenci Sayısı :";

				System.out.println(mesaj + ogrenciSayisi);
				System.out.println("Öğrenci Sayısı :" + ogrenciSayisi);

				//7- data types

				double sayi= 6.7;   
				int sayi2 = 7;
				char karakter = 'L';
				String sehir = "Ankara";
				boolean dogruMu =false;

				System.out.println(sayi);
				System.out.println(sayi2);
				System.out.println(karakter);
				System.out.println(sehir);
				System.out.println(dogruMu);

				     
				 //8- if/else conditionals    

				int sayi3=26;

				if(sayi3<20) {
					System.out.println("Sayı 20'den küçüktür");
					
				}else if(sayi3==20) {
					System.out.println("Sayı 20'ye eşittir");
					
				}else {
					System.out.println("Sayı 20'den büyüktür ");
				}
				     
				//9- recap demo 1

				int sayi4=24;
				int sayi5=25;
				int sayi6=26;

				int enBuyuk=sayi4;

				if(enBuyuk<sayi5) {
					enBuyuk=sayi5;
				}

				if(enBuyuk<sayi6) {
					
					enBuyuk=sayi6;
				}

				System.out.println("En Büyük =" + enBuyuk);

				//10- Switch 

				char grade ='A';

				switch (grade) {

				case 'A' :
				System.out.println("Mükemmel : Geçtiniz");
				break;

				case 'B' :
				System.out.println("İyi : Geçtiniz");
				break;

				case 'C' :
				System.out.println("Ortalama : Geçtiniz");
				break;

				case 'D' : 
				System.out.println("Fena Değil : Geçtiniz");
				break;

				case 'F' : 
				System.out.println("Maalesef : Kaldınız");
				break;
				default:
					System.out.println("Geçersiz not girdiniz");
				}

				//11-13 Loop Demo

				//11- For

				for (int i = 2; i < 10; i+=2) {
					
					System.out.println(i);
				}
				System.out.println("For döngüsü bitti");
				     
				//12- While

				int i = 2;
				while (i<10) {
					System.out.println(i);
					i+=2;
				}
				System.out.println("While döngüsü bitti");

				// 13- Do-While
				int j = 20;
				do {
					System.out.println(j);
					j+=2;
				} while (j<10);
				     
				 System.out.println("Do-While Döngüsü Bitti");    
				 
				//14- Arrays Demo
				 
				 String[] ogrenciler=new String[4];
				 
				 ogrenciler[0]="Ali";
				 ogrenciler[1]="Ömer";
				 ogrenciler[2]="Burak";
				 ogrenciler[3]="Kemal";
				 
				 for (int k = 0; k < ogrenciler.length; k++) {
					
					 System.out.println(ogrenciler[k]);
				}
				 
				 System.out.println("-------------------------------------------------------");
				 
				 for (String ogrenci : ogrenciler) {
					
					 System.out.println(ogrenci);
				}
				     
				//15 - Recap Demo2
				 
				 double myList[]= {4.5,6.2,8.9,5.3,7.7};
				 
				 double max=myList[0];
				 double total=0;
				 for (double number : myList) {
				     
					 if(max<number) {
						 max=number;
					 }
					 total+=number;
					 System.out.println(number);
				}
				 
				 System.out.println("Toplam :"+total);
				 System.out.println("En Büyük Sayı :"+max);
				 
				 //16- Multi Dimensional Array Demo
				 
				 String[][] sehirler=new String[3][3];
				 
				 sehirler[0][0]="Ankara";
				 sehirler[0][1]="Bursa";
				 sehirler[0][2]="İstanbul";
				 sehirler[1][0]="Ordu";
				 sehirler[1][1]="Kırşehir";
				 sehirler[1][2]="Sinop";
				 sehirler[2][0]="Urfa";
				 sehirler[2][1]="Artvin";
				 sehirler[2][2]="Denizli";
				 
				 
				 for (int k = 0; k < sehirler.length; k++) {
					 
					 System.out.println("----------------------------------");
					 
					for (int k2 = 0; k2 < sehirler.length; k2++) {
						
						System.out.println(sehirler[k][k2]);
						
					}
					
				}
				 
				//17-18- String Demo
				 
				String metin="Bugün hava çok güzel.";
				System.out.println(metin);

				System.out.println("Eleman Sayısı :" + metin.length());
				System.out.println("5.eleman : " + metin.charAt(4));
				System.out.println(metin.concat("Çok mutluyum !"));
				System.out.println(metin.startsWith("D"));
				System.out.println(metin.endsWith("n"));
				char[] karakterler =new char[5];
				metin.getChars(0, 5, karakterler, 0);
				System.out.println(karakterler);
				System.out.println(metin.indexOf('y'));
				System.out.println(metin.lastIndexOf('y'));

				System.out.println(metin.replace(" ", "-"));
				System.out.println(metin.substring(3,6));
				for (String c : metin.split(" ")) {
					System.out.println(c);
				}
				System.out.println(metin.toLowerCase());
				System.out.println(metin.toUpperCase());
				System.out.println(metin.trim());

				//19- Mini Project Prime Number

				int number =20;
				//int remainder = number % 2;

				boolean isPrime=true;

				if(number==1) {
					System.out.println("Sayı Asal Değildir");
					return;
				}

				if(number<1) {
					System.out.println("Geçersiz Sayı Girdiniz");
					return;
				}


				for (int k = 2; k < number; k++) {
					if (number % k == 0) {
						isPrime=false;
					}
					
				}
				 
				System.out.println(isPrime==true ? "Sayı Asal" : "Sayı Asal Değil");

				//20 - vowels

				char harf= 'O';

				switch(harf) {

				case 'A':
				case 'I':
				case 'O':
				case 'U':
				System.out.println("Kalın Sesli Harftir");
				break;
				default:
					System.out.println("İnce Sesli Harftir");
				}

				//21 - perfect numbers

				int number2 = 6;
				int total2 = 0;

				if(number2 <= 1) {
					System.out.println("Geçersiz sayı..");
					return;
				}
				for (int k = 1; k < number2; k++) {

					if(number2 % k == 0) {
						total2+=k;
					}
				}
				 
				if(total2==number2) {
					System.out.println("Mükemmel Sayıdır");
				}
				else {
					System.out.println("Sayı Mükemmel Değildir");
				}

				//22 - Friendly Numbers

				int sayiA=220;
				int sayiB=284;
				int toplamA=0;
				int toplamB=0;


				for (int k = 1; k < sayiA; k++) {
					
					if(sayiA % k == 0) {
						toplamA+=k;
					}
				}

				for (int k = 1; k < sayiB; k++) {
					
					if(sayiB % k == 0) {
						toplamB+=k;
					}
				}


				if(toplamA==sayiB && toplamB==sayiA) {
					System.out.println("Sayılar arkadaştır");
				}else {
				    
					System.out.println("Sayılar arkadaş değildir");}

				//23 -Mini Project Finding Number

				int[] sayilar = {1,2,3,4,5,6,7,8,9,10,11};
				int aranacak=55;
				boolean varMi=false;

				for (int sayii : sayilar) {
					if(sayii==aranacak) {
						varMi=true;
						break;
					}
				}

				if(varMi) {
					System.out.println("Sayı mevcuttur");
				}else {
					System.out.println("Sayı mevcut değildir");
				}


			}
	}


