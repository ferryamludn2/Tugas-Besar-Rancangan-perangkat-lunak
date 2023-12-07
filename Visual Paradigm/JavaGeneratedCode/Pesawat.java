public class Pesawat {
	private int _id;
	private String _namaPesawat;
	private String _asal;
	private String _tujuan;
	private int _jumlahKursi;
	private boolean _isPenuh;
	public Bandara _unnamed_Bandara_;

	public String getNamaPesawat() {
		return this._namaPesawat;
	}

	public void setNamaPesawat(String aNamaPesawat) {
		this._namaPesawat = aNamaPesawat;
	}

	public String getAsal() {
		return this._asal;
	}

	public void setAsal(String aAsal) {
		this._asal = aAsal;
	}

	public String getTujuan() {
		return this._tujuan;
	}

	public void setTujuan(String aTujuan) {
		this._tujuan = aTujuan;
	}

	public int getJumlahKursi() {
		return this._jumlahKursi;
	}

	public void setJumlahKursi(int aJumlahKursi) {
		this._jumlahKursi = aJumlahKursi;
	}

	public boolean getIsPenuh() {
		return this._isPenuh;
	}

	public void setIsPenuh(boolean aIsPenuh) {
		this._isPenuh = aIsPenuh;
	}
}