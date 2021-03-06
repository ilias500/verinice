package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

/**
 * StgFilterVorschlagId generated by hbm2java
 */
public class StgFilterVorschlagId implements java.io.Serializable {

	private Integer frsId;
	private Byte anzahlSpalten;
	private String storedProcedure;
	private String type;
	private String spalte1;
	private String spalte2;
	private String spalte3;
	private String anzeige;
	private String tableCompare;
	private String kommentar;

	public StgFilterVorschlagId() {
	}

	public StgFilterVorschlagId(Integer frsId, Byte anzahlSpalten,
			String storedProcedure, String type, String spalte1,
			String spalte2, String spalte3, String anzeige,
			String tableCompare, String kommentar) {
		this.frsId = frsId;
		this.anzahlSpalten = anzahlSpalten;
		this.storedProcedure = storedProcedure;
		this.type = type;
		this.spalte1 = spalte1;
		this.spalte2 = spalte2;
		this.spalte3 = spalte3;
		this.anzeige = anzeige;
		this.tableCompare = tableCompare;
		this.kommentar = kommentar;
	}

	public Integer getFrsId() {
		return this.frsId;
	}

	public void setFrsId(Integer frsId) {
		this.frsId = frsId;
	}

	public Byte getAnzahlSpalten() {
		return this.anzahlSpalten;
	}

	public void setAnzahlSpalten(Byte anzahlSpalten) {
		this.anzahlSpalten = anzahlSpalten;
	}

	public String getStoredProcedure() {
		return this.storedProcedure;
	}

	public void setStoredProcedure(String storedProcedure) {
		this.storedProcedure = storedProcedure;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSpalte1() {
		return this.spalte1;
	}

	public void setSpalte1(String spalte1) {
		this.spalte1 = spalte1;
	}

	public String getSpalte2() {
		return this.spalte2;
	}

	public void setSpalte2(String spalte2) {
		this.spalte2 = spalte2;
	}

	public String getSpalte3() {
		return this.spalte3;
	}

	public void setSpalte3(String spalte3) {
		this.spalte3 = spalte3;
	}

	public String getAnzeige() {
		return this.anzeige;
	}

	public void setAnzeige(String anzeige) {
		this.anzeige = anzeige;
	}

	public String getTableCompare() {
		return this.tableCompare;
	}

	public void setTableCompare(String tableCompare) {
		this.tableCompare = tableCompare;
	}

	public String getKommentar() {
		return this.kommentar;
	}

	public void setKommentar(String kommentar) {
		this.kommentar = kommentar;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StgFilterVorschlagId))
			return false;
		StgFilterVorschlagId castOther = (StgFilterVorschlagId) other;

		return ((this.getFrsId() == castOther.getFrsId()) || (this.getFrsId() != null
				&& castOther.getFrsId() != null && this.getFrsId().equals(
				castOther.getFrsId())))
				&& ((this.getAnzahlSpalten() == castOther.getAnzahlSpalten()) || (this
						.getAnzahlSpalten() != null
						&& castOther.getAnzahlSpalten() != null && this
						.getAnzahlSpalten()
						.equals(castOther.getAnzahlSpalten())))
				&& ((this.getStoredProcedure() == castOther
						.getStoredProcedure()) || (this.getStoredProcedure() != null
						&& castOther.getStoredProcedure() != null && this
						.getStoredProcedure().equals(
								castOther.getStoredProcedure())))
				&& ((this.getType() == castOther.getType()) || (this.getType() != null
						&& castOther.getType() != null && this.getType()
						.equals(castOther.getType())))
				&& ((this.getSpalte1() == castOther.getSpalte1()) || (this
						.getSpalte1() != null && castOther.getSpalte1() != null && this
						.getSpalte1().equals(castOther.getSpalte1())))
				&& ((this.getSpalte2() == castOther.getSpalte2()) || (this
						.getSpalte2() != null && castOther.getSpalte2() != null && this
						.getSpalte2().equals(castOther.getSpalte2())))
				&& ((this.getSpalte3() == castOther.getSpalte3()) || (this
						.getSpalte3() != null && castOther.getSpalte3() != null && this
						.getSpalte3().equals(castOther.getSpalte3())))
				&& ((this.getAnzeige() == castOther.getAnzeige()) || (this
						.getAnzeige() != null && castOther.getAnzeige() != null && this
						.getAnzeige().equals(castOther.getAnzeige())))
				&& ((this.getTableCompare() == castOther.getTableCompare()) || (this
						.getTableCompare() != null
						&& castOther.getTableCompare() != null && this
						.getTableCompare().equals(castOther.getTableCompare())))
				&& ((this.getKommentar() == castOther.getKommentar()) || (this
						.getKommentar() != null
						&& castOther.getKommentar() != null && this
						.getKommentar().equals(castOther.getKommentar())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFrsId() == null ? 0 : this.getFrsId().hashCode());
		result = 37
				* result
				+ (getAnzahlSpalten() == null ? 0 : this.getAnzahlSpalten()
						.hashCode());
		result = 37
				* result
				+ (getStoredProcedure() == null ? 0 : this.getStoredProcedure()
						.hashCode());
		result = 37 * result
				+ (getType() == null ? 0 : this.getType().hashCode());
		result = 37 * result
				+ (getSpalte1() == null ? 0 : this.getSpalte1().hashCode());
		result = 37 * result
				+ (getSpalte2() == null ? 0 : this.getSpalte2().hashCode());
		result = 37 * result
				+ (getSpalte3() == null ? 0 : this.getSpalte3().hashCode());
		result = 37 * result
				+ (getAnzeige() == null ? 0 : this.getAnzeige().hashCode());
		result = 37
				* result
				+ (getTableCompare() == null ? 0 : this.getTableCompare()
						.hashCode());
		result = 37 * result
				+ (getKommentar() == null ? 0 : this.getKommentar().hashCode());
		return result;
	}

}
