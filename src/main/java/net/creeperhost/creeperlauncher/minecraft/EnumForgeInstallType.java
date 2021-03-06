package net.creeperhost.creeperlauncher.minecraft;

import java.util.Arrays;
import java.util.List;

public enum EnumForgeInstallType
{
    INSTALLER("1.15.2", "1.14.4", "1.14.3", "1.14.2", "1.14", "1.13.2"),
    UNIVERSAL("1.12.2", "1.12.1", "1.12", "1.11.2", "1.11", "1.10.2", "1.10", "1.9.4", "1.9", "1.8.9", "1.8.8", "1.8", "1.7.10", "1.7.2", "1.6.4", "1.6.3", "1.6.2", "1.6.1", "1.5.2", "1.5.1", "1.5"),
    JAR("1.4.7", "1.4.6", "1.4.5", "1.4.4", "1.4.3", "1.4.2", "1.4.1", "1.4.0", "1.3.2", "1.2.5");

    List<String> versions;

    EnumForgeInstallType(String... versions)
    {
        this.versions = Arrays.asList(versions);
    }

    public List<String> getVersions()
    {
        return versions;
    }
}
