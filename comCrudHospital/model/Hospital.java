package comCrudHospital.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//@Data  // for auto getters setters and constructors
@Table(name = "hospitalDetails")
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hospital_id", unique = true, nullable = false, length = 100)
	private long id;
	@Column(name = "hospital_name")
	private String name;
	@Column(name = "no_of_functionality")
	private String functionality;
	@Column(name = "total_size")
	private long size;
	@Column(name = "google_location")
	private String location;
	@Column(name = "hospital_ownership")
	private String ownership;
	@Column(name = "no_specialization")
	private String specialization;
	private Date openDate;
	@Column(name = "no_of_patient")
	private long patient;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "goverment_id", referencedColumnName = "goverment_id")
	private Goverment goverment;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFunctionality() {
		return functionality;
	}

	public void setFunctionality(String functionality) {
		this.functionality = functionality;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOwnership() {
		return ownership;
	}

	public void setOwnership(String ownership) {
		this.ownership = ownership;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public long getPatient() {
		return patient;
	}

	public void setPatient(long patient) {
		this.patient = patient;
	}

	public Goverment getGoverment() {
		return goverment;
	}

	public void setGoverment(Goverment goverment) {
		this.goverment = goverment;
	}

	public Hospital(long id, String name, String functionality, long size, String location, String ownership,
			String specialization, Date openDate, long patient, Goverment goverment) {
		super();
		this.id = id;
		this.name = name;
		this.functionality = functionality;
		this.size = size;
		this.location = location;
		this.ownership = ownership;
		this.specialization = specialization;
		this.openDate = openDate;
		this.patient = patient;
		this.goverment = goverment;
	}

	public Hospital() {
		super();
	}

	public Hospital(Goverment goverment) {
		super();
		this.goverment = goverment;
	}
}
