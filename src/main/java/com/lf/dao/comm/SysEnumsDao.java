package com.lf.dao.comm;

import java.util.List;

import com.lf.bean.comm.SysEnumsObj;

/** 
* @Title: Mechanical 
* @Description: 系统参数DAO层  
* @author LiuFei
* @2017年3月7日 下午8:16:41
* @throws 
*/
public interface SysEnumsDao {

	/** 
	* @Title: Mechanical 
	* @Description: 查询枚举值集合
	* @param sysKey
	* @return  
	* @author LiuFei
	* @2017年3月7日 下午8:34:52
	* @throws 
	*/
	public List<SysEnumsObj> selectSysEnumsList(String sysKey);
	
	
	public List<SysEnumsObj> selectSysEnumsAll();
	
	
	/** 
	* @Title: Mechanical 
	* @Description: 查询枚举值对象
	* @param sysKey
	* @return  
	* @author LiuFei
	* @2017年3月7日 下午8:35:32
	* @throws 
	*/
	public SysEnumsObj selectSysEnums(String sysKey);
	
	
	
	
	
	/** 
	* @Title: Mechanical 
	* @Description: 添加枚举值
	* @param enumsObj
	* @return  
	* @author LiuFei
	* @2017年3月8日 下午7:41:08
	* @throws 
	*/
	public int insert(SysEnumsObj enumsObj);
	
	
	
	
}
