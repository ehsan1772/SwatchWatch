package swatchwatch.ovenbits.com.swatchwatch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.view.View;
import android.widget.TextView;

import com.ovenbits.frosting.view.ProductPhotoGallery;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ehsan Barekati on 4/20/15.
 */
public class SecondActivity extends Activity {
    private ProductPhotoGallery mGallery;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                    mGallery = (ProductPhotoGallery) findViewById(R.id.productDetailProductPhotoGallery);

                List<Integer> images = new ArrayList<Integer>();

                images.add(R.drawable.lip1);
                images.add(R.drawable.lip2);
                images.add(R.drawable.lip3);

                mGallery.setImageResources(images);

                mGallery.setListener(new ProductPhotoGallery.GalleryClickListener() {
                    @Override
                    public void onClick(int position) {
                        Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                        startActivity(intent);
                    }
                });


            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

//        List<Integer> images = new ArrayList<Integer>();
//
//        images.add(R.drawable.lip1);
//        images.add(R.drawable.lip2);
//        images.add(R.drawable.lip2);
//
//        mGallery.setImageResources(images);
    }
}
