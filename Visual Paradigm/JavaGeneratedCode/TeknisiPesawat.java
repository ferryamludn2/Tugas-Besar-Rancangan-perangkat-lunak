public class TeknisiPesawat extends Pegawai {
	private String _spesialisTeknis;

	public void periksaPesawat() {
		throw new UnsupportedOperationException();
	}

	public String getSpesialisTeknis() {
		return this._spesialisTeknis;
	}

	public void setSpesialisTeknis(String aSpesialisTeknis) {
		this._spesialisTeknis = aSpesialisTeknis;
	}
}