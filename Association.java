/**
 * <h1> Kasus 1 : Association </h1>
 * Kasus Dokter di Rumah Sakit.
 * Program Association mengimplementasikan program dengan mengilustrasikan
 * konsep asosiasi dengan kasus menampilkan daftar dokter yang berada pada 
 * suatu rumah sakit.
 * 
 * @author Nayara Saffa
 * @version 1.0
 * @since 2022-03-20
 */

package Association;
import java.util.*;

/* Class Doctor */
// Berfungsi untuk menyusun data dokter berupa nama
class Doctor{
	private String doctorName;
	List<Hospital> hospital;
	
	/* Nama Dokter */
	public void setDoctorName(String doctorName){
		this.doctorName = doctorName;
	}
	public String getDoctorName() {
		return this.doctorName;
	}
	@Override
	public String toString() {
		return doctorName;
	}
}

/* Class Hospital */
// Berfungsi untuk menyusun daftar dokter yang ada di rumah sakit
class Hospital{
	private String hospitalName;
	List<Doctor> doctors;
	
	/* Nama Rumah Sakit */
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	
	/* Daftar dokter di Rumah Skit*/
	public List<Doctor> getDoctors(){
		return doctors;
	}
	public void setHospital(List<Doctor> doctors) {
		this.doctors = doctors;
	}
}

/* Association Class */
// Asosiasi antara kedua class (Doctor dan Hospital) pada main method
class Association{
	public static void main (String[] args) {
		// Set nama Rumah Sakit
		Hospital hospital = new Hospital();
		hospital.setHospitalName("Siloam Hospital");
		
		// Set nama dokter
		Doctor doctor = new Doctor();
		doctor.setDoctorName("Jeff");
		Doctor doctor2 = new Doctor();
		doctor2.setDoctorName("John");
		
		// Masukan data dokter ke dalam sebuah list
		List<Doctor> listDoctor = new ArrayList<Doctor>();
		listDoctor.add(doctor);
		listDoctor.add(doctor2);
		
		// Masukan list dokter ke dalam data list dokter Rumah Sakit
		hospital.setHospital(listDoctor);
		
		// Tampilkan nama dokter yang berada di Rumah Sakit
		System.out.println(hospital.getDoctors()+" is a doctor at "+hospital.getHospitalName());
	}
}