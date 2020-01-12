package com.mushtaq.mydraganddeaw;

import android.graphics.PointF;

public class Box {
    private PointF mOrigin;
    private PointF mCurrent;

    public Box(PointF origin) {
        mOrigin = origin;
        mCurrent = origin;
    }


    public PointF getmOrigin() {
        return mOrigin;
    }

    public PointF getmCurrent() {
        return mCurrent;
    }

    public void setmCurrent(PointF mCurrent) {
        this.mCurrent = mCurrent;
    }
}
