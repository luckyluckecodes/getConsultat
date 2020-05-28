
public class Benutzer {

	private String vorname;
	private String nachname;
	private String username;
	private String passwort;
	private String[] freunde;
	
	public Benutzer(String vorname, String nachname, String username, String passwort, String[] freunde) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.username = username;
		this.passwort = passwort;
		this.freunde = freunde;
	}
	
	public void freundeAdden(String username) {
		for(int j = 0; j < 10; j++) {
			if(freunde[j] == null) {
				freunde[j] = username;
				j = 10;
			}
		}
	}
	
	public void passwortAendern(String passwort) {
		this.passwort = passwort;
	}
	
	public String gibVorname() {
		return vorname;
	}
	
	public String gibNachname() {
		return nachname;
	}
	
	public String gibUsername() {
		return username;
	}
	
	public String gibPasswort() {
		return passwort;
	}
	
	public String[] gibFreunde() {
		return freunde;
	}
}
