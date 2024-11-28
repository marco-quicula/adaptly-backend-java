/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * <p>This code was developed as a project of My Virtual Hub.
 *
 * <p>Created by marco on 24/11/2024. For more information, visit:
 * [http://www.myvirtualhub.com](http://www.myvirtualhub.com)
 */
package br.com.myvirtualhub.adaptly.security.model;

import java.util.UUID;

public record Parameters(
    UUID id,
    Boolean allowPasswordNeverExpire,
    Integer defaultPasswordExpiryDays,
    Integer maxFailedLoginAttempts) {

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private UUID id = null;
    private Boolean allowPasswordNeverExpire = Boolean.FALSE;
    private Integer defaultPasswordExpiryDays = 90;
    private Integer maxFailedLoginAttempts = 3;

    public Builder id(UUID id) {
      this.id = id;
      return this;
    }

    public Builder allowPasswordNeverExpire(Boolean allowPasswordNeverExpire) {
      this.allowPasswordNeverExpire = allowPasswordNeverExpire;
      return this;
    }

    public Builder defaultPasswordExpiryDays(Integer defaultPasswordExpiryDays) {
      this.defaultPasswordExpiryDays = defaultPasswordExpiryDays;
      return this;
    }

    public Builder maxFailedLoginAttempts(Integer maxFailedLoginAttempts) {
      this.maxFailedLoginAttempts = maxFailedLoginAttempts;
      return this;
    }

    public Parameters build() {
      return new Parameters(
          id, allowPasswordNeverExpire, defaultPasswordExpiryDays, maxFailedLoginAttempts);
    }
  }
}
