// $ANTLR 3.4 Logic.g 2011-12-16 16:15:59

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class LogicLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public LogicLexer() {} 
    public LogicLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public LogicLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Logic.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Logic.g:2:7: ( ',' )
            // Logic.g:2:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "HEADER"
    public final void mHEADER() throws RecognitionException {
        try {
            int _type = HEADER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Logic.g:10:9: ( 'Time [s],Packet ID,MOSI,MISO' )
            // Logic.g:10:11: 'Time [s],Packet ID,MOSI,MISO'
            {
            match("Time [s],Packet ID,MOSI,MISO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEADER"

    // $ANTLR start "EXP"
    public final void mEXP() throws RecognitionException {
        try {
            int _type = EXP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Logic.g:16:6: ( 'e' ( '+' | '-' )? INT_NUM )
            // Logic.g:16:8: 'e' ( '+' | '-' )? INT_NUM
            {
            match('e'); 

            // Logic.g:16:12: ( '+' | '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='+'||LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Logic.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            mINT_NUM(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXP"

    // $ANTLR start "FLOAT_NUM"
    public final void mFLOAT_NUM() throws RecognitionException {
        try {
            int _type = FLOAT_NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Logic.g:17:11: ( INT_NUM '.' INT_NUM ( EXP )? )
            // Logic.g:17:13: INT_NUM '.' INT_NUM ( EXP )?
            {
            mINT_NUM(); 


            match('.'); 

            mINT_NUM(); 


            // Logic.g:17:33: ( EXP )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='e') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Logic.g:17:34: EXP
                    {
                    mEXP(); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT_NUM"

    // $ANTLR start "A_TO_F"
    public final void mA_TO_F() throws RecognitionException {
        try {
            int _type = A_TO_F;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Logic.g:18:9: ( 'a' .. 'f' | 'A' .. 'F' )
            // Logic.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "A_TO_F"

    // $ANTLR start "HEX_NUM"
    public final void mHEX_NUM() throws RecognitionException {
        try {
            int _type = HEX_NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Logic.g:19:10: ( '0x' ( INT_NUM | A_TO_F )+ )
            // Logic.g:19:12: '0x' ( INT_NUM | A_TO_F )+
            {
            match("0x"); 



            // Logic.g:19:17: ( INT_NUM | A_TO_F )+
            int cnt3=0;
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }
                else if ( ((LA3_0 >= 'A' && LA3_0 <= 'F')||(LA3_0 >= 'a' && LA3_0 <= 'f')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // Logic.g:19:18: INT_NUM
            	    {
            	    mINT_NUM(); 


            	    }
            	    break;
            	case 2 :
            	    // Logic.g:19:26: A_TO_F
            	    {
            	    mA_TO_F(); 


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_NUM"

    // $ANTLR start "INT_NUM"
    public final void mINT_NUM() throws RecognitionException {
        try {
            int _type = INT_NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Logic.g:20:10: ( ( '0' .. '9' )+ )
            // Logic.g:20:12: ( '0' .. '9' )+
            {
            // Logic.g:20:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Logic.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT_NUM"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Logic.g:21:10: ( ( '\\r' )? '\\n' )
            // Logic.g:21:12: ( '\\r' )? '\\n'
            {
            // Logic.g:21:12: ( '\\r' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Logic.g:21:12: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    public void mTokens() throws RecognitionException {
        // Logic.g:1:8: ( T__11 | HEADER | EXP | FLOAT_NUM | A_TO_F | HEX_NUM | INT_NUM | NEWLINE )
        int alt6=8;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // Logic.g:1:10: T__11
                {
                mT__11(); 


                }
                break;
            case 2 :
                // Logic.g:1:16: HEADER
                {
                mHEADER(); 


                }
                break;
            case 3 :
                // Logic.g:1:23: EXP
                {
                mEXP(); 


                }
                break;
            case 4 :
                // Logic.g:1:27: FLOAT_NUM
                {
                mFLOAT_NUM(); 


                }
                break;
            case 5 :
                // Logic.g:1:37: A_TO_F
                {
                mA_TO_F(); 


                }
                break;
            case 6 :
                // Logic.g:1:44: HEX_NUM
                {
                mHEX_NUM(); 


                }
                break;
            case 7 :
                // Logic.g:1:52: INT_NUM
                {
                mINT_NUM(); 


                }
                break;
            case 8 :
                // Logic.g:1:60: NEWLINE
                {
                mNEWLINE(); 


                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\3\uffff\1\5\1\12\1\uffff\1\12\5\uffff";
    static final String DFA6_eofS =
        "\14\uffff";
    static final String DFA6_minS =
        "\1\12\2\uffff\1\53\1\56\1\uffff\1\56\5\uffff";
    static final String DFA6_maxS =
        "\1\146\2\uffff\1\71\1\170\1\uffff\1\71\5\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\5\1\uffff\1\10\1\3\1\6\1\7\1\4";
    static final String DFA6_specialS =
        "\14\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\7\2\uffff\1\7\36\uffff\1\1\3\uffff\1\4\11\6\7\uffff\6\5\15"+
            "\uffff\1\2\14\uffff\4\5\1\3\1\5",
            "",
            "",
            "\1\10\1\uffff\1\10\2\uffff\12\10",
            "\1\13\1\uffff\12\6\76\uffff\1\11",
            "",
            "\1\13\1\uffff\12\6",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | HEADER | EXP | FLOAT_NUM | A_TO_F | HEX_NUM | INT_NUM | NEWLINE );";
        }
    }
 

}