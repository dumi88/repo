public class Vacuna {
	private String nom;
	private float efectivitat;
	private int durada;

	public Vacuna() {
		this.nom = " ";
		this.efectivitat = 0;
		this.durada = 0;
	}

	public Vacuna(String nom, float e, int d) {
		this.nom = nom;
		efectivitat = e;
		durada = d;
	}

	public String getNom() {
		return this.nom;
	}

	public float getEfectivitat() {
		return this.efectivitat;
	}

	public int getDurada() {
		return this.durada;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setEfectividad(float efectividad) {
		this.efectivitat = efectividad;
	}

	public void setDurada(int durada) {
		this.durada = durada;
	}

	// constructor copiador
	public Vacuna(Vacuna vacuna) {
		this.nom = vacuna.nom;
		this.efectivitat = vacuna.efectivitat;
		this.durada = vacuna.durada;

	}

	public String toString() {
		return "Nom: " + this.nom +"\n"+"Efectividad: "+this.efectivitat+"\n"+ "Duarda: "+ this.durada+ "\n"
	}

	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (o == null) {
			return false;
		}
		if (!(o instanceof Vacuna)) {
			return false;
		}
		Vacuna v = (Vacuna) o;
		if (v.getNom().equals(this.getNom()) && v.getEfectivitat().equals(this.getEfectivitat())
				&& v.getDurada().eqals(this.getDurada())) {
			return true;
		} else {
			return false;
		}
	}

}
