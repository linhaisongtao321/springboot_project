package com.lhst.springboot_project.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 系统配置信息表
 * 
 * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:07
 */
@Data
@TableName("sys_config")
@Accessors(chain = true)
public class SysConfigEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@NotNull(message="主键不能空")
	private Long id;
	/**
	 * key
	 */
	private String key;
	/**
	 * value
	 */
	private String value;
	/**
	 * 状态   0：隐藏   1：显示
	 */
	private Integer status;
	/**
	 * 备注
	 */
	private String remark;

}
