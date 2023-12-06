package models;

import play.db.jpa.*;
import play.data.validation.*;


import javax.persistence.*;
import javax.validation.constraints.NotNull;


import models.Pembeli;

@Entity
public class Tiket extends Model {


    @ManyToOne
	@NotNull
	@Required
    private Bandara bandara;
    

    @ManyToOne
    @JoinColumn(name = "pembeli_id", foreignKey = @ForeignKey(name = "Orang_Tiket"))
    public Pembeli pembeli;

    private int harga;

    private String kursi;

    private String kelas;


    public Bandara getBandara() {
        return bandara;
    }

    public void setBandara(Bandara bandara) {
        this.bandara = bandara;
    }

    public int getHarga() {
		return this.harga;
	}

	public void setHarga(int aHarga) {
		this.harga = aHarga;
	}

    public String getKursi() {
		return this.kursi;
	}

	public void setKursi(String aKursi) {
		this.kursi = aKursi;
	}

    public String getKelas() {
		return this.kelas;
	}

	public void setKelas(String aKelas) {
		this.kelas = aKelas;
	}
  
}
