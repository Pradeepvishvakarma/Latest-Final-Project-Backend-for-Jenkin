package com.hospital;

import static org.mockito.Mockito.doReturn;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hospital.models.Doctor;
import com.hospital.models.Patient;
import com.hospital.repositories.DoctorRepository;
import com.hospital.repositories.PatientRepository;
@RunWith(SpringRunner.class)
@SpringBootTest
class HospitalManagementApplicationTests {
	@Autowired
	private DoctorRepository doctorRepository;
	@Autowired
	private PatientRepository patientRepository;

	@Test
	void contextLoads() {

	}

	@Test
	public void createDoctorTest() {
		Doctor doc1 = new Doctor(1L, "Thomas", "Tuemo", "thomas@yahoo.fr", 14, "Dentist", "M", null);
		Doctor doc2 = new Doctor(2L, "Ada", "Ota", "oto@yahoo.fr", 15, "Dentist", "M", null);
		Doctor doc3 = new Doctor(3L, "Aziza", "ZAZA", "zaza@yahoo.fr", 16, "Dentist", "M", null);
		Doctor doc4 = new Doctor(4L, "Zamer", "Eric", "zamer@yahoo.fr", 17, "Dentist", "M", null);

		doctorRepository.save(doc1);
		doctorRepository.save(doc2);
		doctorRepository.save(doc3);
		doctorRepository.save(doc4);

	}

	@Test
	public void createPatientTest() {

		Patient pat1 = new Patient(1L, "Tueme", "Thomas", null, 12, null, "hhh", null, doctorRepository.getOne((long) 85));
		Patient pat2 = new Patient(2L, "Tueme", "Thomas", null, 12, null, null, null, doctorRepository.getOne((long) 86));
		Patient pat3 = new Patient(3L, "Tueme", "Thomas", null, 12, null, null, null, doctorRepository.getOne((long) 87));
		Patient pat4 = new Patient(4L, "Tueme", "Thomas", null, 12, null, null, null, doctorRepository.getOne((long) 88));
		patientRepository.save(pat1);
		patientRepository.save(pat2);
		patientRepository.save(pat3);
		patientRepository.save(pat4);

	}

	@Test
	public void getAllPatientsTest() {
		List<Patient> pat = patientRepository.findAll();

	}

	@Test
	public void getAllDoctorsTest() {

		List<Doctor> doc = doctorRepository.findAll();

		// doctorRepository.findAll().forEach(p->{ System.out.println(p.toString());
		// });;
	}

	@Test
	public void updatePatient() {
		Patient pat = new Patient(1L, "Tueme", "Thomas", null, 14, null, "hhh", null, doctorRepository.getOne((long) 89));
		patientRepository.save(pat);
	}

	@Test
	public void deletePatient() {
		// Patient p = patientRepository.getOne(4L);
		// p.getId();
		patientRepository.deleteById((long) 65);
	//	patientRepository.deleteById(31L);
	//	patientRepository.deleteById(32L);
	//	patientRepository.deleteById(33L);
	//	patientRepository.deleteById(34L);

	}

	@Test
	public void deleteDoctor(){
		doctorRepository.deleteById((long) 76);
	}



	// TODO Auto-generated method stub

}
