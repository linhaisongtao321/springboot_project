package com.lhst.springboot_project.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 系统用户
 * 
 * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:06
 */
@Data
@TableName("sys_user")
@Accessors(chain = true)
@ApiModel("用户信息")
public class SysUserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ApiModelProperty("主键")
	private Long userId;
	/**
	 * 用户名
	 */
	@ApiModelProperty("用户名")
	private String username;
	/**
	 * 密码
	 */
	@ApiModelProperty("密码")
	private String password;
	/**
	 * 邮箱
	 */
	@ApiModelProperty("邮箱")
	private String email;
	/**
	 * 手机号
	 */
	@ApiModelProperty("手机号")
	private String mobile;
	/**
	 * 状态  0：禁用   1：正常
	 */
	@ApiModelProperty("状态  0：禁用   1：正常")
	private Integer status;
	/**
	 * 创建者ID
	 */
	@ApiModelProperty("创建者ID")
	private Long createUserId;
	/**
	 * 创建时间
	 */
	@ApiModelProperty("创建时间")
	private Date createTime;

}
