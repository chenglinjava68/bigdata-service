package cn.com.enersun.data_center.bigdata_service.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TERMINAL_DEVICE_INFO database table.
 * 
 */
@Entity
@Table(name="TERMINAL_DEVICE_INFO")
public class TerminalEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;

	@Column(name="ACCESS_GATEWAY")
	private String accessGateway;

	@Column(name="ACCESS_IP")
	private String accessIp;

	@Column(name="ACCESS_PART")
	private String accessPart;

	@Column(name="ACCESS_WAY")
	private String accessWay;

	@Column(name="DEBUG_PERSON")
	private String debugPerson;

	@Column(name="DEVICE_MANUFACTURER")
	private String deviceManufacturer;

	@Column(name="EXT_SYS_TABLE")
	private String extSysTable;

	@Column(name="EXT_SYS_TB_ID")
	private String extSysTbId;

	@Column(name="FACTORY_NUM")
	private String factoryNum;

	@Column(name="FREQUENCY_UNIT")
	private String frequencyUnit;

	private String height;

	@Column(name="INSTALL_PERSON")
	private String installPerson;

	@Temporal(TemporalType.DATE)
	@Column(name="INSTALL_TIME")
	private Date installTime;

	@Column(name="IS_NWGY")
	private String isNwgy;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_RECEIVE_TIME")
	private Date lastReceiveTime;

	private String lat;

	private String lon;

	@Temporal(TemporalType.DATE)
	@Column(name="OPERATION_TIME")
	private Date operationTime;

	private String orgid;

	@Column(name="OWNER_TYPE")
	private String ownerType;

	@Temporal(TemporalType.DATE)
	@Column(name="PRODUCTION_DATE")
	private Date productionDate;

	@Column(name="RECEIVE_COUNT")
	private BigDecimal receiveCount;

	@Column(name="RECEIVE_FREQUENCY")
	private BigDecimal receiveFrequency;

	private String remark;

	@Column(name="SIM_NUM")
	private String simNum;

	private String status;

	@Column(name="SUBNET_MASK")
	private String subnetMask;

	@Column(name="TERMINAL_NAME")
	private String terminalName;

	@Column(name="TERMINAL_SPEC")
	private String terminalSpec;

	public TerminalEntity() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccessGateway() {
		return this.accessGateway;
	}

	public void setAccessGateway(String accessGateway) {
		this.accessGateway = accessGateway;
	}

	public String getAccessIp() {
		return this.accessIp;
	}

	public void setAccessIp(String accessIp) {
		this.accessIp = accessIp;
	}

	public String getAccessPart() {
		return this.accessPart;
	}

	public void setAccessPart(String accessPart) {
		this.accessPart = accessPart;
	}

	public String getAccessWay() {
		return this.accessWay;
	}

	public void setAccessWay(String accessWay) {
		this.accessWay = accessWay;
	}

	public String getDebugPerson() {
		return this.debugPerson;
	}

	public void setDebugPerson(String debugPerson) {
		this.debugPerson = debugPerson;
	}

	public String getDeviceManufacturer() {
		return this.deviceManufacturer;
	}

	public void setDeviceManufacturer(String deviceManufacturer) {
		this.deviceManufacturer = deviceManufacturer;
	}

	public String getExtSysTable() {
		return this.extSysTable;
	}

	public void setExtSysTable(String extSysTable) {
		this.extSysTable = extSysTable;
	}

	public String getExtSysTbId() {
		return this.extSysTbId;
	}

	public void setExtSysTbId(String extSysTbId) {
		this.extSysTbId = extSysTbId;
	}

	public String getFactoryNum() {
		return this.factoryNum;
	}

	public void setFactoryNum(String factoryNum) {
		this.factoryNum = factoryNum;
	}

	public String getFrequencyUnit() {
		return this.frequencyUnit;
	}

	public void setFrequencyUnit(String frequencyUnit) {
		this.frequencyUnit = frequencyUnit;
	}

	public String getHeight() {
		return this.height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getInstallPerson() {
		return this.installPerson;
	}

	public void setInstallPerson(String installPerson) {
		this.installPerson = installPerson;
	}

	public Date getInstallTime() {
		return this.installTime;
	}

	public void setInstallTime(Date installTime) {
		this.installTime = installTime;
	}

	public String getIsNwgy() {
		return this.isNwgy;
	}

	public void setIsNwgy(String isNwgy) {
		this.isNwgy = isNwgy;
	}

	public Date getLastReceiveTime() {
		return this.lastReceiveTime;
	}

	public void setLastReceiveTime(Date lastReceiveTime) {
		this.lastReceiveTime = lastReceiveTime;
	}

	public String getLat() {
		return this.lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		return this.lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public Date getOperationTime() {
		return this.operationTime;
	}

	public void setOperationTime(Date operationTime) {
		this.operationTime = operationTime;
	}

	public String getOrgid() {
		return this.orgid;
	}

	public void setOrgid(String orgid) {
		this.orgid = orgid;
	}

	public String getOwnerType() {
		return this.ownerType;
	}

	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

	public Date getProductionDate() {
		return this.productionDate;
	}

	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}

	public BigDecimal getReceiveCount() {
		return this.receiveCount;
	}

	public void setReceiveCount(BigDecimal receiveCount) {
		this.receiveCount = receiveCount;
	}

	public BigDecimal getReceiveFrequency() {
		return this.receiveFrequency;
	}

	public void setReceiveFrequency(BigDecimal receiveFrequency) {
		this.receiveFrequency = receiveFrequency;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSimNum() {
		return this.simNum;
	}

	public void setSimNum(String simNum) {
		this.simNum = simNum;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubnetMask() {
		return this.subnetMask;
	}

	public void setSubnetMask(String subnetMask) {
		this.subnetMask = subnetMask;
	}

	public String getTerminalName() {
		return this.terminalName;
	}

	public void setTerminalName(String terminalName) {
		this.terminalName = terminalName;
	}

	public String getTerminalSpec() {
		return this.terminalSpec;
	}

	public void setTerminalSpec(String terminalSpec) {
		this.terminalSpec = terminalSpec;
	}

}