package com.amplify.apc.services.azure;

import java.io.File;
import java.util.List;

import org.springframework.scheduling.annotation.Async;

import com.amplify.apc.domain.ResourceType;

public interface AzureService {

	@Async
	public void createResourceFromArmTemplate(File template, ResourceType resourceType, String resourceGroupName,
			String instanceId, String responseUrl);

	@Async
	public void deleteResourceGroup(String resourceGroupName, List<String> instanceIds, String responseUrl);
}
