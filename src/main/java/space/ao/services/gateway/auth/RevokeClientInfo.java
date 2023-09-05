/*
 * Copyright (c) 2022 Institute of Software Chinese Academy of Sciences (ISCAS)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package space.ao.services.gateway.auth;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import jakarta.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@Schema(description = "解绑管理员客户端所需要的参数信息。")
public class RevokeClientInfo {
  @JsonCreator
  public RevokeClientInfo(@JsonProperty("encryptedAuthKey") String encryptedAuthKey,
                          @JsonProperty("encryptedClientUUID") String encryptedClientUUID,
                          @JsonProperty("encryptedPasscode") String encryptedPasscode) {
    this.encryptedAuthKey = encryptedAuthKey;
    this.encryptedClientUUID = encryptedClientUUID;
    this.encryptedPasscode = encryptedPasscode;
  }

  @Schema(description = "使用盒子公钥加密后的 auth-key。")
  private @NotBlank String encryptedAuthKey;

  @Schema(description = "使用盒子公钥加密后的 client-uuid。")
  private @NotBlank String encryptedClientUUID;

  @Schema(description = "使用盒子公钥加密后的安全密码，对于一般成员，可以为空。")
  private @NotBlank String encryptedPasscode;
}
