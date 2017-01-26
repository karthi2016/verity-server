/**
 * VerityReputation
 * This is a simple Verity reputation API. You can find out more about Verity at <a href='http://getcrystal.net'>http://getcrystal.net</a>  For this sample, you can use the api key 'special-key' for tests that need authorization (authorization filters).  Where possible we specify multi-hashes as unique identifiers that can be used by distributed cryptographically secure systems (blockchains) Where possible we specify hyper-media links (e.g. JSON-LD) to describe data that is linked in graph structures by nature (blockchain data, IPFS data, etc.)  Agents, Entity and Activity should map to provenance ontology described in https://www.w3.org/TR/prov-o Transaction is an implementation that maps to TrustAtoms. https://github.com/CoMakery/trust-exchange/blob/master/README.md This is a simple Verity reputation API. You can find out more about Verity at <a href='http://getcrystal.net'>http://getcrystal.net</a>  For this sample, you can use the api key 'special-key' for tests that need authorization (authorization filters).  Where possible we specify multi-hashes as unique identifiers that can be used by distributed cryptographically secure systems (blockchains) Where possible we specify hyper-media links (e.g. JSON-LD) to describe data that is linked in graph structures by nature (blockchain data, IPFS data, etc.)  Agents, Entity and Activity should map to provenance ontology described in https://www.w3.org/TR/prov-o Transaction is an implementation that maps to TrustAtoms. https://github.com/CoMakery/trust-exchange/blob/master/README.md
 *
 * OpenAPI spec version: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package site.verity.client.mode;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * represents the type of action performed when giving reputation, e.g. upvote, points, rating
 */
@ApiModel(description = "represents the type of action performed when giving reputation, e.g. upvote, points, rating")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-25T09:44:21.918-08:00")
public class ActionType   {
  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("actionName")
  private String actionName = null;

  @SerializedName("communityId")
  private String communityId = null;

  @SerializedName("defaultPoints")
  private Integer defaultPoints = null;

  @SerializedName("content")
  private String content = null;

  public ActionType uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * UUID, GUID, HASH,  MultiHash or ProxyContract Address that represents this object
   * @return uuid
  **/
  @ApiModelProperty(example = "null", required = true, value = "UUID, GUID, HASH,  MultiHash or ProxyContract Address that represents this object")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public ActionType actionName(String actionName) {
    this.actionName = actionName;
    return this;
  }

   /**
   * Can represent any type of reputation as a verb. Use verb to describe act of giving or rating, e.g. upvote, give points, tagged, rate.
   * @return actionName
  **/
  @ApiModelProperty(example = "null", required = true, value = "Can represent any type of reputation as a verb. Use verb to describe act of giving or rating, e.g. upvote, give points, tagged, rate.")
  public String getActionName() {
    return actionName;
  }

  public void setActionName(String actionName) {
    this.actionName = actionName;
  }

  public ActionType communityId(String communityId) {
    this.communityId = communityId;
    return this;
  }

   /**
   * Community that defined this ActionType. Multi-hash or JSON-LD
   * @return communityId
  **/
  @ApiModelProperty(example = "null", required = true, value = "Community that defined this ActionType. Multi-hash or JSON-LD")
  public String getCommunityId() {
    return communityId;
  }

  public void setCommunityId(String communityId) {
    this.communityId = communityId;
  }

  public ActionType defaultPoints(Integer defaultPoints) {
    this.defaultPoints = defaultPoints;
    return this;
  }

   /**
   * points to award in default case
   * @return defaultPoints
  **/
  @ApiModelProperty(example = "null", value = "points to award in default case")
  public Integer getDefaultPoints() {
    return defaultPoints;
  }

  public void setDefaultPoints(Integer defaultPoints) {
    this.defaultPoints = defaultPoints;
  }

  public ActionType content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Describes this action in detail. Formatted as JSON or JSON:LD. Should include the ActionName along with a longer description or link to more content.
   * @return content
  **/
  @ApiModelProperty(example = "null", value = "Describes this action in detail. Formatted as JSON or JSON:LD. Should include the ActionName along with a longer description or link to more content.")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionType actionType = (ActionType) o;
    return Objects.equals(this.uuid, actionType.uuid) &&
        Objects.equals(this.actionName, actionType.actionName) &&
        Objects.equals(this.communityId, actionType.communityId) &&
        Objects.equals(this.defaultPoints, actionType.defaultPoints) &&
        Objects.equals(this.content, actionType.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, actionName, communityId, defaultPoints, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionType {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
    sb.append("    communityId: ").append(toIndentedString(communityId)).append("\n");
    sb.append("    defaultPoints: ").append(toIndentedString(defaultPoints)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

