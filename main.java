package m_27gurnameh99singh12.Smart_Water_Meter;

import android.support.p000v4.app.FragmentTransaction;
import com.google.appinventor.components.common.ComponentConstants;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.BluetoothClient;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Clock;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.FirebaseDB;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.ListPicker;
import com.google.appinventor.components.runtime.MakeroidTabLayout;
import com.google.appinventor.components.runtime.Notifier;
import com.google.appinventor.components.runtime.Slider;
import com.google.appinventor.components.runtime.SpaceView;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.VerticalScrollArrangement;
import com.google.appinventor.components.runtime.WebViewer;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.C1218runtime;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.Apply;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.functions.IsEqual;
import gnu.kawa.functions.MultiplyOp;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.DFloNum;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.C1240lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import org.shaded.apache.http.HttpStatus;

/* renamed from: m_27gurnameh99singh12.Smart_Water_Meter.Screen1 */
/* compiled from: Screen1.yail */
public class Screen1 extends Form implements Runnable {
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final SimpleSymbol Lit10;
    static final IntNum Lit100 = IntNum.make(2);
    static final PairWithPosition Lit101 = PairWithPosition.make(Lit360, PairWithPosition.make(Lit360, LList.Empty, "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 467434), "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 467429);
    static final PairWithPosition Lit102 = PairWithPosition.make(Lit360, PairWithPosition.make(Lit360, LList.Empty, "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 467827), "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 467822);
    static final IntNum Lit103 = IntNum.make(4);
    static final PairWithPosition Lit104 = PairWithPosition.make(Lit360, PairWithPosition.make(Lit360, LList.Empty, "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 468220), "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 468215);
    static final IntNum Lit105 = IntNum.make(5);
    static final PairWithPosition Lit106 = PairWithPosition.make(Lit360, PairWithPosition.make(Lit360, LList.Empty, "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 468613), "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 468608);
    static final SimpleSymbol Lit107;
    static final SimpleSymbol Lit108;
    static final FString Lit109;
    static final SimpleSymbol Lit11;
    static final IntNum Lit110 = IntNum.make(16777215);
    static final FString Lit111;
    static final FString Lit112;
    static final SimpleSymbol Lit113;
    static final SimpleSymbol Lit114;
    static final FString Lit115;
    static final FString Lit116;
    static final SimpleSymbol Lit117;
    static final IntNum Lit118 = IntNum.make(20);
    static final SimpleSymbol Lit119;
    static final SimpleSymbol Lit12;
    static final FString Lit120;
    static final SimpleSymbol Lit121;
    static final FString Lit122;
    static final IntNum Lit123 = IntNum.make(16777215);
    static final FString Lit124;
    static final FString Lit125;
    static final SimpleSymbol Lit126;
    static final IntNum Lit127 = IntNum.make(40);
    static final FString Lit128;
    static final FString Lit129;
    static final SimpleSymbol Lit13;
    static final SimpleSymbol Lit130;
    static final FString Lit131;
    static final FString Lit132;
    static final SimpleSymbol Lit133;
    static final IntNum Lit134 = IntNum.make(16777215);
    static final IntNum Lit135 = IntNum.make(25);
    static final IntNum Lit136;
    static final FString Lit137;
    static final SimpleSymbol Lit138;
    static final SimpleSymbol Lit139;
    static final SimpleSymbol Lit14;
    static final SimpleSymbol Lit140;
    static final PairWithPosition Lit141;
    static final SimpleSymbol Lit142;
    static final SimpleSymbol Lit143;
    static final SimpleSymbol Lit144;
    static final PairWithPosition Lit145 = PairWithPosition.make(Lit13, PairWithPosition.make(Lit360, LList.Empty, "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 815489), "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 815483);
    static final PairWithPosition Lit146 = PairWithPosition.make(Lit13, PairWithPosition.make(Lit360, LList.Empty, "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 815608), "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 815602);
    static final PairWithPosition Lit147 = PairWithPosition.make(Lit13, PairWithPosition.make(Lit360, LList.Empty, "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 815730), "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 815724);
    static final SimpleSymbol Lit148;
    static final FString Lit149;
    static final SimpleSymbol Lit15;
    static final SimpleSymbol Lit150;
    static final FString Lit151;
    static final FString Lit152;
    static final SimpleSymbol Lit153;
    static final IntNum Lit154 = IntNum.make(16777215);
    static final IntNum Lit155 = IntNum.make(-1090);
    static final FString Lit156;
    static final FString Lit157;
    static final SimpleSymbol Lit158;
    static final IntNum Lit159 = IntNum.make(18);
    static final IntNum Lit16;
    static final SimpleSymbol Lit160;
    static final IntNum Lit161;
    static final FString Lit162;
    static final FString Lit163;
    static final SimpleSymbol Lit164;
    static final FString Lit165;
    static final FString Lit166;
    static final SimpleSymbol Lit167;
    static final FString Lit168;
    static final SimpleSymbol Lit169;
    static final SimpleSymbol Lit17;
    static final FString Lit170;
    static final IntNum Lit171 = IntNum.make(16777215);
    static final FString Lit172;
    static final FString Lit173;
    static final SimpleSymbol Lit174;
    static final IntNum Lit175 = IntNum.make(50);
    static final FString Lit176;
    static final FString Lit177;
    static final SimpleSymbol Lit178;
    static final FString Lit179;
    static final SimpleSymbol Lit18;
    static final FString Lit180;
    static final SimpleSymbol Lit181;
    static final FString Lit182;
    static final FString Lit183;
    static final SimpleSymbol Lit184;
    static final SimpleSymbol Lit185;
    static final FString Lit186;
    static final SimpleSymbol Lit187;
    static final SimpleSymbol Lit188;
    static final SimpleSymbol Lit189;
    static final SimpleSymbol Lit19;
    static final FString Lit190;
    static final SimpleSymbol Lit191;
    static final IntNum Lit192 = IntNum.make(16777215);
    static final FString Lit193;
    static final FString Lit194;
    static final SimpleSymbol Lit195;
    static final IntNum Lit196;
    static final FString Lit197;
    static final FString Lit198;
    static final SimpleSymbol Lit199;
    static final SimpleSymbol Lit2;
    static final SimpleSymbol Lit20;
    static final IntNum Lit200;
    static final FString Lit201;
    static final FString Lit202;
    static final SimpleSymbol Lit203;
    static final IntNum Lit204;
    static final FString Lit205;
    static final FString Lit206;
    static final SimpleSymbol Lit207;
    static final FString Lit208;
    static final FString Lit209;
    static final SimpleSymbol Lit21;
    static final SimpleSymbol Lit210;
    static final FString Lit211;
    static final SimpleSymbol Lit212;
    static final FString Lit213;
    static final IntNum Lit214 = IntNum.make(16777215);
    static final FString Lit215;
    static final FString Lit216;
    static final SimpleSymbol Lit217;
    static final FString Lit218;
    static final FString Lit219;
    static final SimpleSymbol Lit22;
    static final SimpleSymbol Lit220;
    static final SimpleSymbol Lit221;
    static final IntNum Lit222 = IntNum.make(16777215);
    static final FString Lit223;
    static final FString Lit224;
    static final SimpleSymbol Lit225;
    static final FString Lit226;
    static final FString Lit227;
    static final SimpleSymbol Lit228;
    static final IntNum Lit229;
    static final SimpleSymbol Lit23;
    static final FString Lit230;
    static final FString Lit231;
    static final SimpleSymbol Lit232;
    static final IntNum Lit233;
    static final FString Lit234;
    static final FString Lit235;
    static final SimpleSymbol Lit236;
    static final IntNum Lit237;
    static final FString Lit238;
    static final FString Lit239;
    static final SimpleSymbol Lit24;
    static final SimpleSymbol Lit240;
    static final FString Lit241;
    static final FString Lit242;
    static final SimpleSymbol Lit243;
    static final IntNum Lit244 = IntNum.make(16777215);
    static final FString Lit245;
    static final FString Lit246;
    static final SimpleSymbol Lit247;
    static final FString Lit248;
    static final FString Lit249;
    static final SimpleSymbol Lit25;
    static final SimpleSymbol Lit250;
    static final IntNum Lit251;
    static final FString Lit252;
    static final FString Lit253;
    static final SimpleSymbol Lit254;
    static final IntNum Lit255;
    static final FString Lit256;
    static final FString Lit257;
    static final SimpleSymbol Lit258;
    static final IntNum Lit259;
    static final SimpleSymbol Lit26;
    static final FString Lit260;
    static final FString Lit261;
    static final SimpleSymbol Lit262;
    static final IntNum Lit263 = IntNum.make(70);
    static final FString Lit264;
    static final FString Lit265;
    static final SimpleSymbol Lit266;
    static final FString Lit267;
    static final FString Lit268;
    static final SimpleSymbol Lit269;
    static final PairWithPosition Lit27 = PairWithPosition.make(Lit13, PairWithPosition.make(Lit13, LList.Empty, "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 118888), "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 118882);
    static final FString Lit270;
    static final SimpleSymbol Lit271;
    static final FString Lit272;
    static final IntNum Lit273 = IntNum.make(16777215);
    static final FString Lit274;
    static final FString Lit275;
    static final SimpleSymbol Lit276;
    static final FString Lit277;
    static final FString Lit278;
    static final SimpleSymbol Lit279;
    static final PairWithPosition Lit28 = PairWithPosition.make(Lit13, PairWithPosition.make(Lit13, LList.Empty, "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 118993), "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 118987);
    static final IntNum Lit280 = IntNum.make(16777215);
    static final FString Lit281;
    static final FString Lit282;
    static final SimpleSymbol Lit283;
    static final FString Lit284;
    static final FString Lit285;
    static final SimpleSymbol Lit286;
    static final IntNum Lit287;
    static final FString Lit288;
    static final FString Lit289;
    static final PairWithPosition Lit29 = PairWithPosition.make(Lit13, PairWithPosition.make(Lit13, LList.Empty, "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 119104), "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 119098);
    static final SimpleSymbol Lit290;
    static final IntNum Lit291;
    static final FString Lit292;
    static final FString Lit293;
    static final SimpleSymbol Lit294;
    static final IntNum Lit295;
    static final FString Lit296;
    static final FString Lit297;
    static final SimpleSymbol Lit298;
    static final IntNum Lit299 = IntNum.make(80);
    static final SimpleSymbol Lit3;
    static final PairWithPosition Lit30 = PairWithPosition.make(Lit13, PairWithPosition.make(Lit13, LList.Empty, "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 119204), "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 119198);
    static final FString Lit300;
    static final FString Lit301;
    static final SimpleSymbol Lit302;
    static final FString Lit303;
    static final FString Lit304;
    static final SimpleSymbol Lit305;
    static final FString Lit306;
    static final SimpleSymbol Lit307;
    static final FString Lit308;
    static final FString Lit309;
    static final PairWithPosition Lit31 = PairWithPosition.make(Lit13, PairWithPosition.make(Lit13, LList.Empty, "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 119310), "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 119304);
    static final FString Lit310;
    static final FString Lit311;
    static final FString Lit312;
    static final SimpleSymbol Lit313;
    static final SimpleSymbol Lit314;
    static final SimpleSymbol Lit315;
    static final SimpleSymbol Lit316;
    static final FString Lit317;
    static final FString Lit318;
    static final SimpleSymbol Lit319;
    static final SimpleSymbol Lit32;
    static final IntNum Lit320 = IntNum.make((int) HttpStatus.SC_INTERNAL_SERVER_ERROR);
    static final FString Lit321;
    static final SimpleSymbol Lit322;
    static final SimpleSymbol Lit323;
    static final PairWithPosition Lit324 = PairWithPosition.make(Lit17, PairWithPosition.make(Lit17, LList.Empty, "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 2937049), "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 2937041);
    static final SimpleSymbol Lit325;
    static final PairWithPosition Lit326 = PairWithPosition.make(Lit17, LList.Empty, "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 2937313);
    static final PairWithPosition Lit327 = PairWithPosition.make(Lit13, PairWithPosition.make(Lit13, LList.Empty, "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 2937335), "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 2937329);
    static final PairWithPosition Lit328 = PairWithPosition.make(Lit68, PairWithPosition.make(Lit17, LList.Empty, "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 2937479), "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 2937473);
    static final PairWithPosition Lit329 = PairWithPosition.make(Lit68, PairWithPosition.make(Lit17, LList.Empty, "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 2937640), "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 2937634);
    static final SimpleSymbol Lit33;
    static final PairWithPosition Lit330 = PairWithPosition.make(Lit68, PairWithPosition.make(Lit17, LList.Empty, "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 2937845), "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 2937839);
    static final PairWithPosition Lit331;
    static final IntNum Lit332 = IntNum.make(60000);
    static final PairWithPosition Lit333 = PairWithPosition.make(Lit17, PairWithPosition.make(Lit17, LList.Empty, "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 2938147), "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 2938139);
    static final PairWithPosition Lit334 = PairWithPosition.make(Lit17, PairWithPosition.make(Lit17, LList.Empty, "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 2938180), "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 2938172);
    static final PairWithPosition Lit335 = PairWithPosition.make(Lit17, PairWithPosition.make(Lit17, LList.Empty, "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 2938401), "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 2938393);
    static final SimpleSymbol Lit336;
    static final SimpleSymbol Lit337;
    static final FString Lit338;
    static final SimpleSymbol Lit339;
    static final SimpleSymbol Lit34;
    static final IntNum Lit340 = IntNum.make(10000);
    static final FString Lit341;
    static final PairWithPosition Lit342;
    static final SimpleSymbol Lit343;
    static final PairWithPosition Lit344;
    static final SimpleSymbol Lit345;
    static final SimpleSymbol Lit346;
    static final SimpleSymbol Lit347;
    static final SimpleSymbol Lit348;
    static final SimpleSymbol Lit349;
    static final SimpleSymbol Lit35;
    static final SimpleSymbol Lit350;
    static final SimpleSymbol Lit351;
    static final SimpleSymbol Lit352;
    static final SimpleSymbol Lit353;
    static final SimpleSymbol Lit354;
    static final SimpleSymbol Lit355;
    static final SimpleSymbol Lit356;
    static final SimpleSymbol Lit357;
    static final SimpleSymbol Lit358;
    static final SimpleSymbol Lit359;
    static final SimpleSymbol Lit36;
    static final SimpleSymbol Lit360;
    static final SimpleSymbol Lit37;
    static final SimpleSymbol Lit38;
    static final SimpleSymbol Lit39;
    static final SimpleSymbol Lit4;
    static final FString Lit40;
    static final SimpleSymbol Lit41;
    static final SimpleSymbol Lit42;
    static final IntNum Lit43 = IntNum.make(3);
    static final IntNum Lit44 = IntNum.make(16777215);
    static final SimpleSymbol Lit45;
    static final IntNum Lit46 = IntNum.make(-2);
    static final SimpleSymbol Lit47;
    static final FString Lit48;
    static final FString Lit49;
    static final SimpleSymbol Lit5;
    static final SimpleSymbol Lit50;
    static final SimpleSymbol Lit51;
    static final FString Lit52;
    static final FString Lit53;
    static final SimpleSymbol Lit54;
    static final IntNum Lit55 = IntNum.make(16777215);
    static final SimpleSymbol Lit56;
    static final SimpleSymbol Lit57;
    static final IntNum Lit58 = IntNum.make(30);
    static final SimpleSymbol Lit59;
    static final IntNum Lit6 = IntNum.make(0);
    static final IntNum Lit60;
    static final SimpleSymbol Lit61;
    static final SimpleSymbol Lit62;
    static final IntNum Lit63;
    static final FString Lit64;
    static final SimpleSymbol Lit65;
    static final SimpleSymbol Lit66;
    static final SimpleSymbol Lit67;
    static final SimpleSymbol Lit68;
    static final SimpleSymbol Lit69;
    static final SimpleSymbol Lit7;
    static final SimpleSymbol Lit70;
    static final SimpleSymbol Lit71;
    static final SimpleSymbol Lit72;
    static final PairWithPosition Lit73 = PairWithPosition.make(Lit13, LList.Empty, "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 303223);
    static final SimpleSymbol Lit74;
    static final SimpleSymbol Lit75;
    static final PairWithPosition Lit76 = PairWithPosition.make(Lit13, PairWithPosition.make(Lit13, LList.Empty, "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 303442), "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 303436);
    static final PairWithPosition Lit77 = PairWithPosition.make(Lit13, LList.Empty, "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 303459);
    static final SimpleSymbol Lit78;
    static final SimpleSymbol Lit79;
    static final SimpleSymbol Lit8;
    static final FString Lit80;
    static final SimpleSymbol Lit81;
    static final IntNum Lit82 = IntNum.make(100);
    static final FString Lit83;
    static final FString Lit84;
    static final SimpleSymbol Lit85;
    static final IntNum Lit86 = IntNum.make(16777215);
    static final IntNum Lit87;
    static final FString Lit88;
    static final SimpleSymbol Lit89;
    static final DFloNum Lit9 = DFloNum.make(1.1d);
    static final SimpleSymbol Lit90;
    static final SimpleSymbol Lit91;
    static final FString Lit92;
    static final SimpleSymbol Lit93;
    static final FString Lit94;
    static final FString Lit95;
    static final FString Lit96;
    static final SimpleSymbol Lit97;
    static final IntNum Lit98 = IntNum.make(1);
    static final PairWithPosition Lit99 = PairWithPosition.make(Lit360, PairWithPosition.make(Lit360, LList.Empty, "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 467041), "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 467036);
    public static Screen1 Screen1;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn100 = null;
    static final ModuleMethod lambda$Fn101 = null;
    static final ModuleMethod lambda$Fn102 = null;
    static final ModuleMethod lambda$Fn103 = null;
    static final ModuleMethod lambda$Fn104 = null;
    static final ModuleMethod lambda$Fn105 = null;
    static final ModuleMethod lambda$Fn106 = null;
    static final ModuleMethod lambda$Fn107 = null;
    static final ModuleMethod lambda$Fn108 = null;
    static final ModuleMethod lambda$Fn109 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn110 = null;
    static final ModuleMethod lambda$Fn111 = null;
    static final ModuleMethod lambda$Fn112 = null;
    static final ModuleMethod lambda$Fn113 = null;
    static final ModuleMethod lambda$Fn114 = null;
    static final ModuleMethod lambda$Fn115 = null;
    static final ModuleMethod lambda$Fn116 = null;
    static final ModuleMethod lambda$Fn117 = null;
    static final ModuleMethod lambda$Fn118 = null;
    static final ModuleMethod lambda$Fn119 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn120 = null;
    static final ModuleMethod lambda$Fn121 = null;
    static final ModuleMethod lambda$Fn122 = null;
    static final ModuleMethod lambda$Fn123 = null;
    static final ModuleMethod lambda$Fn124 = null;
    static final ModuleMethod lambda$Fn125 = null;
    static final ModuleMethod lambda$Fn126 = null;
    static final ModuleMethod lambda$Fn127 = null;
    static final ModuleMethod lambda$Fn128 = null;
    static final ModuleMethod lambda$Fn129 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn17 = null;
    static final ModuleMethod lambda$Fn18 = null;
    static final ModuleMethod lambda$Fn19 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn20 = null;
    static final ModuleMethod lambda$Fn21 = null;
    static final ModuleMethod lambda$Fn22 = null;
    static final ModuleMethod lambda$Fn23 = null;
    static final ModuleMethod lambda$Fn24 = null;
    static final ModuleMethod lambda$Fn25 = null;
    static final ModuleMethod lambda$Fn26 = null;
    static final ModuleMethod lambda$Fn27 = null;
    static final ModuleMethod lambda$Fn28 = null;
    static final ModuleMethod lambda$Fn29 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn30 = null;
    static final ModuleMethod lambda$Fn31 = null;
    static final ModuleMethod lambda$Fn32 = null;
    static final ModuleMethod lambda$Fn33 = null;
    static final ModuleMethod lambda$Fn34 = null;
    static final ModuleMethod lambda$Fn35 = null;
    static final ModuleMethod lambda$Fn36 = null;
    static final ModuleMethod lambda$Fn37 = null;
    static final ModuleMethod lambda$Fn38 = null;
    static final ModuleMethod lambda$Fn39 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn40 = null;
    static final ModuleMethod lambda$Fn41 = null;
    static final ModuleMethod lambda$Fn42 = null;
    static final ModuleMethod lambda$Fn43 = null;
    static final ModuleMethod lambda$Fn44 = null;
    static final ModuleMethod lambda$Fn45 = null;
    static final ModuleMethod lambda$Fn46 = null;
    static final ModuleMethod lambda$Fn47 = null;
    static final ModuleMethod lambda$Fn48 = null;
    static final ModuleMethod lambda$Fn49 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn50 = null;
    static final ModuleMethod lambda$Fn51 = null;
    static final ModuleMethod lambda$Fn52 = null;
    static final ModuleMethod lambda$Fn53 = null;
    static final ModuleMethod lambda$Fn54 = null;
    static final ModuleMethod lambda$Fn55 = null;
    static final ModuleMethod lambda$Fn56 = null;
    static final ModuleMethod lambda$Fn57 = null;
    static final ModuleMethod lambda$Fn58 = null;
    static final ModuleMethod lambda$Fn59 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn60 = null;
    static final ModuleMethod lambda$Fn61 = null;
    static final ModuleMethod lambda$Fn62 = null;
    static final ModuleMethod lambda$Fn63 = null;
    static final ModuleMethod lambda$Fn64 = null;
    static final ModuleMethod lambda$Fn65 = null;
    static final ModuleMethod lambda$Fn66 = null;
    static final ModuleMethod lambda$Fn67 = null;
    static final ModuleMethod lambda$Fn68 = null;
    static final ModuleMethod lambda$Fn69 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn70 = null;
    static final ModuleMethod lambda$Fn71 = null;
    static final ModuleMethod lambda$Fn72 = null;
    static final ModuleMethod lambda$Fn73 = null;
    static final ModuleMethod lambda$Fn74 = null;
    static final ModuleMethod lambda$Fn75 = null;
    static final ModuleMethod lambda$Fn76 = null;
    static final ModuleMethod lambda$Fn77 = null;
    static final ModuleMethod lambda$Fn78 = null;
    static final ModuleMethod lambda$Fn79 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn80 = null;
    static final ModuleMethod lambda$Fn81 = null;
    static final ModuleMethod lambda$Fn82 = null;
    static final ModuleMethod lambda$Fn83 = null;
    static final ModuleMethod lambda$Fn84 = null;
    static final ModuleMethod lambda$Fn85 = null;
    static final ModuleMethod lambda$Fn86 = null;
    static final ModuleMethod lambda$Fn87 = null;
    static final ModuleMethod lambda$Fn88 = null;
    static final ModuleMethod lambda$Fn89 = null;
    static final ModuleMethod lambda$Fn9 = null;
    static final ModuleMethod lambda$Fn90 = null;
    static final ModuleMethod lambda$Fn91 = null;
    static final ModuleMethod lambda$Fn92 = null;
    static final ModuleMethod lambda$Fn93 = null;
    static final ModuleMethod lambda$Fn94 = null;
    static final ModuleMethod lambda$Fn95 = null;
    static final ModuleMethod lambda$Fn96 = null;
    static final ModuleMethod lambda$Fn97 = null;
    static final ModuleMethod lambda$Fn98 = null;
    static final ModuleMethod lambda$Fn99 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Label AvgRate;
    public BluetoothClient Bluetooth_Client1;
    public ListPicker BtDevices;
    public final ModuleMethod BtDevices$AfterPicking;
    public final ModuleMethod BtDevices$BeforePicking;
    public Clock Clock1;
    public final ModuleMethod Clock1$Timer;
    public Clock Clock2;
    public final ModuleMethod Clock2$Timer;
    public FirebaseDB Firebase_Database1;
    public Label FlowRate;
    public HorizontalArrangement Horizontal_Arrangement1;
    public HorizontalArrangement Horizontal_Arrangement2;
    public HorizontalArrangement Horizontal_Arrangement3;
    public HorizontalArrangement Horizontal_Arrangement3_copy;
    public HorizontalArrangement Horizontal_Arrangement4;
    public Image Image1;
    public Image Image2;
    public Image Image3;
    public Image Image4;
    public Image Image4_copy;
    public Image Image5;
    public Label Label1;
    public Label Label2;
    public Label Label2_copy;
    public Label Label2_copy1;
    public Label Label2_copy1_copy;
    public Label Label2_copy1_copy_copy;
    public Label Label2_copy2;
    public Label Label2_copy2_copy;
    public Label Label4;
    public Notifier Notifier1;
    public final ModuleMethod Screen1$Initialize;
    public Slider Slider1;
    public final ModuleMethod Slider1$PositionChanged;
    public SpaceView Space1;
    public SpaceView Space1_copy;
    public SpaceView Space2;
    public SpaceView Space3;
    public SpaceView Space4;
    public SpaceView Space5;
    public SpaceView Space6;
    public SpaceView Space6_copy;
    public SpaceView Space7;
    public SpaceView Space7_copy;
    public SpaceView Space7_copy_copy;
    public SpaceView Space8;
    public SpaceView Space8_copy;
    public VerticalScrollArrangement Sync;
    public MakeroidTabLayout Tab_Layout1;
    public final ModuleMethod Tab_Layout1$TabItemSelected;
    public VerticalScrollArrangement VolumeWhole;
    public Label WaterGoal;
    public WebViewer Web_Viewer1;
    public WebViewer Web_Viewer2;
    public WebViewer Web_Viewer3;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public Button back_consumption;
    public final ModuleMethod back_consumption$Click;
    public Button back_flow;
    public final ModuleMethod back_flow$Click;
    public Button back_sync;
    public final ModuleMethod back_sync$Click;
    public Button back_waterGoal;
    public final ModuleMethod back_waterGoal$Click;
    public Button back_website;
    public final ModuleMethod back_website$Click;
    public LList components$Mnto$Mncreate;
    public Button database;
    public final ModuleMethod database$Click;
    public final ModuleMethod dispatchEvent;
    public final ModuleMethod dispatchGenericEvent;
    public LList events$Mnto$Mnregister;
    public VerticalScrollArrangement flow;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public final ModuleMethod get$Mnsimple$Mnname;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public VerticalArrangement main_home;
    public Button more;
    public final ModuleMethod more$Click;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;
    public Label volume;
    public VerticalScrollArrangement waterGoal;
    public VerticalScrollArrangement website;

    /* renamed from: io.kodular.m_27gurnameh99singh12.Smart_Water_Meter.Screen1$frame */
    /* compiled from: Screen1.yail */
    public class frame extends ModuleBody {
        Screen1 $main = this;

        public frame() {
        }

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj2 = obj;
            CallContext callContext2 = callContext;
            switch (moduleMethod2.selector) {
                case 1:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 2:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 4:
                    CallContext callContext3 = callContext2;
                    Object obj3 = obj2;
                    Object obj4 = obj3;
                    if (!(obj3 instanceof Symbol)) {
                        return -786431;
                    }
                    callContext3.value1 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 6:
                    CallContext callContext4 = callContext2;
                    Object obj5 = obj2;
                    Object obj6 = obj5;
                    if (!(obj5 instanceof Symbol)) {
                        return -786431;
                    }
                    callContext4.value1 = obj6;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 11:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 12:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 13:
                    CallContext callContext5 = callContext2;
                    Object obj7 = obj2;
                    Object obj8 = obj7;
                    if (!(obj7 instanceof Screen1)) {
                        return -786431;
                    }
                    callContext5.value1 = obj8;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 35:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                case 83:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod2, obj2, callContext2);
            }
        }

        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj3 = obj;
            Object obj4 = obj2;
            CallContext callContext2 = callContext;
            switch (moduleMethod2.selector) {
                case 3:
                    CallContext callContext3 = callContext2;
                    Object obj5 = obj3;
                    Object obj6 = obj5;
                    if (!(obj5 instanceof Symbol)) {
                        return -786431;
                    }
                    callContext3.value1 = obj6;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 2;
                    return 0;
                case 4:
                    CallContext callContext4 = callContext2;
                    Object obj7 = obj3;
                    Object obj8 = obj7;
                    if (!(obj7 instanceof Symbol)) {
                        return -786431;
                    }
                    callContext4.value1 = obj8;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 2;
                    return 0;
                case 7:
                    CallContext callContext5 = callContext2;
                    Object obj9 = obj3;
                    Object obj10 = obj9;
                    if (!(obj9 instanceof Symbol)) {
                        return -786431;
                    }
                    callContext5.value1 = obj10;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 2;
                    return 0;
                case 8:
                    callContext2.value1 = obj3;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 2;
                    return 0;
                case 10:
                    callContext2.value1 = obj3;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 2;
                    return 0;
                case 16:
                    callContext2.value1 = obj3;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 2;
                    return 0;
                case 45:
                    callContext2.value1 = obj3;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 2;
                    return 0;
                default:
                    return super.match2(moduleMethod2, obj3, obj4, callContext2);
            }
        }

        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj5 = obj;
            Object obj6 = obj2;
            Object obj7 = obj3;
            Object obj8 = obj4;
            CallContext callContext2 = callContext;
            switch (moduleMethod2.selector) {
                case 9:
                    callContext2.value1 = obj5;
                    callContext2.value2 = obj6;
                    callContext2.value3 = obj7;
                    callContext2.value4 = obj8;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 4;
                    return 0;
                case 14:
                    CallContext callContext3 = callContext2;
                    Object obj9 = obj5;
                    Object obj10 = obj9;
                    if (!(obj9 instanceof Screen1)) {
                        return -786431;
                    }
                    callContext3.value1 = obj10;
                    CallContext callContext4 = callContext2;
                    Object obj11 = obj6;
                    Object obj12 = obj11;
                    if (!(obj11 instanceof Component)) {
                        return -786430;
                    }
                    callContext4.value2 = obj12;
                    CallContext callContext5 = callContext2;
                    Object obj13 = obj7;
                    Object obj14 = obj13;
                    if (!(obj13 instanceof String)) {
                        return -786429;
                    }
                    callContext5.value3 = obj14;
                    CallContext callContext6 = callContext2;
                    Object obj15 = obj8;
                    Object obj16 = obj15;
                    if (!(obj15 instanceof String)) {
                        return -786428;
                    }
                    callContext6.value4 = obj16;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 4;
                    return 0;
                case 15:
                    CallContext callContext7 = callContext2;
                    Object obj17 = obj5;
                    Object obj18 = obj17;
                    if (!(obj17 instanceof Screen1)) {
                        return -786431;
                    }
                    callContext7.value1 = obj18;
                    CallContext callContext8 = callContext2;
                    Object obj19 = obj6;
                    Object obj20 = obj19;
                    if (!(obj19 instanceof Component)) {
                        return -786430;
                    }
                    callContext8.value2 = obj20;
                    CallContext callContext9 = callContext2;
                    Object obj21 = obj7;
                    Object obj22 = obj21;
                    if (!(obj21 instanceof String)) {
                        return -786429;
                    }
                    callContext9.value3 = obj22;
                    CallContext callContext10 = callContext2;
                    Object obj23 = obj8;
                    Object obj24 = obj23;
                    Object obj25 = obj23;
                    if (1 == 0) {
                        return -786428;
                    }
                    callContext10.value4 = obj24;
                    callContext2.proc = moduleMethod2;
                    callContext2.f240pc = 4;
                    return 0;
                default:
                    return super.match4(moduleMethod2, obj5, obj6, obj7, obj8, callContext2);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            WrongType wrongType;
            WrongType wrongType2;
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj2 = obj;
            switch (moduleMethod2.selector) {
                case 1:
                    return this.$main.getSimpleName(obj2);
                case 2:
                    this.$main.androidLogForm(obj2);
                    return Values.empty;
                case 4:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj2);
                    } catch (ClassCastException e) {
                        ClassCastException classCastException = e;
                        WrongType wrongType3 = wrongType2;
                        WrongType wrongType4 = new WrongType(classCastException, "lookup-in-form-environment", 1, obj2);
                        throw wrongType3;
                    }
                case 6:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj2) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e2) {
                        ClassCastException classCastException2 = e2;
                        WrongType wrongType5 = wrongType;
                        WrongType wrongType6 = new WrongType(classCastException2, "is-bound-in-form-environment", 1, obj2);
                        throw wrongType5;
                    }
                case 11:
                    this.$main.addToFormDoAfterCreation(obj2);
                    return Values.empty;
                case 12:
                    this.$main.sendError(obj2);
                    return Values.empty;
                case 13:
                    this.$main.processException(obj2);
                    return Values.empty;
                case 35:
                    return this.$main.BtDevices$AfterPicking(obj2);
                case 83:
                    return this.$main.Slider1$PositionChanged(obj2);
                default:
                    return super.apply1(moduleMethod2, obj2);
            }
        }

        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            WrongType wrongType;
            WrongType wrongType2;
            WrongType wrongType3;
            WrongType wrongType4;
            WrongType wrongType5;
            WrongType wrongType6;
            WrongType wrongType7;
            WrongType wrongType8;
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj5 = obj;
            Object obj6 = obj2;
            Object obj7 = obj3;
            Object obj8 = obj4;
            switch (moduleMethod2.selector) {
                case 9:
                    this.$main.addToComponents(obj5, obj6, obj7, obj8);
                    return Values.empty;
                case 14:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj5, (String) obj6, (String) obj7, (Object[]) obj8) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    ClassCastException classCastException = e;
                                    WrongType wrongType9 = wrongType8;
                                    WrongType wrongType10 = new WrongType(classCastException, "dispatchEvent", 4, obj8);
                                    throw wrongType9;
                                }
                            } catch (ClassCastException e2) {
                                ClassCastException classCastException2 = e2;
                                WrongType wrongType11 = wrongType7;
                                WrongType wrongType12 = new WrongType(classCastException2, "dispatchEvent", 3, obj7);
                                throw wrongType11;
                            }
                        } catch (ClassCastException e3) {
                            ClassCastException classCastException3 = e3;
                            WrongType wrongType13 = wrongType6;
                            WrongType wrongType14 = new WrongType(classCastException3, "dispatchEvent", 2, obj6);
                            throw wrongType13;
                        }
                    } catch (ClassCastException e4) {
                        ClassCastException classCastException4 = e4;
                        WrongType wrongType15 = wrongType5;
                        WrongType wrongType16 = new WrongType(classCastException4, "dispatchEvent", 1, obj5);
                        throw wrongType15;
                    }
                case 15:
                    try {
                        try {
                            try {
                                try {
                                    this.$main.dispatchGenericEvent((Component) obj5, (String) obj6, obj7 != Boolean.FALSE, (Object[]) obj8);
                                    return Values.empty;
                                } catch (ClassCastException e5) {
                                    ClassCastException classCastException5 = e5;
                                    WrongType wrongType17 = wrongType4;
                                    WrongType wrongType18 = new WrongType(classCastException5, "dispatchGenericEvent", 4, obj8);
                                    throw wrongType17;
                                }
                            } catch (ClassCastException e6) {
                                ClassCastException classCastException6 = e6;
                                WrongType wrongType19 = wrongType3;
                                WrongType wrongType20 = new WrongType(classCastException6, "dispatchGenericEvent", 3, obj7);
                                throw wrongType19;
                            }
                        } catch (ClassCastException e7) {
                            ClassCastException classCastException7 = e7;
                            WrongType wrongType21 = wrongType2;
                            WrongType wrongType22 = new WrongType(classCastException7, "dispatchGenericEvent", 2, obj6);
                            throw wrongType21;
                        }
                    } catch (ClassCastException e8) {
                        ClassCastException classCastException8 = e8;
                        WrongType wrongType23 = wrongType;
                        WrongType wrongType24 = new WrongType(classCastException8, "dispatchGenericEvent", 1, obj5);
                        throw wrongType23;
                    }
                default:
                    return super.apply4(moduleMethod2, obj5, obj6, obj7, obj8);
            }
        }

        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            WrongType wrongType;
            WrongType wrongType2;
            WrongType wrongType3;
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj3 = obj;
            Object obj4 = obj2;
            switch (moduleMethod2.selector) {
                case 3:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj3, obj4);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        ClassCastException classCastException = e;
                        WrongType wrongType4 = wrongType3;
                        WrongType wrongType5 = new WrongType(classCastException, "add-to-form-environment", 1, obj3);
                        throw wrongType4;
                    }
                case 4:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj3, obj4);
                    } catch (ClassCastException e2) {
                        ClassCastException classCastException2 = e2;
                        WrongType wrongType6 = wrongType2;
                        WrongType wrongType7 = new WrongType(classCastException2, "lookup-in-form-environment", 1, obj3);
                        throw wrongType6;
                    }
                case 7:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj3, obj4);
                        return Values.empty;
                    } catch (ClassCastException e3) {
                        ClassCastException classCastException3 = e3;
                        WrongType wrongType8 = wrongType;
                        WrongType wrongType9 = new WrongType(classCastException3, "add-to-global-var-environment", 1, obj3);
                        throw wrongType8;
                    }
                case 8:
                    this.$main.addToEvents(obj3, obj4);
                    return Values.empty;
                case 10:
                    this.$main.addToGlobalVars(obj3, obj4);
                    return Values.empty;
                case 16:
                    return this.$main.lookupHandler(obj3, obj4);
                case 45:
                    return this.$main.Tab_Layout1$TabItemSelected(obj3, obj4);
                default:
                    return super.apply2(moduleMethod2, obj3, obj4);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            ModuleMethod moduleMethod2 = moduleMethod;
            switch (moduleMethod2.selector) {
                case 17:
                    return Screen1.lambda2();
                case 18:
                    this.$main.$define();
                    return Values.empty;
                case 19:
                    return Screen1.lambda3();
                case 20:
                    return Screen1.lambda4();
                case 21:
                    return Screen1.lambda5();
                case 22:
                    return Screen1.lambda6();
                case 23:
                    return Screen1.lambda7();
                case 24:
                    return Screen1.lambda8();
                case 25:
                    return Screen1.lambda9();
                case 26:
                    return Screen1.lambda10();
                case 27:
                    return this.$main.Screen1$Initialize();
                case 28:
                    return Screen1.lambda11();
                case 29:
                    return Screen1.lambda12();
                case 30:
                    return Screen1.lambda13();
                case 31:
                    return Screen1.lambda14();
                case 32:
                    return Screen1.lambda15();
                case 33:
                    return Screen1.lambda16();
                case 34:
                    return this.$main.BtDevices$BeforePicking();
                case 36:
                    return Screen1.lambda17();
                case 37:
                    return Screen1.lambda18();
                case 38:
                    return Screen1.lambda19();
                case 39:
                    return Screen1.lambda20();
                case 40:
                    return this.$main.more$Click();
                case 41:
                    return Screen1.lambda21();
                case 42:
                    return Screen1.lambda22();
                case 43:
                    return Screen1.lambda23();
                case 44:
                    return Screen1.lambda24();
                case 46:
                    return Screen1.lambda25();
                case 47:
                    return Screen1.lambda26();
                case 48:
                    return Screen1.lambda27();
                case 49:
                    return Screen1.lambda28();
                case 50:
                    return Screen1.lambda29();
                case 51:
                    return Screen1.lambda30();
                case 52:
                    return this.$main.back_website$Click();
                case 53:
                    return Screen1.lambda31();
                case 54:
                    return Screen1.lambda32();
                case 55:
                    return Screen1.lambda33();
                case 56:
                    return Screen1.lambda34();
                case 57:
                    return Screen1.lambda35();
                case 58:
                    return Screen1.lambda36();
                case 59:
                    return Screen1.lambda37();
                case 60:
                    return Screen1.lambda38();
                case 61:
                    return this.$main.database$Click();
                case 62:
                    return Screen1.lambda39();
                case 63:
                    return Screen1.lambda40();
                case 64:
                    return Screen1.lambda41();
                case 65:
                    return Screen1.lambda42();
                case 66:
                    return Screen1.lambda43();
                case 67:
                    return Screen1.lambda44();
                case 68:
                    return Screen1.lambda45();
                case 69:
                    return Screen1.lambda46();
                case 70:
                    return Screen1.lambda47();
                case 71:
                    return Screen1.lambda48();
                case 72:
                    return this.$main.back_sync$Click();
                case 73:
                    return Screen1.lambda49();
                case 74:
                    return Screen1.lambda50();
                case 75:
                    return Screen1.lambda51();
                case 76:
                    return Screen1.lambda52();
                case 77:
                    return Screen1.lambda53();
                case 78:
                    return Screen1.lambda54();
                case 79:
                    return Screen1.lambda55();
                case 80:
                    return Screen1.lambda56();
                case 81:
                    return Screen1.lambda57();
                case 82:
                    return Screen1.lambda58();
                case 84:
                    return Screen1.lambda59();
                case 85:
                    return Screen1.lambda60();
                case 86:
                    return Screen1.lambda61();
                case 87:
                    return Screen1.lambda62();
                case 88:
                    return Screen1.lambda63();
                case 89:
                    return Screen1.lambda64();
                case 90:
                    return Screen1.lambda65();
                case 91:
                    return Screen1.lambda66();
                case 92:
                    return Screen1.lambda67();
                case 93:
                    return Screen1.lambda68();
                case 94:
                    return Screen1.lambda69();
                case 95:
                    return Screen1.lambda70();
                case 96:
                    return this.$main.back_waterGoal$Click();
                case 97:
                    return Screen1.lambda71();
                case 98:
                    return Screen1.lambda72();
                case 99:
                    return Screen1.lambda73();
                case 100:
                    return Screen1.lambda74();
                case 101:
                    return Screen1.lambda75();
                case 102:
                    return Screen1.lambda76();
                case 103:
                    return Screen1.lambda77();
                case 104:
                    return Screen1.lambda78();
                case 105:
                    return Screen1.lambda79();
                case 106:
                    return Screen1.lambda80();
                case 107:
                    return Screen1.lambda81();
                case 108:
                    return Screen1.lambda82();
                case 109:
                    return Screen1.lambda83();
                case 110:
                    return Screen1.lambda84();
                case 111:
                    return Screen1.lambda85();
                case 112:
                    return Screen1.lambda86();
                case 113:
                    return Screen1.lambda87();
                case 114:
                    return Screen1.lambda88();
                case 115:
                    return Screen1.lambda89();
                case 116:
                    return Screen1.lambda90();
                case 117:
                    return Screen1.lambda91();
                case 118:
                    return Screen1.lambda92();
                case 119:
                    return Screen1.lambda93();
                case 120:
                    return Screen1.lambda94();
                case 121:
                    return Screen1.lambda95();
                case 122:
                    return Screen1.lambda96();
                case 123:
                    return Screen1.lambda97();
                case 124:
                    return Screen1.lambda98();
                case 125:
                    return Screen1.lambda99();
                case 126:
                    return Screen1.lambda100();
                case 127:
                    return Screen1.lambda101();
                case 128:
                    return Screen1.lambda102();
                case 129:
                    return this.$main.back_flow$Click();
                case 130:
                    return Screen1.lambda103();
                case 131:
                    return Screen1.lambda104();
                case 132:
                    return Screen1.lambda105();
                case 133:
                    return Screen1.lambda106();
                case 134:
                    return Screen1.lambda107();
                case 135:
                    return Screen1.lambda108();
                case 136:
                    return Screen1.lambda109();
                case 137:
                    return Screen1.lambda110();
                case 138:
                    return Screen1.lambda111();
                case 139:
                    return Screen1.lambda112();
                case 140:
                    return Screen1.lambda113();
                case 141:
                    return Screen1.lambda114();
                case 142:
                    return Screen1.lambda115();
                case 143:
                    return Screen1.lambda116();
                case 144:
                    return Screen1.lambda117();
                case 145:
                    return Screen1.lambda118();
                case 146:
                    return Screen1.lambda119();
                case 147:
                    return Screen1.lambda120();
                case 148:
                    return Screen1.lambda121();
                case 149:
                    return Screen1.lambda122();
                case 150:
                    return this.$main.back_consumption$Click();
                case 151:
                    return Screen1.lambda123();
                case 152:
                    return Screen1.lambda124();
                case 153:
                    return Screen1.lambda125();
                case 154:
                    return Screen1.lambda126();
                case 155:
                    return Screen1.lambda127();
                case 156:
                    return Screen1.lambda128();
                case 157:
                    return this.$main.Clock1$Timer();
                case 158:
                    return Screen1.lambda129();
                case 159:
                    return Screen1.lambda130();
                case ComponentConstants.TEXTBOX_PREFERRED_WIDTH /*160*/:
                    return this.$main.Clock2$Timer();
                default:
                    return super.apply0(moduleMethod2);
            }
        }

        /* JADX WARNING: type inference failed for: r2v0 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int match0(gnu.expr.ModuleMethod r7, gnu.mapping.CallContext r8) {
            /*
                r6 = this;
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r1
                int r3 = r3.selector
                switch(r3) {
                    case 17: goto L_0x0697;
                    case 18: goto L_0x068b;
                    case 19: goto L_0x067f;
                    case 20: goto L_0x0673;
                    case 21: goto L_0x0667;
                    case 22: goto L_0x065b;
                    case 23: goto L_0x064f;
                    case 24: goto L_0x0643;
                    case 25: goto L_0x0637;
                    case 26: goto L_0x062b;
                    case 27: goto L_0x061f;
                    case 28: goto L_0x0613;
                    case 29: goto L_0x0607;
                    case 30: goto L_0x05fb;
                    case 31: goto L_0x05ef;
                    case 32: goto L_0x05e3;
                    case 33: goto L_0x05d7;
                    case 34: goto L_0x05cb;
                    case 35: goto L_0x0009;
                    case 36: goto L_0x05bf;
                    case 37: goto L_0x05b3;
                    case 38: goto L_0x05a7;
                    case 39: goto L_0x059b;
                    case 40: goto L_0x058f;
                    case 41: goto L_0x0583;
                    case 42: goto L_0x0577;
                    case 43: goto L_0x056b;
                    case 44: goto L_0x055f;
                    case 45: goto L_0x0009;
                    case 46: goto L_0x0553;
                    case 47: goto L_0x0547;
                    case 48: goto L_0x053b;
                    case 49: goto L_0x052f;
                    case 50: goto L_0x0523;
                    case 51: goto L_0x0517;
                    case 52: goto L_0x050b;
                    case 53: goto L_0x04ff;
                    case 54: goto L_0x04f3;
                    case 55: goto L_0x04e7;
                    case 56: goto L_0x04db;
                    case 57: goto L_0x04cf;
                    case 58: goto L_0x04c3;
                    case 59: goto L_0x04b7;
                    case 60: goto L_0x04ab;
                    case 61: goto L_0x049f;
                    case 62: goto L_0x0493;
                    case 63: goto L_0x0487;
                    case 64: goto L_0x047b;
                    case 65: goto L_0x046f;
                    case 66: goto L_0x0463;
                    case 67: goto L_0x0457;
                    case 68: goto L_0x044b;
                    case 69: goto L_0x043f;
                    case 70: goto L_0x0433;
                    case 71: goto L_0x0427;
                    case 72: goto L_0x041b;
                    case 73: goto L_0x040f;
                    case 74: goto L_0x0403;
                    case 75: goto L_0x03f7;
                    case 76: goto L_0x03eb;
                    case 77: goto L_0x03df;
                    case 78: goto L_0x03d3;
                    case 79: goto L_0x03c7;
                    case 80: goto L_0x03bb;
                    case 81: goto L_0x03af;
                    case 82: goto L_0x03a3;
                    case 83: goto L_0x0009;
                    case 84: goto L_0x0397;
                    case 85: goto L_0x038b;
                    case 86: goto L_0x037f;
                    case 87: goto L_0x0373;
                    case 88: goto L_0x0367;
                    case 89: goto L_0x035b;
                    case 90: goto L_0x034f;
                    case 91: goto L_0x0343;
                    case 92: goto L_0x0337;
                    case 93: goto L_0x032b;
                    case 94: goto L_0x031f;
                    case 95: goto L_0x0313;
                    case 96: goto L_0x0307;
                    case 97: goto L_0x02fb;
                    case 98: goto L_0x02ef;
                    case 99: goto L_0x02e3;
                    case 100: goto L_0x02d7;
                    case 101: goto L_0x02cb;
                    case 102: goto L_0x02bf;
                    case 103: goto L_0x02b3;
                    case 104: goto L_0x02a7;
                    case 105: goto L_0x029b;
                    case 106: goto L_0x028f;
                    case 107: goto L_0x0283;
                    case 108: goto L_0x0277;
                    case 109: goto L_0x026b;
                    case 110: goto L_0x025f;
                    case 111: goto L_0x0253;
                    case 112: goto L_0x0247;
                    case 113: goto L_0x023b;
                    case 114: goto L_0x022f;
                    case 115: goto L_0x0223;
                    case 116: goto L_0x0217;
                    case 117: goto L_0x020b;
                    case 118: goto L_0x01ff;
                    case 119: goto L_0x01f3;
                    case 120: goto L_0x01e7;
                    case 121: goto L_0x01db;
                    case 122: goto L_0x01cf;
                    case 123: goto L_0x01c3;
                    case 124: goto L_0x01b7;
                    case 125: goto L_0x01ab;
                    case 126: goto L_0x019f;
                    case 127: goto L_0x0193;
                    case 128: goto L_0x0187;
                    case 129: goto L_0x017b;
                    case 130: goto L_0x016f;
                    case 131: goto L_0x0163;
                    case 132: goto L_0x0157;
                    case 133: goto L_0x014b;
                    case 134: goto L_0x013f;
                    case 135: goto L_0x0133;
                    case 136: goto L_0x0127;
                    case 137: goto L_0x011b;
                    case 138: goto L_0x010f;
                    case 139: goto L_0x0103;
                    case 140: goto L_0x00f7;
                    case 141: goto L_0x00eb;
                    case 142: goto L_0x00df;
                    case 143: goto L_0x00d3;
                    case 144: goto L_0x00c7;
                    case 145: goto L_0x00bb;
                    case 146: goto L_0x00af;
                    case 147: goto L_0x00a3;
                    case 148: goto L_0x0097;
                    case 149: goto L_0x008b;
                    case 150: goto L_0x0080;
                    case 151: goto L_0x0075;
                    case 152: goto L_0x006a;
                    case 153: goto L_0x005f;
                    case 154: goto L_0x0054;
                    case 155: goto L_0x0049;
                    case 156: goto L_0x003e;
                    case 157: goto L_0x0033;
                    case 158: goto L_0x0028;
                    case 159: goto L_0x001d;
                    case 160: goto L_0x0012;
                    default: goto L_0x0009;
                }
            L_0x0009:
                r3 = r0
                r4 = r1
                r5 = r2
                int r3 = super.match0(r4, r5)
                r0 = r3
            L_0x0011:
                return r0
            L_0x0012:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x001d:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0028:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0033:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x003e:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0049:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0054:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x005f:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x006a:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0075:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0080:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x008b:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0097:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x00a3:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x00af:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x00bb:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x00c7:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x00d3:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x00df:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x00eb:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x00f7:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0103:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x010f:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x011b:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0127:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0133:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x013f:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x014b:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0157:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0163:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x016f:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x017b:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0187:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0193:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x019f:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x01ab:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x01b7:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x01c3:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x01cf:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x01db:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x01e7:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x01f3:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x01ff:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x020b:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0217:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0223:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x022f:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x023b:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0247:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0253:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x025f:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x026b:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0277:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0283:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x028f:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x029b:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x02a7:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x02b3:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x02bf:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x02cb:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x02d7:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x02e3:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x02ef:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x02fb:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0307:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0313:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x031f:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x032b:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0337:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0343:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x034f:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x035b:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0367:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0373:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x037f:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x038b:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0397:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x03a3:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x03af:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x03bb:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x03c7:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x03d3:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x03df:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x03eb:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x03f7:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0403:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x040f:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x041b:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0427:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0433:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x043f:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x044b:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0457:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0463:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x046f:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x047b:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0487:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0493:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x049f:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x04ab:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x04b7:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x04c3:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x04cf:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x04db:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x04e7:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x04f3:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x04ff:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x050b:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0517:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0523:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x052f:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x053b:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0547:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0553:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x055f:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x056b:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0577:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0583:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x058f:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x059b:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x05a7:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x05b3:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x05bf:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x05cb:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x05d7:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x05e3:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x05ef:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x05fb:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0607:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0613:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x061f:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x062b:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0637:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0643:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x064f:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x065b:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0667:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0673:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x067f:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x068b:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            L_0x0697:
                r3 = r2
                r4 = r1
                r3.proc = r4
                r3 = r2
                r4 = 0
                r3.f240pc = r4
                r3 = 0
                r0 = r3
                goto L_0x0011
            */
            throw new UnsupportedOperationException("Method not decompiled: p004io.kodular.m_27gurnameh99singh12.Smart_Water_Meter.Screen1.frame.match0(gnu.expr.ModuleMethod, gnu.mapping.CallContext):int");
        }
    }

    static {
        SimpleSymbol simpleSymbol;
        SimpleSymbol simpleSymbol2;
        SimpleSymbol simpleSymbol3;
        SimpleSymbol simpleSymbol4;
        SimpleSymbol simpleSymbol5;
        SimpleSymbol simpleSymbol6;
        SimpleSymbol simpleSymbol7;
        SimpleSymbol simpleSymbol8;
        SimpleSymbol simpleSymbol9;
        SimpleSymbol simpleSymbol10;
        SimpleSymbol simpleSymbol11;
        SimpleSymbol simpleSymbol12;
        SimpleSymbol simpleSymbol13;
        SimpleSymbol simpleSymbol14;
        SimpleSymbol simpleSymbol15;
        SimpleSymbol simpleSymbol16;
        SimpleSymbol simpleSymbol17;
        SimpleSymbol simpleSymbol18;
        SimpleSymbol simpleSymbol19;
        SimpleSymbol simpleSymbol20;
        FString fString;
        SimpleSymbol simpleSymbol21;
        FString fString2;
        SimpleSymbol simpleSymbol22;
        SimpleSymbol simpleSymbol23;
        SimpleSymbol simpleSymbol24;
        SimpleSymbol simpleSymbol25;
        SimpleSymbol simpleSymbol26;
        SimpleSymbol simpleSymbol27;
        FString fString3;
        SimpleSymbol simpleSymbol28;
        FString fString4;
        FString fString5;
        SimpleSymbol simpleSymbol29;
        SimpleSymbol simpleSymbol30;
        SimpleSymbol simpleSymbol31;
        SimpleSymbol simpleSymbol32;
        FString fString6;
        FString fString7;
        FString fString8;
        FString fString9;
        FString fString10;
        SimpleSymbol simpleSymbol33;
        FString fString11;
        SimpleSymbol simpleSymbol34;
        FString fString12;
        FString fString13;
        SimpleSymbol simpleSymbol35;
        FString fString14;
        FString fString15;
        SimpleSymbol simpleSymbol36;
        FString fString16;
        FString fString17;
        SimpleSymbol simpleSymbol37;
        FString fString18;
        FString fString19;
        SimpleSymbol simpleSymbol38;
        FString fString20;
        FString fString21;
        SimpleSymbol simpleSymbol39;
        FString fString22;
        FString fString23;
        SimpleSymbol simpleSymbol40;
        FString fString24;
        FString fString25;
        SimpleSymbol simpleSymbol41;
        FString fString26;
        FString fString27;
        SimpleSymbol simpleSymbol42;
        FString fString28;
        FString fString29;
        FString fString30;
        SimpleSymbol simpleSymbol43;
        FString fString31;
        SimpleSymbol simpleSymbol44;
        FString fString32;
        FString fString33;
        SimpleSymbol simpleSymbol45;
        FString fString34;
        FString fString35;
        SimpleSymbol simpleSymbol46;
        FString fString36;
        FString fString37;
        SimpleSymbol simpleSymbol47;
        FString fString38;
        FString fString39;
        SimpleSymbol simpleSymbol48;
        FString fString40;
        FString fString41;
        SimpleSymbol simpleSymbol49;
        FString fString42;
        FString fString43;
        SimpleSymbol simpleSymbol50;
        FString fString44;
        FString fString45;
        SimpleSymbol simpleSymbol51;
        FString fString46;
        FString fString47;
        SimpleSymbol simpleSymbol52;
        FString fString48;
        FString fString49;
        SimpleSymbol simpleSymbol53;
        FString fString50;
        FString fString51;
        SimpleSymbol simpleSymbol54;
        FString fString52;
        FString fString53;
        SimpleSymbol simpleSymbol55;
        FString fString54;
        FString fString55;
        SimpleSymbol simpleSymbol56;
        FString fString56;
        FString fString57;
        SimpleSymbol simpleSymbol57;
        SimpleSymbol simpleSymbol58;
        FString fString58;
        FString fString59;
        SimpleSymbol simpleSymbol59;
        FString fString60;
        FString fString61;
        FString fString62;
        SimpleSymbol simpleSymbol60;
        FString fString63;
        SimpleSymbol simpleSymbol61;
        FString fString64;
        FString fString65;
        SimpleSymbol simpleSymbol62;
        FString fString66;
        FString fString67;
        SimpleSymbol simpleSymbol63;
        FString fString68;
        FString fString69;
        SimpleSymbol simpleSymbol64;
        FString fString70;
        FString fString71;
        SimpleSymbol simpleSymbol65;
        FString fString72;
        FString fString73;
        SimpleSymbol simpleSymbol66;
        FString fString74;
        SimpleSymbol simpleSymbol67;
        SimpleSymbol simpleSymbol68;
        SimpleSymbol simpleSymbol69;
        FString fString75;
        SimpleSymbol simpleSymbol70;
        SimpleSymbol simpleSymbol71;
        FString fString76;
        FString fString77;
        SimpleSymbol simpleSymbol72;
        FString fString78;
        FString fString79;
        SimpleSymbol simpleSymbol73;
        FString fString80;
        FString fString81;
        SimpleSymbol simpleSymbol74;
        FString fString82;
        FString fString83;
        FString fString84;
        SimpleSymbol simpleSymbol75;
        FString fString85;
        SimpleSymbol simpleSymbol76;
        FString fString86;
        FString fString87;
        SimpleSymbol simpleSymbol77;
        FString fString88;
        FString fString89;
        SimpleSymbol simpleSymbol78;
        SimpleSymbol simpleSymbol79;
        FString fString90;
        FString fString91;
        SimpleSymbol simpleSymbol80;
        FString fString92;
        FString fString93;
        SimpleSymbol simpleSymbol81;
        FString fString94;
        SimpleSymbol simpleSymbol82;
        SimpleSymbol simpleSymbol83;
        SimpleSymbol simpleSymbol84;
        SimpleSymbol simpleSymbol85;
        SimpleSymbol simpleSymbol86;
        SimpleSymbol simpleSymbol87;
        SimpleSymbol simpleSymbol88;
        SimpleSymbol simpleSymbol89;
        FString fString95;
        SimpleSymbol simpleSymbol90;
        FString fString96;
        FString fString97;
        SimpleSymbol simpleSymbol91;
        FString fString98;
        FString fString99;
        SimpleSymbol simpleSymbol92;
        FString fString100;
        FString fString101;
        FString fString102;
        SimpleSymbol simpleSymbol93;
        FString fString103;
        SimpleSymbol simpleSymbol94;
        SimpleSymbol simpleSymbol95;
        FString fString104;
        FString fString105;
        SimpleSymbol simpleSymbol96;
        SimpleSymbol simpleSymbol97;
        FString fString106;
        FString fString107;
        FString fString108;
        SimpleSymbol simpleSymbol98;
        SimpleSymbol simpleSymbol99;
        SimpleSymbol simpleSymbol100;
        FString fString109;
        FString fString110;
        FString fString111;
        SimpleSymbol simpleSymbol101;
        FString fString112;
        SimpleSymbol simpleSymbol102;
        SimpleSymbol simpleSymbol103;
        SimpleSymbol simpleSymbol104;
        FString fString113;
        SimpleSymbol simpleSymbol105;
        FString fString114;
        FString fString115;
        SimpleSymbol simpleSymbol106;
        FString fString116;
        SimpleSymbol simpleSymbol107;
        SimpleSymbol simpleSymbol108;
        SimpleSymbol simpleSymbol109;
        SimpleSymbol simpleSymbol110;
        SimpleSymbol simpleSymbol111;
        SimpleSymbol simpleSymbol112;
        SimpleSymbol simpleSymbol113;
        SimpleSymbol simpleSymbol114;
        SimpleSymbol simpleSymbol115;
        SimpleSymbol simpleSymbol116;
        SimpleSymbol simpleSymbol117;
        FString fString117;
        SimpleSymbol simpleSymbol118;
        SimpleSymbol simpleSymbol119;
        SimpleSymbol simpleSymbol120;
        SimpleSymbol simpleSymbol121;
        SimpleSymbol simpleSymbol122;
        SimpleSymbol simpleSymbol123;
        FString fString118;
        FString fString119;
        SimpleSymbol simpleSymbol124;
        SimpleSymbol simpleSymbol125;
        FString fString120;
        FString fString121;
        SimpleSymbol simpleSymbol126;
        SimpleSymbol simpleSymbol127;
        SimpleSymbol simpleSymbol128;
        SimpleSymbol simpleSymbol129;
        FString fString122;
        SimpleSymbol simpleSymbol130;
        SimpleSymbol simpleSymbol131;
        SimpleSymbol simpleSymbol132;
        SimpleSymbol simpleSymbol133;
        SimpleSymbol simpleSymbol134;
        SimpleSymbol simpleSymbol135;
        SimpleSymbol simpleSymbol136;
        SimpleSymbol simpleSymbol137;
        SimpleSymbol simpleSymbol138;
        SimpleSymbol simpleSymbol139;
        SimpleSymbol simpleSymbol140;
        SimpleSymbol simpleSymbol141;
        SimpleSymbol simpleSymbol142;
        SimpleSymbol simpleSymbol143;
        SimpleSymbol simpleSymbol144;
        SimpleSymbol simpleSymbol145;
        SimpleSymbol simpleSymbol146;
        SimpleSymbol simpleSymbol147;
        SimpleSymbol simpleSymbol148;
        SimpleSymbol simpleSymbol149;
        SimpleSymbol simpleSymbol150;
        SimpleSymbol simpleSymbol151;
        SimpleSymbol simpleSymbol152;
        SimpleSymbol simpleSymbol153;
        SimpleSymbol simpleSymbol154;
        SimpleSymbol simpleSymbol155;
        SimpleSymbol simpleSymbol156;
        SimpleSymbol simpleSymbol157;
        SimpleSymbol simpleSymbol158;
        SimpleSymbol simpleSymbol159 = simpleSymbol;
        SimpleSymbol simpleSymbol160 = new SimpleSymbol("any");
        Lit360 = (SimpleSymbol) simpleSymbol159.readResolve();
        SimpleSymbol simpleSymbol161 = simpleSymbol2;
        SimpleSymbol simpleSymbol162 = new SimpleSymbol("lookup-handler");
        Lit359 = (SimpleSymbol) simpleSymbol161.readResolve();
        SimpleSymbol simpleSymbol163 = simpleSymbol3;
        SimpleSymbol simpleSymbol164 = new SimpleSymbol("dispatchGenericEvent");
        Lit358 = (SimpleSymbol) simpleSymbol163.readResolve();
        SimpleSymbol simpleSymbol165 = simpleSymbol4;
        SimpleSymbol simpleSymbol166 = new SimpleSymbol("dispatchEvent");
        Lit357 = (SimpleSymbol) simpleSymbol165.readResolve();
        SimpleSymbol simpleSymbol167 = simpleSymbol5;
        SimpleSymbol simpleSymbol168 = new SimpleSymbol("send-error");
        Lit356 = (SimpleSymbol) simpleSymbol167.readResolve();
        SimpleSymbol simpleSymbol169 = simpleSymbol6;
        SimpleSymbol simpleSymbol170 = new SimpleSymbol("add-to-form-do-after-creation");
        Lit355 = (SimpleSymbol) simpleSymbol169.readResolve();
        SimpleSymbol simpleSymbol171 = simpleSymbol7;
        SimpleSymbol simpleSymbol172 = new SimpleSymbol("add-to-global-vars");
        Lit354 = (SimpleSymbol) simpleSymbol171.readResolve();
        SimpleSymbol simpleSymbol173 = simpleSymbol8;
        SimpleSymbol simpleSymbol174 = new SimpleSymbol("add-to-components");
        Lit353 = (SimpleSymbol) simpleSymbol173.readResolve();
        SimpleSymbol simpleSymbol175 = simpleSymbol9;
        SimpleSymbol simpleSymbol176 = new SimpleSymbol("add-to-events");
        Lit352 = (SimpleSymbol) simpleSymbol175.readResolve();
        SimpleSymbol simpleSymbol177 = simpleSymbol10;
        SimpleSymbol simpleSymbol178 = new SimpleSymbol("add-to-global-var-environment");
        Lit351 = (SimpleSymbol) simpleSymbol177.readResolve();
        SimpleSymbol simpleSymbol179 = simpleSymbol11;
        SimpleSymbol simpleSymbol180 = new SimpleSymbol("is-bound-in-form-environment");
        Lit350 = (SimpleSymbol) simpleSymbol179.readResolve();
        SimpleSymbol simpleSymbol181 = simpleSymbol12;
        SimpleSymbol simpleSymbol182 = new SimpleSymbol("lookup-in-form-environment");
        Lit349 = (SimpleSymbol) simpleSymbol181.readResolve();
        SimpleSymbol simpleSymbol183 = simpleSymbol13;
        SimpleSymbol simpleSymbol184 = new SimpleSymbol("add-to-form-environment");
        Lit348 = (SimpleSymbol) simpleSymbol183.readResolve();
        SimpleSymbol simpleSymbol185 = simpleSymbol14;
        SimpleSymbol simpleSymbol186 = new SimpleSymbol("android-log-form");
        Lit347 = (SimpleSymbol) simpleSymbol185.readResolve();
        SimpleSymbol simpleSymbol187 = simpleSymbol15;
        SimpleSymbol simpleSymbol188 = new SimpleSymbol("get-simple-name");
        Lit346 = (SimpleSymbol) simpleSymbol187.readResolve();
        SimpleSymbol simpleSymbol189 = simpleSymbol16;
        SimpleSymbol simpleSymbol190 = new SimpleSymbol("Clock2$Timer");
        Lit345 = (SimpleSymbol) simpleSymbol189.readResolve();
        SimpleSymbol simpleSymbol191 = simpleSymbol17;
        SimpleSymbol simpleSymbol192 = new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT);
        SimpleSymbol simpleSymbol193 = (SimpleSymbol) simpleSymbol191.readResolve();
        SimpleSymbol simpleSymbol194 = simpleSymbol193;
        Lit13 = simpleSymbol193;
        SimpleSymbol simpleSymbol195 = Lit13;
        SimpleSymbol simpleSymbol196 = Lit13;
        SimpleSymbol simpleSymbol197 = Lit13;
        SimpleSymbol simpleSymbol198 = simpleSymbol18;
        SimpleSymbol simpleSymbol199 = new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN);
        SimpleSymbol simpleSymbol200 = (SimpleSymbol) simpleSymbol198.readResolve();
        SimpleSymbol simpleSymbol201 = simpleSymbol200;
        Lit22 = simpleSymbol200;
        Lit344 = PairWithPosition.make(simpleSymbol194, PairWithPosition.make(simpleSymbol195, PairWithPosition.make(simpleSymbol196, PairWithPosition.make(simpleSymbol197, PairWithPosition.make(simpleSymbol201, LList.Empty, "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 2974021), "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 2974016), "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 2974011), "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 2974006), "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 2974000);
        SimpleSymbol simpleSymbol202 = simpleSymbol19;
        SimpleSymbol simpleSymbol203 = new SimpleSymbol("CustomMessageDialog");
        Lit343 = (SimpleSymbol) simpleSymbol202.readResolve();
        SimpleSymbol simpleSymbol204 = simpleSymbol20;
        SimpleSymbol simpleSymbol205 = new SimpleSymbol("number");
        SimpleSymbol simpleSymbol206 = (SimpleSymbol) simpleSymbol204.readResolve();
        SimpleSymbol simpleSymbol207 = simpleSymbol206;
        Lit17 = simpleSymbol206;
        Lit342 = PairWithPosition.make(simpleSymbol207, PairWithPosition.make(Lit17, LList.Empty, "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 2973809), "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 2973801);
        FString fString123 = fString;
        FString fString124 = new FString("com.google.appinventor.components.runtime.Clock");
        Lit341 = fString123;
        SimpleSymbol simpleSymbol208 = simpleSymbol21;
        SimpleSymbol simpleSymbol209 = new SimpleSymbol("Clock2");
        Lit339 = (SimpleSymbol) simpleSymbol208.readResolve();
        FString fString125 = fString2;
        FString fString126 = new FString("com.google.appinventor.components.runtime.Clock");
        Lit338 = fString125;
        SimpleSymbol simpleSymbol210 = simpleSymbol22;
        SimpleSymbol simpleSymbol211 = new SimpleSymbol("Timer");
        Lit337 = (SimpleSymbol) simpleSymbol210.readResolve();
        SimpleSymbol simpleSymbol212 = simpleSymbol23;
        SimpleSymbol simpleSymbol213 = new SimpleSymbol("Clock1$Timer");
        Lit336 = (SimpleSymbol) simpleSymbol212.readResolve();
        SimpleSymbol simpleSymbol214 = simpleSymbol24;
        SimpleSymbol simpleSymbol215 = new SimpleSymbol("list");
        SimpleSymbol simpleSymbol216 = (SimpleSymbol) simpleSymbol214.readResolve();
        SimpleSymbol simpleSymbol217 = simpleSymbol216;
        Lit68 = simpleSymbol216;
        Lit331 = PairWithPosition.make(simpleSymbol217, PairWithPosition.make(Lit17, LList.Empty, "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 2938033), "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 2938027);
        SimpleSymbol simpleSymbol218 = simpleSymbol25;
        SimpleSymbol simpleSymbol219 = new SimpleSymbol("ReceiveText");
        Lit325 = (SimpleSymbol) simpleSymbol218.readResolve();
        SimpleSymbol simpleSymbol220 = simpleSymbol26;
        SimpleSymbol simpleSymbol221 = new SimpleSymbol("BytesAvailableToReceive");
        Lit323 = (SimpleSymbol) simpleSymbol220.readResolve();
        SimpleSymbol simpleSymbol222 = simpleSymbol27;
        SimpleSymbol simpleSymbol223 = new SimpleSymbol("IsConnected");
        Lit322 = (SimpleSymbol) simpleSymbol222.readResolve();
        FString fString127 = fString3;
        FString fString128 = new FString("com.google.appinventor.components.runtime.Clock");
        Lit321 = fString127;
        SimpleSymbol simpleSymbol224 = simpleSymbol28;
        SimpleSymbol simpleSymbol225 = new SimpleSymbol("TimerInterval");
        Lit319 = (SimpleSymbol) simpleSymbol224.readResolve();
        FString fString129 = fString4;
        FString fString130 = new FString("com.google.appinventor.components.runtime.Clock");
        Lit318 = fString129;
        FString fString131 = fString5;
        FString fString132 = new FString("com.google.appinventor.components.runtime.FirebaseDB");
        Lit317 = fString131;
        SimpleSymbol simpleSymbol226 = simpleSymbol29;
        SimpleSymbol simpleSymbol227 = new SimpleSymbol("FirebaseURL");
        Lit316 = (SimpleSymbol) simpleSymbol226.readResolve();
        SimpleSymbol simpleSymbol228 = simpleSymbol30;
        SimpleSymbol simpleSymbol229 = new SimpleSymbol("FirebaseToken");
        Lit315 = (SimpleSymbol) simpleSymbol228.readResolve();
        SimpleSymbol simpleSymbol230 = simpleSymbol31;
        SimpleSymbol simpleSymbol231 = new SimpleSymbol("DeveloperBucket");
        Lit314 = (SimpleSymbol) simpleSymbol230.readResolve();
        SimpleSymbol simpleSymbol232 = simpleSymbol32;
        SimpleSymbol simpleSymbol233 = new SimpleSymbol("DefaultURL");
        Lit313 = (SimpleSymbol) simpleSymbol232.readResolve();
        FString fString133 = fString6;
        FString fString134 = new FString("com.google.appinventor.components.runtime.FirebaseDB");
        Lit312 = fString133;
        FString fString135 = fString7;
        FString fString136 = new FString("com.google.appinventor.components.runtime.Notifier");
        Lit311 = fString135;
        FString fString137 = fString8;
        FString fString138 = new FString("com.google.appinventor.components.runtime.Notifier");
        Lit310 = fString137;
        FString fString139 = fString9;
        FString fString140 = new FString("com.google.appinventor.components.runtime.BluetoothClient");
        Lit309 = fString139;
        FString fString141 = fString10;
        FString fString142 = new FString("com.google.appinventor.components.runtime.BluetoothClient");
        Lit308 = fString141;
        SimpleSymbol simpleSymbol234 = simpleSymbol33;
        SimpleSymbol simpleSymbol235 = new SimpleSymbol("back_consumption$Click");
        Lit307 = (SimpleSymbol) simpleSymbol234.readResolve();
        FString fString143 = fString11;
        FString fString144 = new FString("com.google.appinventor.components.runtime.Button");
        Lit306 = fString143;
        SimpleSymbol simpleSymbol236 = simpleSymbol34;
        SimpleSymbol simpleSymbol237 = new SimpleSymbol("back_consumption");
        Lit305 = (SimpleSymbol) simpleSymbol236.readResolve();
        FString fString145 = fString12;
        FString fString146 = new FString("com.google.appinventor.components.runtime.Button");
        Lit304 = fString145;
        FString fString147 = fString13;
        FString fString148 = new FString("com.google.appinventor.components.runtime.WebViewer");
        Lit303 = fString147;
        SimpleSymbol simpleSymbol238 = simpleSymbol35;
        SimpleSymbol simpleSymbol239 = new SimpleSymbol("Web_Viewer3");
        Lit302 = (SimpleSymbol) simpleSymbol238.readResolve();
        FString fString149 = fString14;
        FString fString150 = new FString("com.google.appinventor.components.runtime.WebViewer");
        Lit301 = fString149;
        FString fString151 = fString15;
        FString fString152 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit300 = fString151;
        SimpleSymbol simpleSymbol240 = simpleSymbol36;
        SimpleSymbol simpleSymbol241 = new SimpleSymbol("Space8_copy");
        Lit298 = (SimpleSymbol) simpleSymbol240.readResolve();
        FString fString153 = fString16;
        FString fString154 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit297 = fString153;
        FString fString155 = fString17;
        FString fString156 = new FString("com.google.appinventor.components.runtime.Label");
        Lit296 = fString155;
        int[] iArr = new int[2];
        int[] iArr2 = iArr;
        iArr[0] = -1;
        Lit295 = IntNum.make(iArr2);
        SimpleSymbol simpleSymbol242 = simpleSymbol37;
        SimpleSymbol simpleSymbol243 = new SimpleSymbol("Label2_copy1_copy_copy");
        Lit294 = (SimpleSymbol) simpleSymbol242.readResolve();
        FString fString157 = fString18;
        FString fString158 = new FString("com.google.appinventor.components.runtime.Label");
        Lit293 = fString157;
        FString fString159 = fString19;
        FString fString160 = new FString("com.google.appinventor.components.runtime.Label");
        Lit292 = fString159;
        int[] iArr3 = new int[2];
        int[] iArr4 = iArr3;
        iArr3[0] = -1;
        Lit291 = IntNum.make(iArr4);
        SimpleSymbol simpleSymbol244 = simpleSymbol38;
        SimpleSymbol simpleSymbol245 = new SimpleSymbol("volume");
        Lit290 = (SimpleSymbol) simpleSymbol244.readResolve();
        FString fString161 = fString20;
        FString fString162 = new FString("com.google.appinventor.components.runtime.Label");
        Lit289 = fString161;
        FString fString163 = fString21;
        FString fString164 = new FString("com.google.appinventor.components.runtime.Label");
        Lit288 = fString163;
        int[] iArr5 = new int[2];
        int[] iArr6 = iArr5;
        iArr5[0] = -1;
        Lit287 = IntNum.make(iArr6);
        SimpleSymbol simpleSymbol246 = simpleSymbol39;
        SimpleSymbol simpleSymbol247 = new SimpleSymbol("Label2_copy2");
        Lit286 = (SimpleSymbol) simpleSymbol246.readResolve();
        FString fString165 = fString22;
        FString fString166 = new FString("com.google.appinventor.components.runtime.Label");
        Lit285 = fString165;
        FString fString167 = fString23;
        FString fString168 = new FString("com.google.appinventor.components.runtime.Image");
        Lit284 = fString167;
        SimpleSymbol simpleSymbol248 = simpleSymbol40;
        SimpleSymbol simpleSymbol249 = new SimpleSymbol("Image5");
        Lit283 = (SimpleSymbol) simpleSymbol248.readResolve();
        FString fString169 = fString24;
        FString fString170 = new FString("com.google.appinventor.components.runtime.Image");
        Lit282 = fString169;
        FString fString171 = fString25;
        FString fString172 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit281 = fString171;
        SimpleSymbol simpleSymbol250 = simpleSymbol41;
        SimpleSymbol simpleSymbol251 = new SimpleSymbol("Horizontal_Arrangement4");
        Lit279 = (SimpleSymbol) simpleSymbol250.readResolve();
        FString fString173 = fString26;
        FString fString174 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit278 = fString173;
        FString fString175 = fString27;
        FString fString176 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit277 = fString175;
        SimpleSymbol simpleSymbol252 = simpleSymbol42;
        SimpleSymbol simpleSymbol253 = new SimpleSymbol("Space8");
        Lit276 = (SimpleSymbol) simpleSymbol252.readResolve();
        FString fString177 = fString28;
        FString fString178 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit275 = fString177;
        FString fString179 = fString29;
        FString fString180 = new FString("com.google.appinventor.components.runtime.VerticalScrollArrangement");
        Lit274 = fString179;
        FString fString181 = fString30;
        FString fString182 = new FString("com.google.appinventor.components.runtime.VerticalScrollArrangement");
        Lit272 = fString181;
        SimpleSymbol simpleSymbol254 = simpleSymbol43;
        SimpleSymbol simpleSymbol255 = new SimpleSymbol("back_flow$Click");
        Lit271 = (SimpleSymbol) simpleSymbol254.readResolve();
        FString fString183 = fString31;
        FString fString184 = new FString("com.google.appinventor.components.runtime.Button");
        Lit270 = fString183;
        SimpleSymbol simpleSymbol256 = simpleSymbol44;
        SimpleSymbol simpleSymbol257 = new SimpleSymbol("back_flow");
        Lit269 = (SimpleSymbol) simpleSymbol256.readResolve();
        FString fString185 = fString32;
        FString fString186 = new FString("com.google.appinventor.components.runtime.Button");
        Lit268 = fString185;
        FString fString187 = fString33;
        FString fString188 = new FString("com.google.appinventor.components.runtime.WebViewer");
        Lit267 = fString187;
        SimpleSymbol simpleSymbol258 = simpleSymbol45;
        SimpleSymbol simpleSymbol259 = new SimpleSymbol("Web_Viewer2");
        Lit266 = (SimpleSymbol) simpleSymbol258.readResolve();
        FString fString189 = fString34;
        FString fString190 = new FString("com.google.appinventor.components.runtime.WebViewer");
        Lit265 = fString189;
        FString fString191 = fString35;
        FString fString192 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit264 = fString191;
        SimpleSymbol simpleSymbol260 = simpleSymbol46;
        SimpleSymbol simpleSymbol261 = new SimpleSymbol("Space7_copy_copy");
        Lit262 = (SimpleSymbol) simpleSymbol260.readResolve();
        FString fString193 = fString36;
        FString fString194 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit261 = fString193;
        FString fString195 = fString37;
        FString fString196 = new FString("com.google.appinventor.components.runtime.Label");
        Lit260 = fString195;
        int[] iArr7 = new int[2];
        int[] iArr8 = iArr7;
        iArr7[0] = -1;
        Lit259 = IntNum.make(iArr8);
        SimpleSymbol simpleSymbol262 = simpleSymbol47;
        SimpleSymbol simpleSymbol263 = new SimpleSymbol("Label2_copy1_copy");
        Lit258 = (SimpleSymbol) simpleSymbol262.readResolve();
        FString fString197 = fString38;
        FString fString198 = new FString("com.google.appinventor.components.runtime.Label");
        Lit257 = fString197;
        FString fString199 = fString39;
        FString fString200 = new FString("com.google.appinventor.components.runtime.Label");
        Lit256 = fString199;
        int[] iArr9 = new int[2];
        int[] iArr10 = iArr9;
        iArr9[0] = -1;
        Lit255 = IntNum.make(iArr10);
        SimpleSymbol simpleSymbol264 = simpleSymbol48;
        SimpleSymbol simpleSymbol265 = new SimpleSymbol("AvgRate");
        Lit254 = (SimpleSymbol) simpleSymbol264.readResolve();
        FString fString201 = fString40;
        FString fString202 = new FString("com.google.appinventor.components.runtime.Label");
        Lit253 = fString201;
        FString fString203 = fString41;
        FString fString204 = new FString("com.google.appinventor.components.runtime.Label");
        Lit252 = fString203;
        int[] iArr11 = new int[2];
        int[] iArr12 = iArr11;
        iArr11[0] = -1;
        Lit251 = IntNum.make(iArr12);
        SimpleSymbol simpleSymbol266 = simpleSymbol49;
        SimpleSymbol simpleSymbol267 = new SimpleSymbol("Label2_copy2_copy");
        Lit250 = (SimpleSymbol) simpleSymbol266.readResolve();
        FString fString205 = fString42;
        FString fString206 = new FString("com.google.appinventor.components.runtime.Label");
        Lit249 = fString205;
        FString fString207 = fString43;
        FString fString208 = new FString("com.google.appinventor.components.runtime.Image");
        Lit248 = fString207;
        SimpleSymbol simpleSymbol268 = simpleSymbol50;
        SimpleSymbol simpleSymbol269 = new SimpleSymbol("Image4_copy");
        Lit247 = (SimpleSymbol) simpleSymbol268.readResolve();
        FString fString209 = fString44;
        FString fString210 = new FString("com.google.appinventor.components.runtime.Image");
        Lit246 = fString209;
        FString fString211 = fString45;
        FString fString212 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit245 = fString211;
        SimpleSymbol simpleSymbol270 = simpleSymbol51;
        SimpleSymbol simpleSymbol271 = new SimpleSymbol("Horizontal_Arrangement3_copy");
        Lit243 = (SimpleSymbol) simpleSymbol270.readResolve();
        FString fString213 = fString46;
        FString fString214 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit242 = fString213;
        FString fString215 = fString47;
        FString fString216 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit241 = fString215;
        SimpleSymbol simpleSymbol272 = simpleSymbol52;
        SimpleSymbol simpleSymbol273 = new SimpleSymbol("Space7_copy");
        Lit240 = (SimpleSymbol) simpleSymbol272.readResolve();
        FString fString217 = fString48;
        FString fString218 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit239 = fString217;
        FString fString219 = fString49;
        FString fString220 = new FString("com.google.appinventor.components.runtime.Label");
        Lit238 = fString219;
        int[] iArr13 = new int[2];
        int[] iArr14 = iArr13;
        iArr13[0] = -1;
        Lit237 = IntNum.make(iArr14);
        SimpleSymbol simpleSymbol274 = simpleSymbol53;
        SimpleSymbol simpleSymbol275 = new SimpleSymbol("Label2_copy1");
        Lit236 = (SimpleSymbol) simpleSymbol274.readResolve();
        FString fString221 = fString50;
        FString fString222 = new FString("com.google.appinventor.components.runtime.Label");
        Lit235 = fString221;
        FString fString223 = fString51;
        FString fString224 = new FString("com.google.appinventor.components.runtime.Label");
        Lit234 = fString223;
        int[] iArr15 = new int[2];
        int[] iArr16 = iArr15;
        iArr15[0] = -1;
        Lit233 = IntNum.make(iArr16);
        SimpleSymbol simpleSymbol276 = simpleSymbol54;
        SimpleSymbol simpleSymbol277 = new SimpleSymbol("FlowRate");
        Lit232 = (SimpleSymbol) simpleSymbol276.readResolve();
        FString fString225 = fString52;
        FString fString226 = new FString("com.google.appinventor.components.runtime.Label");
        Lit231 = fString225;
        FString fString227 = fString53;
        FString fString228 = new FString("com.google.appinventor.components.runtime.Label");
        Lit230 = fString227;
        int[] iArr17 = new int[2];
        int[] iArr18 = iArr17;
        iArr17[0] = -1;
        Lit229 = IntNum.make(iArr18);
        SimpleSymbol simpleSymbol278 = simpleSymbol55;
        SimpleSymbol simpleSymbol279 = new SimpleSymbol("Label2");
        Lit228 = (SimpleSymbol) simpleSymbol278.readResolve();
        FString fString229 = fString54;
        FString fString230 = new FString("com.google.appinventor.components.runtime.Label");
        Lit227 = fString229;
        FString fString231 = fString55;
        FString fString232 = new FString("com.google.appinventor.components.runtime.Image");
        Lit226 = fString231;
        SimpleSymbol simpleSymbol280 = simpleSymbol56;
        SimpleSymbol simpleSymbol281 = new SimpleSymbol("Image4");
        Lit225 = (SimpleSymbol) simpleSymbol280.readResolve();
        FString fString233 = fString56;
        FString fString234 = new FString("com.google.appinventor.components.runtime.Image");
        Lit224 = fString233;
        FString fString235 = fString57;
        FString fString236 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit223 = fString235;
        SimpleSymbol simpleSymbol282 = simpleSymbol57;
        SimpleSymbol simpleSymbol283 = new SimpleSymbol("AlignVertical");
        Lit221 = (SimpleSymbol) simpleSymbol282.readResolve();
        SimpleSymbol simpleSymbol284 = simpleSymbol58;
        SimpleSymbol simpleSymbol285 = new SimpleSymbol("Horizontal_Arrangement3");
        Lit220 = (SimpleSymbol) simpleSymbol284.readResolve();
        FString fString237 = fString58;
        FString fString238 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit219 = fString237;
        FString fString239 = fString59;
        FString fString240 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit218 = fString239;
        SimpleSymbol simpleSymbol286 = simpleSymbol59;
        SimpleSymbol simpleSymbol287 = new SimpleSymbol("Space7");
        Lit217 = (SimpleSymbol) simpleSymbol286.readResolve();
        FString fString241 = fString60;
        FString fString242 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit216 = fString241;
        FString fString243 = fString61;
        FString fString244 = new FString("com.google.appinventor.components.runtime.VerticalScrollArrangement");
        Lit215 = fString243;
        FString fString245 = fString62;
        FString fString246 = new FString("com.google.appinventor.components.runtime.VerticalScrollArrangement");
        Lit213 = fString245;
        SimpleSymbol simpleSymbol288 = simpleSymbol60;
        SimpleSymbol simpleSymbol289 = new SimpleSymbol("back_waterGoal$Click");
        Lit212 = (SimpleSymbol) simpleSymbol288.readResolve();
        FString fString247 = fString63;
        FString fString248 = new FString("com.google.appinventor.components.runtime.Button");
        Lit211 = fString247;
        SimpleSymbol simpleSymbol290 = simpleSymbol61;
        SimpleSymbol simpleSymbol291 = new SimpleSymbol("back_waterGoal");
        Lit210 = (SimpleSymbol) simpleSymbol290.readResolve();
        FString fString249 = fString64;
        FString fString250 = new FString("com.google.appinventor.components.runtime.Button");
        Lit209 = fString249;
        FString fString251 = fString65;
        FString fString252 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit208 = fString251;
        SimpleSymbol simpleSymbol292 = simpleSymbol62;
        SimpleSymbol simpleSymbol293 = new SimpleSymbol("Space6_copy");
        Lit207 = (SimpleSymbol) simpleSymbol292.readResolve();
        FString fString253 = fString66;
        FString fString254 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit206 = fString253;
        FString fString255 = fString67;
        FString fString256 = new FString("com.google.appinventor.components.runtime.Label");
        Lit205 = fString255;
        int[] iArr19 = new int[2];
        int[] iArr20 = iArr19;
        iArr19[0] = -1;
        Lit204 = IntNum.make(iArr20);
        SimpleSymbol simpleSymbol294 = simpleSymbol63;
        SimpleSymbol simpleSymbol295 = new SimpleSymbol("Label4");
        Lit203 = (SimpleSymbol) simpleSymbol294.readResolve();
        FString fString257 = fString68;
        FString fString258 = new FString("com.google.appinventor.components.runtime.Label");
        Lit202 = fString257;
        FString fString259 = fString69;
        FString fString260 = new FString("com.google.appinventor.components.runtime.Label");
        Lit201 = fString259;
        int[] iArr21 = new int[2];
        int[] iArr22 = iArr21;
        iArr21[0] = -1;
        Lit200 = IntNum.make(iArr22);
        SimpleSymbol simpleSymbol296 = simpleSymbol64;
        SimpleSymbol simpleSymbol297 = new SimpleSymbol("WaterGoal");
        Lit199 = (SimpleSymbol) simpleSymbol296.readResolve();
        FString fString261 = fString70;
        FString fString262 = new FString("com.google.appinventor.components.runtime.Label");
        Lit198 = fString261;
        FString fString263 = fString71;
        FString fString264 = new FString("com.google.appinventor.components.runtime.Label");
        Lit197 = fString263;
        int[] iArr23 = new int[2];
        int[] iArr24 = iArr23;
        iArr23[0] = -1;
        Lit196 = IntNum.make(iArr24);
        SimpleSymbol simpleSymbol298 = simpleSymbol65;
        SimpleSymbol simpleSymbol299 = new SimpleSymbol("Label2_copy");
        Lit195 = (SimpleSymbol) simpleSymbol298.readResolve();
        FString fString265 = fString72;
        FString fString266 = new FString("com.google.appinventor.components.runtime.Label");
        Lit194 = fString265;
        FString fString267 = fString73;
        FString fString268 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit193 = fString267;
        SimpleSymbol simpleSymbol300 = simpleSymbol66;
        SimpleSymbol simpleSymbol301 = new SimpleSymbol("Horizontal_Arrangement2");
        Lit191 = (SimpleSymbol) simpleSymbol300.readResolve();
        FString fString269 = fString74;
        FString fString270 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit190 = fString269;
        SimpleSymbol simpleSymbol302 = simpleSymbol67;
        SimpleSymbol simpleSymbol303 = new SimpleSymbol("PositionChanged");
        Lit189 = (SimpleSymbol) simpleSymbol302.readResolve();
        SimpleSymbol simpleSymbol304 = simpleSymbol68;
        SimpleSymbol simpleSymbol305 = new SimpleSymbol("Slider1$PositionChanged");
        Lit188 = (SimpleSymbol) simpleSymbol304.readResolve();
        SimpleSymbol simpleSymbol306 = simpleSymbol69;
        SimpleSymbol simpleSymbol307 = new SimpleSymbol("ThumbPosition");
        Lit187 = (SimpleSymbol) simpleSymbol306.readResolve();
        FString fString271 = fString75;
        FString fString272 = new FString("com.google.appinventor.components.runtime.Slider");
        Lit186 = fString271;
        SimpleSymbol simpleSymbol308 = simpleSymbol70;
        SimpleSymbol simpleSymbol309 = new SimpleSymbol("MinValue");
        Lit185 = (SimpleSymbol) simpleSymbol308.readResolve();
        SimpleSymbol simpleSymbol310 = simpleSymbol71;
        SimpleSymbol simpleSymbol311 = new SimpleSymbol("Slider1");
        Lit184 = (SimpleSymbol) simpleSymbol310.readResolve();
        FString fString273 = fString76;
        FString fString274 = new FString("com.google.appinventor.components.runtime.Slider");
        Lit183 = fString273;
        FString fString275 = fString77;
        FString fString276 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit182 = fString275;
        SimpleSymbol simpleSymbol312 = simpleSymbol72;
        SimpleSymbol simpleSymbol313 = new SimpleSymbol("Space6");
        Lit181 = (SimpleSymbol) simpleSymbol312.readResolve();
        FString fString277 = fString78;
        FString fString278 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit180 = fString277;
        FString fString279 = fString79;
        FString fString280 = new FString("com.google.appinventor.components.runtime.Image");
        Lit179 = fString279;
        SimpleSymbol simpleSymbol314 = simpleSymbol73;
        SimpleSymbol simpleSymbol315 = new SimpleSymbol("Image3");
        Lit178 = (SimpleSymbol) simpleSymbol314.readResolve();
        FString fString281 = fString80;
        FString fString282 = new FString("com.google.appinventor.components.runtime.Image");
        Lit177 = fString281;
        FString fString283 = fString81;
        FString fString284 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit176 = fString283;
        SimpleSymbol simpleSymbol316 = simpleSymbol74;
        SimpleSymbol simpleSymbol317 = new SimpleSymbol("Space5");
        Lit174 = (SimpleSymbol) simpleSymbol316.readResolve();
        FString fString285 = fString82;
        FString fString286 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit173 = fString285;
        FString fString287 = fString83;
        FString fString288 = new FString("com.google.appinventor.components.runtime.VerticalScrollArrangement");
        Lit172 = fString287;
        FString fString289 = fString84;
        FString fString290 = new FString("com.google.appinventor.components.runtime.VerticalScrollArrangement");
        Lit170 = fString289;
        SimpleSymbol simpleSymbol318 = simpleSymbol75;
        SimpleSymbol simpleSymbol319 = new SimpleSymbol("back_sync$Click");
        Lit169 = (SimpleSymbol) simpleSymbol318.readResolve();
        FString fString291 = fString85;
        FString fString292 = new FString("com.google.appinventor.components.runtime.Button");
        Lit168 = fString291;
        SimpleSymbol simpleSymbol320 = simpleSymbol76;
        SimpleSymbol simpleSymbol321 = new SimpleSymbol("back_sync");
        Lit167 = (SimpleSymbol) simpleSymbol320.readResolve();
        FString fString293 = fString86;
        FString fString294 = new FString("com.google.appinventor.components.runtime.Button");
        Lit166 = fString293;
        FString fString295 = fString87;
        FString fString296 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit165 = fString295;
        SimpleSymbol simpleSymbol322 = simpleSymbol77;
        SimpleSymbol simpleSymbol323 = new SimpleSymbol("Space4");
        Lit164 = (SimpleSymbol) simpleSymbol322.readResolve();
        FString fString297 = fString88;
        FString fString298 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit163 = fString297;
        FString fString299 = fString89;
        FString fString300 = new FString("com.google.appinventor.components.runtime.Label");
        Lit162 = fString299;
        int[] iArr25 = new int[2];
        int[] iArr26 = iArr25;
        iArr25[0] = -1;
        Lit161 = IntNum.make(iArr26);
        SimpleSymbol simpleSymbol324 = simpleSymbol78;
        SimpleSymbol simpleSymbol325 = new SimpleSymbol("TextAlignment");
        Lit160 = (SimpleSymbol) simpleSymbol324.readResolve();
        SimpleSymbol simpleSymbol326 = simpleSymbol79;
        SimpleSymbol simpleSymbol327 = new SimpleSymbol("Label1");
        Lit158 = (SimpleSymbol) simpleSymbol326.readResolve();
        FString fString301 = fString90;
        FString fString302 = new FString("com.google.appinventor.components.runtime.Label");
        Lit157 = fString301;
        FString fString303 = fString91;
        FString fString304 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit156 = fString303;
        SimpleSymbol simpleSymbol328 = simpleSymbol80;
        SimpleSymbol simpleSymbol329 = new SimpleSymbol("Horizontal_Arrangement1");
        Lit153 = (SimpleSymbol) simpleSymbol328.readResolve();
        FString fString305 = fString92;
        FString fString306 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit152 = fString305;
        FString fString307 = fString93;
        FString fString308 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit151 = fString307;
        SimpleSymbol simpleSymbol330 = simpleSymbol81;
        SimpleSymbol simpleSymbol331 = new SimpleSymbol("Space3");
        Lit150 = (SimpleSymbol) simpleSymbol330.readResolve();
        FString fString309 = fString94;
        FString fString310 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit149 = fString309;
        SimpleSymbol simpleSymbol332 = simpleSymbol82;
        SimpleSymbol simpleSymbol333 = new SimpleSymbol("database$Click");
        Lit148 = (SimpleSymbol) simpleSymbol332.readResolve();
        SimpleSymbol simpleSymbol334 = simpleSymbol83;
        SimpleSymbol simpleSymbol335 = new SimpleSymbol("StoreValue");
        Lit144 = (SimpleSymbol) simpleSymbol334.readResolve();
        SimpleSymbol simpleSymbol336 = simpleSymbol84;
        SimpleSymbol simpleSymbol337 = new SimpleSymbol("ProjectBucket");
        Lit143 = (SimpleSymbol) simpleSymbol336.readResolve();
        SimpleSymbol simpleSymbol338 = simpleSymbol85;
        SimpleSymbol simpleSymbol339 = new SimpleSymbol("Firebase_Database1");
        Lit142 = (SimpleSymbol) simpleSymbol338.readResolve();
        SimpleSymbol simpleSymbol340 = simpleSymbol86;
        SimpleSymbol simpleSymbol341 = new SimpleSymbol("InstantInTime");
        Lit141 = PairWithPosition.make((SimpleSymbol) simpleSymbol340.readResolve(), PairWithPosition.make(Lit13, LList.Empty, "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 815282), "/tmp/1593676866568_0.39516722744565314-0/youngandroidproject/../src/io/kodular/m_27gurnameh99singh12/Smart_Water_Meter/Screen1.yail", 815267);
        SimpleSymbol simpleSymbol342 = simpleSymbol87;
        SimpleSymbol simpleSymbol343 = new SimpleSymbol("Now");
        Lit140 = (SimpleSymbol) simpleSymbol342.readResolve();
        SimpleSymbol simpleSymbol344 = simpleSymbol88;
        SimpleSymbol simpleSymbol345 = new SimpleSymbol("FormatDate");
        Lit139 = (SimpleSymbol) simpleSymbol344.readResolve();
        SimpleSymbol simpleSymbol346 = simpleSymbol89;
        SimpleSymbol simpleSymbol347 = new SimpleSymbol("Clock1");
        Lit138 = (SimpleSymbol) simpleSymbol346.readResolve();
        FString fString311 = fString95;
        FString fString312 = new FString("com.google.appinventor.components.runtime.Button");
        Lit137 = fString311;
        int[] iArr27 = new int[2];
        int[] iArr28 = iArr27;
        iArr27[0] = -2494070;
        Lit136 = IntNum.make(iArr28);
        SimpleSymbol simpleSymbol348 = simpleSymbol90;
        SimpleSymbol simpleSymbol349 = new SimpleSymbol("database");
        Lit133 = (SimpleSymbol) simpleSymbol348.readResolve();
        FString fString313 = fString96;
        FString fString314 = new FString("com.google.appinventor.components.runtime.Button");
        Lit132 = fString313;
        FString fString315 = fString97;
        FString fString316 = new FString("com.google.appinventor.components.runtime.Image");
        Lit131 = fString315;
        SimpleSymbol simpleSymbol350 = simpleSymbol91;
        SimpleSymbol simpleSymbol351 = new SimpleSymbol("Image2");
        Lit130 = (SimpleSymbol) simpleSymbol350.readResolve();
        FString fString317 = fString98;
        FString fString318 = new FString("com.google.appinventor.components.runtime.Image");
        Lit129 = fString317;
        FString fString319 = fString99;
        FString fString320 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit128 = fString319;
        SimpleSymbol simpleSymbol352 = simpleSymbol92;
        SimpleSymbol simpleSymbol353 = new SimpleSymbol("Space2");
        Lit126 = (SimpleSymbol) simpleSymbol352.readResolve();
        FString fString321 = fString100;
        FString fString322 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit125 = fString321;
        FString fString323 = fString101;
        FString fString324 = new FString("com.google.appinventor.components.runtime.VerticalScrollArrangement");
        Lit124 = fString323;
        FString fString325 = fString102;
        FString fString326 = new FString("com.google.appinventor.components.runtime.VerticalScrollArrangement");
        Lit122 = fString325;
        SimpleSymbol simpleSymbol354 = simpleSymbol93;
        SimpleSymbol simpleSymbol355 = new SimpleSymbol("back_website$Click");
        Lit121 = (SimpleSymbol) simpleSymbol354.readResolve();
        FString fString327 = fString103;
        FString fString328 = new FString("com.google.appinventor.components.runtime.Button");
        Lit120 = fString327;
        SimpleSymbol simpleSymbol356 = simpleSymbol94;
        SimpleSymbol simpleSymbol357 = new SimpleSymbol("Shape");
        Lit119 = (SimpleSymbol) simpleSymbol356.readResolve();
        SimpleSymbol simpleSymbol358 = simpleSymbol95;
        SimpleSymbol simpleSymbol359 = new SimpleSymbol("back_website");
        Lit117 = (SimpleSymbol) simpleSymbol358.readResolve();
        FString fString329 = fString104;
        FString fString330 = new FString("com.google.appinventor.components.runtime.Button");
        Lit116 = fString329;
        FString fString331 = fString105;
        FString fString332 = new FString("com.google.appinventor.components.runtime.WebViewer");
        Lit115 = fString331;
        SimpleSymbol simpleSymbol360 = simpleSymbol96;
        SimpleSymbol simpleSymbol361 = new SimpleSymbol("HomeUrl");
        Lit114 = (SimpleSymbol) simpleSymbol360.readResolve();
        SimpleSymbol simpleSymbol362 = simpleSymbol97;
        SimpleSymbol simpleSymbol363 = new SimpleSymbol("Web_Viewer1");
        Lit113 = (SimpleSymbol) simpleSymbol362.readResolve();
        FString fString333 = fString106;
        FString fString334 = new FString("com.google.appinventor.components.runtime.WebViewer");
        Lit112 = fString333;
        FString fString335 = fString107;
        FString fString336 = new FString("com.google.appinventor.components.runtime.VerticalScrollArrangement");
        Lit111 = fString335;
        FString fString337 = fString108;
        FString fString338 = new FString("com.google.appinventor.components.runtime.VerticalScrollArrangement");
        Lit109 = fString337;
        SimpleSymbol simpleSymbol364 = simpleSymbol98;
        SimpleSymbol simpleSymbol365 = new SimpleSymbol("TabItemSelected");
        Lit108 = (SimpleSymbol) simpleSymbol364.readResolve();
        SimpleSymbol simpleSymbol366 = simpleSymbol99;
        SimpleSymbol simpleSymbol367 = new SimpleSymbol("Tab_Layout1$TabItemSelected");
        Lit107 = (SimpleSymbol) simpleSymbol366.readResolve();
        SimpleSymbol simpleSymbol368 = simpleSymbol100;
        SimpleSymbol simpleSymbol369 = new SimpleSymbol("$position");
        Lit97 = (SimpleSymbol) simpleSymbol368.readResolve();
        FString fString339 = fString109;
        FString fString340 = new FString("com.google.appinventor.components.runtime.MakeroidTabLayout");
        Lit96 = fString339;
        FString fString341 = fString110;
        FString fString342 = new FString("com.google.appinventor.components.runtime.MakeroidTabLayout");
        Lit95 = fString341;
        FString fString343 = fString111;
        FString fString344 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit94 = fString343;
        SimpleSymbol simpleSymbol370 = simpleSymbol101;
        SimpleSymbol simpleSymbol371 = new SimpleSymbol("Space1_copy");
        Lit93 = (SimpleSymbol) simpleSymbol370.readResolve();
        FString fString345 = fString112;
        FString fString346 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit92 = fString345;
        SimpleSymbol simpleSymbol372 = simpleSymbol102;
        SimpleSymbol simpleSymbol373 = new SimpleSymbol("Click");
        Lit91 = (SimpleSymbol) simpleSymbol372.readResolve();
        SimpleSymbol simpleSymbol374 = simpleSymbol103;
        SimpleSymbol simpleSymbol375 = new SimpleSymbol("more$Click");
        Lit90 = (SimpleSymbol) simpleSymbol374.readResolve();
        SimpleSymbol simpleSymbol376 = simpleSymbol104;
        SimpleSymbol simpleSymbol377 = new SimpleSymbol("SelectTab");
        Lit89 = (SimpleSymbol) simpleSymbol376.readResolve();
        FString fString347 = fString113;
        FString fString348 = new FString("com.google.appinventor.components.runtime.Button");
        Lit88 = fString347;
        int[] iArr29 = new int[2];
        int[] iArr30 = iArr29;
        iArr29[0] = -2494070;
        Lit87 = IntNum.make(iArr30);
        SimpleSymbol simpleSymbol378 = simpleSymbol105;
        SimpleSymbol simpleSymbol379 = new SimpleSymbol("more");
        Lit85 = (SimpleSymbol) simpleSymbol378.readResolve();
        FString fString349 = fString114;
        FString fString350 = new FString("com.google.appinventor.components.runtime.Button");
        Lit84 = fString349;
        FString fString351 = fString115;
        FString fString352 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit83 = fString351;
        SimpleSymbol simpleSymbol380 = simpleSymbol106;
        SimpleSymbol simpleSymbol381 = new SimpleSymbol("Space1");
        Lit81 = (SimpleSymbol) simpleSymbol380.readResolve();
        FString fString353 = fString116;
        FString fString354 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit80 = fString353;
        SimpleSymbol simpleSymbol382 = simpleSymbol107;
        SimpleSymbol simpleSymbol383 = new SimpleSymbol("AfterPicking");
        Lit79 = (SimpleSymbol) simpleSymbol382.readResolve();
        SimpleSymbol simpleSymbol384 = simpleSymbol108;
        SimpleSymbol simpleSymbol385 = new SimpleSymbol("BtDevices$AfterPicking");
        Lit78 = (SimpleSymbol) simpleSymbol384.readResolve();
        SimpleSymbol simpleSymbol386 = simpleSymbol109;
        SimpleSymbol simpleSymbol387 = new SimpleSymbol("ShowAlert");
        Lit75 = (SimpleSymbol) simpleSymbol386.readResolve();
        SimpleSymbol simpleSymbol388 = simpleSymbol110;
        SimpleSymbol simpleSymbol389 = new SimpleSymbol("Notifier1");
        Lit74 = (SimpleSymbol) simpleSymbol388.readResolve();
        SimpleSymbol simpleSymbol390 = simpleSymbol111;
        SimpleSymbol simpleSymbol391 = new SimpleSymbol("Selection");
        Lit72 = (SimpleSymbol) simpleSymbol390.readResolve();
        SimpleSymbol simpleSymbol392 = simpleSymbol112;
        SimpleSymbol simpleSymbol393 = new SimpleSymbol("Connect");
        Lit71 = (SimpleSymbol) simpleSymbol392.readResolve();
        SimpleSymbol simpleSymbol394 = simpleSymbol113;
        SimpleSymbol simpleSymbol395 = new SimpleSymbol("BeforePicking");
        Lit70 = (SimpleSymbol) simpleSymbol394.readResolve();
        SimpleSymbol simpleSymbol396 = simpleSymbol114;
        SimpleSymbol simpleSymbol397 = new SimpleSymbol("BtDevices$BeforePicking");
        Lit69 = (SimpleSymbol) simpleSymbol396.readResolve();
        SimpleSymbol simpleSymbol398 = simpleSymbol115;
        SimpleSymbol simpleSymbol399 = new SimpleSymbol("AddressesAndNames");
        Lit67 = (SimpleSymbol) simpleSymbol398.readResolve();
        SimpleSymbol simpleSymbol400 = simpleSymbol116;
        SimpleSymbol simpleSymbol401 = new SimpleSymbol("Bluetooth_Client1");
        Lit66 = (SimpleSymbol) simpleSymbol400.readResolve();
        SimpleSymbol simpleSymbol402 = simpleSymbol117;
        SimpleSymbol simpleSymbol403 = new SimpleSymbol("Elements");
        Lit65 = (SimpleSymbol) simpleSymbol402.readResolve();
        FString fString355 = fString117;
        FString fString356 = new FString("com.google.appinventor.components.runtime.ListPicker");
        Lit64 = fString355;
        int[] iArr31 = new int[2];
        int[] iArr32 = iArr31;
        iArr31[0] = -2494070;
        Lit63 = IntNum.make(iArr32);
        SimpleSymbol simpleSymbol404 = simpleSymbol118;
        SimpleSymbol simpleSymbol405 = new SimpleSymbol("TextColor");
        Lit62 = (SimpleSymbol) simpleSymbol404.readResolve();
        SimpleSymbol simpleSymbol406 = simpleSymbol119;
        SimpleSymbol simpleSymbol407 = new SimpleSymbol("Text");
        Lit61 = (SimpleSymbol) simpleSymbol406.readResolve();
        int[] iArr33 = new int[2];
        int[] iArr34 = iArr33;
        iArr33[0] = -2494070;
        Lit60 = IntNum.make(iArr34);
        SimpleSymbol simpleSymbol408 = simpleSymbol120;
        SimpleSymbol simpleSymbol409 = new SimpleSymbol("ItemTextColor");
        Lit59 = (SimpleSymbol) simpleSymbol408.readResolve();
        SimpleSymbol simpleSymbol410 = simpleSymbol121;
        SimpleSymbol simpleSymbol411 = new SimpleSymbol("FontSize");
        Lit57 = (SimpleSymbol) simpleSymbol410.readResolve();
        SimpleSymbol simpleSymbol412 = simpleSymbol122;
        SimpleSymbol simpleSymbol413 = new SimpleSymbol("FontBold");
        Lit56 = (SimpleSymbol) simpleSymbol412.readResolve();
        SimpleSymbol simpleSymbol414 = simpleSymbol123;
        SimpleSymbol simpleSymbol415 = new SimpleSymbol("BtDevices");
        Lit54 = (SimpleSymbol) simpleSymbol414.readResolve();
        FString fString357 = fString118;
        FString fString358 = new FString("com.google.appinventor.components.runtime.ListPicker");
        Lit53 = fString357;
        FString fString359 = fString119;
        FString fString360 = new FString("com.google.appinventor.components.runtime.Image");
        Lit52 = fString359;
        SimpleSymbol simpleSymbol416 = simpleSymbol124;
        SimpleSymbol simpleSymbol417 = new SimpleSymbol("Picture");
        Lit51 = (SimpleSymbol) simpleSymbol416.readResolve();
        SimpleSymbol simpleSymbol418 = simpleSymbol125;
        SimpleSymbol simpleSymbol419 = new SimpleSymbol("Image1");
        Lit50 = (SimpleSymbol) simpleSymbol418.readResolve();
        FString fString361 = fString120;
        FString fString362 = new FString("com.google.appinventor.components.runtime.Image");
        Lit49 = fString361;
        FString fString363 = fString121;
        FString fString364 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit48 = fString363;
        SimpleSymbol simpleSymbol420 = simpleSymbol126;
        SimpleSymbol simpleSymbol421 = new SimpleSymbol("Width");
        Lit47 = (SimpleSymbol) simpleSymbol420.readResolve();
        SimpleSymbol simpleSymbol422 = simpleSymbol127;
        SimpleSymbol simpleSymbol423 = new SimpleSymbol("Height");
        Lit45 = (SimpleSymbol) simpleSymbol422.readResolve();
        SimpleSymbol simpleSymbol424 = simpleSymbol128;
        SimpleSymbol simpleSymbol425 = new SimpleSymbol("AlignHorizontal");
        Lit42 = (SimpleSymbol) simpleSymbol424.readResolve();
        SimpleSymbol simpleSymbol426 = simpleSymbol129;
        SimpleSymbol simpleSymbol427 = new SimpleSymbol("main_home");
        Lit41 = (SimpleSymbol) simpleSymbol426.readResolve();
        FString fString365 = fString122;
        FString fString366 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit40 = fString365;
        SimpleSymbol simpleSymbol428 = simpleSymbol130;
        SimpleSymbol simpleSymbol429 = new SimpleSymbol("Initialize");
        Lit39 = (SimpleSymbol) simpleSymbol428.readResolve();
        SimpleSymbol simpleSymbol430 = simpleSymbol131;
        SimpleSymbol simpleSymbol431 = new SimpleSymbol("Screen1$Initialize");
        Lit38 = (SimpleSymbol) simpleSymbol430.readResolve();
        SimpleSymbol simpleSymbol432 = simpleSymbol132;
        SimpleSymbol simpleSymbol433 = new SimpleSymbol("Sync");
        Lit37 = (SimpleSymbol) simpleSymbol432.readResolve();
        SimpleSymbol simpleSymbol434 = simpleSymbol133;
        SimpleSymbol simpleSymbol435 = new SimpleSymbol("VolumeWhole");
        Lit36 = (SimpleSymbol) simpleSymbol434.readResolve();
        SimpleSymbol simpleSymbol436 = simpleSymbol134;
        SimpleSymbol simpleSymbol437 = new SimpleSymbol("flow");
        Lit35 = (SimpleSymbol) simpleSymbol436.readResolve();
        SimpleSymbol simpleSymbol438 = simpleSymbol135;
        SimpleSymbol simpleSymbol439 = new SimpleSymbol("waterGoal");
        Lit34 = (SimpleSymbol) simpleSymbol438.readResolve();
        SimpleSymbol simpleSymbol440 = simpleSymbol136;
        SimpleSymbol simpleSymbol441 = new SimpleSymbol("Visible");
        Lit33 = (SimpleSymbol) simpleSymbol440.readResolve();
        SimpleSymbol simpleSymbol442 = simpleSymbol137;
        SimpleSymbol simpleSymbol443 = new SimpleSymbol("website");
        Lit32 = (SimpleSymbol) simpleSymbol442.readResolve();
        SimpleSymbol simpleSymbol444 = simpleSymbol138;
        SimpleSymbol simpleSymbol445 = new SimpleSymbol("AddNewTab");
        Lit26 = (SimpleSymbol) simpleSymbol444.readResolve();
        SimpleSymbol simpleSymbol446 = simpleSymbol139;
        SimpleSymbol simpleSymbol447 = new SimpleSymbol("Tab_Layout1");
        Lit25 = (SimpleSymbol) simpleSymbol446.readResolve();
        SimpleSymbol simpleSymbol448 = simpleSymbol140;
        SimpleSymbol simpleSymbol449 = new SimpleSymbol("TitleVisible");
        Lit24 = (SimpleSymbol) simpleSymbol448.readResolve();
        SimpleSymbol simpleSymbol450 = simpleSymbol141;
        SimpleSymbol simpleSymbol451 = new SimpleSymbol("Title");
        Lit23 = (SimpleSymbol) simpleSymbol450.readResolve();
        SimpleSymbol simpleSymbol452 = simpleSymbol142;
        SimpleSymbol simpleSymbol453 = new SimpleSymbol("Scrollable");
        Lit21 = (SimpleSymbol) simpleSymbol452.readResolve();
        SimpleSymbol simpleSymbol454 = simpleSymbol143;
        SimpleSymbol simpleSymbol455 = new SimpleSymbol("PackageName");
        Lit20 = (SimpleSymbol) simpleSymbol454.readResolve();
        SimpleSymbol simpleSymbol456 = simpleSymbol144;
        SimpleSymbol simpleSymbol457 = new SimpleSymbol("OpenScreenAnimation");
        Lit19 = (SimpleSymbol) simpleSymbol456.readResolve();
        SimpleSymbol simpleSymbol458 = simpleSymbol145;
        SimpleSymbol simpleSymbol459 = new SimpleSymbol("Icon");
        Lit18 = (SimpleSymbol) simpleSymbol458.readResolve();
        int[] iArr35 = new int[2];
        int[] iArr36 = iArr35;
        iArr35[0] = -14644753;
        Lit16 = IntNum.make(iArr36);
        SimpleSymbol simpleSymbol460 = simpleSymbol146;
        SimpleSymbol simpleSymbol461 = new SimpleSymbol("BackgroundColor");
        Lit15 = (SimpleSymbol) simpleSymbol460.readResolve();
        SimpleSymbol simpleSymbol462 = simpleSymbol147;
        SimpleSymbol simpleSymbol463 = new SimpleSymbol("AppName");
        Lit14 = (SimpleSymbol) simpleSymbol462.readResolve();
        SimpleSymbol simpleSymbol464 = simpleSymbol148;
        SimpleSymbol simpleSymbol465 = new SimpleSymbol("AppId");
        Lit12 = (SimpleSymbol) simpleSymbol464.readResolve();
        SimpleSymbol simpleSymbol466 = simpleSymbol149;
        SimpleSymbol simpleSymbol467 = new SimpleSymbol("g$volume");
        Lit11 = (SimpleSymbol) simpleSymbol466.readResolve();
        SimpleSymbol simpleSymbol468 = simpleSymbol150;
        SimpleSymbol simpleSymbol469 = new SimpleSymbol("g$rate");
        Lit10 = (SimpleSymbol) simpleSymbol468.readResolve();
        SimpleSymbol simpleSymbol470 = simpleSymbol151;
        SimpleSymbol simpleSymbol471 = new SimpleSymbol("g$waterMax");
        Lit8 = (SimpleSymbol) simpleSymbol470.readResolve();
        SimpleSymbol simpleSymbol472 = simpleSymbol152;
        SimpleSymbol simpleSymbol473 = new SimpleSymbol("g$avgFlow");
        Lit7 = (SimpleSymbol) simpleSymbol472.readResolve();
        SimpleSymbol simpleSymbol474 = simpleSymbol153;
        SimpleSymbol simpleSymbol475 = new SimpleSymbol("g$time");
        Lit5 = (SimpleSymbol) simpleSymbol474.readResolve();
        SimpleSymbol simpleSymbol476 = simpleSymbol154;
        SimpleSymbol simpleSymbol477 = new SimpleSymbol("g$data");
        Lit4 = (SimpleSymbol) simpleSymbol476.readResolve();
        SimpleSymbol simpleSymbol478 = simpleSymbol155;
        SimpleSymbol simpleSymbol479 = new SimpleSymbol("g$date");
        Lit3 = (SimpleSymbol) simpleSymbol478.readResolve();
        SimpleSymbol simpleSymbol480 = simpleSymbol156;
        SimpleSymbol simpleSymbol481 = new SimpleSymbol("*the-null-value*");
        Lit2 = (SimpleSymbol) simpleSymbol480.readResolve();
        SimpleSymbol simpleSymbol482 = simpleSymbol157;
        SimpleSymbol simpleSymbol483 = new SimpleSymbol("getMessage");
        Lit1 = (SimpleSymbol) simpleSymbol482.readResolve();
        SimpleSymbol simpleSymbol484 = simpleSymbol158;
        SimpleSymbol simpleSymbol485 = new SimpleSymbol("Screen1");
        Lit0 = (SimpleSymbol) simpleSymbol484.readResolve();
    }

    public Screen1() {
        ModuleMethod moduleMethod;
        frame frame2;
        ModuleMethod moduleMethod2;
        ModuleMethod moduleMethod3;
        ModuleMethod moduleMethod4;
        ModuleMethod moduleMethod5;
        ModuleMethod moduleMethod6;
        ModuleMethod moduleMethod7;
        ModuleMethod moduleMethod8;
        ModuleMethod moduleMethod9;
        ModuleMethod moduleMethod10;
        ModuleMethod moduleMethod11;
        ModuleMethod moduleMethod12;
        ModuleMethod moduleMethod13;
        ModuleMethod moduleMethod14;
        ModuleMethod moduleMethod15;
        ModuleMethod moduleMethod16;
        ModuleMethod moduleMethod17;
        ModuleMethod moduleMethod18;
        ModuleMethod moduleMethod19;
        ModuleMethod moduleMethod20;
        ModuleMethod moduleMethod21;
        ModuleMethod moduleMethod22;
        ModuleMethod moduleMethod23;
        ModuleMethod moduleMethod24;
        ModuleMethod moduleMethod25;
        ModuleMethod moduleMethod26;
        ModuleMethod moduleMethod27;
        ModuleMethod moduleMethod28;
        ModuleMethod moduleMethod29;
        ModuleMethod moduleMethod30;
        ModuleMethod moduleMethod31;
        ModuleMethod moduleMethod32;
        ModuleMethod moduleMethod33;
        ModuleMethod moduleMethod34;
        ModuleMethod moduleMethod35;
        ModuleMethod moduleMethod36;
        ModuleMethod moduleMethod37;
        ModuleMethod moduleMethod38;
        ModuleMethod moduleMethod39;
        ModuleMethod moduleMethod40;
        ModuleMethod moduleMethod41;
        ModuleMethod moduleMethod42;
        ModuleMethod moduleMethod43;
        ModuleMethod moduleMethod44;
        ModuleMethod moduleMethod45;
        ModuleMethod moduleMethod46;
        ModuleMethod moduleMethod47;
        ModuleMethod moduleMethod48;
        ModuleMethod moduleMethod49;
        ModuleMethod moduleMethod50;
        ModuleMethod moduleMethod51;
        ModuleMethod moduleMethod52;
        ModuleMethod moduleMethod53;
        ModuleMethod moduleMethod54;
        ModuleMethod moduleMethod55;
        ModuleMethod moduleMethod56;
        ModuleMethod moduleMethod57;
        ModuleMethod moduleMethod58;
        ModuleMethod moduleMethod59;
        ModuleMethod moduleMethod60;
        ModuleMethod moduleMethod61;
        ModuleMethod moduleMethod62;
        ModuleMethod moduleMethod63;
        ModuleMethod moduleMethod64;
        ModuleMethod moduleMethod65;
        ModuleMethod moduleMethod66;
        ModuleMethod moduleMethod67;
        ModuleMethod moduleMethod68;
        ModuleMethod moduleMethod69;
        ModuleMethod moduleMethod70;
        ModuleMethod moduleMethod71;
        ModuleMethod moduleMethod72;
        ModuleMethod moduleMethod73;
        ModuleMethod moduleMethod74;
        ModuleMethod moduleMethod75;
        ModuleMethod moduleMethod76;
        ModuleMethod moduleMethod77;
        ModuleMethod moduleMethod78;
        ModuleMethod moduleMethod79;
        ModuleMethod moduleMethod80;
        ModuleMethod moduleMethod81;
        ModuleMethod moduleMethod82;
        ModuleMethod moduleMethod83;
        ModuleMethod moduleMethod84;
        ModuleMethod moduleMethod85;
        ModuleMethod moduleMethod86;
        ModuleMethod moduleMethod87;
        ModuleMethod moduleMethod88;
        ModuleMethod moduleMethod89;
        ModuleMethod moduleMethod90;
        ModuleMethod moduleMethod91;
        ModuleMethod moduleMethod92;
        ModuleMethod moduleMethod93;
        ModuleMethod moduleMethod94;
        ModuleMethod moduleMethod95;
        ModuleMethod moduleMethod96;
        ModuleMethod moduleMethod97;
        ModuleMethod moduleMethod98;
        ModuleMethod moduleMethod99;
        ModuleMethod moduleMethod100;
        ModuleMethod moduleMethod101;
        ModuleMethod moduleMethod102;
        ModuleMethod moduleMethod103;
        ModuleMethod moduleMethod104;
        ModuleMethod moduleMethod105;
        ModuleMethod moduleMethod106;
        ModuleMethod moduleMethod107;
        ModuleMethod moduleMethod108;
        ModuleMethod moduleMethod109;
        ModuleMethod moduleMethod110;
        ModuleMethod moduleMethod111;
        ModuleMethod moduleMethod112;
        ModuleMethod moduleMethod113;
        ModuleMethod moduleMethod114;
        ModuleMethod moduleMethod115;
        ModuleMethod moduleMethod116;
        ModuleMethod moduleMethod117;
        ModuleMethod moduleMethod118;
        ModuleMethod moduleMethod119;
        ModuleMethod moduleMethod120;
        ModuleMethod moduleMethod121;
        ModuleMethod moduleMethod122;
        ModuleMethod moduleMethod123;
        ModuleMethod moduleMethod124;
        ModuleMethod moduleMethod125;
        ModuleMethod moduleMethod126;
        ModuleMethod moduleMethod127;
        ModuleMethod moduleMethod128;
        ModuleMethod moduleMethod129;
        ModuleMethod moduleMethod130;
        ModuleMethod moduleMethod131;
        ModuleMethod moduleMethod132;
        ModuleMethod moduleMethod133;
        ModuleMethod moduleMethod134;
        ModuleMethod moduleMethod135;
        ModuleMethod moduleMethod136;
        ModuleMethod moduleMethod137;
        ModuleMethod moduleMethod138;
        ModuleMethod moduleMethod139;
        ModuleMethod moduleMethod140;
        ModuleMethod moduleMethod141;
        ModuleMethod moduleMethod142;
        ModuleMethod moduleMethod143;
        ModuleMethod moduleMethod144;
        ModuleMethod moduleMethod145;
        ModuleMethod moduleMethod146;
        ModuleMethod moduleMethod147;
        ModuleMethod moduleMethod148;
        ModuleMethod moduleMethod149;
        ModuleMethod moduleMethod150;
        ModuleMethod moduleMethod151;
        ModuleMethod moduleMethod152;
        ModuleMethod moduleMethod153;
        ModuleMethod moduleMethod154;
        ModuleMethod moduleMethod155;
        ModuleMethod moduleMethod156;
        ModuleMethod moduleMethod157;
        ModuleMethod moduleMethod158;
        ModuleMethod moduleMethod159;
        ModuleInfo.register(this);
        ModuleMethod moduleMethod160 = moduleMethod;
        frame frame3 = frame2;
        frame frame4 = new frame();
        frame frame5 = frame3;
        frame frame6 = frame5;
        frame frame7 = frame6;
        ModuleMethod moduleMethod161 = new ModuleMethod(frame7, 1, Lit346, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.get$Mnsimple$Mnname = moduleMethod160;
        ModuleMethod moduleMethod162 = moduleMethod2;
        ModuleMethod moduleMethod163 = new ModuleMethod(frame7, 2, Lit347, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = moduleMethod162;
        ModuleMethod moduleMethod164 = moduleMethod3;
        ModuleMethod moduleMethod165 = new ModuleMethod(frame7, 3, Lit348, 8194);
        this.add$Mnto$Mnform$Mnenvironment = moduleMethod164;
        ModuleMethod moduleMethod166 = moduleMethod4;
        ModuleMethod moduleMethod167 = new ModuleMethod(frame7, 4, Lit349, 8193);
        this.lookup$Mnin$Mnform$Mnenvironment = moduleMethod166;
        ModuleMethod moduleMethod168 = moduleMethod5;
        ModuleMethod moduleMethod169 = new ModuleMethod(frame7, 6, Lit350, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = moduleMethod168;
        ModuleMethod moduleMethod170 = moduleMethod6;
        ModuleMethod moduleMethod171 = new ModuleMethod(frame7, 7, Lit351, 8194);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = moduleMethod170;
        ModuleMethod moduleMethod172 = moduleMethod7;
        ModuleMethod moduleMethod173 = new ModuleMethod(frame7, 8, Lit352, 8194);
        this.add$Mnto$Mnevents = moduleMethod172;
        ModuleMethod moduleMethod174 = moduleMethod8;
        ModuleMethod moduleMethod175 = new ModuleMethod(frame7, 9, Lit353, 16388);
        this.add$Mnto$Mncomponents = moduleMethod174;
        ModuleMethod moduleMethod176 = moduleMethod9;
        ModuleMethod moduleMethod177 = new ModuleMethod(frame7, 10, Lit354, 8194);
        this.add$Mnto$Mnglobal$Mnvars = moduleMethod176;
        ModuleMethod moduleMethod178 = moduleMethod10;
        ModuleMethod moduleMethod179 = new ModuleMethod(frame7, 11, Lit355, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = moduleMethod178;
        ModuleMethod moduleMethod180 = moduleMethod11;
        ModuleMethod moduleMethod181 = new ModuleMethod(frame7, 12, Lit356, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = moduleMethod180;
        ModuleMethod moduleMethod182 = moduleMethod12;
        ModuleMethod moduleMethod183 = new ModuleMethod(frame7, 13, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = moduleMethod182;
        ModuleMethod moduleMethod184 = moduleMethod13;
        ModuleMethod moduleMethod185 = new ModuleMethod(frame7, 14, Lit357, 16388);
        this.dispatchEvent = moduleMethod184;
        ModuleMethod moduleMethod186 = moduleMethod14;
        ModuleMethod moduleMethod187 = new ModuleMethod(frame7, 15, Lit358, 16388);
        this.dispatchGenericEvent = moduleMethod186;
        ModuleMethod moduleMethod188 = moduleMethod15;
        ModuleMethod moduleMethod189 = new ModuleMethod(frame7, 16, Lit359, 8194);
        this.lookup$Mnhandler = moduleMethod188;
        ModuleMethod moduleMethod190 = moduleMethod16;
        ModuleMethod moduleMethod191 = new ModuleMethod(frame7, 17, null, 0);
        ModuleMethod moduleMethod192 = moduleMethod190;
        ModuleMethod moduleMethod193 = moduleMethod192;
        moduleMethod192.setProperty("source-location", "/tmp/runtime5129600721992376814.scm:615");
        lambda$Fn1 = moduleMethod193;
        ModuleMethod moduleMethod194 = moduleMethod17;
        ModuleMethod moduleMethod195 = new ModuleMethod(frame7, 18, "$define", 0);
        this.$define = moduleMethod194;
        ModuleMethod moduleMethod196 = moduleMethod18;
        ModuleMethod moduleMethod197 = new ModuleMethod(frame7, 19, null, 0);
        lambda$Fn2 = moduleMethod196;
        ModuleMethod moduleMethod198 = moduleMethod19;
        ModuleMethod moduleMethod199 = new ModuleMethod(frame7, 20, null, 0);
        lambda$Fn3 = moduleMethod198;
        ModuleMethod moduleMethod200 = moduleMethod20;
        ModuleMethod moduleMethod201 = new ModuleMethod(frame7, 21, null, 0);
        lambda$Fn4 = moduleMethod200;
        ModuleMethod moduleMethod202 = moduleMethod21;
        ModuleMethod moduleMethod203 = new ModuleMethod(frame7, 22, null, 0);
        lambda$Fn5 = moduleMethod202;
        ModuleMethod moduleMethod204 = moduleMethod22;
        ModuleMethod moduleMethod205 = new ModuleMethod(frame7, 23, null, 0);
        lambda$Fn6 = moduleMethod204;
        ModuleMethod moduleMethod206 = moduleMethod23;
        ModuleMethod moduleMethod207 = new ModuleMethod(frame7, 24, null, 0);
        lambda$Fn7 = moduleMethod206;
        ModuleMethod moduleMethod208 = moduleMethod24;
        ModuleMethod moduleMethod209 = new ModuleMethod(frame7, 25, null, 0);
        lambda$Fn8 = moduleMethod208;
        ModuleMethod moduleMethod210 = moduleMethod25;
        ModuleMethod moduleMethod211 = new ModuleMethod(frame7, 26, null, 0);
        lambda$Fn9 = moduleMethod210;
        ModuleMethod moduleMethod212 = moduleMethod26;
        ModuleMethod moduleMethod213 = new ModuleMethod(frame7, 27, Lit38, 0);
        this.Screen1$Initialize = moduleMethod212;
        ModuleMethod moduleMethod214 = moduleMethod27;
        ModuleMethod moduleMethod215 = new ModuleMethod(frame7, 28, null, 0);
        lambda$Fn10 = moduleMethod214;
        ModuleMethod moduleMethod216 = moduleMethod28;
        ModuleMethod moduleMethod217 = new ModuleMethod(frame7, 29, null, 0);
        lambda$Fn11 = moduleMethod216;
        ModuleMethod moduleMethod218 = moduleMethod29;
        ModuleMethod moduleMethod219 = new ModuleMethod(frame7, 30, null, 0);
        lambda$Fn12 = moduleMethod218;
        ModuleMethod moduleMethod220 = moduleMethod30;
        ModuleMethod moduleMethod221 = new ModuleMethod(frame7, 31, null, 0);
        lambda$Fn13 = moduleMethod220;
        ModuleMethod moduleMethod222 = moduleMethod31;
        ModuleMethod moduleMethod223 = new ModuleMethod(frame7, 32, null, 0);
        lambda$Fn14 = moduleMethod222;
        ModuleMethod moduleMethod224 = moduleMethod32;
        ModuleMethod moduleMethod225 = new ModuleMethod(frame7, 33, null, 0);
        lambda$Fn15 = moduleMethod224;
        ModuleMethod moduleMethod226 = moduleMethod33;
        ModuleMethod moduleMethod227 = new ModuleMethod(frame7, 34, Lit69, 0);
        this.BtDevices$BeforePicking = moduleMethod226;
        ModuleMethod moduleMethod228 = moduleMethod34;
        ModuleMethod moduleMethod229 = new ModuleMethod(frame7, 35, Lit78, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.BtDevices$AfterPicking = moduleMethod228;
        ModuleMethod moduleMethod230 = moduleMethod35;
        ModuleMethod moduleMethod231 = new ModuleMethod(frame7, 36, null, 0);
        lambda$Fn16 = moduleMethod230;
        ModuleMethod moduleMethod232 = moduleMethod36;
        ModuleMethod moduleMethod233 = new ModuleMethod(frame7, 37, null, 0);
        lambda$Fn17 = moduleMethod232;
        ModuleMethod moduleMethod234 = moduleMethod37;
        ModuleMethod moduleMethod235 = new ModuleMethod(frame7, 38, null, 0);
        lambda$Fn18 = moduleMethod234;
        ModuleMethod moduleMethod236 = moduleMethod38;
        ModuleMethod moduleMethod237 = new ModuleMethod(frame7, 39, null, 0);
        lambda$Fn19 = moduleMethod236;
        ModuleMethod moduleMethod238 = moduleMethod39;
        ModuleMethod moduleMethod239 = new ModuleMethod(frame7, 40, Lit90, 0);
        this.more$Click = moduleMethod238;
        ModuleMethod moduleMethod240 = moduleMethod40;
        ModuleMethod moduleMethod241 = new ModuleMethod(frame7, 41, null, 0);
        lambda$Fn20 = moduleMethod240;
        ModuleMethod moduleMethod242 = moduleMethod41;
        ModuleMethod moduleMethod243 = new ModuleMethod(frame7, 42, null, 0);
        lambda$Fn21 = moduleMethod242;
        ModuleMethod moduleMethod244 = moduleMethod42;
        ModuleMethod moduleMethod245 = new ModuleMethod(frame7, 43, null, 0);
        lambda$Fn22 = moduleMethod244;
        ModuleMethod moduleMethod246 = moduleMethod43;
        ModuleMethod moduleMethod247 = new ModuleMethod(frame7, 44, null, 0);
        lambda$Fn23 = moduleMethod246;
        ModuleMethod moduleMethod248 = moduleMethod44;
        ModuleMethod moduleMethod249 = new ModuleMethod(frame7, 45, Lit107, 8194);
        this.Tab_Layout1$TabItemSelected = moduleMethod248;
        ModuleMethod moduleMethod250 = moduleMethod45;
        ModuleMethod moduleMethod251 = new ModuleMethod(frame7, 46, null, 0);
        lambda$Fn24 = moduleMethod250;
        ModuleMethod moduleMethod252 = moduleMethod46;
        ModuleMethod moduleMethod253 = new ModuleMethod(frame7, 47, null, 0);
        lambda$Fn25 = moduleMethod252;
        ModuleMethod moduleMethod254 = moduleMethod47;
        ModuleMethod moduleMethod255 = new ModuleMethod(frame7, 48, null, 0);
        lambda$Fn26 = moduleMethod254;
        ModuleMethod moduleMethod256 = moduleMethod48;
        ModuleMethod moduleMethod257 = new ModuleMethod(frame7, 49, null, 0);
        lambda$Fn27 = moduleMethod256;
        ModuleMethod moduleMethod258 = moduleMethod49;
        ModuleMethod moduleMethod259 = new ModuleMethod(frame7, 50, null, 0);
        lambda$Fn28 = moduleMethod258;
        ModuleMethod moduleMethod260 = moduleMethod50;
        ModuleMethod moduleMethod261 = new ModuleMethod(frame7, 51, null, 0);
        lambda$Fn29 = moduleMethod260;
        ModuleMethod moduleMethod262 = moduleMethod51;
        ModuleMethod moduleMethod263 = new ModuleMethod(frame7, 52, Lit121, 0);
        this.back_website$Click = moduleMethod262;
        ModuleMethod moduleMethod264 = moduleMethod52;
        ModuleMethod moduleMethod265 = new ModuleMethod(frame7, 53, null, 0);
        lambda$Fn30 = moduleMethod264;
        ModuleMethod moduleMethod266 = moduleMethod53;
        ModuleMethod moduleMethod267 = new ModuleMethod(frame7, 54, null, 0);
        lambda$Fn31 = moduleMethod266;
        ModuleMethod moduleMethod268 = moduleMethod54;
        ModuleMethod moduleMethod269 = new ModuleMethod(frame7, 55, null, 0);
        lambda$Fn32 = moduleMethod268;
        ModuleMethod moduleMethod270 = moduleMethod55;
        ModuleMethod moduleMethod271 = new ModuleMethod(frame7, 56, null, 0);
        lambda$Fn33 = moduleMethod270;
        ModuleMethod moduleMethod272 = moduleMethod56;
        ModuleMethod moduleMethod273 = new ModuleMethod(frame7, 57, null, 0);
        lambda$Fn34 = moduleMethod272;
        ModuleMethod moduleMethod274 = moduleMethod57;
        ModuleMethod moduleMethod275 = new ModuleMethod(frame7, 58, null, 0);
        lambda$Fn35 = moduleMethod274;
        ModuleMethod moduleMethod276 = moduleMethod58;
        ModuleMethod moduleMethod277 = new ModuleMethod(frame7, 59, null, 0);
        lambda$Fn36 = moduleMethod276;
        ModuleMethod moduleMethod278 = moduleMethod59;
        ModuleMethod moduleMethod279 = new ModuleMethod(frame7, 60, null, 0);
        lambda$Fn37 = moduleMethod278;
        ModuleMethod moduleMethod280 = moduleMethod60;
        ModuleMethod moduleMethod281 = new ModuleMethod(frame7, 61, Lit148, 0);
        this.database$Click = moduleMethod280;
        ModuleMethod moduleMethod282 = moduleMethod61;
        ModuleMethod moduleMethod283 = new ModuleMethod(frame7, 62, null, 0);
        lambda$Fn38 = moduleMethod282;
        ModuleMethod moduleMethod284 = moduleMethod62;
        ModuleMethod moduleMethod285 = new ModuleMethod(frame7, 63, null, 0);
        lambda$Fn39 = moduleMethod284;
        ModuleMethod moduleMethod286 = moduleMethod63;
        ModuleMethod moduleMethod287 = new ModuleMethod(frame7, 64, null, 0);
        lambda$Fn40 = moduleMethod286;
        ModuleMethod moduleMethod288 = moduleMethod64;
        ModuleMethod moduleMethod289 = new ModuleMethod(frame7, 65, null, 0);
        lambda$Fn41 = moduleMethod288;
        ModuleMethod moduleMethod290 = moduleMethod65;
        ModuleMethod moduleMethod291 = new ModuleMethod(frame7, 66, null, 0);
        lambda$Fn42 = moduleMethod290;
        ModuleMethod moduleMethod292 = moduleMethod66;
        ModuleMethod moduleMethod293 = new ModuleMethod(frame7, 67, null, 0);
        lambda$Fn43 = moduleMethod292;
        ModuleMethod moduleMethod294 = moduleMethod67;
        ModuleMethod moduleMethod295 = new ModuleMethod(frame7, 68, null, 0);
        lambda$Fn44 = moduleMethod294;
        ModuleMethod moduleMethod296 = moduleMethod68;
        ModuleMethod moduleMethod297 = new ModuleMethod(frame7, 69, null, 0);
        lambda$Fn45 = moduleMethod296;
        ModuleMethod moduleMethod298 = moduleMethod69;
        ModuleMethod moduleMethod299 = new ModuleMethod(frame7, 70, null, 0);
        lambda$Fn46 = moduleMethod298;
        ModuleMethod moduleMethod300 = moduleMethod70;
        ModuleMethod moduleMethod301 = new ModuleMethod(frame7, 71, null, 0);
        lambda$Fn47 = moduleMethod300;
        ModuleMethod moduleMethod302 = moduleMethod71;
        ModuleMethod moduleMethod303 = new ModuleMethod(frame7, 72, Lit169, 0);
        this.back_sync$Click = moduleMethod302;
        ModuleMethod moduleMethod304 = moduleMethod72;
        ModuleMethod moduleMethod305 = new ModuleMethod(frame7, 73, null, 0);
        lambda$Fn48 = moduleMethod304;
        ModuleMethod moduleMethod306 = moduleMethod73;
        ModuleMethod moduleMethod307 = new ModuleMethod(frame7, 74, null, 0);
        lambda$Fn49 = moduleMethod306;
        ModuleMethod moduleMethod308 = moduleMethod74;
        ModuleMethod moduleMethod309 = new ModuleMethod(frame7, 75, null, 0);
        lambda$Fn50 = moduleMethod308;
        ModuleMethod moduleMethod310 = moduleMethod75;
        ModuleMethod moduleMethod311 = new ModuleMethod(frame7, 76, null, 0);
        lambda$Fn51 = moduleMethod310;
        ModuleMethod moduleMethod312 = moduleMethod76;
        ModuleMethod moduleMethod313 = new ModuleMethod(frame7, 77, null, 0);
        lambda$Fn52 = moduleMethod312;
        ModuleMethod moduleMethod314 = moduleMethod77;
        ModuleMethod moduleMethod315 = new ModuleMethod(frame7, 78, null, 0);
        lambda$Fn53 = moduleMethod314;
        ModuleMethod moduleMethod316 = moduleMethod78;
        ModuleMethod moduleMethod317 = new ModuleMethod(frame7, 79, null, 0);
        lambda$Fn54 = moduleMethod316;
        ModuleMethod moduleMethod318 = moduleMethod79;
        ModuleMethod moduleMethod319 = new ModuleMethod(frame7, 80, null, 0);
        lambda$Fn55 = moduleMethod318;
        ModuleMethod moduleMethod320 = moduleMethod80;
        ModuleMethod moduleMethod321 = new ModuleMethod(frame7, 81, null, 0);
        lambda$Fn56 = moduleMethod320;
        ModuleMethod moduleMethod322 = moduleMethod81;
        ModuleMethod moduleMethod323 = new ModuleMethod(frame7, 82, null, 0);
        lambda$Fn57 = moduleMethod322;
        ModuleMethod moduleMethod324 = moduleMethod82;
        ModuleMethod moduleMethod325 = new ModuleMethod(frame7, 83, Lit188, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.Slider1$PositionChanged = moduleMethod324;
        ModuleMethod moduleMethod326 = moduleMethod83;
        ModuleMethod moduleMethod327 = new ModuleMethod(frame7, 84, null, 0);
        lambda$Fn58 = moduleMethod326;
        ModuleMethod moduleMethod328 = moduleMethod84;
        ModuleMethod moduleMethod329 = new ModuleMethod(frame7, 85, null, 0);
        lambda$Fn59 = moduleMethod328;
        ModuleMethod moduleMethod330 = moduleMethod85;
        ModuleMethod moduleMethod331 = new ModuleMethod(frame7, 86, null, 0);
        lambda$Fn60 = moduleMethod330;
        ModuleMethod moduleMethod332 = moduleMethod86;
        ModuleMethod moduleMethod333 = new ModuleMethod(frame7, 87, null, 0);
        lambda$Fn61 = moduleMethod332;
        ModuleMethod moduleMethod334 = moduleMethod87;
        ModuleMethod moduleMethod335 = new ModuleMethod(frame7, 88, null, 0);
        lambda$Fn62 = moduleMethod334;
        ModuleMethod moduleMethod336 = moduleMethod88;
        ModuleMethod moduleMethod337 = new ModuleMethod(frame7, 89, null, 0);
        lambda$Fn63 = moduleMethod336;
        ModuleMethod moduleMethod338 = moduleMethod89;
        ModuleMethod moduleMethod339 = new ModuleMethod(frame7, 90, null, 0);
        lambda$Fn64 = moduleMethod338;
        ModuleMethod moduleMethod340 = moduleMethod90;
        ModuleMethod moduleMethod341 = new ModuleMethod(frame7, 91, null, 0);
        lambda$Fn65 = moduleMethod340;
        ModuleMethod moduleMethod342 = moduleMethod91;
        ModuleMethod moduleMethod343 = new ModuleMethod(frame7, 92, null, 0);
        lambda$Fn66 = moduleMethod342;
        ModuleMethod moduleMethod344 = moduleMethod92;
        ModuleMethod moduleMethod345 = new ModuleMethod(frame7, 93, null, 0);
        lambda$Fn67 = moduleMethod344;
        ModuleMethod moduleMethod346 = moduleMethod93;
        ModuleMethod moduleMethod347 = new ModuleMethod(frame7, 94, null, 0);
        lambda$Fn68 = moduleMethod346;
        ModuleMethod moduleMethod348 = moduleMethod94;
        ModuleMethod moduleMethod349 = new ModuleMethod(frame7, 95, null, 0);
        lambda$Fn69 = moduleMethod348;
        ModuleMethod moduleMethod350 = moduleMethod95;
        ModuleMethod moduleMethod351 = new ModuleMethod(frame7, 96, Lit212, 0);
        this.back_waterGoal$Click = moduleMethod350;
        ModuleMethod moduleMethod352 = moduleMethod96;
        ModuleMethod moduleMethod353 = new ModuleMethod(frame7, 97, null, 0);
        lambda$Fn70 = moduleMethod352;
        ModuleMethod moduleMethod354 = moduleMethod97;
        ModuleMethod moduleMethod355 = new ModuleMethod(frame7, 98, null, 0);
        lambda$Fn71 = moduleMethod354;
        ModuleMethod moduleMethod356 = moduleMethod98;
        ModuleMethod moduleMethod357 = new ModuleMethod(frame7, 99, null, 0);
        lambda$Fn72 = moduleMethod356;
        ModuleMethod moduleMethod358 = moduleMethod99;
        ModuleMethod moduleMethod359 = new ModuleMethod(frame7, 100, null, 0);
        lambda$Fn73 = moduleMethod358;
        ModuleMethod moduleMethod360 = moduleMethod100;
        ModuleMethod moduleMethod361 = new ModuleMethod(frame7, 101, null, 0);
        lambda$Fn74 = moduleMethod360;
        ModuleMethod moduleMethod362 = moduleMethod101;
        ModuleMethod moduleMethod363 = new ModuleMethod(frame7, 102, null, 0);
        lambda$Fn75 = moduleMethod362;
        ModuleMethod moduleMethod364 = moduleMethod102;
        ModuleMethod moduleMethod365 = new ModuleMethod(frame7, 103, null, 0);
        lambda$Fn76 = moduleMethod364;
        ModuleMethod moduleMethod366 = moduleMethod103;
        ModuleMethod moduleMethod367 = new ModuleMethod(frame7, 104, null, 0);
        lambda$Fn77 = moduleMethod366;
        ModuleMethod moduleMethod368 = moduleMethod104;
        ModuleMethod moduleMethod369 = new ModuleMethod(frame7, 105, null, 0);
        lambda$Fn78 = moduleMethod368;
        ModuleMethod moduleMethod370 = moduleMethod105;
        ModuleMethod moduleMethod371 = new ModuleMethod(frame7, 106, null, 0);
        lambda$Fn79 = moduleMethod370;
        ModuleMethod moduleMethod372 = moduleMethod106;
        ModuleMethod moduleMethod373 = new ModuleMethod(frame7, 107, null, 0);
        lambda$Fn80 = moduleMethod372;
        ModuleMethod moduleMethod374 = moduleMethod107;
        ModuleMethod moduleMethod375 = new ModuleMethod(frame7, 108, null, 0);
        lambda$Fn81 = moduleMethod374;
        ModuleMethod moduleMethod376 = moduleMethod108;
        ModuleMethod moduleMethod377 = new ModuleMethod(frame7, 109, null, 0);
        lambda$Fn82 = moduleMethod376;
        ModuleMethod moduleMethod378 = moduleMethod109;
        ModuleMethod moduleMethod379 = new ModuleMethod(frame7, 110, null, 0);
        lambda$Fn83 = moduleMethod378;
        ModuleMethod moduleMethod380 = moduleMethod110;
        ModuleMethod moduleMethod381 = new ModuleMethod(frame7, 111, null, 0);
        lambda$Fn84 = moduleMethod380;
        ModuleMethod moduleMethod382 = moduleMethod111;
        ModuleMethod moduleMethod383 = new ModuleMethod(frame7, 112, null, 0);
        lambda$Fn85 = moduleMethod382;
        ModuleMethod moduleMethod384 = moduleMethod112;
        ModuleMethod moduleMethod385 = new ModuleMethod(frame7, 113, null, 0);
        lambda$Fn86 = moduleMethod384;
        ModuleMethod moduleMethod386 = moduleMethod113;
        ModuleMethod moduleMethod387 = new ModuleMethod(frame7, 114, null, 0);
        lambda$Fn87 = moduleMethod386;
        ModuleMethod moduleMethod388 = moduleMethod114;
        ModuleMethod moduleMethod389 = new ModuleMethod(frame7, 115, null, 0);
        lambda$Fn88 = moduleMethod388;
        ModuleMethod moduleMethod390 = moduleMethod115;
        ModuleMethod moduleMethod391 = new ModuleMethod(frame7, 116, null, 0);
        lambda$Fn89 = moduleMethod390;
        ModuleMethod moduleMethod392 = moduleMethod116;
        ModuleMethod moduleMethod393 = new ModuleMethod(frame7, 117, null, 0);
        lambda$Fn90 = moduleMethod392;
        ModuleMethod moduleMethod394 = moduleMethod117;
        ModuleMethod moduleMethod395 = new ModuleMethod(frame7, 118, null, 0);
        lambda$Fn91 = moduleMethod394;
        ModuleMethod moduleMethod396 = moduleMethod118;
        ModuleMethod moduleMethod397 = new ModuleMethod(frame7, 119, null, 0);
        lambda$Fn92 = moduleMethod396;
        ModuleMethod moduleMethod398 = moduleMethod119;
        ModuleMethod moduleMethod399 = new ModuleMethod(frame7, 120, null, 0);
        lambda$Fn93 = moduleMethod398;
        ModuleMethod moduleMethod400 = moduleMethod120;
        ModuleMethod moduleMethod401 = new ModuleMethod(frame7, 121, null, 0);
        lambda$Fn94 = moduleMethod400;
        ModuleMethod moduleMethod402 = moduleMethod121;
        ModuleMethod moduleMethod403 = new ModuleMethod(frame7, 122, null, 0);
        lambda$Fn95 = moduleMethod402;
        ModuleMethod moduleMethod404 = moduleMethod122;
        ModuleMethod moduleMethod405 = new ModuleMethod(frame7, 123, null, 0);
        lambda$Fn96 = moduleMethod404;
        ModuleMethod moduleMethod406 = moduleMethod123;
        ModuleMethod moduleMethod407 = new ModuleMethod(frame7, 124, null, 0);
        lambda$Fn97 = moduleMethod406;
        ModuleMethod moduleMethod408 = moduleMethod124;
        ModuleMethod moduleMethod409 = new ModuleMethod(frame7, 125, null, 0);
        lambda$Fn98 = moduleMethod408;
        ModuleMethod moduleMethod410 = moduleMethod125;
        ModuleMethod moduleMethod411 = new ModuleMethod(frame7, 126, null, 0);
        lambda$Fn99 = moduleMethod410;
        ModuleMethod moduleMethod412 = moduleMethod126;
        ModuleMethod moduleMethod413 = new ModuleMethod(frame7, 127, null, 0);
        lambda$Fn100 = moduleMethod412;
        ModuleMethod moduleMethod414 = moduleMethod127;
        ModuleMethod moduleMethod415 = new ModuleMethod(frame7, 128, null, 0);
        lambda$Fn101 = moduleMethod414;
        ModuleMethod moduleMethod416 = moduleMethod128;
        ModuleMethod moduleMethod417 = new ModuleMethod(frame7, 129, Lit271, 0);
        this.back_flow$Click = moduleMethod416;
        ModuleMethod moduleMethod418 = moduleMethod129;
        ModuleMethod moduleMethod419 = new ModuleMethod(frame7, 130, null, 0);
        lambda$Fn102 = moduleMethod418;
        ModuleMethod moduleMethod420 = moduleMethod130;
        ModuleMethod moduleMethod421 = new ModuleMethod(frame7, 131, null, 0);
        lambda$Fn103 = moduleMethod420;
        ModuleMethod moduleMethod422 = moduleMethod131;
        ModuleMethod moduleMethod423 = new ModuleMethod(frame7, 132, null, 0);
        lambda$Fn104 = moduleMethod422;
        ModuleMethod moduleMethod424 = moduleMethod132;
        ModuleMethod moduleMethod425 = new ModuleMethod(frame7, 133, null, 0);
        lambda$Fn105 = moduleMethod424;
        ModuleMethod moduleMethod426 = moduleMethod133;
        ModuleMethod moduleMethod427 = new ModuleMethod(frame7, 134, null, 0);
        lambda$Fn106 = moduleMethod426;
        ModuleMethod moduleMethod428 = moduleMethod134;
        ModuleMethod moduleMethod429 = new ModuleMethod(frame7, 135, null, 0);
        lambda$Fn107 = moduleMethod428;
        ModuleMethod moduleMethod430 = moduleMethod135;
        ModuleMethod moduleMethod431 = new ModuleMethod(frame7, 136, null, 0);
        lambda$Fn108 = moduleMethod430;
        ModuleMethod moduleMethod432 = moduleMethod136;
        ModuleMethod moduleMethod433 = new ModuleMethod(frame7, 137, null, 0);
        lambda$Fn109 = moduleMethod432;
        ModuleMethod moduleMethod434 = moduleMethod137;
        ModuleMethod moduleMethod435 = new ModuleMethod(frame7, 138, null, 0);
        lambda$Fn110 = moduleMethod434;
        ModuleMethod moduleMethod436 = moduleMethod138;
        ModuleMethod moduleMethod437 = new ModuleMethod(frame7, 139, null, 0);
        lambda$Fn111 = moduleMethod436;
        ModuleMethod moduleMethod438 = moduleMethod139;
        ModuleMethod moduleMethod439 = new ModuleMethod(frame7, 140, null, 0);
        lambda$Fn112 = moduleMethod438;
        ModuleMethod moduleMethod440 = moduleMethod140;
        ModuleMethod moduleMethod441 = new ModuleMethod(frame7, 141, null, 0);
        lambda$Fn113 = moduleMethod440;
        ModuleMethod moduleMethod442 = moduleMethod141;
        ModuleMethod moduleMethod443 = new ModuleMethod(frame7, 142, null, 0);
        lambda$Fn114 = moduleMethod442;
        ModuleMethod moduleMethod444 = moduleMethod142;
        ModuleMethod moduleMethod445 = new ModuleMethod(frame7, 143, null, 0);
        lambda$Fn115 = moduleMethod444;
        ModuleMethod moduleMethod446 = moduleMethod143;
        ModuleMethod moduleMethod447 = new ModuleMethod(frame7, 144, null, 0);
        lambda$Fn116 = moduleMethod446;
        ModuleMethod moduleMethod448 = moduleMethod144;
        ModuleMethod moduleMethod449 = new ModuleMethod(frame7, 145, null, 0);
        lambda$Fn117 = moduleMethod448;
        ModuleMethod moduleMethod450 = moduleMethod145;
        ModuleMethod moduleMethod451 = new ModuleMethod(frame7, 146, null, 0);
        lambda$Fn118 = moduleMethod450;
        ModuleMethod moduleMethod452 = moduleMethod146;
        ModuleMethod moduleMethod453 = new ModuleMethod(frame7, 147, null, 0);
        lambda$Fn119 = moduleMethod452;
        ModuleMethod moduleMethod454 = moduleMethod147;
        ModuleMethod moduleMethod455 = new ModuleMethod(frame7, 148, null, 0);
        lambda$Fn120 = moduleMethod454;
        ModuleMethod moduleMethod456 = moduleMethod148;
        ModuleMethod moduleMethod457 = new ModuleMethod(frame7, 149, null, 0);
        lambda$Fn121 = moduleMethod456;
        ModuleMethod moduleMethod458 = moduleMethod149;
        ModuleMethod moduleMethod459 = new ModuleMethod(frame7, 150, Lit307, 0);
        this.back_consumption$Click = moduleMethod458;
        ModuleMethod moduleMethod460 = moduleMethod150;
        ModuleMethod moduleMethod461 = new ModuleMethod(frame7, 151, null, 0);
        lambda$Fn122 = moduleMethod460;
        ModuleMethod moduleMethod462 = moduleMethod151;
        ModuleMethod moduleMethod463 = new ModuleMethod(frame7, 152, null, 0);
        lambda$Fn123 = moduleMethod462;
        ModuleMethod moduleMethod464 = moduleMethod152;
        ModuleMethod moduleMethod465 = new ModuleMethod(frame7, 153, null, 0);
        lambda$Fn124 = moduleMethod464;
        ModuleMethod moduleMethod466 = moduleMethod153;
        ModuleMethod moduleMethod467 = new ModuleMethod(frame7, 154, null, 0);
        lambda$Fn125 = moduleMethod466;
        ModuleMethod moduleMethod468 = moduleMethod154;
        ModuleMethod moduleMethod469 = new ModuleMethod(frame7, 155, null, 0);
        lambda$Fn126 = moduleMethod468;
        ModuleMethod moduleMethod470 = moduleMethod155;
        ModuleMethod moduleMethod471 = new ModuleMethod(frame7, 156, null, 0);
        lambda$Fn127 = moduleMethod470;
        ModuleMethod moduleMethod472 = moduleMethod156;
        ModuleMethod moduleMethod473 = new ModuleMethod(frame7, 157, Lit336, 0);
        this.Clock1$Timer = moduleMethod472;
        ModuleMethod moduleMethod474 = moduleMethod157;
        ModuleMethod moduleMethod475 = new ModuleMethod(frame7, 158, null, 0);
        lambda$Fn128 = moduleMethod474;
        ModuleMethod moduleMethod476 = moduleMethod158;
        ModuleMethod moduleMethod477 = new ModuleMethod(frame7, 159, null, 0);
        lambda$Fn129 = moduleMethod476;
        ModuleMethod moduleMethod478 = moduleMethod159;
        ModuleMethod moduleMethod479 = new ModuleMethod(frame7, ComponentConstants.TEXTBOX_PREFERRED_WIDTH, Lit345, 0);
        this.Clock2$Timer = moduleMethod478;
    }

    public Object lookupInFormEnvironment(Symbol symbol) {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    public void run() {
        Throwable th;
        CallContext instance = CallContext.getInstance();
        Consumer consumer = instance.consumer;
        instance.consumer = VoidConsumer.instance;
        try {
            run(instance);
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        ModuleBody.runCleanup(instance, th, consumer);
    }

    public final void run(CallContext callContext) {
        String obj;
        Promise promise;
        Consumer $result = callContext.consumer;
        C1218runtime.$instance.run();
        this.$Stdebug$Mnform$St = Boolean.FALSE;
        this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
        Object[] objArr = new Object[2];
        Object[] objArr2 = objArr;
        objArr[0] = misc.symbol$To$String(Lit0);
        Object[] objArr3 = objArr2;
        Object[] objArr4 = objArr3;
        objArr3[1] = "-global-vars";
        FString stringAppend = strings.stringAppend(objArr4);
        FString fString = stringAppend;
        if (stringAppend == null) {
            obj = null;
        } else {
            obj = fString.toString();
        }
        this.global$Mnvar$Mnenvironment = Environment.make(obj);
        Screen1 = null;
        this.form$Mnname$Mnsymbol = Lit0;
        this.events$Mnto$Mnregister = LList.Empty;
        this.components$Mnto$Mncreate = LList.Empty;
        this.global$Mnvars$Mnto$Mncreate = LList.Empty;
        this.form$Mndo$Mnafter$Mncreation = LList.Empty;
        C1218runtime.$instance.run();
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addGlobalVarToCurrentFormEnvironment(Lit3, ""), $result);
        } else {
            addToGlobalVars(Lit3, lambda$Fn2);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addGlobalVarToCurrentFormEnvironment(Lit4, C1218runtime.callYailPrimitive(C1218runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list")), $result);
        } else {
            addToGlobalVars(Lit4, lambda$Fn3);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addGlobalVarToCurrentFormEnvironment(Lit5, Lit6), $result);
        } else {
            addToGlobalVars(Lit5, lambda$Fn4);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addGlobalVarToCurrentFormEnvironment(Lit7, Lit6), $result);
        } else {
            addToGlobalVars(Lit7, lambda$Fn5);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addGlobalVarToCurrentFormEnvironment(Lit8, Lit9), $result);
        } else {
            addToGlobalVars(Lit8, lambda$Fn6);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addGlobalVarToCurrentFormEnvironment(Lit10, Lit6), $result);
        } else {
            addToGlobalVars(Lit10, lambda$Fn7);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addGlobalVarToCurrentFormEnvironment(Lit11, Lit6), $result);
        } else {
            addToGlobalVars(Lit11, lambda$Fn8);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit0, Lit12, "6455929199394816", Lit13);
            Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "SmartWaterMeter", Lit13);
            Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit0, Lit15, Lit16, Lit17);
            Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit0, Lit18, "save-water.png", Lit13);
            Object andCoerceProperty$Ex5 = C1218runtime.setAndCoerceProperty$Ex(Lit0, Lit19, "fade", Lit13);
            Object andCoerceProperty$Ex6 = C1218runtime.setAndCoerceProperty$Ex(Lit0, Lit20, "com.gurnameh99.android.system", Lit13);
            Object andCoerceProperty$Ex7 = C1218runtime.setAndCoerceProperty$Ex(Lit0, Lit21, Boolean.TRUE, Lit22);
            Object andCoerceProperty$Ex8 = C1218runtime.setAndCoerceProperty$Ex(Lit0, Lit23, "Screen1", Lit13);
            Values.writeValues(C1218runtime.setAndCoerceProperty$Ex(Lit0, Lit24, Boolean.FALSE, Lit22), $result);
        } else {
            Promise promise2 = promise;
            Promise promise3 = new Promise(lambda$Fn9);
            addToFormDoAfterCreation(promise2);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment = C1218runtime.addToCurrentFormEnvironment(Lit38, this.Screen1$Initialize);
        } else {
            addToFormEnvironment(Lit38, this.Screen1$Initialize);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1218runtime.$Stthis$Mnform$St, "Screen1", "Initialize");
        } else {
            addToEvents(Lit0, Lit39);
        }
        this.main_home = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit0, Lit40, Lit41, lambda$Fn10), $result);
        } else {
            addToComponents(Lit0, Lit48, Lit41, lambda$Fn11);
        }
        this.Image1 = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit41, Lit49, Lit50, lambda$Fn12), $result);
        } else {
            addToComponents(Lit41, Lit52, Lit50, lambda$Fn13);
        }
        this.BtDevices = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit41, Lit53, Lit54, lambda$Fn14), $result);
        } else {
            addToComponents(Lit41, Lit64, Lit54, lambda$Fn15);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment2 = C1218runtime.addToCurrentFormEnvironment(Lit69, this.BtDevices$BeforePicking);
        } else {
            addToFormEnvironment(Lit69, this.BtDevices$BeforePicking);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1218runtime.$Stthis$Mnform$St, "BtDevices", "BeforePicking");
        } else {
            addToEvents(Lit54, Lit70);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment3 = C1218runtime.addToCurrentFormEnvironment(Lit78, this.BtDevices$AfterPicking);
        } else {
            addToFormEnvironment(Lit78, this.BtDevices$AfterPicking);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1218runtime.$Stthis$Mnform$St, "BtDevices", "AfterPicking");
        } else {
            addToEvents(Lit54, Lit79);
        }
        this.Space1 = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit41, Lit80, Lit81, lambda$Fn16), $result);
        } else {
            addToComponents(Lit41, Lit83, Lit81, lambda$Fn17);
        }
        this.more = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit41, Lit84, Lit85, lambda$Fn18), $result);
        } else {
            addToComponents(Lit41, Lit88, Lit85, lambda$Fn19);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment4 = C1218runtime.addToCurrentFormEnvironment(Lit90, this.more$Click);
        } else {
            addToFormEnvironment(Lit90, this.more$Click);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1218runtime.$Stthis$Mnform$St, "more", "Click");
        } else {
            addToEvents(Lit85, Lit91);
        }
        this.Space1_copy = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit41, Lit92, Lit93, lambda$Fn20), $result);
        } else {
            addToComponents(Lit41, Lit94, Lit93, lambda$Fn21);
        }
        this.Tab_Layout1 = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit0, Lit95, Lit25, lambda$Fn22), $result);
        } else {
            addToComponents(Lit0, Lit96, Lit25, lambda$Fn23);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment5 = C1218runtime.addToCurrentFormEnvironment(Lit107, this.Tab_Layout1$TabItemSelected);
        } else {
            addToFormEnvironment(Lit107, this.Tab_Layout1$TabItemSelected);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1218runtime.$Stthis$Mnform$St, "Tab_Layout1", "TabItemSelected");
        } else {
            addToEvents(Lit25, Lit108);
        }
        this.website = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit0, Lit109, Lit32, lambda$Fn24), $result);
        } else {
            addToComponents(Lit0, Lit111, Lit32, lambda$Fn25);
        }
        this.Web_Viewer1 = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit32, Lit112, Lit113, lambda$Fn26), $result);
        } else {
            addToComponents(Lit32, Lit115, Lit113, lambda$Fn27);
        }
        this.back_website = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit32, Lit116, Lit117, lambda$Fn28), $result);
        } else {
            addToComponents(Lit32, Lit120, Lit117, lambda$Fn29);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment6 = C1218runtime.addToCurrentFormEnvironment(Lit121, this.back_website$Click);
        } else {
            addToFormEnvironment(Lit121, this.back_website$Click);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1218runtime.$Stthis$Mnform$St, "back_website", "Click");
        } else {
            addToEvents(Lit117, Lit91);
        }
        this.Sync = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit0, Lit122, Lit37, lambda$Fn30), $result);
        } else {
            addToComponents(Lit0, Lit124, Lit37, lambda$Fn31);
        }
        this.Space2 = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit37, Lit125, Lit126, lambda$Fn32), $result);
        } else {
            addToComponents(Lit37, Lit128, Lit126, lambda$Fn33);
        }
        this.Image2 = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit37, Lit129, Lit130, lambda$Fn34), $result);
        } else {
            addToComponents(Lit37, Lit131, Lit130, lambda$Fn35);
        }
        this.database = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit37, Lit132, Lit133, lambda$Fn36), $result);
        } else {
            addToComponents(Lit37, Lit137, Lit133, lambda$Fn37);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment7 = C1218runtime.addToCurrentFormEnvironment(Lit148, this.database$Click);
        } else {
            addToFormEnvironment(Lit148, this.database$Click);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1218runtime.$Stthis$Mnform$St, "database", "Click");
        } else {
            addToEvents(Lit133, Lit91);
        }
        this.Space3 = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit37, Lit149, Lit150, lambda$Fn38), $result);
        } else {
            addToComponents(Lit37, Lit151, Lit150, lambda$Fn39);
        }
        this.Horizontal_Arrangement1 = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit37, Lit152, Lit153, lambda$Fn40), $result);
        } else {
            addToComponents(Lit37, Lit156, Lit153, lambda$Fn41);
        }
        this.Label1 = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit153, Lit157, Lit158, lambda$Fn42), $result);
        } else {
            addToComponents(Lit153, Lit162, Lit158, lambda$Fn43);
        }
        this.Space4 = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit37, Lit163, Lit164, lambda$Fn44), $result);
        } else {
            addToComponents(Lit37, Lit165, Lit164, lambda$Fn45);
        }
        this.back_sync = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit37, Lit166, Lit167, lambda$Fn46), $result);
        } else {
            addToComponents(Lit37, Lit168, Lit167, lambda$Fn47);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment8 = C1218runtime.addToCurrentFormEnvironment(Lit169, this.back_sync$Click);
        } else {
            addToFormEnvironment(Lit169, this.back_sync$Click);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1218runtime.$Stthis$Mnform$St, "back_sync", "Click");
        } else {
            addToEvents(Lit167, Lit91);
        }
        this.waterGoal = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit0, Lit170, Lit34, lambda$Fn48), $result);
        } else {
            addToComponents(Lit0, Lit172, Lit34, lambda$Fn49);
        }
        this.Space5 = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit34, Lit173, Lit174, lambda$Fn50), $result);
        } else {
            addToComponents(Lit34, Lit176, Lit174, lambda$Fn51);
        }
        this.Image3 = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit34, Lit177, Lit178, lambda$Fn52), $result);
        } else {
            addToComponents(Lit34, Lit179, Lit178, lambda$Fn53);
        }
        this.Space6 = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit34, Lit180, Lit181, lambda$Fn54), $result);
        } else {
            addToComponents(Lit34, Lit182, Lit181, lambda$Fn55);
        }
        this.Slider1 = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit34, Lit183, Lit184, lambda$Fn56), $result);
        } else {
            addToComponents(Lit34, Lit186, Lit184, lambda$Fn57);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment9 = C1218runtime.addToCurrentFormEnvironment(Lit188, this.Slider1$PositionChanged);
        } else {
            addToFormEnvironment(Lit188, this.Slider1$PositionChanged);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1218runtime.$Stthis$Mnform$St, "Slider1", "PositionChanged");
        } else {
            addToEvents(Lit184, Lit189);
        }
        this.Horizontal_Arrangement2 = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit34, Lit190, Lit191, lambda$Fn58), $result);
        } else {
            addToComponents(Lit34, Lit193, Lit191, lambda$Fn59);
        }
        this.Label2_copy = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit191, Lit194, Lit195, lambda$Fn60), $result);
        } else {
            addToComponents(Lit191, Lit197, Lit195, lambda$Fn61);
        }
        this.WaterGoal = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit191, Lit198, Lit199, lambda$Fn62), $result);
        } else {
            addToComponents(Lit191, Lit201, Lit199, lambda$Fn63);
        }
        this.Label4 = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit191, Lit202, Lit203, lambda$Fn64), $result);
        } else {
            addToComponents(Lit191, Lit205, Lit203, lambda$Fn65);
        }
        this.Space6_copy = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit34, Lit206, Lit207, lambda$Fn66), $result);
        } else {
            addToComponents(Lit34, Lit208, Lit207, lambda$Fn67);
        }
        this.back_waterGoal = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit34, Lit209, Lit210, lambda$Fn68), $result);
        } else {
            addToComponents(Lit34, Lit211, Lit210, lambda$Fn69);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment10 = C1218runtime.addToCurrentFormEnvironment(Lit212, this.back_waterGoal$Click);
        } else {
            addToFormEnvironment(Lit212, this.back_waterGoal$Click);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1218runtime.$Stthis$Mnform$St, "back_waterGoal", "Click");
        } else {
            addToEvents(Lit210, Lit91);
        }
        this.flow = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit0, Lit213, Lit35, lambda$Fn70), $result);
        } else {
            addToComponents(Lit0, Lit215, Lit35, lambda$Fn71);
        }
        this.Space7 = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit35, Lit216, Lit217, lambda$Fn72), $result);
        } else {
            addToComponents(Lit35, Lit218, Lit217, lambda$Fn73);
        }
        this.Horizontal_Arrangement3 = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit35, Lit219, Lit220, lambda$Fn74), $result);
        } else {
            addToComponents(Lit35, Lit223, Lit220, lambda$Fn75);
        }
        this.Image4 = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit220, Lit224, Lit225, lambda$Fn76), $result);
        } else {
            addToComponents(Lit220, Lit226, Lit225, lambda$Fn77);
        }
        this.Label2 = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit220, Lit227, Lit228, lambda$Fn78), $result);
        } else {
            addToComponents(Lit220, Lit230, Lit228, lambda$Fn79);
        }
        this.FlowRate = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit220, Lit231, Lit232, lambda$Fn80), $result);
        } else {
            addToComponents(Lit220, Lit234, Lit232, lambda$Fn81);
        }
        this.Label2_copy1 = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit220, Lit235, Lit236, lambda$Fn82), $result);
        } else {
            addToComponents(Lit220, Lit238, Lit236, lambda$Fn83);
        }
        this.Space7_copy = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit35, Lit239, Lit240, lambda$Fn84), $result);
        } else {
            addToComponents(Lit35, Lit241, Lit240, lambda$Fn85);
        }
        this.Horizontal_Arrangement3_copy = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit35, Lit242, Lit243, lambda$Fn86), $result);
        } else {
            addToComponents(Lit35, Lit245, Lit243, lambda$Fn87);
        }
        this.Image4_copy = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit243, Lit246, Lit247, lambda$Fn88), $result);
        } else {
            addToComponents(Lit243, Lit248, Lit247, lambda$Fn89);
        }
        this.Label2_copy2_copy = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit243, Lit249, Lit250, lambda$Fn90), $result);
        } else {
            addToComponents(Lit243, Lit252, Lit250, lambda$Fn91);
        }
        this.AvgRate = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit243, Lit253, Lit254, lambda$Fn92), $result);
        } else {
            addToComponents(Lit243, Lit256, Lit254, lambda$Fn93);
        }
        this.Label2_copy1_copy = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit243, Lit257, Lit258, lambda$Fn94), $result);
        } else {
            addToComponents(Lit243, Lit260, Lit258, lambda$Fn95);
        }
        this.Space7_copy_copy = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit35, Lit261, Lit262, lambda$Fn96), $result);
        } else {
            addToComponents(Lit35, Lit264, Lit262, lambda$Fn97);
        }
        this.Web_Viewer2 = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit35, Lit265, Lit266, lambda$Fn98), $result);
        } else {
            addToComponents(Lit35, Lit267, Lit266, lambda$Fn99);
        }
        this.back_flow = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit35, Lit268, Lit269, lambda$Fn100), $result);
        } else {
            addToComponents(Lit35, Lit270, Lit269, lambda$Fn101);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment11 = C1218runtime.addToCurrentFormEnvironment(Lit271, this.back_flow$Click);
        } else {
            addToFormEnvironment(Lit271, this.back_flow$Click);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1218runtime.$Stthis$Mnform$St, "back_flow", "Click");
        } else {
            addToEvents(Lit269, Lit91);
        }
        this.VolumeWhole = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit0, Lit272, Lit36, lambda$Fn102), $result);
        } else {
            addToComponents(Lit0, Lit274, Lit36, lambda$Fn103);
        }
        this.Space8 = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit36, Lit275, Lit276, lambda$Fn104), $result);
        } else {
            addToComponents(Lit36, Lit277, Lit276, lambda$Fn105);
        }
        this.Horizontal_Arrangement4 = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit36, Lit278, Lit279, lambda$Fn106), $result);
        } else {
            addToComponents(Lit36, Lit281, Lit279, lambda$Fn107);
        }
        this.Image5 = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit279, Lit282, Lit283, lambda$Fn108), $result);
        } else {
            addToComponents(Lit279, Lit284, Lit283, lambda$Fn109);
        }
        this.Label2_copy2 = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit279, Lit285, Lit286, lambda$Fn110), $result);
        } else {
            addToComponents(Lit279, Lit288, Lit286, lambda$Fn111);
        }
        this.volume = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit279, Lit289, Lit290, lambda$Fn112), $result);
        } else {
            addToComponents(Lit279, Lit292, Lit290, lambda$Fn113);
        }
        this.Label2_copy1_copy_copy = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit279, Lit293, Lit294, lambda$Fn114), $result);
        } else {
            addToComponents(Lit279, Lit296, Lit294, lambda$Fn115);
        }
        this.Space8_copy = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit36, Lit297, Lit298, lambda$Fn116), $result);
        } else {
            addToComponents(Lit36, Lit300, Lit298, lambda$Fn117);
        }
        this.Web_Viewer3 = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit36, Lit301, Lit302, lambda$Fn118), $result);
        } else {
            addToComponents(Lit36, Lit303, Lit302, lambda$Fn119);
        }
        this.back_consumption = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit36, Lit304, Lit305, lambda$Fn120), $result);
        } else {
            addToComponents(Lit36, Lit306, Lit305, lambda$Fn121);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment12 = C1218runtime.addToCurrentFormEnvironment(Lit307, this.back_consumption$Click);
        } else {
            addToFormEnvironment(Lit307, this.back_consumption$Click);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1218runtime.$Stthis$Mnform$St, "back_consumption", "Click");
        } else {
            addToEvents(Lit305, Lit91);
        }
        this.Bluetooth_Client1 = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit0, Lit308, Lit66, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit309, Lit66, Boolean.FALSE);
        }
        this.Notifier1 = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit0, Lit310, Lit74, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit311, Lit74, Boolean.FALSE);
        }
        this.Firebase_Database1 = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit0, Lit312, Lit142, lambda$Fn122), $result);
        } else {
            addToComponents(Lit0, Lit317, Lit142, lambda$Fn123);
        }
        this.Clock1 = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit0, Lit318, Lit138, lambda$Fn124), $result);
        } else {
            addToComponents(Lit0, Lit321, Lit138, lambda$Fn125);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment13 = C1218runtime.addToCurrentFormEnvironment(Lit336, this.Clock1$Timer);
        } else {
            addToFormEnvironment(Lit336, this.Clock1$Timer);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1218runtime.$Stthis$Mnform$St, "Clock1", "Timer");
        } else {
            addToEvents(Lit138, Lit337);
        }
        this.Clock2 = null;
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1218runtime.addComponentWithinRepl(Lit0, Lit338, Lit339, lambda$Fn128), $result);
        } else {
            addToComponents(Lit0, Lit341, Lit339, lambda$Fn129);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment14 = C1218runtime.addToCurrentFormEnvironment(Lit345, this.Clock2$Timer);
        } else {
            addToFormEnvironment(Lit345, this.Clock2$Timer);
        }
        if (C1218runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1218runtime.$Stthis$Mnform$St, "Clock2", "Timer");
        } else {
            addToEvents(Lit339, Lit337);
        }
        C1218runtime.initRuntime();
    }

    static String lambda3() {
        return "";
    }

    static Object lambda4() {
        return C1218runtime.callYailPrimitive(C1218runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list");
    }

    static IntNum lambda5() {
        return Lit6;
    }

    static IntNum lambda6() {
        return Lit6;
    }

    static DFloNum lambda7() {
        return Lit9;
    }

    static IntNum lambda8() {
        return Lit6;
    }

    static IntNum lambda9() {
        return Lit6;
    }

    static Object lambda10() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit0, Lit12, "6455929199394816", Lit13);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "SmartWaterMeter", Lit13);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit0, Lit15, Lit16, Lit17);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit0, Lit18, "save-water.png", Lit13);
        Object andCoerceProperty$Ex5 = C1218runtime.setAndCoerceProperty$Ex(Lit0, Lit19, "fade", Lit13);
        Object andCoerceProperty$Ex6 = C1218runtime.setAndCoerceProperty$Ex(Lit0, Lit20, "com.gurnameh99.android.system", Lit13);
        Object andCoerceProperty$Ex7 = C1218runtime.setAndCoerceProperty$Ex(Lit0, Lit21, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex8 = C1218runtime.setAndCoerceProperty$Ex(Lit0, Lit23, "Screen1", Lit13);
        return C1218runtime.setAndCoerceProperty$Ex(Lit0, Lit24, Boolean.FALSE, Lit22);
    }

    public Object Screen1$Initialize() {
        C1218runtime.setThisForm();
        Object callComponentMethod = C1218runtime.callComponentMethod(Lit25, Lit26, LList.list2("Goal", "waterGoal.png"), Lit27);
        Object callComponentMethod2 = C1218runtime.callComponentMethod(Lit25, Lit26, LList.list2("Flow", "waterFlow.png"), Lit28);
        Object callComponentMethod3 = C1218runtime.callComponentMethod(Lit25, Lit26, LList.list2("Consumption", "volumeCo.png"), Lit29);
        Object callComponentMethod4 = C1218runtime.callComponentMethod(Lit25, Lit26, LList.list2("Sync", "sync.png"), Lit30);
        Object callComponentMethod5 = C1218runtime.callComponentMethod(Lit25, Lit26, LList.list2("Visualise", "graph.png"), Lit31);
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit32, Lit33, Boolean.FALSE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit34, Lit33, Boolean.FALSE, Lit22);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit35, Lit33, Boolean.FALSE, Lit22);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit36, Lit33, Boolean.FALSE, Lit22);
        return C1218runtime.setAndCoerceProperty$Ex(Lit37, Lit33, Boolean.FALSE, Lit22);
    }

    static Object lambda11() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit41, Lit42, Lit43, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit41, Lit15, Lit44, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit41, Lit45, Lit46, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit41, Lit47, Lit46, Lit17);
    }

    static Object lambda12() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit41, Lit42, Lit43, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit41, Lit15, Lit44, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit41, Lit45, Lit46, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit41, Lit47, Lit46, Lit17);
    }

    static Object lambda13() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit50, Lit45, Lit46, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit50, Lit47, Lit46, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit50, Lit51, "Annotation_2020-06-23_115331.png", Lit13);
    }

    static Object lambda14() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit50, Lit45, Lit46, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit50, Lit47, Lit46, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit50, Lit51, "Annotation_2020-06-23_115331.png", Lit13);
    }

    static Object lambda15() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit54, Lit15, Lit55, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit54, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit54, Lit57, Lit58, Lit17);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit54, Lit59, Lit60, Lit17);
        Object andCoerceProperty$Ex5 = C1218runtime.setAndCoerceProperty$Ex(Lit54, Lit61, "Connect", Lit13);
        return C1218runtime.setAndCoerceProperty$Ex(Lit54, Lit62, Lit63, Lit17);
    }

    static Object lambda16() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit54, Lit15, Lit55, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit54, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit54, Lit57, Lit58, Lit17);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit54, Lit59, Lit60, Lit17);
        Object andCoerceProperty$Ex5 = C1218runtime.setAndCoerceProperty$Ex(Lit54, Lit61, "Connect", Lit13);
        return C1218runtime.setAndCoerceProperty$Ex(Lit54, Lit62, Lit63, Lit17);
    }

    public Object BtDevices$BeforePicking() {
        C1218runtime.setThisForm();
        return C1218runtime.setAndCoerceProperty$Ex(Lit54, Lit65, C1218runtime.get$Mnproperty.apply2(Lit66, Lit67), Lit68);
    }

    public Object BtDevices$AfterPicking(Object obj) {
        Object sanitizeComponentData = C1218runtime.sanitizeComponentData(obj);
        C1218runtime.setThisForm();
        return C1218runtime.callComponentMethod(Lit66, Lit71, LList.list1(C1218runtime.get$Mnproperty.apply2(Lit54, Lit72)), Lit73) != Boolean.FALSE ? C1218runtime.callComponentMethod(Lit74, Lit75, LList.list1(C1218runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("You are Successfully connected to", C1218runtime.get$Mnproperty.apply2(Lit54, Lit72)), Lit76, "join")), Lit77) : Values.empty;
    }

    static Object lambda17() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit81, Lit45, Lit82, Lit17);
    }

    static Object lambda18() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit81, Lit45, Lit82, Lit17);
    }

    static Object lambda19() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit85, Lit15, Lit86, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit85, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit85, Lit57, Lit58, Lit17);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit85, Lit61, "More", Lit13);
        return C1218runtime.setAndCoerceProperty$Ex(Lit85, Lit62, Lit87, Lit17);
    }

    static Object lambda20() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit85, Lit15, Lit86, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit85, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit85, Lit57, Lit58, Lit17);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit85, Lit61, "More", Lit13);
        return C1218runtime.setAndCoerceProperty$Ex(Lit85, Lit62, Lit87, Lit17);
    }

    public Object more$Click() {
        C1218runtime.setThisForm();
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit25, Lit33, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit41, Lit33, Boolean.FALSE, Lit22);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit25, Lit89, Lit6, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit34, Lit33, Boolean.TRUE, Lit22);
    }

    static Object lambda21() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit93, Lit45, Lit82, Lit17);
    }

    static Object lambda22() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit93, Lit45, Lit82, Lit17);
    }

    static Object lambda23() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit25, Lit33, Boolean.FALSE, Lit22);
    }

    static Object lambda24() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit25, Lit33, Boolean.FALSE, Lit22);
    }

    public Object Tab_Layout1$TabItemSelected(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object $position = obj2;
        Object sanitizeComponentData = C1218runtime.sanitizeComponentData(obj);
        Object $position2 = C1218runtime.sanitizeComponentData($position);
        C1218runtime.setThisForm();
        ModuleMethod moduleMethod = C1218runtime.yail$Mnequal$Qu;
        if ($position2 instanceof Package) {
            Object[] objArr = new Object[3];
            Object[] objArr2 = objArr;
            objArr[0] = "The variable ";
            Object[] objArr3 = objArr2;
            Object[] objArr4 = objArr3;
            objArr3[1] = C1218runtime.getDisplayRepresentation(Lit97);
            Object[] objArr5 = objArr4;
            Object[] objArr6 = objArr5;
            objArr5[2] = " is not bound in the current context";
            obj3 = C1218runtime.signalRuntimeError(strings.stringAppend(objArr6), "Unbound Variable");
        } else {
            obj3 = $position2;
        }
        if (C1218runtime.callYailPrimitive(moduleMethod, LList.list2(obj3, Lit98), Lit99, "=") != Boolean.FALSE) {
            Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit34, Lit33, Boolean.TRUE, Lit22);
            Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit35, Lit33, Boolean.FALSE, Lit22);
            Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit36, Lit33, Boolean.FALSE, Lit22);
            Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit37, Lit33, Boolean.FALSE, Lit22);
            Object andCoerceProperty$Ex5 = C1218runtime.setAndCoerceProperty$Ex(Lit32, Lit33, Boolean.FALSE, Lit22);
        }
        ModuleMethod moduleMethod2 = C1218runtime.yail$Mnequal$Qu;
        if ($position2 instanceof Package) {
            Object[] objArr7 = new Object[3];
            Object[] objArr8 = objArr7;
            objArr7[0] = "The variable ";
            Object[] objArr9 = objArr8;
            Object[] objArr10 = objArr9;
            objArr9[1] = C1218runtime.getDisplayRepresentation(Lit97);
            Object[] objArr11 = objArr10;
            Object[] objArr12 = objArr11;
            objArr11[2] = " is not bound in the current context";
            obj4 = C1218runtime.signalRuntimeError(strings.stringAppend(objArr12), "Unbound Variable");
        } else {
            obj4 = $position2;
        }
        if (C1218runtime.callYailPrimitive(moduleMethod2, LList.list2(obj4, Lit100), Lit101, "=") != Boolean.FALSE) {
            Object andCoerceProperty$Ex6 = C1218runtime.setAndCoerceProperty$Ex(Lit34, Lit33, Boolean.FALSE, Lit22);
            Object andCoerceProperty$Ex7 = C1218runtime.setAndCoerceProperty$Ex(Lit35, Lit33, Boolean.TRUE, Lit22);
            Object andCoerceProperty$Ex8 = C1218runtime.setAndCoerceProperty$Ex(Lit36, Lit33, Boolean.FALSE, Lit22);
            Object andCoerceProperty$Ex9 = C1218runtime.setAndCoerceProperty$Ex(Lit37, Lit33, Boolean.FALSE, Lit22);
            Object andCoerceProperty$Ex10 = C1218runtime.setAndCoerceProperty$Ex(Lit32, Lit33, Boolean.FALSE, Lit22);
        }
        ModuleMethod moduleMethod3 = C1218runtime.yail$Mnequal$Qu;
        if ($position2 instanceof Package) {
            Object[] objArr13 = new Object[3];
            Object[] objArr14 = objArr13;
            objArr13[0] = "The variable ";
            Object[] objArr15 = objArr14;
            Object[] objArr16 = objArr15;
            objArr15[1] = C1218runtime.getDisplayRepresentation(Lit97);
            Object[] objArr17 = objArr16;
            Object[] objArr18 = objArr17;
            objArr17[2] = " is not bound in the current context";
            obj5 = C1218runtime.signalRuntimeError(strings.stringAppend(objArr18), "Unbound Variable");
        } else {
            obj5 = $position2;
        }
        if (C1218runtime.callYailPrimitive(moduleMethod3, LList.list2(obj5, Lit43), Lit102, "=") != Boolean.FALSE) {
            Object andCoerceProperty$Ex11 = C1218runtime.setAndCoerceProperty$Ex(Lit34, Lit33, Boolean.FALSE, Lit22);
            Object andCoerceProperty$Ex12 = C1218runtime.setAndCoerceProperty$Ex(Lit35, Lit33, Boolean.FALSE, Lit22);
            Object andCoerceProperty$Ex13 = C1218runtime.setAndCoerceProperty$Ex(Lit36, Lit33, Boolean.TRUE, Lit22);
            Object andCoerceProperty$Ex14 = C1218runtime.setAndCoerceProperty$Ex(Lit37, Lit33, Boolean.FALSE, Lit22);
            Object andCoerceProperty$Ex15 = C1218runtime.setAndCoerceProperty$Ex(Lit32, Lit33, Boolean.FALSE, Lit22);
        }
        ModuleMethod moduleMethod4 = C1218runtime.yail$Mnequal$Qu;
        if ($position2 instanceof Package) {
            Object[] objArr19 = new Object[3];
            Object[] objArr20 = objArr19;
            objArr19[0] = "The variable ";
            Object[] objArr21 = objArr20;
            Object[] objArr22 = objArr21;
            objArr21[1] = C1218runtime.getDisplayRepresentation(Lit97);
            Object[] objArr23 = objArr22;
            Object[] objArr24 = objArr23;
            objArr23[2] = " is not bound in the current context";
            obj6 = C1218runtime.signalRuntimeError(strings.stringAppend(objArr24), "Unbound Variable");
        } else {
            obj6 = $position2;
        }
        if (C1218runtime.callYailPrimitive(moduleMethod4, LList.list2(obj6, Lit103), Lit104, "=") != Boolean.FALSE) {
            Object andCoerceProperty$Ex16 = C1218runtime.setAndCoerceProperty$Ex(Lit34, Lit33, Boolean.FALSE, Lit22);
            Object andCoerceProperty$Ex17 = C1218runtime.setAndCoerceProperty$Ex(Lit35, Lit33, Boolean.FALSE, Lit22);
            Object andCoerceProperty$Ex18 = C1218runtime.setAndCoerceProperty$Ex(Lit36, Lit33, Boolean.FALSE, Lit22);
            Object andCoerceProperty$Ex19 = C1218runtime.setAndCoerceProperty$Ex(Lit37, Lit33, Boolean.TRUE, Lit22);
            Object andCoerceProperty$Ex20 = C1218runtime.setAndCoerceProperty$Ex(Lit32, Lit33, Boolean.FALSE, Lit22);
        }
        ModuleMethod moduleMethod5 = C1218runtime.yail$Mnequal$Qu;
        if ($position2 instanceof Package) {
            Object[] objArr25 = new Object[3];
            Object[] objArr26 = objArr25;
            objArr25[0] = "The variable ";
            Object[] objArr27 = objArr26;
            Object[] objArr28 = objArr27;
            objArr27[1] = C1218runtime.getDisplayRepresentation(Lit97);
            Object[] objArr29 = objArr28;
            Object[] objArr30 = objArr29;
            objArr29[2] = " is not bound in the current context";
            obj7 = C1218runtime.signalRuntimeError(strings.stringAppend(objArr30), "Unbound Variable");
        } else {
            obj7 = $position2;
        }
        if (C1218runtime.callYailPrimitive(moduleMethod5, LList.list2(obj7, Lit105), Lit106, "=") != Boolean.FALSE) {
            Object andCoerceProperty$Ex21 = C1218runtime.setAndCoerceProperty$Ex(Lit34, Lit33, Boolean.FALSE, Lit22);
            Object andCoerceProperty$Ex22 = C1218runtime.setAndCoerceProperty$Ex(Lit35, Lit33, Boolean.FALSE, Lit22);
            Object andCoerceProperty$Ex23 = C1218runtime.setAndCoerceProperty$Ex(Lit36, Lit33, Boolean.FALSE, Lit22);
            Object andCoerceProperty$Ex24 = C1218runtime.setAndCoerceProperty$Ex(Lit37, Lit33, Boolean.FALSE, Lit22);
            obj8 = C1218runtime.setAndCoerceProperty$Ex(Lit32, Lit33, Boolean.TRUE, Lit22);
        } else {
            obj8 = Values.empty;
        }
        return obj8;
    }

    static Object lambda25() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit32, Lit42, Lit43, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit32, Lit15, Lit110, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit32, Lit45, Lit46, Lit17);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit32, Lit47, Lit46, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit32, Lit33, Boolean.FALSE, Lit22);
    }

    static Object lambda26() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit32, Lit42, Lit43, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit32, Lit15, Lit110, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit32, Lit45, Lit46, Lit17);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit32, Lit47, Lit46, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit32, Lit33, Boolean.FALSE, Lit22);
    }

    static Object lambda27() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit113, Lit47, Lit46, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit113, Lit114, "https://gurnameh-99.github.io/SmartWaterMeter/", Lit13);
    }

    static Object lambda28() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit113, Lit47, Lit46, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit113, Lit114, "https://gurnameh-99.github.io/SmartWaterMeter/", Lit13);
    }

    static Object lambda29() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit117, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit117, Lit57, Lit118, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit117, Lit119, Lit98, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit117, Lit61, "Back", Lit13);
    }

    static Object lambda30() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit117, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit117, Lit57, Lit118, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit117, Lit119, Lit98, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit117, Lit61, "Back", Lit13);
    }

    public Object back_website$Click() {
        C1218runtime.setThisForm();
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit25, Lit33, Boolean.FALSE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit41, Lit33, Boolean.TRUE, Lit22);
        return C1218runtime.setAndCoerceProperty$Ex(Lit32, Lit33, Boolean.FALSE, Lit22);
    }

    static Object lambda31() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit37, Lit42, Lit43, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit37, Lit15, Lit123, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit37, Lit45, Lit46, Lit17);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit37, Lit47, Lit46, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit37, Lit33, Boolean.FALSE, Lit22);
    }

    static Object lambda32() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit37, Lit42, Lit43, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit37, Lit15, Lit123, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit37, Lit45, Lit46, Lit17);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit37, Lit47, Lit46, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit37, Lit33, Boolean.FALSE, Lit22);
    }

    static Object lambda33() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit126, Lit45, Lit127, Lit17);
    }

    static Object lambda34() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit126, Lit45, Lit127, Lit17);
    }

    static Object lambda35() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit130, Lit51, "database_(1).png", Lit13);
    }

    static Object lambda36() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit130, Lit51, "database_(1).png", Lit13);
    }

    static Object lambda37() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit133, Lit15, Lit134, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit133, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit133, Lit57, Lit135, Lit17);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit133, Lit61, "Sync My Data", Lit13);
        return C1218runtime.setAndCoerceProperty$Ex(Lit133, Lit62, Lit136, Lit17);
    }

    static Object lambda38() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit133, Lit15, Lit134, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit133, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit133, Lit57, Lit135, Lit17);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit133, Lit61, "Sync My Data", Lit13);
        return C1218runtime.setAndCoerceProperty$Ex(Lit133, Lit62, Lit136, Lit17);
    }

    public Object database$Click() {
        C1218runtime.setThisForm();
        Object addGlobalVarToCurrentFormEnvironment = C1218runtime.addGlobalVarToCurrentFormEnvironment(Lit3, C1218runtime.callComponentMethod(Lit138, Lit139, LList.list2(C1218runtime.callComponentMethod(Lit138, Lit140, LList.Empty, LList.Empty), "yyyy-MM-dd"), Lit141));
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit142, Lit143, C1218runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, C1218runtime.$Stthe$Mnnull$Mnvalue$St), Lit13);
        Object callComponentMethod = C1218runtime.callComponentMethod(Lit142, Lit144, LList.list2("waterUsage", C1218runtime.lookupGlobalVarInCurrentFormEnvironment(Lit11, C1218runtime.$Stthe$Mnnull$Mnvalue$St)), Lit145);
        Object callComponentMethod2 = C1218runtime.callComponentMethod(Lit142, Lit144, LList.list2("avgFlow", C1218runtime.lookupGlobalVarInCurrentFormEnvironment(Lit7, C1218runtime.$Stthe$Mnnull$Mnvalue$St)), Lit146);
        return C1218runtime.callComponentMethod(Lit142, Lit144, LList.list2("WaterGoal", C1218runtime.lookupGlobalVarInCurrentFormEnvironment(Lit8, C1218runtime.$Stthe$Mnnull$Mnvalue$St)), Lit147);
    }

    static Object lambda39() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit150, Lit45, Lit127, Lit17);
    }

    static Object lambda40() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit150, Lit45, Lit127, Lit17);
    }

    static Object lambda41() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit153, Lit42, Lit43, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit153, Lit15, Lit154, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit153, Lit45, Lit46, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit153, Lit47, Lit155, Lit17);
    }

    static Object lambda42() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit153, Lit42, Lit43, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit153, Lit15, Lit154, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit153, Lit45, Lit46, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit153, Lit47, Lit155, Lit17);
    }

    static Object lambda43() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit158, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit158, Lit57, Lit159, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit158, Lit61, "\" Your data is automatically stored on an online database which is update realtime on google Firebase. Concerning your privacy the data is only sent only when you click on Sync My Data. This is data is used to provide ananlysis with your water consumption habits.\"", Lit13);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit158, Lit160, Lit98, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit158, Lit62, Lit161, Lit17);
    }

    static Object lambda44() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit158, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit158, Lit57, Lit159, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit158, Lit61, "\" Your data is automatically stored on an online database which is update realtime on google Firebase. Concerning your privacy the data is only sent only when you click on Sync My Data. This is data is used to provide ananlysis with your water consumption habits.\"", Lit13);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit158, Lit160, Lit98, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit158, Lit62, Lit161, Lit17);
    }

    static Object lambda45() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit164, Lit45, Lit46, Lit17);
    }

    static Object lambda46() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit164, Lit45, Lit46, Lit17);
    }

    static Object lambda47() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit167, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit167, Lit57, Lit118, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit167, Lit119, Lit98, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit167, Lit61, "Back", Lit13);
    }

    static Object lambda48() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit167, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit167, Lit57, Lit118, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit167, Lit119, Lit98, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit167, Lit61, "Back", Lit13);
    }

    public Object back_sync$Click() {
        C1218runtime.setThisForm();
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit25, Lit33, Boolean.FALSE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit41, Lit33, Boolean.TRUE, Lit22);
        return C1218runtime.setAndCoerceProperty$Ex(Lit37, Lit33, Boolean.FALSE, Lit22);
    }

    static Object lambda49() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit34, Lit42, Lit43, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit34, Lit15, Lit171, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit34, Lit47, Lit46, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit34, Lit33, Boolean.FALSE, Lit22);
    }

    static Object lambda50() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit34, Lit42, Lit43, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit34, Lit15, Lit171, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit34, Lit47, Lit46, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit34, Lit33, Boolean.FALSE, Lit22);
    }

    static Object lambda51() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit174, Lit45, Lit175, Lit17);
    }

    static Object lambda52() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit174, Lit45, Lit175, Lit17);
    }

    static Object lambda53() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit178, Lit51, "goal.png", Lit13);
    }

    static Object lambda54() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit178, Lit51, "goal.png", Lit13);
    }

    static Object lambda55() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit181, Lit45, Lit46, Lit17);
    }

    static Object lambda56() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit181, Lit45, Lit46, Lit17);
    }

    static Object lambda57() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit184, Lit47, Lit46, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit184, Lit185, Lit98, Lit17);
    }

    static Object lambda58() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit184, Lit47, Lit46, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit184, Lit185, Lit98, Lit17);
    }

    public Object Slider1$PositionChanged(Object obj) {
        Object sanitizeComponentData = C1218runtime.sanitizeComponentData(obj);
        C1218runtime.setThisForm();
        return C1218runtime.addGlobalVarToCurrentFormEnvironment(Lit8, C1218runtime.get$Mnproperty.apply2(Lit184, Lit187));
    }

    static Object lambda59() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit191, Lit42, Lit43, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit191, Lit15, Lit192, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit191, Lit47, Lit46, Lit17);
    }

    static Object lambda60() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit191, Lit42, Lit43, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit191, Lit15, Lit192, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit191, Lit47, Lit46, Lit17);
    }

    static Object lambda61() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit195, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit195, Lit57, Lit118, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit195, Lit61, "Your Daily Water Goal is", Lit13);
        return C1218runtime.setAndCoerceProperty$Ex(Lit195, Lit62, Lit196, Lit17);
    }

    static Object lambda62() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit195, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit195, Lit57, Lit118, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit195, Lit61, "Your Daily Water Goal is", Lit13);
        return C1218runtime.setAndCoerceProperty$Ex(Lit195, Lit62, Lit196, Lit17);
    }

    static Object lambda63() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit199, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit199, Lit57, Lit118, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit199, Lit62, Lit200, Lit17);
    }

    static Object lambda64() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit199, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit199, Lit57, Lit118, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit199, Lit62, Lit200, Lit17);
    }

    static Object lambda65() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit203, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit203, Lit57, Lit118, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit203, Lit61, "Litres", Lit13);
        return C1218runtime.setAndCoerceProperty$Ex(Lit203, Lit62, Lit204, Lit17);
    }

    static Object lambda66() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit203, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit203, Lit57, Lit118, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit203, Lit61, "Litres", Lit13);
        return C1218runtime.setAndCoerceProperty$Ex(Lit203, Lit62, Lit204, Lit17);
    }

    static Object lambda67() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit207, Lit45, Lit46, Lit17);
    }

    static Object lambda68() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit207, Lit45, Lit46, Lit17);
    }

    static Object lambda69() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit210, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit210, Lit57, Lit118, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit210, Lit119, Lit98, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit210, Lit61, "Back", Lit13);
    }

    static Object lambda70() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit210, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit210, Lit57, Lit118, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit210, Lit119, Lit98, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit210, Lit61, "Back", Lit13);
    }

    public Object back_waterGoal$Click() {
        C1218runtime.setThisForm();
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit25, Lit33, Boolean.FALSE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit41, Lit33, Boolean.TRUE, Lit22);
        return C1218runtime.setAndCoerceProperty$Ex(Lit34, Lit33, Boolean.FALSE, Lit22);
    }

    static Object lambda71() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit35, Lit42, Lit43, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit35, Lit15, Lit214, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit35, Lit45, Lit46, Lit17);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit35, Lit47, Lit46, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit35, Lit33, Boolean.FALSE, Lit22);
    }

    static Object lambda72() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit35, Lit42, Lit43, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit35, Lit15, Lit214, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit35, Lit45, Lit46, Lit17);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit35, Lit47, Lit46, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit35, Lit33, Boolean.FALSE, Lit22);
    }

    static Object lambda73() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit217, Lit45, Lit175, Lit17);
    }

    static Object lambda74() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit217, Lit45, Lit175, Lit17);
    }

    static Object lambda75() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit220, Lit42, Lit43, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit220, Lit221, Lit100, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit220, Lit15, Lit222, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit220, Lit47, Lit46, Lit17);
    }

    static Object lambda76() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit220, Lit42, Lit43, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit220, Lit221, Lit100, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit220, Lit15, Lit222, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit220, Lit47, Lit46, Lit17);
    }

    static Object lambda77() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit225, Lit51, "water.png", Lit13);
    }

    static Object lambda78() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit225, Lit51, "water.png", Lit13);
    }

    static Object lambda79() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit228, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit228, Lit57, Lit118, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit228, Lit61, "Flow Rate", Lit13);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit228, Lit160, Lit98, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit228, Lit62, Lit229, Lit17);
    }

    static Object lambda80() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit228, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit228, Lit57, Lit118, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit228, Lit61, "Flow Rate", Lit13);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit228, Lit160, Lit98, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit228, Lit62, Lit229, Lit17);
    }

    static Object lambda81() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit232, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit232, Lit57, Lit118, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit232, Lit61, "0.00", Lit13);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit232, Lit160, Lit98, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit232, Lit62, Lit233, Lit17);
    }

    static Object lambda82() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit232, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit232, Lit57, Lit118, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit232, Lit61, "0.00", Lit13);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit232, Lit160, Lit98, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit232, Lit62, Lit233, Lit17);
    }

    static Object lambda83() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit236, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit236, Lit57, Lit118, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit236, Lit61, "L/min", Lit13);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit236, Lit160, Lit98, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit236, Lit62, Lit237, Lit17);
    }

    static Object lambda84() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit236, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit236, Lit57, Lit118, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit236, Lit61, "L/min", Lit13);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit236, Lit160, Lit98, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit236, Lit62, Lit237, Lit17);
    }

    static Object lambda85() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit240, Lit45, Lit175, Lit17);
    }

    static Object lambda86() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit240, Lit45, Lit175, Lit17);
    }

    static Object lambda87() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit243, Lit42, Lit43, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit243, Lit221, Lit100, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit243, Lit15, Lit244, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit243, Lit47, Lit46, Lit17);
    }

    static Object lambda88() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit243, Lit42, Lit43, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit243, Lit221, Lit100, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit243, Lit15, Lit244, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit243, Lit47, Lit46, Lit17);
    }

    static Object lambda89() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit247, Lit51, "meter.png", Lit13);
    }

    static Object lambda90() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit247, Lit51, "meter.png", Lit13);
    }

    static Object lambda91() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit250, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit250, Lit57, Lit118, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit250, Lit61, "Avg Flow Rate", Lit13);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit250, Lit160, Lit98, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit250, Lit62, Lit251, Lit17);
    }

    static Object lambda92() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit250, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit250, Lit57, Lit118, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit250, Lit61, "Avg Flow Rate", Lit13);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit250, Lit160, Lit98, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit250, Lit62, Lit251, Lit17);
    }

    static Object lambda93() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit254, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit254, Lit57, Lit118, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit254, Lit61, "0.00", Lit13);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit254, Lit160, Lit98, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit254, Lit62, Lit255, Lit17);
    }

    static Object lambda94() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit254, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit254, Lit57, Lit118, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit254, Lit61, "0.00", Lit13);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit254, Lit160, Lit98, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit254, Lit62, Lit255, Lit17);
    }

    static Object lambda95() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit258, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit258, Lit57, Lit118, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit258, Lit61, "L/min", Lit13);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit258, Lit160, Lit98, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit258, Lit62, Lit259, Lit17);
    }

    static Object lambda96() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit258, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit258, Lit57, Lit118, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit258, Lit61, "L/min", Lit13);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit258, Lit160, Lit98, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit258, Lit62, Lit259, Lit17);
    }

    static Object lambda97() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit262, Lit45, Lit263, Lit17);
    }

    static Object lambda98() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit262, Lit45, Lit263, Lit17);
    }

    static Object lambda100() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit266, Lit45, Lit46, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit266, Lit47, Lit46, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit266, Lit114, "https://gurnameh-99.github.io/SmartWaterMeter/rate.html", Lit13);
    }

    static Object lambda99() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit266, Lit45, Lit46, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit266, Lit47, Lit46, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit266, Lit114, "https://gurnameh-99.github.io/SmartWaterMeter/rate.html", Lit13);
    }

    static Object lambda101() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit269, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit269, Lit57, Lit118, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit269, Lit119, Lit98, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit269, Lit61, "Back", Lit13);
    }

    static Object lambda102() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit269, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit269, Lit57, Lit118, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit269, Lit119, Lit98, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit269, Lit61, "Back", Lit13);
    }

    public Object back_flow$Click() {
        C1218runtime.setThisForm();
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit25, Lit33, Boolean.FALSE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit41, Lit33, Boolean.TRUE, Lit22);
        return C1218runtime.setAndCoerceProperty$Ex(Lit35, Lit33, Boolean.FALSE, Lit22);
    }

    static Object lambda103() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit36, Lit42, Lit43, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit36, Lit15, Lit273, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit36, Lit45, Lit46, Lit17);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit36, Lit47, Lit46, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit36, Lit33, Boolean.FALSE, Lit22);
    }

    static Object lambda104() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit36, Lit42, Lit43, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit36, Lit15, Lit273, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit36, Lit45, Lit46, Lit17);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit36, Lit47, Lit46, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit36, Lit33, Boolean.FALSE, Lit22);
    }

    static Object lambda105() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit276, Lit45, Lit175, Lit17);
    }

    static Object lambda106() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit276, Lit45, Lit175, Lit17);
    }

    static Object lambda107() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit279, Lit42, Lit43, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit279, Lit221, Lit100, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit279, Lit15, Lit280, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit279, Lit47, Lit46, Lit17);
    }

    static Object lambda108() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit279, Lit42, Lit43, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit279, Lit221, Lit100, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit279, Lit15, Lit280, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit279, Lit47, Lit46, Lit17);
    }

    static Object lambda109() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit283, Lit51, "water-tank.png", Lit13);
    }

    static Object lambda110() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit283, Lit51, "water-tank.png", Lit13);
    }

    static Object lambda111() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit286, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit286, Lit57, Lit118, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit286, Lit61, "Total Volume Comsumed", Lit13);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit286, Lit160, Lit98, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit286, Lit62, Lit287, Lit17);
    }

    static Object lambda112() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit286, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit286, Lit57, Lit118, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit286, Lit61, "Total Volume Comsumed", Lit13);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit286, Lit160, Lit98, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit286, Lit62, Lit287, Lit17);
    }

    static Object lambda113() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit290, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit290, Lit57, Lit118, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit290, Lit61, "0.00", Lit13);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit290, Lit160, Lit98, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit290, Lit62, Lit291, Lit17);
    }

    static Object lambda114() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit290, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit290, Lit57, Lit118, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit290, Lit61, "0.00", Lit13);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit290, Lit160, Lit98, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit290, Lit62, Lit291, Lit17);
    }

    static Object lambda115() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit294, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit294, Lit57, Lit118, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit294, Lit61, "Litres", Lit13);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit294, Lit160, Lit98, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit294, Lit62, Lit295, Lit17);
    }

    static Object lambda116() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit294, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit294, Lit57, Lit118, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit294, Lit61, "Litres", Lit13);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit294, Lit160, Lit98, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit294, Lit62, Lit295, Lit17);
    }

    static Object lambda117() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit298, Lit45, Lit299, Lit17);
    }

    static Object lambda118() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit298, Lit45, Lit299, Lit17);
    }

    static Object lambda119() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit302, Lit45, Lit46, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit302, Lit47, Lit46, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit302, Lit114, "https://gurnameh-99.github.io/SmartWaterMeter/volume.html", Lit13);
    }

    static Object lambda120() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit302, Lit45, Lit46, Lit17);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit302, Lit47, Lit46, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit302, Lit114, "https://gurnameh-99.github.io/SmartWaterMeter/volume.html", Lit13);
    }

    static Object lambda121() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit305, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit305, Lit57, Lit118, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit305, Lit119, Lit98, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit305, Lit61, "Back", Lit13);
    }

    static Object lambda122() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit305, Lit56, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit305, Lit57, Lit118, Lit17);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit305, Lit119, Lit98, Lit17);
        return C1218runtime.setAndCoerceProperty$Ex(Lit305, Lit61, "Back", Lit13);
    }

    public Object back_consumption$Click() {
        C1218runtime.setThisForm();
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit25, Lit33, Boolean.FALSE, Lit22);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit41, Lit33, Boolean.TRUE, Lit22);
        return C1218runtime.setAndCoerceProperty$Ex(Lit36, Lit33, Boolean.FALSE, Lit22);
    }

    static Object lambda123() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit142, Lit313, "https://makeroid-default-firebase.firebaseio.com/", Lit13);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit142, Lit314, "27gurnameh99singh12@gmail:com/", Lit13);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit142, Lit315, "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJkIjp7InVpZCI6IjNiMzUzYTM4LTYxMmMtNGIyNy05YzM4LWVkMWJjMDUyMmZhNiIsInByb2plY3QiOiJTbWFydF9XYXRlcl9NZXRlciIsImRldmVsb3BlciI6IjI3Z3VybmFtZWg5OXNpbmdoMTJAZ21haWw6Y29tIn0sInYiOjAsImV4cCI6MTY3NDA5NzI4NDEsImlhdCI6MTU5MzY3MDQ0MX0.-u-vZT95Om00WkWiC9N1JIo3VWWOCzpf7LkyEJsCTGk", Lit13);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit142, Lit316, "https://bluetooth-watermeter.firebaseio.com/", Lit13);
        return C1218runtime.setAndCoerceProperty$Ex(Lit142, Lit143, "water_meter", Lit13);
    }

    static Object lambda124() {
        Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit142, Lit313, "https://makeroid-default-firebase.firebaseio.com/", Lit13);
        Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit142, Lit314, "27gurnameh99singh12@gmail:com/", Lit13);
        Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit142, Lit315, "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJkIjp7InVpZCI6IjNiMzUzYTM4LTYxMmMtNGIyNy05YzM4LWVkMWJjMDUyMmZhNiIsInByb2plY3QiOiJTbWFydF9XYXRlcl9NZXRlciIsImRldmVsb3BlciI6IjI3Z3VybmFtZWg5OXNpbmdoMTJAZ21haWw6Y29tIn0sInYiOjAsImV4cCI6MTY3NDA5NzI4NDEsImlhdCI6MTU5MzY3MDQ0MX0.-u-vZT95Om00WkWiC9N1JIo3VWWOCzpf7LkyEJsCTGk", Lit13);
        Object andCoerceProperty$Ex4 = C1218runtime.setAndCoerceProperty$Ex(Lit142, Lit316, "https://bluetooth-watermeter.firebaseio.com/", Lit13);
        return C1218runtime.setAndCoerceProperty$Ex(Lit142, Lit143, "water_meter", Lit13);
    }

    static Object lambda125() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit138, Lit319, Lit320, Lit17);
    }

    static Object lambda126() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit138, Lit319, Lit320, Lit17);
    }

    public Object Clock1$Timer() {
        C1218runtime.setThisForm();
        Object[] objArr = new Object[2];
        Object[] objArr2 = objArr;
        objArr[0] = lambda$Fn126;
        Object[] objArr3 = objArr2;
        Object[] objArr4 = objArr3;
        objArr3[1] = lambda$Fn127;
        if (C1218runtime.processAndDelayed$V(objArr4) != Boolean.FALSE) {
            Object addGlobalVarToCurrentFormEnvironment = C1218runtime.addGlobalVarToCurrentFormEnvironment(Lit4, C1218runtime.callYailPrimitive(C1218runtime.string$Mnsplit, LList.list2(C1218runtime.callComponentMethod(Lit66, Lit325, LList.list1(C1218runtime.callComponentMethod(Lit66, Lit323, LList.Empty, LList.Empty)), Lit326), ":"), Lit327, "split"));
            Object andCoerceProperty$Ex = C1218runtime.setAndCoerceProperty$Ex(Lit232, Lit61, C1218runtime.callYailPrimitive(C1218runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(C1218runtime.lookupGlobalVarInCurrentFormEnvironment(Lit4, C1218runtime.$Stthe$Mnnull$Mnvalue$St), Lit98), Lit328, "select list item"), Lit13);
            Object andCoerceProperty$Ex2 = C1218runtime.setAndCoerceProperty$Ex(Lit290, Lit61, C1218runtime.callYailPrimitive(C1218runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(C1218runtime.lookupGlobalVarInCurrentFormEnvironment(Lit4, C1218runtime.$Stthe$Mnnull$Mnvalue$St), Lit100), Lit329, "select list item"), Lit13);
            Object andCoerceProperty$Ex3 = C1218runtime.setAndCoerceProperty$Ex(Lit254, Lit61, C1218runtime.lookupGlobalVarInCurrentFormEnvironment(Lit7, C1218runtime.$Stthe$Mnnull$Mnvalue$St), Lit13);
            Object addGlobalVarToCurrentFormEnvironment2 = C1218runtime.addGlobalVarToCurrentFormEnvironment(Lit5, C1218runtime.callYailPrimitive(C1218runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(C1218runtime.lookupGlobalVarInCurrentFormEnvironment(Lit4, C1218runtime.$Stthe$Mnnull$Mnvalue$St), Lit43), Lit330, "select list item"));
            Object addGlobalVarToCurrentFormEnvironment3 = C1218runtime.addGlobalVarToCurrentFormEnvironment(Lit7, C1218runtime.callYailPrimitive(C1218runtime.yail$Mndivide, LList.list2(C1218runtime.callYailPrimitive(C1218runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(C1218runtime.lookupGlobalVarInCurrentFormEnvironment(Lit4, C1218runtime.$Stthe$Mnnull$Mnvalue$St), Lit100), Lit331, "select list item"), C1218runtime.callYailPrimitive(C1218runtime.yail$Mndivide, LList.list2(C1218runtime.lookupGlobalVarInCurrentFormEnvironment(Lit5, C1218runtime.$Stthe$Mnnull$Mnvalue$St), Lit332), Lit333, "yail-divide")), Lit334, "yail-divide"));
            Object addGlobalVarToCurrentFormEnvironment4 = C1218runtime.addGlobalVarToCurrentFormEnvironment(Lit4, C1218runtime.callYailPrimitive(C1218runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list"));
            Object addGlobalVarToCurrentFormEnvironment5 = C1218runtime.addGlobalVarToCurrentFormEnvironment(Lit11, C1218runtime.callYailPrimitive(MultiplyOp.$St, LList.list2(C1218runtime.get$Mnproperty.apply2(Lit290, Lit61), Lit98), Lit335, "*"));
        }
        return C1218runtime.setAndCoerceProperty$Ex(Lit199, Lit61, C1218runtime.lookupGlobalVarInCurrentFormEnvironment(Lit8, C1218runtime.$Stthe$Mnnull$Mnvalue$St), Lit13);
    }

    static Object lambda127() {
        return C1218runtime.get$Mnproperty.apply2(Lit66, Lit322);
    }

    static Object lambda128() {
        return C1218runtime.callYailPrimitive(Scheme.numGrt, LList.list2(C1218runtime.callComponentMethod(Lit66, Lit323, LList.Empty, LList.Empty), Lit6), Lit324, ">");
    }

    static Object lambda129() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit339, Lit319, Lit340, Lit17);
    }

    static Object lambda130() {
        return C1218runtime.setAndCoerceProperty$Ex(Lit339, Lit319, Lit340, Lit17);
    }

    public Object Clock2$Timer() {
        Object obj;
        C1218runtime.setThisForm();
        if (C1218runtime.callYailPrimitive(Scheme.numGEq, LList.list2(C1218runtime.get$Mnproperty.apply2(Lit290, Lit61), C1218runtime.lookupGlobalVarInCurrentFormEnvironment(Lit8, C1218runtime.$Stthe$Mnnull$Mnvalue$St)), Lit342, ">=") != Boolean.FALSE) {
            SimpleSymbol simpleSymbol = Lit74;
            SimpleSymbol simpleSymbol2 = Lit343;
            Pair list1 = LList.list1("You have exhausted your daily water goal limit !!");
            Pair pair = list1;
            Pair chain4 = LList.chain4(list1, "WARNING!", "exit", "warning.png", Boolean.FALSE);
            obj = C1218runtime.callComponentMethod(simpleSymbol, simpleSymbol2, pair, Lit344);
        } else {
            obj = Values.empty;
        }
        return obj;
    }

    public String getSimpleName(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol symbol, Object obj) {
        Symbol name = symbol;
        Object object = obj;
        Object[] objArr = new Object[4];
        Object[] objArr2 = objArr;
        objArr[0] = "Adding ~A to env ~A with value ~A";
        Object[] objArr3 = objArr2;
        Object[] objArr4 = objArr3;
        objArr3[1] = name;
        Object[] objArr5 = objArr4;
        Object[] objArr6 = objArr5;
        objArr5[2] = this.form$Mnenvironment;
        Object[] objArr7 = objArr6;
        Object[] objArr8 = objArr7;
        objArr7[3] = object;
        androidLogForm(Format.formatToString(0, objArr8));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol symbol, Object obj) {
        Object obj2;
        Symbol name = symbol;
        Object default$Mnvalue = obj;
        int i = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & 1;
        if (i == 0 ? i == 0 : !this.form$Mnenvironment.isBound(name)) {
            obj2 = default$Mnvalue;
        } else {
            obj2 = this.form$Mnenvironment.get(name);
        }
        return obj2;
    }

    public boolean isBoundInFormEnvironment(Symbol symbol) {
        return this.form$Mnenvironment.isBound(symbol);
    }

    public void addToGlobalVarEnvironment(Symbol symbol, Object obj) {
        Symbol name = symbol;
        Object object = obj;
        Object[] objArr = new Object[4];
        Object[] objArr2 = objArr;
        objArr[0] = "Adding ~A to env ~A with value ~A";
        Object[] objArr3 = objArr2;
        Object[] objArr4 = objArr3;
        objArr3[1] = name;
        Object[] objArr5 = objArr4;
        Object[] objArr6 = objArr5;
        objArr5[2] = this.global$Mnvar$Mnenvironment;
        Object[] objArr7 = objArr6;
        Object[] objArr8 = objArr7;
        objArr7[3] = object;
        androidLogForm(Format.formatToString(0, objArr8));
        this.global$Mnvar$Mnenvironment.put(name, object);
    }

    public void addToEvents(Object obj, Object obj2) {
        this.events$Mnto$Mnregister = C1240lists.cons(C1240lists.cons(obj, obj2), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object obj, Object obj2, Object obj3, Object obj4) {
        this.components$Mnto$Mncreate = C1240lists.cons(LList.list4(obj, obj2, obj3, obj4), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object obj, Object obj2) {
        this.global$Mnvars$Mnto$Mncreate = C1240lists.cons(LList.list2(obj, obj2), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object obj) {
        this.form$Mndo$Mnafter$Mncreation = C1240lists.cons(obj, this.form$Mndo$Mnafter$Mncreation);
    }

    public void sendError(Object obj) {
        Object obj2 = obj;
        RetValManager.sendError(obj2 == null ? null : obj2.toString());
    }

    public void processException(Object obj) {
        Object ex = obj;
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    public boolean dispatchEvent(Component component, String str, String str2, Object[] objArr) {
        boolean z;
        boolean z2;
        Component componentObject = component;
        String registeredComponentName = str;
        String eventName = str2;
        Object[] args = objArr;
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (!isBoundInFormEnvironment(registeredObject)) {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            z = false;
        } else if (lookupInFormEnvironment(registeredObject) == componentObject) {
            try {
                Object apply2 = Scheme.apply.apply2(lookupHandler(registeredComponentName, eventName), LList.makeList(args, 0));
                z2 = true;
            } catch (PermissionException e) {
                PermissionException exception = e;
                exception.printStackTrace();
                boolean x = this == componentObject;
                if (!x ? !x : !IsEqual.apply(eventName, "PermissionNeeded")) {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                } else {
                    processException(exception);
                }
                z2 = false;
            } catch (Throwable th) {
                Throwable exception2 = th;
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
                z2 = false;
            }
            z = z2;
        } else {
            z = false;
        }
        return z;
    }

    public void dispatchGenericEvent(Component component, String str, boolean z, Object[] objArr) {
        Boolean bool;
        Component componentObject = component;
        String eventName = str;
        boolean notAlreadyHandled = z;
        Object[] args = objArr;
        Object[] objArr2 = new Object[4];
        Object[] objArr3 = objArr2;
        objArr2[0] = "any$";
        Object[] objArr4 = objArr3;
        Object[] objArr5 = objArr4;
        objArr4[1] = getSimpleName(componentObject);
        Object[] objArr6 = objArr5;
        Object[] objArr7 = objArr6;
        objArr6[2] = "$";
        Object[] objArr8 = objArr7;
        Object[] objArr9 = objArr8;
        objArr8[3] = eventName;
        Object handler = lookupInFormEnvironment(misc.string$To$Symbol(strings.stringAppend(objArr9)));
        if (handler != Boolean.FALSE) {
            try {
                Apply apply = Scheme.apply;
                Object obj = handler;
                Component component2 = componentObject;
                if (notAlreadyHandled) {
                    bool = Boolean.TRUE;
                } else {
                    bool = Boolean.FALSE;
                }
                Object apply2 = apply.apply2(obj, C1240lists.cons(component2, C1240lists.cons(bool, LList.makeList(args, 0))));
            } catch (PermissionException e) {
                PermissionException exception = e;
                exception.printStackTrace();
                boolean x = this == componentObject;
                if (!x ? !x : !IsEqual.apply(eventName, "PermissionNeeded")) {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                } else {
                    processException(exception);
                }
            } catch (Throwable th) {
                Throwable exception2 = th;
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
            }
        }
    }

    public Object lookupHandler(Object obj, Object obj2) {
        Object eventName = obj2;
        Object obj3 = obj;
        String obj4 = obj3 == null ? null : obj3.toString();
        Object obj5 = eventName;
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(obj4, obj5 == null ? null : obj5.toString())));
    }

    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void $define() {
        /*
            r20 = this;
            r0 = r20
            kawa.standard.Scheme r12 = kawa.standard.Scheme.getInstance()
            gnu.expr.Language.setDefaults(r12)
            r12 = r0
            r12.run()     // Catch:{ Exception -> 0x006c }
        L_0x000d:
            r12 = r0
            Screen1 = r12
            r12 = r0
            gnu.mapping.SimpleSymbol r13 = Lit0
            r14 = r0
            r12.addToFormEnvironment(r13, r14)
            r12 = r0
            gnu.lists.LList r12 = r12.events$Mnto$Mnregister
            r1 = r12
            r12 = r1
            r2 = r12
        L_0x001d:
            r12 = r2
            gnu.lists.LList r13 = gnu.lists.LList.Empty
            if (r12 != r13) goto L_0x007d
            r12 = r0
            gnu.lists.LList r12 = r12.components$Mnto$Mncreate     // Catch:{ YailRuntimeError -> 0x014d }
            gnu.lists.LList r12 = kawa.lib.C1240lists.reverse(r12)     // Catch:{ YailRuntimeError -> 0x014d }
            r1 = r12
            r12 = r0
            gnu.mapping.SimpleSymbol r13 = Lit2     // Catch:{ YailRuntimeError -> 0x014d }
            gnu.expr.ModuleMethod r14 = lambda$Fn1     // Catch:{ YailRuntimeError -> 0x014d }
            r12.addToGlobalVars(r13, r14)     // Catch:{ YailRuntimeError -> 0x014d }
            r12 = r1
            r2 = r12
            r12 = r0
            r3 = r12
            r12 = r2
            r4 = r12
        L_0x0038:
            r12 = r4
            gnu.lists.LList r13 = gnu.lists.LList.Empty     // Catch:{ YailRuntimeError -> 0x014d }
            if (r12 != r13) goto L_0x00c4
            r12 = r0
            gnu.lists.LList r12 = r12.global$Mnvars$Mnto$Mncreate     // Catch:{ YailRuntimeError -> 0x014d }
            gnu.lists.LList r12 = kawa.lib.C1240lists.reverse(r12)     // Catch:{ YailRuntimeError -> 0x014d }
            r2 = r12
            r12 = r0
            r3 = r12
            r12 = r2
            r4 = r12
        L_0x0049:
            r12 = r4
            gnu.lists.LList r13 = gnu.lists.LList.Empty     // Catch:{ YailRuntimeError -> 0x014d }
            if (r12 != r13) goto L_0x0196
            r12 = r0
            gnu.lists.LList r12 = r12.form$Mndo$Mnafter$Mncreation     // Catch:{ YailRuntimeError -> 0x014d }
            gnu.lists.LList r12 = kawa.lib.C1240lists.reverse(r12)     // Catch:{ YailRuntimeError -> 0x014d }
            r2 = r12
        L_0x0056:
            r12 = r2
            gnu.lists.LList r13 = gnu.lists.LList.Empty     // Catch:{ YailRuntimeError -> 0x014d }
            if (r12 != r13) goto L_0x0214
            r12 = r1
            r2 = r12
            r12 = r2
            r3 = r12
        L_0x005f:
            r12 = r3
            gnu.lists.LList r13 = gnu.lists.LList.Empty     // Catch:{ YailRuntimeError -> 0x014d }
            if (r12 != r13) goto L_0x0250
            r12 = r2
            r3 = r12
        L_0x0066:
            r12 = r3
            gnu.lists.LList r13 = gnu.lists.LList.Empty     // Catch:{ YailRuntimeError -> 0x014d }
            if (r12 != r13) goto L_0x02a4
        L_0x006b:
            return
        L_0x006c:
            r12 = move-exception
            r1 = r12
            r12 = r0
            r13 = r1
            java.lang.String r13 = r13.getMessage()
            r12.androidLogForm(r13)
            r12 = r0
            r13 = r1
            r12.processException(r13)
            goto L_0x000d
        L_0x007d:
            r12 = r2
            r18 = r12
            r12 = r18
            r13 = r18
            r4 = r13
            gnu.lists.Pair r12 = (gnu.lists.Pair) r12     // Catch:{ ClassCastException -> 0x02f8 }
            r3 = r12
            r12 = r3
            java.lang.Object r12 = r12.getCar()
            r4 = r12
            r12 = r0
            gnu.expr.GenericProc r13 = kawa.lib.C1240lists.car
            r14 = r4
            java.lang.Object r13 = r13.apply1(r14)
            r18 = r13
            r13 = r18
            r14 = r18
            if (r14 != 0) goto L_0x00ba
            r13 = 0
        L_0x009f:
            gnu.expr.GenericProc r14 = kawa.lib.C1240lists.cdr
            r15 = r4
            java.lang.Object r14 = r14.apply1(r15)
            r18 = r14
            r14 = r18
            r15 = r18
            if (r15 != 0) goto L_0x00bf
            r14 = 0
        L_0x00af:
            com.google.appinventor.components.runtime.EventDispatcher.registerEventForDelegation(r12, r13, r14)
            r12 = r3
            java.lang.Object r12 = r12.getCdr()
            r2 = r12
            goto L_0x001d
        L_0x00ba:
            java.lang.String r13 = r13.toString()
            goto L_0x009f
        L_0x00bf:
            java.lang.String r14 = r14.toString()
            goto L_0x00af
        L_0x00c4:
            r12 = r4
            r18 = r12
            r12 = r18
            r13 = r18
            r6 = r13
            gnu.lists.Pair r12 = (gnu.lists.Pair) r12     // Catch:{ ClassCastException -> 0x012d }
            r5 = r12
            r12 = r5
            java.lang.Object r12 = r12.getCar()     // Catch:{ YailRuntimeError -> 0x014d }
            r6 = r12
            gnu.expr.GenericProc r12 = kawa.lib.C1240lists.caddr     // Catch:{ YailRuntimeError -> 0x014d }
            r13 = r6
            java.lang.Object r12 = r12.apply1(r13)     // Catch:{ YailRuntimeError -> 0x014d }
            gnu.expr.GenericProc r13 = kawa.lib.C1240lists.cadddr     // Catch:{ YailRuntimeError -> 0x014d }
            r14 = r6
            java.lang.Object r13 = r13.apply1(r14)     // Catch:{ YailRuntimeError -> 0x014d }
            gnu.expr.GenericProc r13 = kawa.lib.C1240lists.cadr     // Catch:{ YailRuntimeError -> 0x014d }
            r14 = r6
            java.lang.Object r13 = r13.apply1(r14)     // Catch:{ YailRuntimeError -> 0x014d }
            r14 = r0
            gnu.expr.GenericProc r15 = kawa.lib.C1240lists.car     // Catch:{ YailRuntimeError -> 0x014d }
            r16 = r6
            java.lang.Object r15 = r15.apply1(r16)     // Catch:{ YailRuntimeError -> 0x014d }
            r18 = r15
            r15 = r18
            r16 = r18
            r10 = r16
            gnu.mapping.Symbol r15 = (gnu.mapping.Symbol) r15     // Catch:{ ClassCastException -> 0x0156 }
            java.lang.Object r14 = r14.lookupInFormEnvironment(r15)     // Catch:{ YailRuntimeError -> 0x014d }
            r9 = r14
            r8 = r13
            r7 = r12
            gnu.kawa.reflect.Invoke r12 = gnu.kawa.reflect.Invoke.make     // Catch:{ YailRuntimeError -> 0x014d }
            r13 = r8
            r14 = r9
            java.lang.Object r12 = r12.apply2(r13, r14)     // Catch:{ YailRuntimeError -> 0x014d }
            r10 = r12
            gnu.kawa.reflect.SlotSet r12 = gnu.kawa.reflect.SlotSet.set$Mnfield$Ex     // Catch:{ YailRuntimeError -> 0x014d }
            r13 = r0
            r14 = r7
            r15 = r10
            java.lang.Object r12 = r12.apply3(r13, r14, r15)     // Catch:{ YailRuntimeError -> 0x014d }
            r12 = r0
            r13 = r7
            r18 = r13
            r13 = r18
            r14 = r18
            r11 = r14
            gnu.mapping.Symbol r13 = (gnu.mapping.Symbol) r13     // Catch:{ ClassCastException -> 0x0176 }
            r14 = r10
            r12.addToFormEnvironment(r13, r14)     // Catch:{ YailRuntimeError -> 0x014d }
            r12 = r5
            java.lang.Object r12 = r12.getCdr()     // Catch:{ YailRuntimeError -> 0x014d }
            r4 = r12
            goto L_0x0038
        L_0x012d:
            r12 = move-exception
            gnu.mapping.WrongType r13 = new gnu.mapping.WrongType     // Catch:{ YailRuntimeError -> 0x014d }
            r18 = r12
            r19 = r13
            r12 = r19
            r13 = r18
            r14 = r19
            r18 = r13
            r19 = r14
            r13 = r19
            r14 = r18
            java.lang.String r15 = "arg0"
            r16 = -2
            r17 = r6
            r13.<init>(r14, r15, r16, r17)     // Catch:{ YailRuntimeError -> 0x014d }
            throw r12     // Catch:{ YailRuntimeError -> 0x014d }
        L_0x014d:
            r12 = move-exception
            r1 = r12
            r12 = r0
            r13 = r1
            r12.processException(r13)
            goto L_0x006b
        L_0x0156:
            r12 = move-exception
            gnu.mapping.WrongType r13 = new gnu.mapping.WrongType     // Catch:{ YailRuntimeError -> 0x014d }
            r18 = r12
            r19 = r13
            r12 = r19
            r13 = r18
            r14 = r19
            r18 = r13
            r19 = r14
            r13 = r19
            r14 = r18
            java.lang.String r15 = "lookup-in-form-environment"
            r16 = 0
            r17 = r10
            r13.<init>(r14, r15, r16, r17)     // Catch:{ YailRuntimeError -> 0x014d }
            throw r12     // Catch:{ YailRuntimeError -> 0x014d }
        L_0x0176:
            r12 = move-exception
            gnu.mapping.WrongType r13 = new gnu.mapping.WrongType     // Catch:{ YailRuntimeError -> 0x014d }
            r18 = r12
            r19 = r13
            r12 = r19
            r13 = r18
            r14 = r19
            r18 = r13
            r19 = r14
            r13 = r19
            r14 = r18
            java.lang.String r15 = "add-to-form-environment"
            r16 = 0
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ YailRuntimeError -> 0x014d }
            throw r12     // Catch:{ YailRuntimeError -> 0x014d }
        L_0x0196:
            r12 = r4
            r18 = r12
            r12 = r18
            r13 = r18
            r6 = r13
            gnu.lists.Pair r12 = (gnu.lists.Pair) r12     // Catch:{ ClassCastException -> 0x01d4 }
            r5 = r12
            r12 = r5
            java.lang.Object r12 = r12.getCar()     // Catch:{ YailRuntimeError -> 0x014d }
            r6 = r12
            gnu.expr.GenericProc r12 = kawa.lib.C1240lists.car     // Catch:{ YailRuntimeError -> 0x014d }
            r13 = r6
            java.lang.Object r12 = r12.apply1(r13)     // Catch:{ YailRuntimeError -> 0x014d }
            gnu.expr.GenericProc r13 = kawa.lib.C1240lists.cadr     // Catch:{ YailRuntimeError -> 0x014d }
            r14 = r6
            java.lang.Object r13 = r13.apply1(r14)     // Catch:{ YailRuntimeError -> 0x014d }
            r8 = r13
            r7 = r12
            r12 = r0
            r13 = r7
            r18 = r13
            r13 = r18
            r14 = r18
            r9 = r14
            gnu.mapping.Symbol r13 = (gnu.mapping.Symbol) r13     // Catch:{ ClassCastException -> 0x01f4 }
            gnu.kawa.functions.ApplyToArgs r14 = kawa.standard.Scheme.applyToArgs     // Catch:{ YailRuntimeError -> 0x014d }
            r15 = r8
            java.lang.Object r14 = r14.apply1(r15)     // Catch:{ YailRuntimeError -> 0x014d }
            r12.addToGlobalVarEnvironment(r13, r14)     // Catch:{ YailRuntimeError -> 0x014d }
            r12 = r5
            java.lang.Object r12 = r12.getCdr()     // Catch:{ YailRuntimeError -> 0x014d }
            r4 = r12
            goto L_0x0049
        L_0x01d4:
            r12 = move-exception
            gnu.mapping.WrongType r13 = new gnu.mapping.WrongType     // Catch:{ YailRuntimeError -> 0x014d }
            r18 = r12
            r19 = r13
            r12 = r19
            r13 = r18
            r14 = r19
            r18 = r13
            r19 = r14
            r13 = r19
            r14 = r18
            java.lang.String r15 = "arg0"
            r16 = -2
            r17 = r6
            r13.<init>(r14, r15, r16, r17)     // Catch:{ YailRuntimeError -> 0x014d }
            throw r12     // Catch:{ YailRuntimeError -> 0x014d }
        L_0x01f4:
            r12 = move-exception
            gnu.mapping.WrongType r13 = new gnu.mapping.WrongType     // Catch:{ YailRuntimeError -> 0x014d }
            r18 = r12
            r19 = r13
            r12 = r19
            r13 = r18
            r14 = r19
            r18 = r13
            r19 = r14
            r13 = r19
            r14 = r18
            java.lang.String r15 = "add-to-global-var-environment"
            r16 = 0
            r17 = r9
            r13.<init>(r14, r15, r16, r17)     // Catch:{ YailRuntimeError -> 0x014d }
            throw r12     // Catch:{ YailRuntimeError -> 0x014d }
        L_0x0214:
            r12 = r2
            r18 = r12
            r12 = r18
            r13 = r18
            r4 = r13
            gnu.lists.Pair r12 = (gnu.lists.Pair) r12     // Catch:{ ClassCastException -> 0x0230 }
            r3 = r12
            r12 = r3
            java.lang.Object r12 = r12.getCar()     // Catch:{ YailRuntimeError -> 0x014d }
            java.lang.Object r12 = kawa.lib.misc.force(r12)     // Catch:{ YailRuntimeError -> 0x014d }
            r12 = r3
            java.lang.Object r12 = r12.getCdr()     // Catch:{ YailRuntimeError -> 0x014d }
            r2 = r12
            goto L_0x0056
        L_0x0230:
            r12 = move-exception
            gnu.mapping.WrongType r13 = new gnu.mapping.WrongType     // Catch:{ YailRuntimeError -> 0x014d }
            r18 = r12
            r19 = r13
            r12 = r19
            r13 = r18
            r14 = r19
            r18 = r13
            r19 = r14
            r13 = r19
            r14 = r18
            java.lang.String r15 = "arg0"
            r16 = -2
            r17 = r4
            r13.<init>(r14, r15, r16, r17)     // Catch:{ YailRuntimeError -> 0x014d }
            throw r12     // Catch:{ YailRuntimeError -> 0x014d }
        L_0x0250:
            r12 = r3
            r18 = r12
            r12 = r18
            r13 = r18
            r5 = r13
            gnu.lists.Pair r12 = (gnu.lists.Pair) r12     // Catch:{ ClassCastException -> 0x0284 }
            r4 = r12
            r12 = r4
            java.lang.Object r12 = r12.getCar()     // Catch:{ YailRuntimeError -> 0x014d }
            r5 = r12
            gnu.expr.GenericProc r12 = kawa.lib.C1240lists.caddr     // Catch:{ YailRuntimeError -> 0x014d }
            r13 = r5
            java.lang.Object r12 = r12.apply1(r13)     // Catch:{ YailRuntimeError -> 0x014d }
            gnu.expr.GenericProc r12 = kawa.lib.C1240lists.cadddr     // Catch:{ YailRuntimeError -> 0x014d }
            r13 = r5
            java.lang.Object r12 = r12.apply1(r13)     // Catch:{ YailRuntimeError -> 0x014d }
            r6 = r12
            r12 = r6
            java.lang.Boolean r13 = java.lang.Boolean.FALSE     // Catch:{ YailRuntimeError -> 0x014d }
            if (r12 == r13) goto L_0x027c
            gnu.kawa.functions.ApplyToArgs r12 = kawa.standard.Scheme.applyToArgs     // Catch:{ YailRuntimeError -> 0x014d }
            r13 = r6
            java.lang.Object r12 = r12.apply1(r13)     // Catch:{ YailRuntimeError -> 0x014d }
        L_0x027c:
            r12 = r4
            java.lang.Object r12 = r12.getCdr()     // Catch:{ YailRuntimeError -> 0x014d }
            r3 = r12
            goto L_0x005f
        L_0x0284:
            r12 = move-exception
            gnu.mapping.WrongType r13 = new gnu.mapping.WrongType     // Catch:{ YailRuntimeError -> 0x014d }
            r18 = r12
            r19 = r13
            r12 = r19
            r13 = r18
            r14 = r19
            r18 = r13
            r19 = r14
            r13 = r19
            r14 = r18
            java.lang.String r15 = "arg0"
            r16 = -2
            r17 = r5
            r13.<init>(r14, r15, r16, r17)     // Catch:{ YailRuntimeError -> 0x014d }
            throw r12     // Catch:{ YailRuntimeError -> 0x014d }
        L_0x02a4:
            r12 = r3
            r18 = r12
            r12 = r18
            r13 = r18
            r5 = r13
            gnu.lists.Pair r12 = (gnu.lists.Pair) r12     // Catch:{ ClassCastException -> 0x02d8 }
            r4 = r12
            r12 = r4
            java.lang.Object r12 = r12.getCar()     // Catch:{ YailRuntimeError -> 0x014d }
            r5 = r12
            gnu.expr.GenericProc r12 = kawa.lib.C1240lists.caddr     // Catch:{ YailRuntimeError -> 0x014d }
            r13 = r5
            java.lang.Object r12 = r12.apply1(r13)     // Catch:{ YailRuntimeError -> 0x014d }
            gnu.expr.GenericProc r13 = kawa.lib.C1240lists.cadddr     // Catch:{ YailRuntimeError -> 0x014d }
            r14 = r5
            java.lang.Object r13 = r13.apply1(r14)     // Catch:{ YailRuntimeError -> 0x014d }
            r6 = r12
            r12 = r0
            gnu.kawa.reflect.SlotGet r13 = gnu.kawa.reflect.SlotGet.field     // Catch:{ YailRuntimeError -> 0x014d }
            r14 = r0
            r15 = r6
            java.lang.Object r13 = r13.apply2(r14, r15)     // Catch:{ YailRuntimeError -> 0x014d }
            r12.callInitialize(r13)     // Catch:{ YailRuntimeError -> 0x014d }
            r12 = r4
            java.lang.Object r12 = r12.getCdr()     // Catch:{ YailRuntimeError -> 0x014d }
            r3 = r12
            goto L_0x0066
        L_0x02d8:
            r12 = move-exception
            gnu.mapping.WrongType r13 = new gnu.mapping.WrongType     // Catch:{ YailRuntimeError -> 0x014d }
            r18 = r12
            r19 = r13
            r12 = r19
            r13 = r18
            r14 = r19
            r18 = r13
            r19 = r14
            r13 = r19
            r14 = r18
            java.lang.String r15 = "arg0"
            r16 = -2
            r17 = r5
            r13.<init>(r14, r15, r16, r17)     // Catch:{ YailRuntimeError -> 0x014d }
            throw r12     // Catch:{ YailRuntimeError -> 0x014d }
        L_0x02f8:
            r12 = move-exception
            gnu.mapping.WrongType r13 = new gnu.mapping.WrongType
            r18 = r12
            r19 = r13
            r12 = r19
            r13 = r18
            r14 = r19
            r18 = r13
            r19 = r14
            r13 = r19
            r14 = r18
            java.lang.String r15 = "arg0"
            r16 = -2
            r17 = r4
            r13.<init>(r14, r15, r16, r17)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p004io.kodular.m_27gurnameh99singh12.Smart_Water_Meter.Screen1.$define():void");
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] objArr) {
        WrongType wrongType;
        WrongType wrongType2;
        WrongType wrongType3;
        Object makeList = LList.makeList(objArr, 0);
        Object obj = makeList;
        Object obj2 = makeList;
        Apply apply = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Object obj3 = obj2;
        Object obj4 = LList.Empty;
        while (true) {
            Object obj5 = obj4;
            Object obj6 = obj3;
            if (obj6 == LList.Empty) {
                Object apply2 = apply.apply2(moduleMethod, LList.reverseInPlace(obj5));
                Object obj7 = apply2;
                try {
                    return misc.string$To$Symbol((CharSequence) apply2);
                } catch (ClassCastException e) {
                    ClassCastException classCastException = e;
                    WrongType wrongType4 = wrongType;
                    WrongType wrongType5 = new WrongType(classCastException, "string->symbol", 1, obj7);
                    throw wrongType4;
                }
            } else {
                Object obj8 = obj6;
                Object obj9 = obj8;
                try {
                    Pair arg0 = (Pair) obj8;
                    obj3 = arg0.getCdr();
                    Object car = arg0.getCar();
                    Object obj10 = car;
                    try {
                        obj4 = Pair.make(misc.symbol$To$String((Symbol) car), obj5);
                    } catch (ClassCastException e2) {
                        ClassCastException classCastException2 = e2;
                        WrongType wrongType6 = wrongType3;
                        WrongType wrongType7 = new WrongType(classCastException2, "symbol->string", 1, obj10);
                        throw wrongType6;
                    }
                } catch (ClassCastException e3) {
                    ClassCastException classCastException3 = e3;
                    WrongType wrongType8 = wrongType2;
                    WrongType wrongType9 = new WrongType(classCastException3, "arg0", -2, obj9);
                    throw wrongType8;
                }
            }
        }
    }

    static Object lambda2() {
        return null;
    }
}
