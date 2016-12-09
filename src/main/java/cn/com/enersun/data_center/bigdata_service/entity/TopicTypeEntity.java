package cn.com.enersun.data_center.bigdata_service.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**   
* Copyright (c) 2016 Founder Ltd. All Rights Reserved.
* Company:昆明能讯科技
* @Title: TopicType.java 
* @Package com.enersun.data_center.bigdata_service.common.model 
* @Description: TODO(主题类型对象) 
* @author enersun_lhb   
* @date 2016年6月8日 上午10:29:16 
* @version V1.0   
*/

@Entity
@Table(name="TOPIC_TYPE")
public class TopicTypeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;

	@Column(name="TOPIC_TYPE_OWNER")
	private String topicTypeOwner;

	@Column(name="TYPE_NAME")
	private String typeName;

	public TopicTypeEntity() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTopicTypeOwner() {
		return this.topicTypeOwner;
	}

	public void setTopicTypeOwner(String topicTypeOwner) {
		this.topicTypeOwner = topicTypeOwner;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}
