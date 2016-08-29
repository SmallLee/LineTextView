package com.fang.linetextview;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * 带有下划线和删除线的TextView
 */
public class LineTextView extends TextView {

    public static final int MIDDLE = 0;
    public static final int BOTTOM = 1;
    public LineTextView(Context context) {
        this(context,null);
    }
    public LineTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

//    public void setLinePosition(int linePosition){
//        getPaint().setAntiAlias(true);
//        switch (linePosition){
//            case MIDDLE:
//                getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
//                break;
//            case BOTTOM:
//                getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
//                break;
//        }
//    }

//    @Override
//    public void setText(CharSequence text, BufferType type) {
//        super.setText(text, type);
//    }

    public void setText(CharSequence text, int linePosition){
        super.setText(text);
        getPaint().setAntiAlias(true);
        switch (linePosition){
            case MIDDLE:
                getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
                break;
            case BOTTOM:
                getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
                break;
        }
    }
}
