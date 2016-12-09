package cn.com.enersun.data_center.bigdata_service.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the DM_CLASSIFY database table.
 * 
 */
@Entity
@Table(name="DM_CLASSIFY")
public class ClassifyEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;

	@Column(name="BASEINFO_TYPEID")
	private String baseinfoTypeid;

	@Column(name="CLASSIFY_CODE")
	private String classifyCode;

	@Column(name="CLASSIFY_NAME")
	private String classifyName;

	@Column(name="CLASSIFY_TYPE")
	private int classifyType;

	@Column(name="DATA_FROM")
	private String dataFrom;

	@Column(name="FL_CLASSIFY_ID")
	private String flClassifyId;

	@Column(name="FL_OWNER_TYPE")
	private int flOwnerType;

	@Column(name="FULL_NAME")
	private String fullName;

	@Column(name="ICON_NAME")
	private String iconName;

	@Column(name="IS_ASSET_VALUE")
	private int isAssetValue;

	@Column(name="IS_CATALOG")
	private int isCatalog;

	@Column(name="IS_LEAF")
	private int isLeaf;

	@Column(name="IS_REAL_TYPE")
	private int isRealType;

	@Column(name="IS_SHOW")
	private int isShow;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_UPDATE_TIME")
	private Date lastUpdateTime;

	@Column(name="OPTIMISTIC_LOCK_VERSION")
	private int optimisticLockVersion;

	@Column(name="PARENT_CLASSIFY_ID")
	private String parentClassifyId;

	@Column(name="PROVINCE_CODE")
	private String provinceCode;

	private String remark;

	@Column(name="SEARCH_WORD")
	private String searchWord;

	@Column(name="SHOW_SERIAL_CODE")
	private String showSerialCode;

	@Column(name="SORT_NO")
	private int sortNo;

	@Column(name="TABLE_NAME")
	private String tableName;

	private String unit;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_TIME")
	private Date updateTime;

	@Column(name="USE_LIFE")
	private int useLife;

	public ClassifyEntity() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBaseinfoTypeid() {
		return this.baseinfoTypeid;
	}

	public void setBaseinfoTypeid(String baseinfoTypeid) {
		this.baseinfoTypeid = baseinfoTypeid;
	}

	public String getClassifyCode() {
		return this.classifyCode;
	}

	public void setClassifyCode(String classifyCode) {
		this.classifyCode = classifyCode;
	}

	public String getClassifyName() {
		return this.classifyName;
	}

	public void setClassifyName(String classifyName) {
		this.classifyName = classifyName;
	}

	public int getClassifyType() {
		return this.classifyType;
	}

	public void setClassifyType(int classifyType) {
		this.classifyType = classifyType;
	}

	public String getDataFrom() {
		return this.dataFrom;
	}

	public void setDataFrom(String dataFrom) {
		this.dataFrom = dataFrom;
	}

	public String getFlClassifyId() {
		return this.flClassifyId;
	}

	public void setFlClassifyId(String flClassifyId) {
		this.flClassifyId = flClassifyId;
	}

	public int getFlOwnerType() {
		return this.flOwnerType;
	}

	public void setFlOwnerType(int flOwnerType) {
		this.flOwnerType = flOwnerType;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getIconName() {
		return this.iconName;
	}

	public void setIconName(String iconName) {
		this.iconName = iconName;
	}

	public int getIsAssetValue() {
		return this.isAssetValue;
	}

	public void setIsAssetValue(int isAssetValue) {
		this.isAssetValue = isAssetValue;
	}

	public int getIsCatalog() {
		return this.isCatalog;
	}

	public void setIsCatalog(int isCatalog) {
		this.isCatalog = isCatalog;
	}

	public int getIsLeaf() {
		return this.isLeaf;
	}

	public void setIsLeaf(int isLeaf) {
		this.isLeaf = isLeaf;
	}

	public int getIsRealType() {
		return this.isRealType;
	}

	public void setIsRealType(int isRealType) {
		this.isRealType = isRealType;
	}

	public int getIsShow() {
		return this.isShow;
	}

	public void setIsShow(int isShow) {
		this.isShow = isShow;
	}

	public Date getLastUpdateTime() {
		return this.lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public int getOptimisticLockVersion() {
		return this.optimisticLockVersion;
	}

	public void setOptimisticLockVersion(int optimisticLockVersion) {
		this.optimisticLockVersion = optimisticLockVersion;
	}

	public String getParentClassifyId() {
		return this.parentClassifyId;
	}

	public void setParentClassifyId(String parentClassifyId) {
		this.parentClassifyId = parentClassifyId;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSearchWord() {
		return this.searchWord;
	}

	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}

	public String getShowSerialCode() {
		return this.showSerialCode;
	}

	public void setShowSerialCode(String showSerialCode) {
		this.showSerialCode = showSerialCode;
	}

	public int getSortNo() {
		return this.sortNo;
	}

	public void setSortNo(int sortNo) {
		this.sortNo = sortNo;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public int getUseLife() {
		return this.useLife;
	}

	public void setUseLife(int useLife) {
		this.useLife = useLife;
	}

}