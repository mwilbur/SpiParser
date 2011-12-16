grammar Logic;
@header {
import java.util.ArrayList;
}
@members{
ArrayList<Integer> miso  = new ArrayList<Integer>();
}

spi_file	:	HEADER? packets ;
HEADER		:	'Time [s],Packet ID,MOSI,MISO';
packets		:	(packet)+;
//packet		:	FLOAT_NUM ',' (INT_NUM)? ',' HEX_NUM ',' HEX_NUM ;
packet		:	FLOAT_NUM ',' (INT_NUM)? ',' mosi ',' miso ;
mosi		:	HEX_NUM;
miso		:	HEX_NUM { System.out.println("MISO="+$HEX_NUM.text); miso.add( Integer.parseInt($HEX_NUM.text) );  };
EXP		:	'e' ('+'|'-')? INT_NUM;
FLOAT_NUM	:	INT_NUM '.' INT_NUM (EXP)? ;
A_TO_F		:	'a'..'f' | 'A'..'F';	
HEX_NUM		:	'0x' (INT_NUM|A_TO_F)+;
INT_NUM		:	('0'..'9')+;
NEWLINE		:	'\r'? '\n' {skip();};
