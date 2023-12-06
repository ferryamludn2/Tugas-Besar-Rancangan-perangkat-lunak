package models;

import play.*;
import play.db.jpa.*;
import play.data.validation.*;

import javax.persistence.*;
import java.util.List;

@Entity
public class Pembeli extends Model {

    @Required
    public String nama;

	@Required
	@MinSize(7)
    private String username;
	
	@Required
	@MinSize(10)
    private String password;
	
	@Required
    @Email
	private String email;
	
	@Required
    private String notelp;

    @OneToMany(mappedBy = "pembeli", cascade = CascadeType.ALL)
    public List<Tiket> tikets;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
		return this.username;
	}

	public void setUsername(String aUsername) {
		this.username = aUsername;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String aPassword) {
		this.password = aPassword;
	}

    public String getEmail() {
		return this.email;
	}

	public void setEmail(String aEmail) {
		this.email = aEmail;
	}

	public String getNotelp() {
		return this.notelp;
	}

	public void setNotelp(String aNotelp) {
		this.notelp = aNotelp;
	}

	
}

