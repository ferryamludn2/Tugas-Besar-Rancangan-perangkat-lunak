package models;
import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import javax.persistence.DiscriminatorValue;

import java.util.*;
import models.Pegawai;



@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorValue("PetugasPelayanan")
public class PetugasPelayanan extends Pegawai {
	private String bahasaDikuasai;

	public final String pekerjaan = "PetugasPelayanan";


	public void melayani() {
		throw new UnsupportedOperationException();
	}

	public String getBahasaDikuasai() {
		return this.bahasaDikuasai;
	}

	public void setBahasaDikuasai(String aBahasaDikuasai) {
		this.bahasaDikuasai = aBahasaDikuasai;
	}
}