package com.example.example;

import com.example.example.storage.DataRoot;
import com.example.example.storage.MicroStream;

import one.microstream.enterprise.cluster.nodelibrary.common.ClusterStorageManager;
import one.microstream.enterprise.cluster.nodelibrary.common.spi.ClusterStorageManagerProvider;

public class ExampleStorageManagerProvider implements ClusterStorageManagerProvider
{
	@Override
	public ClusterStorageManager<DataRoot> provideClusterStorageManager()
	{
		return MicroStream.storage();
	}
}
