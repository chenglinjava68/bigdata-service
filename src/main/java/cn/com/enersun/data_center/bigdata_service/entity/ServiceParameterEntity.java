package cn.com.enersun.data_center.bigdata_service.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the SERVICE_PARAMETERS database table.
 * 
 */
@Entity
@Table(name="SERVICE_PARAMETERS")
public class ServiceParameterEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CALL_TYPE")
	private int callType;

	@Column(name="CLASS_NAME")
	private String className;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private int id;

	@Column(name="KEY_CODE")
	private String keyCode;

	@Column(name="METHOD_NAME")
	private String methodName;

	@Column(name="OUT_TYPE")
	private int outType;

	@Column(name="QUIRY_MODE")
	private int quiryMode;

	@Column(name="SERVICE_NAME")
	private String serviceName;

	@Lob 
	@Basic(fetch = FetchType.LAZY) 
	@Column(name="SQL_STATEMENT", columnDefinition="CLOB", nullable=true)
	private String sqlStatement;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_TIME")
	private Date updateTime;

	@Column(name="VERSION_CODE")
	private String versionCode;

	public ServiceParameterEntity() {
	}

	
	public int getCallType() {
		return this.callType;
	}

	public void setCallType(int callType) {
		this.callType = callType;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKeyCode() {
		return this.keyCode ;
	}

	public void setKeyCode(String keyCode) {
		this.keyCode = keyCode;
	}

	public String getMethodName() {
		return this.methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public int getOutType() {
		return this.outType;
	}

	public void setOutType(int outType) {
		this.outType = outType;
	}

	public int getQuiryMode() {
		return this.quiryMode;
	}

	public void setQuiryMode(int quiryMode) {
		this.quiryMode = quiryMode;
	}
	
 
	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getSqlStatement() {
		return this.sqlStatement;
	}

	public void setSqlStatement(String sqlStatement) {
		this.sqlStatement = sqlStatement;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getVersionCode() {
		return this.versionCode;
	}

	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
	}

}