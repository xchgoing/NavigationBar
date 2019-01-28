package com.example.administrator;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    dhl mdhl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mdhl=findViewById(R.id.main_dhl);
        mdhl.setImg2(getSelector(getDrawable(R.drawable.icon2),getDrawable(R.drawable.icon2s)));
        mdhl.setImg3(getSelector(getDrawable(R.drawable.icon2),getDrawable(R.drawable.icon2s)));
        mdhl.setImg4(getSelector(getDrawable(R.drawable.icon2),getDrawable(R.drawable.icon2s)));
        mdhl.setTv3("Jset3");
        mdhl.setTv4("Jset4");
        mdhl.setDhlOnClickListener(new dhl.dhlOnClickListener() {
            @Override
            public void itemOneOnClickDemo() {
                Toast.makeText(MainActivity.this,"点了第一个",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void itemTwoOnClickDemo() {
                Toast.makeText(MainActivity.this,"点了第二个",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void itemThreeOnClickDemo() {
                Toast.makeText(MainActivity.this,"点了第三个",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void itemFourOnClickDemo() {
                Toast.makeText(MainActivity.this,"点了第四个",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public StateListDrawable getSelector(Drawable normalDra,Drawable pfsDra)
    {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_selected},pfsDra);
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed},pfsDra);
        stateListDrawable.addState(new int[]{android.R.attr.state_focused},pfsDra);
        stateListDrawable.addState(new int[]{},normalDra);

        return stateListDrawable;
    }

}
