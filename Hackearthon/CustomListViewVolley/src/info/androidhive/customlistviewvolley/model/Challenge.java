package info.androidhive.customlistviewvolley.model;

import java.util.ArrayList;

public class Challenge {
	private String title,  description, startTimeStamp, endTimeStamp, type;//thumbnailUrl

	public Challenge() {
	}

	public Challenge(String name,  String description,  String startTimeStamp, String endTimeStamp, String type) {
		this.title = name;
		//this.thumbnailUrl = thumbnailUrl;
		this.description = description ;
		this.startTimeStamp=startTimeStamp;
		this.endTimeStamp = endTimeStamp;
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String name) {
		this.title = name;
	}

//	public String getThumbnailUrl() {
//		return thumbnailUrl;
//	}
//
//	public void setThumbnailUrl(String thumbnailUrl) {
//		this.thumbnailUrl = thumbnailUrl;
//	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

	public String getStartTimeStamp() {
		return startTimeStamp;
	}

	public void setStartTimeStamp(String startTimeStamp) {
		this.startTimeStamp = startTimeStamp;
	}


	public String getEndTimeStamp() {
		return endTimeStamp;
	}

	public void setEndTimeStamp(String endTimeStamp) {
		this.endTimeStamp = endTimeStamp;
	}


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
}
