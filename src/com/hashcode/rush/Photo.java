package com.hashcode.rush;

import java.util.List;
import java.util.Set;

public class Photo {

  private int id;
  private String orientation;
  private Set<String> tags;

  public Photo(int id, String orientation, Set<String> tags) {
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

  public Set<String> getTags() {
    return tags;
  }

  public void setTags(Set<String> tags) {
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

  public String joinTags(Set<String> tags) {
    StringBuilder sb = new StringBuilder();
    for (String tag : tags) {
      sb.append(tag).append(",");
    }
    sb.deleteCharAt(sb.lastIndexOf(","));
    return sb.toString();
  }
}
