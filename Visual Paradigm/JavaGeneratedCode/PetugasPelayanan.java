public class PetugasPelayanan extends Pegawai {
	private String _bahasaDikuasai;

	public void melayani() {
		throw new UnsupportedOperationException();
	}

	public String getBahasaDikuasai() {
		return this._bahasaDikuasai;
	}

	public void setBahasaDikuasai(String aBahasaDikuasai) {
		this._bahasaDikuasai = aBahasaDikuasai;
	}
}