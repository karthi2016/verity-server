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
import java.util.ArrayList;
import java.util.List;


/**
 * Agent is something that bears some form of responsibility for changing state in the Verity system. An Agent could be a smart contract, person, organization, device, or anything the owns the Private Key half of the publicKey of the Agent and controlls the accounts used for attestationURLs.  Maps to  https://www.w3.org/TR/prov-o/#Agent  prov:Agent
 */
@ApiModel(description = "Agent is something that bears some form of responsibility for changing state in the Verity system. An Agent could be a smart contract, person, organization, device, or anything the owns the Private Key half of the publicKey of the Agent and controlls the accounts used for attestationURLs.  Maps to  https://www.w3.org/TR/prov-o/#Agent  prov:Agent")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-25T09:44:21.918-08:00")
public class Agent   {
  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("publicKey")
  private String publicKey = null;

  @SerializedName("attestationUrls")
  private List<String> attestationUrls = new ArrayList<String>();

  public Agent uuid(String uuid) {
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

  public Agent publicKey(String publicKey) {
    this.publicKey = publicKey;
    return this;
  }

   /**
   * Get publicKey
   * @return publicKey
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

  public Agent attestationUrls(List<String> attestationUrls) {
    this.attestationUrls = attestationUrls;
    return this;
  }

  public Agent addAttestationUrlsItem(String attestationUrlsItem) {
    this.attestationUrls.add(attestationUrlsItem);
    return this;
  }

   /**
   * zero or more attestation URLs (twitter, FB, blog) links to proof of account ownership, a post with public key id of owner. Signing the attribute with the Verity signing key creates a claim that the Verity system has created this attestation.   Examples at:  https://keybase.io/ https://keybase.io/docs/kbfs/understanding_kbfs  How to use Oracalize to create attestations: http://docs.oraclize.it/#datasources-url. Alignment with W3C Verifiable Claims spec is encouraged. https://opencreds.github.io/vc-data-model/
   * @return attestationUrls
  **/
  @ApiModelProperty(example = "null", value = "zero or more attestation URLs (twitter, FB, blog) links to proof of account ownership, a post with public key id of owner. Signing the attribute with the Verity signing key creates a claim that the Verity system has created this attestation.   Examples at:  https://keybase.io/ https://keybase.io/docs/kbfs/understanding_kbfs  How to use Oracalize to create attestations: http://docs.oraclize.it/#datasources-url. Alignment with W3C Verifiable Claims spec is encouraged. https://opencreds.github.io/vc-data-model/")
  public List<String> getAttestationUrls() {
    return attestationUrls;
  }

  public void setAttestationUrls(List<String> attestationUrls) {
    this.attestationUrls = attestationUrls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Agent agent = (Agent) o;
    return Objects.equals(this.uuid, agent.uuid) &&
        Objects.equals(this.publicKey, agent.publicKey) &&
        Objects.equals(this.attestationUrls, agent.attestationUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, publicKey, attestationUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Agent {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    attestationUrls: ").append(toIndentedString(attestationUrls)).append("\n");
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

