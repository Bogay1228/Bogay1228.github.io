package com.example.demo;

public class TnsubResponse {
	
	public static String getTnsub() {
		//手動測試資料
		return "<Tx>\r\n" + 
				"    <TxHead>\r\n" + 
				"        <CTF_A_RTN_CODE>0000</CTF_A_RTN_CODE>\r\n" + 
				"    </TxHead>\r\n" + 
				"    <TxBody>\r\n" + 
				"        <SUBO01>TEST1234</SUBO01>\r\n" + 
				"        <SUBO02>C</SUBO02>\r\n" + 
				"        <SUBO03>1</SUBO03>\r\n" + 
				"        <SUBO04>0101</SUBO04>\r\n" + 
				"        <SUBO05>00001500</SUBO05>\r\n" + 
				"        <SUBO06>0000000100050</SUBO06>\r\n" + 
				"        <SUBO07></SUBO07>\r\n" + 
				"        <SUBO08>00000000000</SUBO08>\r\n" + 
				"        <SUBO09>TWD</SUBO09>\r\n" + 
				"        <SUBO10>1</SUBO10>\r\n" + 
				"        <SUBO11>20210915</SUBO11>\r\n" + 
				"        <SUBO12>121212</SUBO12>\r\n" + 
				"        <SUBO13>0000</SUBO13>\r\n" + 
				"        <SUBO14>0000</SUBO14>\r\n" + 
				"        <SUBO15></SUBO15>\r\n" + 
				"        <SUBO16></SUBO16>\r\n" + 
				"        <SUBO17>@</SUBO17>\r\n" + 
				"    </TxBody>\r\n" + 
				"</Tx>\r\n"; 
				
	}

}
