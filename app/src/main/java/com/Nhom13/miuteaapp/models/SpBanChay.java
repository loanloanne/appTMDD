package com.Nhom13.miuteaapp.models;

public class SpBanChay {
   int photoSpBanChay;
   String NameSpBanChay;

   public SpBanChay(int photoSpBanChay, String nameSpBanChay) {
      this.photoSpBanChay = photoSpBanChay;
      NameSpBanChay = nameSpBanChay;
   }

   public int getPhotoSpBanChay() {
      return photoSpBanChay;
   }

   public void setPhotoSpBanChay(int photoSpBanChay) {
      this.photoSpBanChay = photoSpBanChay;
   }

   public String getNameSpBanChay() {
      return NameSpBanChay;
   }

   public void setNameSpBanChay(String nameSpBanChay) {
      NameSpBanChay = nameSpBanChay;
   }
}
