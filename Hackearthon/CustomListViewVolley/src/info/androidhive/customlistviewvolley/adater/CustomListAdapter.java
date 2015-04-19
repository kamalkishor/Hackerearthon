package info.androidhive.customlistviewvolley.adater;

import info.androidhive.customlistviewvolley.R;
import info.androidhive.customlistviewvolley.app.AppController;
import info.androidhive.customlistviewvolley.model.Challenge;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

public class CustomListAdapter extends BaseAdapter {
	private Activity activity;
	private LayoutInflater inflater;
	private List<Challenge> challengeItems;
	ImageLoader imageLoader = AppController.getInstance().getImageLoader();

	public CustomListAdapter(Activity activity, List<Challenge> challengeItems) {
		this.activity = activity;
		this.challengeItems = challengeItems;
	}

	@Override
	public int getCount() {
		return challengeItems.size();
	}

	@Override
	public Object getItem(int location) {
		return challengeItems.get(location);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		if (inflater == null)
			inflater = (LayoutInflater) activity
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		if (convertView == null)
			convertView = inflater.inflate(R.layout.list_row, null);

//		if (imageLoader == null)
//			imageLoader = AppController.getInstance().getImageLoader();
//		NetworkImageView thumbNail = (NetworkImageView) convertView
//				.findViewById(R.id.thumbnail);
		TextView title = (TextView) convertView.findViewById(R.id.title);
		TextView rating = (TextView) convertView.findViewById(R.id.rating);
		TextView rating2 = (TextView) convertView.findViewById(R.id.rating2);
		TextView challenge_type = (TextView) convertView.findViewById(R.id.challenge_type);
		TextView challenge_Description = (TextView) convertView.findViewById(R.id.challenge_Description);
		// getting movie data for the row
		Challenge m = challengeItems.get(position);

		// thumbnail image
	//	thumbNail.setImageUrl(m.getThumbnailUrl(), imageLoader);
		
		// title
		title.setText(m.getTitle());
		//Description
		challenge_Description.setText(m.getDescription());
		
		
		// Opens at
		rating.setText("Opens at : " + (m.getStartTimeStamp()));
		// Closes on
		rating2.setText("Closes on : " + (m.getEndTimeStamp()));
		// Type
		challenge_type.setText("Challenge Type : " + (m.getType()));		
		
		return convertView;
	}

}