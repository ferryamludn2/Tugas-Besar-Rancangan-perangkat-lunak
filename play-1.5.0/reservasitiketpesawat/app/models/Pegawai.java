package models;

import play.*;
import play.db.jpa.*;
import play.data.validation.*;

import javax.persistence.*;

import javax.validation.constraints.NotNull;
import javax.xml.ws.RequestWrapper;

import java.util.List;


@Entity
public class Pegawai extends Model {
	@Required
	protected String nama;

	protected String pekerjaan;
	protected int totalJamKerja;
	protected boolean isShiftPagi;
	protected boolean isShiftMalam;

	@ManyToOne
	@NotNull
	@Required
	private Bandara bandara;



	public String getNama() {
		return this.nama;
	}

	public void setNama(String aNama) {
		this.nama = aNama;
	}

	public String getPekerjaan() {
		return this.pekerjaan;
	}

	public void setPekerjaan(String aPekerjaan) {
		this.pekerjaan = aPekerjaan;
	}

	public int getTotalJamKerja() {
		return this.totalJamKerja;
	}

	public void setTotalJamKerja(int aTotalJamKerja) {
		this.totalJamKerja = aTotalJamKerja;
	}

	public boolean getIsShiftPagi() {
		return this.isShiftPagi;
	}

	public void setIsShiftPagi(boolean aIsShiftPagi) {
		this.isShiftPagi = aIsShiftPagi;
	}

	public boolean getIsShiftMalam() {
		return this.isShiftMalam;
	}

	public void setIsShiftMalam(boolean aIsShiftMalam) {
		this.isShiftMalam = aIsShiftMalam;
	}

	public Bandara getBandara() {
        return bandara;
    }

    public void setBandara(Bandara bandara) {
        this.bandara = bandara;
    }
}