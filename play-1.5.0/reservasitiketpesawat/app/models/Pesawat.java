package models;

import play.db.jpa.*;
import play.data.validation.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Pesawat extends Model{
	private String namaPesawat;
	private String asal;
	private String tujuan;
	private int jumlahKursi;
	private boolean isPenuh;

	@ManyToOne
	@NotNull
	private Bandara bandara;

	public String getNamaPesawat() {
		return this.namaPesawat;
	}

	public void setNamaPesawat(String aNamaPesawat) {
		this.namaPesawat = aNamaPesawat;
	}

	public String getAsal() {
		return this.asal;
	}

	public void setAsal(String aAsal) {
		this.asal = aAsal;
	}

	public String getTujuan() {
		return this.tujuan;
	}

	public void setTujuan(String aTujuan) {
		this.tujuan = aTujuan;
	}

	public int getJumlahKursi() {
		return this.jumlahKursi;
	}

	public void setJumlahKursi(int aJumlahKursi) {
		this.jumlahKursi = aJumlahKursi;
	}

	public boolean getIsPenuh() {
		return this.isPenuh;
	}

	public void setIsPenuh(boolean aIsPenuh) {
		this.isPenuh = aIsPenuh;
	}

	public Bandara getBandara() {
        return bandara;
    }

    public void setBandara(Bandara bandara) {
        this.bandara = bandara;
    }
}