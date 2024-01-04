package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/xmlfor")
	public String method(@RequestBody String name) {
		String val = "";
		String CtfATxnIdCode = XmlParse.getCtfATxnIdCode(name);
		String returnValue = null;
		System.out.println(CtfATxnIdCode);
		switch (CtfATxnIdCode) {
		case "N9910":
			returnValue = N9910;
			break;
		case "N1010":
			returnValue = N1010;
			break;
		case "N1011":
			returnValue = N1011;
			break;
		case "WMACA":
			returnValue = WMACA;
			val = XmlParse.getColumnByParam(name, "PROJ_CODE").trim();
			if (!("".equals(val))) {
				returnValue = WMACA2;
			}
			break;
		case "16770":
			returnValue = _16770;
			break;
		case "WMACC":
			returnValue = WMACC;
			break;
		case "TNCH1":
			returnValue = TNCH1;
			break;
		case "WMACD":
			returnValue = WMACD;
			break;
		case "WMACB":
			com.example.demo.WMACB obj = new com.example.demo.WMACB();
			returnValue = obj.content();
			break;
		case "TNIND":
			returnValue = TNIND(XmlParse.getIndi03(name));
			break;
		case "AIINB":
			returnValue = AIINB(XmlParse.getFRIST_NUMBER(name));
			break;
		case "AIINA":
			returnValue = AIINA(XmlParse.getFRIST_NUMBER(name));
			break;
		case "9100B":
			returnValue = tx9100b();
			break;
		case "96603":
			returnValue = kyc96603(XmlParse.getCTF_ID_CODE(name), XmlParse.getCTF_BIRTHDAY(name));
			break;
		case "9100C":
			returnValue = tx9100c();
			break;
		case "TNIDX":
			returnValue = TNINX();
			break;
		case "TNINB":
			val = XmlParse.getColumnByParam(name, "INBI02").trim();
			returnValue = TNINB(val);
			break;
		case "TNSUB":
			returnValue = TNSUB();
			break;
		case "TNRD1":
			returnValue = TNRD1();
			break;
		case "TNRD2":
			returnValue = TNRD2();
			break;
		case "TNSW2":
			returnValue = TNSW2();
			break;
		case "6M201":
			returnValue = Eai6M2041;
			break;
		case "6M202": //20230606 新增
			returnValue = Eai6M2041; 
			break;	
		case "41R62":
			returnValue = Eai41R62;
			break;
		case "BDSUB":
			returnValue = BDSUB();
		default:
			break;
		}

		return returnValue;
	}
	private String BDSUB() {
		return null;
	}
	@RequestMapping("/xmlforSendMail")
	public String method1(@RequestBody String name) {
		
		return "SendMail_OK";
	}
	
	@RequestMapping("/xmlforInsClose")
	public String method2(@RequestBody String name) {
		
		return "InsClose_OK";
	}

	private final static String N9910 = "<Tx>\r\n" + "   <TxHead>\r\n" + "      <CTF_A_TXN_LEN>0121</CTF_A_TXN_LEN>\r\n"
			+ "      <CTF_A_TXN_ID_CODE>N9910</CTF_A_TXN_ID_CODE>\r\n"
			+ "      <CTF_A_TXN_CHANNEL>WM</CTF_A_TXN_CHANNEL>\r\n"
			+ "      <CTF_A_HOST_SEQ_NO>0000025</CTF_A_HOST_SEQ_NO>\r\n"
			+ "      <CTF_A_STAN_NO>1030000000</CTF_A_STAN_NO>\r\n"
			+ "      <CTF_A_TXN_DATE>20200325</CTF_A_TXN_DATE>\r\n"
			+ "      <CTF_A_TXN_TIME>163533</CTF_A_TXN_TIME>\r\n" + "      <CTF_A_TERM_ID>MB887221</CTF_A_TERM_ID>\r\n"
			+ "      <CTF_A_BUSI_DATE>20200325</CTF_A_BUSI_DATE>\r\n" + "      <CTF_A_ATMP_MODE>0</CTF_A_ATMP_MODE>\r\n"
			+ "      <CTF_A_FISC_MODE>0</CTF_A_FISC_MODE>\r\n" + "      <CTF_A_RTN_CODE>0000</CTF_A_RTN_CODE>\r\n"
			+ "      <CTF_A_SEND_BANK>1030000</CTF_A_SEND_BANK>\r\n"
			+ "      <CTF_A_RECV_BANK>1030000</CTF_A_RECV_BANK>\r\n" + "      <CTF_A_FILLER />\r\n" + "   </TxHead>\r\n"
			+ "   <TxBody>\r\n" + "      <WMSG_HOST_FLAG>0</WMSG_HOST_FLAG>\r\n"
			+ "      <WMSG_FISC_TXN_STAT>1</WMSG_FISC_TXN_STAT>\r\n" + "      <WMSG_FISC_FLAG>1</WMSG_FISC_FLAG>\r\n"
			+ "      <WMSG_BUSI_DATE>20200325</WMSG_BUSI_DATE>\r\n"
			+ "      <WMSG_N_BUSI_DATE>20200326</WMSG_N_BUSI_DATE>\r\n"
			+ "      <WMSG_TXN_DATE>20200325</WMSG_TXN_DATE>\r\n" + "      <WMSG_TXN_TIME>163552</WMSG_TXN_TIME>\r\n"
			+ "      <WMSG_FISC_BUSI_DATE>20200326</WMSG_FISC_BUSI_DATE>\r\n" + "   </TxBody>\r\n" + "</Tx>";
	private final static String N1010 = "<Tx>\r\n" + "   <TxHead>\r\n" + "      <CTF_A_TXN_LEN>1524</CTF_A_TXN_LEN>\r\n"
			+ "      <CTF_A_TXN_ID_CODE>N1010</CTF_A_TXN_ID_CODE>\r\n"
			+ "      <CTF_A_TXN_CHANNEL>WM</CTF_A_TXN_CHANNEL>\r\n"
			+ "      <CTF_A_HOST_SEQ_NO>0000029</CTF_A_HOST_SEQ_NO>\r\n"
			+ "      <CTF_A_STAN_NO>1030000000</CTF_A_STAN_NO>\r\n"
			+ "      <CTF_A_TXN_DATE>20181025</CTF_A_TXN_DATE>\r\n"
			+ "      <CTF_A_TXN_TIME>190720</CTF_A_TXN_TIME>\r\n" + "      <CTF_A_TERM_ID>MB887221</CTF_A_TERM_ID>\r\n"
			+ "      <CTF_A_BUSI_DATE>20181026</CTF_A_BUSI_DATE>\r\n" + "      <CTF_A_ATMP_MODE>0</CTF_A_ATMP_MODE>\r\n"
			+ "      <CTF_A_FISC_MODE>1</CTF_A_FISC_MODE>\r\n" + "      <CTF_A_RTN_CODE>0000</CTF_A_RTN_CODE>\r\n"
			+ "      <CTF_A_SEND_BANK>1030000</CTF_A_SEND_BANK>\r\n"
			+ "      <CTF_A_RECV_BANK>1030000</CTF_A_RECV_BANK>\r\n" + "      <CTF_A_FILLER />\r\n" + "   </TxHead>\r\n"
			+ "   <TxBody>\r\n" + "      <WMSG_ID_NO>T101074850</WMSG_ID_NO>\r\n"
			+ "      <WMSG_CUST_NAME>李Ｘ昌Ｘ            　　　　　　</WMSG_CUST_NAME>\r\n"
			+ "      <WMSG_CUST_ENG_NAME>LEＸTSＸ</WMSG_CUST_ENG_NAME>\r\n" + "      <WMSG_SEX_CODE>M</WMSG_SEX_CODE>\r\n"
			+ "      <WMSG_INQ_INDEX />\r\n" + "      <WMSG_LN_FLAG>0</WMSG_LN_FLAG>\r\n"
			+ "      <WMSG_COUNT>10</WMSG_COUNT>\r\n" + "      <TxRepeat>\r\n"
			+ "         <WMSG_ACC_ID_NO>0000116404001189</WMSG_ACC_ID_NO>\r\n"
			+ "         <WMSG_BR_CODE>0116</WMSG_BR_CODE>\r\n" + "         <WMSG_CURR_CODE>TWD</WMSG_CURR_CODE>\r\n"
			+ "         <WMSG_PRD_CODE>S400001</WMSG_PRD_CODE>\r\n" + "         <WMSG_ACC_STAT>00</WMSG_ACC_STAT>\r\n"
			+ "         <WMSG_AVAIL_BAL_SIGN>+</WMSG_AVAIL_BAL_SIGN>\r\n"
			+ "         <WMSG_AVAIL_BAL>0000000000000</WMSG_AVAIL_BAL>\r\n"
			+ "         <WMSG_BAL_SIGN>+</WMSG_BAL_SIGN>\r\n" + "         <WMSG_BAL>0000000000000</WMSG_BAL>\r\n"
			+ "         <WMSG_NB_TRAN>0</WMSG_NB_TRAN>\r\n" + "         <WMSG_NB_OTP>0</WMSG_NB_OTP>\r\n"
			+ "         <WMSG_NB_MPA>0</WMSG_NB_MPA>\r\n" + "         <WMSG_ACC_CHAR_CODE>00</WMSG_ACC_CHAR_CODE>\r\n"
			+ "         <WMSG_CARD_FORMAT>00</WMSG_CARD_FORMAT>\r\n" + "      </TxRepeat>\r\n" + "      <TxRepeat>\r\n"
			+ "         <WMSG_ACC_ID_NO>0000116501050989</WMSG_ACC_ID_NO>\r\n"
			+ "         <WMSG_BR_CODE>0116</WMSG_BR_CODE>\r\n" + "         <WMSG_CURR_CODE>TWD</WMSG_CURR_CODE>\r\n"
			+ "         <WMSG_PRD_CODE>S500002</WMSG_PRD_CODE>\r\n" + "         <WMSG_ACC_STAT>00</WMSG_ACC_STAT>\r\n"
			+ "         <WMSG_AVAIL_BAL_SIGN>+</WMSG_AVAIL_BAL_SIGN>\r\n"
			+ "         <WMSG_AVAIL_BAL>0000150255100</WMSG_AVAIL_BAL>\r\n"
			+ "         <WMSG_BAL_SIGN>+</WMSG_BAL_SIGN>\r\n" + "         <WMSG_BAL>0000150255100</WMSG_BAL>\r\n"
			+ "         <WMSG_NB_TRAN>0</WMSG_NB_TRAN>\r\n" + "         <WMSG_NB_OTP>0</WMSG_NB_OTP>\r\n"
			+ "         <WMSG_NB_MPA>0</WMSG_NB_MPA>\r\n" + "         <WMSG_ACC_CHAR_CODE>01</WMSG_ACC_CHAR_CODE>\r\n"
			+ "         <WMSG_CARD_FORMAT>00</WMSG_CARD_FORMAT>\r\n" + "      </TxRepeat>\r\n" + "      <TxRepeat>\r\n"
			+ "         <WMSG_ACC_ID_NO>0000161501169977</WMSG_ACC_ID_NO>\r\n"
			+ "         <WMSG_BR_CODE>0161</WMSG_BR_CODE>\r\n" + "         <WMSG_CURR_CODE>TWD</WMSG_CURR_CODE>\r\n"
			+ "         <WMSG_PRD_CODE>S500002</WMSG_PRD_CODE>\r\n" + "         <WMSG_ACC_STAT>00</WMSG_ACC_STAT>\r\n"
			+ "         <WMSG_AVAIL_BAL_SIGN>+</WMSG_AVAIL_BAL_SIGN>\r\n"
			+ "         <WMSG_AVAIL_BAL>0000613621600</WMSG_AVAIL_BAL>\r\n"
			+ "         <WMSG_BAL_SIGN>+</WMSG_BAL_SIGN>\r\n" + "         <WMSG_BAL>0000613621600</WMSG_BAL>\r\n"
			+ "         <WMSG_NB_TRAN>1</WMSG_NB_TRAN>\r\n" + "         <WMSG_NB_OTP>0</WMSG_NB_OTP>\r\n"
			+ "         <WMSG_NB_MPA>0</WMSG_NB_MPA>\r\n" + "         <WMSG_ACC_CHAR_CODE>01</WMSG_ACC_CHAR_CODE>\r\n"
			+ "         <WMSG_CARD_FORMAT>00</WMSG_CARD_FORMAT>\r\n" + "      </TxRepeat>\r\n" + "      <TxRepeat>\r\n"
			+ "         <WMSG_ACC_ID_NO>0000499501055589</WMSG_ACC_ID_NO>\r\n"
			+ "         <WMSG_BR_CODE>0499</WMSG_BR_CODE>\r\n" + "         <WMSG_CURR_CODE>TWD</WMSG_CURR_CODE>\r\n"
			+ "         <WMSG_PRD_CODE>S500002</WMSG_PRD_CODE>\r\n" + "         <WMSG_ACC_STAT>00</WMSG_ACC_STAT>\r\n"
			+ "         <WMSG_AVAIL_BAL_SIGN>+</WMSG_AVAIL_BAL_SIGN>\r\n"
			+ "         <WMSG_AVAIL_BAL>0000472951000</WMSG_AVAIL_BAL>\r\n"
			+ "         <WMSG_BAL_SIGN>+</WMSG_BAL_SIGN>\r\n" + "         <WMSG_BAL>0000472951000</WMSG_BAL>\r\n"
			+ "         <WMSG_NB_TRAN>0</WMSG_NB_TRAN>\r\n" + "         <WMSG_NB_OTP>0</WMSG_NB_OTP>\r\n"
			+ "         <WMSG_NB_MPA>0</WMSG_NB_MPA>\r\n" + "         <WMSG_ACC_CHAR_CODE>01</WMSG_ACC_CHAR_CODE>\r\n"
			+ "         <WMSG_CARD_FORMAT>00</WMSG_CARD_FORMAT>\r\n" + "      </TxRepeat>\r\n" + "      <TxRepeat>\r\n"
			+ "         <WMSG_ACC_ID_NO>0000833500071974</WMSG_ACC_ID_NO>\r\n"
			+ "         <WMSG_BR_CODE>0833</WMSG_BR_CODE>\r\n" + "         <WMSG_CURR_CODE>TWD</WMSG_CURR_CODE>\r\n"
			+ "         <WMSG_PRD_CODE>S500001</WMSG_PRD_CODE>\r\n" + "         <WMSG_ACC_STAT>00</WMSG_ACC_STAT>\r\n"
			+ "         <WMSG_AVAIL_BAL_SIGN>+</WMSG_AVAIL_BAL_SIGN>\r\n"
			+ "         <WMSG_AVAIL_BAL>0000109861400</WMSG_AVAIL_BAL>\r\n"
			+ "         <WMSG_BAL_SIGN>+</WMSG_BAL_SIGN>\r\n" + "         <WMSG_BAL>0000109861400</WMSG_BAL>\r\n"
			+ "         <WMSG_NB_TRAN>1</WMSG_NB_TRAN>\r\n" + "         <WMSG_NB_OTP>0</WMSG_NB_OTP>\r\n"
			+ "         <WMSG_NB_MPA>0</WMSG_NB_MPA>\r\n" + "         <WMSG_ACC_CHAR_CODE>01</WMSG_ACC_CHAR_CODE>\r\n"
			+ "         <WMSG_CARD_FORMAT>17</WMSG_CARD_FORMAT>\r\n" + "      </TxRepeat>\r\n" + "      <TxRepeat>\r\n"
			+ "         <WMSG_ACC_ID_NO>0000851500004898</WMSG_ACC_ID_NO>\r\n"
			+ "         <WMSG_BR_CODE>0851</WMSG_BR_CODE>\r\n" + "         <WMSG_CURR_CODE>TWD</WMSG_CURR_CODE>\r\n"
			+ "         <WMSG_PRD_CODE>S500002</WMSG_PRD_CODE>\r\n" + "         <WMSG_ACC_STAT>00</WMSG_ACC_STAT>\r\n"
			+ "         <WMSG_AVAIL_BAL_SIGN>+</WMSG_AVAIL_BAL_SIGN>\r\n"
			+ "         <WMSG_AVAIL_BAL>0000871449300</WMSG_AVAIL_BAL>\r\n"
			+ "         <WMSG_BAL_SIGN>+</WMSG_BAL_SIGN>\r\n" + "         <WMSG_BAL>0000871449300</WMSG_BAL>\r\n"
			+ "         <WMSG_NB_TRAN>0</WMSG_NB_TRAN>\r\n" + "         <WMSG_NB_OTP>0</WMSG_NB_OTP>\r\n"
			+ "         <WMSG_NB_MPA>0</WMSG_NB_MPA>\r\n" + "         <WMSG_ACC_CHAR_CODE>01</WMSG_ACC_CHAR_CODE>\r\n"
			+ "         <WMSG_CARD_FORMAT>00</WMSG_CARD_FORMAT>\r\n" + "      </TxRepeat>\r\n" + "      <TxRepeat>\r\n"
			+ "         <WMSG_ACC_ID_NO>0000958200000011</WMSG_ACC_ID_NO>\r\n"
			+ "         <WMSG_BR_CODE>0958</WMSG_BR_CODE>\r\n" + "         <WMSG_CURR_CODE>TWD</WMSG_CURR_CODE>\r\n"
			+ "         <WMSG_PRD_CODE>S200001</WMSG_PRD_CODE>\r\n" + "         <WMSG_ACC_STAT>00</WMSG_ACC_STAT>\r\n"
			+ "         <WMSG_AVAIL_BAL_SIGN>+</WMSG_AVAIL_BAL_SIGN>\r\n"
			+ "         <WMSG_AVAIL_BAL>0000821065300</WMSG_AVAIL_BAL>\r\n"
			+ "         <WMSG_BAL_SIGN>+</WMSG_BAL_SIGN>\r\n" + "         <WMSG_BAL>0000821065300</WMSG_BAL>\r\n"
			+ "         <WMSG_NB_TRAN>0</WMSG_NB_TRAN>\r\n" + "         <WMSG_NB_OTP>0</WMSG_NB_OTP>\r\n"
			+ "         <WMSG_NB_MPA>0</WMSG_NB_MPA>\r\n" + "         <WMSG_ACC_CHAR_CODE>05</WMSG_ACC_CHAR_CODE>\r\n"
			+ "         <WMSG_CARD_FORMAT>17</WMSG_CARD_FORMAT>\r\n" + "      </TxRepeat>\r\n" + "      <TxRepeat>\r\n"
			+ "         <WMSG_ACC_ID_NO>0000958400007989</WMSG_ACC_ID_NO>\r\n"
			+ "         <WMSG_BR_CODE>0958</WMSG_BR_CODE>\r\n" + "         <WMSG_CURR_CODE>TWD</WMSG_CURR_CODE>\r\n"
			+ "         <WMSG_PRD_CODE>S400001</WMSG_PRD_CODE>\r\n" + "         <WMSG_ACC_STAT>00</WMSG_ACC_STAT>\r\n"
			+ "         <WMSG_AVAIL_BAL_SIGN>+</WMSG_AVAIL_BAL_SIGN>\r\n"
			+ "         <WMSG_AVAIL_BAL>0000000000000</WMSG_AVAIL_BAL>\r\n"
			+ "         <WMSG_BAL_SIGN>+</WMSG_BAL_SIGN>\r\n" + "         <WMSG_BAL>0000000000000</WMSG_BAL>\r\n"
			+ "         <WMSG_NB_TRAN>0</WMSG_NB_TRAN>\r\n" + "         <WMSG_NB_OTP>0</WMSG_NB_OTP>\r\n"
			+ "         <WMSG_NB_MPA>0</WMSG_NB_MPA>\r\n" + "         <WMSG_ACC_CHAR_CODE>00</WMSG_ACC_CHAR_CODE>\r\n"
			+ "         <WMSG_CARD_FORMAT>00</WMSG_CARD_FORMAT>\r\n" + "      </TxRepeat>\r\n" + "      <TxRepeat>\r\n"
			+ "         <WMSG_ACC_ID_NO>0000967100173110</WMSG_ACC_ID_NO>\r\n"
			+ "         <WMSG_BR_CODE>0967</WMSG_BR_CODE>\r\n" + "         <WMSG_CURR_CODE>TWD</WMSG_CURR_CODE>\r\n"
			+ "         <WMSG_PRD_CODE>S100001</WMSG_PRD_CODE>\r\n" + "         <WMSG_ACC_STAT>00</WMSG_ACC_STAT>\r\n"
			+ "         <WMSG_AVAIL_BAL_SIGN>+</WMSG_AVAIL_BAL_SIGN>\r\n"
			+ "         <WMSG_AVAIL_BAL>0000035022700</WMSG_AVAIL_BAL>\r\n"
			+ "         <WMSG_BAL_SIGN>+</WMSG_BAL_SIGN>\r\n" + "         <WMSG_BAL>0000035022700</WMSG_BAL>\r\n"
			+ "         <WMSG_NB_TRAN>0</WMSG_NB_TRAN>\r\n" + "         <WMSG_NB_OTP>0</WMSG_NB_OTP>\r\n"
			+ "         <WMSG_NB_MPA>0</WMSG_NB_MPA>\r\n" + "         <WMSG_ACC_CHAR_CODE>71</WMSG_ACC_CHAR_CODE>\r\n"
			+ "         <WMSG_CARD_FORMAT>00</WMSG_CARD_FORMAT>\r\n" + "      </TxRepeat>\r\n" + "      <TxRepeat>\r\n"
			+ "         <WMSG_ACC_ID_NO>0001100500105584</WMSG_ACC_ID_NO>\r\n"
			+ "         <WMSG_BR_CODE>1100</WMSG_BR_CODE>\r\n" + "         <WMSG_CURR_CODE>TWD</WMSG_CURR_CODE>\r\n"
			+ "         <WMSG_PRD_CODE>S500001</WMSG_PRD_CODE>\r\n" + "         <WMSG_ACC_STAT>00</WMSG_ACC_STAT>\r\n"
			+ "         <WMSG_AVAIL_BAL_SIGN>+</WMSG_AVAIL_BAL_SIGN>\r\n"
			+ "         <WMSG_AVAIL_BAL>0000571666500</WMSG_AVAIL_BAL>\r\n"
			+ "         <WMSG_BAL_SIGN>+</WMSG_BAL_SIGN>\r\n" + "         <WMSG_BAL>0000571666500</WMSG_BAL>\r\n"
			+ "         <WMSG_NB_TRAN>0</WMSG_NB_TRAN>\r\n" + "         <WMSG_NB_OTP>0</WMSG_NB_OTP>\r\n"
			+ "         <WMSG_NB_MPA>0</WMSG_NB_MPA>\r\n" + "         <WMSG_ACC_CHAR_CODE>01</WMSG_ACC_CHAR_CODE>\r\n"
			+ "         <WMSG_CARD_FORMAT>00</WMSG_CARD_FORMAT>\r\n" + "      </TxRepeat>\r\n" + "      <TxRepeat>\r\n"
			+ "         <WMSG_ACC_ID_NO>0000000000000000</WMSG_ACC_ID_NO>\r\n"
			+ "         <WMSG_BR_CODE>0000</WMSG_BR_CODE>\r\n" + "         <WMSG_CURR_CODE />\r\n"
			+ "         <WMSG_PRD_CODE />\r\n" + "         <WMSG_ACC_STAT>00</WMSG_ACC_STAT>\r\n"
			+ "         <WMSG_AVAIL_BAL_SIGN />\r\n" + "         <WMSG_AVAIL_BAL>0000000000000</WMSG_AVAIL_BAL>\r\n"
			+ "         <WMSG_BAL_SIGN />\r\n" + "         <WMSG_BAL>0000000000000</WMSG_BAL>\r\n"
			+ "         <WMSG_NB_TRAN>0</WMSG_NB_TRAN>\r\n" + "         <WMSG_NB_OTP>0</WMSG_NB_OTP>\r\n"
			+ "         <WMSG_NB_MPA>0</WMSG_NB_MPA>\r\n" + "         <WMSG_ACC_CHAR_CODE>00</WMSG_ACC_CHAR_CODE>\r\n"
			+ "         <WMSG_CARD_FORMAT>00</WMSG_CARD_FORMAT>\r\n" + "      </TxRepeat>\r\n" + "      <TxRepeat>\r\n"
			+ "         <WMSG_ACC_ID_NO>0000000000000000</WMSG_ACC_ID_NO>\r\n"
			+ "         <WMSG_BR_CODE>0000</WMSG_BR_CODE>\r\n" + "         <WMSG_CURR_CODE />\r\n"
			+ "         <WMSG_PRD_CODE />\r\n" + "         <WMSG_ACC_STAT>00</WMSG_ACC_STAT>\r\n"
			+ "         <WMSG_AVAIL_BAL_SIGN />\r\n" + "         <WMSG_AVAIL_BAL>0000000000000</WMSG_AVAIL_BAL>\r\n"
			+ "         <WMSG_BAL_SIGN />\r\n" + "         <WMSG_BAL>0000000000000</WMSG_BAL>\r\n"
			+ "         <WMSG_NB_TRAN>0</WMSG_NB_TRAN>\r\n" + "         <WMSG_NB_OTP>0</WMSG_NB_OTP>\r\n"
			+ "         <WMSG_NB_MPA>0</WMSG_NB_MPA>\r\n" + "         <WMSG_ACC_CHAR_CODE>00</WMSG_ACC_CHAR_CODE>\r\n"
			+ "         <WMSG_CARD_FORMAT>00</WMSG_CARD_FORMAT>\r\n" + "      </TxRepeat>\r\n" + "      <TxRepeat>\r\n"
			+ "         <WMSG_ACC_ID_NO>0000000000000000</WMSG_ACC_ID_NO>\r\n"
			+ "         <WMSG_BR_CODE>0000</WMSG_BR_CODE>\r\n" + "         <WMSG_CURR_CODE />\r\n"
			+ "         <WMSG_PRD_CODE />\r\n" + "         <WMSG_ACC_STAT>00</WMSG_ACC_STAT>\r\n"
			+ "         <WMSG_AVAIL_BAL_SIGN />\r\n" + "         <WMSG_AVAIL_BAL>0000000000000</WMSG_AVAIL_BAL>\r\n"
			+ "         <WMSG_BAL_SIGN />\r\n" + "         <WMSG_BAL>0000000000000</WMSG_BAL>\r\n"
			+ "         <WMSG_NB_TRAN>0</WMSG_NB_TRAN>\r\n" + "         <WMSG_NB_OTP>0</WMSG_NB_OTP>\r\n"
			+ "         <WMSG_NB_MPA>0</WMSG_NB_MPA>\r\n" + "         <WMSG_ACC_CHAR_CODE>00</WMSG_ACC_CHAR_CODE>\r\n"
			+ "         <WMSG_CARD_FORMAT>00</WMSG_CARD_FORMAT>\r\n" + "      </TxRepeat>\r\n" + "      <TxRepeat>\r\n"
			+ "         <WMSG_ACC_ID_NO>0000000000000000</WMSG_ACC_ID_NO>\r\n"
			+ "         <WMSG_BR_CODE>0000</WMSG_BR_CODE>\r\n" + "         <WMSG_CURR_CODE />\r\n"
			+ "         <WMSG_PRD_CODE />\r\n" + "         <WMSG_ACC_STAT>00</WMSG_ACC_STAT>\r\n"
			+ "         <WMSG_AVAIL_BAL_SIGN />\r\n" + "         <WMSG_AVAIL_BAL>0000000000000</WMSG_AVAIL_BAL>\r\n"
			+ "         <WMSG_BAL_SIGN />\r\n" + "         <WMSG_BAL>0000000000000</WMSG_BAL>\r\n"
			+ "         <WMSG_NB_TRAN>0</WMSG_NB_TRAN>\r\n" + "         <WMSG_NB_OTP>0</WMSG_NB_OTP>\r\n"
			+ "         <WMSG_NB_MPA>0</WMSG_NB_MPA>\r\n" + "         <WMSG_ACC_CHAR_CODE>00</WMSG_ACC_CHAR_CODE>\r\n"
			+ "         <WMSG_CARD_FORMAT>00</WMSG_CARD_FORMAT>\r\n" + "      </TxRepeat>\r\n" + "      <TxRepeat>\r\n"
			+ "         <WMSG_ACC_ID_NO>0000000000000000</WMSG_ACC_ID_NO>\r\n"
			+ "         <WMSG_BR_CODE>0000</WMSG_BR_CODE>\r\n" + "         <WMSG_CURR_CODE />\r\n"
			+ "         <WMSG_PRD_CODE />\r\n" + "         <WMSG_ACC_STAT>00</WMSG_ACC_STAT>\r\n"
			+ "         <WMSG_AVAIL_BAL_SIGN />\r\n" + "         <WMSG_AVAIL_BAL>0000000000000</WMSG_AVAIL_BAL>\r\n"
			+ "         <WMSG_BAL_SIGN />\r\n" + "         <WMSG_BAL>0000000000000</WMSG_BAL>\r\n"
			+ "         <WMSG_NB_TRAN>0</WMSG_NB_TRAN>\r\n" + "         <WMSG_NB_OTP>0</WMSG_NB_OTP>\r\n"
			+ "         <WMSG_NB_MPA>0</WMSG_NB_MPA>\r\n" + "         <WMSG_ACC_CHAR_CODE>00</WMSG_ACC_CHAR_CODE>\r\n"
			+ "         <WMSG_CARD_FORMAT>00</WMSG_CARD_FORMAT>\r\n" + "      </TxRepeat>\r\n" + "      <TxRepeat>\r\n"
			+ "         <WMSG_ACC_ID_NO>0000000000000000</WMSG_ACC_ID_NO>\r\n"
			+ "         <WMSG_BR_CODE>0000</WMSG_BR_CODE>\r\n" + "         <WMSG_CURR_CODE />\r\n"
			+ "         <WMSG_PRD_CODE />\r\n" + "         <WMSG_ACC_STAT>00</WMSG_ACC_STAT>\r\n"
			+ "         <WMSG_AVAIL_BAL_SIGN />\r\n" + "         <WMSG_AVAIL_BAL>0000000000000</WMSG_AVAIL_BAL>\r\n"
			+ "         <WMSG_BAL_SIGN />\r\n" + "         <WMSG_BAL>0000000000000</WMSG_BAL>\r\n"
			+ "         <WMSG_NB_TRAN>0</WMSG_NB_TRAN>\r\n" + "         <WMSG_NB_OTP>0</WMSG_NB_OTP>\r\n"
			+ "         <WMSG_NB_MPA>0</WMSG_NB_MPA>\r\n" + "         <WMSG_ACC_CHAR_CODE>00</WMSG_ACC_CHAR_CODE>\r\n"
			+ "         <WMSG_CARD_FORMAT>00</WMSG_CARD_FORMAT>\r\n" + "      </TxRepeat>\r\n" + "      <TxRepeat>\r\n"
			+ "         <WMSG_ACC_ID_NO>0000000000000000</WMSG_ACC_ID_NO>\r\n"
			+ "         <WMSG_BR_CODE>0000</WMSG_BR_CODE>\r\n" + "         <WMSG_CURR_CODE />\r\n"
			+ "         <WMSG_PRD_CODE />\r\n" + "         <WMSG_ACC_STAT>00</WMSG_ACC_STAT>\r\n"
			+ "         <WMSG_AVAIL_BAL_SIGN />\r\n" + "         <WMSG_AVAIL_BAL>0000000000000</WMSG_AVAIL_BAL>\r\n"
			+ "         <WMSG_BAL_SIGN />\r\n" + "         <WMSG_BAL>0000000000000</WMSG_BAL>\r\n"
			+ "         <WMSG_NB_TRAN>0</WMSG_NB_TRAN>\r\n" + "         <WMSG_NB_OTP>0</WMSG_NB_OTP>\r\n"
			+ "         <WMSG_NB_MPA>0</WMSG_NB_MPA>\r\n" + "         <WMSG_ACC_CHAR_CODE>00</WMSG_ACC_CHAR_CODE>\r\n"
			+ "         <WMSG_CARD_FORMAT>00</WMSG_CARD_FORMAT>\r\n" + "      </TxRepeat>\r\n" + "      <TxRepeat>\r\n"
			+ "         <WMSG_ACC_ID_NO>0000000000000000</WMSG_ACC_ID_NO>\r\n"
			+ "         <WMSG_BR_CODE>0000</WMSG_BR_CODE>\r\n" + "         <WMSG_CURR_CODE />\r\n"
			+ "         <WMSG_PRD_CODE />\r\n" + "         <WMSG_ACC_STAT>00</WMSG_ACC_STAT>\r\n"
			+ "         <WMSG_AVAIL_BAL_SIGN />\r\n" + "         <WMSG_AVAIL_BAL>0000000000000</WMSG_AVAIL_BAL>\r\n"
			+ "         <WMSG_BAL_SIGN />\r\n" + "         <WMSG_BAL>0000000000000</WMSG_BAL>\r\n"
			+ "         <WMSG_NB_TRAN>0</WMSG_NB_TRAN>\r\n" + "         <WMSG_NB_OTP>0</WMSG_NB_OTP>\r\n"
			+ "         <WMSG_NB_MPA>0</WMSG_NB_MPA>\r\n" + "         <WMSG_ACC_CHAR_CODE>00</WMSG_ACC_CHAR_CODE>\r\n"
			+ "         <WMSG_CARD_FORMAT>00</WMSG_CARD_FORMAT>\r\n" + "      </TxRepeat>\r\n" + "      <TxRepeat>\r\n"
			+ "         <WMSG_ACC_ID_NO>0000000000000000</WMSG_ACC_ID_NO>\r\n"
			+ "         <WMSG_BR_CODE>0000</WMSG_BR_CODE>\r\n" + "         <WMSG_CURR_CODE />\r\n"
			+ "         <WMSG_PRD_CODE />\r\n" + "         <WMSG_ACC_STAT>00</WMSG_ACC_STAT>\r\n"
			+ "         <WMSG_AVAIL_BAL_SIGN />\r\n" + "         <WMSG_AVAIL_BAL>0000000000000</WMSG_AVAIL_BAL>\r\n"
			+ "         <WMSG_BAL_SIGN />\r\n" + "         <WMSG_BAL>0000000000000</WMSG_BAL>\r\n"
			+ "         <WMSG_NB_TRAN>0</WMSG_NB_TRAN>\r\n" + "         <WMSG_NB_OTP>0</WMSG_NB_OTP>\r\n"
			+ "         <WMSG_NB_MPA>0</WMSG_NB_MPA>\r\n" + "         <WMSG_ACC_CHAR_CODE>00</WMSG_ACC_CHAR_CODE>\r\n"
			+ "         <WMSG_CARD_FORMAT>00</WMSG_CARD_FORMAT>\r\n" + "      </TxRepeat>\r\n" + "      <TxRepeat>\r\n"
			+ "         <WMSG_ACC_ID_NO>0000000000000000</WMSG_ACC_ID_NO>\r\n"
			+ "         <WMSG_BR_CODE>0000</WMSG_BR_CODE>\r\n" + "         <WMSG_CURR_CODE />\r\n"
			+ "         <WMSG_PRD_CODE />\r\n" + "         <WMSG_ACC_STAT>00</WMSG_ACC_STAT>\r\n"
			+ "         <WMSG_AVAIL_BAL_SIGN />\r\n" + "         <WMSG_AVAIL_BAL>0000000000000</WMSG_AVAIL_BAL>\r\n"
			+ "         <WMSG_BAL_SIGN />\r\n" + "         <WMSG_BAL>0000000000000</WMSG_BAL>\r\n"
			+ "         <WMSG_NB_TRAN>0</WMSG_NB_TRAN>\r\n" + "         <WMSG_NB_OTP>0</WMSG_NB_OTP>\r\n"
			+ "         <WMSG_NB_MPA>0</WMSG_NB_MPA>\r\n" + "         <WMSG_ACC_CHAR_CODE>00</WMSG_ACC_CHAR_CODE>\r\n"
			+ "         <WMSG_CARD_FORMAT>00</WMSG_CARD_FORMAT>\r\n" + "      </TxRepeat>\r\n" + "   </TxBody>\r\n"
			+ "</Tx>";
	private final static String N1011 = N1010Response.getResponse();

	private final static String WMACA = "<Tx>\r\n" + "   <TxHead>\r\n" + "      <CTF_A_TXN_LEN>0260</CTF_A_TXN_LEN>\r\n"
			+ "      <CTF_A_TXN_ID_CODE>WMACA</CTF_A_TXN_ID_CODE>\r\n"
			+ "      <CTF_A_TXN_CHANNEL>WM</CTF_A_TXN_CHANNEL>\r\n"
			+ "      <CTF_A_HOST_SEQ_NO>0000027</CTF_A_HOST_SEQ_NO>\r\n"
			+ "      <CTF_A_STAN_NO>1030000000</CTF_A_STAN_NO>\r\n"
			+ "      <CTF_A_TXN_DATE>20200325</CTF_A_TXN_DATE>\r\n"
			+ "      <CTF_A_TXN_TIME>163538</CTF_A_TXN_TIME>\r\n" + "      <CTF_A_TERM_ID>MB887221</CTF_A_TERM_ID>\r\n"
			+ "      <CTF_A_BUSI_DATE>20200325</CTF_A_BUSI_DATE>\r\n" + "      <CTF_A_ATMP_MODE>0</CTF_A_ATMP_MODE>\r\n"
			+ "      <CTF_A_FISC_MODE>0</CTF_A_FISC_MODE>\r\n" + "      <CTF_A_RTN_CODE>0000</CTF_A_RTN_CODE>\r\n"
			+ "      <CTF_A_SEND_BANK>1030000</CTF_A_SEND_BANK>\r\n"
			+ "      <CTF_A_RECV_BANK>1030000</CTF_A_RECV_BANK>\r\n" + "      <CTF_A_FILLER>DB</CTF_A_FILLER>\r\n"
			+ "   </TxHead>\r\n" + "   <TxBody>\r\n" + "      <SYS_CTG>WMS</SYS_CTG>\r\n"
			+ "      <MSG_CTG>QRY</MSG_CTG>\r\n" + "      <VAILD_DATE>20200325</VAILD_DATE>\r\n"
			+ "      <FEE_RATE>02000</FEE_RATE>\r\n" + "      <TX_RESULT_CODE />\r\n" + "      <DESC />\r\n"
			+ "      <SWT_FEE>00000000000</SWT_FEE>\r\n"
			+ "      <FUND_CMP_MAUP_FEE>00000000000</FUND_CMP_MAUP_FEE>\r\n" + "      <F_FEE>00000000000</F_FEE>\r\n"
			+ "      <REF_NO>001DG005035</REF_NO>\r\n" + "      <FEE_AMT>00000100000</FEE_AMT>\r\n"
			+ "      <ENDING>@</ENDING>\r\n" + "   </TxBody>\r\n" + "</Tx>";

	private final static String WMACA2 = "<Tx>\r\n" + "   <TxHead>\r\n"
			+ "      <CTF_A_TXN_LEN>0260</CTF_A_TXN_LEN>\r\n" + "      <CTF_A_TXN_ID_CODE>WMACA</CTF_A_TXN_ID_CODE>\r\n"
			+ "      <CTF_A_TXN_CHANNEL>WM</CTF_A_TXN_CHANNEL>\r\n"
			+ "      <CTF_A_HOST_SEQ_NO>0000027</CTF_A_HOST_SEQ_NO>\r\n"
			+ "      <CTF_A_STAN_NO>1030000000</CTF_A_STAN_NO>\r\n"
			+ "      <CTF_A_TXN_DATE>20200325</CTF_A_TXN_DATE>\r\n"
			+ "      <CTF_A_TXN_TIME>163538</CTF_A_TXN_TIME>\r\n" + "      <CTF_A_TERM_ID>MB887221</CTF_A_TERM_ID>\r\n"
			+ "      <CTF_A_BUSI_DATE>20200325</CTF_A_BUSI_DATE>\r\n" + "      <CTF_A_ATMP_MODE>0</CTF_A_ATMP_MODE>\r\n"
			+ "      <CTF_A_FISC_MODE>0</CTF_A_FISC_MODE>\r\n" + "      <CTF_A_RTN_CODE>0000</CTF_A_RTN_CODE>\r\n"
			+ "      <CTF_A_SEND_BANK>1030000</CTF_A_SEND_BANK>\r\n"
			+ "      <CTF_A_RECV_BANK>1030000</CTF_A_RECV_BANK>\r\n" + "      <CTF_A_FILLER>DB</CTF_A_FILLER>\r\n"
			+ "   </TxHead>\r\n" + "   <TxBody>\r\n" + "      <SYS_CTG>WMS</SYS_CTG>\r\n"
			+ "      <MSG_CTG>QRY</MSG_CTG>\r\n" + "      <VAILD_DATE>20200325</VAILD_DATE>\r\n"
			+ "      <FEE_RATE>09000</FEE_RATE>\r\n" + "      <TX_RESULT_CODE />\r\n" + "      <DESC />\r\n"
			+ "      <SWT_FEE>00000000000</SWT_FEE>\r\n"
			+ "      <FUND_CMP_MAUP_FEE>00000000000</FUND_CMP_MAUP_FEE>\r\n" + "      <F_FEE>00000000000</F_FEE>\r\n"
			+ "      <REF_NO>001DG005035</REF_NO>\r\n" + "      <FEE_AMT>00000100000</FEE_AMT>\r\n"
			+ "      <ENDING>@</ENDING>\r\n" + "   </TxBody>\r\n" + "</Tx>";
	private final static String _16770 = "<Tx>\r\n" + "   <TxHead>\r\n"
			+ "      <CTF_A_TXN_LEN>0247</CTF_A_TXN_LEN>\r\n" + "      <CTF_A_TXN_ID_CODE>16770</CTF_A_TXN_ID_CODE>\r\n"
			+ "      <CTF_A_TXN_CHANNEL>WM</CTF_A_TXN_CHANNEL>\r\n"
			+ "      <CTF_A_HOST_SEQ_NO>000000028</CTF_A_HOST_SEQ_NO>\r\n"
			+ "      <CTF_A_STAN_NO>1030000000</CTF_A_STAN_NO>\r\n"
			+ "      <CTF_A_TXN_DATE>20200325</CTF_A_TXN_DATE>\r\n"
			+ "      <CTF_A_TXN_TIME>164252</CTF_A_TXN_TIME>\r\n" + "      <CTF_A_TERM_ID>MB887221</CTF_A_TERM_ID>\r\n"
			+ "      <CTF_A_BUSI_DATE>20200325</CTF_A_BUSI_DATE>\r\n" + "      <CTF_A_ATMP_MODE>0</CTF_A_ATMP_MODE>\r\n"
			+ "      <CTF_A_FISC_MODE>0</CTF_A_FISC_MODE>\r\n" + "      <CTF_A_RTN_CODE>0000</CTF_A_RTN_CODE>\r\n"
			+ "      <CTF_A_SEND_BANK>1030019</CTF_A_SEND_BANK>\r\n"
			+ "      <CTF_A_RECV_BANK>1030000</CTF_A_RECV_BANK>\r\n" + "      <CTF_A_FILLER>DB</CTF_A_FILLER>\r\n"
			+ "   </TxHead>\r\n" + "   <TxBody>\r\n" + "      <WMSG_FUN_CODE>1</WMSG_FUN_CODE>\r\n"
			+ "      <WMSG_ACC_ID_NO>0019506083817</WMSG_ACC_ID_NO>\r\n"
			+ "      <WMSG_CURR_CODE>TWD</WMSG_CURR_CODE>\r\n" + "      <WMSG_ID_CODE>Q!221607998</WMSG_ID_CODE>\r\n"
			+ "      <WMSG_HOLD_KIND>11</WMSG_HOLD_KIND>\r\n"
			+ "      <WMSG_HOLD_AMT>000000005100000</WMSG_HOLD_AMT>\r\n"
			+ "      <WMSG_UHOLD_AMT>000000000000000</WMSG_UHOLD_AMT>\r\n"
			+ "      <WMSG_TXN_AMT>000000000000000</WMSG_TXN_AMT>\r\n"
			+ "      <WMSG_PROD_CODE>1234</WMSG_PROD_CODE>\r\n" + "      <WMSG_HOLD_SEQ>20200325001</WMSG_HOLD_SEQ>\r\n"
			+ "      <WMSG_TRUST_SEQ>001DG005035</WMSG_TRUST_SEQ>\r\n" + "      <WMSG_IN_ACC_ID_NO />\r\n"
			+ "      <WMSG_TXN_TLR />\r\n" + "      <WMSG_TXN_SUP />\r\n"
			+ "      <WMSG_HOST_TXN_SEQ_NO>88728872298000021</WMSG_HOST_TXN_SEQ_NO>\r\n" + "   </TxBody>\r\n" + "</Tx>";
	private final static String WMACC = "<Tx>\r\n" + "   <TxHead>\r\n" + "      <CTF_A_TXN_LEN>0367</CTF_A_TXN_LEN>\r\n"
			+ "      <CTF_A_TXN_ID_CODE>WMACC</CTF_A_TXN_ID_CODE>\r\n"
			+ "      <CTF_A_TXN_CHANNEL>WM</CTF_A_TXN_CHANNEL>\r\n"
			+ "      <CTF_A_HOST_SEQ_NO>0000003</CTF_A_HOST_SEQ_NO>\r\n"
			+ "      <CTF_A_STAN_NO>1030000000</CTF_A_STAN_NO>\r\n"
			+ "      <CTF_A_TXN_DATE>20200401</CTF_A_TXN_DATE>\r\n"
			+ "      <CTF_A_TXN_TIME>133353</CTF_A_TXN_TIME>\r\n" + "      <CTF_A_TERM_ID>MB887221</CTF_A_TERM_ID>\r\n"
			+ "      <CTF_A_BUSI_DATE>20200401</CTF_A_BUSI_DATE>\r\n" + "      <CTF_A_ATMP_MODE>0</CTF_A_ATMP_MODE>\r\n"
			+ "      <CTF_A_FISC_MODE>0</CTF_A_FISC_MODE>\r\n" + "      <CTF_A_RTN_CODE>0000</CTF_A_RTN_CODE>\r\n"
			+ "      <CTF_A_SEND_BANK>1030000</CTF_A_SEND_BANK>\r\n"
			+ "      <CTF_A_RECV_BANK>1030000</CTF_A_RECV_BANK>\r\n" + "      <CTF_A_FILLER>DB</CTF_A_FILLER>\r\n"
			+ "   </TxHead>\r\n" + "   <TxBody>\r\n" + "      <IDN>Q!221607998</IDN>\r\n"
			+ "      <SYS_CTG>WMS</SYS_CTG>\r\n" + "      <ACC_NO />\r\n"
			+ "      <DB_CONT_NO>001DT005099</DB_CONT_NO>\r\n" + "      <CURT_REF_NO>001DT005099</CURT_REF_NO>\r\n"
			+ "      <CURT_PFCAT_CODE>FUND</CURT_PFCAT_CODE>\r\n" + "      <CURT_PRO_CODE>0101</CURT_PRO_CODE>\r\n"
			+ "      <CURT_PORLIO_CODE />\r\n" + "      <CURT_DB_CUR_CODE>NTD</CURT_DB_CUR_CODE>\r\n"
			+ "      <CURT_DB_AMT>00000600000</CURT_DB_AMT>\r\n"
			+ "      <CURT_DB_ACC_NO>0019506083817</CURT_DB_ACC_NO>\r\n"
			+ "      <CURT_DB_STR_DATE>20190819</CURT_DB_STR_DATE>\r\n"
			+ "      <CURT_RM_ACC_NO>0019506083817</CURT_RM_ACC_NO>\r\n"
			+ "      <NEW_CONT_STATUS>00</NEW_CONT_STATUS>\r\n" + "      <INV_TYPE>S</INV_TYPE>\r\n"
			+ "      <DB_SUCC_NUM>000</DB_SUCC_NUM>\r\n" + "      <DB_DAY>030000000000</DB_DAY>\r\n"
			+ "      <TX_RESULT_CODE>00</TX_RESULT_CODE>\r\n" + "      <DESC>@</DESC>\r\n"
			+ "      <ENDING>@</ENDING>\r\n" + "   </TxBody>\r\n" + "</Tx>";
	private final static String TNCH1 = "<Tx>\r\n" + "    <TxHead>\r\n"
			+ "        <CTF_A_TXN_LEN>1787</CTF_A_TXN_LEN>\r\n"
			+ "        <CTF_A_TXN_ID_CODE>TNCH1</CTF_A_TXN_ID_CODE>\r\n"
			+ "        <CTF_A_TXN_CHANNEL>WM</CTF_A_TXN_CHANNEL>\r\n"
			+ "        <CTF_A_HOST_SEQ_NO>0000002</CTF_A_HOST_SEQ_NO>\r\n"
			+ "        <CTF_A_STAN_NO>103</CTF_A_STAN_NO>\r\n" + "        <CTF_A_TXN_DATE>20200401</CTF_A_TXN_DATE>\r\n"
			+ "        <CTF_A_TXN_TIME>133332</CTF_A_TXN_TIME>\r\n"
			+ "        <CTF_A_TERM_ID>MB887221</CTF_A_TERM_ID>\r\n"
			+ "        <CTF_A_BUSI_DATE>20200401</CTF_A_BUSI_DATE>\r\n"
			+ "        <CTF_A_ATMP_MODE>0</CTF_A_ATMP_MODE>\r\n" + "        <CTF_A_FISC_MODE>0</CTF_A_FISC_MODE>\r\n"
			+ "        <CTF_A_RTN_CODE>0000</CTF_A_RTN_CODE>\r\n"
			+ "        <CTF_A_SEND_BANK>1030307</CTF_A_SEND_BANK>\r\n"
			+ "        <CTF_A_RECV_BANK>000000</CTF_A_RECV_BANK>\r\n" + "        <CTF_A_FILLER/>\r\n"
			+ "    </TxHead>\r\n" + "    <TxBody>\r\n" + "        <TC1O01>Q@221607998 </TC1O01>\r\n"
			+ "        <TC1O02/>\r\n" + "        <TA1O03>15</TA1O03>\r\n" + "        <TA1O04>20200401</TA1O04>\r\n"
			+ "        <TA1O05>133338</TA1O05>\r\n" + "        <TxRepeat>\r\n"
			+ "            <TC1O07>001NT005072</TC1O07>\r\n" + "            <TC1O08>5407</TC1O08>\r\n"
			+ "            <TC1O09> 富林高科技基金       </TC1O09>\r\n" + "            <TC1O10>07</TC1O10>\r\n"
			+ "            <TC1O11>00</TC1O11>\r\n" + "            <TC1O12>00</TC1O12>\r\n"
			+ "            <TC1O13>USD</TC1O13>\r\n" + "            <TC1O14>000000001000000</TC1O14>\r\n"
			+ "            <TC1O15>0019506083817   </TC1O15>\r\n" + "            <TC1O16>2</TC1O16>\r\n"
			+ "            <TC1O17>1</TC1O17>\r\n" + "            <TC1O18>Q@221607998 </TC1O18>\r\n"
			+ "            <TC1O19>000000000000000</TC1O19>\r\n" + "            <TC1O21>00</TC1O21>\r\n"
			+ "            <TC1O22>00</TC1O22>\r\n" + "            <TC1O23>00</TC1O23>\r\n" + "        </TxRepeat>\r\n"
			+ "        <TxRepeat>\r\n" + "            <TC1O07>001NT005073</TC1O07>\r\n"
			+ "            <TC1O08>5529</TC1O08>\r\n" + "            <TC1O09> 聯博印度成長基金Ａ美 </TC1O09>\r\n"
			+ "            <TC1O10>07</TC1O10>\r\n" + "            <TC1O11>00</TC1O11>\r\n"
			+ "            <TC1O12>00</TC1O12>\r\n" + "            <TC1O13>USD</TC1O13>\r\n"
			+ "            <TC1O14>000000001000000</TC1O14>\r\n" + "            <TC1O15>0019506083817   </TC1O15>\r\n"
			+ "            <TC1O16>2</TC1O16>\r\n" + "            <TC1O17>1</TC1O17>\r\n"
			+ "            <TC1O18>Q@221607998 </TC1O18>\r\n" + "            <TC1O19>000000000000000</TC1O19>\r\n"
			+ "            <TC1O21>00</TC1O21>\r\n" + "            <TC1O22>00</TC1O22>\r\n"
			+ "            <TC1O23>00</TC1O23>\r\n" + "        </TxRepeat>\r\n" + "        <TxRepeat>\r\n"
			+ "            <TC1O07>001NT005074</TC1O07>\r\n" + "            <TC1O08>5414</TC1O08>\r\n"
			+ "            <TC1O09> 富蘭克林坦伯頓成長   </TC1O09>\r\n" + "            <TC1O10>07</TC1O10>\r\n"
			+ "            <TC1O11>00</TC1O11>\r\n" + "            <TC1O12>00</TC1O12>\r\n"
			+ "            <TC1O13>TWD</TC1O13>\r\n" + "            <TC1O14>000000001000000</TC1O14>\r\n"
			+ "            <TC1O15>0019506083817   </TC1O15>\r\n" + "            <TC1O16>2</TC1O16>\r\n"
			+ "            <TC1O17>1</TC1O17>\r\n" + "            <TC1O18>Q@221607998 </TC1O18>\r\n"
			+ "            <TC1O19>000000000000000</TC1O19>\r\n" + "            <TC1O21>00</TC1O21>\r\n"
			+ "            <TC1O22>00</TC1O22>\r\n" + "            <TC1O23>00</TC1O23>\r\n" + "        </TxRepeat>\r\n"
			+ "        <TxRepeat>\r\n" + "            <TC1O07>001NT005090</TC1O07>\r\n"
			+ "            <TC1O08>5377</TC1O08>\r\n" + "            <TC1O09> 摩根多重收益基金美沖 </TC1O09>\r\n"
			+ "            <TC1O10>23</TC1O10>\r\n" + "            <TC1O11>27</TC1O11>\r\n"
			+ "            <TC1O12>00</TC1O12>\r\n" + "            <TC1O13>TWD</TC1O13>\r\n"
			+ "            <TC1O14>000000000300000</TC1O14>\r\n" + "            <TC1O15>0019506083817   </TC1O15>\r\n"
			+ "            <TC1O16>2</TC1O16>\r\n" + "            <TC1O17>1</TC1O17>\r\n"
			+ "            <TC1O18>Q@221607998 </TC1O18>\r\n" + "            <TC1O19>000000000000000</TC1O19>\r\n"
			+ "            <TC1O21>00</TC1O21>\r\n" + "            <TC1O22>00</TC1O22>\r\n"
			+ "            <TC1O23>00</TC1O23>\r\n" + "        </TxRepeat>\r\n" + "        <TxRepeat>\r\n"
			+ "            <TC1O07>001NT005091</TC1O07>\r\n" + "            <TC1O08>5377</TC1O08>\r\n"
			+ "            <TC1O09> 摩根多重收益基金美沖 </TC1O09>\r\n" + "            <TC1O10>03</TC1O10>\r\n"
			+ "            <TC1O11>00</TC1O11>\r\n" + "            <TC1O12>00</TC1O12>\r\n"
			+ "            <TC1O13>TWD</TC1O13>\r\n" + "            <TC1O14>000000000500000</TC1O14>\r\n"
			+ "            <TC1O15>0019506083817   </TC1O15>\r\n" + "            <TC1O16>2</TC1O16>\r\n"
			+ "            <TC1O17>1</TC1O17>\r\n" + "            <TC1O18>Q@221607998 </TC1O18>\r\n"
			+ "            <TC1O19>000000000000000</TC1O19>\r\n" + "            <TC1O21>00</TC1O21>\r\n"
			+ "            <TC1O22>00</TC1O22>\r\n" + "            <TC1O23>00</TC1O23>\r\n" + "        </TxRepeat>\r\n"
			+ "        <TxRepeat>\r\n" + "            <TC1O07>001NT005103</TC1O07>\r\n"
			+ "            <TC1O08>5401</TC1O08>\r\n" + "            <TC1O09> 富林黃金基金         </TC1O09>\r\n"
			+ "            <TC1O10>07</TC1O10>\r\n" + "            <TC1O11>13</TC1O11>\r\n"
			+ "            <TC1O12>00</TC1O12>\r\n" + "            <TC1O13>TWD</TC1O13>\r\n"
			+ "            <TC1O14>000000000500000</TC1O14>\r\n" + "            <TC1O15>0019506083817   </TC1O15>\r\n"
			+ "            <TC1O16>2</TC1O16>\r\n" + "            <TC1O17>1</TC1O17>\r\n"
			+ "            <TC1O18>Q@221607998 </TC1O18>\r\n" + "            <TC1O19>000000000000000</TC1O19>\r\n"
			+ "            <TC1O21>00</TC1O21>\r\n" + "            <TC1O22>00</TC1O22>\r\n"
			+ "            <TC1O23>00</TC1O23>\r\n" + "        </TxRepeat>\r\n" + "        <TxRepeat>\r\n"
			+ "            <TC1O07>001NT005134</TC1O07>\r\n" + "            <TC1O08>5401</TC1O08>\r\n"
			+ "            <TC1O09> 富林黃金基金         </TC1O09>\r\n" + "            <TC1O10>13</TC1O10>\r\n"
			+ "            <TC1O11>17</TC1O11>\r\n" + "            <TC1O12>23</TC1O12>\r\n"
			+ "            <TC1O13>TWD</TC1O13>\r\n" + "            <TC1O14>000000000800000</TC1O14>\r\n"
			+ "            <TC1O15>0019506083817   </TC1O15>\r\n" + "            <TC1O16>2</TC1O16>\r\n"
			+ "            <TC1O17>1</TC1O17>\r\n" + "            <TC1O18>Q@221607998 </TC1O18>\r\n"
			+ "            <TC1O19>000000000000000</TC1O19>\r\n" + "            <TC1O21>00</TC1O21>\r\n"
			+ "            <TC1O22>00</TC1O22>\r\n" + "            <TC1O23>00</TC1O23>\r\n" + "        </TxRepeat>\r\n"
			+ "        <TxRepeat>\r\n" + "            <TC1O07>006FN000519</TC1O07>\r\n"
			+ "            <TC1O08>6109</TC1O08>\r\n" + "            <TC1O09> 駿利環球生命科技Ａ美 </TC1O09>\r\n"
			+ "            <TC1O10>23</TC1O10>\r\n" + "            <TC1O11>27</TC1O11>\r\n"
			+ "            <TC1O12>00</TC1O12>\r\n" + "            <TC1O13>USD</TC1O13>\r\n"
			+ "            <TC1O14>000000000030000</TC1O14>\r\n" + "            <TC1O15>0019110322513   </TC1O15>\r\n"
			+ "            <TC1O16>2</TC1O16>\r\n" + "            <TC1O17>1</TC1O17>\r\n"
			+ "            <TC1O18>Q@221607998 </TC1O18>\r\n" + "            <TC1O19>000000000000000</TC1O19>\r\n"
			+ "            <TC1O21>00</TC1O21>\r\n" + "            <TC1O22>00</TC1O22>\r\n"
			+ "            <TC1O23>00</TC1O23>\r\n" + "        </TxRepeat>\r\n" + "        <TxRepeat>\r\n"
			+ "            <TC1O07>006FN000520</TC1O07>\r\n" + "            <TC1O08>6109</TC1O08>\r\n"
			+ "            <TC1O09> 駿利環球生命科技Ａ美 </TC1O09>\r\n" + "            <TC1O10>13</TC1O10>\r\n"
			+ "            <TC1O11>17</TC1O11>\r\n" + "            <TC1O12>23</TC1O12>\r\n"
			+ "            <TC1O13>USD</TC1O13>\r\n" + "            <TC1O14>000000000030000</TC1O14>\r\n"
			+ "            <TC1O15>0019110322513   </TC1O15>\r\n" + "            <TC1O16>2</TC1O16>\r\n"
			+ "            <TC1O17>1</TC1O17>\r\n" + "            <TC1O18>Q@221607998 </TC1O18>\r\n"
			+ "            <TC1O19>000000000000000</TC1O19>\r\n" + "            <TC1O21>00</TC1O21>\r\n"
			+ "            <TC1O22>00</TC1O22>\r\n" + "            <TC1O23>00</TC1O23>\r\n" + "        </TxRepeat>\r\n"
			+ "        <TxRepeat>\r\n" + "            <TC1O07>006FT000510</TC1O07>\r\n"
			+ "            <TC1O08>5154</TC1O08>\r\n" + "            <TC1O09> 富達歐洲高收益基金   </TC1O09>\r\n"
			+ "            <TC1O10>23</TC1O10>\r\n" + "            <TC1O11>03</TC1O11>\r\n"
			+ "            <TC1O12>00</TC1O12>\r\n" + "            <TC1O13>EUR</TC1O13>\r\n"
			+ "            <TC1O14>000000000026800</TC1O14>\r\n" + "            <TC1O15>0019110322513   </TC1O15>\r\n"
			+ "            <TC1O16>2</TC1O16>\r\n" + "            <TC1O17>1</TC1O17>\r\n"
			+ "            <TC1O18>Q@221607998 </TC1O18>\r\n" + "            <TC1O19>000000000026781</TC1O19>\r\n"
			+ "            <TC1O21>00</TC1O21>\r\n" + "            <TC1O22>00</TC1O22>\r\n"
			+ "            <TC1O23>00</TC1O23>\r\n" + "        </TxRepeat>\r\n" + "        <TxRepeat>\r\n"
			+ "            <TC1O07>006NN004866</TC1O07>\r\n" + "            <TC1O08>5D09</TC1O08>\r\n"
			+ "            <TC1O09> 安聯歐高息ＡＭＧ穩收 </TC1O09>\r\n" + "            <TC1O10>23</TC1O10>\r\n"
			+ "            <TC1O11>27</TC1O11>\r\n" + "            <TC1O12>03</TC1O12>\r\n"
			+ "            <TC1O13>TWD</TC1O13>\r\n" + "            <TC1O14>000000000500000</TC1O14>\r\n"
			+ "            <TC1O15>0019506083817   </TC1O15>\r\n" + "            <TC1O16>2</TC1O16>\r\n"
			+ "            <TC1O17>1</TC1O17>\r\n" + "            <TC1O18>Q@221607998 </TC1O18>\r\n"
			+ "            <TC1O19>000000000000000</TC1O19>\r\n" + "            <TC1O21>00</TC1O21>\r\n"
			+ "            <TC1O22>00</TC1O22>\r\n" + "            <TC1O23>00</TC1O23>\r\n" + "        </TxRepeat>\r\n"
			+ "        <TxRepeat>\r\n" + "            <TC1O07>006NT004890</TC1O07>\r\n"
			+ "            <TC1O08>5152</TC1O08>\r\n" + "            <TC1O09> 富達美元債券Ａ股月配 </TC1O09>\r\n"
			+ "            <TC1O10>17</TC1O10>\r\n" + "            <TC1O11>23</TC1O11>\r\n"
			+ "            <TC1O12>13</TC1O12>\r\n" + "            <TC1O13>TWD</TC1O13>\r\n"
			+ "            <TC1O14>000000000500000</TC1O14>\r\n" + "            <TC1O15>0019506083817   </TC1O15>\r\n"
			+ "            <TC1O16>2</TC1O16>\r\n" + "            <TC1O17>1</TC1O17>\r\n"
			+ "            <TC1O18>Q@221607998 </TC1O18>\r\n" + "            <TC1O19>000000000000000</TC1O19>\r\n"
			+ "            <TC1O21>00</TC1O21>\r\n" + "            <TC1O22>00</TC1O22>\r\n"
			+ "            <TC1O23>00</TC1O23>\r\n" + "        </TxRepeat>\r\n" + "        <TxRepeat>\r\n"
			+ "            <TC1O07>006NT004896</TC1O07>\r\n" + "            <TC1O08>5153</TC1O08>\r\n"
			+ "            <TC1O09> 富達美元高收益基金月 </TC1O09>\r\n" + "            <TC1O10>17</TC1O10>\r\n"
			+ "            <TC1O11>23</TC1O11>\r\n" + "            <TC1O12>13</TC1O12>\r\n"
			+ "            <TC1O13>TWD</TC1O13>\r\n" + "            <TC1O14>000000000500000</TC1O14>\r\n"
			+ "            <TC1O15>0019506083817   </TC1O15>\r\n" + "            <TC1O16>2</TC1O16>\r\n"
			+ "            <TC1O17>1</TC1O17>\r\n" + "            <TC1O18>Q@221607998 </TC1O18>\r\n"
			+ "            <TC1O19>000000000000000</TC1O19>\r\n" + "            <TC1O21>00</TC1O21>\r\n"
			+ "            <TC1O22>00</TC1O22>\r\n" + "            <TC1O23>00</TC1O23>\r\n" + "        </TxRepeat>\r\n"
			+ "        <TxRepeat>\r\n" + "            <TC1O07>006NT004900</TC1O07>\r\n"
			+ "            <TC1O08>5D01</TC1O08>\r\n" + "            <TC1O09> 安聯收益成長ＡＴ累積 </TC1O09>\r\n"
			+ "            <TC1O10>03</TC1O10>\r\n" + "            <TC1O11>07</TC1O11>\r\n"
			+ "            <TC1O12>13</TC1O12>\r\n" + "            <TC1O13>TWD</TC1O13>\r\n"
			+ "            <TC1O14>000000000500000</TC1O14>\r\n" + "            <TC1O15>0019506083817   </TC1O15>\r\n"
			+ "            <TC1O16>2</TC1O16>\r\n" + "            <TC1O17>1</TC1O17>\r\n"
			+ "            <TC1O18>Q@221607998 </TC1O18>\r\n" + "            <TC1O19>000000000000000</TC1O19>\r\n"
			+ "            <TC1O21>00</TC1O21>\r\n" + "            <TC1O22>00</TC1O22>\r\n"
			+ "            <TC1O23>00</TC1O23>\r\n" + "        </TxRepeat>\r\n" + "        <TxRepeat>\r\n"
			+ "            <TC1O07>006NT004902</TC1O07>\r\n" + "            <TC1O08>5D01</TC1O08>\r\n"
			+ "            <TC1O09> 安聯收益成長ＡＴ累積 </TC1O09>\r\n" + "            <TC1O10>07</TC1O10>\r\n"
			+ "            <TC1O11>13</TC1O11>\r\n" + "            <TC1O12>17</TC1O12>\r\n"
			+ "            <TC1O13>TWD</TC1O13>\r\n" + "            <TC1O14>000000000500000</TC1O14>\r\n"
			+ "            <TC1O15>0019506083817   </TC1O15>\r\n" + "            <TC1O16>2</TC1O16>\r\n"
			+ "            <TC1O17>1</TC1O17>\r\n" + "            <TC1O18>Q@221607998 </TC1O18>\r\n"
			+ "            <TC1O19>000000000000000</TC1O19>\r\n" + "            <TC1O21>00</TC1O21>\r\n"
			+ "            <TC1O22>00</TC1O22>\r\n" + "            <TC1O23>00</TC1O23>\r\n" + "        </TxRepeat>\r\n"
			+ "        <TxRepeat>\r\n" + "            <TC1O07/>\r\n" + "            <TC1O08/>\r\n"
			+ "            <TC1O09/>\r\n" + "            <TC1O10/>\r\n" + "            <TC1O11/>\r\n"
			+ "            <TC1O12/>\r\n" + "            <TC1O13/>\r\n" + "            <TC1O14/>\r\n"
			+ "            <TC1O15/>\r\n" + "            <TC1O16/>\r\n" + "            <TC1O17/>\r\n"
			+ "            <TC1O18/>\r\n" + "            <TC1O19/>\r\n" + "            <TC1O21/>\r\n"
			+ "            <TC1O22/>\r\n" + "            <TC1O23/>\r\n" + "        </TxRepeat>\r\n"
			+ "        <TxRepeat>\r\n" + "            <TC1O07/>\r\n" + "            <TC1O08/>\r\n"
			+ "            <TC1O09/>\r\n" + "            <TC1O10/>\r\n" + "            <TC1O11/>\r\n"
			+ "            <TC1O12/>\r\n" + "            <TC1O13/>\r\n" + "            <TC1O14/>\r\n"
			+ "            <TC1O15/>\r\n" + "            <TC1O16/>\r\n" + "            <TC1O17/>\r\n"
			+ "            <TC1O18/>\r\n" + "            <TC1O19/>\r\n" + "            <TC1O21/>\r\n"
			+ "            <TC1O22/>\r\n" + "            <TC1O23/>\r\n" + "        </TxRepeat>\r\n"
			+ "    </TxBody>\r\n" + "</Tx>";
	private final static String WMACD = "<Tx>\r\n" + "   <TxHead>\r\n" + "      <CTF_A_TXN_LEN>0226</CTF_A_TXN_LEN>\r\n"
			+ "      <CTF_A_TXN_ID_CODE>WMACD</CTF_A_TXN_ID_CODE>\r\n"
			+ "      <CTF_A_TXN_CHANNEL>WM</CTF_A_TXN_CHANNEL>\r\n"
			+ "      <CTF_A_HOST_SEQ_NO>0000009</CTF_A_HOST_SEQ_NO>\r\n"
			+ "      <CTF_A_STAN_NO>1030000000</CTF_A_STAN_NO>\r\n"
			+ "      <CTF_A_TXN_DATE>20200401</CTF_A_TXN_DATE>\r\n"
			+ "      <CTF_A_TXN_TIME>134438</CTF_A_TXN_TIME>\r\n" + "      <CTF_A_TERM_ID>MB887221</CTF_A_TERM_ID>\r\n"
			+ "      <CTF_A_BUSI_DATE>20200401</CTF_A_BUSI_DATE>\r\n" + "      <CTF_A_ATMP_MODE>0</CTF_A_ATMP_MODE>\r\n"
			+ "      <CTF_A_FISC_MODE>0</CTF_A_FISC_MODE>\r\n" + "      <CTF_A_RTN_CODE>M019</CTF_A_RTN_CODE>\r\n"
			+ "      <CTF_A_SEND_BANK>1030000</CTF_A_SEND_BANK>\r\n"
			+ "      <CTF_A_RECV_BANK>1030000</CTF_A_RECV_BANK>\r\n" + "      <CTF_A_FILLER>DB</CTF_A_FILLER>\r\n"
			+ "   </TxHead>\r\n" + "   <TxBody>\r\n" + "      <IDN>Q!221607998</IDN>\r\n"
			+ "      <SYS_CTG>WMS</SYS_CTG>\r\n" + "      <ACC_NO>006NT004902</ACC_NO>\r\n" + "      <DB_CONT_NO />\r\n"
			+ "      <TX_RESULT_CODE>00</TX_RESULT_CODE>\r\n" + "      <DESC />\r\n" + "      <ENDING>@</ENDING>\r\n"
			+ "   </TxBody>\r\n" + "</Tx>";
	private final static String Eai41R62 = "<Tx>\r\n" + "    <TxHead>\r\n"
			+ "        <CTF_A_TXN_LEN>0092</CTF_A_TXN_LEN>\r\n"
			+ "        <CTF_A_TXN_ID_CODE>41R62</CTF_A_TXN_ID_CODE>\r\n"
			+ "        <CTF_A_TXN_CHANNEL>WM</CTF_A_TXN_CHANNEL>\r\n"
			+ "        <CTF_A_HOST_SEQ_NO>0000080</CTF_A_HOST_SEQ_NO>\r\n"
			+ "        <CTF_A_STAN_NO>103</CTF_A_STAN_NO>\r\n" + "        <CTF_A_TXN_DATE>20220830</CTF_A_TXN_DATE>\r\n"
			+ "        <CTF_A_TXN_TIME>182905</CTF_A_TXN_TIME>\r\n"
			+ "        <CTF_A_TERM_ID>MB887221</CTF_A_TERM_ID>\r\n"
			+ "        <CTF_A_BUSI_DATE>20220830</CTF_A_BUSI_DATE>\r\n"
			+ "        <CTF_A_ATMP_MODE>0</CTF_A_ATMP_MODE>\r\n" + "        <CTF_A_FISC_MODE>0</CTF_A_FISC_MODE>\r\n"
			+ "        <CTF_A_RTN_CODE>0000</CTF_A_RTN_CODE>\r\n"
			+ "        <CTF_A_SEND_BANK>1030307</CTF_A_SEND_BANK>\r\n"
			+ "        <CTF_A_RECV_BANK>000000</CTF_A_RECV_BANK>\r\n" + "        <CTF_A_FILLER/>\r\n"
			+ "    </TxHead>\r\n" + "    <TxBody>\r\n" + "        <WMSG_4R62_ID>L101319731 </WMSG_4R62_ID>\r\n"
			+ "        <WMSG_4R62_CLS_FLAG>N</WMSG_4R62_CLS_FLAG>\r\n" + "    </TxBody>\r\n" + "</Tx>";
	
	private final static String Eai6M2041 = "<Tx>\r\n" + "    <TxHead>\r\n"
			+ "        <CTF_A_TXN_LEN>0280</CTF_A_TXN_LEN>\r\n"
			+ "        <CTF_A_TXN_ID_CODE>6M201</CTF_A_TXN_ID_CODE>\r\n"
			+ "        <CTF_A_TXN_CHANNEL>WM</CTF_A_TXN_CHANNEL>\r\n"
			+ "        <CTF_A_HOST_SEQ_NO>0000081</CTF_A_HOST_SEQ_NO>\r\n"
			+ "        <CTF_A_STAN_NO>103</CTF_A_STAN_NO>\r\n" + "        <CTF_A_TXN_DATE>20220830</CTF_A_TXN_DATE>\r\n"
			+ "        <CTF_A_TXN_TIME>182905</CTF_A_TXN_TIME>\r\n"
			+ "        <CTF_A_TERM_ID>MB887221</CTF_A_TERM_ID>\r\n"
			+ "        <CTF_A_BUSI_DATE>20220830</CTF_A_BUSI_DATE>\r\n"
			+ "        <CTF_A_ATMP_MODE>0</CTF_A_ATMP_MODE>\r\n" + "        <CTF_A_FISC_MODE>0</CTF_A_FISC_MODE>\r\n"
			+ "        <CTF_A_RTN_CODE>0000</CTF_A_RTN_CODE>\r\n"
			+ "        <CTF_A_SEND_BANK>1030307</CTF_A_SEND_BANK>\r\n"
			+ "        <CTF_A_RECV_BANK>000000</CTF_A_RECV_BANK>\r\n" + "        <CTF_A_FILLER/>\r\n"
			+ "    </TxHead>\r\n" + "    <TxBody>\r\n" + "        <WMSG_NEAR_LN_DATE>20200203</WMSG_NEAR_LN_DATE>\r\n"
			+ "        <WMSG_SALES_EMP_NO>M11361</WMSG_SALES_EMP_NO>\r\n" + "        <WMSG_SALESMAN/>\r\n"
			+ "        <WMSG_FILLER/>\r\n" + "    </TxBody>\r\n" + "</Tx>";
	
	
	private String TNIND(String idni03) {
		return TnindResponse.getTnindResponseByIdni03(idni03);
	}

	private String AIINB(String lastNumer) {
		return AniinbResponse.getAniinbResponse(lastNumer);
	}

	private String AIINA(String lastNumer) {
		return AniinaResponse.getAniinaResponse(lastNumer);
	}

	private String tx9100b() {
		return eai9100bResponse.get9100bResponse();
	}

	private String kyc96603(String idn, String birthday) {
		return Kyc96603.get96603(idn, birthday);
	}

	private String tx9100c() {
		return eai9100cResponse.get9100cResponse();
	}
	
	private String TNINX() {
		return TNIDXRespinse.response();
	}
	
	private String TNINB(String inbo02) {
		return TninbResponse.getTninbResponse(inbo02);
	}
	
	private String TNSUB() {
		return TnsubResponse.getTnsub();
	}
	
	private String TNRD1() {
		return Tnrd1Response.getTnrd1();
	}
	private String TNRD2() {
		return Tnrd2Response.getTnrd2();
	}
	private String TNSW2() {
		return Tnsw2Response.getTnsw2();
	}
}
