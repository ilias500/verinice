package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

/**
 * DtsStepTxt generated by hbm2java
 */
public class DtsStepTxt implements java.io.Serializable {

	private DtsStepTxtId id;
	private DtsStep dtsStep;
	private String beschreibung;
	private String fehler;

	public DtsStepTxt() {
	}

	public DtsStepTxt(DtsStepTxtId id, DtsStep dtsStep) {
		this.id = id;
		this.dtsStep = dtsStep;
	}

	public DtsStepTxt(DtsStepTxtId id, DtsStep dtsStep, String beschreibung,
			String fehler) {
		this.id = id;
		this.dtsStep = dtsStep;
		this.beschreibung = beschreibung;
		this.fehler = fehler;
	}

	public DtsStepTxtId getId() {
		return this.id;
	}

	public void setId(DtsStepTxtId id) {
		this.id = id;
	}

	public DtsStep getDtsStep() {
		return this.dtsStep;
	}

	public void setDtsStep(DtsStep dtsStep) {
		this.dtsStep = dtsStep;
	}

	public String getBeschreibung() {
		return this.beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public String getFehler() {
		return this.fehler;
	}

	public void setFehler(String fehler) {
		this.fehler = fehler;
	}

}
