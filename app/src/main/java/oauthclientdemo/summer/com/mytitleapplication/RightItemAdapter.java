package oauthclientdemo.summer.com.mytitleapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * describe
 * Created by hui on 2017/4/25.
 */

public class RightItemAdapter extends RecyclerView.Adapter {
    public interface OnRightItemClickListener {
        void onRightItemClicked(int viewId, int position);
    }

    private Context mContext;
    private List<Integer> mData;
    private OnRightItemClickListener onItemClickListener;

    public RightItemAdapter(Context mContext, List<Integer> mData, OnRightItemClickListener onItemClickListener) {
        this.mContext = mContext;
        this.mData = mData;
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_view_holder, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        ItemViewHolder itemViewHolder = (ItemViewHolder) holder;
        itemViewHolder.imgItem.setImageResource(mData.get(position));
        itemViewHolder.imgItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onItemClickListener != null) {
                    onItemClickListener.onRightItemClicked(mData.get(position), position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgItem;

        public ItemViewHolder(View itemView) {
            super(itemView);
            imgItem = (ImageView) itemView.findViewById(R.id.img_item);
        }
    }
}
