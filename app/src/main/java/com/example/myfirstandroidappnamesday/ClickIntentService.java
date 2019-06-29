//package com.example.myfirstandroidappnamesday;
//
//import android.app.IntentService;
//import android.appwidget.AppWidgetManager;
//import android.content.ComponentName;
//import android.content.Intent;
//import android.os.Build;
//
//import androidx.annotation.RequiresApi;
//
//public class ClickIntentService extends IntentService {
//
//    public static final String ACTION_CLICK = "com.thetehnocafe.gurleensethi.widgets.click";
//
//    public ClickIntentService() {
//        super("ClickIntentService");
//    }
//
////    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
//    @Override
//    protected void onHandleIntent(Intent intent) {
//        if (intent != null) {
//            final String action = intent.getAction();
//
//            if (ACTION_CLICK.equals(action)) {
//                handleClick();
//            }
//        }
//    }
//
////    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
//    private void handleClick() {
////        int clicks = getSharedPreferences("sp", MODE_PRIVATE).getInt("clicks", 0);
////        clicks++;
////        getSharedPreferences("sp", MODE_PRIVATE)
////                .edit()
////                .putInt("clicks", clicks)
////                .commit();
////
////        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this);
////        int[] widgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(this, Namesday.class));
//////        for (int appWidgetId : widgetIds)
////            Namesday.updateAppWidget(getApplicationContext(), appWidgetManager, appWidgetIds);
//    }
//}
