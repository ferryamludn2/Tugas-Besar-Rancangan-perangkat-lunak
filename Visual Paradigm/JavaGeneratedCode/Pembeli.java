import java.util.Vector;

public class Pembeli {
	private int _id;
	private String _username;
	private String _password;
	private String _nama;
	private String _email;
	private String _notelp;
	public Vector<Tiket> _tiket = new Vector<Tiket>();

	public String getUsername() {
		return this._username;
	}

	public void setUsername(String aUsername) {
		this._username = aUsername;
	}

	public String getPassword() {
		return this._password;
	}

	public void setPassword(String aPassword) {
		this._password = aPassword;
	}

	public String getNama() {
		return this._nama;
	}

	public void setNama(String aNama) {
		this._nama = aNama;
	}

	public String getEmail() {
		return this._email;
	}

	public void setEmail(String aEmail) {
		this._email = aEmail;
	}

	public String getNotelp() {
		return this._notelp;
	}

	public void setNotelp(String aNotelp) {
		this._notelp = aNotelp;
	}
}