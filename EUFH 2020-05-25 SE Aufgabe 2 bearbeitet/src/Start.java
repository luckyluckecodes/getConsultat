
public class Start {

	private Benutzer[] benutzerverwaltung;
	
	public Start() {
		benutzerverwaltung = new Benutzer[10];
	}
	
	public static void main(String[] args) {
		Start start = new Start();
		String[] tmp = new String[10];
		start.benutzerAnlegen("Peter", "Datt", "datter", "aj1g233", tmp);
		start.benutzerverwaltung[0].freundeAdden("testuser123");
		start.ausgabe();
		System.out.println("\n");
		System.out.println("Das Passwort lautet: " + start.benutzerverwaltung[0].gibPasswort());
		start.benutzerverwaltung[0].passwortAendern("1234567876543");
		System.out.println("Das neue Passwort lautet: " + start.benutzerverwaltung[0].gibPasswort());
		System.out.println("\n");
	}
	
	public void benutzerAnlegen(String vorname, String nachname, String username, String passwort, String[] freunde) {
		Benutzer tmp = new Benutzer(vorname, nachname, username, passwort, freunde);
		for(int i = 0; i < 10; i++) {
			if(benutzerverwaltung[i] == null) {
				benutzerverwaltung[i] = tmp;
				i = 10;
			}
		}
	}
	
	
	public void ausgabe() {
		for(int i = 0; i < 10; i++) {
			System.out.println("\n");
			if(benutzerverwaltung[i] != null) {
				System.out.println("Benutzer " + (i+1) + ":");
				System.out.println("Vorname: " + benutzerverwaltung[i].gibVorname());
				System.out.println("Nachname" + benutzerverwaltung[i].gibNachname());
				System.out.println("Username: " + benutzerverwaltung[i].gibUsername());
				System.out.println("Freundesliste:");
				String[] tmp = benutzerverwaltung[i].gibFreunde();
				for(int j = 0; j < 10; j++) {
					if(tmp[j] != null) {
						System.out.println("- " + tmp[j]);
					}
				}
			}
			else {
				System.out.println("Benutzer " + i + ": Kein Benutzer angelegt");
			}
		}
	}
}
