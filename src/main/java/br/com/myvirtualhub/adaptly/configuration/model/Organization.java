/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p>
 * This code was developed as a project of My Virtual Hub.
 * <p>
 * Created by marco on 27/11/2024.
 * For more information, visit: [http://www.myvirtualhub.com](http://www.myvirtualhub.com)
 */

package br.com.myvirtualhub.adaptly.configuration.model;

import java.util.UUID;

public record Organization(
		UUID id,
		String name,
		OrganizationStatus status,
		String description
) {
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder {
		private UUID id;
		private String name;
		private OrganizationStatus status = OrganizationStatus.ACTIVE;
		private String description;
		
		public Builder id(UUID id) {
			this.id = id;
			return this;
		}
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder status(OrganizationStatus status) {
			this.status = status;
			return this;
		}
		
		public Builder description(String description) {
			this.description = description;
			return this;
		}
		
		public Organization build() {
			return new Organization(id, name, status, description);
		}
	}
}