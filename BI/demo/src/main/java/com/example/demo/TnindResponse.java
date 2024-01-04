package com.example.demo;

public class TnindResponse {
	
	public static String getTnindResponseByIdni03(String idni03) {
		
//		if("2".equals(idni03)) {
//			return 
//					"<Tx>\r\n" + 
//					"   <TxHead>\r\n" + 
//					"      <CTF_A_TXN_LEN>1109</CTF_A_TXN_LEN>\r\n" + 
//					"      <CTF_A_TXN_ID_CODE>TNIND</CTF_A_TXN_ID_CODE>\r\n" + 
//					"      <CTF_A_TXN_CHANNEL>WM</CTF_A_TXN_CHANNEL>\r\n" + 
//					"      <CTF_A_HOST_SEQ_NO>0000199</CTF_A_HOST_SEQ_NO>\r\n" + 
//					"      <CTF_A_STAN_NO>103</CTF_A_STAN_NO>\r\n" + 
//					"      <CTF_A_TXN_DATE>20200701</CTF_A_TXN_DATE>\r\n" + 
//					"      <CTF_A_TXN_TIME>154844</CTF_A_TXN_TIME>\r\n" + 
//					"      <CTF_A_TERM_ID>MB887221</CTF_A_TERM_ID>\r\n" + 
//					"      <CTF_A_BUSI_DATE>20200701</CTF_A_BUSI_DATE>\r\n" + 
//					"      <CTF_A_ATMP_MODE>0</CTF_A_ATMP_MODE>\r\n" + 
//					"      <CTF_A_FISC_MODE>0</CTF_A_FISC_MODE>\r\n" + 
//					"      <CTF_A_RTN_CODE>0000</CTF_A_RTN_CODE>\r\n" + 
//					"      <CTF_A_SEND_BANK>1030307</CTF_A_SEND_BANK>\r\n" + 
//					"      <CTF_A_RECV_BANK>000000</CTF_A_RECV_BANK>\r\n" + 
//					"      <CTF_A_FILLER />\r\n" + 
//					"   </TxHead>\r\n" + 
//					"   <TxBody>\r\n" + 
//					"      <INDO01>Q#221607998</INDO01>\r\n" + 
//					"      <INDO02 />\r\n" + 
//					"      <INDO02A>2</INDO02A>\r\n" + 
//					"      <INDO03>05</INDO03>\r\n" + 
//					"      <INDO04>20200701</INDO04>\r\n" + 
//					"      <INDO05>154857</INDO05>\r\n" + 
//					"      <TxRepeat>\r\n" + 
//					"         <INDO06>001FB002763</INDO06>\r\n" + 
//					"         <INDO07>D0206</INDO07>\r\n" + 
//					"         <INDO08>1</INDO08>\r\n" + 
//					"         <INDO09>20190919</INDO09>\r\n" + 
//					"         <INDO10>00000096820000</INDO10>\r\n" + 
//					"         <INDO11>0000019364000000</INDO11>\r\n" + 
//					"         <INDO12>00001936400</INDO12>\r\n" + 
//					"         <INDO13>USD</INDO13>\r\n" + 
//					"         <INDO14>0000200000000</INDO14>\r\n" + 
//					"         <INDO15>+</INDO15>\r\n" + 
//					"         <INDO16>00000000</INDO16>\r\n" + 
//					"         <INDO17>00001000000</INDO17>\r\n" + 
//					"         <INDO18>00000000000</INDO18>\r\n" + 
//					"         <INDO19>0000000000000</INDO19>\r\n" + 
//					"         <INDO20>+</INDO20>\r\n" + 
//					"         <INDO21>000000000000</INDO21>\r\n" + 
//					"         <INDO22>20200701</INDO22>\r\n" + 
//					"         <INDO23>20200701</INDO23>\r\n" + 
//					"         <INDO24>20190504</INDO24>\r\n" + 
//					"         <INDO25>0000000000000</INDO25>\r\n" + 
//					"         <INDO26>+</INDO26>\r\n" + 
//					"         <INDO27>00000000</INDO27>\r\n" + 
//					"      </TxRepeat>\r\n" + 
//					"      <TxRepeat>\r\n" + 
//					"         <INDO06>001FB002764</INDO06>\r\n" + 
//					"         <INDO07>A0418</INDO07>\r\n" + 
//					"         <INDO08>1</INDO08>\r\n" + 
//					"         <INDO09>20190919</INDO09>\r\n" + 
//					"         <INDO10>00000083750000</INDO10>\r\n" + 
//					"         <INDO11>0000000000000000</INDO11>\r\n" + 
//					"         <INDO12>00000000000</INDO12>\r\n" + 
//					"         <INDO13>USD</INDO13>\r\n" + 
//					"         <INDO14>0001000000000</INDO14>\r\n" + 
//					"         <INDO15>+</INDO15>\r\n" + 
//					"         <INDO16>00000000</INDO16>\r\n" + 
//					"         <INDO17>00001000000</INDO17>\r\n" + 
//					"         <INDO18>00000000000</INDO18>\r\n" + 
//					"         <INDO19>0000100000000</INDO19>\r\n" + 
//					"         <INDO20>+</INDO20>\r\n" + 
//					"         <INDO21>000000000000</INDO21>\r\n" + 
//					"         <INDO22>20200701</INDO22>\r\n" + 
//					"         <INDO23>20200701</INDO23>\r\n" + 
//					"         <INDO24>20190606</INDO24>\r\n" + 
//					"         <INDO25>0000000000000</INDO25>\r\n" + 
//					"         <INDO26>+</INDO26>\r\n" + 
//					"         <INDO27>00000000</INDO27>\r\n" + 
//					"      </TxRepeat>\r\n" + 
//					"      <TxRepeat>\r\n" + 
//					"         <INDO06>001FB002845</INDO06>\r\n" + 
//					"         <INDO07>D1806</INDO07>\r\n" + 
//					"         <INDO08>1</INDO08>\r\n" + 
//					"         <INDO09>20200421</INDO09>\r\n" + 
//					"         <INDO10>00000085900000</INDO10>\r\n" + 
//					"         <INDO11>0000025770000000</INDO11>\r\n" + 
//					"         <INDO12>00002577000</INDO12>\r\n" + 
//					"         <INDO13>USD</INDO13>\r\n" + 
//					"         <INDO14>0000300000000</INDO14>\r\n" + 
//					"         <INDO15>+</INDO15>\r\n" + 
//					"         <INDO16>00000000</INDO16>\r\n" + 
//					"         <INDO17>00001000000</INDO17>\r\n" + 
//					"         <INDO18>00000000000</INDO18>\r\n" + 
//					"         <INDO19>0000000000000</INDO19>\r\n" + 
//					"         <INDO20>+</INDO20>\r\n" + 
//					"         <INDO21>000000000000</INDO21>\r\n" + 
//					"         <INDO22>20200701</INDO22>\r\n" + 
//					"         <INDO23>20200701</INDO23>\r\n" + 
//					"         <INDO24>20191215</INDO24>\r\n" + 
//					"         <INDO25>0000000000000</INDO25>\r\n" + 
//					"         <INDO26>+</INDO26>\r\n" + 
//					"         <INDO27>00000000</INDO27>\r\n" + 
//					"      </TxRepeat>\r\n" + 
//					"      <TxRepeat>\r\n" + 
//					"         <INDO06>001FB002885</INDO06>\r\n" + 
//					"         <INDO07>D1806</INDO07>\r\n" + 
//					"         <INDO08>1</INDO08>\r\n" + 
//					"         <INDO09>20200520</INDO09>\r\n" + 
//					"         <INDO10>00000085900000</INDO10>\r\n" + 
//					"         <INDO11>0006872000000000</INDO11>\r\n" + 
//					"         <INDO12>00687200000</INDO12>\r\n" + 
//					"         <INDO13>USD</INDO13>\r\n" + 
//					"         <INDO14>0080000000000</INDO14>\r\n" + 
//					"         <INDO15>+</INDO15>\r\n" + 
//					"         <INDO16>00000000</INDO16>\r\n" + 
//					"         <INDO17>00001000000</INDO17>\r\n" + 
//					"         <INDO18>00000000000</INDO18>\r\n" + 
//					"         <INDO19>0000000000000</INDO19>\r\n" + 
//					"         <INDO20>+</INDO20>\r\n" + 
//					"         <INDO21>000000000000</INDO21>\r\n" + 
//					"         <INDO22>20200701</INDO22>\r\n" + 
//					"         <INDO23>20200701</INDO23>\r\n" + 
//					"         <INDO24>20191215</INDO24>\r\n" + 
//					"         <INDO25>0000000000000</INDO25>\r\n" + 
//					"         <INDO26>+</INDO26>\r\n" + 
//					"         <INDO27>00000000</INDO27>\r\n" + 
//					"      </TxRepeat>\r\n" + 
//					"      <TxRepeat>\r\n" + 
//					"         <INDO06>006FB001175</INDO06>\r\n" + 
//					"         <INDO07>D0206</INDO07>\r\n" + 
//					"         <INDO08>1</INDO08>\r\n" + 
//					"         <INDO09>20190620</INDO09>\r\n" + 
//					"         <INDO10>00000096820000</INDO10>\r\n" + 
//					"         <INDO11>0000000000000000</INDO11>\r\n" + 
//					"         <INDO12>00000000000</INDO12>\r\n" + 
//					"         <INDO13>USD</INDO13>\r\n" + 
//					"         <INDO14>0000500000000</INDO14>\r\n" + 
//					"         <INDO15>+</INDO15>\r\n" + 
//					"         <INDO16>00000000</INDO16>\r\n" + 
//					"         <INDO17>00001000000</INDO17>\r\n" + 
//					"         <INDO18>00000000000</INDO18>\r\n" + 
//					"         <INDO19>0000500000000</INDO19>\r\n" + 
//					"         <INDO20>+</INDO20>\r\n" + 
//					"         <INDO21>000000000000</INDO21>\r\n" + 
//					"         <INDO22>20200701</INDO22>\r\n" + 
//					"         <INDO23>20200701</INDO23>\r\n" + 
//					"         <INDO24>20190504</INDO24>\r\n" + 
//					"         <INDO25>0000000000000</INDO25>\r\n" + 
//					"         <INDO26>+</INDO26>\r\n" + 
//					"         <INDO27>00000000</INDO27>\r\n" + 
//					"      </TxRepeat>\r\n" + 
//					"   </TxBody>\r\n" + 
//					"</Tx>";
//		}else if("3".equals(idni03)) {
//			return "<Tx>\r\n" + 
//					"   <TxHead>\r\n" + 
//					"      <CTF_A_TXN_LEN>0329</CTF_A_TXN_LEN>\r\n" + 
//					"      <CTF_A_TXN_ID_CODE>TNIND</CTF_A_TXN_ID_CODE>\r\n" + 
//					"      <CTF_A_TXN_CHANNEL>WM</CTF_A_TXN_CHANNEL>\r\n" + 
//					"      <CTF_A_HOST_SEQ_NO>0000192</CTF_A_HOST_SEQ_NO>\r\n" + 
//					"      <CTF_A_STAN_NO>103</CTF_A_STAN_NO>\r\n" + 
//					"      <CTF_A_TXN_DATE>20200701</CTF_A_TXN_DATE>\r\n" + 
//					"      <CTF_A_TXN_TIME>154749</CTF_A_TXN_TIME>\r\n" + 
//					"      <CTF_A_TERM_ID>MB887221</CTF_A_TERM_ID>\r\n" + 
//					"      <CTF_A_BUSI_DATE>20200701</CTF_A_BUSI_DATE>\r\n" + 
//					"      <CTF_A_ATMP_MODE>0</CTF_A_ATMP_MODE>\r\n" + 
//					"      <CTF_A_FISC_MODE>0</CTF_A_FISC_MODE>\r\n" + 
//					"      <CTF_A_RTN_CODE>0000</CTF_A_RTN_CODE>\r\n" + 
//					"      <CTF_A_SEND_BANK>1030307</CTF_A_SEND_BANK>\r\n" + 
//					"      <CTF_A_RECV_BANK>000000</CTF_A_RECV_BANK>\r\n" + 
//					"      <CTF_A_FILLER />\r\n" + 
//					"   </TxHead>\r\n" + 
//					"   <TxBody>\r\n" + 
//					"      <INDO01>Q#221607998</INDO01>\r\n" + 
//					"      <INDO02 />\r\n" + 
//					"      <INDO02A>3</INDO02A>\r\n" + 
//					"      <INDO03>01</INDO03>\r\n" + 
//					"      <INDO04>20200701</INDO04>\r\n" + 
//					"      <INDO05>154802</INDO05>\r\n" + 
//					"      <TxRepeat>\r\n" + 
//					"         <INDO06>006FB001174</INDO06>\r\n" + 
//					"         <INDO07>E001</INDO07>\r\n" + 
//					"         <INDO08>1</INDO08>\r\n" + 
//					"         <INDO09>20190620</INDO09>\r\n" + 
//					"         <INDO10>00000057240000</INDO10>\r\n" + 
//					"         <INDO11>0000011448000000</INDO11>\r\n" + 
//					"         <INDO12>00001144800</INDO12>\r\n" + 
//					"         <INDO13>USD</INDO13>\r\n" + 
//					"         <INDO14>0000002000000</INDO14>\r\n" + 
//					"         <INDO15>+</INDO15>\r\n" + 
//					"         <INDO16>00000000</INDO16>\r\n" + 
//					"         <INDO17>00001000000</INDO17>\r\n" + 
//					"         <INDO18>00000000000</INDO18>\r\n" + 
//					"         <INDO19>0000000000000</INDO19>\r\n" + 
//					"         <INDO20>+</INDO20>\r\n" + 
//					"         <INDO21>000000000000</INDO21>\r\n" + 
//					"         <INDO22>20200701</INDO22>\r\n" + 
//					"         <INDO23>20200701</INDO23>\r\n" + 
//					"         <INDO24>00000000</INDO24>\r\n" + 
//					"         <INDO25>0000000000000</INDO25>\r\n" + 
//					"         <INDO26>+</INDO26>\r\n" + 
//					"         <INDO27>00000000</INDO27>\r\n" + 
//					"      </TxRepeat>\r\n" + 
//					"   </TxBody>\r\n" + 
//					"</Tx>";
//		}else if("4".equals(idni03)) {
//			return "<Tx>\r\n" + 
//					"   <TxHead>\r\n" + 
//					"      <CTF_A_TXN_LEN>1694</CTF_A_TXN_LEN>\r\n" + 
//					"      <CTF_A_TXN_ID_CODE>TNIND</CTF_A_TXN_ID_CODE>\r\n" + 
//					"      <CTF_A_TXN_CHANNEL>WM</CTF_A_TXN_CHANNEL>\r\n" + 
//					"      <CTF_A_HOST_SEQ_NO>0000185</CTF_A_HOST_SEQ_NO>\r\n" + 
//					"      <CTF_A_STAN_NO>103</CTF_A_STAN_NO>\r\n" + 
//					"      <CTF_A_TXN_DATE>20200701</CTF_A_TXN_DATE>\r\n" + 
//					"      <CTF_A_TXN_TIME>154656</CTF_A_TXN_TIME>\r\n" + 
//					"      <CTF_A_TERM_ID>MB887221</CTF_A_TERM_ID>\r\n" + 
//					"      <CTF_A_BUSI_DATE>20200701</CTF_A_BUSI_DATE>\r\n" + 
//					"      <CTF_A_ATMP_MODE>0</CTF_A_ATMP_MODE>\r\n" + 
//					"      <CTF_A_FISC_MODE>0</CTF_A_FISC_MODE>\r\n" + 
//					"      <CTF_A_RTN_CODE>0000</CTF_A_RTN_CODE>\r\n" + 
//					"      <CTF_A_SEND_BANK>1030307</CTF_A_SEND_BANK>\r\n" + 
//					"      <CTF_A_RECV_BANK>000000</CTF_A_RECV_BANK>\r\n" + 
//					"      <CTF_A_FILLER />\r\n" + 
//					"   </TxHead>\r\n" + 
//					"   <TxBody>\r\n" + 
//					"      <INDO01>Q#221607998</INDO01>\r\n" + 
//					"      <INDO02 />\r\n" + 
//					"      <INDO02A>4</INDO02A>\r\n" + 
//					"      <INDO03>08</INDO03>\r\n" + 
//					"      <INDO04>20200701</INDO04>\r\n" + 
//					"      <INDO05>154707</INDO05>\r\n" + 
//					"      <TxRepeat>\r\n" + 
//					"         <INDO06 />\r\n" + 
//					"         <INDO07>PE001</INDO07>\r\n" + 
//					"         <INDO08>1</INDO08>\r\n" + 
//					"         <INDO09>00000000</INDO09>\r\n" + 
//					"         <INDO10>00000026200000</INDO10>\r\n" + 
//					"         <INDO11>0000000000000000</INDO11>\r\n" + 
//					"         <INDO12>00000000000</INDO12>\r\n" + 
//					"         <INDO13>USD</INDO13>\r\n" + 
//					"         <INDO14>0000002500000</INDO14>\r\n" + 
//					"         <INDO15>+</INDO15>\r\n" + 
//					"         <INDO16>00000000</INDO16>\r\n" + 
//					"         <INDO17>00001000000</INDO17>\r\n" + 
//					"         <INDO18>00000000000</INDO18>\r\n" + 
//					"         <INDO19>0000002500000</INDO19>\r\n" + 
//					"         <INDO20>+</INDO20>\r\n" + 
//					"         <INDO21>000000000000</INDO21>\r\n" + 
//					"         <INDO22>20200701</INDO22>\r\n" + 
//					"         <INDO23>20200701</INDO23>\r\n" + 
//					"         <INDO24>20200201</INDO24>\r\n" + 
//					"         <INDO25>0000000000000</INDO25>\r\n" + 
//					"         <INDO26>+</INDO26>\r\n" + 
//					"         <INDO27>00000000</INDO27>\r\n" + 
//					"      </TxRepeat>\r\n" + 
//					"      <TxRepeat>\r\n" + 
//					"         <INDO06 />\r\n" + 
//					"         <INDO07>PI005</INDO07>\r\n" + 
//					"         <INDO08>1</INDO08>\r\n" + 
//					"         <INDO09>00000000</INDO09>\r\n" + 
//					"         <INDO10>00000025200000</INDO10>\r\n" + 
//					"         <INDO11>0000000000000000</INDO11>\r\n" + 
//					"         <INDO12>00000000000</INDO12>\r\n" + 
//					"         <INDO13>USD</INDO13>\r\n" + 
//					"         <INDO14>0000002100000</INDO14>\r\n" + 
//					"         <INDO15>+</INDO15>\r\n" + 
//					"         <INDO16>00000000</INDO16>\r\n" + 
//					"         <INDO17>00001000000</INDO17>\r\n" + 
//					"         <INDO18>00000000000</INDO18>\r\n" + 
//					"         <INDO19>0000002100000</INDO19>\r\n" + 
//					"         <INDO20>+</INDO20>\r\n" + 
//					"         <INDO21>000000000000</INDO21>\r\n" + 
//					"         <INDO22>20200701</INDO22>\r\n" + 
//					"         <INDO23>20200701</INDO23>\r\n" + 
//					"         <INDO24>20200115</INDO24>\r\n" + 
//					"         <INDO25>0000000000000</INDO25>\r\n" + 
//					"         <INDO26>+</INDO26>\r\n" + 
//					"         <INDO27>00000000</INDO27>\r\n" + 
//					"      </TxRepeat>\r\n" + 
//					"      <TxRepeat>\r\n" + 
//					"         <INDO06>001FB002644</INDO06>\r\n" + 
//					"         <INDO07>PA003</INDO07>\r\n" + 
//					"         <INDO08>1</INDO08>\r\n" + 
//					"         <INDO09>20190529</INDO09>\r\n" + 
//					"         <INDO10>00000024720000</INDO10>\r\n" + 
//					"         <INDO11>0000000000000000</INDO11>\r\n" + 
//					"         <INDO12>00000000000</INDO12>\r\n" + 
//					"         <INDO13>USD</INDO13>\r\n" + 
//					"         <INDO14>0000002500000</INDO14>\r\n" + 
//					"         <INDO15>+</INDO15>\r\n" + 
//					"         <INDO16>00000000</INDO16>\r\n" + 
//					"         <INDO17>00001000000</INDO17>\r\n" + 
//					"         <INDO18>00000000000</INDO18>\r\n" + 
//					"         <INDO19>0000002500000</INDO19>\r\n" + 
//					"         <INDO20>+</INDO20>\r\n" + 
//					"         <INDO21>000000000000</INDO21>\r\n" + 
//					"         <INDO22>20200701</INDO22>\r\n" + 
//					"         <INDO23>20200701</INDO23>\r\n" + 
//					"         <INDO24>20200201</INDO24>\r\n" + 
//					"         <INDO25>0000000000000</INDO25>\r\n" + 
//					"         <INDO26>+</INDO26>\r\n" + 
//					"         <INDO27>00000000</INDO27>\r\n" + 
//					"      </TxRepeat>\r\n" + 
//					"      <TxRepeat>\r\n" + 
//					"         <INDO06>001FB002650</INDO06>\r\n" + 
//					"         <INDO07>PA003</INDO07>\r\n" + 
//					"         <INDO08>1</INDO08>\r\n" + 
//					"         <INDO09>20190606</INDO09>\r\n" + 
//					"         <INDO10>00000024720000</INDO10>\r\n" + 
//					"         <INDO11>0000000000000000</INDO11>\r\n" + 
//					"         <INDO12>00000000000</INDO12>\r\n" + 
//					"         <INDO13>USD</INDO13>\r\n" + 
//					"         <INDO14>0000035000000</INDO14>\r\n" + 
//					"         <INDO15>+</INDO15>\r\n" + 
//					"         <INDO16>00000000</INDO16>\r\n" + 
//					"         <INDO17>00001000000</INDO17>\r\n" + 
//					"         <INDO18>00000000000</INDO18>\r\n" + 
//					"         <INDO19>0000035000000</INDO19>\r\n" + 
//					"         <INDO20>+</INDO20>\r\n" + 
//					"         <INDO21>000000000000</INDO21>\r\n" + 
//					"         <INDO22>20200701</INDO22>\r\n" + 
//					"         <INDO23>20200701</INDO23>\r\n" + 
//					"         <INDO24>20200201</INDO24>\r\n" + 
//					"         <INDO25>0000000000000</INDO25>\r\n" + 
//					"         <INDO26>+</INDO26>\r\n" + 
//					"         <INDO27>00000000</INDO27>\r\n" + 
//					"      </TxRepeat>\r\n" + 
//					"      <TxRepeat>\r\n" + 
//					"         <INDO06>001FB002749</INDO06>\r\n" + 
//					"         <INDO07>PA003</INDO07>\r\n" + 
//					"         <INDO08>1</INDO08>\r\n" + 
//					"         <INDO09>20190904</INDO09>\r\n" + 
//					"         <INDO10>00000024720000</INDO10>\r\n" + 
//					"         <INDO11>0000012360000000</INDO11>\r\n" + 
//					"         <INDO12>00001174000</INDO12>\r\n" + 
//					"         <INDO13>USD</INDO13>\r\n" + 
//					"         <INDO14>0000005000000</INDO14>\r\n" + 
//					"         <INDO15>+</INDO15>\r\n" + 
//					"         <INDO16>00005280</INDO16>\r\n" + 
//					"         <INDO17>00001000000</INDO17>\r\n" + 
//					"         <INDO18>00000000000</INDO18>\r\n" + 
//					"         <INDO19>0000000000000</INDO19>\r\n" + 
//					"         <INDO20>+</INDO20>\r\n" + 
//					"         <INDO21>000000062000</INDO21>\r\n" + 
//					"         <INDO22>20200701</INDO22>\r\n" + 
//					"         <INDO23>20200701</INDO23>\r\n" + 
//					"         <INDO24>20200201</INDO24>\r\n" + 
//					"         <INDO25>0000000000000</INDO25>\r\n" + 
//					"         <INDO26>+</INDO26>\r\n" + 
//					"         <INDO27>00005280</INDO27>\r\n" + 
//					"      </TxRepeat>\r\n" + 
//					"      <TxRepeat>\r\n" + 
//					"         <INDO06>001FB002762</INDO06>\r\n" + 
//					"         <INDO07>PA003</INDO07>\r\n" + 
//					"         <INDO08>1</INDO08>\r\n" + 
//					"         <INDO09>20190919</INDO09>\r\n" + 
//					"         <INDO10>00000024720000</INDO10>\r\n" + 
//					"         <INDO11>0000000000000000</INDO11>\r\n" + 
//					"         <INDO12>00000000000</INDO12>\r\n" + 
//					"         <INDO13>USD</INDO13>\r\n" + 
//					"         <INDO14>0000005000000</INDO14>\r\n" + 
//					"         <INDO15>+</INDO15>\r\n" + 
//					"         <INDO16>00000000</INDO16>\r\n" + 
//					"         <INDO17>00001000000</INDO17>\r\n" + 
//					"         <INDO18>00000000000</INDO18>\r\n" + 
//					"         <INDO19>0000005000000</INDO19>\r\n" + 
//					"         <INDO20>+</INDO20>\r\n" + 
//					"         <INDO21>000000000000</INDO21>\r\n" + 
//					"         <INDO22>20200701</INDO22>\r\n" + 
//					"         <INDO23>20200701</INDO23>\r\n" + 
//					"         <INDO24>20200201</INDO24>\r\n" + 
//					"         <INDO25>0000000000000</INDO25>\r\n" + 
//					"         <INDO26>+</INDO26>\r\n" + 
//					"         <INDO27>00000000</INDO27>\r\n" + 
//					"      </TxRepeat>\r\n" + 
//					"      <TxRepeat>\r\n" + 
//					"         <INDO06>001FB002882</INDO06>\r\n" + 
//					"         <INDO07>PB009</INDO07>\r\n" + 
//					"         <INDO08>1</INDO08>\r\n" + 
//					"         <INDO09>20200520</INDO09>\r\n" + 
//					"         <INDO10>00000026740000</INDO10>\r\n" + 
//					"         <INDO11>0000802200000000</INDO11>\r\n" + 
//					"         <INDO12>00075000000</INDO12>\r\n" + 
//					"         <INDO13>USD</INDO13>\r\n" + 
//					"         <INDO14>0000300000000</INDO14>\r\n" + 
//					"         <INDO15>+</INDO15>\r\n" + 
//					"         <INDO16>00006960</INDO16>\r\n" + 
//					"         <INDO17>00001000000</INDO17>\r\n" + 
//					"         <INDO18>00000000000</INDO18>\r\n" + 
//					"         <INDO19>0000000000000</INDO19>\r\n" + 
//					"         <INDO20>+</INDO20>\r\n" + 
//					"         <INDO21>000005220000</INDO21>\r\n" + 
//					"         <INDO22>20191113</INDO22>\r\n" + 
//					"         <INDO23>20200701</INDO23>\r\n" + 
//					"         <INDO24>20200115</INDO24>\r\n" + 
//					"         <INDO25>0000000000000</INDO25>\r\n" + 
//					"         <INDO26>+</INDO26>\r\n" + 
//					"         <INDO27>00006960</INDO27>\r\n" + 
//					"      </TxRepeat>\r\n" + 
//					"      <TxRepeat>\r\n" + 
//					"         <INDO06>006FB001172</INDO06>\r\n" + 
//					"         <INDO07>PB009</INDO07>\r\n" + 
//					"         <INDO08>1</INDO08>\r\n" + 
//					"         <INDO09>20190613</INDO09>\r\n" + 
//					"         <INDO10>00000026740000</INDO10>\r\n" + 
//					"         <INDO11>0002674000000000</INDO11>\r\n" + 
//					"         <INDO12>00245500000</INDO12>\r\n" + 
//					"         <INDO13>USD</INDO13>\r\n" + 
//					"         <INDO14>0001000000000</INDO14>\r\n" + 
//					"         <INDO15>+</INDO15>\r\n" + 
//					"         <INDO16>00008920</INDO16>\r\n" + 
//					"         <INDO17>00001000000</INDO17>\r\n" + 
//					"         <INDO18>00000000000</INDO18>\r\n" + 
//					"         <INDO19>0000000000000</INDO19>\r\n" + 
//					"         <INDO20>+</INDO20>\r\n" + 
//					"         <INDO21>000021900000</INDO21>\r\n" + 
//					"         <INDO22>20191113</INDO22>\r\n" + 
//					"         <INDO23>20200701</INDO23>\r\n" + 
//					"         <INDO24>20200115</INDO24>\r\n" + 
//					"         <INDO25>0000000000000</INDO25>\r\n" + 
//					"         <INDO26>+</INDO26>\r\n" + 
//					"         <INDO27>00008920</INDO27>\r\n" + 
//					"      </TxRepeat>\r\n" + 
//					"   </TxBody>\r\n" + 
//					"</Tx>";
//		}
		
		if("2".equals(idni03)) {
			return "<Tx>\r\n" + 
					"    <TxHead>\r\n" + 
					"        <CTF_A_TXN_LEN>0329</CTF_A_TXN_LEN>\r\n" + 
					"        <CTF_A_TXN_ID_CODE>TNIND</CTF_A_TXN_ID_CODE>\r\n" + 
					"        <CTF_A_TXN_CHANNEL>WM</CTF_A_TXN_CHANNEL>\r\n" + 
					"        <CTF_A_HOST_SEQ_NO>0000582</CTF_A_HOST_SEQ_NO>\r\n" + 
					"        <CTF_A_STAN_NO>103</CTF_A_STAN_NO>\r\n" + 
					"        <CTF_A_TXN_DATE>20210201</CTF_A_TXN_DATE>\r\n" + 
					"        <CTF_A_TXN_TIME>103927</CTF_A_TXN_TIME>\r\n" + 
					"        <CTF_A_TERM_ID>MB887221</CTF_A_TERM_ID>\r\n" + 
					"        <CTF_A_BUSI_DATE>20210201</CTF_A_BUSI_DATE>\r\n" + 
					"        <CTF_A_ATMP_MODE>0</CTF_A_ATMP_MODE>\r\n" + 
					"        <CTF_A_FISC_MODE>0</CTF_A_FISC_MODE>\r\n" + 
					"        <CTF_A_RTN_CODE>0000</CTF_A_RTN_CODE>\r\n" + 
					"        <CTF_A_SEND_BANK>1030307</CTF_A_SEND_BANK>\r\n" + 
					"        <CTF_A_RECV_BANK>000000</CTF_A_RECV_BANK>\r\n" + 
					"        <CTF_A_FILLER/>\r\n" + 
					"    </TxHead>\r\n" + 
					"    <TxBody>\r\n" + 
					"        <INDO01>H200413847 </INDO01>\r\n" + 
					"        <INDO02/>\r\n" + 
					"        <INDO02A>2</INDO02A>\r\n" + 
					"        <INDO03>01</INDO03>\r\n" + 
					"        <INDO04>20210201</INDO04>\r\n" + 
					"        <INDO05>103927</INDO05>\r\n" + 
					"        <TxRepeat>\r\n" + 
					"            <INDO06>088FB001791   </INDO06>\r\n" + 
					"            <INDO07>D4801       </INDO07>\r\n" + 
					"            <INDO08>1</INDO08>\r\n" + 
					"            <INDO09>20121210</INDO09>\r\n" + 
					"            <INDO10>00000051330000</INDO10>\r\n" + 
					"            <INDO11>0000102660000000</INDO11>\r\n" + 
					"            <INDO12>00006370000</INDO12>\r\n" + 
					"            <INDO13>ZAR</INDO13>\r\n" + 
					"            <INDO14>0002000000000</INDO14>\r\n" + 
					"            <INDO15>+</INDO15>\r\n" + 
					"            <INDO16>00061160</INDO16>\r\n" + 
					"            <INDO17>00001000000</INDO17>\r\n" + 
					"            <INDO18>00000000000</INDO18>\r\n" + 
					"            <INDO19>0000000000000</INDO19>\r\n" + 
					"            <INDO20>+</INDO20>\r\n" + 
					"            <INDO21>000003896000</INDO21>\r\n" + 
					"            <INDO22>20210129</INDO22>\r\n" + 
					"            <INDO23>20210201</INDO23>\r\n" + 
					"            <INDO24>00000000</INDO24>\r\n" + 
					"            <INDO25>0000000000000</INDO25>\r\n" + 
					"            <INDO26>+</INDO26>\r\n" + 
					"            <INDO27>00061160</INDO27>\r\n" + 
					"        </TxRepeat>\r\n" + 
					"    </TxBody>\r\n" + 
					"</Tx>";
		}else if ("3".equals(idni03)) {
			return "<Tx>\r\n" + 
					"    <TxHead>\r\n" + 
					"        <CTF_A_TXN_LEN>0134</CTF_A_TXN_LEN>\r\n" + 
					"        <CTF_A_TXN_ID_CODE>TNIND</CTF_A_TXN_ID_CODE>\r\n" + 
					"        <CTF_A_TXN_CHANNEL>WM</CTF_A_TXN_CHANNEL>\r\n" + 
					"        <CTF_A_HOST_SEQ_NO>0000583</CTF_A_HOST_SEQ_NO>\r\n" + 
					"        <CTF_A_STAN_NO>103</CTF_A_STAN_NO>\r\n" + 
					"        <CTF_A_TXN_DATE>20210201</CTF_A_TXN_DATE>\r\n" + 
					"        <CTF_A_TXN_TIME>103927</CTF_A_TXN_TIME>\r\n" + 
					"        <CTF_A_TERM_ID>MB887221</CTF_A_TERM_ID>\r\n" + 
					"        <CTF_A_BUSI_DATE>20210201</CTF_A_BUSI_DATE>\r\n" + 
					"        <CTF_A_ATMP_MODE>0</CTF_A_ATMP_MODE>\r\n" + 
					"        <CTF_A_FISC_MODE>0</CTF_A_FISC_MODE>\r\n" + 
					"        <CTF_A_RTN_CODE>I000</CTF_A_RTN_CODE>\r\n" + 
					"        <CTF_A_SEND_BANK>1030307</CTF_A_SEND_BANK>\r\n" + 
					"        <CTF_A_RECV_BANK>000000</CTF_A_RECV_BANK>\r\n" + 
					"        <CTF_A_FILLER/>\r\n" + 
					"    </TxHead>\r\n" + 
					"    <TxBody>\r\n" + 
					"        <EMSGID/>\r\n" + 
					"        <EMSGTXT>                                 3  2021</EMSGTXT>\r\n" + 
					"    </TxBody>\r\n" + 
					"</Tx>\r\n" + 
					"";
		}else if ("4".equals(idni03)) {
			return "<Tx>\r\n" + 
					"    <TxHead>\r\n" + 
					"        <CTF_A_TXN_LEN>0134</CTF_A_TXN_LEN>\r\n" + 
					"        <CTF_A_TXN_ID_CODE>TNIND</CTF_A_TXN_ID_CODE>\r\n" + 
					"        <CTF_A_TXN_CHANNEL>WM</CTF_A_TXN_CHANNEL>\r\n" + 
					"        <CTF_A_HOST_SEQ_NO>0000583</CTF_A_HOST_SEQ_NO>\r\n" + 
					"        <CTF_A_STAN_NO>103</CTF_A_STAN_NO>\r\n" + 
					"        <CTF_A_TXN_DATE>20210201</CTF_A_TXN_DATE>\r\n" + 
					"        <CTF_A_TXN_TIME>103927</CTF_A_TXN_TIME>\r\n" + 
					"        <CTF_A_TERM_ID>MB887221</CTF_A_TERM_ID>\r\n" + 
					"        <CTF_A_BUSI_DATE>20210201</CTF_A_BUSI_DATE>\r\n" + 
					"        <CTF_A_ATMP_MODE>0</CTF_A_ATMP_MODE>\r\n" + 
					"        <CTF_A_FISC_MODE>0</CTF_A_FISC_MODE>\r\n" + 
					"        <CTF_A_RTN_CODE>I000</CTF_A_RTN_CODE>\r\n" + 
					"        <CTF_A_SEND_BANK>1030307</CTF_A_SEND_BANK>\r\n" + 
					"        <CTF_A_RECV_BANK>000000</CTF_A_RECV_BANK>\r\n" + 
					"        <CTF_A_FILLER/>\r\n" + 
					"    </TxHead>\r\n" + 
					"    <TxBody>\r\n" + 
					"        <EMSGID/>\r\n" + 
					"        <EMSGTXT>                                 3  2021</EMSGTXT>\r\n" + 
					"    </TxBody>\r\n" + 
					"</Tx>\r\n" + 
					"";
		}
		return null;
	}
}
