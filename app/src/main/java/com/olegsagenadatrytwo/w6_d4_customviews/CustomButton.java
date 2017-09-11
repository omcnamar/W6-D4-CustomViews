package com.olegsagenadatrytwo.w6_d4_customviews;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by omcna on 9/11/2017.
 */

public class CustomButton extends android.support.v7.widget.AppCompatButton{

    private int parentId;
    private int cellId;
    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public void setParentId(int parentId){
        this.parentId=parentId;
    }

    public void setCellId(int cellId){
        this.cellId=cellId;
    }

    public int getParentId(){
        return this.parentId;
    }

    public int getCellId(){
        return this.cellId;
    }
}
