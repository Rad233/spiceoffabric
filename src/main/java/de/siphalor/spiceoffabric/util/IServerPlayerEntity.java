package de.siphalor.spiceoffabric.util;

public interface IServerPlayerEntity {
	void spiceOfFabric_setClientMod(boolean presence);
	boolean spiceOfFabric_hasClientMod();

	void spiceOfFabric_scheduleFoodHistorySync();
	boolean spiceOfFabric_foodHistorySync();
}
