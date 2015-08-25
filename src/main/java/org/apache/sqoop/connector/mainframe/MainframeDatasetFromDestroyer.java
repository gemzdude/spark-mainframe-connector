/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.sqoop.connector.mainframe;

import org.apache.sqoop.connector.mainframe.configuration.FromJobConfiguration;
import org.apache.sqoop.connector.mainframe.configuration.LinkConfiguration;
import org.apache.sqoop.job.etl.Destroyer;
import org.apache.sqoop.job.etl.DestroyerContext;

public class MainframeDatasetFromDestroyer extends Destroyer<LinkConfiguration, FromJobConfiguration> {
  /**
   * Callback to clean up after job execution.
   *
   * @param context Destroyer context
   * @param linkConfig link configuration object
   * @param jobConfig FROM job configuration object
   */
  @Override
  public void destroy(DestroyerContext context, LinkConfiguration linkConfig,
      FromJobConfiguration jobConfig) {
    // do nothing at this point
  }
}
