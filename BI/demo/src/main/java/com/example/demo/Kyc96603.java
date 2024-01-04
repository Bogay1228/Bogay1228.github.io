package com.example.demo;

public class Kyc96603 {
	
	public static String get96603(String idn , String birthday) {
		StringBuilder sb = new StringBuilder();
		sb.append("<Tx>\r\n" + 
				"   <TxHead>\r\n" + 
				"      <CTF_A_TXN_LEN>0528</CTF_A_TXN_LEN>\r\n" + 
				"      <CTF_A_TXN_ID_CODE>96603</CTF_A_TXN_ID_CODE>\r\n" + 
				"      <CTF_A_TXN_CHANNEL>WM</CTF_A_TXN_CHANNEL>\r\n" + 
				"      <CTF_A_HOST_SEQ_NO>0000007</CTF_A_HOST_SEQ_NO>\r\n" + 
				"      <CTF_A_STAN_NO>103</CTF_A_STAN_NO>\r\n" + 
				"      <CTF_A_TXN_DATE>20200805</CTF_A_TXN_DATE>\r\n" + 
				"      <CTF_A_TXN_TIME>103725</CTF_A_TXN_TIME>\r\n" + 
				"      <CTF_A_TERM_ID>MB887221</CTF_A_TERM_ID>\r\n" + 
				"      <CTF_A_BUSI_DATE>20200805</CTF_A_BUSI_DATE>\r\n" + 
				"      <CTF_A_ATMP_MODE>0</CTF_A_ATMP_MODE>\r\n" + 
				"      <CTF_A_FISC_MODE>0</CTF_A_FISC_MODE>\r\n" + 
				"      <CTF_A_RTN_CODE>0000</CTF_A_RTN_CODE>\r\n" + 
				"      <CTF_A_SEND_BANK>1030307</CTF_A_SEND_BANK>\r\n" + 
				"      <CTF_A_RECV_BANK>1030307</CTF_A_RECV_BANK>\r\n" + 
				"      <CTF_A_FILLER/>\r\n" + 
				"   </TxHead>\r\n" + 
				"   <TxBody>");
		sb.append("<WMSG_ID_CODE>").append(idn).append("</WMSG_ID_CODE>");
		sb.append("<SPACE>=</SPACE>\r\n" + 
				"      <WMSG_CUST_NAME>楊Ｘ裕Ｘ            　　　　　　</WMSG_CUST_NAME>\r\n" + 
				"      <SPACE2>=</SPACE2>\r\n" + 
				"      <WMSG_COMM_ADDR>台北市萬華區福音里１２鄰Ｘ                          　　　　　　　　</WMSG_COMM_ADDR>\r\n" + 
				"      <SPACE3>=</SPACE3>\r\n" + 
				"      <WMSG_FAX/>\r\n" + 
				"      <SPACE4>=</SPACE4>\r\n" + 
				"      <WMSG_EMAIL_ADDR>666@softbi.com</WMSG_EMAIL_ADDR>\r\n" + 
				"      <SPACE5>=</SPACE5>\r\n" + 
				"      <WMSG_BINS_CODE>061700</WMSG_BINS_CODE>\r\n" + 
				"      <SPACE6>=</SPACE6>\r\n" + 
				"      <WMSG_SEX>M</WMSG_SEX>\r\n" + 
				"      <SPACE7>=</SPACE7>\r\n" + 
				"      <WMSG_HOUSE_TEL>02 66665881</WMSG_HOUSE_TEL>\r\n" + 
				"      <SPACE8>=</SPACE8>\r\n" + 
				"      <WMSG_COMM_ZIP_CODE>108</WMSG_COMM_ZIP_CODE>\r\n" + 
				"      <SPACE9>=</SPACE9>\r\n" + 
				"      <WMSG_CPNY_TEL>02 66668181</WMSG_CPNY_TEL>\r\n" + 
				"      <SPACE10>=</SPACE10>\r\n" + 
				"      <WMSG_MOBILE>666658507</WMSG_MOBILE>\r\n" + 
				"      <SPACE11>=</SPACE11>");
		sb.append("<WMSG_BIRTHDAY>").append("00000000".equals(birthday)?"19901112":birthday).append("</WMSG_BIRTHDAY>");
		sb.append("<SPACE12>=</SPACE12>\r\n" + 
				"      <WMSG_MARITAL_STAT>1</WMSG_MARITAL_STAT>\r\n" + 
				"      <SPACE13>=</SPACE13>\r\n" + 
				"      <WMSG_CUST_KIND>N</WMSG_CUST_KIND>\r\n" + 
				"      <SPACE14>=</SPACE14>\r\n" + 
				"      <WMSG_CHG_BR>0019</WMSG_CHG_BR>\r\n" + 
				"      <SPACE15>=</SPACE15>\r\n" + 
				"      <WMSG_JOB_CODE/>\r\n" + 
				"      <SPACE16>=</SPACE16>\r\n" + 
				"      <WMSG_BUSI_TITLE/>\r\n" + 
				"      <SPACE17>=</SPACE17>\r\n" + 
				"      <WMSG_EDUCATION_LEVEL>3</WMSG_EDUCATION_LEVEL>\r\n" + 
				"      <SPACE18>=</SPACE18>\r\n" + 
				"      <WMSG_IDENT_KIND_IVR>Y</WMSG_IDENT_KIND_IVR>\r\n" + 
				"      <SPACE19>=</SPACE19>\r\n" + 
				"      <WMSG_IDENT_KIND_NET>Y</WMSG_IDENT_KIND_NET>\r\n" + 
				"      <SPACE20>=</SPACE20>\r\n" + 
				"      <WMSG_BOSS_ID_CODE/>\r\n" + 
				"      <SPACE21>=</SPACE21>\r\n" + 
				"      <WMSG_BOSS_NAME/>\r\n" + 
				"      <SPACE22>=</SPACE22>\r\n" + 
				"      <WMSG_SECRET_FLAG>0</WMSG_SECRET_FLAG>\r\n" + 
				"      <SPACE23>=</SPACE23>\r\n" + 
				"      <WMSG_MEGA_CONS_NO/>\r\n" + 
				"      <SPACE24>=</SPACE24>\r\n" + 
				"      <WMSG_MEGA_SET_DATE/>\r\n" + 
				"      <SPACE25>=</SPACE25>\r\n" + 
				"      <WMSG_TXN_DATE>20200805</WMSG_TXN_DATE>\r\n" + 
				"      <SPACE26>=</SPACE26>\r\n" + 
				"      <WMSG_OBU_FLAG>N</WMSG_OBU_FLAG>\r\n" + 
				"      <SPACE27>=</SPACE27>\r\n" + 
				"      <WMSG_DMCL_ADDR>台北市萬華區　福音里１２鄰Ｘ                          　　　　　　　　</WMSG_DMCL_ADDR>\r\n" + 
				"   </TxBody>\r\n" + 
				"</Tx>");
		
		return sb.toString();
	}
	
}
