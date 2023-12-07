public class Tiket {
	private int _id;
	private float _harga;
	private String _asal;
	private String _nama;
	private String _kursi;
	private String _namaPembeli;
	private String _kelas;
	public Bandara _unnamed_Bandara_;
	public Pembeli _pembeli;

	public float getHarga() {
		return this._harga;
	}

	public void setHarga(float aHarga) {
		this._harga = aHarga;
	}

	public String getAsal() {
		return this._asal;
	}

	public void setAsal(String aAsal) {
		this._asal = aAsal;
	}

	public String getNama() {
		return this._nama;
	}

	public void setNama(String aNama) {
		this._nama = aNama;
	}

	public String getKursi() {
		return this._kursi;
	}

	public void setKursi(String aKursi) {
		this._kursi = aKursi;
	}

	public String getNamaPemesan() {
		throw new UnsupportedOperationException();
	}

	public void setNamaPemesan(String aNamaPemesan) {
		throw new UnsupportedOperationException();
	}

	public String getKelas() {
		return this._kelas;
	}

	public void setKelas(String aKelas) {
		this._kelas = aKelas;
	}
}