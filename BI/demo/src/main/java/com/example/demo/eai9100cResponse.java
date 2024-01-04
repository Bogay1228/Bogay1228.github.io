package com.example.demo;

public class eai9100cResponse {
	
	public static String get9100cResponse() {
		return "<Tx>\r\n" + 
				"   <TxHead>\r\n" + 
				"      <CTF_A_TXN_LEN>0099</CTF_A_TXN_LEN>\r\n" + 
				"      <CTF_A_TXN_ID_CODE>9100C</CTF_A_TXN_ID_CODE>\r\n" + 
				"      <CTF_A_TXN_CHANNEL>WM</CTF_A_TXN_CHANNEL>\r\n" + 
				"      <CTF_A_HOST_SEQ_NO>0000002</CTF_A_HOST_SEQ_NO>\r\n" + 
				"      <CTF_A_STAN_NO>103</CTF_A_STAN_NO>\r\n" + 
				"      <CTF_A_TXN_DATE>20200825</CTF_A_TXN_DATE>\r\n" + 
				"      <CTF_A_TXN_TIME>095419</CTF_A_TXN_TIME>\r\n" + 
				"      <CTF_A_TERM_ID>MB887221</CTF_A_TERM_ID>\r\n" + 
				"      <CTF_A_BUSI_DATE>20200825</CTF_A_BUSI_DATE>\r\n" + 
				"      <CTF_A_ATMP_MODE>0</CTF_A_ATMP_MODE>\r\n" + 
				"      <CTF_A_FISC_MODE>0</CTF_A_FISC_MODE>\r\n" + 
				"      <CTF_A_RTN_CODE>0000</CTF_A_RTN_CODE>\r\n" + 
				"      <CTF_A_SEND_BANK>1030307</CTF_A_SEND_BANK>\r\n" + 
				"      <CTF_A_RECV_BANK>000000</CTF_A_RECV_BANK>\r\n" + 
				"      <CTF_A_FILLER/>\r\n" + 
				"   </TxHead>\r\n" + 
				"   <TxBody>\r\n" + 
				"      <WMSG_ID_CODE>C987643210</WMSG_ID_CODE>\r\n" + 
				"      <WMSG_BIRTHDAY>19580705</WMSG_BIRTHDAY>\r\n" + 
				"   </TxBody>\r\n" + 
				"</Tx>";
	}
}
