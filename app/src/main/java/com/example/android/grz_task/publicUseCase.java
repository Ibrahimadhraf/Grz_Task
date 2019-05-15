package com.example.android.grz_task;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Toast;

public class publicUseCase {
public static void makeToast(Context context,String message){
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
}
public static void makesnakeBar(View view,String message){
    Snackbar.make(view,message,Snackbar.LENGTH_SHORT).show();
}
}
