package cn.com.enersun.data_center.bigdata_service.entity;

import java.io.Serializable;


/**
 * 
* @ClassName: Defects 
* @Description: TODO(缺陷对象) 
* @author enersun_lhb 
* @date 2016年6月8日 上午10:00:41 
*
 */


public class DefectEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private String id;
	
	private String orgname;

	private String sitename;
	
	private String defectlevel;
	
	private String specialitytype;
	
	private String devicename;
	
	private String partsname;

	private String functionlocationname;
	
	private String voltagelevel;

	private String findtime;
	
	private String defectphenomenon;
	
	private String defectdesc;

	private String defecttypename;

	private String createdate;
	
	private String oughtdealtime;

	private String overtime;

	private String oughttime;
	
	private String dealtime;
	
	private String dealdesc;
	
	private String vendorname;
	
	private String modelname;
	
	private String defectcause;
	
	private String defectposition;

	private String solutiondesc;
	
	private String flowstate;
	
	private String state;
	
	private String devicereleasedate;
	
	private String devicerundate;

	public DefectEntity(){}
  
	public DefectEntity(String id, String orgname, String sitename, String defectlevel, String specialitytype,
			String devicename, String partsname, String functionlocationname, String voltagelevel, String findtime,
			String defectphenomenon, String defectdesc, String defecttypename, String createdate, String oughtdealtime,
			String overtime, String oughttime, String dealtime, String dealdesc, String vendorname, String modelname,
			String defectcause, String defectposition, String solutiondesc, String flowstate, String state,
			String devicereleasedate, String devicerundate) {
		super();
		this.id = id;
		this.orgname = orgname;
		this.sitename = sitename;
		this.defectlevel = defectlevel;
		this.specialitytype = specialitytype;
		this.devicename = devicename;
		this.partsname = partsname;
		this.functionlocationname = functionlocationname;
		this.voltagelevel = voltagelevel;
		this.findtime = findtime;
		this.defectphenomenon = defectphenomenon;
		this.defectdesc = defectdesc;
		this.defecttypename = defecttypename;
		this.createdate = createdate;
		this.oughtdealtime = oughtdealtime;
		this.overtime = overtime;
		this.oughttime = oughttime;
		this.dealtime = dealtime;
		this.dealdesc = dealdesc;
		this.vendorname = vendorname;
		this.modelname = modelname;
		this.defectcause = defectcause;
		this.defectposition = defectposition;
		this.solutiondesc = solutiondesc;
		this.flowstate = flowstate;
		this.state = state;
		this.devicereleasedate = devicereleasedate;
		this.devicerundate = devicerundate;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getOrgname() {
		return orgname;
	}


	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}


	public String getSitename() {
		return sitename;
	}


	public void setSitename(String sitename) {
		this.sitename = sitename;
	}


	public String getDefectlevel() {
		return defectlevel;
	}


	public void setDefectlevel(String defectlevel) {
		this.defectlevel = defectlevel;
	}


	public String getSpecialitytype() {
		return specialitytype;
	}


	public void setSpecialitytype(String specialitytype) {
		this.specialitytype = specialitytype;
	}


	public String getDevicename() {
		return devicename;
	}


	public void setDevicename(String devicename) {
		this.devicename = devicename;
	}


	public String getPartsname() {
		return partsname;
	}


	public void setPartsname(String partsname) {
		this.partsname = partsname;
	}


	public String getFunctionlocationname() {
		return functionlocationname;
	}


	public void setFunctionlocationname(String functionlocationname) {
		this.functionlocationname = functionlocationname;
	}


	public String getVoltagelevel() {
		return voltagelevel;
	}


	public void setVoltagelevel(String voltagelevel) {
		this.voltagelevel = voltagelevel;
	}


	public String getFindtime() {
		return findtime;
	}


	public void setFindtime(String findtime) {
		this.findtime = findtime;
	}


	public String getDefectphenomenon() {
		return defectphenomenon;
	}


	public void setDefectphenomenon(String defectphenomenon) {
		this.defectphenomenon = defectphenomenon;
	}


	public String getDefectdesc() {
		return defectdesc;
	}


	public void setDefectdesc(String defectdesc) {
		this.defectdesc = defectdesc;
	}


	public String getDefecttypename() {
		return defecttypename;
	}


	public void setDefecttypename(String defecttypename) {
		this.defecttypename = defecttypename;
	}


	public String getCreatedate() {
		return createdate;
	}


	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}


	public String getOughtdealtime() {
		return oughtdealtime;
	}


	public void setOughtdealtime(String oughtdealtime) {
		this.oughtdealtime = oughtdealtime;
	}


	public String getOvertime() {
		return overtime;
	}


	public void setOvertime(String overtime) {
		this.overtime = overtime;
	}


	public String getOughttime() {
		return oughttime;
	}


	public void setOughttime(String oughttime) {
		this.oughttime = oughttime;
	}


	public String getDealtime() {
		return dealtime;
	}


	public void setDealtime(String dealtime) {
		this.dealtime = dealtime;
	}


	public String getDealdesc() {
		return dealdesc;
	}


	public void setDealdesc(String dealdesc) {
		this.dealdesc = dealdesc;
	}


	public String getVendorname() {
		return vendorname;
	}


	public void setVendorname(String vendorname) {
		this.vendorname = vendorname;
	}


	public String getModelname() {
		return modelname;
	}


	public void setModelname(String modelname) {
		this.modelname = modelname;
	}


	public String getDefectcause() {
		return defectcause;
	}


	public void setDefectcause(String defectcause) {
		this.defectcause = defectcause;
	}


	public String getDefectposition() {
		return defectposition;
	}


	public void setDefectposition(String defectposition) {
		this.defectposition = defectposition;
	}


	public String getSolutiondesc() {
		return solutiondesc;
	}


	public void setSolutiondesc(String solutiondesc) {
		this.solutiondesc = solutiondesc;
	}


	public String getFlowstate() {
		return flowstate;
	}


	public void setFlowstate(String flowstate) {
		this.flowstate = flowstate;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getDevicereleasedate() {
		return devicereleasedate;
	}


	public void setDevicereleasedate(String devicereleasedate) {
		this.devicereleasedate = devicereleasedate;
	}


	public String getDevicerundate() {
		return devicerundate;
	}


	public void setDevicerundate(String devicerundate) {
		this.devicerundate = devicerundate;
	}


	@Override
	public String toString() {
		return "Defect [id=" + id + ", orgname=" + orgname + ", sitename=" + sitename + ", defectlevel=" + defectlevel
				+ ", specialitytype=" + specialitytype + ", devicename=" + devicename + ", partsname=" + partsname
				+ ", functionlocationname=" + functionlocationname + ", voltagelevel=" + voltagelevel + ", findtime="
				+ findtime + ", defectphenomenon=" + defectphenomenon + ", defectdesc=" + defectdesc
				+ ", defecttypename=" + defecttypename + ", createdate=" + createdate + ", oughtdealtime="
				+ oughtdealtime + ", overtime=" + overtime + ", oughttime=" + oughttime + ", dealtime=" + dealtime
				+ ", dealdesc=" + dealdesc + ", vendorname=" + vendorname + ", modelname=" + modelname
				+ ", defectcause=" + defectcause + ", defectposition=" + defectposition + ", solutiondesc="
				+ solutiondesc + ", flowstate=" + flowstate + ", state=" + state + ", devicereleasedate="
				+ devicereleasedate + ", devicerundate=" + devicerundate + "]";
	}

	

}