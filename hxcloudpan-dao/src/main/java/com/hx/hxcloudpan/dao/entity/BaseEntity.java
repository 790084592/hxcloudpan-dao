package com.hx.hxcloudpan.dao.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * 所有实体的基类
 * 
 * @author xush
 * @since 2019年10月11日
 */
@MappedSuperclass
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = -2412046011446204120L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int uuid;

	@Column(name = "name")
	public String name;

	@Column(name = "CREATETIME_", updatable = false)
	@org.hibernate.annotations.CreationTimestamp
	private Date createTime;

	@Column(name = "UPDATETIME_")
	@org.hibernate.annotations.UpdateTimestamp
	private Date updateTime;

	/**
	 * 获取表自动记录的id
	 * 
	 * @return
	 */
	public int getUuid() {
		return uuid;
	}

	/**
	 * 设置表自动记录的id
	 * 
	 * @param uuid
	 */
	public void setUuid(int uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}