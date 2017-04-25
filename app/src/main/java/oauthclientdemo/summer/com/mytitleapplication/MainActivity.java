package oauthclientdemo.summer.com.mytitleapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RightItemAdapter.OnRightItemClickListener {
    private static final String TAG = "MainActivity";
    private CustomNavigationBar customNavigationBar;
    private List<Integer> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customNavigationBar = (CustomNavigationBar) findViewById(R.id.cnb);
        list.add(R.drawable.search);
        list.add(R.drawable.notice);
        customNavigationBar.initRightRclData(list, this);
    }

    @Override
    public void onRightItemClicked(int viewId, int position) {
        Log.d(TAG, "po-->" + R.drawable.search);
        Log.d(TAG, "po-->" + R.drawable.notice);
        switch (viewId) {
            case R.drawable.search:
                Log.d(TAG, "po-->search");
                break;
            case R.drawable.notice:
                Log.d(TAG, "po-->notice");
                break;
        }
    }
}
