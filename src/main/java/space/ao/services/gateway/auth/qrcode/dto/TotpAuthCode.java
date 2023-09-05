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

package space.ao.services.gateway.auth.qrcode.dto;

import lombok.Data;

@Data
public class TotpAuthCode {
  private String authCode;
  private Long authCodeExpiresAt;
  private Long authCodeTotalExpiresAt;

  public static TotpAuthCode of(String authCode, Long authCodeExpiresAt, Long authCodeTotalExpiresAt){
    TotpAuthCode totpAuthCode = new TotpAuthCode();
    totpAuthCode.authCode = authCode;
    totpAuthCode.authCodeExpiresAt = authCodeExpiresAt;
    totpAuthCode.authCodeTotalExpiresAt = authCodeTotalExpiresAt;
    return totpAuthCode;
  }
}
