package com.example.demo;

public class WMACB {
	
	public String content() {
//		return "<Tx>\r\n" + 
//				"   <TxHead>\r\n" + 
//				"      <CTF_A_TXN_LEN>0597</CTF_A_TXN_LEN>\r\n" + 
//				"      <CTF_A_TXN_ID_CODE>WMACB</CTF_A_TXN_ID_CODE>\r\n" + 
//				"      <CTF_A_TXN_CHANNEL>WM</CTF_A_TXN_CHANNEL>\r\n" + 
//				"      <CTF_A_HOST_SEQ_NO>0001171</CTF_A_HOST_SEQ_NO>\r\n" + 
//				"      <CTF_A_STAN_NO>1030000000</CTF_A_STAN_NO>\r\n" + 
//				"      <CTF_A_TXN_DATE>20201222</CTF_A_TXN_DATE>\r\n" + 
//				"      <CTF_A_TXN_TIME>135627</CTF_A_TXN_TIME>\r\n" + 
//				"      <CTF_A_TERM_ID>MB887261</CTF_A_TERM_ID>\r\n" + 
//				"      <CTF_A_BUSI_DATE>20201222</CTF_A_BUSI_DATE>\r\n" + 
//				"      <CTF_A_ATMP_MODE>0</CTF_A_ATMP_MODE>\r\n" + 
//				"      <CTF_A_FISC_MODE>0</CTF_A_FISC_MODE>\r\n" + 
//				"      <CTF_A_RTN_CODE>0001</CTF_A_RTN_CODE>\r\n" + 
//				"      <CTF_A_SEND_BANK>1030000</CTF_A_SEND_BANK>\r\n" + 
//				"      <CTF_A_RECV_BANK>1030000</CTF_A_RECV_BANK>\r\n" + 
//				"      <CTF_A_FILLER>DB</CTF_A_FILLER>\r\n" + 
//				"   </TxHead>\r\n" + 
//				"   <TxBody>\r\n" + 
//				"      <SYS_CTG>WMS</SYS_CTG>\r\n" + 
//				"      <MSG_CTG>QRY</MSG_CTG>\r\n" + 
//				"      <REF_NO />\r\n" + 
//				"      <VAILD_DT>00000000</VAILD_DT>\r\n" + 
//				"      <FEE_RATE>00000000</FEE_RATE>\r\n" + 
//				"      <TRUST_FEE>00000000000</TRUST_FEE>\r\n" + 
//				"      <TX_RESULT_CODE>B231</TX_RESULT_CODE>\r\n" + 
//				"      <DESC>價格  X  張數需大於最低申購金額  !</DESC>\r\n" + 
//				"      <PRICE_NUM>011</PRICE_NUM>\r\n" + 
//				"      <PRICE1>0148490</PRICE1>\r\n" + 
//				"      <PRICE2>0150050</PRICE2>\r\n" + 
//				"      <PRICE3>0151610</PRICE3>\r\n" + 
//				"      <PRICE4>0153170</PRICE4>\r\n" + 
//				"      <PRICE5>0154740</PRICE5>\r\n" + 
//				"      <PRICE6>0156300</PRICE6>\r\n" + 
//				"      <PRICE7>0157860</PRICE7>\r\n" + 
//				"      <PRICE8>0159430</PRICE8>\r\n" + 
//				"      <PRICE9>0160990</PRICE9>\r\n" + 
//				"      <PRICE10>0162550</PRICE10>\r\n" + 
//				"      <PRICE11>0164120</PRICE11>\r\n" + 
//				"      <PRICE12>0000000</PRICE12>\r\n" + 
//				"      <PRICE13>0000000</PRICE13>\r\n" + 
//				"      <PRICE14>0000000</PRICE14>\r\n" + 
//				"      <PRICE15>0000000</PRICE15>\r\n" + 
//				"      <PRICE16>0000000</PRICE16>\r\n" + 
//				"      <PRICE17>0000000</PRICE17>\r\n" + 
//				"      <PRICE18>0000000</PRICE18>\r\n" + 
//				"      <PRICE19>0000000</PRICE19>\r\n" + 
//				"      <PRICE20>0000000</PRICE20>\r\n" + 
//				"      <PRICE21>0000000</PRICE21>\r\n" + 
//				"      <PRICE22>0000000</PRICE22>\r\n" + 
//				"      <PRICE23>0000000</PRICE23>\r\n" + 
//				"      <PRICE24>0000000</PRICE24>\r\n" + 
//				"      <PRICE25>0000000</PRICE25>\r\n" + 
//				"      <PRICE26>0000000</PRICE26>\r\n" + 
//				"      <PRICE27>0000000</PRICE27>\r\n" + 
//				"      <PRICE28>0000000</PRICE28>\r\n" + 
//				"      <PRICE29>0000000</PRICE29>\r\n" + 
//				"      <PRICE30>0000000</PRICE30>\r\n" + 
//				"      <PRICE31>0000000</PRICE31>\r\n" + 
//				"      <PRICE32>0000000</PRICE32>\r\n" + 
//				"      <PRICE33>0000000</PRICE33>\r\n" + 
//				"      <PRICE34>0000000</PRICE34>\r\n" + 
//				"      <PRICE35>0000000</PRICE35>\r\n" + 
//				"      <PRICE36>0000000</PRICE36>\r\n" + 
//				"      <PRICE37>0000000</PRICE37>\r\n" + 
//				"      <PRICE38>0000000</PRICE38>\r\n" + 
//				"      <PRICE39>0000000</PRICE39>\r\n" + 
//				"      <PRICE40>0000000</PRICE40>\r\n" + 
//				"      <PRICE41>0000000</PRICE41>\r\n" + 
//				"      <PRICE42>0000000</PRICE42>\r\n" + 
//				"      <PRICE43>0000000</PRICE43>\r\n" + 
//				"      <PRICE44>0000000</PRICE44>\r\n" + 
//				"      <PRICE45>0000000</PRICE45>\r\n" + 
//				"      <PRICE46>0000000</PRICE46>\r\n" + 
//				"      <PRICE47>0000000</PRICE47>\r\n" + 
//				"      <PRICE48>0000000</PRICE48>\r\n" + 
//				"      <PRICE49>0000000</PRICE49>\r\n" + 
//				"      <PRICE50>0000000</PRICE50>\r\n" + 
//				"      <FEE_AMT>00000000000</FEE_AMT>\r\n" + 
//				"      <ENDING>@</ENDING>\r\n" + 
//				"   </TxBody>\r\n" + 
//				"</Tx>";
		return "<Tx>\r\n" + 
				"   <TxHead>\r\n" + 
				"      <CTF_A_TXN_LEN>0597</CTF_A_TXN_LEN>\r\n" + 
				"      <CTF_A_TXN_ID_CODE>WMACB</CTF_A_TXN_ID_CODE>\r\n" + 
				"      <CTF_A_TXN_CHANNEL>WM</CTF_A_TXN_CHANNEL>\r\n" + 
				"      <CTF_A_HOST_SEQ_NO>0000463</CTF_A_HOST_SEQ_NO>\r\n" + 
				"      <CTF_A_STAN_NO>1030000000</CTF_A_STAN_NO>\r\n" + 
				"      <CTF_A_TXN_DATE>20201222</CTF_A_TXN_DATE>\r\n" + 
				"      <CTF_A_TXN_TIME>104028</CTF_A_TXN_TIME>\r\n" + 
				"      <CTF_A_TERM_ID>MB887221</CTF_A_TERM_ID>\r\n" + 
				"      <CTF_A_BUSI_DATE>20201222</CTF_A_BUSI_DATE>\r\n" + 
				"      <CTF_A_ATMP_MODE>0</CTF_A_ATMP_MODE>\r\n" + 
				"      <CTF_A_FISC_MODE>0</CTF_A_FISC_MODE>\r\n" + 
				"      <CTF_A_RTN_CODE>0000</CTF_A_RTN_CODE>\r\n" + 
				"      <CTF_A_SEND_BANK>1030000</CTF_A_SEND_BANK>\r\n" + 
				"      <CTF_A_RECV_BANK>1030000</CTF_A_RECV_BANK>\r\n" + 
				"      <CTF_A_FILLER>DB</CTF_A_FILLER>\r\n" + 
				"   </TxHead>\r\n" + 
				"   <TxBody>\r\n" + 
				"      <SYS_CTG>WMS</SYS_CTG>\r\n" + 
				"      <MSG_CTG>QRY</MSG_CTG>\r\n" + 
				"      <REF_NO />\r\n" + 
				"      <VAILD_DT>00000000</VAILD_DT>\r\n" + 
				"      <FEE_RATE>00120000</FEE_RATE>\r\n" + 
				"      <TRUST_FEE>00000000000</TRUST_FEE>\r\n" + 
				"      <TX_RESULT_CODE />\r\n" + 
				"      <DESC />\r\n" + 
				"      <PRICE_NUM>011</PRICE_NUM>\r\n" + 
				"      <PRICE1>0148480</PRICE1>\r\n" + 
				"      <PRICE2>0150050</PRICE2>\r\n" + 
				"      <PRICE3>0151610</PRICE3>\r\n" + 
				"      <PRICE4>0153170</PRICE4>\r\n" + 
				"      <PRICE5>0154740</PRICE5>\r\n" + 
				"      <PRICE6>0156300</PRICE6>\r\n" + 
				"      <PRICE7>0157860</PRICE7>\r\n" + 
				"      <PRICE8>0159430</PRICE8>\r\n" + 
				"      <PRICE9>0160990</PRICE9>\r\n" + 
				"      <PRICE10>0162550</PRICE10>\r\n" + 
				"      <PRICE11>0164120</PRICE11>\r\n" + 
				"      <PRICE12>0000000</PRICE12>\r\n" + 
				"      <PRICE13>0000000</PRICE13>\r\n" + 
				"      <PRICE14>0000000</PRICE14>\r\n" + 
				"      <PRICE15>0000000</PRICE15>\r\n" + 
				"      <PRICE16>0000000</PRICE16>\r\n" + 
				"      <PRICE17>0000000</PRICE17>\r\n" + 
				"      <PRICE18>0000000</PRICE18>\r\n" + 
				"      <PRICE19>0000000</PRICE19>\r\n" + 
				"      <PRICE20>0000000</PRICE20>\r\n" + 
				"      <PRICE21>0000000</PRICE21>\r\n" + 
				"      <PRICE22>0000000</PRICE22>\r\n" + 
				"      <PRICE23>0000000</PRICE23>\r\n" + 
				"      <PRICE24>0000000</PRICE24>\r\n" + 
				"      <PRICE25>0000000</PRICE25>\r\n" + 
				"      <PRICE26>0000000</PRICE26>\r\n" + 
				"      <PRICE27>0000000</PRICE27>\r\n" + 
				"      <PRICE28>0000000</PRICE28>\r\n" + 
				"      <PRICE29>0000000</PRICE29>\r\n" + 
				"      <PRICE30>0000000</PRICE30>\r\n" + 
				"      <PRICE31>0000000</PRICE31>\r\n" + 
				"      <PRICE32>0000000</PRICE32>\r\n" + 
				"      <PRICE33>0000000</PRICE33>\r\n" + 
				"      <PRICE34>0000000</PRICE34>\r\n" + 
				"      <PRICE35>0000000</PRICE35>\r\n" + 
				"      <PRICE36>0000000</PRICE36>\r\n" + 
				"      <PRICE37>0000000</PRICE37>\r\n" + 
				"      <PRICE38>0000000</PRICE38>\r\n" + 
				"      <PRICE39>0000000</PRICE39>\r\n" + 
				"      <PRICE40>0000000</PRICE40>\r\n" + 
				"      <PRICE41>0000000</PRICE41>\r\n" + 
				"      <PRICE42>0000000</PRICE42>\r\n" + 
				"      <PRICE43>0000000</PRICE43>\r\n" + 
				"      <PRICE44>0000000</PRICE44>\r\n" + 
				"      <PRICE45>0000000</PRICE45>\r\n" + 
				"      <PRICE46>0000000</PRICE46>\r\n" + 
				"      <PRICE47>0000000</PRICE47>\r\n" + 
				"      <PRICE48>0000000</PRICE48>\r\n" + 
				"      <PRICE49>0000000</PRICE49>\r\n" + 
				"      <PRICE50>0000000</PRICE50>\r\n" + 
				"      <FEE_AMT>00000000000</FEE_AMT>\r\n" + 
				"      <ENDING>@</ENDING>\r\n" + 
				"   </TxBody>\r\n" + 
				"</Tx>";
	}

}
