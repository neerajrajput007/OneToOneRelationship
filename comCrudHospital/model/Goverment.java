package comCrudHospital.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Data // for auto getters setters and constructors
@Table(name = "goverment")
public class Goverment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "goverment_id", unique = true)
	private int govermentId;
	private String address;

	@OneToOne
	@JsonIgnore
	private Hospital hospital;

	public int getGovermentId() {
		return govermentId;
	}

	public void setGovermentId(int govermentId) {
		this.govermentId = govermentId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public Goverment(int govermentId, String address, Hospital hospital) {
		super();
		this.govermentId = govermentId;
		this.address = address;
		this.hospital = hospital;
	}

	public Goverment(String address, Hospital hospital) {
		super();
		this.address = address;
		this.hospital = hospital;
	}

	public Goverment() {
		super();
	}

}
