package comCrudHospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import comCrudHospital.model.Goverment;

@Repository
public interface GovermentDao extends JpaRepository<Goverment, String> {

}
