package comCrudHospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comCrudHospital.Service.HospitalService;
import comCrudHospital.model.Hospital;

@RestController
@RequestMapping("hospitaldetails")
public class HospitalController {

	@Autowired
	HospitalService hospitalService;

	@GetMapping("/hospitals")
	private List<Hospital> getAllHospital() {
		return hospitalService.getAllHospital();
	}

	@GetMapping("/hospital")
	private Hospital getHospital(@RequestHeader("id") long id) {
		return hospitalService.getCollegeById(id);
	}

	@DeleteMapping("/hospital")
	private void deleteHospital(@RequestHeader("id") long id) {
		hospitalService.delete(id);
	}

	@PostMapping("/hospital")
	private Hospital saveHospital(@RequestBody Hospital hospital) {
		hospitalService.saveOrUpdate(hospital);
		return hospital;
	}

	@PutMapping("/hospital")
	private Hospital update(@RequestBody Hospital hospital) {
		hospitalService.saveOrUpdate(hospital);
		return hospital;
	}

}
