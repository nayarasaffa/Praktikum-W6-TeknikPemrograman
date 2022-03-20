/**
 * <h1> Kasus 4 : Depenedence </h1>
 * 
 * Kasus hasil ujian mahasiswa.
 * Program Dependence mengimplementasikan program dengan mengilustrasikan
 * konsep Dependence dengan kasus menampilkan nilai mahasiswa dalam suatu
 * pelajaran
 * 
 * @author Nayara Saffa
 * @version 1.0
 * @since 2022-03-20
 */

package dependence;

/* Class Student */
// Berfungsi untuk menyusun data mahasiswa berupa nama dan semester
class Student{
	public String name;
	public int semester;
	
	Student(String name, int semester){
		this.name = name;
		this.semester = semester;
	}
}

/* Class Exam */
// Berfungsi untuk menyusun skor dan pelajaran dari mahasiswa
class Exam{
	String subject;
	int score;
	// Menggunakan proses dependence dimana Class Student dijadikan parameter
	public void examScore(Student student, String subject, int score){
		// Menampilkan hasil ujian mahasiswa
		System.out.println("Name : " +student.name);
		System.out.println("Semester : " +student.semester);
		System.out.println("Score: " +score);
		System.out.println("Subject : " +subject);
	}
	
}

/* Class Dependence */
// Berfungsi untuk menampilkan data hasil mahasiswa
public class Dependence {
	public static void main(String[] args) {
		// Menciptakan objek dari Student class
		Student S1 = new Student ("Jeff", 2);
		Student S2 = new Student ("John", 2);
		Student S3 = new Student ("Andy", 1);
		Student S4 = new Student ("Mark", 1);
		
		// Meciptakan objek dari Exam class
		Exam studentExam = new Exam();
		studentExam.examScore(S1, "Biology", 80);
		studentExam.examScore(S2, "Physics", 85);
		studentExam.examScore(S3, "Chemistry", 90);
		studentExam.examScore(S4, "Mathematics", 95);
	}
}
