package com.olegsagenadatrytwo.w6_d4_customviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

/**
 * Created by omcna on 9/11/2017.
 */

public class CustomTextView extends android.support.v7.widget.AppCompatTextView {
    public CustomTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.CustomViewTextView);
        String fontName = a.getString(R.styleable.CustomViewTextView_fontName);
        if (fontName!=null) {
            Typeface myTypeface = Typeface.createFromAsset(getContext().getAssets(), "fonts/"+fontName);
            setTypeface(myTypeface);
        }
        a.recycle();
    }
}
