package com.jike.supercollection;

import java.util.HashMap;

import android.content.Context;

//�ٶȵ�ͼ SHA1 0D:3C:EC:2E:C2:01:A0:E6:C7:AE:44:B4:05:17:9D:F8:BE:A9:70:9E
public class MyApp {
	private Context context;
	
	HashMap<String,Object> self_hm=new HashMap<String,Object>();//����B2C
	HashMap<String,Object> self_b_hm=new HashMap<String,Object>();//����B2B
	HashMap<String,Object> nanbei_hm=new HashMap<String,Object>();
	HashMap<String,Object> nanbei_b_hm=new HashMap<String,Object>();
	HashMap<String,Object> menghang_hm=new HashMap<String,Object>();
	HashMap<String,Object> menghang_b_hm=new HashMap<String,Object>();
	
//	HashMap��ʹ��
//	put(K key, V value) 
//	hm.put(a,b); //����ֵΪb,keyֵΪa
//	hm.get(key); //����ֵΪvalue
	/**�����ͬ����ʱ���Ĵ˴�
	 * ������ֻ�������������ֵ��RELEASE��hm��platform
	 */
	public static boolean RELEASE = false;//����  or �������ӿ�
	private HashMap<String,Object> hm=self_hm;
	
	public static String userkey="5b13658a9fc945e34893f806027d467a";//5b13658a9fc945e34893f806027d467a��Ч�ڵ�2014.09.10
	public static String sitekey="";
	
	public MyApp(Context context){
		this.context=context;
	}
	
	public boolean isRELEASE() {
		return RELEASE;
	}
	
	public HashMap<String, Object> getHm() {
		return hm;
	}
	
	
	/**��ȡ�ӿڵĵ�ַ
	 */
	public String getServeUrl() {
		if(RELEASE)
			return context.getResources().getString(R.string.formal_server_url);
		else return context.getResources().getString(R.string.test_server_url);
	}
	/**��ȡ֧���ӿڵĵ�ַ
	 */
	public String getPayServeUrl() {
		if(RELEASE)
			return context.getResources().getString(R.string.formal_pay_server_url);
		else return context.getResources().getString(R.string.test_pay_server_url);
	}
}