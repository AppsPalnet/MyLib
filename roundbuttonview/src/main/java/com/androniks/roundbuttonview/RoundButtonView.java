package com.androniks.roundbuttonview;

import android.content.Context;
import android.util.AttributeSet;

public class RoundButtonView extends android.support.v7.widget.AppCompatButton {
    public RoundButtonView(Context context) {
        super(context);
        setBackgroundResource(R.drawable.roundedbutton);
        setTextColor(context.getResources().getColor(R.color.white));
    }

    public RoundButtonView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBackgroundResource(R.drawable.roundedbutton);
        setTextColor(context.getResources().getColor(R.color.white));
    }

}
