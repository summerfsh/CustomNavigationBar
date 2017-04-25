package oauthclientdemo.summer.com.mytitleapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * describe 自定义导航栏
 * Created by hui on 2017/4/25.
 */

public class CustomNavigationBar extends LinearLayout {
    public CustomNavigationBar(Context context) {
        super(context);
        initView();
    }



    public CustomNavigationBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public CustomNavigationBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {
    }
}
