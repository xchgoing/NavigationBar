package com.example.administrator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.StateListDrawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class dhl extends LinearLayout {
    private int selected=1;
    private int icon1;
    private int icon2;
    private int icon3;
    private int icon4;
    private String itext1;
    private String itext2;
    private String itext3;
    private String itext4;

    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private ImageView img4;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private View item1;
    private View item2;
    private View item3;
    private View item4;


    private dhlOnClickListener mDhlOnClickListener;

    public interface dhlOnClickListener
    {
        public void itemOneOnClickDemo();
        public void itemTwoOnClickDemo();
        public void itemThreeOnClickDemo();
        public void itemFourOnClickDemo();
    }


    public void setDhlOnClickListener(dhlOnClickListener d)
    {
        mDhlOnClickListener=d;
    }

    public dhl(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.dhl,this,true);
        img1=(ImageView) findViewById(R.id.dhl_icon_1);
        img2=(ImageView) findViewById(R.id.dhl_icon_2);
        img3=(ImageView) findViewById(R.id.dhl_icon_3);
        img4=(ImageView) findViewById(R.id.dhl_icon_4);

        tv1=(TextView)findViewById(R.id.dhl_text_1);
        tv2=(TextView)findViewById(R.id.dhl_text_2);
        tv3=(TextView)findViewById(R.id.dhl_text_3);
        tv4=(TextView)findViewById(R.id.dhl_text_4);

        item1=(LinearLayout) findViewById(R.id.dhl_item1);
        item2=(LinearLayout) findViewById(R.id.dhl_item2);
        item3=(LinearLayout) findViewById(R.id.dhl_item3);
        item4=(LinearLayout) findViewById(R.id.dhl_item4);
        if(attrs!=null)
        {
            TypedArray t=context.obtainStyledAttributes(attrs,R.styleable.dhl);
            icon1=t.getResourceId(R.styleable.dhl_dhl_icon_1,-1);
            icon2=t.getResourceId(R.styleable.dhl_dhl_icon_2,-1);
            icon3=t.getResourceId(R.styleable.dhl_dhl_icon_3,-1);
            icon4=t.getResourceId(R.styleable.dhl_dhl_icon_4,-1);

            itext1=t.getString(R.styleable.dhl_dhl_text_1);
            itext2=t.getString(R.styleable.dhl_dhl_text_2);
            itext3=t.getString(R.styleable.dhl_dhl_text_3);
            itext4=t.getString(R.styleable.dhl_dhl_text_4);



            if(icon1!=-1)img1.setImageResource(icon1);
            if(icon2!=-1)img2.setImageResource(icon2);
            if(icon3!=-1)img3.setImageResource(icon3);
            if(icon4!=-1)img4.setImageResource(icon4);

            if(itext1!=null)tv1.setText(itext1);
            if(itext2!=null)tv2.setText(itext2);
            if(itext3!=null)tv3.setText(itext3);
            if(itext4!=null)tv4.setText(itext4);

            t.recycle();
        }

        item1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                changeSelect(1);
                mDhlOnClickListener.itemOneOnClickDemo();
            }
        });

        item2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                changeSelect(2);
                mDhlOnClickListener.itemTwoOnClickDemo();
            }
        });

        item3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                changeSelect(3);
                mDhlOnClickListener.itemThreeOnClickDemo();
            }
        });

        item4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                changeSelect(4);
                mDhlOnClickListener.itemFourOnClickDemo();
            }
        });


    }

    public void setImg1(int rid) {
        this.img1.setImageResource(rid);
    }
    public void setImg1(StateListDrawable stateListDrawable) {
        img1.setImageDrawable(stateListDrawable);
    }

    public void setImg2(int rid) {
        this.img2.setImageResource(rid);
    }
    public void setImg2(StateListDrawable stateListDrawable) {
        this.img2.setImageDrawable(stateListDrawable);
    }



    public void setImg3(int rid) {
        this.img3.setImageResource(rid);
    }
    public void setImg3(StateListDrawable stateListDrawable) {
        this.img3.setImageDrawable(stateListDrawable);
    }



    public void setImg4(int rid) {
        this.img4.setImageResource(rid);
    }
    public void setImg4(StateListDrawable stateListDrawable) {
        this.img4.setImageDrawable(stateListDrawable);
    }




    public void setTv1(String text) {
        this.tv1.setText(text);
    }

    public void setTv2(String text) {
        this.tv2.setText(text);
    }

    public void setTv3(String text) {
        this.tv3.setText(text);
    }

    public void setTv4(String text) {
        this.tv4.setText(text);
    }


    private void changeSelect(int i)
    {
        img1.setSelected(false);
        img2.setSelected(false);
        img3.setSelected(false);
        img4.setSelected(false);
        switch (i)
        {
            case 1:
                img1.setSelected(true);
                selected=1;
                break;
            case 2:
                img2.setSelected(true);
                selected=2;
                break;
            case 3:
                img3.setSelected(true);
                selected=3;
                break;
            case 4:
                img4.setSelected(true);
                selected=4;
                break;
        }
    }
}
