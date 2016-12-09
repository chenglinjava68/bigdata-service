package cn.com.enersun.data_center.bigdata_service.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * 
* @ClassName: Theme 
* @Description: TODO(主题实例对象) 
* @author enersun_lhb 
* @date 2016年6月6日 下午5:48:17 
*
 */
@Entity
@Table(name="THEME_INSTANCE")
@NamedQuery(name="Theme.findAll", query="SELECT t FROM Theme t")
public class ThemeEntity implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/
	private static final long serialVersionUID = 4967223902308041321L;
	@Id
	private String id;

	@Column(name="THEME_NAME")
	private String themeName;

	@Column(name="TOPIC_ID")
	private String topicId;

	public ThemeEntity() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getThemeName() {
		return this.themeName;
	}

	public void setThemeName(String themeName) {
		this.themeName = themeName;
	}

	public String getTopicId() {
		return this.topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}
}
