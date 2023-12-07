public class PetugasKeamanan extends Pegawai {
	private String _areaJaga;

	public void melakukanPatroli() {
		throw new UnsupportedOperationException();
	}

	public void melakukanPemeriksaan() {
		throw new UnsupportedOperationException();
	}

	public String getAreaJaga() {
		return this._areaJaga;
	}

	public void setAreaJaga(String aAreaJaga) {
		this._areaJaga = aAreaJaga;
	}
}