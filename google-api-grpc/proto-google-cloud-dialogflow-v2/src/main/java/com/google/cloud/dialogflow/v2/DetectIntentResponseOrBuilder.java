// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/session.proto

package com.google.cloud.dialogflow.v2;

public interface DetectIntentResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.DetectIntentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The unique identifier of the response. It can be used to
   * locate a response in the training example set or for reporting issues.
   * </pre>
   *
   * <code>string response_id = 1;</code>
   */
  java.lang.String getResponseId();
  /**
   * <pre>
   * The unique identifier of the response. It can be used to
   * locate a response in the training example set or for reporting issues.
   * </pre>
   *
   * <code>string response_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getResponseIdBytes();

  /**
   * <pre>
   * The results of the conversational query or event processing.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.QueryResult query_result = 2;</code>
   */
  boolean hasQueryResult();
  /**
   * <pre>
   * The results of the conversational query or event processing.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.QueryResult query_result = 2;</code>
   */
  com.google.cloud.dialogflow.v2.QueryResult getQueryResult();
  /**
   * <pre>
   * The results of the conversational query or event processing.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.QueryResult query_result = 2;</code>
   */
  com.google.cloud.dialogflow.v2.QueryResultOrBuilder getQueryResultOrBuilder();

  /**
   * <pre>
   * Specifies the status of the webhook request. `webhook_status`
   * is never populated in webhook requests.
   * </pre>
   *
   * <code>.google.rpc.Status webhook_status = 3;</code>
   */
  boolean hasWebhookStatus();
  /**
   * <pre>
   * Specifies the status of the webhook request. `webhook_status`
   * is never populated in webhook requests.
   * </pre>
   *
   * <code>.google.rpc.Status webhook_status = 3;</code>
   */
  com.google.rpc.Status getWebhookStatus();
  /**
   * <pre>
   * Specifies the status of the webhook request. `webhook_status`
   * is never populated in webhook requests.
   * </pre>
   *
   * <code>.google.rpc.Status webhook_status = 3;</code>
   */
  com.google.rpc.StatusOrBuilder getWebhookStatusOrBuilder();
}
