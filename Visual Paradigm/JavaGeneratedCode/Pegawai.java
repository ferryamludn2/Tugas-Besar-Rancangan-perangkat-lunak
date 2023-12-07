public class Pegawai {
	protected int _id;
	protected String _nama;
	protected String _pekerjaan;
	protected int _totalJamKerja;
	protected boolean _isShiftPagi;
	protected boolean _isShiftMalam;
	public Bandara _unnamed_Bandara_;

	public String getNama() {
		return this._nama;
	}

	public void setNama(String aNama) {
		this._nama = aNama;
	}

	public String getPekerjaan() {
		return this._pekerjaan;
	}

	public void setPekerjaan(String aPekerjaan) {
		this._pekerjaan = aPekerjaan;
	}

	public int getTotalJamKerja() {
		return this._totalJamKerja;
	}

	public void setTotalJamKerja(int aTotalJamKerja) {
		this._totalJamKerja = aTotalJamKerja;
	}

	public boolean getIsShiftPagi() {
		return this._isShiftPagi;
	}

	public void setIsShiftPagi(boolean aIsShiftPagi) {
		this._isShiftPagi = aIsShiftPagi;
	}

	public boolean getIsShiftMalam() {
		return this._isShiftMalam;
	}

	public void setIsShiftMalam(boolean aIsShiftMalam) {
		this._isShiftMalam = aIsShiftMalam;
	}
}