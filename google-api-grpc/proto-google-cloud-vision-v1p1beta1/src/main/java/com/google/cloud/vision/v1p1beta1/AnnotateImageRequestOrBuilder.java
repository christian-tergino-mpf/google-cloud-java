// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p1beta1/image_annotator.proto

package com.google.cloud.vision.v1p1beta1;

public interface AnnotateImageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p1beta1.AnnotateImageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The image to be processed.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p1beta1.Image image = 1;</code>
   */
  boolean hasImage();
  /**
   * <pre>
   * The image to be processed.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p1beta1.Image image = 1;</code>
   */
  com.google.cloud.vision.v1p1beta1.Image getImage();
  /**
   * <pre>
   * The image to be processed.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p1beta1.Image image = 1;</code>
   */
  com.google.cloud.vision.v1p1beta1.ImageOrBuilder getImageOrBuilder();

  /**
   * <pre>
   * Requested features.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.Feature features = 2;</code>
   */
  java.util.List<com.google.cloud.vision.v1p1beta1.Feature> 
      getFeaturesList();
  /**
   * <pre>
   * Requested features.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.Feature features = 2;</code>
   */
  com.google.cloud.vision.v1p1beta1.Feature getFeatures(int index);
  /**
   * <pre>
   * Requested features.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.Feature features = 2;</code>
   */
  int getFeaturesCount();
  /**
   * <pre>
   * Requested features.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.Feature features = 2;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1p1beta1.FeatureOrBuilder> 
      getFeaturesOrBuilderList();
  /**
   * <pre>
   * Requested features.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.Feature features = 2;</code>
   */
  com.google.cloud.vision.v1p1beta1.FeatureOrBuilder getFeaturesOrBuilder(
      int index);

  /**
   * <pre>
   * Additional context that may accompany the image.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p1beta1.ImageContext image_context = 3;</code>
   */
  boolean hasImageContext();
  /**
   * <pre>
   * Additional context that may accompany the image.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p1beta1.ImageContext image_context = 3;</code>
   */
  com.google.cloud.vision.v1p1beta1.ImageContext getImageContext();
  /**
   * <pre>
   * Additional context that may accompany the image.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p1beta1.ImageContext image_context = 3;</code>
   */
  com.google.cloud.vision.v1p1beta1.ImageContextOrBuilder getImageContextOrBuilder();
}
