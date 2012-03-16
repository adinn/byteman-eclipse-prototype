package org.jboss.byteman.eclipse.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBytemanLexer extends Lexer {
    public static final int T__68=68;
    public static final int RULE_BOOLEAN=51;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_DO=38;
    public static final int RULE_SEMICOLON=34;
    public static final int RULE_OR=19;
    public static final int RULE_EOL=5;
    public static final int RULE_KEYWORD_CLASS=42;
    public static final int RULE_AND=20;
    public static final int RULE_BM_COMMENT=60;
    public static final int RULE_INTTYPESUFFIX=57;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int RULE_RSQUARE=39;
    public static final int RULE_NOT=46;
    public static final int RULE_BNOT=45;
    public static final int RULE_ASSIGN=35;
    public static final int RULE_LT=25;
    public static final int RULE_MOD=15;
    public static final int RULE_DOT=40;
    public static final int RULE_INIT=6;
    public static final int RULE_LPAREN=30;
    public static final int RULE_LE=24;
    public static final int RULE_GT=22;
    public static final int RULE_LSQUARE=47;
    public static final int RULE_NOTHING=10;
    public static final int RULE_BOR=17;
    public static final int RULE_GE=23;
    public static final int RULE_CLINIT=7;
    public static final int RULE_BAND=16;
    public static final int RULE_QMARK=53;
    public static final int RULE_KEYWORD_METHOD=28;
    public static final int RULE_DOLLARINDEX=49;
    public static final int RULE_PLUS=11;
    public static final int RULE_INTVAL=9;
    public static final int RULE_COMMA=32;
    public static final int RULE_HASH=59;
    public static final int RULE_FLOATVAL=52;
    public static final int RULE_KEYWORD_RETURN=8;
    public static final int RULE_FLOATTYPESUFFIX=56;
    public static final int RULE_START_RULE=41;
    public static final int RULE_TIMES=13;
    public static final int RULE_KEYWORD_THROW=44;
    public static final int RULE_NULL=54;
    public static final int RULE_DOLLAR=29;
    public static final int RULE_MINUS=12;
    public static final int RULE_KEYWORD_BIND=33;
    public static final int RULE_COLON=36;
    public static final int RULE_STRING=50;
    public static final int T__71=71;
    public static final int RULE_END_RULE=27;
    public static final int T__72=72;
    public static final int RULE_NEW=48;
    public static final int T__70=70;
    public static final int RULE_NE=26;
    public static final int RULE_KEYWORD_INTERFACE=43;
    public static final int RULE_EXPONENT=55;
    public static final int RULE_BXOR=18;
    public static final int RULE_EQ=21;
    public static final int RULE_DIV=14;
    public static final int RULE_RPAREN=31;
    public static final int T__76=76;
    public static final int RULE_WS=58;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int RULE_IF=37;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators

    public InternalBytemanLexer() {;} 
    public InternalBytemanLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalBytemanLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g"; }

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11:7: ( 'EXIT' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11:9: 'EXIT'
            {
            match("EXIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:12:7: ( 'INVOKE' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:12:9: 'INVOKE'
            {
            match("INVOKE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:13:7: ( 'CALL' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:13:9: 'CALL'
            {
            match("CALL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:14:7: ( 'ALL' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:14:9: 'ALL'
            {
            match("ALL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:15:7: ( 'HELPER' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:15:9: 'HELPER'
            {
            match("HELPER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:16:7: ( 'AT' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:16:9: 'AT'
            {
            match("AT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:17:7: ( 'AFTER' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:17:9: 'AFTER'
            {
            match("AFTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:18:7: ( 'ENTRY' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:18:9: 'ENTRY'
            {
            match("ENTRY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:19:7: ( 'LINE' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:19:9: 'LINE'
            {
            match("LINE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:20:7: ( 'READ' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:20:9: 'READ'
            {
            match("READ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:21:7: ( 'WRITE' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:21:9: 'WRITE'
            {
            match("WRITE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:22:7: ( 'SYNCHRONIZE' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:22:9: 'SYNCHRONIZE'
            {
            match("SYNCHRONIZE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:23:7: ( 'THROW' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:23:9: 'THROW'
            {
            match("THROW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:24:7: ( '$#' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:24:9: '$#'
            {
            match("$#"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:25:7: ( '$!' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:25:9: '$!'
            {
            match("$!"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:26:7: ( '$^' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:26:9: '$^'
            {
            match("$^"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:27:7: ( '$@' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:27:9: '$@'
            {
            match("$@"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:28:7: ( '$*' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:28:9: '$*'
            {
            match("$*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "RULE_QMARK"
    public final void mRULE_QMARK() throws RecognitionException {
        try {
            int _type = RULE_QMARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11459:12: ( '?' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11459:14: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QMARK"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11461:12: ( ',' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11461:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_DOT"
    public final void mRULE_DOT() throws RecognitionException {
        try {
            int _type = RULE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11463:10: ( '.' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11463:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOT"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11465:12: ( ':' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11465:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_NULL"
    public final void mRULE_NULL() throws RecognitionException {
        try {
            int _type = RULE_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11467:11: ( 'null' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11467:13: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NULL"

    // $ANTLR start "RULE_NEW"
    public final void mRULE_NEW() throws RecognitionException {
        try {
            int _type = RULE_NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11469:10: ( ( 'new' | 'NEW' ) )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11469:12: ( 'new' | 'NEW' )
            {
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11469:12: ( 'new' | 'NEW' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='n') ) {
                alt1=1;
            }
            else if ( (LA1_0=='N') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11469:13: 'new'
                    {
                    match("new"); 


                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11469:19: 'NEW'
                    {
                    match("NEW"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEW"

    // $ANTLR start "RULE_SEMICOLON"
    public final void mRULE_SEMICOLON() throws RecognitionException {
        try {
            int _type = RULE_SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11471:16: ( ';' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11471:18: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEMICOLON"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11473:14: ( ( 'TRUE' | 'true' | 'FALSE' | 'false' ) )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11473:16: ( 'TRUE' | 'true' | 'FALSE' | 'false' )
            {
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11473:16: ( 'TRUE' | 'true' | 'FALSE' | 'false' )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 'T':
                {
                alt2=1;
                }
                break;
            case 't':
                {
                alt2=2;
                }
                break;
            case 'F':
                {
                alt2=3;
                }
                break;
            case 'f':
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11473:17: 'TRUE'
                    {
                    match("TRUE"); 


                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11473:24: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 3 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11473:31: 'FALSE'
                    {
                    match("FALSE"); 


                    }
                    break;
                case 4 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11473:39: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_INIT"
    public final void mRULE_INIT() throws RecognitionException {
        try {
            int _type = RULE_INIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11475:11: ( '<init>' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11475:13: '<init>'
            {
            match("<init>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INIT"

    // $ANTLR start "RULE_CLINIT"
    public final void mRULE_CLINIT() throws RecognitionException {
        try {
            int _type = RULE_CLINIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11477:13: ( '<clinit>' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11477:15: '<clinit>'
            {
            match("<clinit>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CLINIT"

    // $ANTLR start "RULE_LPAREN"
    public final void mRULE_LPAREN() throws RecognitionException {
        try {
            int _type = RULE_LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11479:13: ( '(' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11479:15: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LPAREN"

    // $ANTLR start "RULE_RPAREN"
    public final void mRULE_RPAREN() throws RecognitionException {
        try {
            int _type = RULE_RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11481:13: ( ')' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11481:15: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RPAREN"

    // $ANTLR start "RULE_LSQUARE"
    public final void mRULE_LSQUARE() throws RecognitionException {
        try {
            int _type = RULE_LSQUARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11483:14: ( '[' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11483:16: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LSQUARE"

    // $ANTLR start "RULE_RSQUARE"
    public final void mRULE_RSQUARE() throws RecognitionException {
        try {
            int _type = RULE_RSQUARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11485:14: ( ']' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11485:16: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RSQUARE"

    // $ANTLR start "RULE_DOLLAR"
    public final void mRULE_DOLLAR() throws RecognitionException {
        try {
            int _type = RULE_DOLLAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11487:13: ( '$' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11487:15: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOLLAR"

    // $ANTLR start "RULE_DOLLARINDEX"
    public final void mRULE_DOLLARINDEX() throws RecognitionException {
        try {
            int _type = RULE_DOLLARINDEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11489:18: ( '$' ( '0' .. '9' )+ )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11489:20: '$' ( '0' .. '9' )+
            {
            match('$'); 
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11489:24: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11489:25: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
        }
    }
    // $ANTLR end "RULE_DOLLARINDEX"

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11491:11: ( '+' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11491:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS"

    // $ANTLR start "RULE_MINUS"
    public final void mRULE_MINUS() throws RecognitionException {
        try {
            int _type = RULE_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11493:12: ( '-' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11493:14: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUS"

    // $ANTLR start "RULE_MOD"
    public final void mRULE_MOD() throws RecognitionException {
        try {
            int _type = RULE_MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11495:10: ( '%' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11495:12: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MOD"

    // $ANTLR start "RULE_DIV"
    public final void mRULE_DIV() throws RecognitionException {
        try {
            int _type = RULE_DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11497:10: ( '/' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11497:12: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIV"

    // $ANTLR start "RULE_TIMES"
    public final void mRULE_TIMES() throws RecognitionException {
        try {
            int _type = RULE_TIMES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11499:12: ( '*' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11499:14: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TIMES"

    // $ANTLR start "RULE_BAND"
    public final void mRULE_BAND() throws RecognitionException {
        try {
            int _type = RULE_BAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11501:11: ( '&' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11501:13: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BAND"

    // $ANTLR start "RULE_BOR"
    public final void mRULE_BOR() throws RecognitionException {
        try {
            int _type = RULE_BOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11503:10: ( '|' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11503:12: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOR"

    // $ANTLR start "RULE_BNOT"
    public final void mRULE_BNOT() throws RecognitionException {
        try {
            int _type = RULE_BNOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11505:11: ( '~' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11505:13: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BNOT"

    // $ANTLR start "RULE_BXOR"
    public final void mRULE_BXOR() throws RecognitionException {
        try {
            int _type = RULE_BXOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11507:11: ( '^' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11507:13: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BXOR"

    // $ANTLR start "RULE_LT"
    public final void mRULE_LT() throws RecognitionException {
        try {
            int _type = RULE_LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11509:9: ( '<' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11509:11: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LT"

    // $ANTLR start "RULE_LE"
    public final void mRULE_LE() throws RecognitionException {
        try {
            int _type = RULE_LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11511:9: ( '<=' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11511:11: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LE"

    // $ANTLR start "RULE_GT"
    public final void mRULE_GT() throws RecognitionException {
        try {
            int _type = RULE_GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11513:9: ( '>' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11513:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GT"

    // $ANTLR start "RULE_GE"
    public final void mRULE_GE() throws RecognitionException {
        try {
            int _type = RULE_GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11515:9: ( '>=' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11515:11: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GE"

    // $ANTLR start "RULE_EQ"
    public final void mRULE_EQ() throws RecognitionException {
        try {
            int _type = RULE_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11517:9: ( '==' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11517:11: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQ"

    // $ANTLR start "RULE_NE"
    public final void mRULE_NE() throws RecognitionException {
        try {
            int _type = RULE_NE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11519:9: ( '!=' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11519:11: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NE"

    // $ANTLR start "RULE_ASSIGN"
    public final void mRULE_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11521:13: ( '=' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11521:15: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ASSIGN"

    // $ANTLR start "RULE_FLOATVAL"
    public final void mRULE_FLOATVAL() throws RecognitionException {
        try {
            int _type = RULE_FLOATVAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11523:15: ( ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOATTYPESUFFIX )? | '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOATTYPESUFFIX )? | ( '0' .. '9' )+ RULE_EXPONENT ( RULE_FLOATTYPESUFFIX )? | ( '0' .. '9' )+ RULE_FLOATTYPESUFFIX ) )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11523:17: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOATTYPESUFFIX )? | '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOATTYPESUFFIX )? | ( '0' .. '9' )+ RULE_EXPONENT ( RULE_FLOATTYPESUFFIX )? | ( '0' .. '9' )+ RULE_FLOATTYPESUFFIX )
            {
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11523:17: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOATTYPESUFFIX )? | '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOATTYPESUFFIX )? | ( '0' .. '9' )+ RULE_EXPONENT ( RULE_FLOATTYPESUFFIX )? | ( '0' .. '9' )+ RULE_FLOATTYPESUFFIX )
            int alt14=4;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11523:18: ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOATTYPESUFFIX )?
                    {
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11523:18: ( '0' .. '9' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11523:19: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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

                    match('.'); 
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11523:34: ( '0' .. '9' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11523:35: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11523:46: ( RULE_EXPONENT )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='E'||LA6_0=='e') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11523:46: RULE_EXPONENT
                            {
                            mRULE_EXPONENT(); 

                            }
                            break;

                    }

                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11523:61: ( RULE_FLOATTYPESUFFIX )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='D'||LA7_0=='F'||LA7_0=='d'||LA7_0=='f') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11523:61: RULE_FLOATTYPESUFFIX
                            {
                            mRULE_FLOATTYPESUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11523:83: '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOATTYPESUFFIX )?
                    {
                    match('.'); 
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11523:87: ( '0' .. '9' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11523:88: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11523:99: ( RULE_EXPONENT )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='E'||LA9_0=='e') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11523:99: RULE_EXPONENT
                            {
                            mRULE_EXPONENT(); 

                            }
                            break;

                    }

                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11523:114: ( RULE_FLOATTYPESUFFIX )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='D'||LA10_0=='F'||LA10_0=='d'||LA10_0=='f') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11523:114: RULE_FLOATTYPESUFFIX
                            {
                            mRULE_FLOATTYPESUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11523:136: ( '0' .. '9' )+ RULE_EXPONENT ( RULE_FLOATTYPESUFFIX )?
                    {
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11523:136: ( '0' .. '9' )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11523:137: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    mRULE_EXPONENT(); 
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11523:162: ( RULE_FLOATTYPESUFFIX )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='D'||LA12_0=='F'||LA12_0=='d'||LA12_0=='f') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11523:162: RULE_FLOATTYPESUFFIX
                            {
                            mRULE_FLOATTYPESUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11523:184: ( '0' .. '9' )+ RULE_FLOATTYPESUFFIX
                    {
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11523:184: ( '0' .. '9' )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11523:185: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    mRULE_FLOATTYPESUFFIX(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOATVAL"

    // $ANTLR start "RULE_INTVAL"
    public final void mRULE_INTVAL() throws RecognitionException {
        try {
            int _type = RULE_INTVAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11525:13: ( ( ( '0' .. '9' )+ ( RULE_INTTYPESUFFIX )? | '0x' ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+ ( RULE_INTTYPESUFFIX )? | '0b' ( '0' .. '1' )+ ( RULE_INTTYPESUFFIX )? ) )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11525:15: ( ( '0' .. '9' )+ ( RULE_INTTYPESUFFIX )? | '0x' ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+ ( RULE_INTTYPESUFFIX )? | '0b' ( '0' .. '1' )+ ( RULE_INTTYPESUFFIX )? )
            {
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11525:15: ( ( '0' .. '9' )+ ( RULE_INTTYPESUFFIX )? | '0x' ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+ ( RULE_INTTYPESUFFIX )? | '0b' ( '0' .. '1' )+ ( RULE_INTTYPESUFFIX )? )
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='0') ) {
                switch ( input.LA(2) ) {
                case 'x':
                    {
                    alt21=2;
                    }
                    break;
                case 'b':
                    {
                    alt21=3;
                    }
                    break;
                default:
                    alt21=1;}

            }
            else if ( ((LA21_0>='1' && LA21_0<='9')) ) {
                alt21=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11525:16: ( '0' .. '9' )+ ( RULE_INTTYPESUFFIX )?
                    {
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11525:16: ( '0' .. '9' )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11525:17: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);

                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11525:28: ( RULE_INTTYPESUFFIX )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='L'||LA16_0=='l') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11525:28: RULE_INTTYPESUFFIX
                            {
                            mRULE_INTTYPESUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11525:48: '0x' ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+ ( RULE_INTTYPESUFFIX )?
                    {
                    match("0x"); 

                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11525:53: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>='0' && LA17_0<='9')||(LA17_0>='A' && LA17_0<='F')||(LA17_0>='a' && LA17_0<='f')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11525:83: ( RULE_INTTYPESUFFIX )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='L'||LA18_0=='l') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11525:83: RULE_INTTYPESUFFIX
                            {
                            mRULE_INTTYPESUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11525:103: '0b' ( '0' .. '1' )+ ( RULE_INTTYPESUFFIX )?
                    {
                    match("0b"); 

                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11525:108: ( '0' .. '1' )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>='0' && LA19_0<='1')) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11525:109: '0' .. '1'
                    	    {
                    	    matchRange('0','1'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);

                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11525:120: ( RULE_INTTYPESUFFIX )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='L'||LA20_0=='l') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11525:120: RULE_INTTYPESUFFIX
                            {
                            mRULE_INTTYPESUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTVAL"

    // $ANTLR start "RULE_EXPONENT"
    public final void mRULE_EXPONENT() throws RecognitionException {
        try {
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11527:24: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11527:26: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11527:36: ( '+' | '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='+'||LA22_0=='-') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11527:47: ( '0' .. '9' )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='0' && LA23_0<='9')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11527:48: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT"

    // $ANTLR start "RULE_FLOATTYPESUFFIX"
    public final void mRULE_FLOATTYPESUFFIX() throws RecognitionException {
        try {
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11529:31: ( ( 'f' | 'F' | 'd' | 'D' ) )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11529:33: ( 'f' | 'F' | 'd' | 'D' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOATTYPESUFFIX"

    // $ANTLR start "RULE_INTTYPESUFFIX"
    public final void mRULE_INTTYPESUFFIX() throws RecognitionException {
        try {
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11531:29: ( ( 'L' | 'l' ) )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11531:31: ( 'L' | 'l' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTTYPESUFFIX"

    // $ANTLR start "RULE_OR"
    public final void mRULE_OR() throws RecognitionException {
        try {
            int _type = RULE_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11533:9: ( ( 'OR' | 'or' | '||' ) )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11533:11: ( 'OR' | 'or' | '||' )
            {
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11533:11: ( 'OR' | 'or' | '||' )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 'O':
                {
                alt24=1;
                }
                break;
            case 'o':
                {
                alt24=2;
                }
                break;
            case '|':
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11533:12: 'OR'
                    {
                    match("OR"); 


                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11533:17: 'or'
                    {
                    match("or"); 


                    }
                    break;
                case 3 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11533:22: '||'
                    {
                    match("||"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR"

    // $ANTLR start "RULE_AND"
    public final void mRULE_AND() throws RecognitionException {
        try {
            int _type = RULE_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11535:10: ( ( 'AND' | 'and' | '&&' ) )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11535:12: ( 'AND' | 'and' | '&&' )
            {
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11535:12: ( 'AND' | 'and' | '&&' )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 'A':
                {
                alt25=1;
                }
                break;
            case 'a':
                {
                alt25=2;
                }
                break;
            case '&':
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11535:13: 'AND'
                    {
                    match("AND"); 


                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11535:19: 'and'
                    {
                    match("and"); 


                    }
                    break;
                case 3 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11535:25: '&&'
                    {
                    match("&&"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND"

    // $ANTLR start "RULE_NOT"
    public final void mRULE_NOT() throws RecognitionException {
        try {
            int _type = RULE_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11537:10: ( ( 'NOT' | 'not' | '!' ) )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11537:12: ( 'NOT' | 'not' | '!' )
            {
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11537:12: ( 'NOT' | 'not' | '!' )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 'N':
                {
                alt26=1;
                }
                break;
            case 'n':
                {
                alt26=2;
                }
                break;
            case '!':
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11537:13: 'NOT'
                    {
                    match("NOT"); 


                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11537:19: 'not'
                    {
                    match("not"); 


                    }
                    break;
                case 3 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11537:25: '!'
                    {
                    match('!'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOT"

    // $ANTLR start "RULE_KEYWORD_CLASS"
    public final void mRULE_KEYWORD_CLASS() throws RecognitionException {
        try {
            int _type = RULE_KEYWORD_CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11539:20: ( ( 'CLASS' | 'class' ) )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11539:22: ( 'CLASS' | 'class' )
            {
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11539:22: ( 'CLASS' | 'class' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='C') ) {
                alt27=1;
            }
            else if ( (LA27_0=='c') ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11539:23: 'CLASS'
                    {
                    match("CLASS"); 


                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11539:31: 'class'
                    {
                    match("class"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KEYWORD_CLASS"

    // $ANTLR start "RULE_KEYWORD_METHOD"
    public final void mRULE_KEYWORD_METHOD() throws RecognitionException {
        try {
            int _type = RULE_KEYWORD_METHOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11541:21: ( ( 'METHOD' | 'method' ) )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11541:23: ( 'METHOD' | 'method' )
            {
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11541:23: ( 'METHOD' | 'method' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='M') ) {
                alt28=1;
            }
            else if ( (LA28_0=='m') ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11541:24: 'METHOD'
                    {
                    match("METHOD"); 


                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11541:33: 'method'
                    {
                    match("method"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KEYWORD_METHOD"

    // $ANTLR start "RULE_KEYWORD_INTERFACE"
    public final void mRULE_KEYWORD_INTERFACE() throws RecognitionException {
        try {
            int _type = RULE_KEYWORD_INTERFACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11543:24: ( ( 'INTERFACE' | 'interface' ) )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11543:26: ( 'INTERFACE' | 'interface' )
            {
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11543:26: ( 'INTERFACE' | 'interface' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='I') ) {
                alt29=1;
            }
            else if ( (LA29_0=='i') ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11543:27: 'INTERFACE'
                    {
                    match("INTERFACE"); 


                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11543:39: 'interface'
                    {
                    match("interface"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KEYWORD_INTERFACE"

    // $ANTLR start "RULE_IF"
    public final void mRULE_IF() throws RecognitionException {
        try {
            int _type = RULE_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11545:9: ( ( 'IF' | 'if' ) )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11545:11: ( 'IF' | 'if' )
            {
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11545:11: ( 'IF' | 'if' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='I') ) {
                alt30=1;
            }
            else if ( (LA30_0=='i') ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11545:12: 'IF'
                    {
                    match("IF"); 


                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11545:17: 'if'
                    {
                    match("if"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IF"

    // $ANTLR start "RULE_KEYWORD_BIND"
    public final void mRULE_KEYWORD_BIND() throws RecognitionException {
        try {
            int _type = RULE_KEYWORD_BIND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11547:19: ( ( 'BIND' | 'bind' ) )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11547:21: ( 'BIND' | 'bind' )
            {
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11547:21: ( 'BIND' | 'bind' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='B') ) {
                alt31=1;
            }
            else if ( (LA31_0=='b') ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11547:22: 'BIND'
                    {
                    match("BIND"); 


                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11547:29: 'bind'
                    {
                    match("bind"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KEYWORD_BIND"

    // $ANTLR start "RULE_NOTHING"
    public final void mRULE_NOTHING() throws RecognitionException {
        try {
            int _type = RULE_NOTHING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11549:14: ( ( 'NOTHING' | 'nothing' ) )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11549:16: ( 'NOTHING' | 'nothing' )
            {
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11549:16: ( 'NOTHING' | 'nothing' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='N') ) {
                alt32=1;
            }
            else if ( (LA32_0=='n') ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11549:17: 'NOTHING'
                    {
                    match("NOTHING"); 


                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11549:27: 'nothing'
                    {
                    match("nothing"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOTHING"

    // $ANTLR start "RULE_KEYWORD_THROW"
    public final void mRULE_KEYWORD_THROW() throws RecognitionException {
        try {
            int _type = RULE_KEYWORD_THROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11551:20: ( ( 'THROW' | 'throw' ) )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11551:22: ( 'THROW' | 'throw' )
            {
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11551:22: ( 'THROW' | 'throw' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0=='T') ) {
                alt33=1;
            }
            else if ( (LA33_0=='t') ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11551:23: 'THROW'
                    {
                    match("THROW"); 


                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11551:31: 'throw'
                    {
                    match("throw"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KEYWORD_THROW"

    // $ANTLR start "RULE_KEYWORD_RETURN"
    public final void mRULE_KEYWORD_RETURN() throws RecognitionException {
        try {
            int _type = RULE_KEYWORD_RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11553:21: ( ( 'RETURN' | 'return' ) )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11553:23: ( 'RETURN' | 'return' )
            {
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11553:23: ( 'RETURN' | 'return' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='R') ) {
                alt34=1;
            }
            else if ( (LA34_0=='r') ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11553:24: 'RETURN'
                    {
                    match("RETURN"); 


                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11553:33: 'return'
                    {
                    match("return"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KEYWORD_RETURN"

    // $ANTLR start "RULE_DO"
    public final void mRULE_DO() throws RecognitionException {
        try {
            int _type = RULE_DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11555:9: ( ( 'DO' | 'do' ) )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11555:11: ( 'DO' | 'do' )
            {
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11555:11: ( 'DO' | 'do' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0=='D') ) {
                alt35=1;
            }
            else if ( (LA35_0=='d') ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11555:12: 'DO'
                    {
                    match("DO"); 


                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11555:17: 'do'
                    {
                    match("do"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DO"

    // $ANTLR start "RULE_START_RULE"
    public final void mRULE_START_RULE() throws RecognitionException {
        try {
            int _type = RULE_START_RULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11557:17: ( ( 'RULE' RULE_WS ( options {greedy=false; } : . )* RULE_EOL | 'rule' RULE_WS ( options {greedy=false; } : . )* RULE_EOL ) )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11557:19: ( 'RULE' RULE_WS ( options {greedy=false; } : . )* RULE_EOL | 'rule' RULE_WS ( options {greedy=false; } : . )* RULE_EOL )
            {
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11557:19: ( 'RULE' RULE_WS ( options {greedy=false; } : . )* RULE_EOL | 'rule' RULE_WS ( options {greedy=false; } : . )* RULE_EOL )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0=='R') ) {
                alt38=1;
            }
            else if ( (LA38_0=='r') ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11557:20: 'RULE' RULE_WS ( options {greedy=false; } : . )* RULE_EOL
                    {
                    match("RULE"); 

                    mRULE_WS(); 
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11557:35: ( options {greedy=false; } : . )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0=='\n'||LA36_0=='\r') ) {
                            alt36=2;
                        }
                        else if ( ((LA36_0>='\u0000' && LA36_0<='\t')||(LA36_0>='\u000B' && LA36_0<='\f')||(LA36_0>='\u000E' && LA36_0<='\uFFFF')) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11557:63: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    mRULE_EOL(); 

                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11557:76: 'rule' RULE_WS ( options {greedy=false; } : . )* RULE_EOL
                    {
                    match("rule"); 

                    mRULE_WS(); 
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11557:91: ( options {greedy=false; } : . )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0=='\n'||LA37_0=='\r') ) {
                            alt37=2;
                        }
                        else if ( ((LA37_0>='\u0000' && LA37_0<='\t')||(LA37_0>='\u000B' && LA37_0<='\f')||(LA37_0>='\u000E' && LA37_0<='\uFFFF')) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11557:119: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    mRULE_EOL(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_START_RULE"

    // $ANTLR start "RULE_END_RULE"
    public final void mRULE_END_RULE() throws RecognitionException {
        try {
            int _type = RULE_END_RULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11559:15: ( ( 'ENDRULE' | 'endrule' ) )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11559:17: ( 'ENDRULE' | 'endrule' )
            {
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11559:17: ( 'ENDRULE' | 'endrule' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0=='E') ) {
                alt39=1;
            }
            else if ( (LA39_0=='e') ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11559:18: 'ENDRULE'
                    {
                    match("ENDRULE"); 


                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11559:28: 'endrule'
                    {
                    match("endrule"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_END_RULE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11561:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '0' .. '9' )* )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11561:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11561:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '0' .. '9' )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0=='$'||(LA40_0>='0' && LA40_0<='9')||(LA40_0>='A' && LA40_0<='Z')||LA40_0=='_'||(LA40_0>='a' && LA40_0<='z')) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11563:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11563:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11563:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0=='\"') ) {
                alt43=1;
            }
            else if ( (LA43_0=='\'') ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11563:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11563:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop41:
                    do {
                        int alt41=3;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0=='\\') ) {
                            alt41=1;
                        }
                        else if ( ((LA41_0>='\u0000' && LA41_0<='!')||(LA41_0>='#' && LA41_0<='[')||(LA41_0>=']' && LA41_0<='\uFFFF')) ) {
                            alt41=2;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11563:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11563:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11563:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11563:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop42:
                    do {
                        int alt42=3;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0=='\\') ) {
                            alt42=1;
                        }
                        else if ( ((LA42_0>='\u0000' && LA42_0<='&')||(LA42_0>='(' && LA42_0<='[')||(LA42_0>=']' && LA42_0<='\uFFFF')) ) {
                            alt42=2;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11563:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11563:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_BM_COMMENT"
    public final void mRULE_BM_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_BM_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11565:17: ( RULE_HASH ( options {greedy=false; } : . )* RULE_EOL )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11565:19: RULE_HASH ( options {greedy=false; } : . )* RULE_EOL
            {
            mRULE_HASH(); 
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11565:29: ( options {greedy=false; } : . )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0=='\n'||LA44_0=='\r') ) {
                    alt44=2;
                }
                else if ( ((LA44_0>='\u0000' && LA44_0<='\t')||(LA44_0>='\u000B' && LA44_0<='\f')||(LA44_0>='\u000E' && LA44_0<='\uFFFF')) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11565:57: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            mRULE_EOL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BM_COMMENT"

    // $ANTLR start "RULE_HASH"
    public final void mRULE_HASH() throws RecognitionException {
        try {
            int _type = RULE_HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11567:11: ( '#' )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11567:13: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HASH"

    // $ANTLR start "RULE_EOL"
    public final void mRULE_EOL() throws RecognitionException {
        try {
            int _type = RULE_EOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11569:10: ( ( '\\n' | '\\r' ) )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11569:12: ( '\\n' | '\\r' )
            {
            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EOL"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11571:9: ( ( ' ' | '\\t' ) )
            // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:11571:11: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:8: ( T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | RULE_QMARK | RULE_COMMA | RULE_DOT | RULE_COLON | RULE_NULL | RULE_NEW | RULE_SEMICOLON | RULE_BOOLEAN | RULE_INIT | RULE_CLINIT | RULE_LPAREN | RULE_RPAREN | RULE_LSQUARE | RULE_RSQUARE | RULE_DOLLAR | RULE_DOLLARINDEX | RULE_PLUS | RULE_MINUS | RULE_MOD | RULE_DIV | RULE_TIMES | RULE_BAND | RULE_BOR | RULE_BNOT | RULE_BXOR | RULE_LT | RULE_LE | RULE_GT | RULE_GE | RULE_EQ | RULE_NE | RULE_ASSIGN | RULE_FLOATVAL | RULE_INTVAL | RULE_OR | RULE_AND | RULE_NOT | RULE_KEYWORD_CLASS | RULE_KEYWORD_METHOD | RULE_KEYWORD_INTERFACE | RULE_IF | RULE_KEYWORD_BIND | RULE_NOTHING | RULE_KEYWORD_THROW | RULE_KEYWORD_RETURN | RULE_DO | RULE_START_RULE | RULE_END_RULE | RULE_ID | RULE_STRING | RULE_BM_COMMENT | RULE_HASH | RULE_EOL | RULE_WS )
        int alt45=72;
        alt45 = dfa45.predict(input);
        switch (alt45) {
            case 1 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:10: T__61
                {
                mT__61(); 

                }
                break;
            case 2 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:16: T__62
                {
                mT__62(); 

                }
                break;
            case 3 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:22: T__63
                {
                mT__63(); 

                }
                break;
            case 4 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:28: T__64
                {
                mT__64(); 

                }
                break;
            case 5 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:34: T__65
                {
                mT__65(); 

                }
                break;
            case 6 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:40: T__66
                {
                mT__66(); 

                }
                break;
            case 7 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:46: T__67
                {
                mT__67(); 

                }
                break;
            case 8 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:52: T__68
                {
                mT__68(); 

                }
                break;
            case 9 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:58: T__69
                {
                mT__69(); 

                }
                break;
            case 10 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:64: T__70
                {
                mT__70(); 

                }
                break;
            case 11 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:70: T__71
                {
                mT__71(); 

                }
                break;
            case 12 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:76: T__72
                {
                mT__72(); 

                }
                break;
            case 13 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:82: T__73
                {
                mT__73(); 

                }
                break;
            case 14 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:88: T__74
                {
                mT__74(); 

                }
                break;
            case 15 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:94: T__75
                {
                mT__75(); 

                }
                break;
            case 16 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:100: T__76
                {
                mT__76(); 

                }
                break;
            case 17 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:106: T__77
                {
                mT__77(); 

                }
                break;
            case 18 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:112: T__78
                {
                mT__78(); 

                }
                break;
            case 19 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:118: RULE_QMARK
                {
                mRULE_QMARK(); 

                }
                break;
            case 20 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:129: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 21 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:140: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 22 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:149: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 23 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:160: RULE_NULL
                {
                mRULE_NULL(); 

                }
                break;
            case 24 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:170: RULE_NEW
                {
                mRULE_NEW(); 

                }
                break;
            case 25 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:179: RULE_SEMICOLON
                {
                mRULE_SEMICOLON(); 

                }
                break;
            case 26 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:194: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 27 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:207: RULE_INIT
                {
                mRULE_INIT(); 

                }
                break;
            case 28 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:217: RULE_CLINIT
                {
                mRULE_CLINIT(); 

                }
                break;
            case 29 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:229: RULE_LPAREN
                {
                mRULE_LPAREN(); 

                }
                break;
            case 30 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:241: RULE_RPAREN
                {
                mRULE_RPAREN(); 

                }
                break;
            case 31 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:253: RULE_LSQUARE
                {
                mRULE_LSQUARE(); 

                }
                break;
            case 32 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:266: RULE_RSQUARE
                {
                mRULE_RSQUARE(); 

                }
                break;
            case 33 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:279: RULE_DOLLAR
                {
                mRULE_DOLLAR(); 

                }
                break;
            case 34 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:291: RULE_DOLLARINDEX
                {
                mRULE_DOLLARINDEX(); 

                }
                break;
            case 35 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:308: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 36 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:318: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 37 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:329: RULE_MOD
                {
                mRULE_MOD(); 

                }
                break;
            case 38 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:338: RULE_DIV
                {
                mRULE_DIV(); 

                }
                break;
            case 39 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:347: RULE_TIMES
                {
                mRULE_TIMES(); 

                }
                break;
            case 40 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:358: RULE_BAND
                {
                mRULE_BAND(); 

                }
                break;
            case 41 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:368: RULE_BOR
                {
                mRULE_BOR(); 

                }
                break;
            case 42 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:377: RULE_BNOT
                {
                mRULE_BNOT(); 

                }
                break;
            case 43 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:387: RULE_BXOR
                {
                mRULE_BXOR(); 

                }
                break;
            case 44 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:397: RULE_LT
                {
                mRULE_LT(); 

                }
                break;
            case 45 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:405: RULE_LE
                {
                mRULE_LE(); 

                }
                break;
            case 46 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:413: RULE_GT
                {
                mRULE_GT(); 

                }
                break;
            case 47 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:421: RULE_GE
                {
                mRULE_GE(); 

                }
                break;
            case 48 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:429: RULE_EQ
                {
                mRULE_EQ(); 

                }
                break;
            case 49 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:437: RULE_NE
                {
                mRULE_NE(); 

                }
                break;
            case 50 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:445: RULE_ASSIGN
                {
                mRULE_ASSIGN(); 

                }
                break;
            case 51 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:457: RULE_FLOATVAL
                {
                mRULE_FLOATVAL(); 

                }
                break;
            case 52 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:471: RULE_INTVAL
                {
                mRULE_INTVAL(); 

                }
                break;
            case 53 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:483: RULE_OR
                {
                mRULE_OR(); 

                }
                break;
            case 54 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:491: RULE_AND
                {
                mRULE_AND(); 

                }
                break;
            case 55 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:500: RULE_NOT
                {
                mRULE_NOT(); 

                }
                break;
            case 56 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:509: RULE_KEYWORD_CLASS
                {
                mRULE_KEYWORD_CLASS(); 

                }
                break;
            case 57 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:528: RULE_KEYWORD_METHOD
                {
                mRULE_KEYWORD_METHOD(); 

                }
                break;
            case 58 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:548: RULE_KEYWORD_INTERFACE
                {
                mRULE_KEYWORD_INTERFACE(); 

                }
                break;
            case 59 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:571: RULE_IF
                {
                mRULE_IF(); 

                }
                break;
            case 60 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:579: RULE_KEYWORD_BIND
                {
                mRULE_KEYWORD_BIND(); 

                }
                break;
            case 61 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:597: RULE_NOTHING
                {
                mRULE_NOTHING(); 

                }
                break;
            case 62 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:610: RULE_KEYWORD_THROW
                {
                mRULE_KEYWORD_THROW(); 

                }
                break;
            case 63 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:629: RULE_KEYWORD_RETURN
                {
                mRULE_KEYWORD_RETURN(); 

                }
                break;
            case 64 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:649: RULE_DO
                {
                mRULE_DO(); 

                }
                break;
            case 65 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:657: RULE_START_RULE
                {
                mRULE_START_RULE(); 

                }
                break;
            case 66 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:673: RULE_END_RULE
                {
                mRULE_END_RULE(); 

                }
                break;
            case 67 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:687: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 68 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:695: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 69 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:707: RULE_BM_COMMENT
                {
                mRULE_BM_COMMENT(); 

                }
                break;
            case 70 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:723: RULE_HASH
                {
                mRULE_HASH(); 

                }
                break;
            case 71 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:733: RULE_EOL
                {
                mRULE_EOL(); 

                }
                break;
            case 72 :
                // ../org.jboss.byteman.eclipse.Byteman.ui/src-gen/org/jboss/byteman/eclipse/ui/contentassist/antlr/internal/InternalByteman.g:1:742: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA45 dfa45 = new DFA45(this);
    static final String DFA14_eotS =
        "\6\uffff";
    static final String DFA14_eofS =
        "\6\uffff";
    static final String DFA14_minS =
        "\2\56\4\uffff";
    static final String DFA14_maxS =
        "\1\71\1\146\4\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\1";
    static final String DFA14_specialS =
        "\6\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\5\1\uffff\12\1\12\uffff\1\4\1\3\1\4\35\uffff\1\4\1\3\1\4",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "11523:17: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOATTYPESUFFIX )? | '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOATTYPESUFFIX )? | ( '0' .. '9' )+ RULE_EXPONENT ( RULE_FLOATTYPESUFFIX )? | ( '0' .. '9' )+ RULE_FLOATTYPESUFFIX )";
        }
    }
    static final String DFA45_eotS =
        "\1\uffff\12\66\1\122\2\uffff\1\124\1\uffff\2\66\1\uffff\3\66\1\142"+
        "\11\uffff\1\144\1\146\2\uffff\1\150\1\152\1\154\2\155\15\66\2\uffff"+
        "\1\175\2\uffff\3\66\1\u0084\3\66\1\u0088\12\66\11\uffff\11\66\17"+
        "\uffff\2\145\5\66\1\u0084\4\66\2\u00a6\1\66\2\uffff\5\66\1\uffff"+
        "\2\66\1\u00af\1\uffff\1\66\1\143\12\66\1\u00bb\1\154\1\u00bb\1\154"+
        "\4\66\1\143\10\66\1\uffff\1\66\1\u00cb\4\66\1\u00d0\1\66\1\uffff"+
        "\2\66\1\u00d4\1\u00d5\5\66\1\u00db\1\u00dc\1\uffff\2\66\1\u00db"+
        "\7\66\2\u00e6\3\66\1\uffff\1\u00e9\3\66\1\uffff\1\u00ed\1\u00ee"+
        "\1\66\2\uffff\1\66\1\uffff\1\u00f1\1\66\1\u00f3\2\uffff\2\66\1\u00f6"+
        "\2\u00db\1\u00ed\3\66\1\uffff\2\66\1\uffff\1\66\1\u00fd\1\66\2\uffff"+
        "\1\u00ff\1\u0100\1\uffff\1\66\1\uffff\2\66\1\uffff\2\u0104\1\66"+
        "\1\u0100\1\66\1\u0107\1\uffff\1\66\2\uffff\1\66\2\u010a\1\uffff"+
        "\1\66\1\u0107\1\uffff\2\66\1\uffff\1\66\1\u010f\1\66\1\u010f\1\uffff"+
        "\1\66\1\u0112\1\uffff";
    static final String DFA45_eofS =
        "\u0113\uffff";
    static final String DFA45_minS =
        "\1\11\1\116\1\106\1\101\1\106\1\105\1\111\1\105\1\122\1\131\1\110"+
        "\1\41\2\uffff\1\60\1\uffff\1\145\1\105\1\uffff\1\150\1\101\1\141"+
        "\1\75\11\uffff\1\46\1\174\2\uffff\3\75\2\56\1\122\1\162\1\156\1"+
        "\154\1\105\1\145\1\146\1\111\1\151\1\145\1\117\1\157\1\156\2\uffff"+
        "\1\0\2\uffff\1\111\1\104\1\124\1\44\1\114\1\101\1\114\1\44\1\124"+
        "\1\104\1\114\1\116\1\101\1\114\1\111\1\116\1\122\1\125\11\uffff"+
        "\1\154\1\167\1\164\1\127\1\124\1\165\1\162\1\114\1\154\17\uffff"+
        "\2\44\1\144\1\141\1\124\2\164\1\44\1\116\1\156\1\164\1\154\2\44"+
        "\1\144\2\uffff\1\124\2\122\1\117\1\105\1\uffff\1\114\1\123\1\44"+
        "\1\uffff\1\105\1\44\1\120\1\105\1\104\1\125\1\105\1\124\1\103\1"+
        "\117\1\105\1\154\4\44\1\145\1\157\1\123\1\163\1\44\1\163\1\110\1"+
        "\150\1\145\1\104\1\144\1\165\1\145\1\uffff\1\162\1\44\1\131\1\125"+
        "\1\113\1\122\1\44\1\123\1\uffff\1\122\1\105\2\44\1\122\1\11\1\105"+
        "\1\110\1\127\2\44\1\uffff\1\151\1\111\1\44\1\167\1\105\1\145\1\163"+
        "\1\117\1\157\1\162\2\44\1\162\1\11\1\165\1\uffff\1\44\1\114\1\105"+
        "\1\106\1\uffff\2\44\1\122\2\uffff\1\116\1\uffff\1\44\1\122\1\44"+
        "\2\uffff\1\156\1\116\4\44\1\104\1\144\1\146\1\uffff\1\156\1\154"+
        "\1\uffff\1\105\1\44\1\101\2\uffff\2\44\1\uffff\1\117\1\uffff\1\147"+
        "\1\107\1\uffff\2\44\1\141\1\44\1\145\1\44\1\uffff\1\103\2\uffff"+
        "\1\116\2\44\1\uffff\1\143\1\44\1\uffff\1\105\1\111\1\uffff\1\145"+
        "\1\44\1\132\1\44\1\uffff\1\105\1\44\1\uffff";
    static final String DFA45_maxS =
        "\1\176\1\130\1\116\1\114\1\124\1\105\1\111\1\125\1\122\1\131\1\122"+
        "\1\136\2\uffff\1\71\1\uffff\1\165\1\117\1\uffff\1\162\1\101\1\141"+
        "\1\151\11\uffff\1\46\1\174\2\uffff\3\75\2\146\1\122\1\162\1\156"+
        "\1\154\1\105\1\145\1\156\1\111\1\151\1\165\1\117\1\157\1\156\2\uffff"+
        "\1\uffff\2\uffff\1\111\1\124\1\126\1\172\1\114\1\101\1\114\1\172"+
        "\1\124\1\104\1\114\1\116\1\124\1\114\1\111\1\116\1\122\1\125\11"+
        "\uffff\1\154\1\167\1\164\1\127\1\124\1\165\1\162\1\114\1\154\17"+
        "\uffff\2\172\1\144\1\141\1\124\2\164\1\172\1\116\1\156\1\164\1\154"+
        "\2\172\1\144\2\uffff\1\124\2\122\1\117\1\105\1\uffff\1\114\1\123"+
        "\1\172\1\uffff\1\105\1\172\1\120\1\105\1\104\1\125\1\105\1\124\1"+
        "\103\1\117\1\105\1\154\4\172\1\145\1\157\1\123\1\163\1\172\1\163"+
        "\1\110\1\150\1\145\1\104\1\144\1\165\1\145\1\uffff\1\162\1\172\1"+
        "\131\1\125\1\113\1\122\1\172\1\123\1\uffff\1\122\1\105\2\172\1\122"+
        "\1\40\1\105\1\110\1\127\2\172\1\uffff\1\151\1\111\1\172\1\167\1"+
        "\105\1\145\1\163\1\117\1\157\1\162\2\172\1\162\1\40\1\165\1\uffff"+
        "\1\172\1\114\1\105\1\106\1\uffff\2\172\1\122\2\uffff\1\116\1\uffff"+
        "\1\172\1\122\1\172\2\uffff\1\156\1\116\4\172\1\104\1\144\1\146\1"+
        "\uffff\1\156\1\154\1\uffff\1\105\1\172\1\101\2\uffff\2\172\1\uffff"+
        "\1\117\1\uffff\1\147\1\107\1\uffff\2\172\1\141\1\172\1\145\1\172"+
        "\1\uffff\1\103\2\uffff\1\116\2\172\1\uffff\1\143\1\172\1\uffff\1"+
        "\105\1\111\1\uffff\1\145\1\172\1\132\1\172\1\uffff\1\105\1\172\1"+
        "\uffff";
    static final String DFA45_acceptS =
        "\14\uffff\1\23\1\24\1\uffff\1\26\2\uffff\1\31\4\uffff\1\35\1\36"+
        "\1\37\1\40\1\43\1\44\1\45\1\46\1\47\2\uffff\1\52\1\53\22\uffff\1"+
        "\103\1\104\1\uffff\1\107\1\110\22\uffff\1\16\1\17\1\20\1\21\1\22"+
        "\1\41\1\42\1\25\1\63\11\uffff\1\33\1\34\1\55\1\54\1\66\1\50\1\65"+
        "\1\51\1\57\1\56\1\60\1\62\1\61\1\67\1\64\17\uffff\1\106\1\105\5"+
        "\uffff\1\73\3\uffff\1\6\35\uffff\1\100\10\uffff\1\4\13\uffff\1\30"+
        "\17\uffff\1\1\4\uffff\1\3\3\uffff\1\11\1\12\1\uffff\1\101\3\uffff"+
        "\1\32\1\27\11\uffff\1\74\2\uffff\1\10\3\uffff\1\70\1\7\2\uffff\1"+
        "\13\1\uffff\1\15\2\uffff\1\76\6\uffff\1\2\1\uffff\1\5\1\77\3\uffff"+
        "\1\71\2\uffff\1\102\2\uffff\1\75\4\uffff\1\72\2\uffff\1\14";
    static final String DFA45_specialS =
        "\70\uffff\1\0\u00da\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\72\1\71\2\uffff\1\71\22\uffff\1\72\1\46\1\67\1\70\1\13\1"+
            "\35\1\40\1\67\1\27\1\30\1\37\1\33\1\15\1\34\1\16\1\36\1\47\11"+
            "\50\1\17\1\22\1\26\1\45\1\44\1\14\1\uffff\1\4\1\60\1\3\1\63"+
            "\1\1\1\24\1\66\1\5\1\2\2\66\1\6\1\55\1\21\1\51\2\66\1\7\1\11"+
            "\1\12\2\66\1\10\3\66\1\31\1\uffff\1\32\1\43\1\66\1\uffff\1\53"+
            "\1\61\1\54\1\64\1\65\1\25\2\66\1\57\3\66\1\56\1\20\1\52\2\66"+
            "\1\62\1\66\1\23\6\66\1\uffff\1\41\1\uffff\1\42",
            "\1\74\11\uffff\1\73",
            "\1\76\7\uffff\1\75",
            "\1\77\12\uffff\1\100",
            "\1\103\5\uffff\1\101\1\uffff\1\104\5\uffff\1\102",
            "\1\105",
            "\1\106",
            "\1\107\17\uffff\1\110",
            "\1\111",
            "\1\112",
            "\1\113\11\uffff\1\114",
            "\1\116\1\uffff\1\115\6\uffff\1\121\5\uffff\12\123\6\uffff\1"+
            "\120\35\uffff\1\117",
            "",
            "",
            "\12\125",
            "",
            "\1\127\11\uffff\1\130\5\uffff\1\126",
            "\1\131\11\uffff\1\132",
            "",
            "\1\134\11\uffff\1\133",
            "\1\135",
            "\1\136",
            "\1\141\45\uffff\1\140\5\uffff\1\137",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\143",
            "\1\145",
            "",
            "",
            "\1\147",
            "\1\151",
            "\1\153",
            "\1\125\1\uffff\12\50\12\uffff\3\125\35\uffff\3\125",
            "\1\125\1\uffff\12\50\12\uffff\3\125\35\uffff\3\125",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\165\7\uffff\1\164",
            "\1\166",
            "\1\167",
            "\1\170\17\uffff\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "",
            "",
            "\0\176",
            "",
            "",
            "\1\177",
            "\1\u0081\17\uffff\1\u0080",
            "\1\u0083\1\uffff\1\u0082",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d\22\uffff\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u00a7",
            "",
            "",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "\1\u00b0",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\7\66"+
            "\1\u00bc\22\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\7\66\1\u00bd\22\66\4\uffff\1\66"+
            "\1\uffff\32\66",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "",
            "\1\u00ca",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u00d6",
            "\1\u00d7\26\uffff\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "\1\u00dd",
            "\1\u00de",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u00e7",
            "\1\u00d7\26\uffff\1\u00d7",
            "\1\u00e8",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u00ef",
            "",
            "",
            "\1\u00f0",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u00f2",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "",
            "\1\u00f4",
            "\1\u00f5",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "",
            "\1\u00fa",
            "\1\u00fb",
            "",
            "\1\u00fc",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u00fe",
            "",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "\1\u0101",
            "",
            "\1\u0102",
            "\1\u0103",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u0105",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u0106",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "\1\u0108",
            "",
            "",
            "\1\u0109",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "\1\u010b",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "\1\u010c",
            "\1\u010d",
            "",
            "\1\u010e",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u0110",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "\1\u0111",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            ""
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | RULE_QMARK | RULE_COMMA | RULE_DOT | RULE_COLON | RULE_NULL | RULE_NEW | RULE_SEMICOLON | RULE_BOOLEAN | RULE_INIT | RULE_CLINIT | RULE_LPAREN | RULE_RPAREN | RULE_LSQUARE | RULE_RSQUARE | RULE_DOLLAR | RULE_DOLLARINDEX | RULE_PLUS | RULE_MINUS | RULE_MOD | RULE_DIV | RULE_TIMES | RULE_BAND | RULE_BOR | RULE_BNOT | RULE_BXOR | RULE_LT | RULE_LE | RULE_GT | RULE_GE | RULE_EQ | RULE_NE | RULE_ASSIGN | RULE_FLOATVAL | RULE_INTVAL | RULE_OR | RULE_AND | RULE_NOT | RULE_KEYWORD_CLASS | RULE_KEYWORD_METHOD | RULE_KEYWORD_INTERFACE | RULE_IF | RULE_KEYWORD_BIND | RULE_NOTHING | RULE_KEYWORD_THROW | RULE_KEYWORD_RETURN | RULE_DO | RULE_START_RULE | RULE_END_RULE | RULE_ID | RULE_STRING | RULE_BM_COMMENT | RULE_HASH | RULE_EOL | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA45_56 = input.LA(1);

                        s = -1;
                        if ( ((LA45_56>='\u0000' && LA45_56<='\uFFFF')) ) {s = 126;}

                        else s = 125;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 45, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}