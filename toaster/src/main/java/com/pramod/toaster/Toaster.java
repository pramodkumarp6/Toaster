package com.pramod.toaster;

import android.content.Context;
import android.widget.Toast;

public class Toaster {

    public static void simpleToaster(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
