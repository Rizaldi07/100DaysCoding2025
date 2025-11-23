public class Main {
	public static void main(String[] args) {
		String kata = "Rizaldi";
		String kita = kata.substring(0,5);// maka Rizaldi menjadi Rizal
		System.out.println("Substring : "+kita);
		String j = "jurusan saya adalah Sisfo";
		String j1 = j.replace("Sisfo","Informatika");//Mengubah sisfi menjadi informatika
		System.out.println("replace : "+j1);
		String u = " usia saya 18 tahun ";
		String a = u.trim();//menghilangkan spasi awal dan akhir
		System.out.println("trim : "+a);
	}
}
