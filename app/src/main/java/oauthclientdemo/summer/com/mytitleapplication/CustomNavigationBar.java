package oauthclientdemo.summer.com.mytitleapplication;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * describe 自定义导航栏
 * Created by hui on 2017/4/25.
 */

public class CustomNavigationBar extends LinearLayout {
    private static final String TAG = "CustomNavigationBar";
    private RecyclerView mRrclLeft;
    private RecyclerView mRclRight;
    private TextView mTvCentreTitle;
    private RightItemAdapter mRightItemAdapter;
    private Context mContext;


    public CustomNavigationBar(Context context) {
        super(context);
        initView(context);
    }

    public CustomNavigationBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public CustomNavigationBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
        mContext = context;
        View inflate = LayoutInflater.from(mContext).inflate(R.layout.layout_custom_navigation_bar, this, true);
        mRrclLeft = (RecyclerView) inflate.findViewById(R.id.rcl_left);
        mRclRight = (RecyclerView) inflate.findViewById(R.id.rcl_right);
        mTvCentreTitle = (TextView) inflate.findViewById(R.id.tv_centre_title);


    }

    public void initLeftRclData(List<ImageView> data, Activity activity) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity);
        mRrclLeft.setLayoutManager(linearLayoutManager);
    }

    public void initRightRclData(List<Integer> data, Activity activity) {
        GridLayoutManager linearLayoutManager = new GridLayoutManager(activity, data.size());
        mRclRight.setLayoutManager(linearLayoutManager);
        mRightItemAdapter = new RightItemAdapter(mContext, data, (RightItemAdapter.OnRightItemClickListener) activity);
        mRclRight.setAdapter(mRightItemAdapter);
    }


}
