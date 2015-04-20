package swatchwatch.ovenbits.com.swatchwatch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView mEyes;
    private TextView mLips;
    private TextView mFace;
    private TextView mBody;
    private TextView mNaked;
    private TextView mPalletes;

    private View.OnClickListener mClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                mEyes = (TextView) stub.findViewById(R.id.eyes);
                mLips = (TextView) stub.findViewById(R.id.lips);
                mFace = (TextView) stub.findViewById(R.id.face);
                mBody = (TextView) stub.findViewById(R.id.body);
                mNaked = (TextView) stub.findViewById(R.id.naked);
                mPalletes = (TextView) stub.findViewById(R.id.palletes);


            }
        });
    }
}
