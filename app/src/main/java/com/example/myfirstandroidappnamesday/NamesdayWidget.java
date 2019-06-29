package com.example.myfirstandroidappnamesday;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;

import androidx.annotation.RequiresApi;

import com.example.myfirstandroidappnamesday.namesdayBackend.main.BackendApp;
import com.example.myfirstandroidappnamesday.namesdayBackend.xmlElements.Day;

import java.util.Random;

import static android.content.Context.MODE_PRIVATE;

/**
 * Implementation of App Widget functionality.
 */
public class NamesdayWidget extends AppWidgetProvider {

//    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    static void updateAppWidget(Context context, AppWidgetManager appWidgetManager,
                                int[] appWidgetIds) {
        final int count = appWidgetIds.length;

        for (int i = 0; i < count; i++) {
            int widgetId = appWidgetIds[i];
            String number = String.format("%03d", (new Random().nextInt(900) + 100));

            System.out.println("pred backendom");
            BackendApp backendApp = new BackendApp();
            System.out.println("za backendomm");
            Day day = backendApp.retunrDay();

            RemoteViews remoteViews = new RemoteViews(context.getPackageName(),
                    R.layout.namesday);
            remoteViews.setTextViewText(R.id.textViewFirst, "SK: " + day.getSk());
            remoteViews.setTextViewText(R.id.textViewSecond, "CZ: " + day.getCz());
            remoteViews.setTextViewText(R.id.textViewThird, "SkSv: " + day.getSkHoliday());
            remoteViews.setTextViewText(R.id.textViewFourth, "CzSv:" + day.getCzHoliday());

            Intent intent = new Intent(context, NamesdayWidget.class);
            intent.setAction(AppWidgetManager.ACTION_APPWIDGET_UPDATE);
            intent.putExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS, appWidgetIds);
            PendingIntent pendingIntent = PendingIntent.getBroadcast(context,
                    0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
            remoteViews.setOnClickPendingIntent(R.id.actionButton, pendingIntent);
            appWidgetManager.updateAppWidget(widgetId, remoteViews);
        }
    }


//    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        // There may be multiple widgets active, so update all of them
//        for (int appWidgetId : appWidgetIds) {
//            updateAppWidget(context, appWidgetManager, appWidgetId);
//        }
        updateAppWidget(context, appWidgetManager, appWidgetIds);
    }

    @Override
    public void onEnabled(Context context) {
        // Enter relevant functionality for when the first widget is created
    }

    @Override
    public void onDisabled(Context context) {
        // Enter relevant functionality for when the last widget is disabled
    }
}

