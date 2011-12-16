// $ANTLR 3.4 Logic.g 2011-12-16 16:15:58

import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class LogicParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "A_TO_F", "EXP", "FLOAT_NUM", "HEADER", "HEX_NUM", "INT_NUM", "NEWLINE", "','"
    };

    public static final int EOF=-1;
    public static final int T__11=11;
    public static final int A_TO_F=4;
    public static final int EXP=5;
    public static final int FLOAT_NUM=6;
    public static final int HEADER=7;
    public static final int HEX_NUM=8;
    public static final int INT_NUM=9;
    public static final int NEWLINE=10;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public LogicParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public LogicParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return LogicParser.tokenNames; }
    public String getGrammarFileName() { return "Logic.g"; }


    ArrayList<Integer> miso  = new ArrayList<Integer>();



    // $ANTLR start "spi_file"
    // Logic.g:9:1: spi_file : ( HEADER )? packets ;
    public final void spi_file() throws RecognitionException {
        try {
            // Logic.g:9:10: ( ( HEADER )? packets )
            // Logic.g:9:12: ( HEADER )? packets
            {
            // Logic.g:9:12: ( HEADER )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==HEADER) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Logic.g:9:12: HEADER
                    {
                    match(input,HEADER,FOLLOW_HEADER_in_spi_file19); 

                    }
                    break;

            }


            pushFollow(FOLLOW_packets_in_spi_file22);
            packets();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "spi_file"



    // $ANTLR start "packets"
    // Logic.g:11:1: packets : ( packet )+ ;
    public final void packets() throws RecognitionException {
        try {
            // Logic.g:11:10: ( ( packet )+ )
            // Logic.g:11:12: ( packet )+
            {
            // Logic.g:11:12: ( packet )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==FLOAT_NUM) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Logic.g:11:13: packet
            	    {
            	    pushFollow(FOLLOW_packet_in_packets40);
            	    packet();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "packets"



    // $ANTLR start "packet"
    // Logic.g:13:1: packet : FLOAT_NUM ',' ( INT_NUM )? ',' mosi ',' miso ;
    public final void packet() throws RecognitionException {
        try {
            // Logic.g:13:9: ( FLOAT_NUM ',' ( INT_NUM )? ',' mosi ',' miso )
            // Logic.g:13:11: FLOAT_NUM ',' ( INT_NUM )? ',' mosi ',' miso
            {
            match(input,FLOAT_NUM,FOLLOW_FLOAT_NUM_in_packet51); 

            match(input,11,FOLLOW_11_in_packet53); 

            // Logic.g:13:25: ( INT_NUM )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==INT_NUM) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // Logic.g:13:26: INT_NUM
                    {
                    match(input,INT_NUM,FOLLOW_INT_NUM_in_packet56); 

                    }
                    break;

            }


            match(input,11,FOLLOW_11_in_packet60); 

            pushFollow(FOLLOW_mosi_in_packet62);
            mosi();

            state._fsp--;


            match(input,11,FOLLOW_11_in_packet64); 

            pushFollow(FOLLOW_miso_in_packet66);
            miso();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "packet"



    // $ANTLR start "mosi"
    // Logic.g:14:1: mosi : HEX_NUM ;
    public final void mosi() throws RecognitionException {
        try {
            // Logic.g:14:7: ( HEX_NUM )
            // Logic.g:14:9: HEX_NUM
            {
            match(input,HEX_NUM,FOLLOW_HEX_NUM_in_mosi75); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "mosi"



    // $ANTLR start "miso"
    // Logic.g:15:1: miso : HEX_NUM ;
    public final void miso() throws RecognitionException {
        Token HEX_NUM1=null;

        try {
            // Logic.g:15:7: ( HEX_NUM )
            // Logic.g:15:9: HEX_NUM
            {
            HEX_NUM1=(Token)match(input,HEX_NUM,FOLLOW_HEX_NUM_in_miso83); 

             System.out.println("MISO="+(HEX_NUM1!=null?HEX_NUM1.getText():null)); miso.add( Integer.parseInt((HEX_NUM1!=null?HEX_NUM1.getText():null)) );  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "miso"

    // Delegated rules


 

    public static final BitSet FOLLOW_HEADER_in_spi_file19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_packets_in_spi_file22 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_packet_in_packets40 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_FLOAT_NUM_in_packet51 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_packet53 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_INT_NUM_in_packet56 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_packet60 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_mosi_in_packet62 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_packet64 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_miso_in_packet66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEX_NUM_in_mosi75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEX_NUM_in_miso83 = new BitSet(new long[]{0x0000000000000002L});

}