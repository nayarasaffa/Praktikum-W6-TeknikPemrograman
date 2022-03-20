/**
 * <h1> Kasus 2 : Aggregation </h1>

 * Kasus Dokter di Rumah Sakit.
 * Program Aggregation mengimplementasikan program dengan mengilustrasikan
 * konsep agregasi dengan kasus menampilkan jumlah dokter yang ada di suatu
 * Rumah Sakit.
 * 
 * @author Nayara Saffa
 * @version 1.0
 * @since 2022-03-20
 */

package aggregation;

import java.util.*;

/* Class Doctor */
//Berfungsi untuk menyusun data dokter berupa nama dan departemen
class Doctor{
	/* Nama Dokter */
	String name;
	String department;
	
	Doctor(String name, String department){
		this.name = name;
		this.department = department;
	}
}

/* Class Department */
// Mengandung daftar dari doctor object. Hal ini berasosiasi dengan doctor class melalui objeknya
// Berfungsi untuk menyusun data berupa dokter yang berada di suatu departemen
class Department{
// 	Nama Departemen
	String name;
	
	/* Daftar dokter yang berada di suatu departemen*/
	private List<Doctor> doctors;
	Department(String name, List<Doctor> doctors){
		this.name = name;
		this.doctors = doctors;
	}
	public List<Doctor> getDoctors(){
		return doctors;
	}
}

/* Class Hospital */
// Mengandung daftar dari Department object. Hal ini berasosiasi dengan department class melalui objeknya
// Berfungsi untuk menyusun daftar departmen dan dokter yang berada di Rumah Sakit
class Hospital{
	/* Nama Rumah Sakit*/
	String hospitalName;
	/* Daftar departemen di Rumah Sakit */
	private List<Department> departments;
	
	/* Daftar departemen dan dokternya yang berada di Rumah Sakit*/
	Hospital(String hospitalName, List<Department> departments){
		this.hospitalName = hospitalName;
		this.departments = departments;
	}
	
	/* Menghitung jumlah dokter dari seluruh department yang berada di Rumah Sakit */
	public int getTotalDoctors() {
		int noOfDoctors = 0;
		List<Doctor> doctors;
		for(Department dept : departments) {
			doctors = dept.getDoctors();
			for(Doctor d : doctors) {
				noOfDoctors++;
			}
		}
		return noOfDoctors;
	}
}

/* Class Aggregation */
//Berfungsi untuk menyusun daftar departemen dan dokter yang ada di rumah sakit
class Aggregation{
	public static void main (String[] args) {
		// Set data dokter berupa nama dan departemen
		Doctor D1 = new Doctor ("Jeff", "Pediatric");
		Doctor D2 = new Doctor ("John", "Pediatric");
		Doctor D3 = new Doctor ("Andy", "Obgyn");
		Doctor D4 = new Doctor ("Mark", "Obgyn");
		
		// Membuat daftar dari pediatric doctor
		List<Doctor> pediatricDoctors = new ArrayList<Doctor>();
		pediatricDoctors.add(D1);
		pediatricDoctors.add(D2);
		
		// Membuat daftar dari obgyn doctor
		List<Doctor> obgynDoctors = new ArrayList<Doctor>();
		obgynDoctors.add(D3);
		obgynDoctors.add(D4);
		
		// Memasukan daftar dokter sesuai department nya
		Department Pediatric = new Department("Pediatric", pediatricDoctors);
		Department Obgyn = new Department("Obgyn", obgynDoctors);
		
		List<Department> departments = new ArrayList<Department>();
		departments.add(Pediatric);
		departments.add(Obgyn);
		
		// Menciptakan instance dari hospital
		Hospital hospital = new Hospital("Siloam Hospital", departments);
		
		// Menampilkan jumlah dokter dari seluruh department yang berada di Rumah Sakit
		System.out.println(hospital.hospitalName+ " has " +hospital.getTotalDoctors() + " doctors");
	}
}