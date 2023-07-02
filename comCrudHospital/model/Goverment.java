package comCrudHospital.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "goverment")
public class Goverment {
	@Id
	@Column(name = "goverment_id", nullable = false, length = 100)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String govermentId;
	private String address;

	private Hospital hospital;

	public String getGovermentId() {
		return govermentId;
	}

	public void setGovermentId(String govermentId) {
		this.govermentId = govermentId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
