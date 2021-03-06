package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * StgMbMasGefId generated by hbm2java
 */
public class StgMbMasGefId implements java.io.Serializable {

	private Integer impId;
	private Integer masId;
	private Integer masImpId;
	private Integer gefId;
	private Integer gefImpId;
	private Byte sbkIdVertr;
	private Byte sbkIdVerf;
	private Byte sbkIdInteg;
	private Byte sbkIdGesamt;
	private Byte sbkIdPers;
	private Integer persDaten;
	private Byte type;
	private Integer metaVers;
	private Byte metaNeu;
	private Integer obsoletVers;
	private Date erfasstAm;
	private String erfasstDurch;
	private Date geloeschtAm;
	private String geloeschtDurch;
	private String guid;
	private String guidOrg;
	private Byte impNeu;
	private Integer usn;
	private String changedBy;
	private Date changedOn;
	private Byte g2mAutenSbkId;
	private Byte g2mRevisSbkId;
	private Byte g2mTransSbkId;

	public StgMbMasGefId() {
	}

	public StgMbMasGefId(Integer impId, Integer masId, Integer masImpId,
			Integer gefId, Integer gefImpId, Byte sbkIdVertr, Byte sbkIdVerf,
			Byte sbkIdInteg, Byte sbkIdGesamt, Byte sbkIdPers,
			Integer persDaten, Byte type, Integer metaVers, Byte metaNeu,
			Integer obsoletVers, Date erfasstAm, String erfasstDurch,
			Date geloeschtAm, String geloeschtDurch, String guid,
			String guidOrg, Byte impNeu, Integer usn, String changedBy,
			Date changedOn, Byte g2mAutenSbkId, Byte g2mRevisSbkId,
			Byte g2mTransSbkId) {
		this.impId = impId;
		this.masId = masId;
		this.masImpId = masImpId;
		this.gefId = gefId;
		this.gefImpId = gefImpId;
		this.sbkIdVertr = sbkIdVertr;
		this.sbkIdVerf = sbkIdVerf;
		this.sbkIdInteg = sbkIdInteg;
		this.sbkIdGesamt = sbkIdGesamt;
		this.sbkIdPers = sbkIdPers;
		this.persDaten = persDaten;
		this.type = type;
		this.metaVers = metaVers;
		this.metaNeu = metaNeu;
		this.obsoletVers = obsoletVers;
		this.erfasstAm = erfasstAm;
		this.erfasstDurch = erfasstDurch;
		this.geloeschtAm = geloeschtAm;
		this.geloeschtDurch = geloeschtDurch;
		this.guid = guid;
		this.guidOrg = guidOrg;
		this.impNeu = impNeu;
		this.usn = usn;
		this.changedBy = changedBy;
		this.changedOn = changedOn;
		this.g2mAutenSbkId = g2mAutenSbkId;
		this.g2mRevisSbkId = g2mRevisSbkId;
		this.g2mTransSbkId = g2mTransSbkId;
	}

	public Integer getImpId() {
		return this.impId;
	}

	public void setImpId(Integer impId) {
		this.impId = impId;
	}

	public Integer getMasId() {
		return this.masId;
	}

	public void setMasId(Integer masId) {
		this.masId = masId;
	}

	public Integer getMasImpId() {
		return this.masImpId;
	}

	public void setMasImpId(Integer masImpId) {
		this.masImpId = masImpId;
	}

	public Integer getGefId() {
		return this.gefId;
	}

	public void setGefId(Integer gefId) {
		this.gefId = gefId;
	}

	public Integer getGefImpId() {
		return this.gefImpId;
	}

	public void setGefImpId(Integer gefImpId) {
		this.gefImpId = gefImpId;
	}

	public Byte getSbkIdVertr() {
		return this.sbkIdVertr;
	}

	public void setSbkIdVertr(Byte sbkIdVertr) {
		this.sbkIdVertr = sbkIdVertr;
	}

	public Byte getSbkIdVerf() {
		return this.sbkIdVerf;
	}

	public void setSbkIdVerf(Byte sbkIdVerf) {
		this.sbkIdVerf = sbkIdVerf;
	}

	public Byte getSbkIdInteg() {
		return this.sbkIdInteg;
	}

	public void setSbkIdInteg(Byte sbkIdInteg) {
		this.sbkIdInteg = sbkIdInteg;
	}

	public Byte getSbkIdGesamt() {
		return this.sbkIdGesamt;
	}

	public void setSbkIdGesamt(Byte sbkIdGesamt) {
		this.sbkIdGesamt = sbkIdGesamt;
	}

	public Byte getSbkIdPers() {
		return this.sbkIdPers;
	}

	public void setSbkIdPers(Byte sbkIdPers) {
		this.sbkIdPers = sbkIdPers;
	}

	public Integer getPersDaten() {
		return this.persDaten;
	}

	public void setPersDaten(Integer persDaten) {
		this.persDaten = persDaten;
	}

	public Byte getType() {
		return this.type;
	}

	public void setType(Byte type) {
		this.type = type;
	}

	public Integer getMetaVers() {
		return this.metaVers;
	}

	public void setMetaVers(Integer metaVers) {
		this.metaVers = metaVers;
	}

	public Byte getMetaNeu() {
		return this.metaNeu;
	}

	public void setMetaNeu(Byte metaNeu) {
		this.metaNeu = metaNeu;
	}

	public Integer getObsoletVers() {
		return this.obsoletVers;
	}

	public void setObsoletVers(Integer obsoletVers) {
		this.obsoletVers = obsoletVers;
	}

	public Date getErfasstAm() {
		return this.erfasstAm;
	}

	public void setErfasstAm(Date erfasstAm) {
		this.erfasstAm = erfasstAm;
	}

	public String getErfasstDurch() {
		return this.erfasstDurch;
	}

	public void setErfasstDurch(String erfasstDurch) {
		this.erfasstDurch = erfasstDurch;
	}

	public Date getGeloeschtAm() {
		return this.geloeschtAm;
	}

	public void setGeloeschtAm(Date geloeschtAm) {
		this.geloeschtAm = geloeschtAm;
	}

	public String getGeloeschtDurch() {
		return this.geloeschtDurch;
	}

	public void setGeloeschtDurch(String geloeschtDurch) {
		this.geloeschtDurch = geloeschtDurch;
	}

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getGuidOrg() {
		return this.guidOrg;
	}

	public void setGuidOrg(String guidOrg) {
		this.guidOrg = guidOrg;
	}

	public Byte getImpNeu() {
		return this.impNeu;
	}

	public void setImpNeu(Byte impNeu) {
		this.impNeu = impNeu;
	}

	public Integer getUsn() {
		return this.usn;
	}

	public void setUsn(Integer usn) {
		this.usn = usn;
	}

	public String getChangedBy() {
		return this.changedBy;
	}

	public void setChangedBy(String changedBy) {
		this.changedBy = changedBy;
	}

	public Date getChangedOn() {
		return this.changedOn;
	}

	public void setChangedOn(Date changedOn) {
		this.changedOn = changedOn;
	}

	public Byte getG2mAutenSbkId() {
		return this.g2mAutenSbkId;
	}

	public void setG2mAutenSbkId(Byte g2mAutenSbkId) {
		this.g2mAutenSbkId = g2mAutenSbkId;
	}

	public Byte getG2mRevisSbkId() {
		return this.g2mRevisSbkId;
	}

	public void setG2mRevisSbkId(Byte g2mRevisSbkId) {
		this.g2mRevisSbkId = g2mRevisSbkId;
	}

	public Byte getG2mTransSbkId() {
		return this.g2mTransSbkId;
	}

	public void setG2mTransSbkId(Byte g2mTransSbkId) {
		this.g2mTransSbkId = g2mTransSbkId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StgMbMasGefId))
			return false;
		StgMbMasGefId castOther = (StgMbMasGefId) other;

		return ((this.getImpId() == castOther.getImpId()) || (this.getImpId() != null
				&& castOther.getImpId() != null && this.getImpId().equals(
				castOther.getImpId())))
				&& ((this.getMasId() == castOther.getMasId()) || (this
						.getMasId() != null && castOther.getMasId() != null && this
						.getMasId().equals(castOther.getMasId())))
				&& ((this.getMasImpId() == castOther.getMasImpId()) || (this
						.getMasImpId() != null
						&& castOther.getMasImpId() != null && this
						.getMasImpId().equals(castOther.getMasImpId())))
				&& ((this.getGefId() == castOther.getGefId()) || (this
						.getGefId() != null && castOther.getGefId() != null && this
						.getGefId().equals(castOther.getGefId())))
				&& ((this.getGefImpId() == castOther.getGefImpId()) || (this
						.getGefImpId() != null
						&& castOther.getGefImpId() != null && this
						.getGefImpId().equals(castOther.getGefImpId())))
				&& ((this.getSbkIdVertr() == castOther.getSbkIdVertr()) || (this
						.getSbkIdVertr() != null
						&& castOther.getSbkIdVertr() != null && this
						.getSbkIdVertr().equals(castOther.getSbkIdVertr())))
				&& ((this.getSbkIdVerf() == castOther.getSbkIdVerf()) || (this
						.getSbkIdVerf() != null
						&& castOther.getSbkIdVerf() != null && this
						.getSbkIdVerf().equals(castOther.getSbkIdVerf())))
				&& ((this.getSbkIdInteg() == castOther.getSbkIdInteg()) || (this
						.getSbkIdInteg() != null
						&& castOther.getSbkIdInteg() != null && this
						.getSbkIdInteg().equals(castOther.getSbkIdInteg())))
				&& ((this.getSbkIdGesamt() == castOther.getSbkIdGesamt()) || (this
						.getSbkIdGesamt() != null
						&& castOther.getSbkIdGesamt() != null && this
						.getSbkIdGesamt().equals(castOther.getSbkIdGesamt())))
				&& ((this.getSbkIdPers() == castOther.getSbkIdPers()) || (this
						.getSbkIdPers() != null
						&& castOther.getSbkIdPers() != null && this
						.getSbkIdPers().equals(castOther.getSbkIdPers())))
				&& ((this.getPersDaten() == castOther.getPersDaten()) || (this
						.getPersDaten() != null
						&& castOther.getPersDaten() != null && this
						.getPersDaten().equals(castOther.getPersDaten())))
				&& ((this.getType() == castOther.getType()) || (this.getType() != null
						&& castOther.getType() != null && this.getType()
						.equals(castOther.getType())))
				&& ((this.getMetaVers() == castOther.getMetaVers()) || (this
						.getMetaVers() != null
						&& castOther.getMetaVers() != null && this
						.getMetaVers().equals(castOther.getMetaVers())))
				&& ((this.getMetaNeu() == castOther.getMetaNeu()) || (this
						.getMetaNeu() != null && castOther.getMetaNeu() != null && this
						.getMetaNeu().equals(castOther.getMetaNeu())))
				&& ((this.getObsoletVers() == castOther.getObsoletVers()) || (this
						.getObsoletVers() != null
						&& castOther.getObsoletVers() != null && this
						.getObsoletVers().equals(castOther.getObsoletVers())))
				&& ((this.getErfasstAm() == castOther.getErfasstAm()) || (this
						.getErfasstAm() != null
						&& castOther.getErfasstAm() != null && this
						.getErfasstAm().equals(castOther.getErfasstAm())))
				&& ((this.getErfasstDurch() == castOther.getErfasstDurch()) || (this
						.getErfasstDurch() != null
						&& castOther.getErfasstDurch() != null && this
						.getErfasstDurch().equals(castOther.getErfasstDurch())))
				&& ((this.getGeloeschtAm() == castOther.getGeloeschtAm()) || (this
						.getGeloeschtAm() != null
						&& castOther.getGeloeschtAm() != null && this
						.getGeloeschtAm().equals(castOther.getGeloeschtAm())))
				&& ((this.getGeloeschtDurch() == castOther.getGeloeschtDurch()) || (this
						.getGeloeschtDurch() != null
						&& castOther.getGeloeschtDurch() != null && this
						.getGeloeschtDurch().equals(
								castOther.getGeloeschtDurch())))
				&& ((this.getGuid() == castOther.getGuid()) || (this.getGuid() != null
						&& castOther.getGuid() != null && this.getGuid()
						.equals(castOther.getGuid())))
				&& ((this.getGuidOrg() == castOther.getGuidOrg()) || (this
						.getGuidOrg() != null && castOther.getGuidOrg() != null && this
						.getGuidOrg().equals(castOther.getGuidOrg())))
				&& ((this.getImpNeu() == castOther.getImpNeu()) || (this
						.getImpNeu() != null && castOther.getImpNeu() != null && this
						.getImpNeu().equals(castOther.getImpNeu())))
				&& ((this.getUsn() == castOther.getUsn()) || (this.getUsn() != null
						&& castOther.getUsn() != null && this.getUsn().equals(
						castOther.getUsn())))
				&& ((this.getChangedBy() == castOther.getChangedBy()) || (this
						.getChangedBy() != null
						&& castOther.getChangedBy() != null && this
						.getChangedBy().equals(castOther.getChangedBy())))
				&& ((this.getChangedOn() == castOther.getChangedOn()) || (this
						.getChangedOn() != null
						&& castOther.getChangedOn() != null && this
						.getChangedOn().equals(castOther.getChangedOn())))
				&& ((this.getG2mAutenSbkId() == castOther.getG2mAutenSbkId()) || (this
						.getG2mAutenSbkId() != null
						&& castOther.getG2mAutenSbkId() != null && this
						.getG2mAutenSbkId()
						.equals(castOther.getG2mAutenSbkId())))
				&& ((this.getG2mRevisSbkId() == castOther.getG2mRevisSbkId()) || (this
						.getG2mRevisSbkId() != null
						&& castOther.getG2mRevisSbkId() != null && this
						.getG2mRevisSbkId()
						.equals(castOther.getG2mRevisSbkId())))
				&& ((this.getG2mTransSbkId() == castOther.getG2mTransSbkId()) || (this
						.getG2mTransSbkId() != null
						&& castOther.getG2mTransSbkId() != null && this
						.getG2mTransSbkId()
						.equals(castOther.getG2mTransSbkId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getImpId() == null ? 0 : this.getImpId().hashCode());
		result = 37 * result
				+ (getMasId() == null ? 0 : this.getMasId().hashCode());
		result = 37 * result
				+ (getMasImpId() == null ? 0 : this.getMasImpId().hashCode());
		result = 37 * result
				+ (getGefId() == null ? 0 : this.getGefId().hashCode());
		result = 37 * result
				+ (getGefImpId() == null ? 0 : this.getGefImpId().hashCode());
		result = 37
				* result
				+ (getSbkIdVertr() == null ? 0 : this.getSbkIdVertr()
						.hashCode());
		result = 37 * result
				+ (getSbkIdVerf() == null ? 0 : this.getSbkIdVerf().hashCode());
		result = 37
				* result
				+ (getSbkIdInteg() == null ? 0 : this.getSbkIdInteg()
						.hashCode());
		result = 37
				* result
				+ (getSbkIdGesamt() == null ? 0 : this.getSbkIdGesamt()
						.hashCode());
		result = 37 * result
				+ (getSbkIdPers() == null ? 0 : this.getSbkIdPers().hashCode());
		result = 37 * result
				+ (getPersDaten() == null ? 0 : this.getPersDaten().hashCode());
		result = 37 * result
				+ (getType() == null ? 0 : this.getType().hashCode());
		result = 37 * result
				+ (getMetaVers() == null ? 0 : this.getMetaVers().hashCode());
		result = 37 * result
				+ (getMetaNeu() == null ? 0 : this.getMetaNeu().hashCode());
		result = 37
				* result
				+ (getObsoletVers() == null ? 0 : this.getObsoletVers()
						.hashCode());
		result = 37 * result
				+ (getErfasstAm() == null ? 0 : this.getErfasstAm().hashCode());
		result = 37
				* result
				+ (getErfasstDurch() == null ? 0 : this.getErfasstDurch()
						.hashCode());
		result = 37
				* result
				+ (getGeloeschtAm() == null ? 0 : this.getGeloeschtAm()
						.hashCode());
		result = 37
				* result
				+ (getGeloeschtDurch() == null ? 0 : this.getGeloeschtDurch()
						.hashCode());
		result = 37 * result
				+ (getGuid() == null ? 0 : this.getGuid().hashCode());
		result = 37 * result
				+ (getGuidOrg() == null ? 0 : this.getGuidOrg().hashCode());
		result = 37 * result
				+ (getImpNeu() == null ? 0 : this.getImpNeu().hashCode());
		result = 37 * result
				+ (getUsn() == null ? 0 : this.getUsn().hashCode());
		result = 37 * result
				+ (getChangedBy() == null ? 0 : this.getChangedBy().hashCode());
		result = 37 * result
				+ (getChangedOn() == null ? 0 : this.getChangedOn().hashCode());
		result = 37
				* result
				+ (getG2mAutenSbkId() == null ? 0 : this.getG2mAutenSbkId()
						.hashCode());
		result = 37
				* result
				+ (getG2mRevisSbkId() == null ? 0 : this.getG2mRevisSbkId()
						.hashCode());
		result = 37
				* result
				+ (getG2mTransSbkId() == null ? 0 : this.getG2mTransSbkId()
						.hashCode());
		return result;
	}

}
