/**
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
* <p>
*      http://www.apache.org/licenses/LICENSE-2.0
* <p>
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
* <p>
* This code was developed as a project of My Virtual Hub.
* <p>
* Created by marco on 24/11/2024.
* For more information, visit: [http://www.myvirtualhub.com](http://www.myvirtualhub.com)
*/

package br.com.myvirtualhub.adaptly.security.model;

import java.time.Instant;
import java.util.UUID;

public record User(
		UUID id,
		String name,
		String email,
		Boolean hasPlatformRole,
		Role role,
		UserStatus status,
		String password,
		Instant createdAt,
		Instant updatedAt,
		Instant lastLogin,
		Instant passwordExpiresAt,
		Boolean passwordChangeRequired,
		String passwordResetToken,
		Instant passwordResetTokenExpiresAt
) {
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder {
		private UUID id;
		private String name;
		private String email;
		private Boolean hasPlatformRole;
		private Role role;
		private UserStatus status;
		private String password;
		private Instant createdAt;
		private Instant updatedAt;
		private Instant lastLogin;
		private Instant passwordExpiresAt;
		private Boolean passwordChangeRequired;
		private String passwordResetToken;
		private Instant passwordResetTokenExpiresAt;
		
		public Builder id(UUID id) {
			this.id = id;
			return this;
		}
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder email(String email) {
			this.email = email;
			return this;
		}
		
		public Builder hasPlatformRole(Boolean hasPlatformRole) {
			this.hasPlatformRole = hasPlatformRole;
			return this;
		}
		
		public Builder role(Role role) {
			this.role = role;
			return this;
		}
		
		public Builder status(UserStatus status) {
			this.status = status;
			return this;
		}
		
		public Builder password(String password) {
			this.password = password;
			return this;
		}
		
		public Builder createdAt(Instant createdAt) {
			this.createdAt = createdAt;
			return this;
		}
		
		public Builder updatedAt(Instant updatedAt) {
			this.updatedAt = updatedAt;
			return this;
		}
		
		public Builder lastLogin(Instant lastLogin) {
			this.lastLogin = lastLogin;
			return this;
		}
		
		public Builder passwordExpiresAt(Instant passwordExpiresAt) {
			this.passwordExpiresAt = passwordExpiresAt;
			return this;
		}
		
		public Builder passwordChangeRequired(Boolean passwordChangeRequired) {
			this.passwordChangeRequired = passwordChangeRequired;
			return this;
		}
		
		public Builder passwordResetToken(String passwordResetToken) {
			this.passwordResetToken = passwordResetToken;
			return this;
		}
		
		public Builder passwordResetTokenExpiresAt(Instant passwordResetTokenExpiresAt) {
			this.passwordResetTokenExpiresAt = passwordResetTokenExpiresAt;
			return this;
		}
		
		public User build() {
			return new User(
					id,
					name,
					email,
					hasPlatformRole,
					role,
					status,
					password,
					createdAt,
					updatedAt,
					lastLogin,
					passwordExpiresAt,
					passwordChangeRequired,
					passwordResetToken,
					passwordResetTokenExpiresAt
			);
		}
	}
}