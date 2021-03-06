package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

/**
 * StgSysPropertiesId generated by hbm2java
 */
public class StgSysPropertiesId implements java.io.Serializable {

	private String propName;
	private Integer impId;
	private String host;
	private Integer propLong;
	private String propVarc;
	private String propComment;

	public StgSysPropertiesId() {
	}

	public StgSysPropertiesId(String propName, Integer impId, String host,
			Integer propLong, String propVarc, String propComment) {
		this.propName = propName;
		this.impId = impId;
		this.host = host;
		this.propLong = propLong;
		this.propVarc = propVarc;
		this.propComment = propComment;
	}

	public String getPropName() {
		return this.propName;
	}

	public void setPropName(String propName) {
		this.propName = propName;
	}

	public Integer getImpId() {
		return this.impId;
	}

	public void setImpId(Integer impId) {
		this.impId = impId;
	}

	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public Integer getPropLong() {
		return this.propLong;
	}

	public void setPropLong(Integer propLong) {
		this.propLong = propLong;
	}

	public String getPropVarc() {
		return this.propVarc;
	}

	public void setPropVarc(String propVarc) {
		this.propVarc = propVarc;
	}

	public String getPropComment() {
		return this.propComment;
	}

	public void setPropComment(String propComment) {
		this.propComment = propComment;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StgSysPropertiesId))
			return false;
		StgSysPropertiesId castOther = (StgSysPropertiesId) other;

		return ((this.getPropName() == castOther.getPropName()) || (this
				.getPropName() != null && castOther.getPropName() != null && this
				.getPropName().equals(castOther.getPropName())))
				&& ((this.getImpId() == castOther.getImpId()) || (this
						.getImpId() != null && castOther.getImpId() != null && this
						.getImpId().equals(castOther.getImpId())))
				&& ((this.getHost() == castOther.getHost()) || (this.getHost() != null
						&& castOther.getHost() != null && this.getHost()
						.equals(castOther.getHost())))
				&& ((this.getPropLong() == castOther.getPropLong()) || (this
						.getPropLong() != null
						&& castOther.getPropLong() != null && this
						.getPropLong().equals(castOther.getPropLong())))
				&& ((this.getPropVarc() == castOther.getPropVarc()) || (this
						.getPropVarc() != null
						&& castOther.getPropVarc() != null && this
						.getPropVarc().equals(castOther.getPropVarc())))
				&& ((this.getPropComment() == castOther.getPropComment()) || (this
						.getPropComment() != null
						&& castOther.getPropComment() != null && this
						.getPropComment().equals(castOther.getPropComment())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPropName() == null ? 0 : this.getPropName().hashCode());
		result = 37 * result
				+ (getImpId() == null ? 0 : this.getImpId().hashCode());
		result = 37 * result
				+ (getHost() == null ? 0 : this.getHost().hashCode());
		result = 37 * result
				+ (getPropLong() == null ? 0 : this.getPropLong().hashCode());
		result = 37 * result
				+ (getPropVarc() == null ? 0 : this.getPropVarc().hashCode());
		result = 37
				* result
				+ (getPropComment() == null ? 0 : this.getPropComment()
						.hashCode());
		return result;
	}

}
