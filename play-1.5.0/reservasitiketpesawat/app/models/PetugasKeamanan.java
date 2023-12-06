package models;
import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import javax.persistence.DiscriminatorValue;

import java.util.*;
import models.Pegawai;



@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorValue("PetugasKeamanan")
public class PetugasKeamanan extends Pegawai {
	private String areaJaga;

	public final String pekerjaan = "PetugasKeamanan";

	public void melakukanPatroli() {
		throw new UnsupportedOperationException();
	}

	public void melakukanPemeriksaan() {
		throw new UnsupportedOperationException();
	}

	public String getAreaJaga() {
		return this.areaJaga;
	}

	public void setAreaJaga(String aAreaJaga) {
		this.areaJaga = aAreaJaga;
	}
}