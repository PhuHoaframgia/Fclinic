package com.framgia.capstone.ui.datlich;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.framgia.capstone.R;
import com.framgia.capstone.data.model.LichKham;
import java.util.List;

/**
 * Created by tri on 30/04/2017.
 */

public class LIchDaDatAdapter extends RecyclerView.Adapter<LIchDaDatAdapter.LIchDaDatViewholder> {

    private List<LichKham> mList;
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private ItemClickListener mClickListener;

    public LIchDaDatAdapter(Context context, List<LichKham> list, ItemClickListener itemClickListener) {
        mContext = context;
        mList = list;
        mLayoutInflater = LayoutInflater.from(context);
        mClickListener = itemClickListener;
    }

    public void updateData(List<LichKham> list) {
        if (list != null) {
            return;
        }
        mList.clear();
        mList.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public LIchDaDatViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mLayoutInflater.inflate(R.layout.item_lichdadat, parent, false);
        return new LIchDaDatViewholder(itemView);
    }

    @Override
    public void onBindViewHolder(LIchDaDatViewholder holder, int position) {
        holder.bindData(mList.get(position));
    }

    @Override
    public int getItemCount() {
        return mList != null ? mList.size() : 0;
    }

    public interface ItemClickListener {
        void onClick(int position);
        void onHuy(LichKham lichKham);
    }

    public class LIchDaDatViewholder extends RecyclerView.ViewHolder
            implements View.OnClickListener {
        @BindView(R.id.text_mota)
        TextView mMoTa;
        @BindView(R.id.text_time)
        TextView mTime;
        @BindView(R.id.text_ngay)
        TextView mNgay;
        @BindView(R.id.button_huy)
        Button mButtonHuy;

        public LIchDaDatViewholder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(this);
        }

        public void bindData(LichKham lichKham) {
            mMoTa.setText(lichKham.getMota());
            mTime.setText(lichKham.getTgBatDau() + " - " + lichKham.getTgKetThuc());
            mNgay.setText(lichKham.getNgay());
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onClick(getAdapterPosition());
        }
        @OnClick(R.id.button_huy)
        public void onHuyClick() {
            mClickListener.onHuy(mList.get(getAdapterPosition()));
        }
    }
}
