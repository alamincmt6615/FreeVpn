package com.bkSoft.evpn;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

/**
 * Created by alamin on 3-Dec-19.
 */

public class CustomTxTRegular extends android.support.v7.widget.AppCompatTextView {

    public CustomTxTRegular(Context context, AttributeSet attributeSet, int defstyle)
    {
        super(context,attributeSet,defstyle);
        init();
    }

    public CustomTxTRegular(Context context, AttributeSet attributeSet)
    {
        super(context,attributeSet);
        init();
    }

    public CustomTxTRegular(Context context)
    {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()){
            Typeface normalTypeface = Typeface.createFromAsset(getContext().getAssets(), "Montserrat-Regular.ttf");
            setTypeface(normalTypeface);
        }
    }
}
