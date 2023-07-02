package comCrudHospital.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comCrudHospital.Dao.HospitalDao;
import comCrudHospital.model.Hospital;

@Service
public class HospitalServiceImp implements HospitalService {

	@Autowired
	HospitalDao hospitaldao;

	@Override
	public List<Hospital> getAllHospital() {
		List<Hospital> hospital = new ArrayList<Hospital>();
		hospitaldao.findAll().forEach(hospital1 -> hospital.add(hospital1));
		return hospital;
	}

	@Override
	public Hospital getCollegeById(long id) {
		return hospitaldao.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Hospital hospital) {
		hospitaldao.save(hospital);

	}

	@Override
	public void delete(long id) {
		hospitaldao.deleteById(id);
	}

}
