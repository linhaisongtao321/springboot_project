package com.lhst.springboot_project.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import com.lhst.springboot_project.ParamValid.Insert;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 用户
 *
	 * @author wangdj
	 * @email ${email}
	 * @date 2020-11-22 16:12:07
	 */
	@Data
	@TableName("tb_user")
	@Accessors(chain = true)
	public class UserEntity implements Serializable {
		private static final long serialVersionUID = 1L;

		/**
		 *
		 */
		@TableId
		private Long userId;
		/**
	 * 用户名
	 */
	@NotNull(message = "username 不能为空")
	private String username;
	/**
	 * 手机号
	 */
	@Pattern(regexp = "1[3|4|5|7|8][0-9]{8}",message = "手机号码不正确",groups = Insert.class)
	private String mobile;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 创建时间
	 */
	private Date createTime;

}
