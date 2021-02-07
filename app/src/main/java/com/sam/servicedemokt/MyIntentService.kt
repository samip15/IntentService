package com.sam.servicedemokt
import android.app.IntentService
import android.content.Intent
import android.util.Log
import android.widget.Toast
private const val TAG = "MyIntentService"
class MyIntentService : IntentService("MyIntentService") {
    override fun onHandleIntent(intent: Intent?) {
        for (i in 1..5) {
            when (intent?.getIntExtra("type", 0)) {
                TYPEONE -> for (i in 1..5) {
                    Thread.sleep(1000)
                    Log.e(TAG, "onHandleIntent: My Intent Service Task1")
                }
                TYPETWO -> for (i in 1..5) {
                    Thread.sleep(1000)
                    Log.e(TAG, "onHandleIntent: My Intent Service Task2")
                }
            }
        }

    }
}