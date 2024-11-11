package com.example.py_cube_mobile;

public class PatientDo {
 String patientId ="";
 String sampleId ="";
 String MRNNo ="";
 String surgicalSite ="";
 String destinationlab ="";
 String date ="";
 boolean isSelected = false;

 public String getPatientId() {
  return patientId;
 }

 public void setPatientId(String patientId) {
  this.patientId = patientId;
 }

 public String getSampleId() {
  return sampleId;
 }

 public void setSampleId(String sampleId) {
  this.sampleId = sampleId;
 }

 public String getMRNNo() {
  return MRNNo;
 }

 public void setMRNNo(String MRNNo) {
  this.MRNNo = MRNNo;
 }

 public String getSurgicalSite() {
  return surgicalSite;
 }

 public void setSurgicalSite(String surgicalSite) {
  this.surgicalSite = surgicalSite;
 }

 public String getDestinationlab() {
  return destinationlab;
 }

 public void setDestinationlab(String destinationlab) {
  this.destinationlab = destinationlab;
 }

 public String getDate() {
  return date;
 }

 public void setDate(String date) {
  this.date = date;
 }

 public boolean isSelected() {
  return isSelected;
 }

 public void setSelected(boolean selected) {
  isSelected = selected;
 }
}
