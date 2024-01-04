package com.example.demo;

public class Tnrd2Response {
	
	public static String getTnrd2() {
		StringBuilder sb = new StringBuilder();
		sb.append("<Tx>                                                ");
		sb.append("   <TxHead>                                         ");
		sb.append("      <CTF_A_TXN_LEN>0144</CTF_A_TXN_LEN>           ");
		sb.append("      <CTF_A_TXN_ID_CODE>TNRD2</CTF_A_TXN_ID_CODE>  ");
		sb.append("      <CTF_A_TXN_CHANNEL>WM</CTF_A_TXN_CHANNEL>     ");
		sb.append("      <CTF_A_HOST_SEQ_NO>0000015</CTF_A_HOST_SEQ_NO>");
		sb.append("      <CTF_A_STAN_NO>103</CTF_A_STAN_NO>            ");
		sb.append("      <CTF_A_TXN_DATE>20211019</CTF_A_TXN_DATE>     ");
		sb.append("      <CTF_A_TXN_TIME>160725</CTF_A_TXN_TIME>       ");
		sb.append("      <CTF_A_TERM_ID>MB887221</CTF_A_TERM_ID>       ");
		sb.append("      <CTF_A_BUSI_DATE>20211019</CTF_A_BUSI_DATE>   ");
		sb.append("      <CTF_A_ATMP_MODE>0</CTF_A_ATMP_MODE>          ");
		sb.append("      <CTF_A_FISC_MODE>0</CTF_A_FISC_MODE>          ");
		sb.append("      <CTF_A_RTN_CODE>0000</CTF_A_RTN_CODE>         ");
		sb.append("      <CTF_A_SEND_BANK>1030307</CTF_A_SEND_BANK>    ");
		sb.append("      <CTF_A_RECV_BANK>000000</CTF_A_RECV_BANK>     ");
		sb.append("      <CTF_A_FILLER/>                               ");
		sb.append("   </TxHead>                                        ");
		sb.append("   <TxBody>                                         ");
		sb.append("      <RD2O01>T101074850</RD2O01>                   ");
		sb.append("      <RD2O02>001DG004993</RD2O02>                  ");
		sb.append("      <RD2O03>0101</RD2O03>                         ");
		sb.append("      <RD2O04>0</RD2O04>                            ");
		sb.append("      <RD2O05>20211019</RD2O05>                     ");
		sb.append("      <RD2O06>163049</RD2O06>                       ");
		sb.append("      <RD2O07>1</RD2O07>                            ");
		sb.append("      <RD2O08>N</RD2O08>                            ");
		sb.append("      <RD2O09>00000000</RD2O09>                     ");
		sb.append("      <RD2O10>00000</RD2O10>                        ");
		sb.append("      <RD2O11>00000000</RD2O11>                     ");
		sb.append("   </TxBody>                                        ");
		sb.append("</Tx>                                               ");
		return sb.toString();
	}

}
