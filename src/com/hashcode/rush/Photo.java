package com.hashcode.rush;

import java.util.List;

public class Photo {

  private int id;
  private String orientation;
  private List<String> tags;

  public Photo(int id, String orientation, List<String> tags) {
    this.id = id;
    this.orientation = orientation;
    this.tags = tags;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getOrientation() {
    return orientation;
  }

  public void setOrientation(String orientation) {
    this.orientation = orientation;
  }

  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  @Override
  public String toString() {
    return "Photo{"
        + "id="
        + id
        + ", orientation="
        + orientation
        + ", tags=["
        + joinTags(tags)
        + "]}";
  }

  public String joinTags(List<String> tags) {
    StringBuilder sb = new StringBuilder();
    for (String tag : tags) {
      sb.append(tag).append(",");
    }
    sb.deleteCharAt(sb.lastIndexOf(","));
    return sb.toString();
  }
}
