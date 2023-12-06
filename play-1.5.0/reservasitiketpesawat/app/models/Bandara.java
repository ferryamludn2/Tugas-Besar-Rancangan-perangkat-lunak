package models;

import play.db.jpa.*;

import javax.persistence.*;

@Entity
public class Bandara extends Model{

	private String namaBandara;
	private String lokasi;
	
	

	public String getNamaBandara() {
		return this.namaBandara;
	}

	public void setNamaBandara(String aNamaBandara) {
		this.namaBandara = aNamaBandara;
	}

	public String getLokasi() {
		return this.lokasi;
	}

	public void setLokasi(String aLokasi) {
		this.lokasi = aLokasi;
	}
}