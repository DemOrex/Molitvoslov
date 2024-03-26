package ru.orex.molitvoslov;

import static androidx.appcompat.app.AppCompatDelegate.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Window;
import android.view.WindowManager;
import android.content.Intent;
import android.webkit.WebSettings;
import android.widget.Button;
import android.view.View;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.app.AppCompatDelegate;
import android.webkit.WebView;
import java.util.ArrayList;
import android.media.MediaPlayer;
import android.widget.TextView;

// class ContentActivity
// выводит на экран устройства
// кнопки с перечнем парагрофов
public class ContentActivity extends AppCompatActivity {
    private Activity activity;
    private Context context;
    final int intButton1=1;// код кнопки
    final int intButton2=2;
    final int intButton3=3;
    final int intButton4=4;
    final int intButton5=5;
    final int intButton6=6;
    final int intButton7=7;
    final int intButton8=8;
    final int intButton9=9;
    final int intButton10=10;
    final int intButton11=11;
    final int intButton12=12;
    final int intButton13=13;
    final int intButton140=140;
    final int intButton15=15;
    final int intButton17=17;
    final int intButton18=18;
    final int intButton19=19;
    final int intButton20=20;
    final int intButton21=21;
    final int intButton23=23;
    final int intButton24=24;
    final int intButton25=25;
    final int intButton26=26;
    final int intButton27=27;
    final int intButton28=28;
    // кнопки
    Button content_button1,content_button2,content_button3,content_button4,content_button5,
    content_button6,content_button7,content_button8,content_button9,content_button10,
            content_button11,content_button12,content_button13,content_button14,
            content_button15,content_button16,content_button17,content_button18,
            content_button19,content_button20,content_button21,content_button22,content_button23,
            content_button24,  content_button25,  content_button26,  content_button27,
            content_button28;

    ArrayList<String> arrayListNumber;
    ArrayList<String> arrayListPosition;
    ArrayList<String> arrayListName;

    private SharedPreferences sp;

    MediaPlayer mp;
    Boolean voise=false;
    SharedPreferences sharedPreferences;
    private SharedPreferences mFirstRunNews = null;

    private SharedPreferences mFirstRunPrefs = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        activity = ContentActivity.this;
        context = ContentActivity.this;
        setContentView(R.layout.activity_content);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        if (getSupportActionBar() != null) {
            getSupportActionBar().show();
        }

        setTitle(getResources().getString(R.string.app_content));

        content_button1 = (Button) findViewById(R.id.content_button1);
        content_button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
              if (getVoise()){
                mp = MediaPlayer.create(context,R.raw.button1);
                mp.start();
              }
                buttonRun(intButton1);
            }
        });


        content_button2 = (Button) findViewById(R.id.content_button2);
        content_button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.button2);
                    mp.start();
                }
                buttonRun(intButton2);
            }
        });

        content_button3 = (Button) findViewById(R.id.content_button3);
        content_button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.button3);
                    mp.start();
                }
                buttonRun(intButton3);
            }
        });

        content_button4 = (Button) findViewById(R.id.content_button4);
        content_button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.button4);
                    mp.start();
                }
                buttonRun(intButton4);
            }
        });

        content_button5 = (Button) findViewById(R.id.content_button5);
        content_button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.button5);
                    mp.start();
                }
                buttonRun(intButton5);
            }
        });

        content_button6 = (Button) findViewById(R.id.content_button6);
        content_button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.button6);
                    mp.start();
                }
                buttonRun(intButton6);
            }
        });

        content_button7 = (Button) findViewById(R.id.content_button7);
        content_button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.button7);
                    mp.start();
                }
                buttonRun(intButton7);
            }
        });

        content_button8 = (Button) findViewById(R.id.content_button8);
        content_button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.button8);
                    mp.start();
                }
                buttonRun(intButton8);
            }
        });

        content_button9 = (Button) findViewById(R.id.content_button9);
        content_button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.button9);
                    mp.start();
                }
                buttonRun(intButton9);
            }
        });

        content_button10 = (Button) findViewById(R.id.content_button10);
        content_button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.button10);
                    mp.start();
                }
                buttonRun(intButton10);
            }
        });

        content_button11 = (Button) findViewById(R.id.content_button11);
        content_button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.button11);
                    mp.start();
                }
                buttonRun(intButton11);
            }
        });

        content_button12 = (Button) findViewById(R.id.content_button12);
        content_button12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.button12);
                    mp.start();
                }
                buttonRun(intButton12);
            }
        });

        content_button13 = (Button) findViewById(R.id.content_button13);
        content_button13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.button13);
                    mp.start();
                }
                buttonRun(intButton13);
            }
        });

        content_button14 = (Button) findViewById(R.id.content_button14);
        content_button14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.button14);
                    mp.start();
                }
                //alertdialogNewTasment();
                buttonRun(intButton140);
            }
        });

        content_button15 = (Button) findViewById(R.id.content_button15);
        content_button15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.button15);
                    mp.start();
                }
                buttonRun(intButton15);
            }
        });

        content_button16 = (Button) findViewById(R.id.content_button16);
        content_button16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.button16);
                    mp.start();
                }
                Intent intentMonthActivity = new Intent(context,MonthActivity.class);
                startActivityForResult(intentMonthActivity, 1234);
            }
        });


        content_button17 = (Button) findViewById(R.id.content_button17);
        content_button17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.button17);
                    mp.start();
                }
                buttonRun(intButton17);
            }
        });


        content_button18 = (Button) findViewById(R.id.content_button18);
        content_button18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.button18);
                    mp.start();
                }
                prayerNumber(0,intButton18);
            }
        });

        content_button19 = (Button) findViewById(R.id.content_button19);
        content_button19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.button19);
                    mp.start();
                }
                buttonRun(intButton19);
            }
        });

        content_button20 = (Button) findViewById(R.id.content_button20);
        content_button20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.button20);
                    mp.start();
                }
               // prayerNumber(0,intButton20);
                buttonRun(intButton20);
            }
        });

        content_button21 = (Button) findViewById(R.id.content_button21);
        content_button21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.button21);
                    mp.start();
                }
                buttonRun(intButton21);
            }
        });

        content_button22 = (Button) findViewById(R.id.content_button22);
        content_button22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.menu9);
                    mp.start();
                }
                Intent intentDictActivity = new Intent(getApplicationContext(),DictActivity.class);
                startActivityForResult(intentDictActivity, 1234);
            }
        });

        content_button23 = (Button) findViewById(R.id.content_button23);
        content_button23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.button23);
                    mp.start();
                }
                prayerNumber(0,intButton23);
            }
        });

        content_button24 = (Button) findViewById(R.id.content_button24);
        content_button24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.button24);
                    mp.start();
                }
                prayerNumber(0,intButton24);
            }
        });

        content_button25 = (Button) findViewById(R.id.content_button25);
        content_button25.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.button25);
                    mp.start();
                }
                buttonRun(intButton25);
            }
        });

        content_button26 = (Button) findViewById(R.id.content_button26);
        content_button26.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.button26);
                    mp.start();
                }
                prayerNumber(0,intButton26);
            }
        });

        content_button27 = (Button) findViewById(R.id.content_button27);
        content_button27.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.button27);
                    mp.start();
                }
                Intent intentBu = new Intent(context,Bu.class);
                startActivityForResult(intentBu, 1234)
            }
        });

        content_button28 = (Button) findViewById(R.id.content_button28);
        content_button28.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.button28);
                    mp.start();
                }
                Intent intentCellActivity = new Intent(context,CellActivity.class);
                startActivityForResult(intentCellActivity, 1234);
            }
        });

        MyHelper.initArray(activity,getString(R.string.book_number),getString(R.string.book_position),getString(R.string.book_name));

        //---------------------------- 2024--------------------------------------------------
        if(MyHelper.getToday().equals("1/7/2024 ")||MyHelper.getToday().equals("01/07/2024 ")){
            setTitle("Рождество Господа Бога и Спаса нашего Иисуса Христа");
        }
        if(MyHelper.getToday().equals("1/19/2024 ")||MyHelper.getToday().equals("01/19/2024 ")){
            setTitle("Святое Богоявление. Крещение Господа Бога и Спаса нашего Иисуса Христа");
        }
        if(MyHelper.getToday().equals("2/15/2024 ")||MyHelper.getToday().equals("02/15/2024 ")){
            setTitle("Сретение Господа Бога и Спаса нашего Иисуса Христа");
        }
        if(MyHelper.getToday().equals("4/28/2024 ")||MyHelper.getToday().equals("04/28/2024 ")){
            setTitle("Вход Господень в Иерусалим");
        }
        if(MyHelper.getToday().equals("4/7/2024 ")||MyHelper.getToday().equals("04/07/2024 ")){
            setTitle("Благовещение Пресвятой Богородицы");
        }
        if(MyHelper.getToday().equals("5/5/2024 ")||MyHelper.getToday().equals("05/05/2024 ")){
            setTitle("СВЕТЛОЕ ХРИСТОВО ВОСКРЕСЕНИЕ. ПАСХА");
            mp = MediaPlayer.create(context,R.raw.xv);
            mp.start();
        }
        if(MyHelper.getToday().equals("6/13/2024 ")||MyHelper.getToday().equals("06/13/2024 ")){
            setTitle("Вознесение Господне");
        }
        if(MyHelper.getToday().equals("6/23/2024 ")||MyHelper.getToday().equals("06/23/2024 ")){
            setTitle("День Святой Троицы. Пятидесятница");
        }
        if(MyHelper.getToday().equals("7/7/2024 ")||MyHelper.getToday().equals("07/07/2024 ")){
            setTitle("Рождество честно́го славного Пророка, Предтечи и Крестителя Господня Иоанна");
        }
        if(MyHelper.getToday().equals("7/12/2024 ")||MyHelper.getToday().equals("07/12/2024 ")){
            setTitle("Славных и всехвальных первоверховных апостолов Петра и Павла ");
        }
        if(MyHelper.getToday().equals("8/19/2024 ")||MyHelper.getToday().equals("08/19/2024 ")){
            setTitle("Преображение Господа Бога и Спаса нашего Иисуса Христа");
        }
        if(MyHelper.getToday().equals("8/28/2024 ")||MyHelper.getToday().equals("08/28/2024 ")){
            setTitle("Успение Пресвятой Владычицы нашей Богородицы и Приснодевы Марии");
        }
        if(MyHelper.getToday().equals("9/11/2024 ")||MyHelper.getToday().equals("09/11/2024 ")){
            setTitle("Усекновение главы Пророка, Предтечи и Крестителя Господня Иоанна");
        }
        if(MyHelper.getToday().equals("9/21/2024 ")||MyHelper.getToday().equals("09/21/2024 ")){
            setTitle("Рождество Пресвятой Владычицы нашей Богородицы и Приснодевы Марии");
        }
        if(MyHelper.getToday().equals("9/27/2024 ")||MyHelper.getToday().equals("09/27/2024 ")){
            setTitle("Воздви́жение Честно́го и Животворящего Креста Господня");
        }
        if(MyHelper.getToday().equals("10/14/2024 ")||MyHelper.getToday().equals("10/14/2024 ")){
            setTitle("Покров Пресвятой Владычицы нашей Богородицы и Приснодевы Марии");
        }
        if(MyHelper.getToday().equals("4/12/2024 ")||MyHelper.getToday().equals("04/12/2024 ")){
            setTitle("Введение (Вход) во Храм Пресвятой Владычицы нашей Богородицы и Приснодевы Марии");
        }
        ///--------------------------------------------------------------------

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (resultCode == RESULT_OK) {

        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.nenu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch(id){
            case R.id.action_books:
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.menu1);
                    mp.start();
                }
                Intent intentBooks = new Intent(context, Books_Activity.class);
                intentBooks.putStringArrayListExtra("arrayListNumber",MyHelper.loadArrayList(activity, "arrayListNumber"));
                intentBooks.putStringArrayListExtra("arrayListPosition",MyHelper.loadArrayList(activity, "arrayListPosition"));
                intentBooks.putStringArrayListExtra("arrayListName",MyHelper.loadArrayList(activity, "arrayListName"));
                startActivityForResult(intentBooks, 1234);

                return true;
            case R.id.action_settings :
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.menu2);
                    mp.start();
                }
                Intent intentPref = new Intent(context,PrefActivity.class);
                startActivity(intentPref);
                return true;
            case R.id.action_app_info:
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.menu6);
                    mp.start();
                }
                appInfo();
                return true;
            case R.id.action_glossary:
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.menu3);
                    mp.start();
                }
                Intent intentGlosActivity = new Intent(getApplicationContext(),GlosActivity.class);
                startActivityForResult(intentGlosActivity, 1234);
                return true;
            case R.id.action_notepad:
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.menu4);
                    mp.start();
                }
                Intent intentNotepadActivity = new Intent(getApplicationContext(),NotepadActivity.class);
                startActivityForResult(intentNotepadActivity, 1234);
                return true;
            case R.id.action_calendar:
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.menu5);
                    mp.start();
                }
                  prayerNumber(0,0);
                return true;
            case R.id.action_calendar_year:
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.menu13);
                    mp.start();
                }
                prayerNumber(13,0);
                return true;
            case R.id.action_radio:
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.menu8);
                    mp.start();
                }
                prayerNumber(1,0);
                return true;
            case R.id.action_spas:
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.menu15);
                    mp.start();
                }
                prayerNumber(15,0);
                return true;
            case R.id.action_app_help:
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.menu12);
                    mp.start();
                }
                prayerNumber(12,0);
                return true;
            case R.id.action_app_telegram:
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.menu14);
                    mp.start();
                }
                  Intent  intentTelega = new Intent(Intent.ACTION_VIEW, Uri.parse("http://t.me/molitvoslov_ru"));
                startActivity(intentTelega);
                return true;
            case R.id.action_app_telegram_chat:
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.menu17);
                    mp.start();
                }
                Intent  intentTelegaChat = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/molitvoslov_ru/61"));
                startActivity(intentTelegaChat);
                return true;
            case R.id.action_app_exit:
                if (getVoise()){
                    mp = MediaPlayer.create(context,R.raw.menu7);
                    mp.start();
                }
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public  void  prayerNumber(int prayerNumber,int buttonNumber){
        Intent intentWeb = new Intent(context,WebActivity.class);
        intentWeb.putExtra("prayerNumber",prayerNumber);
        intentWeb.putExtra("buttonNumber",buttonNumber);
        startActivityForResult(intentWeb, 1234);
    }
    public void appInfo(){
        int versionCode = BuildConfig.VERSION_CODE;
        String versionName = BuildConfig.VERSION_NAME;
        String mVersionCode = String.valueOf(versionCode);
        MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(context);
        builder.setTitle(R.string.app_name);
        builder.setIcon(R.drawable.ic_info);
        builder.setMessage("\n Православный Молитвослов \n Версия - "+mVersionCode + "\n "+ "\n "+getString(R.string.app_what_new)+ getString(R.string.app_news)+"\n "+"\n "+  getString(R.string.app_read) );
        builder.setPositiveButton(R.string.app_ok, (dialog, whichButton) -> {
               });
        builder.setNegativeButton(R.string.app_cancel, (dialog, whichButton) ->
                dialog.cancel());
        AlertDialog dialog = builder.create();
        dialog.show();
       }
    // метод  buttonRun передаёт номер кнопки  Button1_Activity
    public  void  buttonRun(int number){
        Intent intentButton1Activity = new Intent(context,Button1_Activity.class);
        intentButton1Activity.putExtra("numberButton",number);
        startActivityForResult(intentButton1Activity, 1234);
    }
    public void dialogHtml(){
        WebView webView = new WebView(context);
        webView.loadData("<p>No help for you!</p>", "text/html", "utf-8");
        MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(context);
        builder.setTitle("Help")
                .setView(webView)
                .setNeutralButton(R.string.app_ok, null)
                .show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        getPrefs();

    }

    @Override
    protected void onRestart() {
        super.onRestart();

    }


    public void getPrefs() {
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences((Context) context);
        if (sharedPreferences.getBoolean("night", false)) {
            setDefaultNightMode(MODE_NIGHT_YES);
            }else {   setDefaultNightMode(MODE_NIGHT_NO);    }

        if (sharedPreferences.getBoolean("voice", false)) {
           setVoise(true);
        }else {  setVoise(false);    }

        }



    public Boolean getVoise() {
        return voise;
    }

    public void setVoise(Boolean voise) {
        this.voise = voise;
    }

}
