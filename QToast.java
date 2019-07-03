package com.example.simplewidget.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class QToast {

    private Toast toast;
    private TextView message;
    private GradientDrawable gradient;

    public static final int WARNING = 0;
    public static final int MESSAGE = 1;
    public static final int DEFAULT = 2;

    public QToast(Context context) {
        //圆角Drawable
        gradient = new GradientDrawable();
        gradient.setColor(0xF0808080);
        gradient.setCornerRadius(20);
        //初始化显示消息TextView
        message = new TextView(context);
        message.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        message.setBackground(gradient);
        message.setTextSize(16);
        message.setMaxLines(2);
        message.setEllipsize(TextUtils.TruncateAt.END);
        message.setPadding(20,20,20,20);
        message.setTextColor(0xFFFFFFFF);
        //初始化Toast
        toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM, 0, 80);
        toast.setView(message);
    }

    public void showMessage(String msg){
        message.setText(msg);
        toast.show();
    }

    public void showMessage(String msg, int type){
        if(type == MESSAGE) {
            gradient.setColor(0xF099CC00);
        }else if(type == WARNING) {
            gradient.setColor(0xF0FF4444);
        }else {
            gradient.setColor(0xF033B5E5);
        }
        showMessage(msg);
    }

}
