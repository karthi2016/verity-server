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
import org.joda.time.LocalDate;


/**
 * Activity is something that occurs over a period of time and acts upon or with entities; it may include consuming, processing, transforming, modifying, relocating, using, or generating entities.   Maps to https://www.w3.org/TR/prov-o/  prov:Activity
 */
@ApiModel(description = "Activity is something that occurs over a period of time and acts upon or with entities; it may include consuming, processing, transforming, modifying, relocating, using, or generating entities.   Maps to https://www.w3.org/TR/prov-o/  prov:Activity")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-25T09:44:21.918-08:00")
public class Activity   {
  @SerializedName("end")
  private LocalDate end = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("start")
  private LocalDate start = null;

  public Activity end(LocalDate end) {
    this.end = end;
    return this;
  }

   /**
   * Could correspond to a block number in the blockchain
   * @return end
  **/
  @ApiModelProperty(example = "null", required = true, value = "Could correspond to a block number in the blockchain")
  public LocalDate getEnd() {
    return end;
  }

  public void setEnd(LocalDate end) {
    this.end = end;
  }

  public Activity name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Activity start(LocalDate start) {
    this.start = start;
    return this;
  }

   /**
   * Could correspond to a block number in the blockchain
   * @return start
  **/
  @ApiModelProperty(example = "null", required = true, value = "Could correspond to a block number in the blockchain")
  public LocalDate getStart() {
    return start;
  }

  public void setStart(LocalDate start) {
    this.start = start;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Activity activity = (Activity) o;
    return Objects.equals(this.end, activity.end) &&
        Objects.equals(this.name, activity.name) &&
        Objects.equals(this.start, activity.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, name, start);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Activity {\n");
    
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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
