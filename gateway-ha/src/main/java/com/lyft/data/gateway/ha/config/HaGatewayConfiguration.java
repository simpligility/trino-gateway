package com.lyft.data.gateway.ha.config;

import com.lyft.data.baseapp.AppConfiguration;
import java.util.HashMap;
import java.util.Map;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class HaGatewayConfiguration extends AppConfiguration {
  private RequestRouterConfiguration requestRouter;
  private NotifierConfiguration notifier;
  private DataStoreConfiguration dataStore;
  private MonitorConfiguration monitor = new MonitorConfiguration();
  private RoutingRulesConfiguration routingRules = new RoutingRulesConfiguration();
  private AuthenticationConfiguration authentication;
  private AuthorizationConfiguration authorization;
  private Map<String, UserConfiguration> presetUsers = new HashMap();
  private BackendStateConfiguration backendState;
}