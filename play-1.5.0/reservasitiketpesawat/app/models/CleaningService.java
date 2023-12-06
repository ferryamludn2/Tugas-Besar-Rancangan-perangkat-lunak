package models;
import play.*;
import play.db.jpa.*;
import play.data.validation.*;


import javax.persistence.*;
import javax.persistence.DiscriminatorValue;

import java.util.*;
import models.Pegawai;



@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorValue("CleaningService")
public class CleaningService extends Pegawai {
	@Required
	private String areaMembersihkan;

	public final String pekerjaan = "CleaningService";

	public void membersihkan() {
		throw new UnsupportedOperationException();
	}

	public String getAreaMembersihkan() {
		return this.areaMembersihkan;
	}

	public void setAreaMembersihkan(String aAreaMembersihkan) {
		this.areaMembersihkan = aAreaMembersihkan;
	}
}