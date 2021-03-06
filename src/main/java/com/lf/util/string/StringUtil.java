package com.lf.util.string;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.tools.Tool;

public class StringUtil {
	/**
	 * 检测字符串是否不为空(null,"","null")
	 * @param s
	 * @return 不为空则返回true，否则返回false
	 */
	public static boolean isNotEmpty(String s){
		return s!=null && !"".equals(s) && !"null".equals(s);
	}
	
	/**
	 * 检测字符串是否为空(null,"","null")
	 * @param s
	 * @return 为空则返回true，不否则返回false
	 */
	public static boolean isEmpty(String s){
		return s==null || "".equals(s) || "null".equals(s);
	}
	
	/**
	 * 字符串转换为字符串数组
	 * @param str 字符串
	 * @param splitRegex 分隔符
	 * @return
	 */
	public static String[] str2StrArray(String str,String splitRegex){
		if(isEmpty(str)){
			return null;
		}
		return str.split(splitRegex);
	}
	
	/**
	 * 用默认的分隔符(,)将字符串转换为字符串数组
	 * @param str	字符串
	 * @return
	 */
	public static String[] str2StrArray(String str){
		return str2StrArray(str,",\\s*");
	}
	
	/**
	 * 按照yyyy-MM-dd HH:mm:ss的格式，日期转字符串
	 * @param date
	 * @return yyyy-MM-dd HH:mm:ss
	 */
	public static String date2Str(Date date){
		return date2Str(date,"yyyy-MM-dd HH:mm:ss");
	}
	
	/**
	 * 按照yyyy-MM-dd HH:mm:ss的格式，字符串转日期
	 * @param date
	 * @return
	 */
	public static Date str2Date(String date){
		if(isNotEmpty(date)){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			try {
				return sdf.parse(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return new Date();
		}else{
			return null;
		}
	}
	
	/**
	 * 按照参数format的格式，日期转字符串
	 * @param date
	 * @param format
	 * @return
	 */
	public static String date2Str(Date date,String format){
		if(date!=null){
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			return sdf.format(date);
		}else{
			return "";
		}
	}
	
	
	/**
	 * 方法描述-  获取当前系统时间
	 * @return
	 * @author  LIUFEI
	 * @date  2016-6-4
	 */
	public static String getDate(){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}
	
	
	/** 
	* @Title: Mechanical 
	* @Description: 大小写转换
	* @param parms 0：大写   1：小写
	* @return  
	* @author LiuFei
	* @2017年3月6日 下午5:09:43
	* @throws 
	*/
	public static String CaseChandes(String parms){
		
		if(StringUtil.isEmpty(parms)){
			throw new RuntimeException("参数为空!");
		}
		String type = "0";
		String resultVal = "";
		if("0".equals(type)){ //
			resultVal = parms.toUpperCase();
		}else if("1".equals(type)){
			resultVal = parms.toLowerCase();
		}
		return resultVal;
	}
	
	public static String KillNull(String parms){
		return  parms==null?"":parms;
	}
	
	
}
