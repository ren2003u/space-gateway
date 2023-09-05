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

package space.ao.services.account.authorizedterminalinfo.entity;

import java.time.OffsetDateTime;

public record AuthorizedTerminalResult(String aoid, String uuid, String terminalModel,
                                       String terminalType, OffsetDateTime loginTime,
                                       String address, Boolean online){
  public static AuthorizedTerminalResult of(String aoid, String clientUUID, String terminalMode, String terminalType,
                                            OffsetDateTime loginAt, String address, Boolean online){
    return new AuthorizedTerminalResult(aoid, clientUUID, terminalMode, terminalType, loginAt, address, online);
  }
}