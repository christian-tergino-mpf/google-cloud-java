// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/intent.proto

package com.google.cloud.dialogflow.v2;

public interface CreateIntentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.CreateIntentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The agent to create a intent for.
   * Format: `projects/&lt;Project ID&gt;/agent`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The agent to create a intent for.
   * Format: `projects/&lt;Project ID&gt;/agent`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The intent to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Intent intent = 2;</code>
   */
  boolean hasIntent();
  /**
   * <pre>
   * Required. The intent to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Intent intent = 2;</code>
   */
  com.google.cloud.dialogflow.v2.Intent getIntent();
  /**
   * <pre>
   * Required. The intent to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Intent intent = 2;</code>
   */
  com.google.cloud.dialogflow.v2.IntentOrBuilder getIntentOrBuilder();

  /**
   * <pre>
   * Optional. The language of training phrases, parameters and rich messages
   * defined in `intent`. If not specified, the agent's default language is
   * used. [More than a dozen
   * languages](https://dialogflow.com/docs/reference/language) are supported.
   * Note: languages must be enabled in the agent, before they can be used.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * Optional. The language of training phrases, parameters and rich messages
   * defined in `intent`. If not specified, the agent's default language is
   * used. [More than a dozen
   * languages](https://dialogflow.com/docs/reference/language) are supported.
   * Note: languages must be enabled in the agent, before they can be used.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();

  /**
   * <pre>
   * Optional. The resource view to apply to the returned intent.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.IntentView intent_view = 4;</code>
   */
  int getIntentViewValue();
  /**
   * <pre>
   * Optional. The resource view to apply to the returned intent.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.IntentView intent_view = 4;</code>
   */
  com.google.cloud.dialogflow.v2.IntentView getIntentView();
}
