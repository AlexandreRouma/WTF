/**
 * 
 */
package com.halo.wechat.capabilities.abilities;

import com.halo.wechat.capabilities.CapabilityException;
import com.halo.wechat.capabilities.beans.UserInfoBean;

/**
 * 用户管理相关接口，包括：<br>
 * 用户分组管理、设置用户备注名、获取用户基本信息、获取用户列表、获取用户地理位置、网页授权获取用户基本信息
 * 
 * @author zyl
 *
 */
public interface UserManagementAbility {

	/**
	 * 公众号可通过本接口来根据OpenID获取用户基本信息，包括昵称、头像、性别、所在城市、语言和关注时间。
	 * 
	 * @param String
	 *            openId 普通用户的标识，对当前公众号唯一
	 * @param String
	 *            lang 返回国家地区语言版本，zh_CN 简体，zh_TW 繁体，en 英语
	 * @return 获取用户基本信息接口返回的用户信息，错误时微信会返回错误码等信息
	 */
	public UserInfoBean getUserInfo(String openId, String lang) throws CapabilityException;

}