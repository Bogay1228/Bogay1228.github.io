package com.example.demo;

public class TNIDXRespinse {
	
	public static String response() {
		return "<Tx>    \r\n" + 
				"	<TxHead>\r\n" + 
				"        <CTF_A_TXN_LEN>0097</CTF_A_TXN_LEN>\r\n" + 
				"        <CTF_A_TXN_ID_CODE>TNIDX</CTF_A_TXN_ID_CODE>\r\n" + 
				"        <CTF_A_TXN_CHANNEL>NB</CTF_A_TXN_CHANNEL>\r\n" + 
				"        <CTF_A_HOST_SEQ_NO>0000001</CTF_A_HOST_SEQ_NO>\r\n" + 
				"        <CTF_A_STAN_NO>103</CTF_A_STAN_NO>\r\n" + 
				"        <CTF_A_TXN_DATE>20200923</CTF_A_TXN_DATE>\r\n" + 
				"        <CTF_A_TXN_TIME>154234</CTF_A_TXN_TIME>\r\n" + 
				"        <CTF_A_TERM_ID>MB887221</CTF_A_TERM_ID>\r\n" + 
				"        <CTF_A_BUSI_DATE>20200923</CTF_A_BUSI_DATE>\r\n" + 
				"        <CTF_A_ATMP_MODE>0</CTF_A_ATMP_MODE>\r\n" + 
				"        <CTF_A_FISC_MODE>1</CTF_A_FISC_MODE>\r\n" + 
				"        <CTF_A_RTN_CODE>I000</CTF_A_RTN_CODE>\r\n" + 
				"        <CTF_A_SEND_BANK>1030307</CTF_A_SEND_BANK>\r\n" + 
				"        <CTF_A_RECV_BANK>000000</CTF_A_RECV_BANK>\r\n" + 
				"        <CTF_A_FILLER/>\r\n" + 
				"    </TxHead>\r\n" + 
				"    <TxBody>\r\n" + 
				"        <EMSGID>D426</EMSGID>\r\n" + 
				"        <EMSGTXT>22178   P YN@</EMSGTXT>\r\n" + 
				"    </TxBody>\r\n" + 
				"</Tx>";
	}
}
