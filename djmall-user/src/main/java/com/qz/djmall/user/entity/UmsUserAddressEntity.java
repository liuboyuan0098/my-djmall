package com.qz.djmall.user.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 收货地址表
 * 
 * @author lby
 * @email lby@qz.com
 * @date 2020-12-01 11:42:13
 */
@Data
@TableName("ums_user_address")
public class UmsUserAddressEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * member_id
	 */
	private Long userId;
	/**
	 * 收货人
	 */
	private String name;
	/**
	 * 电话
	 */
	private String phone;
	/**
	 * 右边
	 */
	private String postCode;
	/**
	 * 省份
	 */
	private String province;
	/**
	 * 城市
	 */
	private String city;
	/**
	 * 区
	 */
	private String region;
	/**
	 * 详细地址
	 */
	private String address;
	/**
	 * 是否默认地址
	 */
	private Integer defaultStatus;

}
