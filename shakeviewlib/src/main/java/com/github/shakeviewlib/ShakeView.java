package com.github.shakeviewlib;

import android.content.Context;
import android.os.Vibrator;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

public class ShakeView {
    private Context mContext;
    private Vibrator vibrator;

    public ShakeView(Context mContext)
    {
        this.mContext = mContext;
    }


    public ShakeView(Context mContext, View mView)
    {
        this.mContext = mContext;
        mView.startAnimation(AnimationUtils.loadAnimation(this.mContext,R.anim.shake));
    }


    public ShakeView(Context mContext, View mView,int duration)
    {
        this.mContext = mContext;
        mView.startAnimation(AnimationUtils.loadAnimation(this.mContext,R.anim.shake));
        vibrator.vibrate(duration);
    }


    public ShakeView(Context mContext, View mView,int duration, String msg, boolean isLong)
    {
        this.mContext = mContext;
        mView.startAnimation(AnimationUtils.loadAnimation(this.mContext,R.anim.shake));
        vibrator.vibrate(duration);
        if(isLong == true) {
            Toast.makeText(mContext, msg, Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show();
        }
    }


    public void setShake(View mView)
    {
        mView.startAnimation(AnimationUtils.loadAnimation(mContext,R.anim.shake));
    }


    public void setShakeWithVibration(View mView,int duration)
    {
        mView.startAnimation(AnimationUtils.loadAnimation(mContext,R.anim.shake));
        vibrator.vibrate(duration);
    }


    public void setVibration(int duration)
    {
        vibrator.vibrate(duration);
    }



    public void setShakeWithToast(View mView, String msg, boolean isLong)
    {
        mView.startAnimation(AnimationUtils.loadAnimation(mContext,R.anim.shake));
        if (isLong == true) {
            Toast.makeText(mContext, msg, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show();
        }
        ;
    }


    public void setShakeVibrationToast(View mView,int duration, String msg, boolean isLong)
    {
        mView.startAnimation(AnimationUtils.loadAnimation(mContext,R.anim.shake));
        vibrator.vibrate(duration);
        if (isLong == true) {
            Toast.makeText(mContext, msg, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show();
        }
    }


    public void setVibrationToast(int duration, String msg, boolean isLong)
    {
        vibrator.vibrate(duration);
        if (isLong == true) {
            Toast.makeText(mContext, msg, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show();
        }

    }


    public void setMessage(String msg, boolean isLong)
    {
        if (isLong == true) {
            Toast.makeText(mContext, msg, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show();
        }
    }
}
