package models;
import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import javax.persistence.DiscriminatorValue;

import java.util.*;
import models.Pegawai;



@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorValue("TeknisiPesawat")
public class TeknisiPesawat extends Pegawai {
	private String spesialisTeknis;

	public final String pekerjaan = "TeknisiPesawat";

	public void periksaPesawat() {
		throw new UnsupportedOperationException();
	}

	public String getSpesialisTeknis() {
		return this.spesialisTeknis;
	}

	public void setSpesialisTeknis(String aSpesialisTeknis) {
		this.spesialisTeknis = aSpesialisTeknis;
	}
}