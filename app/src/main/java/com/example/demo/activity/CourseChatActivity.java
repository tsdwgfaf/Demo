package com.example.demo.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demo.R;
import com.example.demo.adapter.MsgAdapter;
import com.example.demo.entity.Msg;

import java.util.ArrayList;
import java.util.List;

public class CourseChatActivity extends AppCompatActivity {

    private final List<Msg> msgList = new ArrayList<>();
    private MsgAdapter adapter = null;

    private RecyclerView msgRecyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_chat);
        initMsg();
        msgRecyclerView = findViewById(R.id.recycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        msgRecyclerView.setLayoutManager(linearLayoutManager);
        this.adapter = new MsgAdapter(this.msgList);
        msgRecyclerView.setAdapter(this.adapter);
    }

    //点击按钮后发送消息
    public void sendMsg(View v) {
        TextView textView = findViewById(R.id.msgTextView);
        String content = textView.getText().toString(); // 获取消息
        if (!"".equals(content)) { // 消息不为空时发送
            Msg sendMsg = new Msg(content, Msg.TYPE_SEND);
            this.msgList.add(sendMsg);
            adapter.notifyItemInserted(this.msgList.size() - 1); // 刷新
            msgRecyclerView.scrollToPosition(this.msgList.size() - 1); // 将ListView定位到最后一行
            textView.setText(""); // 清空输入框
        }
    }

    private void initMsg() {
        this.msgList.add(new Msg(
                "你好",
                Msg.TYPE_RECEIVED
        ));
        this.msgList.add(new Msg(
                "你好",
                Msg.TYPE_SEND
        ));
    }
}