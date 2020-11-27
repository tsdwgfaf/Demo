package com.example.demo.ui.mine;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.demo.R;

public class MineItemView extends LinearLayout {
    private ImageView imageView;
    private TextView textView;
    public MineItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(getContext()).inflate(R.layout.mine_item_view,this);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.MineItemView);
        imageView = findViewById(R.id.mine_icon);
        textView = findViewById(R.id.mine_text);
        textView.setText(typedArray.getString(R.styleable.MineItemView_mine_text));
        imageView.setBackgroundResource(typedArray.getResourceId(R.styleable.MineItemView_mine_icon, R.drawable.ic_baseline_settings_24));
        typedArray.recycle();
    }
}
