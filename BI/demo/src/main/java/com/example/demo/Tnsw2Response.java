package com.example.demo;

public class Tnsw2Response {
	
	public static String getTnsw2() {
		StringBuilder sb = new StringBuilder();
		sb.append("<Tx>                                                ");
		sb.append("   <TxHead>                                         ");
		sb.append("      <CTF_A_TXN_LEN>0181</CTF_A_TXN_LEN>           ");
		sb.append("      <CTF_A_TXN_ID_CODE>TNSW2</CTF_A_TXN_ID_CODE>  ");
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
		sb.append("      <SW2O01>T101074850</SW2O01>                   ");
		sb.append("      <SW2O02>049FG001061</SW2O02>                  ");
		sb.append("      <SW2O03>6513</SW2O03>                         ");
		sb.append("      <SW2O04>000000000</SW2O04>                    ");
		sb.append("      <SW2O05>000000000</SW2O05>                    ");
		sb.append("      <SW2O06>1</SW2O06>                            ");
		sb.append("      <SW2O07>20211019</SW2O07>                     ");
		sb.append("      <SW2O08>180802</SW2O08>                       ");
		sb.append("      <SW2O09>00000000</SW2O09>                     ");
		sb.append("      <SW2O10>00000</SW2O10>                        ");
		sb.append("      <SW2O11>00000000</SW2O11>                     ");
		sb.append("      <SW2O12/>                                     ");
		sb.append("      <SW2O13>@</SW2O13>                            ");
		sb.append("   </TxBody>                                        ");
		sb.append("</Tx>                                               ");
		return sb.toString();
	}

}
