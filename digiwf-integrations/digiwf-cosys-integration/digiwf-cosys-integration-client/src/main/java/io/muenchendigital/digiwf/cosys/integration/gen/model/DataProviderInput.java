/*
 * cosys-eai
 * This application provides the routing for calls from Fachanwendungen to coSys.
 *
 * The version of the OpenAPI document: 2.1.5-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.muenchendigital.digiwf.cosys.integration.gen.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Representing JSON with individual content.
 */
@ApiModel(description = "Representing JSON with individual content.")
@JsonPropertyOrder({
  DataProviderInput.JSON_PROPERTY_UID,
  DataProviderInput.JSON_PROPERTY_NAME,
  DataProviderInput.JSON_PROPERTY_MAIL,
  DataProviderInput.JSON_PROPERTY_ORG,
  DataProviderInput.JSON_PROPERTY_DATA_POOL_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DataProviderInput {
  public static final String JSON_PROPERTY_UID = "uid";
  private String uid;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_MAIL = "mail";
  private String mail;

  public static final String JSON_PROPERTY_ORG = "org";
  private String org;

  public static final String JSON_PROPERTY_DATA_POOL_ID = "dataPoolId";
  private String dataPoolId;

  public DataProviderInput() {
  }

  public DataProviderInput uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * User id (lhmObjectId) of the receiver.
   * @return uid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User id (lhmObjectId) of the receiver.")
  @JsonProperty(JSON_PROPERTY_UID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUid() {
    return uid;
  }


  @JsonProperty(JSON_PROPERTY_UID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUid(String uid) {
    this.uid = uid;
  }


  public DataProviderInput name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of receiver or a part part of it.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Fridolin Fröhlich", value = "The name of receiver or a part part of it.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public DataProviderInput mail(String mail) {
    
    this.mail = mail;
    return this;
  }

   /**
   * Email of the receiver.
   * @return mail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "tb.00cosys01@muenchen.de", value = "Email of the receiver.")
  @JsonProperty(JSON_PROPERTY_MAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMail() {
    return mail;
  }


  @JsonProperty(JSON_PROPERTY_MAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMail(String mail) {
    this.mail = mail;
  }


  public DataProviderInput org(String org) {
    
    this.org = org;
    return this;
  }

   /**
   * Office of the receiver.
   * @return org
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Office of the receiver.")
  @JsonProperty(JSON_PROPERTY_ORG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrg() {
    return org;
  }


  @JsonProperty(JSON_PROPERTY_ORG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrg(String org) {
    this.org = org;
  }


  public DataProviderInput dataPoolId(String dataPoolId) {
    
    this.dataPoolId = dataPoolId;
    return this;
  }

   /**
   * The data pool id.
   * @return dataPoolId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The data pool id.")
  @JsonProperty(JSON_PROPERTY_DATA_POOL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDataPoolId() {
    return dataPoolId;
  }


  @JsonProperty(JSON_PROPERTY_DATA_POOL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataPoolId(String dataPoolId) {
    this.dataPoolId = dataPoolId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataProviderInput dataProviderInput = (DataProviderInput) o;
    return Objects.equals(this.uid, dataProviderInput.uid) &&
        Objects.equals(this.name, dataProviderInput.name) &&
        Objects.equals(this.mail, dataProviderInput.mail) &&
        Objects.equals(this.org, dataProviderInput.org) &&
        Objects.equals(this.dataPoolId, dataProviderInput.dataPoolId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, name, mail, org, dataPoolId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataProviderInput {\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    dataPoolId: ").append(toIndentedString(dataPoolId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

