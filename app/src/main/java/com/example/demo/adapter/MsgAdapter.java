package com.example.demo.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demo.R;
import com.example.demo.entity.Msg;

import java.util.List;

public class MsgAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Msg> msgList; //所有消息

    public MsgAdapter(List<Msg> msgList) {
        super();
        this.msgList = msgList;
    }

    //两个Holder风别用于缓存item_msg_left.xml和item_msg_right.xml布局中的控件
    class LeftViewHolder extends RecyclerView.ViewHolder {

        private final TextView leftMsg;

        public LeftViewHolder(@NonNull View view) {
            super(view);
            this.leftMsg = view.findViewById(R.id.leftMsg);
        }
    }

    class RightViewHolder extends RecyclerView.ViewHolder {

        private final TextView rightMsg;

        public RightViewHolder(@NonNull View view) {
            super(view);
            this.rightMsg = view.findViewById(R.id.rightMsg);
        }
    }

    @Override
    public int getItemViewType(int position) {
        Msg msg = this.msgList.get(position);
        return msg.getType();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == Msg.TYPE_RECEIVED) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_msg_left, parent, false);
            return new LeftViewHolder(view);
        } else {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_msg_right, parent, false);
            return new RightViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Msg msg = msgList.get(position);
        if (holder.getClass().equals(LeftViewHolder.class)) {
            ((LeftViewHolder) holder).leftMsg.setText(msg.getContent());
        } else if (holder.getClass().equals(RightViewHolder.class)) {
            ((RightViewHolder) holder).rightMsg.setText(msg.getContent());
        } else {
            assert false;
        }
    }

    @Override
    public int getItemCount() {
        return this.msgList.size();
    }
}
