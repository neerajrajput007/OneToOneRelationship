package comCrudHospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import comCrudHospital.model.Hospital;

@Repository
public interface HospitalDao extends JpaRepository<Hospital, Long> {

}
