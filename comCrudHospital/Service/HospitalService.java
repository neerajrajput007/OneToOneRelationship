package comCrudHospital.Service;

import java.util.List;

import comCrudHospital.model.Hospital;

public interface HospitalService {

	List<Hospital> getAllHospital();

	Hospital getCollegeById(long id);

	void delete(long id);

	void saveOrUpdate(Hospital hospital);

}
