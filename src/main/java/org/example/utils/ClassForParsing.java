package org.example.utils;

import java.util.List;

public class ClassForParsing {
   private int point;
   private double longitude;
   private double latitude;
   private List<TimeSettele> visible;
   public int getPoint() {
      return point;
   }

   public void setPoint(int point) {
      this.point = point;
   }

   public double getLongitude() {
      return longitude;
   }

   public void setLongitude(double longitude) {
      this.longitude = longitude;
   }

   public double getLatitude() {
      return latitude;
   }

   public void setLatitude(double latitude) {
      this.latitude = latitude;
   }

   public List<TimeSettele> getVisible() {
      return visible;
   }

   public void setVisible(List<TimeSettele> visible) {
      this.visible = visible;
   }
}

