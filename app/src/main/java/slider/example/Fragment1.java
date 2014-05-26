package slider.example;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Smooth Horizontal View Slider
 * 
 * Second Fragment (or former View)
 * 
 * @see http://www.e-nature.ch/tech
 * @author Dominik Erbsland
 */
public class Fragment1 extends Fragment {

	private LinearLayout ll;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		if (container == null) {
			return null;
		}

		ll = (LinearLayout) inflater.inflate(R.layout.fragment1_layout, container, false);
		ll.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				String url = "https://market.android.com/details?id=com.cheatdatabase.android";
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse(url));
				startActivity(i);
			}

		});

		return ll;
	}
}